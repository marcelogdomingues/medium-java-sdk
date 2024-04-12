package com.mediumapi.domain.article;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumArticleAssets
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleAssets {

  private MediumArticleAssetsAssets assets;

  public MediumArticleAssets assets(MediumArticleAssetsAssets assets) {
    this.assets = assets;
    return this;
  }

  /**
   * Get assets
   * 
   * @return assets
   */
  @Valid
  @JsonProperty("assets")
  public MediumArticleAssetsAssets getAssets() {
    return assets;
  }

  public void setAssets(MediumArticleAssetsAssets assets) {
    this.assets = assets;
  }

}
