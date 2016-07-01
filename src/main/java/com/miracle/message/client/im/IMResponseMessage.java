package com.miracle.message.client.im;

import com.miracle.message.client.ResponseMessage;

/**
 * Created by HHF on 2016/7/1.
 */
public class IMResponseMessage  implements ResponseMessage

    {
        public String code;
        public String msg;

        public IMResponseMessage(String json){

        }

        @Override
        public String getCode() {
        return code;
    }

        @Override
        public String getMessage() {
        return msg;
    }
}

