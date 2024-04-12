package com.mediumapi.domain.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * MediumArticleAssetsAssetsYoutubeInner
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleAssetsAssetsYoutubeInner {

  private String title;

  private String href;

  private String description;

  public MediumArticleAssetsAssetsYoutubeInner title(String title) {
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

  public MediumArticleAssetsAssetsYoutubeInner href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  */
  
  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public MediumArticleAssetsAssetsYoutubeInner description(String description) {
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

}

