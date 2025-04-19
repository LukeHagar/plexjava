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
* [getAllMediaLibrary](#getallmedialibrary) - Get all media of library
* [getRefreshLibraryMetadata](#getrefreshlibrarymetadata) - Refresh Metadata Of The Library
* [getSearchLibrary](#getsearchlibrary) - Search Library
* [getGenresLibrary](#getgenreslibrary) - Get Genres of library media
* [getCountriesLibrary](#getcountrieslibrary) - Get Countries of library media
* [getActorsLibrary](#getactorslibrary) - Get Actors of library media
* [getSearchAllLibraries](#getsearchalllibraries) - Search All Libraries
* [getMediaMetaData](#getmediametadata) - Get Media Metadata
* [getMediaArts](#getmediaarts) - Get Media Background Artwork
* [postMediaArts](#postmediaarts) - Upload Media Background Artwork
* [getMediaPosters](#getmediaposters) - Get Media Posters
* [postMediaPoster](#postmediaposter) - Upload Media Poster
* [getMetadataChildren](#getmetadatachildren) - Get Items Children
* [getTopWatchedContent](#gettopwatchedcontent) - Get Top Watched Content

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
            .build();

        GetFileHashResponse res = sdk.library().getFileHash()
                .url("file://C:\Image.png&type=13")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       | Example                                                           |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `url`                                                             | *String*                                                          | :heavy_check_mark:                                                | This is the path to the local file, must be prefixed by `file://` | file://C:\Image.png&type=13                                       |
| `type`                                                            | *Optional\<Double>*                                               | :heavy_minus_sign:                                                | Item type                                                         |                                                                   |

### Response

**[GetFileHashResponse](../../models/operations/GetFileHashResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetFileHashBadRequest   | 400                                   | application/json                      |
| models/errors/GetFileHashUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4XX, 5XX                              | \*/\*                                 |

## getRecentlyAddedLibrary

This endpoint will return the recently added content.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetRecentlyAddedLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetRecentlyAddedLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GetRecentlyAddedLibraryBadRequest, GetRecentlyAddedLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
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

| Error Type                                        | Status Code                                       | Content Type                                      |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| models/errors/GetRecentlyAddedLibraryBadRequest   | 400                                               | application/json                                  |
| models/errors/GetRecentlyAddedLibraryUnauthorized | 401                                               | application/json                                  |
| models/errors/SDKError                            | 4XX, 5XX                                          | \*/\*                                             |

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

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetAllLibrariesBadRequest   | 400                                       | application/json                          |
| models/errors/GetAllLibrariesUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

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
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetLibraryDetailsBadRequest, GetLibraryDetailsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetLibraryDetailsResponse res = sdk.library().getLibraryDetails()
                .sectionKey(9518)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                 | Type                                                                                                                                                                                      | Required                                                                                                                                                                                  | Description                                                                                                                                                                               | Example                                                                                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `includeDetails`                                                                                                                                                                          | [Optional\<IncludeDetails>](../../models/operations/IncludeDetails.md)                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                        | Whether or not to include details for a section (types, filters, and sorts).<br/>Only exists for backwards compatibility, media providers other than the server libraries have it on always.<br/> |                                                                                                                                                                                           |
| `sectionKey`                                                                                                                                                                              | *int*                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                        | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                                     | 9518                                                                                                                                                                                      |

### Response

**[GetLibraryDetailsResponse](../../models/operations/GetLibraryDetailsResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetLibraryDetailsBadRequest   | 400                                         | application/json                            |
| models/errors/GetLibraryDetailsUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

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

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/DeleteLibraryBadRequest   | 400                                     | application/json                        |
| models/errors/DeleteLibraryUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |

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
- `albums`: Items categorized by album.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetLibraryItemsBadRequest;
import dev.plexapi.sdk.models.errors.GetLibraryItemsUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetLibraryItemsBadRequest, GetLibraryItemsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetLibraryItemsRequest req = GetLibraryItemsRequest.builder()
                .tag(Tag.EDITION)
                .type(GetLibraryItemsQueryParamType.TvShow)
                .sectionKey(9518)
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

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetLibraryItemsBadRequest   | 400                                       | application/json                          |
| models/errors/GetLibraryItemsUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getAllMediaLibrary

Retrieves a list of all general media data for this library.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetAllMediaLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetAllMediaLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetAllMediaLibraryBadRequest, GetAllMediaLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetAllMediaLibraryRequest req = GetAllMediaLibraryRequest.builder()
                .sectionKey(9518)
                .type(GetAllMediaLibraryQueryParamType.TvShow)
                .build();

        GetAllMediaLibraryResponse res = sdk.library().getAllMediaLibrary()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetAllMediaLibraryRequest](../../models/operations/GetAllMediaLibraryRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetAllMediaLibraryResponse](../../models/operations/GetAllMediaLibraryResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/GetAllMediaLibraryBadRequest   | 400                                          | application/json                             |
| models/errors/GetAllMediaLibraryUnauthorized | 401                                          | application/json                             |
| models/errors/SDKError                       | 4XX, 5XX                                     | \*/\*                                        |

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
            .build();

        GetRefreshLibraryMetadataResponse res = sdk.library().getRefreshLibraryMetadata()
                .force(Force.ONE)
                .sectionKey(9518)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   | Example                                                                                       |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `force`                                                                                       | [Optional\<Force>](../../models/operations/Force.md)                                          | :heavy_minus_sign:                                                                            | Force the refresh even if the library is already being refreshed.                             | 0                                                                                             |
| `sectionKey`                                                                                  | *int*                                                                                         | :heavy_check_mark:                                                                            | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/> | 9518                                                                                          |

### Response

**[GetRefreshLibraryMetadataResponse](../../models/operations/GetRefreshLibraryMetadataResponse.md)**

### Errors

| Error Type                                          | Status Code                                         | Content Type                                        |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| models/errors/GetRefreshLibraryMetadataBadRequest   | 400                                                 | application/json                                    |
| models/errors/GetRefreshLibraryMetadataUnauthorized | 401                                                 | application/json                                    |
| models/errors/SDKError                              | 4XX, 5XX                                            | \*/\*                                               |

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

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  | Example                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                                                                                                                 | *int*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                           | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                                        | 9518                                                                                                                                                                                         |
| `type`                                                                                                                                                                                       | [GetSearchLibraryQueryParamType](../../models/operations/GetSearchLibraryQueryParamType.md)                                                                                                  | :heavy_check_mark:                                                                                                                                                                           | The type of media to retrieve or filter by.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                                            |

### Response

**[GetSearchLibraryResponse](../../models/operations/GetSearchLibraryResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetSearchLibraryBadRequest   | 400                                        | application/json                           |
| models/errors/GetSearchLibraryUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |

## getGenresLibrary

Retrieves a list of all the genres that are found for the media in this library.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetGenresLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetGenresLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.GetGenresLibraryQueryParamType;
import dev.plexapi.sdk.models.operations.GetGenresLibraryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetGenresLibraryBadRequest, GetGenresLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetGenresLibraryResponse res = sdk.library().getGenresLibrary()
                .sectionKey(9518)
                .type(GetGenresLibraryQueryParamType.TvShow)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  | Example                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                                                                                                                 | *int*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                           | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                                        | 9518                                                                                                                                                                                         |
| `type`                                                                                                                                                                                       | [GetGenresLibraryQueryParamType](../../models/operations/GetGenresLibraryQueryParamType.md)                                                                                                  | :heavy_check_mark:                                                                                                                                                                           | The type of media to retrieve or filter by.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                                            |

### Response

**[GetGenresLibraryResponse](../../models/operations/GetGenresLibraryResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetGenresLibraryBadRequest   | 400                                        | application/json                           |
| models/errors/GetGenresLibraryUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |

## getCountriesLibrary

Retrieves a list of all the countries that are found for the media in this library.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetCountriesLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetCountriesLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.GetCountriesLibraryQueryParamType;
import dev.plexapi.sdk.models.operations.GetCountriesLibraryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetCountriesLibraryBadRequest, GetCountriesLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetCountriesLibraryResponse res = sdk.library().getCountriesLibrary()
                .sectionKey(9518)
                .type(GetCountriesLibraryQueryParamType.TvShow)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  | Example                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                                                                                                                 | *int*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                           | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                                        | 9518                                                                                                                                                                                         |
| `type`                                                                                                                                                                                       | [GetCountriesLibraryQueryParamType](../../models/operations/GetCountriesLibraryQueryParamType.md)                                                                                            | :heavy_check_mark:                                                                                                                                                                           | The type of media to retrieve or filter by.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                                            |

### Response

**[GetCountriesLibraryResponse](../../models/operations/GetCountriesLibraryResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetCountriesLibraryBadRequest   | 400                                           | application/json                              |
| models/errors/GetCountriesLibraryUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

## getActorsLibrary

Retrieves a list of all the actors that are found for the media in this library.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetActorsLibraryBadRequest;
import dev.plexapi.sdk.models.errors.GetActorsLibraryUnauthorized;
import dev.plexapi.sdk.models.operations.GetActorsLibraryQueryParamType;
import dev.plexapi.sdk.models.operations.GetActorsLibraryResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetActorsLibraryBadRequest, GetActorsLibraryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetActorsLibraryResponse res = sdk.library().getActorsLibrary()
                .sectionKey(9518)
                .type(GetActorsLibraryQueryParamType.TvShow)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  | Example                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionKey`                                                                                                                                                                                 | *int*                                                                                                                                                                                        | :heavy_check_mark:                                                                                                                                                                           | The unique key of the Plex library. <br/>Note: This is unique in the context of the Plex server.<br/>                                                                                        | 9518                                                                                                                                                                                         |
| `type`                                                                                                                                                                                       | [GetActorsLibraryQueryParamType](../../models/operations/GetActorsLibraryQueryParamType.md)                                                                                                  | :heavy_check_mark:                                                                                                                                                                           | The type of media to retrieve or filter by.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                                            |

### Response

**[GetActorsLibraryResponse](../../models/operations/GetActorsLibraryResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetActorsLibraryBadRequest   | 400                                        | application/json                           |
| models/errors/GetActorsLibraryUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |

## getSearchAllLibraries

Search the provided query across all library sections, or a single section, and return matches as hubs, split up by type.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetSearchAllLibrariesBadRequest;
import dev.plexapi.sdk.models.errors.GetSearchAllLibrariesUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws GetSearchAllLibrariesBadRequest, GetSearchAllLibrariesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetSearchAllLibrariesRequest req = GetSearchAllLibrariesRequest.builder()
                .query("<value>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .searchTypes(List.of(
                    SearchTypes.PEOPLE))
                .build();

        GetSearchAllLibrariesResponse res = sdk.library().getSearchAllLibraries()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetSearchAllLibrariesRequest](../../models/operations/GetSearchAllLibrariesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetSearchAllLibrariesResponse](../../models/operations/GetSearchAllLibrariesResponse.md)**

### Errors

| Error Type                                      | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/GetSearchAllLibrariesBadRequest   | 400                                             | application/json                                |
| models/errors/GetSearchAllLibrariesUnauthorized | 401                                             | application/json                                |
| models/errors/SDKError                          | 4XX, 5XX                                        | \*/\*                                           |

## getMediaMetaData

This endpoint will return all the (meta)data of a library item specified with by the ratingKey.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetMediaMetaDataBadRequest;
import dev.plexapi.sdk.models.errors.GetMediaMetaDataUnauthorized;
import dev.plexapi.sdk.models.operations.GetMediaMetaDataRequest;
import dev.plexapi.sdk.models.operations.GetMediaMetaDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetMediaMetaDataBadRequest, GetMediaMetaDataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetMediaMetaDataRequest req = GetMediaMetaDataRequest.builder()
                .ratingKey(9518L)
                .includeConcerts(true)
                .includeExtras(true)
                .includeOnDeck(true)
                .includePopularLeaves(true)
                .includePreferences(true)
                .includeReviews(true)
                .includeChapters(true)
                .includeStations(true)
                .includeExternalMedia(true)
                .asyncAugmentMetadata(true)
                .asyncCheckFiles(true)
                .asyncRefreshAnalysis(true)
                .asyncRefreshLocalMediaAgent(true)
                .build();

        GetMediaMetaDataResponse res = sdk.library().getMediaMetaData()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetMediaMetaDataRequest](../../models/operations/GetMediaMetaDataRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetMediaMetaDataResponse](../../models/operations/GetMediaMetaDataResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetMediaMetaDataBadRequest   | 400                                        | application/json                           |
| models/errors/GetMediaMetaDataUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |

## getMediaArts

Returns the background artwork for a library item.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetMediaArtsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetMediaArtsResponse res = sdk.library().getMediaArts()
                .ratingKey(16099L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `ratingKey`                                          | *long*                                               | :heavy_check_mark:                                   | the id of the library item to return the artwork of. | 16099                                                |

### Response

**[GetMediaArtsResponse](../../models/operations/GetMediaArtsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## postMediaArts

Uploads an image to use as the background artwork for a library item, either from a local file or a remote URL

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.PostMediaArtsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        PostMediaArtsResponse res = sdk.library().postMediaArts()
                .ratingKey(2268L)
                .url("https://api.mediux.pro/assets/fcfdc487-dd07-4993-a0c1-0a3015362e5b")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ratingKey`                                                        | *long*                                                             | :heavy_check_mark:                                                 | the id of the library item to return the posters of.               | 2268                                                               |
| `url`                                                              | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The URL of the image, if uploading a remote image                  | https://api.mediux.pro/assets/fcfdc487-dd07-4993-a0c1-0a3015362e5b |
| `requestBody`                                                      | *Optional\<byte[]>*                                                | :heavy_minus_sign:                                                 | The contents of the image, if uploading a local file               |                                                                    |

### Response

**[PostMediaArtsResponse](../../models/operations/PostMediaArtsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMediaPosters

Returns the available posters for a library item.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetMediaPostersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetMediaPostersResponse res = sdk.library().getMediaPosters()
                .ratingKey(16099L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                            | Type                                                 | Required                                             | Description                                          | Example                                              |
| ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- | ---------------------------------------------------- |
| `ratingKey`                                          | *long*                                               | :heavy_check_mark:                                   | the id of the library item to return the posters of. | 16099                                                |

### Response

**[GetMediaPostersResponse](../../models/operations/GetMediaPostersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## postMediaPoster

Uploads a poster to a library item, either from a local file or a remote URL

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.PostMediaPosterResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        PostMediaPosterResponse res = sdk.library().postMediaPoster()
                .ratingKey(2268L)
                .url("https://api.mediux.pro/assets/fcfdc487-dd07-4993-a0c1-0a3015362e5b")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                          | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ratingKey`                                                        | *long*                                                             | :heavy_check_mark:                                                 | the id of the library item to return the posters of.               | 2268                                                               |
| `url`                                                              | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The URL of the image, if uploading a remote image                  | https://api.mediux.pro/assets/fcfdc487-dd07-4993-a0c1-0a3015362e5b |
| `requestBody`                                                      | *Optional\<byte[]>*                                                | :heavy_minus_sign:                                                 | The contents of the image, if uploading a local file               |                                                                    |

### Response

**[PostMediaPosterResponse](../../models/operations/PostMediaPosterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

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
            .build();

        GetMetadataChildrenResponse res = sdk.library().getMetadataChildren()
                .ratingKey(1539.14)
                .includeElements("Stream")
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
| `includeElements`                                                       | *Optional\<String>*                                                     | :heavy_minus_sign:                                                      | Adds additional elements to the response. Supported types are (Stream)<br/> |

### Response

**[GetMetadataChildrenResponse](../../models/operations/GetMetadataChildrenResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetMetadataChildrenBadRequest   | 400                                           | application/json                              |
| models/errors/GetMetadataChildrenUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

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
            .build();

        GetTopWatchedContentResponse res = sdk.library().getTopWatchedContent()
                .includeGuids(1L)
                .type(GetTopWatchedContentQueryParamType.TvShow)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  | Example                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `includeGuids`                                                                                                                                                                               | *Optional\<Long>*                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                           | Adds the Guids object to the response<br/>                                                                                                                                                   | 1                                                                                                                                                                                            |
| `type`                                                                                                                                                                                       | [GetTopWatchedContentQueryParamType](../../models/operations/GetTopWatchedContentQueryParamType.md)                                                                                          | :heavy_check_mark:                                                                                                                                                                           | The type of media to retrieve or filter by.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                                            |

### Response

**[GetTopWatchedContentResponse](../../models/operations/GetTopWatchedContentResponse.md)**

### Errors

| Error Type                                     | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/GetTopWatchedContentBadRequest   | 400                                            | application/json                               |
| models/errors/GetTopWatchedContentUnauthorized | 401                                            | application/json                               |
| models/errors/SDKError                         | 4XX, 5XX                                       | \*/\*                                          |