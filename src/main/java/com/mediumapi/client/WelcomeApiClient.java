package com.mediumapi.client;

import com.mediumapi.apiclient.WelcomeApi;
import com.mediumapi.domain.welcome.Get200Response;
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
public interface WelcomeApiClient {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET / : Get Welcome
     * **Test Endpoint** Returns the information about the Unofficial Medium API 
     *
     * @return OK (status code 200)
     * @see WelcomeApi#rootGet
     */
    default ResponseEntity<Get200Response> rootGet() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"website\" : \"https://mediumapi.com\", \"twitter\" : \"https://twitter.com/medium_api\", \"documentation\" : \"https://docs.mediumapi.com\", \"name\" : \"Unofficial Medium API\", \"developer\" : \"Nishu Jain\", \"linkedin\" : \"https://www.linkedin.com/company/medium-api\", \"email\" : \"nishu@mediumapi.com\" }";
                    MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
