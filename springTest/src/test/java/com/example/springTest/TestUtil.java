package com.example.springTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public class TestUtil {
    
    @BeforeEach
    public void before(TestInfo testInfo){
        System.out.println("テスト開始------------------ " + testInfo.getTestMethod().get().getName());
    }

    @AfterEach
    public void after(TestInfo testInfo){
        System.out.println("テスト終了------------------ " + testInfo.getTestMethod().get().getName());
    }
}
