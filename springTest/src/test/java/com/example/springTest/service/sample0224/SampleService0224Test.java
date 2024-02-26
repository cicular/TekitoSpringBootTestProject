package com.example.springTest.service.sample0224;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

import com.example.springTest.TestUtil;

@SpringBootTest
public class SampleService0224Test extends TestUtil{
    
    @SpyBean
    // @Autowired
    SampleService0224 sampleService0224;

    @Test
    @DisplayName("テスト対象メソッドと同じクラスのpublicメソッドmethod2をモック化")
    public void method1のテスト(){
        doReturn("モックだよ").when(sampleService0224).method2();
        String result = sampleService0224.method1();
        assertEquals("モックだよ", result);
    }

    @Test
    @DisplayName("method2をモック化しないでmethod1のテスト")
    public void method1のテスト2(){
        String result = sampleService0224.method1();
        assertEquals("モックではないよ", result);
    }

    @Test
    @DisplayName("privateメソッドを呼び出す")
    void privateDummyのテスト(){
        try {
            Method method = SampleService0224.class.getDeclaredMethod("privateMethod1", int[].class);
            method.setAccessible(true);

            int[] array = {1, 3, 5};
            var result = (int)method.invoke(sampleService0224, array);
            assertEquals(9, result);
        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }

    @Test
    @DisplayName("テスト対象と同じクラスのprivateメソッドprivateMethod1をモック化する")
    void method2のテスト(){
        try{
            Method method = SampleService0224.class.getDeclaredMethod("privateMethod1", int[].class);
            method.setAccessible(true);
            // method.
            
            var result = sampleService0224.method3();
            assertEquals(9, result);
        }catch(Exception e){
            e.printStackTrace();
            fail();
        }
    }

    
    // @Test
    // @DisplayName("テスト対象と同じクラスのstaticメソッドstaticDummyをモック化する")

    @Test
    @DisplayName("テスト対象クラスがフィールドに持つクラスのprivateメソッドをモック化する")
    public void method4のテスト(){

        try{
            Class<?> clazz = SampleService0224.class;
            Field f = clazz.getDeclaredField("sampleService2");
            f.setAccessible(true);
    
            // SampleService2 ss2 = (SampleService2)f.get(sampleService0224);
            f.set(sampleService0224, new SampleService2(){
                @Override
                public String doSomething() {
                    return "モックだよ";
                }
            });

            var result = sampleService0224.method4();
            System.out.println(result);
            assertEquals("モックだよ", result);

        }catch(Exception e){
            e.printStackTrace();
            fail();
        }finally{
            // f.set(sampleService0224, ss2);
            // f.setAccessible(false);
        }
    }

    @Test
    public void method6をモック化してmethod5を実行(){
        MockedStatic<SampleService0224> mocked = mockStatic(SampleService0224.class);
        mocked.when(() -> SampleService0224.method6()).thenReturn("モックだよ");

        var result = sampleService0224.method5();
        System.out.println(result);
        assertEquals("モックだよ", result);
        mocked.close();
    }

    @Test
    public void testMethod7WithMockedReadAllBytes() throws IOException {
        
        // sampleService0224.method7();

        try (MockedStatic<Files> mockedFiles = Mockito.mockStatic(Files.class)) {
            // mockedFiles.when(() -> Files.readAllBytes(any(Path.class))).thenReturn(new byte[0]);
            mockedFiles.when(() -> Files.readAllBytes(any(Path.class)))
                    .thenAnswer(invocation -> {
                        // カウンターをインクリメント
                        Counter.increaseCount();
                        // 10回目の呼び出し時にIOExceptionをスロー
                        if (Counter.getCount() == 10) {
                            throw new IOException("Mocked IOException");
                        }
                        return new byte[0]; // 他の呼び出しでは空のバイト配列を返す
                    });

            SampleService0224 service = new SampleService0224();
            service.method7();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void testMethod7WithMockedReadAllBytes2() throws IOException {

        MockedStatic<Files> mockedFiles = Mockito.mockStatic(Files.class);
            // mockedFiles.when(() -> Files.readAllBytes(any(Path.class))).thenReturn(new byte[0]);
        mockedFiles.when(() -> Files.readAllBytes(any(Path.class)))
                .thenAnswer(invocation -> {
                    // カウンターをインクリメント
                    Counter.increaseCount();
                    // 10回目の呼び出し時にIOExceptionをスロー
                    if (Counter.getCount() == 10) {
                        throw new IOException("Mocked IOException");
                    }
                    return new byte[0]; // 他の呼び出しでは空のバイト配列を返す
                });

        SampleService0224 service = new SampleService0224();
        service.method7();

        mockedFiles.close();

    }

    // 呼び出し回数を追跡するためのヘルパークラス
    static class Counter {
        private static int count = 0;

        public static void increaseCount() {
            count++;
        }

        public static int getCount() {
            return count;
        }

        public static void resetCount() {
            count = 0;
        }
    }
}
