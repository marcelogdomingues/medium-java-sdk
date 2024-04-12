package com.mediumapi.domain.list;

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
 * MediumListArticles
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumListArticles {

  private String id;

  @Valid
  private List<String> listArticles;

  private Integer count;

  public MediumListArticles id(String id) {
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

  public MediumListArticles listArticles(List<String> listArticles) {
    this.listArticles = listArticles;
    return this;
  }

  public MediumListArticles addListArticlesItem(String listArticlesItem) {
    if (this.listArticles == null) {
      this.listArticles = new ArrayList<>();
    }
    this.listArticles.add(listArticlesItem);
    return this;
  }

  /**
   * Get listArticles
   * @return listArticles
  */
  
  @JsonProperty("list_articles")
  public List<String> getListArticles() {
    return listArticles;
  }

  public void setListArticles(List<String> listArticles) {
    this.listArticles = listArticles;
  }

  public MediumListArticles count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
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

