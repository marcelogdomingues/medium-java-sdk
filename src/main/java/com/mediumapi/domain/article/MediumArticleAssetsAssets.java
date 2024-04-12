package com.mediumapi.domain.article;

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
 * MediumArticleAssetsAssets
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleAssetsAssets {

  @Valid
  private List<String> images;

  @Valid
  private List<String> githubGists;

  @Valid
  private List<@Valid MediumArticleAssetsAssetsYoutubeInner> youtube;

  @Valid
  private List<@Valid MediumArticleAssetsAssetsAnchorsInner> anchors;

  private MediumArticleAssetsAssetsOtherEmbeds otherEmbeds;

  public MediumArticleAssetsAssets images(List<String> images) {
    this.images = images;
    return this;
  }

  public MediumArticleAssetsAssets addImagesItem(String imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  
  @JsonProperty("images")
  public List<String> getImages() {
    return images;
  }

  public void setImages(List<String> images) {
    this.images = images;
  }

  public MediumArticleAssetsAssets githubGists(List<String> githubGists) {
    this.githubGists = githubGists;
    return this;
  }

  public MediumArticleAssetsAssets addGithubGistsItem(String githubGistsItem) {
    if (this.githubGists == null) {
      this.githubGists = new ArrayList<>();
    }
    this.githubGists.add(githubGistsItem);
    return this;
  }

  /**
   * Get githubGists
   * @return githubGists
  */
  
  @JsonProperty("github_gists")
  public List<String> getGithubGists() {
    return githubGists;
  }

  public void setGithubGists(List<String> githubGists) {
    this.githubGists = githubGists;
  }

  public MediumArticleAssetsAssets youtube(List<@Valid MediumArticleAssetsAssetsYoutubeInner> youtube) {
    this.youtube = youtube;
    return this;
  }

  public MediumArticleAssetsAssets addYoutubeItem(MediumArticleAssetsAssetsYoutubeInner youtubeItem) {
    if (this.youtube == null) {
      this.youtube = new ArrayList<>();
    }
    this.youtube.add(youtubeItem);
    return this;
  }

  /**
   * Get youtube
   * @return youtube
  */
  @Valid 
  @JsonProperty("youtube")
  public List<@Valid MediumArticleAssetsAssetsYoutubeInner> getYoutube() {
    return youtube;
  }

  public void setYoutube(List<@Valid MediumArticleAssetsAssetsYoutubeInner> youtube) {
    this.youtube = youtube;
  }

  public MediumArticleAssetsAssets anchors(List<@Valid MediumArticleAssetsAssetsAnchorsInner> anchors) {
    this.anchors = anchors;
    return this;
  }

  public MediumArticleAssetsAssets addAnchorsItem(MediumArticleAssetsAssetsAnchorsInner anchorsItem) {
    if (this.anchors == null) {
      this.anchors = new ArrayList<>();
    }
    this.anchors.add(anchorsItem);
    return this;
  }

  /**
   * Get anchors
   * @return anchors
  */
  @Valid 
  @JsonProperty("anchors")
  public List<@Valid MediumArticleAssetsAssetsAnchorsInner> getAnchors() {
    return anchors;
  }

  public void setAnchors(List<@Valid MediumArticleAssetsAssetsAnchorsInner> anchors) {
    this.anchors = anchors;
  }

  public MediumArticleAssetsAssets otherEmbeds(MediumArticleAssetsAssetsOtherEmbeds otherEmbeds) {
    this.otherEmbeds = otherEmbeds;
    return this;
  }

  /**
   * Get otherEmbeds
   * @return otherEmbeds
  */
  @Valid 
  @JsonProperty("other_embeds")
  public MediumArticleAssetsAssetsOtherEmbeds getOtherEmbeds() {
    return otherEmbeds;
  }

  public void setOtherEmbeds(MediumArticleAssetsAssetsOtherEmbeds otherEmbeds) {
    this.otherEmbeds = otherEmbeds;
  }

}

