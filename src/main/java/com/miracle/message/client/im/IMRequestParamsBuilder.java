package com.miracle.message.client.im;

import com.miracle.message.client.MessageClient;
import com.miracle.message.client.MessageException;
import com.miracle.message.client.RequestParams;
import com.miracle.message.client.ResponseMessage;

import static com.miracle.message.client.im.IMContents.MSG_TYPE_RICH_TEXT;
import static com.miracle.message.client.im.IMContents.TYPE_USER;

/**
 * Created by HHF on 2016/7/1.
 */
public class IMRequestParamsBuilder {

    class IMRequestParams implements RequestParams {
        String targetIds[];
        String type;
        int msgType;
        String callback;
        String message;

        public IMRequestParams(){
            setMsgType(MSG_TYPE_RICH_TEXT);
            setType(TYPE_USER);
        }

        private void validateParam(String mssage, boolean condition){
            if(!condition){
                throw new IllegalArgumentException(mssage);
            }
        }

        void validate(){
            validateParam("The parameter of 'targetIds' is not defined",targetIds!=null && targetIds.length>0);
            validateParam("The parameter of 'type'  is not defined",type!=null && type.length()>0);
            validateParam("The parameter of 'msgType' is not defined", msgType>0);
    //        validateParam("The parameter of callback is not defined",callback==null || callback==0);
            validateParam("The parameter of 'message' is not defined",message!=null && message.length()>0);
        }

        public String[] getTargetIds() {
            return targetIds;
        }

        public void setTargetIds(String[] targetIds) {
            this.targetIds = targetIds;
        }


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getMsgType() {
            return msgType;
        }

        public void setMsgType(int msgType) {
            this.msgType = msgType;
        }

        public String getCallback() {
            return callback;
        }

        public void setCallback(String callback) {
            this.callback = callback;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    IMRequestParams params;

    private IMRequestParamsBuilder(){
        params = new IMRequestParams();
    }
    public static IMRequestParamsBuilder getInstance(){
        return new IMRequestParamsBuilder();
    }

    public IMRequestParams build(){
        params.validate();
        return params;
    }


    public IMRequestParamsBuilder setTargetIds(String[] targetIds) {
        params.setTargetIds(targetIds);
        return this;
    }

    public IMRequestParamsBuilder setType(String type) {
        params.setType(type);
        return this;
    }

    public IMRequestParamsBuilder setMsgType(int msgType) {
        params.setMsgType(msgType);
        return this;
    }



    public IMRequestParamsBuilder setCallback(String callback) {
        params.setCallback(callback);
        return this;
    }


    public IMRequestParamsBuilder setMessage(String message) {
        params.setMessage(message);
        return this;
    }


}
