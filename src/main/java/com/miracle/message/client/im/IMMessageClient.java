package com.miracle.message.client.im;

import com.miracle.message.client.MessageClient;
import com.miracle.message.client.MessageException;
import com.miracle.message.client.RequestParams;
import com.miracle.message.client.ResponseMessage;

/**
 * Created by HHF on 2016/7/1.
 */
public class IMMessageClient  implements MessageClient{

    String SEND_MESSAGE_TEMPLATE = "im_server_send_message_url=${im_server_url}/base/message.do?id=${im_server_id}&password=${im_server_password}&sourceId=${sourceId}&sourceName=${sourceName}&targetId=${targetId}&type=${type}&msgType=${msgType}&message=${message}";
    String serverHost;
    int serverPort;
    public String getServerHost() {
        return serverHost;
    }

    public void setServerHost(String serverHost) {
        this.serverHost = serverHost;
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    private void validateParam(String mssage, boolean condition){
        if(!condition){
            throw new IllegalArgumentException(mssage);
        }
    }

    void validate(){
        validateParam("The parameter of 'serverHost' is not defined",serverHost!=null && serverHost.length()>0);
        validateParam("The parameter of 'serverPort' is not defined", serverPort>0);
    }


    IMMessageClient(){}


    @Override
    public ResponseMessage sendMessage(RequestParams ps) throws MessageException {
        SendMessageParams sps = (SendMessageParams)ps;


      String temp = replateTemplate(SEND_MESSAGE_TEMPLATE, "sourceId", sps.getId());
        temp = replateTemplate(temp, "sourceId", sps.getId());
        temp = replateTemplate(temp, "sourceId", sps.getSourceId());
        temp = replateTemplate(temp, "sourceName", sps.getSourceId());
        temp = replateTemplate(temp, "targetId", sps.getTargetId());
        temp = replateTemplate(temp, "type",  sps.getType());
        temp = replateTemplate(temp, "msgType",sps.getMsgType());
        temp = replateTemplate(temp, "callback",sps.getCallback());
        temp = replateTemplate(temp, "message", sps.getMessage());
        String json = callRemoteService(temp);
        return new IMResponseMessage(json);
    }

    @Override
    public ResponseMessage fireEvent(RequestParams p) throws MessageException {
        return null;
    }

    private String replateTemplate(String temp, String key, String value){
        return SEND_MESSAGE_TEMPLATE.replaceAll(key, value);
    }

    private String callRemoteService(String url){
        return null;
    }
}
