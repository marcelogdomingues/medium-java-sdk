package com.mediumapi.domain.users;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumUserPublications
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserPublications {

  private String id;

  private MediumUserPublicationsPublications publications;

  public MediumUserPublications id(String id) {
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

  public MediumUserPublications publications(MediumUserPublicationsPublications publications) {
    this.publications = publications;
    return this;
  }

  /**
   * Get publications
   * @return publications
  */
  @Valid 
  @JsonProperty("publications")
  public MediumUserPublicationsPublications getPublications() {
    return publications;
  }

  public void setPublications(MediumUserPublicationsPublications publications) {
    this.publications = publications;
  }

}