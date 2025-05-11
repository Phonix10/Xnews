package com.crio.xnews;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

// TODO: CRIO_TASK_MODULE_PROJECT
// Declare variables for the fields: "title","description","author","url","publishedAt" & "content." Ignore any other fields.
// Utilize your IDE to generate getters and setters for these variables.
// Use your IDE to generate the toString method to create a string representation of the variables.
@JsonIgnoreProperties(ignoreUnknown = true)
public class NewsArticle {

    @JsonProperty("publishedAt")
    private String publishedAt;
    private String title; 
    private String description;
    private String author;
    private String url;
    private String content;


    public NewsArticle() {
        // Default constructor
    }
    public NewsArticle(String title, String description, String author, String url, String publishedAt, String content) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.url = url;
        this.publishedAt = publishedAt;
        this.content = content;
    }

    // Getters and Setters
    public String getPublishedAt() {
        return publishedAt;
    }
    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
