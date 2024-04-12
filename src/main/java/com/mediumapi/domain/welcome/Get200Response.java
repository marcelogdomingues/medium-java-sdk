package com.mediumapi.domain.welcome;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Get200Response
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Get200Response {

  private String name;

  private String developer;

  private String email;

  private String website;

  private String documentation;

  private String twitter;

  private String linkedin;

  public Get200Response name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the API
   * @return name
  */
  
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Get200Response developer(String developer) {
    this.developer = developer;
    return this;
  }

  /**
   * Full name of the API's developer
   * @return developer
  */
  
  @JsonProperty("developer")
  public String getDeveloper() {
    return developer;
  }

  public void setDeveloper(String developer) {
    this.developer = developer;
  }

  public Get200Response email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email ID of the developer
   * @return email
  */
  
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Get200Response website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Link to the Medium API's website
   * @return website
  */
  
  @JsonProperty("website")
  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Get200Response documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Link to the API's documentation
   * @return documentation
  */
  
  @JsonProperty("documentation")
  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public Get200Response twitter(String twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * Twitter Profile URL
   * @return twitter
  */
  
  @JsonProperty("twitter")
  public String getTwitter() {
    return twitter;
  }

  public void setTwitter(String twitter) {
    this.twitter = twitter;
  }

  public Get200Response linkedin(String linkedin) {
    this.linkedin = linkedin;
    return this;
  }

  /**
   * LinkedIn Page URL
   * @return linkedin
  */
  
  @JsonProperty("linkedin")
  public String getLinkedin() {
    return linkedin;
  }

  public void setLinkedin(String linkedin) {
    this.linkedin = linkedin;
  }

}

