package com.example.springTest.service;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;


@Service
public class SpringService2 {

    public void serviceMethod(){
        Map<String, String> map = new HashMap<String, String>();
        map.put("aaa.12", "111");

        if (map.containsKey("aaa.12")){
            System.out.println("aaa.12が含まれている");
        }
    }

        public Map<String, String> createMap1() {

        Map<String, String> map = new HashMap<String, String>();
        map.put("aaa.12", "111");
        map.put("bbb.12", "222");
        map.put("ccc.12", "333");

        return map;
    }
    
    public Map<String, String> createMap() {

        Map<String, String> map = new HashMap<String, String>();

        File file = new File("C:\\Users\\circu\\PycharmProjects\\SpringPracticeProject\\springTest\\src\\test\\resources\\files\\sample.csv");
        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            while((line = br.readLine()) != null){
                System.out.println(line);
                map.put(line.split(",")[0], line.split(",")[1]);
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        return map;
    }

}
