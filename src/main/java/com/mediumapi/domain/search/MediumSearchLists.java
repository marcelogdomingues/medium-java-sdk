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
 * MediumSearchLists
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumSearchLists {

  @Valid
  private List<String> lists;

  private String searchQuery;

  public MediumSearchLists lists(List<String> lists) {
    this.lists = lists;
    return this;
  }

  public MediumSearchLists addListsItem(String listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<>();
    }
    this.lists.add(listsItem);
    return this;
  }

  /**
   * Get lists
   * @return lists
  */
  
  @JsonProperty("lists")
  public List<String> getLists() {
    return lists;
  }

  public void setLists(List<String> lists) {
    this.lists = lists;
  }

  public MediumSearchLists searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
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

