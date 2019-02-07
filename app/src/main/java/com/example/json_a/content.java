package com.example.json_a;

public class content {
    String url,type;

    public content(String url, String type) {
        this.url = url;
        this.type = type;
    }



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
