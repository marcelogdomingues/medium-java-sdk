package com.mediumapi.domain.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * MediumPublication
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPublication {

  private String id;

  private String name;

  private String tagline;

  private String description;

  @Valid
  private List<String> tags;

  private Integer followers;

  private String instagramUsername;

  private String facebookPagename;

  private String url;

  private String slug;

  private String twitterUsername;

  private String creator;

  @Valid
  private List<String> editors;

  public MediumPublication id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * 
   * @return id
   */

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MediumPublication name(String name) {
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

  public MediumPublication tagline(String tagline) {
    this.tagline = tagline;
    return this;
  }

  /**
   * Get tagline
   * 
   * @return tagline
   */

  @JsonProperty("tagline")
  public String getTagline() {
    return tagline;
  }

  public void setTagline(String tagline) {
    this.tagline = tagline;
  }

  public MediumPublication description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * 
   * @return description
   */

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MediumPublication tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public MediumPublication addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Get tags
   * 
   * @return tags
   */

  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public MediumPublication followers(Integer followers) {
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

  public MediumPublication instagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
    return this;
  }

  /**
   * Get instagramUsername
   * 
   * @return instagramUsername
   */

  @JsonProperty("instagram_username")
  public String getInstagramUsername() {
    return instagramUsername;
  }

  public void setInstagramUsername(String instagramUsername) {
    this.instagramUsername = instagramUsername;
  }

  public MediumPublication facebookPagename(String facebookPagename) {
    this.facebookPagename = facebookPagename;
    return this;
  }

  /**
   * Get facebookPagename
   * 
   * @return facebookPagename
   */

  @JsonProperty("facebook_pagename")
  public String getFacebookPagename() {
    return facebookPagename;
  }

  public void setFacebookPagename(String facebookPagename) {
    this.facebookPagename = facebookPagename;
  }

  public MediumPublication url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Get url
   * 
   * @return url
   */

  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public MediumPublication slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * 
   * @return slug
   */

  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public MediumPublication twitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
    return this;
  }

  /**
   * Get twitterUsername
   * 
   * @return twitterUsername
   */

  @JsonProperty("twitter_username")
  public String getTwitterUsername() {
    return twitterUsername;
  }

  public void setTwitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
  }

  public MediumPublication creator(String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   * 
   * @return creator
   */

  @JsonProperty("creator")
  public String getCreator() {
    return creator;
  }

  public void setCreator(String creator) {
    this.creator = creator;
  }

  public MediumPublication editors(List<String> editors) {
    this.editors = editors;
    return this;
  }

  public MediumPublication addEditorsItem(String editorsItem) {
    if (this.editors == null) {
      this.editors = new ArrayList<>();
    }
    this.editors.add(editorsItem);
    return this;
  }

  /**
   * Get editors
   * 
   * @return editors
   */

  @JsonProperty("editors")
  public List<String> getEditors() {
    return editors;
  }

  public void setEditors(List<String> editors) {
    this.editors = editors;
  }

}
