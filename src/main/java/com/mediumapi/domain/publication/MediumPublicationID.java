package com.mediumapi.domain.publication;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * MediumPublicationID
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPublicationID {

  private String publicationId;

  private String publicationSlug;

  public MediumPublicationID publicationId(String publicationId) {
    this.publicationId = publicationId;
    return this;
  }

  /**
   * Unique hash id of the publication.
   * 
   * @return publicationId
   */

  @JsonProperty("publication_id")
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  public MediumPublicationID publicationSlug(String publicationSlug) {
    this.publicationSlug = publicationSlug;
    return this;
  }

  /**
   * Same publication slug that you passed in the path parameters.
   * 
   * @return publicationSlug
   */

  @JsonProperty("publication_slug")
  public String getPublicationSlug() {
    return publicationSlug;
  }

  public void setPublicationSlug(String publicationSlug) {
    this.publicationSlug = publicationSlug;
  }

}
