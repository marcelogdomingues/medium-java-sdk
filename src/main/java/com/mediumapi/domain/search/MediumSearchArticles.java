package com.mediumapi.domain.search;

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
 * MediumSearchArticles
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumSearchArticles {

  @Valid
  private List<String> articles;

  private String searchQuery;

  public MediumSearchArticles articles(List<String> articles) {
    this.articles = articles;
    return this;
  }

  public MediumSearchArticles addArticlesItem(String articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<>();
    }
    this.articles.add(articlesItem);
    return this;
  }

  /**
   * Get articles
   * 
   * @return articles
   */

  @JsonProperty("articles")
  public List<String> getArticles() {
    return articles;
  }

  public void setArticles(List<String> articles) {
    this.articles = articles;
  }

  public MediumSearchArticles searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * 
   * @return searchQuery
   */

  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

}
