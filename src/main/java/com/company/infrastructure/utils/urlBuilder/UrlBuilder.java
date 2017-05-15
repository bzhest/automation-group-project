package com.company.infrastructure.utils.urlBuilder;


import java.util.HashMap;
import java.util.Map;

public class UrlBuilder {


    private String protocol = "http";
    private String domain;
    private String port = "";
    private String pass = "";
    private Map<String, String> params = new HashMap<>();


    public UrlBuilder isSecure(Boolean isSecure) {
        if (isSecure)
            protocol += "s";
        return this;
    }

    public UrlBuilder withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public UrlBuilder withPort(String port) {
        if (!port.equals("80") || !port.equals("443"))
            this.port = ":" + port;
        return this;
    }

    public UrlBuilder withPass(String pass) {
        if (pass.startsWith("/")) {
            this.pass = pass;
        } else {
            this.pass = "/" + pass;
        }
        return this;
    }

    public UrlBuilder withParam(String param) {
        params.put(param, null);
        return this;
    }

    public UrlBuilder withParam(String key, String value) {
        params.put(key,value);
        return this;
    }

    public UrlBuilder withParams(Map<String,String> params){
        this.params.putAll(params);
        return this;
    }

    public String build() {
        String parameters = "";
        for(Map.Entry entry: params.entrySet()){
            String pair = entry.toString();
            if(pair.contains("null"))
                pair = pair.replace("=null","");
            parameters+= pair + "&";
        }
        return protocol + "://" + domain + pass + port + "?" + parameters;
    }
}