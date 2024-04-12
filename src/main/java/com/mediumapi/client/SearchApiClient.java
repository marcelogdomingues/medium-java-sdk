package com.mediumapi.client;

import com.mediumapi.apiclient.SearchApi;
import com.mediumapi.domain.search.MediumSearchArticles;
import com.mediumapi.domain.search.MediumSearchLists;
import com.mediumapi.domain.search.MediumSearchPublications;
import com.mediumapi.domain.search.MediumSearchTags;
import com.mediumapi.domain.search.MediumSearchUsers;
import com.mediumapi.util.MediumApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link Controller}}. Implement this interface
 * with a {@link Service} annotated class.
 */
public interface SearchApiClient {

  default Optional<NativeWebRequest> getRequest() {
    return Optional.empty();
  }

  /**
   * GET /search/articles : Search Articles Returns the list of
   * &#x60;articles_ids&#x60; for the given search query results. (Max Length
   * &#x3D; 1000)
   *
   * @param query
   *            Search query (required)
   * @return OK (status code 200)
   * @see SearchApi#searchArticlesGet
   */
  default ResponseEntity<MediumSearchArticles> searchArticlesGet(String query) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"search_query\": \"startup\", \"articles\": [\"fd455b524980\", \"e5b1c2d9631d\", \"b0d85289fdf5\", \"53d65a66fc45\", \"52d0d399982a\", \"5238a11278c4\", \"46a669a558f4\", \"0ac319330c7c\", \"8eb84ef2648f\", \"7b33f15631c1\"] }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /search/lists : Search Lists Returns an array of &#x60;list_ids&#x60; for
   * the given search query results. (Max Length &#x3D; 1000)
   *
   * @param query
   *            Search query (required)
   * @return OK (status code 200)
   * @see SearchApi#searchListsGet
   */
  default ResponseEntity<MediumSearchLists> searchListsGet(String query) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"search_query\": \"artificial intelligence\", \"lists\": [\"7d7c0a478325\", \"b11cb0d296b1\", \"a6fda516e19d\", \"7f8919c5a990\", \"1fa7000e1b8c\", \"5fca0efc3fd6\", \"382d702f48e8\", \"d6aeeb599bfb\", \"39db5ba09043\", \"0d0b755a5b2d\"] }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /search/publications : Search Publications Returns the list of
   * &#x60;publication_ids&#x60; for the given search query results. (Max Length
   * &#x3D; 1000)
   *
   * @param query
   *            Search query (required)
   * @return OK (status code 200)
   * @see SearchApi#searchPublicationsGet
   */
  default ResponseEntity<MediumSearchPublications> searchPublicationsGet(String query) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"search_query\": \"mental health\", \"publications\": [\"b224b324ef5\", \"de4b53c10bc7\", \"efea2976ffad\", \"2dedf1e9c066\", \"7debdac7d2c2\", \"d1c54e7b78e2\", \"14b51ced1b92\", \"4479ee3a8306\", \"6b598c326afa\", \"f1cb0af385f\"] }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /search/tags : Search Tags Returns a list of &#x60;tags&#x60; for the
   * given search query results. (Max Length &#x3D; 1000)
   *
   * @param query
   *            Search query (required)
   * @return OK (status code 200)
   * @see SearchApi#searchTagsGet
   */
  default ResponseEntity<MediumSearchTags> searchTagsGet(String query) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"search_query\": \"blockchain\", \"tags\": [\"blockchain\", \"blockchai̇n\", \"blockchain-technology\", \"blockchain-development\", \"blockchain-startup\", \"blockchain-game\", \"blockchain-gaming\", \"blockchain-application\", \"blockchain-security\", \"blockchain-news\"] }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /search/users : Search Users Returns a list of &#x60;user_ids&#x60; for
   * the given search query results. (Max Length &#x3D; 1000)
   *
   * @param query
   *            Search query (required)
   * @return OK (status code 200)
   * @see SearchApi#searchUsersGet
   */
  default ResponseEntity<MediumSearchUsers> searchUsersGet(String query) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"search_query\": \"data engineer\", \"users\": [\"1cdedc00c37b\", \"1bfba30bdef4\", \"de7c5a1b117c\", \"cd447042040e\", \"9e9176bf9645\", \"ecdc94046915\", \"589e227843c0\", \"bcee825b3d9c\", \"602d3a172ce8\", \"3489e9c7ed41\"] }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

}