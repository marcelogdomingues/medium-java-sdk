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
 * MediumPlatformTopfeeds
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPlatformTopfeeds {

  @Valid
  private List<String> topfeeds;

  private Integer count;

  private String tag;

  private String mode;

  public MediumPlatformTopfeeds topfeeds(List<String> topfeeds) {
    this.topfeeds = topfeeds;
    return this;
  }

  public MediumPlatformTopfeeds addTopfeedsItem(String topfeedsItem) {
    if (this.topfeeds == null) {
      this.topfeeds = new ArrayList<>();
    }
    this.topfeeds.add(topfeedsItem);
    return this;
  }

  /**
   * Get topfeeds
   * @return topfeeds
  */
  
  @JsonProperty("topfeeds")
  public List<String> getTopfeeds() {
    return topfeeds;
  }

  public void setTopfeeds(List<String> topfeeds) {
    this.topfeeds = topfeeds;
  }

  public MediumPlatformTopfeeds count(Integer count) {
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

  public MediumPlatformTopfeeds tag(String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Get tag
   * @return tag
  */
  
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public MediumPlatformTopfeeds mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  
  @JsonProperty("mode")
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

}

