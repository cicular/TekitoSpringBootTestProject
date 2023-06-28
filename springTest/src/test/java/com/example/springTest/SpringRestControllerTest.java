package com.example.springTest;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
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
    // Mockitoから提供されるアノテーション
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
            // 下記はエラーになる。org.mockito.exceptions.misusing.InvalidUseOfMatchersException: Invalid use of argument matchers!
            // When using matchers, all arguments have to be provided by matchers.
            // verify(springTestService,times(1)).getArticles(Mockito.any(), true);
            // verify(springTestService,times(1)).getArticles(Mockito.anyString(), true);

            // 下記のように、すべての引数をmatchers形式にする必要がある
            verify(springTestService,times(1)).getArticles(Mockito.any(), eq(true));
            verify(springTestService,times(1)).getArticles(Mockito.anyString(), eq(true));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            fail();
        }
    }
}
