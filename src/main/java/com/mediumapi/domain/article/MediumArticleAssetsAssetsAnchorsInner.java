package com.mediumapi.domain.article;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumArticleAssetsAssetsAnchorsInner
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleAssetsAssetsAnchorsInner {

  private String text;

  private String href;

  public MediumArticleAssetsAssetsAnchorsInner text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Get text
   * 
   * @return text
   */

  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MediumArticleAssetsAssetsAnchorsInner href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * 
   * @return href
   */

  @JsonProperty("href")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

}
