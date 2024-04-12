package com.mediumapi.client;

import com.mediumapi.apiclient.PlatformApi;
import com.mediumapi.domain.platform.MediumPlatformLatestPosts;
import com.mediumapi.domain.platform.MediumPlatformRecommendedFeed;
import com.mediumapi.domain.platform.MediumPlatformRelatedTags;
import com.mediumapi.domain.platform.MediumPlatformTag;
import com.mediumapi.domain.platform.MediumPlatformTopWriters;
import com.mediumapi.domain.platform.MediumPlatformTopfeeds;
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
public interface PlatformApiClient {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /latestposts/{topic_slug} : Get Latest Posts
     * Returns a list of latest posts (&#x60;article_ids&#x60;) for a topic/niche (as classified by the Medium platform). Example of a topic/niche can be: * blockchain * relationships * mental-health, etc … These are known as &#x60;topic_slugs&#x60;. At any given moment, this endpoint will return a list of 25 articles (&#x60;article_ids&#x60;). 
     *
     * @param topicSlug It&#39;s a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium. (required)
     * @return OK (status code 200)
     * @see PlatformApi#latestpostsTopicSlugGet
     */
    default ResponseEntity<MediumPlatformLatestPosts> latestpostsTopicSlugGet(String topicSlug) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{\"latest_posts\": [\"743b229b9b80\", \"48a08afafdcc\", \"284009a2e941\", \"9351fd40340e\", \"8a48250702f7\", \"78ed78f16362\", \"434687e795c6\", \"a51cbcffc4e2\", \"e125f9d62f2f\", \"ca84ac87a0bf\", \"4e2161787934\", \"d277be4453f4\", \"bfa982ef9a7f\", \"64bc45d49931\", \"8b7d1c46d849\", \"b63e8f8a6798\", \"cd389ec40e17\", \"7ed4c9ac8512\", \"a4713fa815c9\", \"afd1ad23fa5e\", \"4cec3f13895a\", \"24a6562a875c\", \"275060016663\", \"e3d799eaf913\", \"7e0c28d4f682\"]}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /recommended_feed/{tag} : Get Recommended Feed
     * Returns a list of recommended articles (&#x60;article_ids&#x60;) for the given &#x60;tag&#x60;.  This feed is similar to Topfeeds Trending Articles. Using the &#x60;page&#x60; query string parameter, you can get the list page by page.  The page number can be between 1 and 20. Each page will have up to 25 Article IDs. So at maximum, you can fetch 500 &#x60;article_ids&#x60; in 20 API calls. 
     *
     * @param tag It&#39;s a unique string, usually hyphen-separated, representing a class of content. (required)
     * @param page A number between 1 and 20. (optional)
     * @return OK (status code 200)
     * @see PlatformApi#recommendedFeedTagGet
     */
    default ResponseEntity<MediumPlatformRecommendedFeed> recommendedFeedTagGet(String tag, Integer page) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{\"count\": 25, \"recommended_feed\": [\"d99f4a35ff4f\", \"53affbd9c728\", \"d1ffb9d9f042\", \"28aefb495657\", \"d8b3b04538cf\", \"02dd62cd4bda\", \"2919236a6082\", \"593a332dd08d\", \"29e23f371ddd\", \"27add4c8536d\", \"d31587158f34\", \"4ca1c6ce3eb9\", \"6ca2d70f7a62\", \"6fc97b93dc9a\", \"d63c736cccef\", \"a682d1adf4e8\", \"a37d66716d57\", \"d449463078b2\", \"b2a545f39ad5\", \"dcab44048ebb\", \"c41407efe59b\", \"ef0358634c1b\", \"bddb73ef62ff\", \"4de1464a9930\", \"e8b71b1c169b\"], \"tag\": \"data-science\", \"page\": 1}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /related_tags/{tag} : Get Related Tags
     * Returns a list of &#x60;related_tags&#x60; for the given &#x60;tag&#x60;. 
     *
     * @param tag It&#39;s a unique string, usually hyphen-separated, representing a class of content. (required)
     * @return OK (status code 200)
     * @see PlatformApi#relatedTagsTagGet
     */
    default ResponseEntity<MediumPlatformRelatedTags> relatedTagsTagGet(String tag) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{\"related_tags\": [\"cryptocurrency\", \"bitcoin\", \"crypto\", \"ethereum\", \"technology\", \"defi\", \"nft\", \"web3\", \"money\"], \"given_tag\": \"blockchain\"}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /tag/{tag} : Get Tag Info
     * Returns tag-related information. - Name - Followers Count - Number of stories - Number of writers - Number of latest stories - Number of latest writers 
     *
     * @param tag It&#39;s a unique string, usually hyphen-separated, representing a class of content. (required)
     * @return OK (status code 200)
     * @see PlatformApi#tagTagGet
     */
    default ResponseEntity<MediumPlatformTag> tagTagGet(String tag) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"followers\" : 1581563, \"latest_authors_count\" : 296, \"articles_count\" : 234250, \"authors_count\" : 87802, \"name\" : \"Artificial Intelligence\", \"tag\" : \"artificial-intelligence\", \"latest_articles_count\" : 483 }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /top_writers/{topic_slug} : Get Top Writers
     * Returns a list of top writers (&#x60;user_ids&#x60;) within a particular topic/niche (&#x60;topic_slug&#x60;).  e.g.  - blockchain - relationships - artificial-intelligence, etc ... **Note:** You can use optional &#x60;count&#x60; query parameter to limit the number of results.  The maximum number of top writers within a topic/niche will be 250. 
     *
     * @param topicSlug It&#39;s a unique string, usually hyphen-separated, representing a topic/niche, as classified by Medium. (required)
     * @param count Limits the number of &#x60;article_ids&#x60; in the result. (optional)
     * @return OK (status code 200)
     * @see PlatformApi#topWritersTopicSlugGet
     */
    default ResponseEntity<MediumPlatformTopWriters> topWritersTopicSlugGet(String topicSlug, Integer count) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"top_writers\": [\"37a2cbe8bd15\", \"9b351e8113e9\", \"8c8e5b7182ef\", \"b0fbe613be9d\", \"e43895122f94\", \"14176fcb5743\", \"fb7a5e85e951\", \"76398be9016\", \"fb44e21903f3\", \"c4a298b66f16\"] }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /topfeeds/{tag}/{mode} : Get Topfeeds
     * Returns a list of &#x60;article_ids&#x60; (length: 25) for the given &#x60;tag&#x60; and &#x60;mode&#x60;. 
     *
     * @param tag It&#39;s a unique string, usually hyphen-separated, representing a class of content. (required)
     * @param mode Mode:   - &#x60;hot&#x60; : For getting trending articles   - &#x60;new&#x60; : For getting latest articles   - &#x60;top_year&#x60; : For getting best articles of the year   - &#x60;top_month&#x60; : For getting best articles of the month   - &#x60;top_week&#x60; : For getting best articles of the week   - &#x60;top_all_time&#x60;: For getting best article of all time  (required)
     * @return OK (status code 200)
     * @see PlatformApi#topfeedsTagModeGet
     */
    default ResponseEntity<MediumPlatformTopfeeds> topfeedsTagModeGet(String tag, String mode) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"mode\": \"NEW\", \"topfeeds\": [\"bf49caa30c3b\", \"ff6d1d1f9570\", \"a02226fe86af\", \"baa85c10ac58\", \"8179180bc349\", \"fa27f64443ce\", \"c73786e6aa76\", \"ebfb35d80d31\", \"0b678210431d\", \"1da5001ed444\", \"3002a9f32abf\", \"14478e4e548b\", \"c25f1b3f5682\", \"8853184eb60c\", \"d59f2ea14ce4\", \"de7469608483\", \"2cbb5b268b76\", \"313d225bbf3f\", \"6b6902e66043\", \"8054b797de64\", \"05d01f5e3ed0\", \"c8285b6d45ba\", \"0ac7c96965b6\", \"721dfecb9c00\"], \"count\": 25, \"tag\": \"data-science\"}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


}
