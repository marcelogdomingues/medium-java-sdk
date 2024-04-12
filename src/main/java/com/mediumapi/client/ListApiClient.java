package com.mediumapi.client;

import com.mediumapi.apiclient.ListApi;
import com.mediumapi.domain.list.MediumList;
import com.mediumapi.domain.list.MediumListArticles;
import com.mediumapi.domain.list.MediumListResponses;
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
public interface ListApiClient {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /list/{list_id}/articles : Get List Articles
     * Returns an array of &#x60;articles_ids&#x60; present in the given Medium List. 
     *
     * @param listId It&#39;s a unique hash id assigned to every Medium List. (required)
     * @return OK (status code 200)
     * @see ListApi#listListIdArticlesGet
     */
    default ResponseEntity<MediumListArticles> listListIdArticlesGet(String listId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{\"list_articles\": [\"e7240190382c\", \"d595c8c221da\", \"56fe247feb16\", \"5ac9f5f82ffd\", \"dd2cf884546b\", \"8ff906d16c03\", \"2e28ed05036f\", \"44edefd43f09\", \"0e6c2f374410\", \"fcc740792175\"], \"count\": 10, \"id\": \"3d8f744f5370\"}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    /**
     * GET /list/{list_id} : Get List Info
     * Returns the list-related information such as *id, name, author, description,  thumbnail image url, creation datetime, last article inserted datetime,  number of articles in the list, claps, voters, and comments/responses*. 
     *
     * @param listId It&#39;s a unique hash id assigned to every Medium List. (required)
     * @return OK (status code 200)
     * @see ListApi#listListIdGet
     */
    default ResponseEntity<MediumList> listListIdGet(String listId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"last_item_inserted_at\" : \"2023-03-12 06:53:02\", \"thumbnail\" : \"https://miro.medium.com/0*8f634a2860234802375db89fbfcccb5cc717f3fd.jpeg\", \"responses_count\" : 1, \"voters\" : 1, \"author\" : \"1985b61817c3\", \"name\" : \"Medium API\", \"count\" : 18, \"description\" : \"Collections of all the articles and resources related to Medium API\", \"created_at\" : \"2023-03-12 06:46:46\", \"id\" : \"38f9e0f9bea6\", \"claps\" : 48 }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /list/{list_id}/responses : Get List Responses
     * Returns an array of &#x60;response_ids&#x60; of the comments (same as &#x60;article_ids&#x60;) on the given Medium List. 
     *
     * @param listId It&#39;s a unique hash id assigned to every Medium List. (required)
     * @return OK (status code 200)
     * @see ListApi#listListIdResponsesGet
     */
    default ResponseEntity<MediumListResponses> listListIdResponsesGet(String listId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{\"count\": 2, \"responses\": [\"f31a257b42e8\", \"a62b717bca13\"], \"id\": \"3d8f744f5370\"}";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
}