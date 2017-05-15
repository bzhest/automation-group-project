package com.company.infrastructure.utils.urlBuilder;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Andrey on 25.04.2017.
 */
public class testApp {
    public static void main(String[] args) {
        Map<String, String> params = new HashMap<>();
        params.put("debug","true");
        params.put("silentMode","true");

        String url = new UrlBuilder()
                .withDomain("mysite.com")
                .withPass("/users")
                .withParam("singleParam")
                .withParam("key","value")
                .withParams(params)
                .build();
        System.out.println(url);
    }
}
