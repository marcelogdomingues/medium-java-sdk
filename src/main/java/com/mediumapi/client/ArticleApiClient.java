package com.mediumapi.client;

import com.mediumapi.apiclient.ArticleApi;
import com.mediumapi.domain.article.MediumArticle;
import com.mediumapi.domain.article.MediumArticleAssets;
import com.mediumapi.domain.article.MediumArticleContent;
import com.mediumapi.domain.article.MediumArticleFans;
import com.mediumapi.domain.article.MediumArticleHTML;
import com.mediumapi.domain.article.MediumArticleMarkdown;
import com.mediumapi.domain.article.MediumArticleRecommended;
import com.mediumapi.domain.article.MediumArticleRelated;
import com.mediumapi.domain.article.MediumArticleResponses;
import com.mediumapi.util.MediumApiUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.Optional;

/**
 * A delegate to be called by the {@link Controller}}. Implement this interface
 * with a {@link org.springframework.stereotype.Service} annotated class.
 */
public interface ArticleApiClient {

  default Optional<NativeWebRequest> getRequest() {
    return Optional.empty();
  }

  /**
   * GET /article/{article_id}/assets : Get Article Assets Returns a list of URLs
   * for the assets present in the Medium Article. These assets may include
   * images, embedded YouTube videos, Github Gists, Hyperlinks (anchors), Links to
   * other Medium Articles, etc…
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdAssetsGet
   */
  default ResponseEntity<MediumArticleAssets> articleArticleIdAssetsGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"assets\": {\"youtube\": [{\"description\": \"Mathematics of Music - 'Twinkle Twinkle Little Star' Synthesized using Python (Numpy and Scipy) Full article at my profile: https://medium.com/@nishu_jain\", \"href\": \"https://www.youtube.com/watch?v=IH2nqc8B0Bg\", \"title\": \"Mathematics of Music - 1\"}], \"images\": [\"https://miro.medium.com/1*aNnZHUx6H1A5QbEJtK6lmA.png\"], \"other_embeds\": [{\"href\": \"https://example.com/somepage.html\", \"title\": \"Title of some other webpage\"}], \"github_gists\": [\"https://gist.github.com/weeping-angel/9f4b84244b9752ea3bca6a7bb1997a65.js\"], \"anchors\": [{\"text\": \"repo\", \"href\": \"https://github.com/weeping-angel/Mathematics-of-Music\"}]}}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id}/content : Get Article&#39;s Content Returns the
   * content of an article for the given &#x60;article_id&#x60;.
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdContentGet
   */
  default ResponseEntity<MediumArticleContent> articleArticleIdContentGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"id\": \"562c5821b5f0\", \"content\": \"Article title\\nArticle Subtitle\\nArticle Content\\n\"}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id}/fans : Get Article Fans Returns a list of
   * &#x60;user_ids&#x60; of the people who clapped on the article (a.k.a
   * &#x60;voters&#x60;).
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdFansGet
   */
  default ResponseEntity<MediumArticleFans> articleArticleIdFansGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"voters\": [\"def64349b55f\", \"dfd0edd2cde5\", \"263f0e59ea39\", \"fdaa0a92e5b9\", \"6b775dd37806\", \"c84d0210fb0b\"], \"count\": 6, \"id\": \"67fa62fc1971\"}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id} : Get Article Info Returns article-related
   * information such as - Title - Subtitle - Author (ID) - Tags - Topics
   * (assigned by Medium) - Publication (ID) - Published date and time - Last
   * Modified date and time - Clap Count - Voter Count - Word Count - Response
   * Count - Reading Time - Language - Unique Slug - URL - Image URL (Cover image)
   * - Top Highlight - Whether the article is in a series or not (boolean) -
   * Whether the article is a shortform or not (boolean) - Whether the article is
   * locked or not (boolean)
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdGet
   */
  default ResponseEntity<MediumArticle> articleArticleIdGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"is_locked\": true, \"reading_time\": 4.874528301886793, \"responses_count\": 6, \"voters\": 141, \"author\": \"1985b61817c3\", \"topics\": [\"machine-learning\", \"machine-learning\"], \"is_series\": false, \"image_url\": \"https://miro.medium.com/1*Ot1HMgLOe8GhwX1Knlx96g.png\", \"is_shortform\": false, \"title\": \"Why it's Super Hard to be an ML Researcher or Developer?\", \"url\": \"https://pub.towardsai.net/why-its-super-hard-to-be-an-ml-researcher-or-developer-67fa62fc1971\", \"tags\": [\"data-science\", \"data-science\"], \"last_modified_at\": \"2023-06-20 06:37:11\", \"publication_id\": \"98111c9905da\", \"top_highlight\": \"Give me six hours to chop down a tree and I will spend the first four sharpening the axe - Abraham Lincoln\", \"word_count\": 1146, \"unique_slug\": \"why-its-super-hard-to-be-an-ml-researcher-or-developer-67fa62fc1971\", \"subtitle\": \"A Realization that Literally Changed my Life\", \"id\": \"67fa62fc1971\", \"lang\": \"en\", \"published_at\": \"2020-10-28 21:01:06\", \"claps\": 603 }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id}/html : Get Article&#39;s HTML Returns the **plain
   * HTML** of a Medium Article, for the given &#x60;article_id&#x60;. **Note:**
   * This plain HTML output can be stylized as per your own custom branding. For
   * the sample CSS, visit: \&quot;https://mediumapi.com/styles/dark.css\&quot;
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @param fullpage
   *            If &#39;true&#39;, returns full HTML page with head, body, title
   *            and meta tags. Else, returns HTML inside body only. (optional)
   * @param styleFile
   *            Name or link to a CSS file to be included in the HTML. It works
   *            when &#x60;fullpage&#x60; is true. (optional)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdHtmlGet
   */
  default ResponseEntity<MediumArticleHTML> articleArticleIdHtmlGet(String articleId, Boolean fullpage,
      String styleFile) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"html\": \"<div class=\\\"blog\\\">\\n <h1 id=\\\"abcd\\\">Article Title</h1>\\n <p>This is a <b>paragraph</b></p>\\n <img src=\\\"https://example.com/img.png\\\" alt=\\\"Image caption\\\" />\\n</div>\", \"id\": \"ff6369938b63\"}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id}/markdown : Get Article&#39;s Markdown Returns the
   * markdown of a Medium Article/Story, for the given &#x60;article_id&#x60;
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdMarkdownGet
   */
  default ResponseEntity<MediumArticleMarkdown> articleArticleIdMarkdownGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{ \"markdown\" : \"# Article title\n## Article Subtitle\nArticle **Content** with lot of _markups_ ....\n![Images Alt](Image URL)\n\", \"id\" : \"67fa62fc1971\" }";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

  }

