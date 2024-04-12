package com.mediumapi.client;

import com.mediumapi.apiclient.UserApi;
import com.mediumapi.domain.welcome.UserIdForUsernameGet200Response;
import com.mediumapi.domain.users.*;
import com.mediumapi.util.MediumApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link Controller}}.
 * Implement this interface with a {@link Service} annotated class.
 */
public interface UserApiClient {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/id_for/{username} : Get User ID
     * Returns the unique &#x60;user_id&#x60; for the given &#x60;username&#x60;.  **Note:** You can find the &#x60;username&#x60; from the user&#39;s/author&#39;s profile page URL.  - **username**.medium.com - medium.com/@**username** 
     *
     * @param username It&#39;s a unique string chosen by every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userIdForUsernameGet
     */
    default ResponseEntity<UserIdForUsernameGet200Response> userIdForUsernameGet(String username) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\" : \"1985b61817c3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /user/{user_id}/articles : Get User&#39;s Articles
     * Returns the list of articles (&#x60;article_ids&#x60;) written by the given user. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdArticlesGet
     */
    default ResponseEntity<MediumUserArticles> userUserIdArticlesGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"count\" : 5, \"associated_articles\" : [\"562c5821b5f0\", \"95f4919cc39c\", \"077229e514a3\", \"c9a4be35cb93\", \"05a740c035cc\"], \"id\" : \"1985b61817c3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /user/{user_id}/followers : Get User Followers
     * Returns the list of &#x60;user_ids&#x60; of the user&#39;s followers.  **Note:** When you get the response from the API, it will include an attribute called &#x60;next&#x60;.  You can use this next attribute as query string parameter (&#x60;after&#x60;) when you make your next API request.  This way, you can get the followers that come after the one you&#39;re currently looking at. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @param count To limit the number of results. (count &lt;&#x3D; 25) (optional)
     * @param after To get the results after a particular follower&#39;s user id. (optional)
     * @return OK (status code 200)
     * @see UserApi#userUserIdFollowersGet
     */
    default ResponseEntity<MediumUserFollowers> userUserIdFollowersGet(String userId, Integer count, String after) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"next\" : \"16759d70a68f\", \"total_followers\" : 721, \"followers\" : [\"14609d40b731\", \"148ae689f366\", \"14daabbff886\", \"150aaf6fae67\", \"1556eaf34b46\", \"157ac0b7fce4\", \"15f72b3c21f1\", \"160c3e933453\", \"162e5e73459a\", \"16759d70a68f\"], \"count\" : 10, \"id\" : \"1985b61817c3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /user/{user_id}/following : Get User Following
     * Returns a list of users (&#x60;user_ids&#x60;) that the given user is following.  Use the &#x60;count&#x60; query parameter (_optional_) to limit the number of results. (count &lt;&#x3D; 1500)  **Note:** This list does not contain the &#x60;publication_ids&#x60; of the publications that the user is following. To get those, please use _Get User Publication Following_ endpoint (&#x60;/user/{user_id}/publication_following&#x60;). 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @param count To limit the number of results. (count &lt; 1500) (optional)
     * @return OK (status code 200)
     * @see UserApi#userUserIdFollowingGet
     */
    default ResponseEntity<MediumUserFollowing> userUserIdFollowingGet(String userId, Integer count) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"following\" : [\"3340d9dd0981\", \"51e7eb466f57\", \"c0db304eefe1\", \"db7a1a122aa\", \"799bdc99a0fd\", \"3d91a45f0e94\", \"41f99c370629\", \"cfa71f272740\", \"4a142a63b9a0\", \"Infinity\"], \"id\" : \"14d5c41e0264\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /user/{user_id} : Get User Info
     * Returns user-related information such as their - Username - Full name - Bio - Followers count - Following count - Publication Following count - Twitter Username - Profile Image URL - Background Image URL - Logo Image URL - Tipping Link - List of tags in which the user is Top Writer - When did the user become a Medium Member (conditional) - Whether the user has Lists (boolean) - Whether the user is a Medium-verified book author (boolean) - Whether the user is enrolled in Medium Partner Program (boolean) - Whether the user has allowed notes on their articles (boolean) - Whether the user is suspended or not (boolean)  **Note:** If you don&#39;t know the &#x60;user_id&#x60;, you can get it from the _Get User ID_ endpoint (&#x60;/user/id_for/{username}&#x60;). 
     *
     * @param userId It&#39;s a unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdGet
     */
    default ResponseEntity<MediumUser> userUserIdGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"has_list\" : true, \"bg_image_url\" : \"https://miro.medium.com/1*5EKkWUnrRoveFz88dcWP4Q.png\", \"allow_notes\" : true, \"logo_image_url\" : \"https://miro.medium.com/1*jp6zL2GND2FnDy1WGZOdpQ.png\", \"image_url\" : \"https://miro.medium.com/1*C92Hx7k9nRM7TPlrmhgW9w.jpeg\", \"is_book_author\" : false, \"top_writer_in\" : [ \"programming\", \"programming\" ], \"twitter_username\" : \"one_anachronism\", \"bio\" : \"Obsessed with Tech Biz Arts & Words; Does NOT dumb down the writing; Skilled Wordsmith; Delivers the best\", \"is_suspended\" : false, \"publication_following_count\" : 2, \"medium_member_at\" : \"2020-06-24 16:05:46\", \"following_count\" : 4, \"is_writer_program_enrolled\" : true, \"followers_count\" : 450, \"id\" : \"1985b61817c3\", \"fullname\" : \"Nishu Jain\", \"tipping_link\" : \"https://www.paypal.com/paypalme/sanskarjain1997\", \"username\" : \"nishu-jain\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /user/{user_id}/interests : Get User&#39;s Interests
     * Returns a list of tags that the given user follows. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdInterestsGet
     */
    default ResponseEntity<MediumUserInterests> userUserIdInterestsGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"tags_followed\" : [\"software-engineering\", \"startup\", \"machine-learning\", \"data-science\", \"blockchain\"], \"count\" : 5, \"id\" : \"1985b61817c3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /user/{user_id}/lists : Get User&#39;s Lists
     * Returns an array of &#x60;list_ids&#x60; created by the user.  **Note:** You can check whether the use has created lists or not beforehand. Check the  &#x60;has_list&#x60; attribute in the \&quot;Article Info\&quot; endpoint. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdListsGet
     */
    default ResponseEntity<MediumUserLists> userUserIdListsGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"lists\" : [\"321cfd9966ec\", \"ba3904884898\", \"b8a117567230\", \"9516ed2145ae\", \"24356f9a9c6e\", \"e8b1c393bcff\", \"95b41261bee0\", \"4ecdbfd97d05\"], \"count\" : 8, \"id\" : \"5142451174a3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /user/{user_id}/publication_following : Get User Publication Following
     * Returns a list of publications (&#x60;publication_ids&#x60;) that the given user is following. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdPublicationFollowingGet
     */
    default ResponseEntity<MediumUserPublicationFollowing> userUserIdPublicationFollowingGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"publication_following\" : [\"aa36b7f642de\", \"b7e45b22fec3\"], \"count\" : 2, \"id\" : \"1985b61817c3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /user/{user_id}/publications : Get User&#39;s Publications
     * Returns 2 lists of &#x60;publication_ids&#x60; where the given user is either an admin (creator/editor) or a contributing writer. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdPublicationsGet
     */
    default ResponseEntity<MediumUserPublications> userUserIdPublicationsGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"id\": \"14d5c41e0264\", \"publications\": { \"admin_in\": [\"bff2346ccdf1\", \"df81adaf6236\", \"9830e436a84\", \"aec755e28853\", \"ac4c2146e2f\", \"a7d8d7c02da\", \"ab314b84960a\"], \"writer_in\": [\"6cb21729512d\", \"78d064101951\", \"7adf33e44ae3\", \"3f6ecf56618\", \"193b68bd4fba\", \"d3eff52d6f1c\", \"998e693d29cd\", \"40187e704f1c\", \"48e972f5c24e\", \"65d07f93c269\"] } }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /user/{user_id}/top_articles : Get User&#39;s Top Articles
     * Returns a list of &#x60;article_ids&#x60; of the top 10 articles on the user&#39;s profile, for a given &#x60;user_id&#x60;. 
     *
     * @param userId Unique hash id assigned to every single Medium user. (required)
     * @return OK (status code 200)
     * @see UserApi#userUserIdTopArticlesGet
     */
    default ResponseEntity<MediumUserTopArticles> userUserIdTopArticlesGet(String userId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"top_articles\": [\"562c5821b5f0\", \"95f4919cc39c\", \"077229e514a3\", \"c9a4be35cb93\", \"05a740c035cc\", \"23a287916d3f\", \"9263875a3649\", \"6c34414177bd\", \"9867ba29a923\", \"65a63626c04e\"], \"id\": \"1985b61817c3\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}