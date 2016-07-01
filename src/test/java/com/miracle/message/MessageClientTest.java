package com.miracle.message;

import com.miracle.message.client.MessageException;
import com.miracle.message.client.RequestParams;
import com.miracle.message.client.ResponseMessage;
import com.miracle.message.client.im.IMMessageClientBuilder;
import com.miracle.message.client.im.IMRequestParamsBuilder;
import org.junit.Test;

/**
 * Created by HHF on 2016/7/1.
 */
public class MessageClientTest {

    @Test
    public void test() throws MessageException {

        RequestParams params = IMRequestParamsBuilder.getInstance()
                .setCallback("").build();

        ResponseMessage resp = IMMessageClientBuilder.getInstance()
                .setServerHost("")
                .setServerPort(8080)
                .build().sendMessage(params);

        System.out.println(resp.getCode());
        System.out.println(resp.getMessage());
    }
}
