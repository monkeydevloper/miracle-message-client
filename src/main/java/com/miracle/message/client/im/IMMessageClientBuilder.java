package com.miracle.message.client.im;

import com.miracle.message.client.MessageClient;

/**
 * Created by HHF on 2016/7/1.
 */
public class IMMessageClientBuilder {

    IMMessageClient client;
    private IMMessageClientBuilder(){
        client = new IMMessageClient();

    }
    public static IMMessageClientBuilder getInstance(){
        return new IMMessageClientBuilder();
    }

    public MessageClient build(){
        client.validate();
        return client;
    }

    public IMMessageClientBuilder setServerHost(String serverHost) {
        this.client.setServerHost(serverHost);
        return  this;
    }


    public IMMessageClientBuilder setServerPort(int serverPort) {
        this.client.setServerPort(serverPort);
        return  this;
    }
}
