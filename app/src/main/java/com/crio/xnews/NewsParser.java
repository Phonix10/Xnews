package com.crio.xnews;

import java.io.IOException;
import java.util.List;
 import java.util.Collections;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NewsParser {
    private static final ObjectMapper objectMapper = new ObjectMapper();



    public static List<NewsArticle> parse(String json) throws IOException {
        if (json == null || json.isEmpty()) {
            return Collections.emptyList();
        }
        try{
            NewsApiResponse response = objectMapper.readvalue(json, NewsApiResponse);
            if (response == null || response.getArticles()== null){
                return Collections.emptyList();
            }else{
                return response.getArticles();
            }
        }catch (IOException e) {
            throw new IOException("Error parsing JSON: " + e.getMessage(), e);
        }

    }
}