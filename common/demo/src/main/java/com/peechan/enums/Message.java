package com.peechan.enums;

public enum Message {

    // enumのインスタンスに固有の値を持たせる
    // enumもクラスの一種なので、コンストラクタ、フィールド、メソッドを定義できる
    MSG_001("メッセージ001"),
    MSG_002("メッセージ002"),
    MSG_003("メッセージ003");

    private String code;

    private Message(String code){
        this.code = code;
    }

    public String getCode(){
        return code;
    }
    
}
