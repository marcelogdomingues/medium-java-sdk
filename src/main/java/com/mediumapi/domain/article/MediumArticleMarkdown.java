package com.mediumapi.domain.article;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumArticleMarkdown
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleMarkdown {

  private String id;

  private String markdown;

  public MediumArticleMarkdown id(String id) {
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

  public MediumArticleMarkdown markdown(String markdown) {
    this.markdown = markdown;
    return this;
  }

  /**
   * Get markdown
   * @return markdown
  */
  
  @JsonProperty("markdown")
  public String getMarkdown() {
    return markdown;
  }

  public void setMarkdown(String markdown) {
    this.markdown = markdown;
  }

}

