package com.example.springTest;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.boot.test.mock.mockito.MockBean;

// import com.example.springTest.service.SpringTestService;

// @SpringBootTestは、Spring Boot の機能を用いる処理のテストを行う場合に、付与するアノテーションです。 主に、Service や Dao（Repository）など DI コンテナを用いた処理をテストする際に使用します。
@SpringBootTest
public class HelloTest {

    // SpringTestService springTestService = new SpringTestService();
    // @Autowired
    // SpringTestService springTestService;TODO
    
    // TODO
    // @Test
    // void dummyのテスト() {

    //     var result = springTestService.dummy(1,3,5);
    //     assertEquals(result, 9);
    // }
    // TODO
    // @Test
    // void privateDummyのテスト(){
    //     try {
    //         Method method = SpringTestService.class.getDeclaredMethod("privateDummy", int[].class);
    //         method.setAccessible(true);

    //         int[] array = {1, 3, 5};
    //         var result = (int)method.invoke(springTestService, array);
    //         assertEquals(9, result);
    //         System.out.println(result);
    //     }catch(Exception e){
    //         e.printStackTrace();
    //     }


    // }


}
