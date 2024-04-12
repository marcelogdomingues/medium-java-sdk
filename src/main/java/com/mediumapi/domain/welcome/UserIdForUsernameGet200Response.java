package com.mediumapi.domain.welcome;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * UserIdForUsernameGet200Response
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class UserIdForUsernameGet200Response {

  private String id;

  public UserIdForUsernameGet200Response id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique hash id of the user.
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

}
