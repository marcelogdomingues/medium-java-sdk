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
 * MediumPlatformRecommendedFeed
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPlatformRecommendedFeed {

  @Valid
  private List<String> recommendedFeed;

  private Integer count;

  private String tag;

  private Integer page;

  public MediumPlatformRecommendedFeed recommendedFeed(List<String> recommendedFeed) {
    this.recommendedFeed = recommendedFeed;
    return this;
  }

  public MediumPlatformRecommendedFeed addRecommendedFeedItem(String recommendedFeedItem) {
    if (this.recommendedFeed == null) {
      this.recommendedFeed = new ArrayList<>();
    }
    this.recommendedFeed.add(recommendedFeedItem);
    return this;
  }

  /**
   * Get recommendedFeed
   * 
   * @return recommendedFeed
   */

  @JsonProperty("recommended_feed")
  public List<String> getRecommendedFeed() {
    return recommendedFeed;
  }

  public void setRecommendedFeed(List<String> recommendedFeed) {
    this.recommendedFeed = recommendedFeed;
  }

  public MediumPlatformRecommendedFeed count(Integer count) {
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

  public MediumPlatformRecommendedFeed tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * 
   * @return tag
   */

  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public MediumPlatformRecommendedFeed page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * 
   * @return page
   */

  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

}
