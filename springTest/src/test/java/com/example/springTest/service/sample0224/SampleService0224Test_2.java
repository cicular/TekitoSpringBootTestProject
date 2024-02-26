package com.example.springTest.service.sample0224;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

// @ExtendWith(SpringExtension.class)
@SpringBootTest
public class SampleService0224Test_2 {

    @Autowired
    private SampleService0224 sampleService0224;

    @MockBean
    private SampleService2 sampleService2;

    @Test
    public void testMethod4() {
        // モックの設定
        // when(sampleService2.doSomething()).thenReturn("モックだよ");
        doReturn("モックだよ").when(sampleService2).doSomething();

        // テスト対象メソッドの実行
        String result = sampleService0224.method4();

        // 結果の検証
        assertEquals("モックだよ", result);

        // モックメソッドの呼び出しを検証
        verify(sampleService2, times(1)).doSomething();
    }
}
