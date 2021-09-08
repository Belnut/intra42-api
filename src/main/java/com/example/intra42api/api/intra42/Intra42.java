package com.example.intra42api.api.intra42;

import com.example.intra42api.api.ApiBinding;

import java.util.Map;

public class Intra42 extends ApiBinding {

    private static final String GRAPH_API_BASE_URL = "https://api.intra.42.fr";

    public Intra42(String accessToken) {
        super(accessToken);
    }

    public Map<String, Object> getCustomRequestGet(String url) {
        return restTemplate.getForObject(GRAPH_API_BASE_URL + "/" + url, Map.class);
    }

    public Map<String, Object> getCustomRequestPost(String url, Object request) {
        return restTemplate.postForObject(GRAPH_API_BASE_URL + "/" + url, request, Map.class);
    }

    public Map<String, Object> getCustomRequestPatch(String url, Object request) {
        return restTemplate.postForObject(GRAPH_API_BASE_URL + "/" + url, request, Map.class);
    }

    public void getCustomRequestPut(String url, Object request) {
        restTemplate.put(GRAPH_API_BASE_URL + "/" + url, request);
    }

    public void getCustomRequestDelete(String url, Object request) {
        restTemplate.delete(GRAPH_API_BASE_URL + "/" + url);
    }
}
