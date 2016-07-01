package com.miracle.message.client.im;

/**
 * Created by HHF on 2016/7/1.
 */
public class Config {

    private static  String serverHost;
    private static int serverPort;

    public static String getServerHost() {
        return serverHost;
    }

    public static void setServerHost(String serverHost) {
        Config.serverHost = serverHost;
    }

    public static int getServerPort() {
        return serverPort;
    }

    public static void setServerPort(int serverPort) {
        Config.serverPort = serverPort;
    }
}
