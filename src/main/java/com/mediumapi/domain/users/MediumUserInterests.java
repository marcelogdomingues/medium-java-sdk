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
 * MediumUserInterests
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserInterests {

  private String id;

  @Valid
  private List<String> tagsFollowed;

  private Integer count;

  public MediumUserInterests id(String id) {
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

  public MediumUserInterests tagsFollowed(List<String> tagsFollowed) {
    this.tagsFollowed = tagsFollowed;
    return this;
  }

  public MediumUserInterests addTagsFollowedItem(String tagsFollowedItem) {
    if (this.tagsFollowed == null) {
      this.tagsFollowed = new ArrayList<>();
    }
    this.tagsFollowed.add(tagsFollowedItem);
    return this;
  }

  /**
   * Get tagsFollowed
   * 
   * @return tagsFollowed
   */

  @JsonProperty("tags_followed")
  public List<String> getTagsFollowed() {
    return tagsFollowed;
  }

  public void setTagsFollowed(List<String> tagsFollowed) {
    this.tagsFollowed = tagsFollowed;
  }

  public MediumUserInterests count(Integer count) {
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
