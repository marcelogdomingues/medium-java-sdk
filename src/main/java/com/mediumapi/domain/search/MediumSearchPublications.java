package com.mediumapi.domain.search;

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
 * MediumSearchPublications
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumSearchPublications {

  @Valid
  private List<String> publications;

  private String searchQuery;

  public MediumSearchPublications publications(List<String> publications) {
    this.publications = publications;
    return this;
  }

  public MediumSearchPublications addPublicationsItem(String publicationsItem) {
    if (this.publications == null) {
      this.publications = new ArrayList<>();
    }
    this.publications.add(publicationsItem);
    return this;
  }

  /**
   * Get publications
   * @return publications
  */
  
  @JsonProperty("publications")
  public List<String> getPublications() {
    return publications;
  }

  public void setPublications(List<String> publications) {
    this.publications = publications;
  }

  public MediumSearchPublications searchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Get searchQuery
   * @return searchQuery
  */
  
  @JsonProperty("search_query")
  public String getSearchQuery() {
    return searchQuery;
  }

  public void setSearchQuery(String searchQuery) {
    this.searchQuery = searchQuery;
  }

}

