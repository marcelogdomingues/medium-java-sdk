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
 * Returns the list of &#x60;user_ids&#x60; of the followers of the user. 
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserFollowers {

  private String id;

  @Valid
  private List<String> followers;

  private Integer count;

  private String next;

  private Integer totalFollowers;

  public MediumUserFollowers id(String id) {
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

  public MediumUserFollowers followers(List<String> followers) {
    this.followers = followers;
    return this;
  }

  public MediumUserFollowers addFollowersItem(String followersItem) {
    if (this.followers == null) {
      this.followers = new ArrayList<>();
    }
    this.followers.add(followersItem);
    return this;
  }

  /**
   * Get followers
   * @return followers
  */
  
  @JsonProperty("followers")
  public List<String> getFollowers() {
    return followers;
  }

  public void setFollowers(List<String> followers) {
    this.followers = followers;
  }

  public MediumUserFollowers count(Integer count) {
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

  public MediumUserFollowers next(String next) {
    this.next = next;
    return this;
  }

  /**
   * Get next
   * @return next
  */
  
  @JsonProperty("next")
  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public MediumUserFollowers totalFollowers(Integer totalFollowers) {
    this.totalFollowers = totalFollowers;
    return this;
  }

  /**
   * Get totalFollowers
   * @return totalFollowers
  */
  
  @JsonProperty("total_followers")
  public Integer getTotalFollowers() {
    return totalFollowers;
  }

  public void setTotalFollowers(Integer totalFollowers) {
    this.totalFollowers = totalFollowers;
  }

}

