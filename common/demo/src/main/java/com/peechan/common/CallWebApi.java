package com.peechan.common;

import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.peechan.dto.RestMessage;

public class CallWebApi {

    static RestTemplate restTemplate = new RestTemplate();
 
    public void callWebApiAAA(){

        System.out.println("callWebApiAAA開始");

        try{
            String url = "http://127.0.0.1:10000/spring/aaa";

            RestMessage restMessage = new RestMessage(){{
                setAaa("aaa");
            }};

            RequestEntity<RestMessage> req = 
                RequestEntity.post(url).contentType(MediaType.APPLICATION_JSON).body(restMessage);

            ResponseEntity<Long> result = restTemplate.postForEntity(url, req, Long.class);
            System.out.println(result.getStatusCode());
            System.out.println(result.getBody());
            
            System.out.println("callWebApiAAA終わり");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void callWebApiFFF(){
        System.out.println("callWebApiFFF開始");

        try{
            String url = "http://127.0.0.1:10000/spring/fff";

            RestMessage restMessage = new RestMessage(){{
                setAaa("aaa");
            }};

            RequestEntity<RestMessage> req = 
                RequestEntity.post(url).contentType(MediaType.APPLICATION_JSON).body(restMessage);

            ResponseEntity<Long> result = restTemplate.postForEntity(url, req, Long.class);
            System.out.println(result.getStatusCode());
            System.out.println(result.getBody());
            
            System.out.println("callWebApiFFF終わり");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
