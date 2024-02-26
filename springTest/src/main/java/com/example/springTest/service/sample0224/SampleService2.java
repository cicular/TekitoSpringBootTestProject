package com.example.springTest.service.sample0224;

import org.springframework.stereotype.Service;

@Service
public class SampleService2 {
    
    public String doSomething(){
        System.out.println("モックではない");
        return "モックではない";
    }
}
