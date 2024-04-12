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
 * MediumUserFollowing
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserFollowing {

  private String id;

  @Valid
  private List<String> following;

  public MediumUserFollowing id(String id) {
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

  public MediumUserFollowing following(List<String> following) {
    this.following = following;
    return this;
  }

  public MediumUserFollowing addFollowingItem(String followingItem) {
    if (this.following == null) {
      this.following = new ArrayList<>();
    }
    this.following.add(followingItem);
    return this;
  }

  /**
   * Get following
   * 
   * @return following
   */

  @JsonProperty("following")
  public List<String> getFollowing() {
    return following;
  }

  public void setFollowing(List<String> following) {
    this.following = following;
  }

}
