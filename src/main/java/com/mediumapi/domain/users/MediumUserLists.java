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
 * MediumUserLists
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserLists {

  private String id;

  @Valid
  private List<String> lists;

  private Integer count;

  public MediumUserLists id(String id) {
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

  public MediumUserLists lists(List<String> lists) {
    this.lists = lists;
    return this;
  }

  public MediumUserLists addListsItem(String listsItem) {
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

  public MediumUserLists count(Integer count) {
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

