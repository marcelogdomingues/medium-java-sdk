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
 * MediumUserPublicationFollowing
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserPublicationFollowing {

  private String id;

  @Valid
  private List<String> publicationFollowing;

  private Integer count;

  public MediumUserPublicationFollowing id(String id) {
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

  public MediumUserPublicationFollowing publicationFollowing(List<String> publicationFollowing) {
    this.publicationFollowing = publicationFollowing;
    return this;
  }

  public MediumUserPublicationFollowing addPublicationFollowingItem(String publicationFollowingItem) {
    if (this.publicationFollowing == null) {
      this.publicationFollowing = new ArrayList<>();
    }
    this.publicationFollowing.add(publicationFollowingItem);
    return this;
  }

  /**
   * Get publicationFollowing
   * @return publicationFollowing
  */
  
  @JsonProperty("publication_following")
  public List<String> getPublicationFollowing() {
    return publicationFollowing;
  }

  public void setPublicationFollowing(List<String> publicationFollowing) {
    this.publicationFollowing = publicationFollowing;
  }

  public MediumUserPublicationFollowing count(Integer count) {
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

