

// Datum.java

package com.spring.news.model;

import java.time.OffsetDateTime;

public class Datum {
    private Object author;
    private String title;
    private String description;
    private String url;
    private String source;
    private String image;
    private Category category;
    private Language language;
    private Country country;
    private OffsetDateTime publishedAt;

    public Object getAuthor() { return author; }
    public void setAuthor(Object value) { this.author = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public String getURL() { return url; }
    public void setURL(String value) { this.url = value; }

    public String getSource() { return source; }
    public void setSource(String value) { this.source = value; }

    public String getImage() { return image; }
    public void setImage(String value) { this.image = value; }

    public Category getCategory() { return category; }
    public void setCategory(Category value) { this.category = value; }

    public Language getLanguage() { return language; }
    public void setLanguage(Language value) { this.language = value; }

    public Country getCountry() { return country; }
    public void setCountry(Country value) { this.country = value; }

    public OffsetDateTime getPublishedAt() { return publishedAt; }
    public void setPublishedAt(OffsetDateTime value) { this.publishedAt = value; }
}