  /**
   * GET /article/{article_id}/recommended : Get Recommended Articles Returns a
   * list of 10 articles (&#x60;article_ids&#x60;) as recommended by the Medium,
   * for the given article.
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdRecommendedGet
   */
  default ResponseEntity<MediumArticleRecommended> articleArticleIdRecommendedGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"recommended_articles\": [\"dd44714e619a\", \"cd14232a781c\", \"87a8f8c10d92\", \"f5f7bd88a144\", \"973775246425\", \"7dd26fb5282c\", \"cad364e668db\", \"ff3010db542f\", \"e10d7d5b83a6\", \"99b5311986c7\"], \"id\": \"67fa62fc1971\"}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id}/related : Get Related Articles Returns a list of
   * &#x60;article_ids&#x60; of the related posts. (Length &#x3D; 4)
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdRelatedGet
   */
  default ResponseEntity<MediumArticleRelated> articleArticleIdRelatedGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"related_articles\": [\"edab6cac5c80\", \"b84ae866344e\", \"2064db6fed98\", \"9d376e28bb1e\"], \"id\": \"67fa62fc1971\"}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

  /**
   * GET /article/{article_id}/responses : Get Article Responses Returns a list of
   * responses (&#x60;response_ids&#x60;, same as &#x60;article_ids&#x60;) for a
   * given article (&#x60;article_id&#x60;) **Note:** To see the content of the
   * response, use the _Get Article&#39;s Content_ endpoint
   * (&#x60;/article/{article_id}/content&#x60;)
   *
   * @param articleId
   *            It&#39;s a unique hash id assigned to every Medium Article.
   *            (required)
   * @return OK (status code 200)
   * @see ArticleApi#articleArticleIdResponsesGet
   */
  default ResponseEntity<MediumArticleResponses> articleArticleIdResponsesGet(String articleId) {
    getRequest().ifPresent(request -> {
      for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
        if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
          String exampleString = "{\"count\": 6, \"responses\": [\"a9bbc22aa1e6\", \"3308e927204a\", \"b1fcf9f36d87\", \"295b0938fd49\", \"cc14e813995a\", \"649b48584efb\"], \"id\": \"67fa62fc1971\"}";
          MediumApiUtil.setExampleResponse(request, "application/json", exampleString);
          break;
        }
      }
    });
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }

}
