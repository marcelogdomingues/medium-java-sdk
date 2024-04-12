package com.mediumapi.domain.publication;

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
 * MediumPublicationArticles
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumPublicationArticles {

  @Valid
  private List<String> publicationArticles;

  private String publicationId;

  private String from;

  private String to;

  public MediumPublicationArticles publicationArticles(List<String> publicationArticles) {
    this.publicationArticles = publicationArticles;
    return this;
  }

  public MediumPublicationArticles addPublicationArticlesItem(String publicationArticlesItem) {
    if (this.publicationArticles == null) {
      this.publicationArticles = new ArrayList<>();
    }
    this.publicationArticles.add(publicationArticlesItem);
    return this;
  }

  /**
   * Get publicationArticles
   * @return publicationArticles
  */
  
  @JsonProperty("publication_articles")
  public List<String> getPublicationArticles() {
    return publicationArticles;
  }

  public void setPublicationArticles(List<String> publicationArticles) {
    this.publicationArticles = publicationArticles;
  }

  public MediumPublicationArticles publicationId(String publicationId) {
    this.publicationId = publicationId;
    return this;
  }

  /**
   * Get publicationId
   * @return publicationId
  */
  
  @JsonProperty("publication_id")
  public String getPublicationId() {
    return publicationId;
  }

  public void setPublicationId(String publicationId) {
    this.publicationId = publicationId;
  }

  public MediumPublicationArticles from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
  
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MediumPublicationArticles to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
  
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

}

