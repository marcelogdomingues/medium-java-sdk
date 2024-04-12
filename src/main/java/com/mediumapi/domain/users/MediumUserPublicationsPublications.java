package com.mediumapi.domain.users;

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
 * MediumUserPublicationsPublications
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUserPublicationsPublications {

  @Valid
  private List<String> adminIn;

  @Valid
  private List<String> writerIn;

  public MediumUserPublicationsPublications adminIn(List<String> adminIn) {
    this.adminIn = adminIn;
    return this;
  }

  public MediumUserPublicationsPublications addAdminInItem(String adminInItem) {
    if (this.adminIn == null) {
      this.adminIn = new ArrayList<>();
    }
    this.adminIn.add(adminInItem);
    return this;
  }

  /**
   * Get adminIn
   * @return adminIn
   */

  @JsonProperty("admin_in")
  public List<String> getAdminIn() {
    return adminIn;
  }

  public void setAdminIn(List<String> adminIn) {
    this.adminIn = adminIn;
  }

  public MediumUserPublicationsPublications writerIn(List<String> writerIn) {
    this.writerIn = writerIn;
    return this;
  }

  public MediumUserPublicationsPublications addWriterInItem(String writerInItem) {
    if (this.writerIn == null) {
      this.writerIn = new ArrayList<>();
    }
    this.writerIn.add(writerInItem);
    return this;
  }

  /**
   * Get writerIn
   * @return writerIn
   */

  @JsonProperty("writer_in")
  public List<String> getWriterIn() {
    return writerIn;
  }

  public void setWriterIn(List<String> writerIn) {
    this.writerIn = writerIn;
  }

}

