package com.apiSekoalh.dto;

import java.util.ArrayList;
import java.util.List;

public class ResponseData<T> {

  private boolean status;
  private List<String> messages = new ArrayList<>();
  private T payload;
  private String httpstatus;

  public boolean isStatus() {
    return status;
  }

  public String getHttpstatus() {
    return httpstatus;
  }

  public void setHttpstatus() {
    this.httpstatus = httpstatus;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public List<String> getMessages() {
    return messages;
  }

  public void setMessages(List<String> messages) {
    this.messages = messages;
  }

  public T getPayload() {
    return payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }
}
