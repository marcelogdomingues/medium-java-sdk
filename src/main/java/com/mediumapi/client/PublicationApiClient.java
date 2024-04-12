package com.mediumapi.client;

import com.mediumapi.apiclient.PublicationApi;
import com.mediumapi.domain.publication.MediumPublication;
import com.mediumapi.domain.publication.MediumPublicationArticles;
import com.mediumapi.domain.publication.MediumPublicationID;
import com.mediumapi.domain.publication.MediumPublicationNewsletter;
import com.mediumapi.util.MediumApiUtil;
import jakarta.annotation.Generated;
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
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface PublicationApiClient {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /publication/id_for/{publication_slug} : Get Publication ID
     * Returns the unique &#x60;publication_id&#x60; for the given &#x60;publication_slug&#x60;.  **Note:** You can find the &#x60;publication_slug&#x60; from the publication&#39;s homepage URL. - medium.com/_**publication_slug** 
     *
     * @param publicationSlug It&#39;s a lowercased hyphen-separated unique string alloted to each Medium Publication. (required)
     * @return OK (status code 200)
     * @see PublicationApi#publicationIdForPublicationSlugGet
     */
    default ResponseEntity<MediumPublicationID> publicationIdForPublicationSlugGet(String publicationSlug) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"publication_id\" : \"29038077e4c6\", \"publication_slug\" : \"codex\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /publication/{publication_id}/articles : Get Publication Articles
     * Returns the list of &#x60;articles_ids&#x60;, of the latest 25 articles, posted in that publication. 
     *
     * @param publicationId It&#39;s a unique hash id assigned to every Medium Publication. (required)
     * @param from To get the articles before specified date and time. (optional)
     * @return OK (status code 200)
     * @see PublicationApi#publicationPublicationIdArticlesGet
     */
    default ResponseEntity<MediumPublicationArticles> publicationPublicationIdArticlesGet(String publicationId, String from) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{\"publication_articles\": [\"638fb16c5092\", \"8100fa230c7d\", \"dafe61eabe34\", \"b22a38900f39\", \"5c2e28922659\", \"78d8ecab19c4\", \"52f352912025\", \"9bed21ed3432\", \"e4ccce6ab64b\", \"8009cad3c111\", \"bc63d4ada624\", \"af749790e33b\", \"c3fabbd0e00b\", \"d23a4c3ec0cd\", \"b830a1f9c9d5\", \"8c58a7c93ca0\", \"581d31dd625f\", \"b13dd00dc212\", \"763c88143560\", \"73b72c3b977a\", \"993a4acf3d97\", \"cfbff2388d04\", \"f853beb264f6\", \"50b605599b1b\", \"2c7327bf1928\"], \"publication_id\": \"98111c9905da\", \"from\": \"2022-08-13 03:08:16\", \"to\": \"2022-08-05 12:02:25\"}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * GET /publication/{publication_id} : Get Publication Info
     * Returns the publication related information such as *Publication name, Tagline, Description, Tags, Followers Count, Twitter username, Instagram username, Facebook Page name, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;. 
     *
     * @param publicationId It&#39;s a unique hash id assigned to every Medium Publication. (required)
     * @return OK (status code 200)
     * @see PublicationApi#publicationPublicationIdGet
     */
    default ResponseEntity<MediumPublication> publicationPublicationIdGet(String publicationId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"creator\" : \"8a819983d566\", \"twitter_username\" : \"towards_AI\", \"description\" : \"Towards AI is the world's leading AI and technology publication. Publishing unbiased AI and technology-related articles. Read by thought-leaders and decision-makers around the world.\", \"url\" : \"pub.towardsai.net\", \"tags\" : [ \"ARTIFICIAL INTELLIGENCE\", \"ARTIFICIAL INTELLIGENCE\" ], \"followers\" : 25260, \"facebook_pagename\" : \"towardsAl\", \"name\" : \"Towards AI\", \"tagline\" : \"The World's Leading AI and Technology Publication\", \"id\" : \"98111c9905da\", \"instagram_username\" : \"towards_ai\", \"slug\" : \"towards-artificial-intelligence\", \"editors\" : [ \"aea8a19ea239\", \"aea8a19ea239\" ] }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /publication/{publication_id}/newsletter : Get Publication Newsletter
     * Returns the newsletter related information such as *id, name, description, slug, creator_id, subscribers, image_url, etc …*  **Note:** If you don&#39;t know the &#x60;publication_id&#x60;, you can get it from any article published by it. Use endpoint \&quot;/article/{article_id}\&quot; to retrieve the &#x60;publication_id&#x60;. 
     *
     * @param publicationId It&#39;s a unique hash id assigned to every Medium Publication. (required)
     * @return OK (status code 200)
     * @see PublicationApi#publicationPublicationIdNewsletterGet
     */
    default ResponseEntity<MediumPublicationNewsletter> publicationPublicationIdNewsletterGet(String publicationId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"image\" : \"https://miro.medium.com/1*j2OVd7j2o2FHeE7T8TzpXw.png\", \"subscribers\" : 6752, \"name\" : \"This AI newsletter is all you need\", \"creator_id\" : \"aea8a19ea239\", \"description\" : \"We have moved our newsletter. Subscribe → https://ws.towardsai.net/subscribe\", \"id\" : \"d710a73cd042\", \"slug\" : \"this-ai-newsletter-is-all-you-need\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
