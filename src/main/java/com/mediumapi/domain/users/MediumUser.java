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
 * Returns the user related information such as *id, username, fullname, bio, top_writer_in, followers_count, following_count, publication_following_count, twitter_username, is_writer_program_enrolled, is_suspended, has_list, is_book_author, allow_notes, medium_member_at, image_url, logo_image_url, bg_image_url, tipping_link*.
 */

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class MediumUser {

  private String id;

  private String username;

  private String fullname;

  private String bio;

  @Valid
  private List<String> topWriterIn;

  private Integer followersCount;

  private Integer followingCount;

  private Integer publicationFollowingCount;

  private String twitterUsername;

  private Boolean isWriterProgramEnrolled;

  private Boolean isSuspended;

  private Boolean hasList;

  private Boolean isBookAuthor;

  private Boolean allowNotes;

  private String mediumMemberAt;

  private String imageUrl;

  private String logoImageUrl;

  private String bgImageUrl;

  private String tippingLink;

  public MediumUser id(String id) {
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

  public MediumUser username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */

  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public MediumUser fullname(String fullname) {
    this.fullname = fullname;
    return this;
  }

  /**
   * Get fullname
   * @return fullname
   */

  @JsonProperty("fullname")
  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public MediumUser bio(String bio) {
    this.bio = bio;
    return this;
  }

  /**
   * Get bio
   * @return bio
   */

  @JsonProperty("bio")
  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public MediumUser topWriterIn(List<String> topWriterIn) {
    this.topWriterIn = topWriterIn;
    return this;
  }

  public MediumUser addTopWriterInItem(String topWriterInItem) {
    if (this.topWriterIn == null) {
      this.topWriterIn = new ArrayList<>();
    }
    this.topWriterIn.add(topWriterInItem);
    return this;
  }

  /**
   * Get topWriterIn
   * @return topWriterIn
   */

  @JsonProperty("top_writer_in")
  public List<String> getTopWriterIn() {
    return topWriterIn;
  }

  public void setTopWriterIn(List<String> topWriterIn) {
    this.topWriterIn = topWriterIn;
  }

  public MediumUser followersCount(Integer followersCount) {
    this.followersCount = followersCount;
    return this;
  }

  /**
   * Get followersCount
   * @return followersCount
   */

  @JsonProperty("followers_count")
  public Integer getFollowersCount() {
    return followersCount;
  }

  public void setFollowersCount(Integer followersCount) {
    this.followersCount = followersCount;
  }

  public MediumUser followingCount(Integer followingCount) {
    this.followingCount = followingCount;
    return this;
  }

  /**
   * Get followingCount
   * @return followingCount
   */

  @JsonProperty("following_count")
  public Integer getFollowingCount() {
    return followingCount;
  }

  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }

  public MediumUser publicationFollowingCount(Integer publicationFollowingCount) {
    this.publicationFollowingCount = publicationFollowingCount;
    return this;
  }

  /**
   * Get publicationFollowingCount
   * @return publicationFollowingCount
   */

  @JsonProperty("publication_following_count")
  public Integer getPublicationFollowingCount() {
    return publicationFollowingCount;
  }

  public void setPublicationFollowingCount(Integer publicationFollowingCount) {
    this.publicationFollowingCount = publicationFollowingCount;
  }

  public MediumUser twitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
    return this;
  }

  /**
   * Get twitterUsername
   * @return twitterUsername
   */

  @JsonProperty("twitter_username")
  public String getTwitterUsername() {
    return twitterUsername;
  }

  public void setTwitterUsername(String twitterUsername) {
    this.twitterUsername = twitterUsername;
  }

  public MediumUser isWriterProgramEnrolled(Boolean isWriterProgramEnrolled) {
    this.isWriterProgramEnrolled = isWriterProgramEnrolled;
    return this;
  }

  /**
   * Get isWriterProgramEnrolled
   * @return isWriterProgramEnrolled
   */

  @JsonProperty("is_writer_program_enrolled")
  public Boolean getIsWriterProgramEnrolled() {
    return isWriterProgramEnrolled;
  }

  public void setIsWriterProgramEnrolled(Boolean isWriterProgramEnrolled) {
    this.isWriterProgramEnrolled = isWriterProgramEnrolled;
  }

  public MediumUser isSuspended(Boolean isSuspended) {
    this.isSuspended = isSuspended;
    return this;
  }

  /**
   * Get isSuspended
   * @return isSuspended
   */

  @JsonProperty("is_suspended")
  public Boolean getIsSuspended() {
    return isSuspended;
  }

  public void setIsSuspended(Boolean isSuspended) {
    this.isSuspended = isSuspended;
  }

  public MediumUser hasList(Boolean hasList) {
    this.hasList = hasList;
    return this;
  }

  /**
   * Get hasList
   * @return hasList
   */

  @JsonProperty("has_list")
  public Boolean getHasList() {
    return hasList;
  }

  public void setHasList(Boolean hasList) {
    this.hasList = hasList;
  }

  public MediumUser isBookAuthor(Boolean isBookAuthor) {
    this.isBookAuthor = isBookAuthor;
    return this;
  }

  /**
   * Get isBookAuthor
   * @return isBookAuthor
   */

  @JsonProperty("is_book_author")
  public Boolean getIsBookAuthor() {
    return isBookAuthor;
  }

  public void setIsBookAuthor(Boolean isBookAuthor) {
    this.isBookAuthor = isBookAuthor;
  }

  public MediumUser allowNotes(Boolean allowNotes) {
    this.allowNotes = allowNotes;
    return this;
  }

  /**
   * Get allowNotes
   * @return allowNotes
   */

  @JsonProperty("allow_notes")
  public Boolean getAllowNotes() {
    return allowNotes;
  }

  public void setAllowNotes(Boolean allowNotes) {
    this.allowNotes = allowNotes;
  }

  public MediumUser mediumMemberAt(String mediumMemberAt) {
    this.mediumMemberAt = mediumMemberAt;
    return this;
  }

  /**
   * Get mediumMemberAt
   * @return mediumMemberAt
   */

  @JsonProperty("medium_member_at")
  public String getMediumMemberAt() {
    return mediumMemberAt;
  }

  public void setMediumMemberAt(String mediumMemberAt) {
    this.mediumMemberAt = mediumMemberAt;
  }

  public MediumUser imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Get imageUrl
   * @return imageUrl
   */

  @JsonProperty("image_url")
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  public MediumUser logoImageUrl(String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
    return this;
  }

  /**
   * Get logoImageUrl
   * @return logoImageUrl
   */

  @JsonProperty("logo_image_url")
  public String getLogoImageUrl() {
    return logoImageUrl;
  }

  public void setLogoImageUrl(String logoImageUrl) {
    this.logoImageUrl = logoImageUrl;
  }

  public MediumUser bgImageUrl(String bgImageUrl) {
    this.bgImageUrl = bgImageUrl;
    return this;
  }

  /**
   * Get bgImageUrl
   * @return bgImageUrl
   */

  @JsonProperty("bg_image_url")
  public String getBgImageUrl() {
    return bgImageUrl;
  }

  public void setBgImageUrl(String bgImageUrl) {
    this.bgImageUrl = bgImageUrl;
  }

  public MediumUser tippingLink(String tippingLink) {
    this.tippingLink = tippingLink;
    return this;
  }

  /**
   * Get tippingLink
   * @return tippingLink
   */

  @JsonProperty("tipping_link")
  public String getTippingLink() {
    return tippingLink;
  }

  public void setTippingLink(String tippingLink) {
    this.tippingLink = tippingLink;
  }

}

