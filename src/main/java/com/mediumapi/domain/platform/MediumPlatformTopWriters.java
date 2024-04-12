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
 * MediumPlatformTopWriters
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPlatformTopWriters {

  @Valid
  private List<String> topWriters;

  public MediumPlatformTopWriters topWriters(List<String> topWriters) {
    this.topWriters = topWriters;
    return this;
  }

  public MediumPlatformTopWriters addTopWritersItem(String topWritersItem) {
    if (this.topWriters == null) {
      this.topWriters = new ArrayList<>();
    }
    this.topWriters.add(topWritersItem);
    return this;
  }

  /**
   * Get topWriters
   * 
   * @return topWriters
   */

  @JsonProperty("top_writers")
  public List<String> getTopWriters() {
    return topWriters;
  }

  public void setTopWriters(List<String> topWriters) {
    this.topWriters = topWriters;
  }

}
