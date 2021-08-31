package com.example.intra42api.api.intra42;

import com.example.intra42api.api.ApiBinding;
import org.springframework.util.MultiValueMap;

import java.util.Map;

public class Intra42 extends ApiBinding {

    private static final String GRAPH_API_BASE_URL = "https://api.intra.42.fr";

    public Intra42(String accessToken) {
        super(accessToken);
    }

    public Map<String, Object> getCustomRequestGet(String uri) {
        return restTemplate.getForObject(uri, MultiValueMap.class);
    }

    public Map<String, Object> getCustomRequestPost(String uri, Object request) {
        return restTemplate.postForObject(uri, request, MultiValueMap.class);
    }

    public Map<String, Object> getCustomRequestPatch(String url, Object request) {
        return restTemplate.postForObject(url, request, MultiValueMap.class);
    }

    public void getCustomRequestPut(String uri, Object request) {
        restTemplate.put(uri, request);
    }

    public void getCustomRequestDelete(String uri, Object request) {
        restTemplate.delete(uri);
    }
}
