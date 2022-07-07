package com.cohort15adv.muzick.payloads.ApiResponse;

public class Article {

    private class Source{

        private String name;

        public Source() {
        }

        public Source(String name) {

            this.name = name;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;

    public Article() {
    }

    public Article(Source source, String author, String title, String description, String url) {
        this.source = source;
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public String getSourceName(){
        return source.name;
    }
}
