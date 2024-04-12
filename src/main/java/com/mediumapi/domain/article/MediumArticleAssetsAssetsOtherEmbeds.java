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
 * MediumArticleAssetsAssetsOtherEmbeds
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleAssetsAssetsOtherEmbeds {

  @Valid
  private List<@Valid MediumArticleAssetsAssetsOtherEmbedsExampleComInner> exampleCom;

  public MediumArticleAssetsAssetsOtherEmbeds exampleCom(List<@Valid MediumArticleAssetsAssetsOtherEmbedsExampleComInner> exampleCom) {
    this.exampleCom = exampleCom;
    return this;
  }

  public MediumArticleAssetsAssetsOtherEmbeds addExampleComItem(MediumArticleAssetsAssetsOtherEmbedsExampleComInner exampleComItem) {
    if (this.exampleCom == null) {
      this.exampleCom = new ArrayList<>();
    }
    this.exampleCom.add(exampleComItem);
    return this;
  }

  /**
   * Get exampleCom
   * @return exampleCom
  */
  @Valid 
  @JsonProperty("example.com")
  public List<@Valid MediumArticleAssetsAssetsOtherEmbedsExampleComInner> getExampleCom() {
    return exampleCom;
  }

  public void setExampleCom(List<@Valid MediumArticleAssetsAssetsOtherEmbedsExampleComInner> exampleCom) {
    this.exampleCom = exampleCom;
  }
}

