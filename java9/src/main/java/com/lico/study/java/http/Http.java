package com.lico.study.java.http;

import jdk.incubator.http.HttpClient;
import jdk.incubator.http.HttpRequest;
import jdk.incubator.http.HttpResponse;

import java.net.URI;
import java.util.List;

/**
 * 项目：lico-study
 * 包名：com.lico.study.java9.http2
 * 功能：
 * 时间：2017-09-22
 * 作者：呱牛
 */
public class Http {

    public static void main(String[] args) throws Exception {
        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7");
        System.err.println(list);

        HttpRequest request = HttpRequest
                .newBuilder(URI.create("http://localhost:8080"))
                .header("User-Agent", "Java")
                .GET()
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandler.asString());
        String responseBody = response.body();

        System.err.println(responseBody);
    }
}
