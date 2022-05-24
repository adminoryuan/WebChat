package com.example.webchat.Untity;

import okhttp3.*;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
@Component
public class HttpUtil {

    private String postimgurl;

    private OkHttpClient client = null;
    private RequestBody requestBody = null;
    private Request request = null;


    private Logger log = LoggerFactory.getLogger(this.getClass());
    @PostConstruct
    public void init(){
        client = new OkHttpClient();

    }

    public String postTakeImg(String base64Img) {
        return "";
    }
}
