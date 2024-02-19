package com.pokemon.dto.response;

public class Response<T>{
    T response;
    String errMessage = "";

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {

        this.response = response;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String message) {

        this.errMessage = message;
    }

    public Response(T data){

        response = data;
    }
}
