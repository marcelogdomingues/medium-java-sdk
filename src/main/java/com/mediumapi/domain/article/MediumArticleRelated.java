package com.mediumapi.domain.article;

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
 * MediumArticleRelated
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleRelated {

  private String id;

  @Valid
  private List<String> relatedArticles;

  public MediumArticleRelated id(String id) {
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

  public MediumArticleRelated relatedArticles(List<String> relatedArticles) {
    this.relatedArticles = relatedArticles;
    return this;
  }

  public MediumArticleRelated addRelatedArticlesItem(String relatedArticlesItem) {
    if (this.relatedArticles == null) {
      this.relatedArticles = new ArrayList<>();
    }
    this.relatedArticles.add(relatedArticlesItem);
    return this;
  }

  /**
   * Get relatedArticles
   * @return relatedArticles
  */
  
  @JsonProperty("related_articles")
  public List<String> getRelatedArticles() {
    return relatedArticles;
  }

  public void setRelatedArticles(List<String> relatedArticles) {
    this.relatedArticles = relatedArticles;
  }

}

