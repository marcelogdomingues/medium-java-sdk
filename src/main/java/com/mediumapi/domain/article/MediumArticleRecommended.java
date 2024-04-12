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
 * MediumArticleRecommended
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleRecommended {

  private String id;

  @Valid
  private List<String> recommendedArticles;

  public MediumArticleRecommended id(String id) {
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

  public MediumArticleRecommended recommendedArticles(List<String> recommendedArticles) {
    this.recommendedArticles = recommendedArticles;
    return this;
  }

  public MediumArticleRecommended addRecommendedArticlesItem(String recommendedArticlesItem) {
    if (this.recommendedArticles == null) {
      this.recommendedArticles = new ArrayList<>();
    }
    this.recommendedArticles.add(recommendedArticlesItem);
    return this;
  }

  /**
   * Get recommendedArticles
   * 
   * @return recommendedArticles
   */

  @JsonProperty("recommended_articles")
  public List<String> getRecommendedArticles() {
    return recommendedArticles;
  }

  public void setRecommendedArticles(List<String> recommendedArticles) {
    this.recommendedArticles = recommendedArticles;
  }

}
