package com.mediumapi.domain.list;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumList
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumList {

  private String id;

  private String name;

  private String description;

  private String author;

  private Integer count;

  private Integer responsesCount;

  private Integer claps;

  private Integer voters;

  private String createdAt;

  private String lastItemInsertedAt;

  private String thumbnail;

  public MediumList id(String id) {
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

  public MediumList name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MediumList description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MediumList author(String author) {
    this.author = author;
    return this;
  }

  /**
   * `user_id` of the author
   * @return author
  */
  
  @JsonProperty("author")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public MediumList count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Number of articles in the list
   * @return count
  */
  
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public MediumList responsesCount(Integer responsesCount) {
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

  public MediumList claps(Integer claps) {
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

  public MediumList voters(Integer voters) {
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

  public MediumList createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  
  @JsonProperty("created_at")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public MediumList lastItemInsertedAt(String lastItemInsertedAt) {
    this.lastItemInsertedAt = lastItemInsertedAt;
    return this;
  }

  /**
   * Get lastItemInsertedAt
   * @return lastItemInsertedAt
  */
  
  @JsonProperty("last_item_inserted_at")
  public String getLastItemInsertedAt() {
    return lastItemInsertedAt;
  }

  public void setLastItemInsertedAt(String lastItemInsertedAt) {
    this.lastItemInsertedAt = lastItemInsertedAt;
  }

  public MediumList thumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
    return this;
  }

  /**
   * Image URL
   * @return thumbnail
  */
  
  @JsonProperty("thumbnail")
  public String getThumbnail() {
    return thumbnail;
  }

  public void setThumbnail(String thumbnail) {
    this.thumbnail = thumbnail;
  }

}

