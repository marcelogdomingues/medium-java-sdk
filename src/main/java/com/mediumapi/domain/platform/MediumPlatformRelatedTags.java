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
 * MediumPlatformRelatedTags
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPlatformRelatedTags {

  @Valid
  private List<String> relatedTags;

  private String givenTag;

  public MediumPlatformRelatedTags relatedTags(List<String> relatedTags) {
    this.relatedTags = relatedTags;
    return this;
  }

  public MediumPlatformRelatedTags addRelatedTagsItem(String relatedTagsItem) {
    if (this.relatedTags == null) {
      this.relatedTags = new ArrayList<>();
    }
    this.relatedTags.add(relatedTagsItem);
    return this;
  }

  /**
   * Get relatedTags
   * @return relatedTags
  */
  
  @JsonProperty("related_tags")
  public List<String> getRelatedTags() {
    return relatedTags;
  }

  public void setRelatedTags(List<String> relatedTags) {
    this.relatedTags = relatedTags;
  }

  public MediumPlatformRelatedTags givenTag(String givenTag) {
    this.givenTag = givenTag;
    return this;
  }

  /**
   * Get givenTag
   * @return givenTag
  */
  
  @JsonProperty("given_tag")
  public String getGivenTag() {
    return givenTag;
  }

  public void setGivenTag(String givenTag) {
    this.givenTag = givenTag;
  }

}

