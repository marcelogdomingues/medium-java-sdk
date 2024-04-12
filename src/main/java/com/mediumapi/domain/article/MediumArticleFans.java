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
 * MediumArticleFans
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumArticleFans {

  private String id;

  @Valid
  private List<String> voters;

  private Integer count;

  public MediumArticleFans id(String id) {
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

  public MediumArticleFans voters(List<String> voters) {
    this.voters = voters;
    return this;
  }

  public MediumArticleFans addVotersItem(String votersItem) {
    if (this.voters == null) {
      this.voters = new ArrayList<>();
    }
    this.voters.add(votersItem);
    return this;
  }

  /**
   * Get voters
   * 
   * @return voters
   */

  @JsonProperty("voters")
  public List<String> getVoters() {
    return voters;
  }

  public void setVoters(List<String> voters) {
    this.voters = voters;
  }

  public MediumArticleFans count(Integer count) {
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

}
