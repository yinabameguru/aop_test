package com.jza.aop_test.websocket;

public class SocketResponse {
    private String responseMessage;

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public SocketResponse(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
