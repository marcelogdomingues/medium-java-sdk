package com.mediumapi.domain.users;

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
 * Returns the list of &#x60;article_ids&#x60; of the top 10 articles, posted by the user.
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserTopArticles {

  private String id;

  @Valid
  private List<String> topArticles;

  public MediumUserTopArticles id(String id) {
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

  public MediumUserTopArticles topArticles(List<String> topArticles) {
    this.topArticles = topArticles;
    return this;
  }

  public MediumUserTopArticles addTopArticlesItem(String topArticlesItem) {
    if (this.topArticles == null) {
      this.topArticles = new ArrayList<>();
    }
    this.topArticles.add(topArticlesItem);
    return this;
  }

  /**
   * Get topArticles
   * @return topArticles
   */

  @JsonProperty("top_articles")
  public List<String> getTopArticles() {
    return topArticles;
  }

  public void setTopArticles(List<String> topArticles) {
    this.topArticles = topArticles;
  }

}