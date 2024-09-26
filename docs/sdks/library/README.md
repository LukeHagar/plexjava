# Library
(*library()*)

## Overview

API Calls interacting with Plex Media Server Libraries


### Available Operations

* [getFileHash](#getfilehash) - Get Hash Value
* [getRecentlyAddedLibrary](#getrecentlyaddedlibrary) - Get Recently Added
* [getAllLibraries](#getalllibraries) - Get All Libraries
* [getLibraryDetails](#getlibrarydetails) - Get Library Details
* [deleteLibrary](#deletelibrary) - Delete Library Section
* [getLibraryItems](#getlibraryitems) - Get Library Items
* [getRefreshLibraryMetadata](#getrefreshlibrarymetadata) - Refresh Metadata Of The Library
* [getSearchLibrary](#getsearchlibrary) - Search Library
* [getMetaDataByRatingKey](#getmetadatabyratingkey) - Get Metadata by RatingKey
* [getMetadataChildren](#getmetadatachildren) - Get Items Children
* [getTopWatchedContent](#gettopwatchedcontent) - Get Top Watched Content
* [getOnDeck](#getondeck) - Get On Deck

## getFileHash

This resource returns hash values for local files

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetFileHashBadRequest;
import dev.plexapi.sdk.models.errors.GetFileHashUnauthorized;
import dev.plexapi.sdk.models.operations.GetFileHashResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetFileHashBadRequest, GetFileHashUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetFileHashResponse res = sdk.library().getFileHash()
                .url("file://C:\Image.png&type=13")
                .type(4462.17d)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `url`                                                             | *String*                                                          | :heavy_check_mark:                                                | This is the path to the local file, must be prefixed by `file://` | file://C:\Image.png&type=13                                       |
| `type`                                                            | *Optional<Double>*                                                | :heavy_minus_sign:                                                | Item type                                                         |                                                                   |

### Response

**[GetFileHashResponse](../../models/operations/GetFileHashResponse.md)**

### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetFileHashBadRequest   | 400                                   | application/json                      |
| models/errors/GetFileHashUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | \*\/*                                 |


## getRecentlyAddedLibrary

This endpoint will return the recently added content.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetRecentlyAddedLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetRecentlyAddedLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.GetRecentlyAddedLibraryRequest;
import dev.plexapi.sdk.models.operations.GetRecentlyAddedLibraryResponse;
import dev.plexapi.sdk.models.operations.QueryParamIncludeMeta;
import dev.plexapi.sdk.models.operations.QueryParamType;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GetRecentlyAddedLibraryBadRequest, GetRecentlyAddedLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetRecentlyAddedLibraryRequest req = GetRecentlyAddedLibraryRequest.builder()
                .type(QueryParamType.TvShow)
                .contentDirectoryID(2L)
                .pinnedContentDirectoryID(List.of(
                    3L,
                    5L,
                    7L,
                    13L,
                    12L,
                    1L,
                    6L,
                    14L,
                    2L,
                    10L,
                    16L,
                    17L))
                .sectionID(2L)
                .includeMeta(QueryParamIncludeMeta.Enable)
                .xPlexContainerStart(0)
                .xPlexContainerSize(50)
                .build();

        GetRecentlyAddedLibraryResponse res = sdk.library().getRecentlyAddedLibrary()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetRecentlyAddedLibraryRequest](../../models/operations/GetRecentlyAddedLibraryRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetRecentlyAddedLibraryResponse](../../models/operations/GetRecentlyAddedLibraryResponse.md)**

### Errors

| Error Object                                      | Status Code                                       | Content Type                                      |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| models/errors/GetRecentlyAddedLibraryBadRequest   | 400                                               | application/json                                  |
| models/errors/GetRecentlyAddedLibraryUnauthorized | 401                                               | application/json                                  |
| models/errors/SDKError                            | 4xx-5xx                                           | \*\/*                                             |


## getAllLibraries

A library section (commonly referred to as just a library) is a collection of media. 
Libraries are typed, and depending on their type provide either a flat or a hierarchical view of the media. 
For example, a music library has an artist > albums > tracks structure, whereas a movie library is flat.

Libraries have features beyond just being a collection of media; for starters, they include information about supported types, filters and sorts. 
This allows a client to provide a rich interface around the media (e.g. allow sorting movies by release year).


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetAllLibrariesBadRequest;
import dev.plexapi.sdk.models.errors.GetAllLibrariesUnauthorized;
import dev.plexapi.sdk.models.operations.GetAllLibrariesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetAllLibrariesBadRequest, GetAllLibrariesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetAllLibrariesResponse res = sdk.library().getAllLibraries()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetAllLibrariesResponse](../../models/operations/GetAllLibrariesResponse.md)**

### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetAllLibrariesBadRequest   | 400                                       | application/json                          |
| models/errors/GetAllLibrariesUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |


## getLibraryDetails

## Library Details Endpoint

This endpoint provides comprehensive details about the library, focusing on organizational aspects rather than the content itself.   

The details include:

### Directories
Organized into three categories:

- **Primary Directories**: 
  - Used in some clients for quick access to media subsets (e.g., "All", "On Deck").
  - Most can be replicated via media queries.
  - Customizable by users.

- **Secondary Directories**:
  - Marked with `secondary="1"`.
  - Used in older clients for structured navigation.

- **Special Directories**:
  - Includes a "By Folder" entry for filesystem-based browsing.
  - Contains an obsolete `search="1"` entry for on-the-fly search dialog creation.

### Types
Each type in the library comes with a set of filters and sorts, aiding in building dynamic media controls:

- **Type Object Attributes**:
  - `key`: Endpoint for the media list of this type.
  - `type`: Metadata type (if standard Plex type).
  - `title`: Title for this content type (e.g., "Movies").

- **Filter Objects**:
  - Subset of the media query language.
  - Attributes include `filter` (name), `filterType` (data type), `key` (endpoint for value range), and `title`.

- **Sort Objects**:
  - Description of sort fields.
  - Attributes include `defaultDirection` (asc/desc), `descKey` and `key` (sort parameters), and `title`.

> **Note**: Filters and sorts are optional; without them, no filtering controls are rendered.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetLibraryDetailsBadRequest;
import dev.plexapi.sdk.models.errors.GetLibraryDetailsUnauthorized;
import dev.plexapi.sdk.models.operations.GetLibraryDetailsResponse;
import dev.plexapi.sdk.models.operations.IncludeDetails;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetLibraryDetailsBadRequest, GetLibraryDetailsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetLibraryDetailsResponse res = sdk.library().getLibraryDetails()
                .sectionKey(9518)
                .includeDetails(IncludeDetails.ZERO)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                  | Type                                                                                                                                                                                       | Required                                                                                                                                                                                   | Description                                                                                                                                                                                | Example                                                                                                                                                                                    |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `sectionKey`                                                                                                                                                                               | *int*                                                                                                                                                                                      | :heavy_check_mark:                                                                                                                                                                         | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                                      | 9518                                                                                                                                                                                       |
| `includeDetails`                                                                                                                                                                           | [Optional<IncludeDetails>](../../models/operations/IncludeDetails.md)                                                                                                                      | :heavy_minus_sign:                                                                                                                                                                         | Whether or not to include details for a section (types, filters, and sorts). <br/>Only exists for backwards compatibility, media providers other than the server libraries have it on always.<br/> |                                                                                                                                                                                            |

### Response

**[GetLibraryDetailsResponse](../../models/operations/GetLibraryDetailsResponse.md)**

### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetLibraryDetailsBadRequest   | 400                                         | application/json                            |
| models/errors/GetLibraryDetailsUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |


## deleteLibrary

Delete a library using a specific section id

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.DeleteLibraryBadRequest;
import dev.plexapi.sdk.models.errors.DeleteLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.DeleteLibraryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws DeleteLibraryBadRequest, DeleteLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        DeleteLibraryResponse res = sdk.library().deleteLibrary()
                .sectionKey(9518)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                  | *int*                                                                                         | :heavy_check_mark:                                                                            | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/> | 9518                                                                                          |

### Response

**[DeleteLibraryResponse](../../models/operations/DeleteLibraryResponse.md)**

### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/DeleteLibraryBadRequest   | 400                                     | application/json                        |
| models/errors/DeleteLibraryUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | \*\/*                                   |


## getLibraryItems

Fetches details from a specific section of the library identified by a section key and a tag. The tag parameter accepts the following values:
- `all`: All items in the section.
- `unwatched`: Items that have not been played.
- `newest`: Items that are recently released.
- `recentlyAdded`: Items that are recently added to the library.
- `recentlyViewed`: Items that were recently viewed.
- `onDeck`: Items to continue watching.
- `collection`: Items categorized by collection.
- `edition`: Items categorized by edition.
- `genre`: Items categorized by genre.
- `year`: Items categorized by year of release.
- `decade`: Items categorized by decade.
- `director`: Items categorized by director.
- `actor`: Items categorized by starring actor.
- `country`: Items categorized by country of origin.
- `contentRating`: Items categorized by content rating.
- `rating`: Items categorized by rating.
- `resolution`: Items categorized by resolution.
- `firstCharacter`: Items categorized by the first letter.
- `folder`: Items categorized by folder.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetLibraryItemsBadRequest;
import dev.plexapi.sdk.models.errors.GetLibraryItemsUnauthorized;
import dev.plexapi.sdk.models.operations.GetLibraryItemsQueryParamIncludeMeta;
import dev.plexapi.sdk.models.operations.GetLibraryItemsQueryParamType;
import dev.plexapi.sdk.models.operations.GetLibraryItemsRequest;
import dev.plexapi.sdk.models.operations.GetLibraryItemsResponse;
import dev.plexapi.sdk.models.operations.IncludeGuids;
import dev.plexapi.sdk.models.operations.Tag;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetLibraryItemsBadRequest, GetLibraryItemsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetLibraryItemsRequest req = GetLibraryItemsRequest.builder()
                .sectionKey(9518)
                .tag(Tag.EDITION)
                .includeGuids(IncludeGuids.Enable)
                .type(GetLibraryItemsQueryParamType.TvShow)
                .includeMeta(GetLibraryItemsQueryParamIncludeMeta.Enable)
                .xPlexContainerStart(0)
                .xPlexContainerSize(50)
                .build();

        GetLibraryItemsResponse res = sdk.library().getLibraryItems()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetLibraryItemsRequest](../../models/operations/GetLibraryItemsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetLibraryItemsResponse](../../models/operations/GetLibraryItemsResponse.md)**

### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetLibraryItemsBadRequest   | 400                                       | application/json                          |
| models/errors/GetLibraryItemsUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |


## getRefreshLibraryMetadata

This endpoint Refreshes all the Metadata of the library.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetRefreshLibraryMetadataBadRequest;
import dev.plexapi.sdk.models.errors.GetRefreshLibraryMetadataUnauthorized;
import dev.plexapi.sdk.models.operations.Force;
import dev.plexapi.sdk.models.operations.GetRefreshLibraryMetadataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetRefreshLibraryMetadataBadRequest, GetRefreshLibraryMetadataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetRefreshLibraryMetadataResponse res = sdk.library().getRefreshLibraryMetadata()
                .sectionKey(9518)
                .force(Force.ONE)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                  | *int*                                                                                         | :heavy_check_mark:                                                                            | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/> | 9518                                                                                          |
| `force`                                                                                       | [Optional<Force>](../../models/operations/Force.md)                                           | :heavy_minus_sign:                                                                            | Force the refresh even if the library is already being refreshed.                             | 0                                                                                             |

### Response

**[GetRefreshLibraryMetadataResponse](../../models/operations/GetRefreshLibraryMetadataResponse.md)**

### Errors

| Error Object                                        | Status Code                                         | Content Type                                        |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| models/errors/GetRefreshLibraryMetadataBadRequest   | 400                                                 | application/json                                    |
| models/errors/GetRefreshLibraryMetadataUnauthorized | 401                                                 | application/json                                    |
| models/errors/SDKError                              | 4xx-5xx                                             | \*\/*                                               |


## getSearchLibrary

Search for content within a specific section of the library.

### Types
Each type in the library comes with a set of filters and sorts, aiding in building dynamic media controls:

- **Type Object Attributes**:
  - `type`: Metadata type (if standard Plex type).  
  - `title`: Title for this content type (e.g., "Movies").

- **Filter Objects**:
  - Subset of the media query language.
  - Attributes include `filter` (name), `filterType` (data type), `key` (endpoint for value range), and `title`.

- **Sort Objects**:
  - Description of sort fields.
  - Attributes include `defaultDirection` (asc/desc), `descKey` and `key` (sort parameters), and `title`.

> **Note**: Filters and sorts are optional; without them, no filtering controls are rendered.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetSearchLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetSearchLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.GetSearchLibraryQueryParamType;
import dev.plexapi.sdk.models.operations.GetSearchLibraryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetSearchLibraryBadRequest, GetSearchLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetSearchLibraryResponse res = sdk.library().getSearchLibrary()
                .sectionKey(9518)
                .type(GetSearchLibraryQueryParamType.TvShow)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                       | Type                                                                                                                                                                            | Required                                                                                                                                                                        | Description                                                                                                                                                                     | Example                                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                                                                                                    | *int*                                                                                                                                                                           | :heavy_check_mark:                                                                                                                                                              | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                           | 9518                                                                                                                                                                            |
| `type`                                                                                                                                                                          | [GetSearchLibraryQueryParamType](../../models/operations/GetSearchLibraryQueryParamType.md)                                                                                     | :heavy_check_mark:                                                                                                                                                              | The type of media to retrieve.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                               |

### Response

**[GetSearchLibraryResponse](../../models/operations/GetSearchLibraryResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetSearchLibraryBadRequest   | 400                                        | application/json                           |
| models/errors/GetSearchLibraryUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4xx-5xx                                    | \*\/*                                      |


## getMetaDataByRatingKey

This endpoint will return the metadata of a library item specified with the ratingKey.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetMetaDataByRatingKeyBadRequest;
import dev.plexapi.sdk.models.errors.GetMetaDataByRatingKeyUnauthorized;
import dev.plexapi.sdk.models.operations.GetMetaDataByRatingKeyResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetMetaDataByRatingKeyBadRequest, GetMetaDataByRatingKeyUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetMetaDataByRatingKeyResponse res = sdk.library().getMetaDataByRatingKey()
                .ratingKey(9518L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           | Example                                               |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `ratingKey`                                           | *long*                                                | :heavy_check_mark:                                    | the id of the library item to return the children of. | 9518                                                  |

### Response

**[GetMetaDataByRatingKeyResponse](../../models/operations/GetMetaDataByRatingKeyResponse.md)**

### Errors

| Error Object                                     | Status Code                                      | Content Type                                     |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| models/errors/GetMetaDataByRatingKeyBadRequest   | 400                                              | application/json                                 |
| models/errors/GetMetaDataByRatingKeyUnauthorized | 401                                              | application/json                                 |
| models/errors/SDKError                           | 4xx-5xx                                          | \*\/*                                            |


## getMetadataChildren

This endpoint will return the children of of a library item specified with the ratingKey.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetMetadataChildrenBadRequest;
import dev.plexapi.sdk.models.errors.GetMetadataChildrenUnauthorized;
import dev.plexapi.sdk.models.operations.GetMetadataChildrenResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetMetadataChildrenBadRequest, GetMetadataChildrenUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetMetadataChildrenResponse res = sdk.library().getMetadataChildren()
                .ratingKey(1539.15d)
                .includeElements("<value>")
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `ratingKey`                                                             | *double*                                                                | :heavy_check_mark:                                                      | the id of the library item to return the children of.                   |
| `includeElements`                                                       | *Optional<String>*                                                      | :heavy_minus_sign:                                                      | Adds additional elements to the response. Supported types are (Stream)<br/> |

### Response

**[GetMetadataChildrenResponse](../../models/operations/GetMetadataChildrenResponse.md)**

### Errors

| Error Object                                  | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetMetadataChildrenBadRequest   | 400                                           | application/json                              |
| models/errors/GetMetadataChildrenUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4xx-5xx                                       | \*\/*                                         |


## getTopWatchedContent

This endpoint will return the top watched content from libraries of a certain type


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTopWatchedContentBadRequest;
import dev.plexapi.sdk.models.errors.GetTopWatchedContentUnauthorized;
import dev.plexapi.sdk.models.operations.GetTopWatchedContentQueryParamType;
import dev.plexapi.sdk.models.operations.GetTopWatchedContentResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTopWatchedContentBadRequest, GetTopWatchedContentUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetTopWatchedContentResponse res = sdk.library().getTopWatchedContent()
                .type(GetTopWatchedContentQueryParamType.TvShow)
                .includeGuids(1L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                       | Type                                                                                                                                                                            | Required                                                                                                                                                                        | Description                                                                                                                                                                     | Example                                                                                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                                                                          | [GetTopWatchedContentQueryParamType](../../models/operations/GetTopWatchedContentQueryParamType.md)                                                                             | :heavy_check_mark:                                                                                                                                                              | The type of media to retrieve.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                               |
| `includeGuids`                                                                                                                                                                  | *Optional<Long>*                                                                                                                                                                | :heavy_minus_sign:                                                                                                                                                              | Adds the Guids object to the response<br/>                                                                                                                                      | 1                                                                                                                                                                               |

### Response

**[GetTopWatchedContentResponse](../../models/operations/GetTopWatchedContentResponse.md)**

### Errors

| Error Object                                   | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/GetTopWatchedContentBadRequest   | 400                                            | application/json                               |
| models/errors/GetTopWatchedContentUnauthorized | 401                                            | application/json                               |
| models/errors/SDKError                         | 4xx-5xx                                        | \*\/*                                          |


## getOnDeck

This endpoint will return the on deck content.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetOnDeckBadRequest;
import dev.plexapi.sdk.models.errors.GetOnDeckUnauthorized;
import dev.plexapi.sdk.models.operations.GetOnDeckResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetOnDeckBadRequest, GetOnDeckUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetOnDeckResponse res = sdk.library().getOnDeck()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetOnDeckResponse](../../models/operations/GetOnDeckResponse.md)**

### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/GetOnDeckBadRequest   | 400                                 | application/json                    |
| models/errors/GetOnDeckUnauthorized | 401                                 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |
