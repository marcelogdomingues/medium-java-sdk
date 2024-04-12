package com.mediumapi.domain.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * MediumPublicationNewsletter
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPublicationNewsletter {

  private String id;

  private String name;

  private String description;

  private Integer subscribers;

  private String slug;

  private String creatorId;

  private String image;

  public MediumPublicationNewsletter id(String id) {
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

  public MediumPublicationNewsletter name(String name) {
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

  public MediumPublicationNewsletter description(String description) {
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

  public MediumPublicationNewsletter subscribers(Integer subscribers) {
    this.subscribers = subscribers;
    return this;
  }

  /**
   * Get subscribers
   * @return subscribers
  */
  
  @JsonProperty("subscribers")
  public Integer getSubscribers() {
    return subscribers;
  }

  public void setSubscribers(Integer subscribers) {
    this.subscribers = subscribers;
  }

  public MediumPublicationNewsletter slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * Get slug
   * @return slug
  */
  
  @JsonProperty("slug")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public MediumPublicationNewsletter creatorId(String creatorId) {
    this.creatorId = creatorId;
    return this;
  }

  /**
   * Get creatorId
   * @return creatorId
  */
  
  @JsonProperty("creator_id")
  public String getCreatorId() {
    return creatorId;
  }

  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }

  public MediumPublicationNewsletter image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  
  @JsonProperty("image")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

}

