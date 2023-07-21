package com.example.springTest.batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.springTest.dto.RestMessage;

@Component
public class ScheduledTasks {

    @Autowired
    RestTemplate restTemplate;
 
    @Scheduled(initialDelay=1000, fixedDelay = 10000)
    public void task1() {

        System.out.println("task1");

        try{
            String url = "http://127.0.0.1:10000/spring/aaa";

            RestMessage restMessage = new RestMessage(){{
                setAaa("aaa");
            }};

            RequestEntity<RestMessage> req = RequestEntity.post(url).contentType(MediaType.APPLICATION_JSON).body(restMessage);

            ResponseEntity<Long> result = restTemplate.postForEntity(url, req, long.class);
            System.out.println(result.getStatusCode());
            System.out.println(result.getBody());
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
