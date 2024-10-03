# Search
(*search()*)

## Overview

API Calls that perform search operations with Plex Media Server


### Available Operations

* [performSearch](#performsearch) - Perform a search
* [performVoiceSearch](#performvoicesearch) - Perform a voice search
* [getSearchResults](#getsearchresults) - Get Search Results

## performSearch

This endpoint performs a search across all library sections, or a single section, and returns matches as hubs, split up by type. It performs spell checking, looks for partial matches, and orders the hubs based on quality of results. In addition, based on matches, it will return other related matches (e.g. for a genre match, it may return movies in that genre, or for an actor match, movies with that actor).

In the response's items, the following extra attributes are returned to further describe or disambiguate the result:

- `reason`: The reason for the result, if not because of a direct search term match; can be either:
  - `section`: There are multiple identical results from different sections.
  - `originalTitle`: There was a search term match from the original title field (sometimes those can be very different or in a foreign language).
  - `<hub identifier>`: If the reason for the result is due to a result in another hub, the source hub identifier is returned. For example, if the search is for "dylan" then Bob Dylan may be returned as an artist result, an a few of his albums returned as album results with a reason code of `artist` (the identifier of that particular hub). Or if the search is for "arnold", there might be movie results returned with a reason of `actor`
- `reasonTitle`: The string associated with the reason code. For a section reason, it'll be the section name; For a hub identifier, it'll be a string associated with the match (e.g. `Arnold Schwarzenegger` for movies which were returned because the search was for "arnold").
- `reasonID`: The ID of the item associated with the reason for the result. This might be a section ID, a tag ID, an artist ID, or a show ID.

This request is intended to be very fast, and called as the user types.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.PerformSearchBadRequest;
import dev.plexapi.sdk.models.errors.PerformSearchUnauthorized;
import dev.plexapi.sdk.models.operations.PerformSearchResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PerformSearchBadRequest, PerformSearchUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        PerformSearchResponse res = sdk.search().performSearch()
                .query("dylan")
                .sectionId(9372.69d)
                .limit(5d)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `query`                                                                               | *String*                                                                              | :heavy_check_mark:                                                                    | The query term                                                                        | arnold                                                                                |
| `sectionId`                                                                           | *Optional<Double>*                                                                    | :heavy_minus_sign:                                                                    | This gives context to the search, and can result in re-ordering of search result hubs |                                                                                       |
| `limit`                                                                               | *Optional<Double>*                                                                    | :heavy_minus_sign:                                                                    | The number of items to return per hub                                                 | 5                                                                                     |

### Response

**[PerformSearchResponse](../../models/operations/PerformSearchResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/PerformSearchBadRequest   | 400                                     | application/json                        |
| models/errors/PerformSearchUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |

## performVoiceSearch

This endpoint performs a search specifically tailored towards voice or other imprecise input which may work badly with the substring and spell-checking heuristics used by the `/hubs/search` endpoint. 
It uses a [Levenshtein distance](https://en.wikipedia.org/wiki/Levenshtein_distance) heuristic to search titles, and as such is much slower than the other search endpoint. 
Whenever possible, clients should limit the search to the appropriate type. 
Results, as well as their containing per-type hubs, contain a `distance` attribute which can be used to judge result quality.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.PerformVoiceSearchBadRequest;
import dev.plexapi.sdk.models.errors.PerformVoiceSearchUnauthorized;
import dev.plexapi.sdk.models.operations.PerformVoiceSearchResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PerformVoiceSearchBadRequest, PerformVoiceSearchUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        PerformVoiceSearchResponse res = sdk.search().performVoiceSearch()
                .query("dead+poop")
                .sectionId(4094.80d)
                .limit(5d)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           | Example                                                                               |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `query`                                                                               | *String*                                                                              | :heavy_check_mark:                                                                    | The query term                                                                        | dead+poop                                                                             |
| `sectionId`                                                                           | *Optional<Double>*                                                                    | :heavy_minus_sign:                                                                    | This gives context to the search, and can result in re-ordering of search result hubs |                                                                                       |
| `limit`                                                                               | *Optional<Double>*                                                                    | :heavy_minus_sign:                                                                    | The number of items to return per hub                                                 | 5                                                                                     |

### Response

**[PerformVoiceSearchResponse](../../models/operations/PerformVoiceSearchResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/PerformVoiceSearchBadRequest   | 400                                          | application/json                             |
| models/errors/PerformVoiceSearchUnauthorized | 401                                          | application/json                             |
| models/errors/SDKError                       | 4XX, 5XX                                     | \*/\*                                        |

## getSearchResults

This will search the database for the string provided.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetSearchResultsBadRequest;
import dev.plexapi.sdk.models.errors.GetSearchResultsUnauthorized;
import dev.plexapi.sdk.models.operations.GetSearchResultsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetSearchResultsBadRequest, GetSearchResultsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        GetSearchResultsResponse res = sdk.search().getSearchResults()
                .query("110")
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    | Example                        |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `query`                        | *String*                       | :heavy_check_mark:             | The search query string to use | 110                            |

### Response

**[GetSearchResultsResponse](../../models/operations/GetSearchResultsResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetSearchResultsBadRequest   | 400                                        | application/json                           |
| models/errors/GetSearchResultsUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |