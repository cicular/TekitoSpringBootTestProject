package com.example.springTest.service.sample0224;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService0224 {

    @Autowired
    private SampleService2 sampleService2;
    
    public String method1(){
        System.out.println("method1実行");
        String result = method2();
        System.out.println(result);
        return result;
    }

    public String method2(){
        return "モックではないよ";
    }

    public int method3(){
        int[] array = {1, 3, 5};
        return privateMethod1(array);
    }

    private int privateMethod1(int... value){
        int result = 0;
        for (int v : value) {
            result += v;
        }
        System.out.println("privateMethod1 モックではないよ");
        return result;
    }

    public String method4(){
        System.out.println("method4実行");
        String result = sampleService2.doSomething();
        System.out.println(result);
        return result;
    }

    public String method5(){
        return method6();
    }

    public static String method6(){
        System.out.println("method5 モックではないよ");
        return "method5 モックではないよ";
    }
}
