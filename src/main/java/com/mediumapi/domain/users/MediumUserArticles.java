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
 * Returns the list of &#x60;article_ids&#x60; of the latest 25 articles, posted
 * by the user.
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserArticles {

  private String id;

  @Valid
  private List<String> associatedArticles;

  private Integer count;

  public MediumUserArticles id(String id) {
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

  public MediumUserArticles associatedArticles(List<String> associatedArticles) {
    this.associatedArticles = associatedArticles;
    return this;
  }

  public MediumUserArticles addAssociatedArticlesItem(String associatedArticlesItem) {
    if (this.associatedArticles == null) {
      this.associatedArticles = new ArrayList<>();
    }
    this.associatedArticles.add(associatedArticlesItem);
    return this;
  }

  /**
   * Get associatedArticles
   * 
   * @return associatedArticles
   */

  @JsonProperty("associated_articles")
  public List<String> getAssociatedArticles() {
    return associatedArticles;
  }

  public void setAssociatedArticles(List<String> associatedArticles) {
    this.associatedArticles = associatedArticles;
  }

  public MediumUserArticles count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * 
   * @return count
   */

  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

}
