package com.mediumapi.domain.platform;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumPlatformTag
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPlatformTag {

  private String tag;

  private String name;

  private Integer followers;

  private Integer articlesCount;

  private Integer authorsCount;

  private Integer latestArticlesCount;

  private Integer latestAuthorsCount;

  public MediumPlatformTag tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * 
   * @return tag
   */

  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public MediumPlatformTag name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * 
   * @return name
   */

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MediumPlatformTag followers(Integer followers) {
    this.followers = followers;
    return this;
  }

  /**
   * Get followers
   * 
   * @return followers
   */

  @JsonProperty("followers")
  public Integer getFollowers() {
    return followers;
  }

  public void setFollowers(Integer followers) {
    this.followers = followers;
  }

  public MediumPlatformTag articlesCount(Integer articlesCount) {
    this.articlesCount = articlesCount;
    return this;
  }

  /**
   * Get articlesCount
   * 
   * @return articlesCount
   */

  @JsonProperty("articles_count")
  public Integer getArticlesCount() {
    return articlesCount;
  }

  public void setArticlesCount(Integer articlesCount) {
    this.articlesCount = articlesCount;
  }

  public MediumPlatformTag authorsCount(Integer authorsCount) {
    this.authorsCount = authorsCount;
    return this;
  }

  /**
   * Get authorsCount
   * 
   * @return authorsCount
   */

  @JsonProperty("authors_count")
  public Integer getAuthorsCount() {
    return authorsCount;
  }

  public void setAuthorsCount(Integer authorsCount) {
    this.authorsCount = authorsCount;
  }

  public MediumPlatformTag latestArticlesCount(Integer latestArticlesCount) {
    this.latestArticlesCount = latestArticlesCount;
    return this;
  }

  /**
   * Get latestArticlesCount
   * 
   * @return latestArticlesCount
   */

  @JsonProperty("latest_articles_count")
  public Integer getLatestArticlesCount() {
    return latestArticlesCount;
  }

  public void setLatestArticlesCount(Integer latestArticlesCount) {
    this.latestArticlesCount = latestArticlesCount;
  }

  public MediumPlatformTag latestAuthorsCount(Integer latestAuthorsCount) {
    this.latestAuthorsCount = latestAuthorsCount;
    return this;
  }

  /**
   * Get latestAuthorsCount
   * 
   * @return latestAuthorsCount
   */

  @JsonProperty("latest_authors_count")
  public Integer getLatestAuthorsCount() {
    return latestAuthorsCount;
  }

  public void setLatestAuthorsCount(Integer latestAuthorsCount) {
    this.latestAuthorsCount = latestAuthorsCount;
  }

}
