package com.example.springTest;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.springTest.controller.SpringRestController;
import com.example.springTest.model.Articles;
import com.example.springTest.service.SpringTestService;

@SpringBootTest
public class SpringRestControllerTest {

    @InjectMocks
    // テスト対象のクラスに対して、このアノテーションを付与します。
    SpringRestController springRestController;

    @Mock
    // 「まだ実装が完了していないクラス」に対して、このアノテーションを付与します。
    SpringTestService springTestService;

    @Test
    // @Disabled
    @DisplayName("bbbのテスト")
    void bbbのテスト(){
        try {
            List<Articles> returnList = new ArrayList<Articles>();
            returnList.add(new Articles());
            // 前置記法
            doReturn(returnList).when(springTestService).getArticles("あ", true);

            // 後置記法
            // Mockito.doReturn(returnList).when(springTestService).getArticles("あ", true);
            springRestController.bbb();
            System.out.println("テスト実行した");

            verify(springTestService,times(1)).getArticles("あ", true);    
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail();
        }
    }
}
