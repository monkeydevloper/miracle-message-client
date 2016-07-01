package com.miracle.message.client;

/**
 * Created by HHF on 2016/7/1.
 */
public interface MessageClient {

    ResponseMessage sendMessage(RequestParams p) throws MessageException;

    ResponseMessage fireEvent(RequestParams p) throws  MessageException;

}