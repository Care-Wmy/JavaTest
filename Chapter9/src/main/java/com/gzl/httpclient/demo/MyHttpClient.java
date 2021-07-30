package com.gzl.httpclient.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClient {

    @Test
    public void test1() throws IOException {
        //用来存放返回的结果
        String result;
        //get请求
        HttpGet get = new HttpGet("http://www.baidu.com");
        //执行get方法
        HttpClient client = new DefaultHttpClient();

        HttpResponse response = client.execute(get);

        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);

    }

}
