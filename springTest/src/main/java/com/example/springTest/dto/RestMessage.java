package com.example.springTest.dto;

import java.util.List;

import lombok.Data;

@Data
public class RestMessage {

    private String aaa;

    private String bbb;

    private List<SampleDto> sampleList;

}
