package com.mediumapi.domain.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Returns the article related information such as *id, title, subtitle, image_url, published_at, updated_at, reading_time, claps, voters, responses, tags, publication_id, publication_name, publication_slug, publication_url, publication_follower_count, publication_twitter_username, publication_facebook_pagename, publication_instagram_username, publication_creator, publication_editors*. 
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticle {

  private String id;

  private String title;

  private String subtitle;

  private String author;

  private String publicationId;

  private Integer responsesCount;

  private Integer wordCount;

  private BigDecimal readingTime;

  @Valid
  private List<String> topics;

  @Valid
  private List<String> tags;

  private Integer claps;

  private Integer voters;

  private Boolean isSeries;

  private Boolean isShortform;

  private Boolean isLocked;

  private String lang;

  private String publishedAt;

  private String lastModifiedAt;

  private String uniqueSlug;

  private String url;

  private String imageUrl;

  private String topHighlight;

  public MediumArticle id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MediumArticle title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MediumArticle subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * Get subtitle
   * @return subtitle
  */
  
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public MediumArticle author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public MediumArticle publicationId(String publicationId) {
    this.publicationId = publicationId;
    return this;
  }

  /**
   * Get publicationId
   * @return publicationId
  */
  
  @JsonProperty("publication_id")
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  public MediumArticle responsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
    return this;
  }

  /**
   * Get responsesCount
   * @return responsesCount
  */
  
  @JsonProperty("responses_count")
  public Integer getResponsesCount() {
    return responsesCount;
  }

  public void setResponsesCount(Integer responsesCount) {
    this.responsesCount = responsesCount;
  }

  public MediumArticle wordCount(Integer wordCount) {
    this.wordCount = wordCount;
    return this;
  }

  /**
   * Get wordCount
   * @return wordCount
  */
  
  @JsonProperty("word_count")
  public Integer getWordCount() {
    return wordCount;
  }

  public void setWordCount(Integer wordCount) {
    this.wordCount = wordCount;
  }

  public MediumArticle readingTime(BigDecimal readingTime) {
    this.readingTime = readingTime;
    return this;
  }

  /**
   * Get readingTime
   * @return readingTime
  */
  @Valid 
  @JsonProperty("reading_time")
  public BigDecimal getReadingTime() {
    return readingTime;
  }

  public void setReadingTime(BigDecimal readingTime) {
    this.readingTime = readingTime;
  }

  public MediumArticle topics(List<String> topics) {
    this.topics = topics;
    return this;
  }

  public MediumArticle addTopicsItem(String topicsItem) {
    if (this.topics == null) {
      this.topics = new ArrayList<>();
    }
    this.topics.add(topicsItem);
    return this;
  }

  /**
   * Get topics
   * @return topics
  */
  
  @JsonProperty("topics")
  public List<String> getTopics() {
    return topics;
  }

  public void setTopics(List<String> topics) {
    this.topics = topics;
  }

  public MediumArticle tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MediumArticle addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * @return tags
  */
  
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MediumArticle claps(Integer claps) {
    this.claps = claps;
    return this;
  }

  /**
   * Get claps
   * @return claps
  */
  
  @JsonProperty("claps")
  public Integer getClaps() {
    return claps;
  }

  public void setClaps(Integer claps) {
    this.claps = claps;
  }

  public MediumArticle voters(Integer voters) {
    this.voters = voters;
    return this;
  }

  /**
   * Get voters
   * @return voters
  */
  
  @JsonProperty("voters")
  public Integer getVoters() {
    return voters;
  }

  public void setVoters(Integer voters) {
    this.voters = voters;
  }

  public MediumArticle isSeries(Boolean isSeries) {
    this.isSeries = isSeries;
    return this;
  }

  /**
   * Get isSeries
   * @return isSeries
  */
  
  @JsonProperty("is_series")
  public Boolean getIsSeries() {
    return isSeries;
  }

  public void setIsSeries(Boolean isSeries) {
    this.isSeries = isSeries;
  }

  public MediumArticle isShortform(Boolean isShortform) {
    this.isShortform = isShortform;
    return this;
  }

  /**
   * Get isShortform
   * @return isShortform
  */
  
  @JsonProperty("is_shortform")
  public Boolean getIsShortform() {
    return isShortform;
  }

  public void setIsShortform(Boolean isShortform) {
    this.isShortform = isShortform;
  }

  public MediumArticle isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

  /**
   * Get isLocked
   * @return isLocked
  */
  
  @JsonProperty("is_locked")
  public Boolean getIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public MediumArticle lang(String lang) {
    this.lang = lang;
    return this;
  }

  /**
   * Get lang
   * @return lang
  */
  
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public MediumArticle publishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * Get publishedAt
   * @return publishedAt
  */
  
  @JsonProperty("published_at")
  public String getPublishedAt() {
    return publishedAt;
  }

  public void setPublishedAt(String publishedAt) {
    this.publishedAt = publishedAt;
  }

  public MediumArticle lastModifiedAt(String lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
    return this;
  }

  /**
   * Get lastModifiedAt
   * @return lastModifiedAt
  */
  
  @JsonProperty("last_modified_at")
  public String getLastModifiedAt() {
    return lastModifiedAt;
  }

  public void setLastModifiedAt(String lastModifiedAt) {
    this.lastModifiedAt = lastModifiedAt;
  }

  public MediumArticle uniqueSlug(String uniqueSlug) {
    this.uniqueSlug = uniqueSlug;
    return this;
  }

  /**
   * Get uniqueSlug
   * @return uniqueSlug
  */
  
  @JsonProperty("unique_slug")
  public String getUniqueSlug() {
    return uniqueSlug;
  }

  public void setUniqueSlug(String uniqueSlug) {
    this.uniqueSlug = uniqueSlug;
  }

  public MediumArticle url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * @return url
  */
  
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MediumArticle imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
  */
  
  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MediumArticle topHighlight(String topHighlight) {
    this.topHighlight = topHighlight;
    return this;
  }

  /**
   * Get topHighlight
   * @return topHighlight
  */
  
  @JsonProperty("top_highlight")
  public String getTopHighlight() {
    return topHighlight;
  }

  public void setTopHighlight(String topHighlight) {
    this.topHighlight = topHighlight;
  }

}

