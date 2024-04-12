package com.mediumapi.domain.platform;

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
 * MediumPlatformLatestPosts
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPlatformLatestPosts {

  @Valid
  private List<String> latestposts;

  public MediumPlatformLatestPosts latestposts(List<String> latestposts) {
    this.latestposts = latestposts;
    return this;
  }

  public MediumPlatformLatestPosts addLatestpostsItem(String latestpostsItem) {
    if (this.latestposts == null) {
      this.latestposts = new ArrayList<>();
    }
    this.latestposts.add(latestpostsItem);
    return this;
  }

  /**
   * Get latestposts
   * @return latestposts
  */
  
  @JsonProperty("latestposts")
  public List<String> getLatestposts() {
    return latestposts;
  }

  public void setLatestposts(List<String> latestposts) {
    this.latestposts = latestposts;
  }

}

