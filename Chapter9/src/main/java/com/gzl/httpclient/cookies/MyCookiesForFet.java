package com.gzl.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MyCookiesForFet {
    private  String url;
    private ResourceBundle bundle;
    //用来存储cookies信息的变量
    private CookieStore store;

    @BeforeTest
    private void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url = bundle.getString("test.url");
    }

    @Test
    public void testGetCookies() throws IOException {
        String result;
        //从配置文件中application.properties拼接测试url
        String uri = bundle.getString("getCookies.uri");
        String testUrl = this.url + uri;

        //访问get请求
        HttpGet get = new HttpGet(testUrl);
        //new出 HttpClient对象
        DefaultHttpClient client = new DefaultHttpClient();
        //发送请求返回参数
        HttpResponse response = client.execute(get);
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        //获取cookies信息
        CookieStore store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for (Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name = "+ name +"cookie value = " +value);
        }

    }
//携带cookies信息访问get请求
    //依赖上面testGetCookies方法  上个方法获取cookies信息
    @Test(dependsOnMethods = {"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        //拼接测试url
        String uri = bundle.getString("test.get.with.cookies");
        String testUrl = this.url+uri;

        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();

        //设置cookies信息
        client.setCookieStore(this.store);

        HttpResponse response = client.execute(get);

        //获取响应的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode = " + statusCode);

        if (statusCode == 200) {
            String result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }

    }
}
