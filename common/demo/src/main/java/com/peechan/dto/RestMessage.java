package com.peechan.dto;

import java.util.List;

public class RestMessage {

    private String aaa;

    private String bbb;

    private List<SampleDto> sampleList;

    public String getAaa() {
        return aaa;
    }

    public void setAaa(String aaa) {
        this.aaa = aaa;
    }

    public String getBbb() {
        return bbb;
    }

    public void setBbb(String bbb) {
        this.bbb = bbb;
    }

    public List<SampleDto> getSampleList() {
        return sampleList;
    }

    public void setSampleList(List<SampleDto> sampleList) {
        this.sampleList = sampleList;
    }
}