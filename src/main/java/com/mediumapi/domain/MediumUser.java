package com.mediumapi.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Returns the user related information such as *id, username, fullname, bio,
 * top_writer_in, followers_count, following_count, publication_following_count,
 * twitter_username, is_writer_program_enrolled, is_suspended, has_list,
 * is_book_author, allow_notes, medium_member_at, image_url, logo_image_url,
 * bg_image_url, tipping_link*.
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

}
