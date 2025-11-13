# Library
(*library()*)

## Overview

Library endpoints which are outside of the Media Provider API.  Typically this is manipulation of the library (adding/removing sections, modifying preferences, etc).

### Available Operations

* [getLibraryItems](#getlibraryitems) - Get all items in library
* [deleteCaches](#deletecaches) - Delete library caches
* [cleanBundles](#cleanbundles) - Clean bundles
* [ingestTransientItem](#ingesttransientitem) - Ingest a transient item
* [getLibraryMatches](#getlibrarymatches) - Get library matches
* [optimizeDatabase](#optimizedatabase) - Optimize the Database
* [getRandomArtwork](#getrandomartwork) - Get random artwork
* [getSections](#getsections) - Get library sections (main Media Provider Only)
* [addSection](#addsection) - Add a library section
* [stopAllRefreshes](#stopallrefreshes) - Stop refresh
* [getSectionsPrefs](#getsectionsprefs) - Get section prefs
* [refreshSectionsMetadata](#refreshsectionsmetadata) - Refresh all sections
* [getTags](#gettags) - Get all library tags of a type
* [deleteMetadataItem](#deletemetadataitem) - Delete a metadata item
* [editMetadataItem](#editmetadataitem) - Edit a metadata item
* [detectAds](#detectads) - Ad-detect an item
* [getAllItemLeaves](#getallitemleaves) - Get the leaves of an item
* [analyzeMetadata](#analyzemetadata) - Analyze an item
* [generateThumbs](#generatethumbs) - Generate thumbs of chapters for an item
* [detectCredits](#detectcredits) - Credit detect a metadata item
* [getExtras](#getextras) - Get an item's extras
* [addExtras](#addextras) - Add to an item's extras
* [getFile](#getfile) - Get a file from a metadata or media bundle
* [startBifGeneration](#startbifgeneration) - Start BIF generation of an item
* [detectIntros](#detectintros) - Intro detect an item
* [createMarker](#createmarker) - Create a marker
* [matchItem](#matchitem) - Match a metadata item
* [listMatches](#listmatches) - Get metadata matches for an item
* [mergeItems](#mergeitems) - Merge a metadata item
* [listSonicallySimilar](#listsonicallysimilar) - Get nearest tracks to metadata item
* [setItemPreferences](#setitempreferences) - Set metadata preferences
* [refreshItemsMetadata](#refreshitemsmetadata) - Refresh a metadata item
* [getRelatedItems](#getrelateditems) - Get related items
* [listSimilar](#listsimilar) - Get similar items
* [splitItem](#splititem) - Split a metadata item
* [addSubtitles](#addsubtitles) - Add subtitles
* [getItemTree](#getitemtree) - Get metadata items as a tree
* [unmatch](#unmatch) - Unmatch a metadata item
* [listTopUsers](#listtopusers) - Get metadata top users
* [detectVoiceActivity](#detectvoiceactivity) - Detect voice activity
* [getAugmentationStatus](#getaugmentationstatus) - Get augmentation status
* [setStreamSelection](#setstreamselection) - Set stream selection
* [getPerson](#getperson) - Get person details
* [listPersonMedia](#listpersonmedia) - Get media for a person
* [deleteLibrarySection](#deletelibrarysection) - Delete a library section
* [getLibraryDetails](#getlibrarydetails) - Get a library section by id
* [editSection](#editsection) - Edit a library section
* [updateItems](#updateitems) - Set the fields of the filtered items
* [startAnalysis](#startanalysis) - Analyze a section
* [autocomplete](#autocomplete) - Get autocompletions for search
* [getCollections](#getcollections) - Get collections in a section
* [getCommon](#getcommon) - Get common fields for items
* [emptyTrash](#emptytrash) - Empty section trash
* [getSectionFilters](#getsectionfilters) - Get section filters
* [getFirstCharacters](#getfirstcharacters) - Get list of first characters
* [deleteIndexes](#deleteindexes) - Delete section indexes
* [deleteIntros](#deleteintros) - Delete section intro markers
* [getSectionPreferences](#getsectionpreferences) - Get section prefs
* [setSectionPreferences](#setsectionpreferences) - Set section prefs
* [cancelRefresh](#cancelrefresh) - Cancel section refresh
* [refreshSection](#refreshsection) - Refresh section
* [getAvailableSorts](#getavailablesorts) - Get a section sorts
* [getStreamLevels](#getstreamlevels) - Get loudness about a stream in json
* [getStreamLoudness](#getstreamloudness) - Get loudness about a stream
* [getChapterImage](#getchapterimage) - Get a chapter image
* [setItemArtwork](#setitemartwork) - Set an item's artwork, theme, etc
* [updateItemArtwork](#updateitemartwork) - Set an item's artwork, theme, etc
* [deleteMarker](#deletemarker) - Delete a marker
* [editMarker](#editmarker) - Edit a marker
* [deleteMediaItem](#deletemediaitem) - Delete a media item
* [getPartIndex](#getpartindex) - Get BIF index for a part
* [deleteCollection](#deletecollection) - Delete a collection
* [getSectionImage](#getsectionimage) - Get a section composite image
* [deleteStream](#deletestream) - Delete a stream
* [getStream](#getstream) - Get a stream
* [setStreamOffset](#setstreamoffset) - Set a stream offset
* [getItemArtwork](#getitemartwork) - Get an item's artwork, theme, etc
* [getMediaPart](#getmediapart) - Get a media part
* [getImageFromBif](#getimagefrombif) - Get an image from part BIF

## getLibraryItems

Request all metadata items according to a query.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLibraryItems" method="get" path="/library/all" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetLibraryItemsRequest;
import dev.plexapi.sdk.models.operations.GetLibraryItemsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetLibraryItemsRequest req = GetLibraryItemsRequest.builder()
                .build();

        GetLibraryItemsResponse res = sdk.library().getLibraryItems()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
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

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteCaches

Delete the hub caches so they are recomputed on next request

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCaches" method="delete" path="/library/caches" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteCachesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteCachesResponse res = sdk.library().deleteCaches()
                .call();

        // handle response
    }
}
```

### Response

**[DeleteCachesResponse](../../models/operations/DeleteCachesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## cleanBundles

Clean out any now unused bundles. Bundles can become unused when media is deleted

### Example Usage

<!-- UsageSnippet language="java" operationID="cleanBundles" method="put" path="/library/clean/bundles" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CleanBundlesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        CleanBundlesResponse res = sdk.library().cleanBundles()
                .call();

        // handle response
    }
}
```

### Response

**[CleanBundlesResponse](../../models/operations/CleanBundlesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## ingestTransientItem

This endpoint takes a file path specified in the `url` parameter, matches it using the scanner's match mechanism, downloads rich metadata, and then ingests the item as a transient item (without a library section). In the case where the file represents an episode, the entire tree (show, season, and episode) is added as transient items. At this time, movies and episodes are the only supported types, which are gleaned automatically from the file path.
Note that any of the parameters passed to the metadata details endpoint (e.g. `includeExtras=1`) work here.

### Example Usage

<!-- UsageSnippet language="java" operationID="ingestTransientItem" method="post" path="/library/file" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.IngestTransientItemRequest;
import dev.plexapi.sdk.models.operations.IngestTransientItemResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        IngestTransientItemRequest req = IngestTransientItemRequest.builder()
                .url("file:///storage%2Femulated%2F0%2FArcher-S01E01.mkv")
                .virtualFilePath("/Avatar.mkv")
                .computeHashes(BoolInt.ONE)
                .ingestNonMatches(BoolInt.ONE)
                .build();

        IngestTransientItemResponse res = sdk.library().ingestTransientItem()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [IngestTransientItemRequest](../../models/operations/IngestTransientItemRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[IngestTransientItemResponse](../../models/operations/IngestTransientItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLibraryMatches

The matches endpoint is used to match content external to the library with content inside the library. This is done by passing a series of semantic "hints" about the content (its type, name, or release year). Each type (e.g. movie) has a canonical set of minimal required hints.
This ability to match content is useful in a variety of scenarios. For example, in the DVR, the EPG uses the endpoint to match recording rules against airing content. And in the cloud, the UMP uses the endpoint to match up a piece of media with rich metadata.
The endpoint response can including multiple matches, if there is ambiguity, each one containing a `score` from 0 to 100. For somewhat historical reasons, anything over 85 is considered a positive match (we prefer false negatives over false positives in general for matching).
The `guid` hint is somewhat special, in that it generally represents a unique identity for a piece of media (e.g. the IMDB `ttXXX`) identifier, in contrast with other hints which can be much more ambiguous (e.g. a title of `Jane Eyre`, which could refer to the 1943 or the 2011 version).
Episodes require either a season/episode pair, or an air date (or both). Either the path must be sent, or the show title

### Example Usage

<!-- UsageSnippet language="java" operationID="getLibraryMatches" method="get" path="/library/matches" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetLibraryMatchesRequest;
import dev.plexapi.sdk.models.operations.GetLibraryMatchesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetLibraryMatchesRequest req = GetLibraryMatchesRequest.builder()
                .includeFullMetadata(BoolInt.ONE)
                .includeAncestorMetadata(BoolInt.ONE)
                .includeAlternateMetadataSources(BoolInt.ONE)
                .build();

        GetLibraryMatchesResponse res = sdk.library().getLibraryMatches()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLibraryMatchesRequest](../../models/operations/GetLibraryMatchesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLibraryMatchesResponse](../../models/operations/GetLibraryMatchesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## optimizeDatabase

Initiate optimize on the database.

### Example Usage

<!-- UsageSnippet language="java" operationID="optimizeDatabase" method="put" path="/library/optimize" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.OptimizeDatabaseRequest;
import dev.plexapi.sdk.models.operations.OptimizeDatabaseResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        OptimizeDatabaseRequest req = OptimizeDatabaseRequest.builder()
                .async(BoolInt.ONE)
                .build();

        OptimizeDatabaseResponse res = sdk.library().optimizeDatabase()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [OptimizeDatabaseRequest](../../models/operations/OptimizeDatabaseRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[OptimizeDatabaseResponse](../../models/operations/OptimizeDatabaseResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRandomArtwork

Get random artwork across sections.  This is commonly used for a screensaver.

This retrieves 100 random artwork paths in the specified sections and returns them.  Restrictions are put in place to not return artwork for items the user is not allowed to access.  Artwork will be for Movies, Shows, and Artists only.


### Example Usage

<!-- UsageSnippet language="java" operationID="getRandomArtwork" method="get" path="/library/randomArtwork" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetRandomArtworkRequest;
import dev.plexapi.sdk.models.operations.GetRandomArtworkResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetRandomArtworkRequest req = GetRandomArtworkRequest.builder()
                .sections(List.of(
                    5L,
                    6L))
                .build();

        GetRandomArtworkResponse res = sdk.library().getRandomArtwork()
                .request(req)
                .call();

        if (res.mediaContainerWithArtwork().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRandomArtworkRequest](../../models/operations/GetRandomArtworkRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRandomArtworkResponse](../../models/operations/GetRandomArtworkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSections

A library section (commonly referred to as just a library) is a collection of media. Libraries are typed, and depending on their type provide either a flat or a hierarchical view of the media. For example, a music library has an artist > albums > tracks structure, whereas a movie library is flat.
Libraries have features beyond just being a collection of media; for starters, they include information about supported types, filters and sorts. This allows a client to provide a rich interface around the media (e.g. allow sorting movies by release year).

### Example Usage

<!-- UsageSnippet language="java" operationID="getSections" method="get" path="/library/sections/all" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSectionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetSectionsResponse res = sdk.library().getSections()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSectionsResponse](../../models/operations/GetSectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addSection

Add a new library section to the server

### Example Usage

<!-- UsageSnippet language="java" operationID="addSection" method="post" path="/library/sections/all" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        AddSectionRequest req = AddSectionRequest.builder()
                .name("<value>")
                .type(39544L)
                .agent("<value>")
                .language("<value>")
                .locations(List.of(
                    "O:\fatboy\\Media\\Ripped\\Music",
                    "O:\fatboy\\Media\\My Music"))
                .prefs(QueryParamPrefs.builder()
                    .build())
                .relative(BoolInt.ONE)
                .importFromiTunes(BoolInt.ONE)
                .build();

        AddSectionResponse res = sdk.library().addSection()
                .request(req)
                .call();

        if (res.slashGetResponses200().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [AddSectionRequest](../../models/operations/AddSectionRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[AddSectionResponse](../../models/operations/AddSectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stopAllRefreshes

Stop all refreshes across all sections

### Example Usage

<!-- UsageSnippet language="java" operationID="stopAllRefreshes" method="delete" path="/library/sections/all/refresh" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StopAllRefreshesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        StopAllRefreshesResponse res = sdk.library().stopAllRefreshes()
                .call();

        if (res.librarySections().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[StopAllRefreshesResponse](../../models/operations/StopAllRefreshesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSectionsPrefs

Get a section's preferences for a metadata type

### Example Usage

<!-- UsageSnippet language="java" operationID="getSectionsPrefs" method="get" path="/library/sections/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSectionsPrefsRequest;
import dev.plexapi.sdk.models.operations.GetSectionsPrefsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetSectionsPrefsRequest req = GetSectionsPrefsRequest.builder()
                .type(460221L)
                .build();

        GetSectionsPrefsResponse res = sdk.library().getSectionsPrefs()
                .request(req)
                .call();

        if (res.librarySections().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetSectionsPrefsRequest](../../models/operations/GetSectionsPrefsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetSectionsPrefsResponse](../../models/operations/GetSectionsPrefsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## refreshSectionsMetadata

Tell PMS to refresh all section metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="refreshSectionsMetadata" method="post" path="/library/sections/refresh" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RefreshSectionsMetadataRequest;
import dev.plexapi.sdk.models.operations.RefreshSectionsMetadataResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        RefreshSectionsMetadataRequest req = RefreshSectionsMetadataRequest.builder()
                .build();

        RefreshSectionsMetadataResponse res = sdk.library().refreshSectionsMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [RefreshSectionsMetadataRequest](../../models/operations/RefreshSectionsMetadataRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[RefreshSectionsMetadataResponse](../../models/operations/RefreshSectionsMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTags

Get all library tags of a type

### Example Usage

<!-- UsageSnippet language="java" operationID="getTags" method="get" path="/library/tags" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetTagsRequest;
import dev.plexapi.sdk.models.operations.GetTagsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetTagsRequest req = GetTagsRequest.builder()
                .build();

        GetTagsResponse res = sdk.library().getTags()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetTagsRequest](../../models/operations/GetTagsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetTagsResponse](../../models/operations/GetTagsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteMetadataItem

Delete a single metadata item from the library, deleting media as well

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteMetadataItem" method="delete" path="/library/metadata/{ids}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteMetadataItemRequest;
import dev.plexapi.sdk.models.operations.DeleteMetadataItemResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteMetadataItemRequest req = DeleteMetadataItemRequest.builder()
                .ids("<value>")
                .proxy(BoolInt.ONE)
                .build();

        DeleteMetadataItemResponse res = sdk.library().deleteMetadataItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteMetadataItemRequest](../../models/operations/DeleteMetadataItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteMetadataItemResponse](../../models/operations/DeleteMetadataItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## editMetadataItem

Edit metadata items setting fields

### Example Usage

<!-- UsageSnippet language="java" operationID="editMetadataItem" method="put" path="/library/metadata/{ids}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.EditMetadataItemRequest;
import dev.plexapi.sdk.models.operations.EditMetadataItemResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        EditMetadataItemRequest req = EditMetadataItemRequest.builder()
                .ids(List.of(
                    "<value 1>",
                    "<value 2>"))
                .build();

        EditMetadataItemResponse res = sdk.library().editMetadataItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [EditMetadataItemRequest](../../models/operations/EditMetadataItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[EditMetadataItemResponse](../../models/operations/EditMetadataItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## detectAds

Start the detection of ads in a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="detectAds" method="put" path="/library/metadata/{ids}/addetect" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DetectAdsRequest;
import dev.plexapi.sdk.models.operations.DetectAdsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DetectAdsRequest req = DetectAdsRequest.builder()
                .ids("<value>")
                .build();

        DetectAdsResponse res = sdk.library().detectAds()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [DetectAdsRequest](../../models/operations/DetectAdsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[DetectAdsResponse](../../models/operations/DetectAdsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAllItemLeaves

Get the leaves for a metadata item such as the episodes in a show

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllItemLeaves" method="get" path="/library/metadata/{ids}/allLeaves" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAllItemLeavesRequest;
import dev.plexapi.sdk.models.operations.GetAllItemLeavesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetAllItemLeavesRequest req = GetAllItemLeavesRequest.builder()
                .ids("<value>")
                .build();

        GetAllItemLeavesResponse res = sdk.library().getAllItemLeaves()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetAllItemLeavesRequest](../../models/operations/GetAllItemLeavesRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetAllItemLeavesResponse](../../models/operations/GetAllItemLeavesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## analyzeMetadata

Start the analysis of a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="analyzeMetadata" method="put" path="/library/metadata/{ids}/analyze" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AnalyzeMetadataRequest;
import dev.plexapi.sdk.models.operations.AnalyzeMetadataResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        AnalyzeMetadataRequest req = AnalyzeMetadataRequest.builder()
                .ids("<value>")
                .build();

        AnalyzeMetadataResponse res = sdk.library().analyzeMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [AnalyzeMetadataRequest](../../models/operations/AnalyzeMetadataRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[AnalyzeMetadataResponse](../../models/operations/AnalyzeMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## generateThumbs

Start the chapter thumb generation for an item

### Example Usage

<!-- UsageSnippet language="java" operationID="generateThumbs" method="put" path="/library/metadata/{ids}/chapterThumbs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GenerateThumbsRequest;
import dev.plexapi.sdk.models.operations.GenerateThumbsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GenerateThumbsRequest req = GenerateThumbsRequest.builder()
                .ids("<value>")
                .force(BoolInt.ONE)
                .build();

        GenerateThumbsResponse res = sdk.library().generateThumbs()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GenerateThumbsRequest](../../models/operations/GenerateThumbsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GenerateThumbsResponse](../../models/operations/GenerateThumbsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## detectCredits

Start credit detection on a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="detectCredits" method="put" path="/library/metadata/{ids}/credits" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DetectCreditsRequest;
import dev.plexapi.sdk.models.operations.DetectCreditsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DetectCreditsRequest req = DetectCreditsRequest.builder()
                .ids("<value>")
                .force(BoolInt.ONE)
                .manual(BoolInt.ONE)
                .build();

        DetectCreditsResponse res = sdk.library().detectCredits()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DetectCreditsRequest](../../models/operations/DetectCreditsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DetectCreditsResponse](../../models/operations/DetectCreditsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getExtras

Get the extras for a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="getExtras" method="get" path="/library/metadata/{ids}/extras" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetExtrasRequest;
import dev.plexapi.sdk.models.operations.GetExtrasResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetExtrasRequest req = GetExtrasRequest.builder()
                .ids("<value>")
                .build();

        GetExtrasResponse res = sdk.library().getExtras()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetExtrasRequest](../../models/operations/GetExtrasRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetExtrasResponse](../../models/operations/GetExtrasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addExtras

Add an extra to a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="addExtras" method="post" path="/library/metadata/{ids}/extras" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddExtrasRequest;
import dev.plexapi.sdk.models.operations.AddExtrasResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        AddExtrasRequest req = AddExtrasRequest.builder()
                .ids("<value>")
                .url("https://super-mortise.biz/")
                .build();

        AddExtrasResponse res = sdk.library().addExtras()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [AddExtrasRequest](../../models/operations/AddExtrasRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[AddExtrasResponse](../../models/operations/AddExtrasResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFile

Get a bundle file for a metadata or media item.  This is either an image or a mp3 (for a show's theme)

### Example Usage

<!-- UsageSnippet language="java" operationID="getFile" method="get" path="/library/metadata/{ids}/file" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetFileRequest;
import dev.plexapi.sdk.models.operations.GetFileResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetFileRequest req = GetFileRequest.builder()
                .ids("<value>")
                .build();

        GetFileResponse res = sdk.library().getFile()
                .request(req)
                .call();

        if (res.twoHundredAudioMpeg3ResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetFileRequest](../../models/operations/GetFileRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetFileResponse](../../models/operations/GetFileResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## startBifGeneration

Start the indexing (BIF generation) of an item

### Example Usage

<!-- UsageSnippet language="java" operationID="startBifGeneration" method="put" path="/library/metadata/{ids}/index" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StartBifGenerationRequest;
import dev.plexapi.sdk.models.operations.StartBifGenerationResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        StartBifGenerationRequest req = StartBifGenerationRequest.builder()
                .ids("<value>")
                .force(BoolInt.ONE)
                .build();

        StartBifGenerationResponse res = sdk.library().startBifGeneration()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [StartBifGenerationRequest](../../models/operations/StartBifGenerationRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[StartBifGenerationResponse](../../models/operations/StartBifGenerationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## detectIntros

Start the detection of intros in a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="detectIntros" method="put" path="/library/metadata/{ids}/intro" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DetectIntrosRequest;
import dev.plexapi.sdk.models.operations.DetectIntrosResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DetectIntrosRequest req = DetectIntrosRequest.builder()
                .ids("<value>")
                .force(BoolInt.ONE)
                .build();

        DetectIntrosResponse res = sdk.library().detectIntros()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DetectIntrosRequest](../../models/operations/DetectIntrosRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DetectIntrosResponse](../../models/operations/DetectIntrosResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createMarker

Create a marker for this user on the metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="createMarker" method="post" path="/library/metadata/{ids}/marker" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        CreateMarkerRequest req = CreateMarkerRequest.builder()
                .ids("<value>")
                .type(248391L)
                .startTimeOffset(535191L)
                .attributes(Attributes.builder()
                    .build())
                .build();

        CreateMarkerResponse res = sdk.library().createMarker()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CreateMarkerRequest](../../models/operations/CreateMarkerRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CreateMarkerResponse](../../models/operations/CreateMarkerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## matchItem

Match a metadata item to a guid

### Example Usage

<!-- UsageSnippet language="java" operationID="matchItem" method="put" path="/library/metadata/{ids}/match" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.MatchItemRequest;
import dev.plexapi.sdk.models.operations.MatchItemResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        MatchItemRequest req = MatchItemRequest.builder()
                .ids("<value>")
                .build();

        MatchItemResponse res = sdk.library().matchItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [MatchItemRequest](../../models/operations/MatchItemRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[MatchItemResponse](../../models/operations/MatchItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMatches

Get the list of metadata matches for a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="listMatches" method="put" path="/library/metadata/{ids}/matches" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListMatchesRequest;
import dev.plexapi.sdk.models.operations.ListMatchesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListMatchesRequest req = ListMatchesRequest.builder()
                .ids("<value>")
                .manual(BoolInt.ONE)
                .build();

        ListMatchesResponse res = sdk.library().listMatches()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListMatchesRequest](../../models/operations/ListMatchesRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListMatchesResponse](../../models/operations/ListMatchesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## mergeItems

Merge a metadata item with other items

### Example Usage

<!-- UsageSnippet language="java" operationID="mergeItems" method="put" path="/library/metadata/{ids}/merge" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.MergeItemsRequest;
import dev.plexapi.sdk.models.operations.MergeItemsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        MergeItemsRequest req = MergeItemsRequest.builder()
                .idsPathParameter("<value>")
                .idsQueryParameter(List.of(
                    "<",
                    "v",
                    "a",
                    "l",
                    "u",
                    "e",
                    ">"))
                .build();

        MergeItemsResponse res = sdk.library().mergeItems()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [MergeItemsRequest](../../models/operations/MergeItemsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[MergeItemsResponse](../../models/operations/MergeItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSonicallySimilar

Get the nearest tracks, sonically, to the provided track

### Example Usage

<!-- UsageSnippet language="java" operationID="listSonicallySimilar" method="get" path="/library/metadata/{ids}/nearest" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListSonicallySimilarRequest;
import dev.plexapi.sdk.models.operations.ListSonicallySimilarResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListSonicallySimilarRequest req = ListSonicallySimilarRequest.builder()
                .ids("<value>")
                .build();

        ListSonicallySimilarResponse res = sdk.library().listSonicallySimilar()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ListSonicallySimilarRequest](../../models/operations/ListSonicallySimilarRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ListSonicallySimilarResponse](../../models/operations/ListSonicallySimilarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setItemPreferences

Set the preferences on a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="setItemPreferences" method="put" path="/library/metadata/{ids}/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SetItemPreferencesRequest;
import dev.plexapi.sdk.models.operations.SetItemPreferencesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        SetItemPreferencesRequest req = SetItemPreferencesRequest.builder()
                .ids("<value>")
                .build();

        SetItemPreferencesResponse res = sdk.library().setItemPreferences()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [SetItemPreferencesRequest](../../models/operations/SetItemPreferencesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[SetItemPreferencesResponse](../../models/operations/SetItemPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## refreshItemsMetadata

Refresh a metadata item from the agent

### Example Usage

<!-- UsageSnippet language="java" operationID="refreshItemsMetadata" method="put" path="/library/metadata/{ids}/refresh" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RefreshItemsMetadataRequest;
import dev.plexapi.sdk.models.operations.RefreshItemsMetadataResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        RefreshItemsMetadataRequest req = RefreshItemsMetadataRequest.builder()
                .ids("<value>")
                .markUpdated(BoolInt.ONE)
                .build();

        RefreshItemsMetadataResponse res = sdk.library().refreshItemsMetadata()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [RefreshItemsMetadataRequest](../../models/operations/RefreshItemsMetadataRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[RefreshItemsMetadataResponse](../../models/operations/RefreshItemsMetadataResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRelatedItems

Get a hub of related items to a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="getRelatedItems" method="get" path="/library/metadata/{ids}/related" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetRelatedItemsRequest;
import dev.plexapi.sdk.models.operations.GetRelatedItemsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetRelatedItemsRequest req = GetRelatedItemsRequest.builder()
                .ids("<value>")
                .build();

        GetRelatedItemsResponse res = sdk.library().getRelatedItems()
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
| `request`                                                                   | [GetRelatedItemsRequest](../../models/operations/GetRelatedItemsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetRelatedItemsResponse](../../models/operations/GetRelatedItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listSimilar

Get a list of similar items to a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="listSimilar" method="get" path="/library/metadata/{ids}/similar" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListSimilarRequest;
import dev.plexapi.sdk.models.operations.ListSimilarResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListSimilarRequest req = ListSimilarRequest.builder()
                .ids("<value>")
                .build();

        ListSimilarResponse res = sdk.library().listSimilar()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListSimilarRequest](../../models/operations/ListSimilarRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListSimilarResponse](../../models/operations/ListSimilarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## splitItem

Split a metadata item into multiple items

### Example Usage

<!-- UsageSnippet language="java" operationID="splitItem" method="put" path="/library/metadata/{ids}/split" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SplitItemRequest;
import dev.plexapi.sdk.models.operations.SplitItemResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        SplitItemRequest req = SplitItemRequest.builder()
                .ids("<value>")
                .build();

        SplitItemResponse res = sdk.library().splitItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [SplitItemRequest](../../models/operations/SplitItemRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[SplitItemResponse](../../models/operations/SplitItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addSubtitles

Add a subtitle to a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="addSubtitles" method="get" path="/library/metadata/{ids}/subtitles" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddSubtitlesRequest;
import dev.plexapi.sdk.models.operations.AddSubtitlesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        AddSubtitlesRequest req = AddSubtitlesRequest.builder()
                .ids("<value>")
                .forced(BoolInt.ONE)
                .hearingImpaired(BoolInt.ONE)
                .build();

        AddSubtitlesResponse res = sdk.library().addSubtitles()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AddSubtitlesRequest](../../models/operations/AddSubtitlesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[AddSubtitlesResponse](../../models/operations/AddSubtitlesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getItemTree

Get a tree of metadata items, such as the seasons/episodes of a show

### Example Usage

<!-- UsageSnippet language="java" operationID="getItemTree" method="get" path="/library/metadata/{ids}/tree" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetItemTreeRequest;
import dev.plexapi.sdk.models.operations.GetItemTreeResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetItemTreeRequest req = GetItemTreeRequest.builder()
                .ids("<value>")
                .build();

        GetItemTreeResponse res = sdk.library().getItemTree()
                .request(req)
                .call();

        if (res.mediaContainerWithNestedMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetItemTreeRequest](../../models/operations/GetItemTreeRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetItemTreeResponse](../../models/operations/GetItemTreeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unmatch

Unmatch a metadata item to info fetched from the agent

### Example Usage

<!-- UsageSnippet language="java" operationID="unmatch" method="put" path="/library/metadata/{ids}/unmatch" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UnmatchRequest;
import dev.plexapi.sdk.models.operations.UnmatchResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        UnmatchRequest req = UnmatchRequest.builder()
                .ids("<value>")
                .build();

        UnmatchResponse res = sdk.library().unmatch()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [UnmatchRequest](../../models/operations/UnmatchRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[UnmatchResponse](../../models/operations/UnmatchResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listTopUsers

Get the list of users which have played this item starting with the most

### Example Usage

<!-- UsageSnippet language="java" operationID="listTopUsers" method="get" path="/library/metadata/{ids}/users/top" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListTopUsersRequest;
import dev.plexapi.sdk.models.operations.ListTopUsersResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListTopUsersRequest req = ListTopUsersRequest.builder()
                .ids("<value>")
                .build();

        ListTopUsersResponse res = sdk.library().listTopUsers()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ListTopUsersRequest](../../models/operations/ListTopUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ListTopUsersResponse](../../models/operations/ListTopUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## detectVoiceActivity

Start the detection of voice in a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="detectVoiceActivity" method="put" path="/library/metadata/{ids}/voiceActivity" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DetectVoiceActivityRequest;
import dev.plexapi.sdk.models.operations.DetectVoiceActivityResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DetectVoiceActivityRequest req = DetectVoiceActivityRequest.builder()
                .ids("<value>")
                .force(BoolInt.ONE)
                .manual(BoolInt.ONE)
                .build();

        DetectVoiceActivityResponse res = sdk.library().detectVoiceActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DetectVoiceActivityRequest](../../models/operations/DetectVoiceActivityRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DetectVoiceActivityResponse](../../models/operations/DetectVoiceActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAugmentationStatus

Get augmentation status and potentially wait for completion

### Example Usage

<!-- UsageSnippet language="java" operationID="getAugmentationStatus" method="get" path="/library/metadata/augmentations/{augmentationId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAugmentationStatusRequest;
import dev.plexapi.sdk.models.operations.GetAugmentationStatusResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetAugmentationStatusRequest req = GetAugmentationStatusRequest.builder()
                .augmentationId("<id>")
                .wait_(BoolInt.ONE)
                .build();

        GetAugmentationStatusResponse res = sdk.library().getAugmentationStatus()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetAugmentationStatusRequest](../../models/operations/GetAugmentationStatusRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetAugmentationStatusResponse](../../models/operations/GetAugmentationStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setStreamSelection

Set which streams (audio/subtitle) are selected by this user

### Example Usage

<!-- UsageSnippet language="java" operationID="setStreamSelection" method="put" path="/library/parts/{partId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SetStreamSelectionRequest;
import dev.plexapi.sdk.models.operations.SetStreamSelectionResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        SetStreamSelectionRequest req = SetStreamSelectionRequest.builder()
                .partId(360489L)
                .allParts(BoolInt.ONE)
                .build();

        SetStreamSelectionResponse res = sdk.library().setStreamSelection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [SetStreamSelectionRequest](../../models/operations/SetStreamSelectionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[SetStreamSelectionResponse](../../models/operations/SetStreamSelectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPerson

Get details for a single actor.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPerson" method="get" path="/library/people/{personId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPersonRequest;
import dev.plexapi.sdk.models.operations.GetPersonResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetPersonRequest req = GetPersonRequest.builder()
                .personId("<id>")
                .build();

        GetPersonResponse res = sdk.library().getPerson()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetPersonRequest](../../models/operations/GetPersonRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetPersonResponse](../../models/operations/GetPersonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPersonMedia

Get all the media for a single actor.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPersonMedia" method="get" path="/library/people/{personId}/media" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListPersonMediaRequest;
import dev.plexapi.sdk.models.operations.ListPersonMediaResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListPersonMediaRequest req = ListPersonMediaRequest.builder()
                .personId("<id>")
                .build();

        ListPersonMediaResponse res = sdk.library().listPersonMedia()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [ListPersonMediaRequest](../../models/operations/ListPersonMediaRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[ListPersonMediaResponse](../../models/operations/ListPersonMediaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteLibrarySection

Delete a library section by id

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteLibrarySection" method="delete" path="/library/sections/{sectionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteLibrarySectionRequest;
import dev.plexapi.sdk.models.operations.DeleteLibrarySectionResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteLibrarySectionRequest req = DeleteLibrarySectionRequest.builder()
                .sectionId("<id>")
                .async(BoolInt.ONE)
                .build();

        DeleteLibrarySectionResponse res = sdk.library().deleteLibrarySection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [DeleteLibrarySectionRequest](../../models/operations/DeleteLibrarySectionRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[DeleteLibrarySectionResponse](../../models/operations/DeleteLibrarySectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLibraryDetails

Returns details for the library. This can be thought of as an interstitial endpoint because it contains information about the library, rather than content itself. It often contains a list of `Directory` metadata objects: These used to be used by clients to build a menuing system.

### Example Usage

<!-- UsageSnippet language="java" operationID="getLibraryDetails" method="get" path="/library/sections/{sectionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetLibraryDetailsRequest;
import dev.plexapi.sdk.models.operations.GetLibraryDetailsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetLibraryDetailsRequest req = GetLibraryDetailsRequest.builder()
                .sectionId("<id>")
                .includeDetails(BoolInt.ONE)
                .build();

        GetLibraryDetailsResponse res = sdk.library().getLibraryDetails()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLibraryDetailsRequest](../../models/operations/GetLibraryDetailsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLibraryDetailsResponse](../../models/operations/GetLibraryDetailsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## editSection

Edit a library section by id setting parameters

### Example Usage

<!-- UsageSnippet language="java" operationID="editSection" method="put" path="/library/sections/{sectionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;
import java.util.List;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        EditSectionRequest req = EditSectionRequest.builder()
                .sectionId("<id>")
                .agent("<value>")
                .locations(List.of(
                    "O:\fatboy\\Media\\Ripped\\Music",
                    "O:\fatboy\\Media\\My Music"))
                .prefs(EditSectionQueryParamPrefs.builder()
                    .build())
                .build();

        EditSectionResponse res = sdk.library().editSection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [EditSectionRequest](../../models/operations/EditSectionRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[EditSectionResponse](../../models/operations/EditSectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateItems

This endpoint takes an large possible set of values.  Here are some examples.
- **Parameters, extra documentation**
  - artist.title.value
      - When used with track, both artist.title.value and album.title.value need to be specified
  - title.value usage
      - Summary
          - Tracks always rename and never merge
          - Albums and Artists
              - if single item and item without title does not exist, it is renamed.
              - if single item and item with title does exist they are merged.
              - if multiple they are always merged.
      - Tracks
          - Works as expected will update the track's title
          - Single track:    `/library/sections/{id}/all?type=10&id=42&title.value=NewName`
          - Multiple tracks: `/library/sections/{id}/all?type=10&id=42,43,44&title.value=NewName`
          - All tracks:      `/library/sections/{id}/all?type=10&title.value=NewName`
      - Albums
          - Functionality changes depending on the existence of an album with the same title
          - Album exists
              - Single album: `/library/sections/{id}/all?type=9&id=42&title.value=Album 2`
                  - Album with id 42 is merged into album titled "Album 2"
              - Multiple/All albums: `/library/sections/{id}/all?type=9&title.value=Moo Album`
                  - All albums are merged into the existing album titled "Moo Album"
          - Album does not exist
              - Single album: `/library/sections/{id}/all?type=9&id=42&title.value=NewAlbumTitle`
                  - Album with id 42 has title modified to "NewAlbumTitle"
              - Multiple/All albums: `/library/sections/{id}/all?type=9&title.value=NewAlbumTitle`
                  - All albums are merged into a new album with title="NewAlbumTitle"
      - Artists
          - Functionaly changes depending on the existence of an artist with the same title.
          - Artist exists
              - Single artist: `/library/sections/{id}/all?type=8&id=42&title.value=Artist 2`
                  - Artist with id 42 is merged into existing artist titled "Artist 2"
              - Multiple/All artists: `/library/sections/{id}/all?type=8&title.value=Artist 3`
                  - All artists are merged into the existing artist titled "Artist 3"
          - Artist does not exist
              - Single artist: `/library/sections/{id}/all?type=8&id=42&title.value=NewArtistTitle`
                  - Artist with id 42 has title modified to "NewArtistTitle"
              - Multiple/All artists: `/library/sections/{id}/all?type=8&title.value=NewArtistTitle`
                  - All artists are merged into a new artist with title="NewArtistTitle"

- **Notes**
    - Technically square brackets are not allowed in an URI except the Internet Protocol Literal Address
    - RFC3513: A host identified by an Internet Protocol literal address, version 6 [RFC3513] or later, is distinguished by enclosing the IP literal within square brackets ("[" and "]"). This is the only place where square bracket characters are allowed in the URI syntax.
    - Escaped square brackets are allowed, but don't render well

### Example Usage

<!-- UsageSnippet language="java" operationID="updateItems" method="put" path="/library/sections/{sectionId}/all" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UpdateItemsRequest;
import dev.plexapi.sdk.models.operations.UpdateItemsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        UpdateItemsRequest req = UpdateItemsRequest.builder()
                .sectionId("<id>")
                .fieldLocked(BoolInt.ONE)
                .build();

        UpdateItemsResponse res = sdk.library().updateItems()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UpdateItemsRequest](../../models/operations/UpdateItemsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[UpdateItemsResponse](../../models/operations/UpdateItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## startAnalysis

Start analysis of all items in a section.  If BIF generation is enabled, this will also be started on this section

### Example Usage

<!-- UsageSnippet language="java" operationID="startAnalysis" method="put" path="/library/sections/{sectionId}/analyze" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StartAnalysisRequest;
import dev.plexapi.sdk.models.operations.StartAnalysisResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        StartAnalysisRequest req = StartAnalysisRequest.builder()
                .sectionId(158829L)
                .build();

        StartAnalysisResponse res = sdk.library().startAnalysis()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [StartAnalysisRequest](../../models/operations/StartAnalysisRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[StartAnalysisResponse](../../models/operations/StartAnalysisResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## autocomplete

The field to autocomplete on is specified by the `{field}.query` parameter. For example `genre.query` or `title.query`.
Returns a set of items from the filtered items whose `{field}` starts with `{field}.query`.  In the results, a `{field}.queryRange` will be present to express the range of the match

### Example Usage

<!-- UsageSnippet language="java" operationID="autocomplete" method="get" path="/library/sections/{sectionId}/autocomplete" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AutocompleteRequest;
import dev.plexapi.sdk.models.operations.AutocompleteResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        AutocompleteRequest req = AutocompleteRequest.builder()
                .sectionId(942007L)
                .build();

        AutocompleteResponse res = sdk.library().autocomplete()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AutocompleteRequest](../../models/operations/AutocompleteRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[AutocompleteResponse](../../models/operations/AutocompleteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCollections

Get all collections in a section

### Example Usage

<!-- UsageSnippet language="java" operationID="getCollections" method="get" path="/library/sections/{sectionId}/collections" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCollectionsRequest;
import dev.plexapi.sdk.models.operations.GetCollectionsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetCollectionsRequest req = GetCollectionsRequest.builder()
                .sectionId(348838L)
                .build();

        GetCollectionsResponse res = sdk.library().getCollections()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetCollectionsRequest](../../models/operations/GetCollectionsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetCollectionsResponse](../../models/operations/GetCollectionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCommon

Represents a "Common" item. It contains only the common attributes of the items selected by the provided filter
Fields which are not common will be expressed in the `mixedFields` field

### Example Usage

<!-- UsageSnippet language="java" operationID="getCommon" method="get" path="/library/sections/{sectionId}/common" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCommonRequest;
import dev.plexapi.sdk.models.operations.GetCommonResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetCommonRequest req = GetCommonRequest.builder()
                .sectionId(298154L)
                .build();

        GetCommonResponse res = sdk.library().getCommon()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetCommonRequest](../../models/operations/GetCommonRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetCommonResponse](../../models/operations/GetCommonResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## emptyTrash

Empty trash in the section, permanently deleting media/metadata for missing media

### Example Usage

<!-- UsageSnippet language="java" operationID="emptyTrash" method="put" path="/library/sections/{sectionId}/emptyTrash" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.EmptyTrashRequest;
import dev.plexapi.sdk.models.operations.EmptyTrashResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        EmptyTrashRequest req = EmptyTrashRequest.builder()
                .sectionId(30052L)
                .build();

        EmptyTrashResponse res = sdk.library().emptyTrash()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [EmptyTrashRequest](../../models/operations/EmptyTrashRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[EmptyTrashResponse](../../models/operations/EmptyTrashResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSectionFilters

Get common filters on a section

### Example Usage

<!-- UsageSnippet language="java" operationID="getSectionFilters" method="get" path="/library/sections/{sectionId}/filters" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSectionFiltersRequest;
import dev.plexapi.sdk.models.operations.GetSectionFiltersResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetSectionFiltersRequest req = GetSectionFiltersRequest.builder()
                .sectionId(380557L)
                .build();

        GetSectionFiltersResponse res = sdk.library().getSectionFilters()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetSectionFiltersRequest](../../models/operations/GetSectionFiltersRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetSectionFiltersResponse](../../models/operations/GetSectionFiltersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFirstCharacters

Get list of first characters in this section

### Example Usage

<!-- UsageSnippet language="java" operationID="getFirstCharacters" method="get" path="/library/sections/{sectionId}/firstCharacters" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetFirstCharactersRequest;
import dev.plexapi.sdk.models.operations.GetFirstCharactersResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetFirstCharactersRequest req = GetFirstCharactersRequest.builder()
                .sectionId(3947L)
                .build();

        GetFirstCharactersResponse res = sdk.library().getFirstCharacters()
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
| `request`                                                                         | [GetFirstCharactersRequest](../../models/operations/GetFirstCharactersRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetFirstCharactersResponse](../../models/operations/GetFirstCharactersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteIndexes

Delete all the indexes in a section

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteIndexes" method="delete" path="/library/sections/{sectionId}/indexes" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteIndexesRequest;
import dev.plexapi.sdk.models.operations.DeleteIndexesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteIndexesRequest req = DeleteIndexesRequest.builder()
                .sectionId(588437L)
                .build();

        DeleteIndexesResponse res = sdk.library().deleteIndexes()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeleteIndexesRequest](../../models/operations/DeleteIndexesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeleteIndexesResponse](../../models/operations/DeleteIndexesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteIntros

Delete all the intro markers in a section

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteIntros" method="delete" path="/library/sections/{sectionId}/intros" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteIntrosRequest;
import dev.plexapi.sdk.models.operations.DeleteIntrosResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteIntrosRequest req = DeleteIntrosRequest.builder()
                .sectionId(498656L)
                .build();

        DeleteIntrosResponse res = sdk.library().deleteIntros()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteIntrosRequest](../../models/operations/DeleteIntrosRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteIntrosResponse](../../models/operations/DeleteIntrosResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSectionPreferences

Get the prefs for a section by id and potentially overriding the agent

### Example Usage

<!-- UsageSnippet language="java" operationID="getSectionPreferences" method="get" path="/library/sections/{sectionId}/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSectionPreferencesRequest;
import dev.plexapi.sdk.models.operations.GetSectionPreferencesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetSectionPreferencesRequest req = GetSectionPreferencesRequest.builder()
                .sectionId(754869L)
                .build();

        GetSectionPreferencesResponse res = sdk.library().getSectionPreferences()
                .request(req)
                .call();

        if (res.mediaContainerWithSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetSectionPreferencesRequest](../../models/operations/GetSectionPreferencesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetSectionPreferencesResponse](../../models/operations/GetSectionPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setSectionPreferences

Set the prefs for a section by id

### Example Usage

<!-- UsageSnippet language="java" operationID="setSectionPreferences" method="put" path="/library/sections/{sectionId}/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        SetSectionPreferencesRequest req = SetSectionPreferencesRequest.builder()
                .sectionId(349936L)
                .prefs(SetSectionPreferencesQueryParamPrefs.builder()
                    .build())
                .build();

        SetSectionPreferencesResponse res = sdk.library().setSectionPreferences()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [SetSectionPreferencesRequest](../../models/operations/SetSectionPreferencesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[SetSectionPreferencesResponse](../../models/operations/SetSectionPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## cancelRefresh

Cancel the refresh of a section

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelRefresh" method="delete" path="/library/sections/{sectionId}/refresh" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CancelRefreshRequest;
import dev.plexapi.sdk.models.operations.CancelRefreshResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        CancelRefreshRequest req = CancelRefreshRequest.builder()
                .sectionId(326852L)
                .build();

        CancelRefreshResponse res = sdk.library().cancelRefresh()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [CancelRefreshRequest](../../models/operations/CancelRefreshRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[CancelRefreshResponse](../../models/operations/CancelRefreshResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## refreshSection

Start a refresh of this section

### Example Usage

<!-- UsageSnippet language="java" operationID="refreshSection" method="post" path="/library/sections/{sectionId}/refresh" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RefreshSectionRequest;
import dev.plexapi.sdk.models.operations.RefreshSectionResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        RefreshSectionRequest req = RefreshSectionRequest.builder()
                .sectionId(450300L)
                .force(BoolInt.ONE)
                .build();

        RefreshSectionResponse res = sdk.library().refreshSection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [RefreshSectionRequest](../../models/operations/RefreshSectionRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[RefreshSectionResponse](../../models/operations/RefreshSectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAvailableSorts

Get the sort mechanisms available in a section

### Example Usage

<!-- UsageSnippet language="java" operationID="getAvailableSorts" method="get" path="/library/sections/{sectionId}/sorts" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAvailableSortsRequest;
import dev.plexapi.sdk.models.operations.GetAvailableSortsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetAvailableSortsRequest req = GetAvailableSortsRequest.builder()
                .sectionId(212498L)
                .build();

        GetAvailableSortsResponse res = sdk.library().getAvailableSorts()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetAvailableSortsRequest](../../models/operations/GetAvailableSortsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetAvailableSortsResponse](../../models/operations/GetAvailableSortsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getStreamLevels

The the loudness of a stream in db, one entry per 100ms

### Example Usage

<!-- UsageSnippet language="java" operationID="getStreamLevels" method="get" path="/library/streams/{streamId}/levels" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetStreamLevelsRequest;
import dev.plexapi.sdk.models.operations.GetStreamLevelsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetStreamLevelsRequest req = GetStreamLevelsRequest.builder()
                .streamId(447611L)
                .build();

        GetStreamLevelsResponse res = sdk.library().getStreamLevels()
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
| `request`                                                                   | [GetStreamLevelsRequest](../../models/operations/GetStreamLevelsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetStreamLevelsResponse](../../models/operations/GetStreamLevelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getStreamLoudness

The the loudness of a stream in db, one number per line, one entry per 100ms

### Example Usage

<!-- UsageSnippet language="java" operationID="getStreamLoudness" method="get" path="/library/streams/{streamId}/loudness" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetStreamLoudnessRequest;
import dev.plexapi.sdk.models.operations.GetStreamLoudnessResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetStreamLoudnessRequest req = GetStreamLoudnessRequest.builder()
                .streamId(277271L)
                .build();

        GetStreamLoudnessResponse res = sdk.library().getStreamLoudness()
                .request(req)
                .call();

        if (res.res().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetStreamLoudnessRequest](../../models/operations/GetStreamLoudnessRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetStreamLoudnessResponse](../../models/operations/GetStreamLoudnessResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getChapterImage

Get a single chapter image for a piece of media

### Example Usage

<!-- UsageSnippet language="java" operationID="getChapterImage" method="get" path="/library/media/{mediaId}/chapterImages/{chapter}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetChapterImageRequest;
import dev.plexapi.sdk.models.operations.GetChapterImageResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetChapterImageRequest req = GetChapterImageRequest.builder()
                .mediaId(892563L)
                .chapter(48348L)
                .build();

        GetChapterImageResponse res = sdk.library().getChapterImage()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetChapterImageRequest](../../models/operations/GetChapterImageRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetChapterImageResponse](../../models/operations/GetChapterImageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setItemArtwork

Set the artwork, thumb, element for a metadata item
Generally only the admin can perform this action.  The exception is if the metadata is a playlist created by the user

### Example Usage

<!-- UsageSnippet language="java" operationID="setItemArtwork" method="post" path="/library/metadata/{ids}/{element}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        SetItemArtworkRequest req = SetItemArtworkRequest.builder()
                .ids("<value>")
                .element(Element.BANNER)
                .build();

        SetItemArtworkResponse res = sdk.library().setItemArtwork()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SetItemArtworkRequest](../../models/operations/SetItemArtworkRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SetItemArtworkResponse](../../models/operations/SetItemArtworkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateItemArtwork

Set the artwork, thumb, element for a metadata item
Generally only the admin can perform this action.  The exception is if the metadata is a playlist created by the user

### Example Usage

<!-- UsageSnippet language="java" operationID="updateItemArtwork" method="put" path="/library/metadata/{ids}/{element}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        UpdateItemArtworkRequest req = UpdateItemArtworkRequest.builder()
                .ids("<value>")
                .element(PathParamElement.CLEAR_LOGO)
                .build();

        UpdateItemArtworkResponse res = sdk.library().updateItemArtwork()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [UpdateItemArtworkRequest](../../models/operations/UpdateItemArtworkRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[UpdateItemArtworkResponse](../../models/operations/UpdateItemArtworkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteMarker

Delete a marker for this user on the metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteMarker" method="delete" path="/library/metadata/{ids}/marker/{marker}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteMarkerRequest;
import dev.plexapi.sdk.models.operations.DeleteMarkerResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteMarkerRequest req = DeleteMarkerRequest.builder()
                .ids("<value>")
                .marker("<value>")
                .build();

        DeleteMarkerResponse res = sdk.library().deleteMarker()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteMarkerRequest](../../models/operations/DeleteMarkerRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteMarkerResponse](../../models/operations/DeleteMarkerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## editMarker

Edit a marker for this user on the metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="editMarker" method="put" path="/library/metadata/{ids}/marker/{marker}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        EditMarkerRequest req = EditMarkerRequest.builder()
                .ids("<value>")
                .marker("<value>")
                .type(884347L)
                .startTimeOffset(517251L)
                .attributes(QueryParamAttributes.builder()
                    .build())
                .build();

        EditMarkerResponse res = sdk.library().editMarker()
                .request(req)
                .call();

        if (res.postResponses200().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [EditMarkerRequest](../../models/operations/EditMarkerRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[EditMarkerResponse](../../models/operations/EditMarkerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteMediaItem

Delete a single media from a metadata item in the library

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteMediaItem" method="delete" path="/library/metadata/{ids}/media/{mediaItem}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteMediaItemRequest;
import dev.plexapi.sdk.models.operations.DeleteMediaItemResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteMediaItemRequest req = DeleteMediaItemRequest.builder()
                .ids("<value>")
                .mediaItem("<value>")
                .proxy(BoolInt.ONE)
                .build();

        DeleteMediaItemResponse res = sdk.library().deleteMediaItem()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [DeleteMediaItemRequest](../../models/operations/DeleteMediaItemRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[DeleteMediaItemResponse](../../models/operations/DeleteMediaItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPartIndex

Get BIF index for a part by index type

### Example Usage

<!-- UsageSnippet language="java" operationID="getPartIndex" method="get" path="/library/parts/{partId}/indexes/{index}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetPartIndexRequest req = GetPartIndexRequest.builder()
                .partId(724750L)
                .index(Index.SD)
                .build();

        GetPartIndexResponse res = sdk.library().getPartIndex()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetPartIndexRequest](../../models/operations/GetPartIndexRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetPartIndexResponse](../../models/operations/GetPartIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteCollection

Delete a library collection from the PMS

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCollection" method="delete" path="/library/sections/{sectionId}/collection/{collectionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteCollectionRequest;
import dev.plexapi.sdk.models.operations.DeleteCollectionResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteCollectionRequest req = DeleteCollectionRequest.builder()
                .sectionId(283619L)
                .collectionId(680895L)
                .build();

        DeleteCollectionResponse res = sdk.library().deleteCollection()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [DeleteCollectionRequest](../../models/operations/DeleteCollectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[DeleteCollectionResponse](../../models/operations/DeleteCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSectionImage

Get a composite image of images in this section

### Example Usage

<!-- UsageSnippet language="java" operationID="getSectionImage" method="get" path="/library/sections/{sectionId}/composite/{updatedAt}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSectionImageRequest;
import dev.plexapi.sdk.models.operations.GetSectionImageResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetSectionImageRequest req = GetSectionImageRequest.builder()
                .sectionId(925611L)
                .updatedAt(117413L)
                .build();

        GetSectionImageResponse res = sdk.library().getSectionImage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetSectionImageRequest](../../models/operations/GetSectionImageRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetSectionImageResponse](../../models/operations/GetSectionImageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteStream

Delete a stream.  Only applies to downloaded subtitle streams or a sidecar subtitle when media deletion is enabled.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteStream" method="delete" path="/library/streams/{streamId}.{ext}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteStreamRequest;
import dev.plexapi.sdk.models.operations.DeleteStreamResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DeleteStreamRequest req = DeleteStreamRequest.builder()
                .streamId(841510L)
                .ext("<value>")
                .build();

        DeleteStreamResponse res = sdk.library().deleteStream()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteStreamRequest](../../models/operations/DeleteStreamRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteStreamResponse](../../models/operations/DeleteStreamResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getStream

Get a stream (such as a sidecar subtitle stream)

### Example Usage

<!-- UsageSnippet language="java" operationID="getStream" method="get" path="/library/streams/{streamId}.{ext}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetStreamRequest;
import dev.plexapi.sdk.models.operations.GetStreamResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetStreamRequest req = GetStreamRequest.builder()
                .streamId(314506L)
                .ext("<value>")
                .autoAdjustSubtitle(BoolInt.ONE)
                .build();

        GetStreamResponse res = sdk.library().getStream()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetStreamRequest](../../models/operations/GetStreamRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetStreamResponse](../../models/operations/GetStreamResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setStreamOffset

Set a stream offset in ms.  This may not be respected by all clients

### Example Usage

<!-- UsageSnippet language="java" operationID="setStreamOffset" method="put" path="/library/streams/{streamId}.{ext}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SetStreamOffsetRequest;
import dev.plexapi.sdk.models.operations.SetStreamOffsetResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        SetStreamOffsetRequest req = SetStreamOffsetRequest.builder()
                .streamId(606295L)
                .ext("<value>")
                .build();

        SetStreamOffsetResponse res = sdk.library().setStreamOffset()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [SetStreamOffsetRequest](../../models/operations/SetStreamOffsetRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[SetStreamOffsetResponse](../../models/operations/SetStreamOffsetResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getItemArtwork

Get the artwork, thumb, element for a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="getItemArtwork" method="get" path="/library/metadata/{ids}/{element}/{timestamp}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetItemArtworkRequest req = GetItemArtworkRequest.builder()
                .ids("<value>")
                .element(GetItemArtworkPathParamElement.POSTER)
                .timestamp(999555L)
                .build();

        GetItemArtworkResponse res = sdk.library().getItemArtwork()
                .request(req)
                .call();

        if (res.twoHundredAudioMpeg3ResponseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetItemArtworkRequest](../../models/operations/GetItemArtworkRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetItemArtworkResponse](../../models/operations/GetItemArtworkResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMediaPart

Get a media part for streaming or download.
  - streaming: This is the default scenario.  Bandwidth usage on this endpoint will be guaranteed (on the server's end) to be at least the bandwidth reservation given in the decision.  If no decision exists, an ad-hoc decision will be created if sufficient bandwidth exists.  Clients should not rely on ad-hoc decisions being made as this may be removed in the future.
  - download: Indicated if the query parameter indicates this is a download.  Bandwidth will be prioritized behind playbacks and will get a fair share of what remains.


### Example Usage

<!-- UsageSnippet language="java" operationID="getMediaPart" method="get" path="/library/parts/{partId}/{changestamp}/{filename}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetMediaPartRequest;
import dev.plexapi.sdk.models.operations.GetMediaPartResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetMediaPartRequest req = GetMediaPartRequest.builder()
                .partId(877105L)
                .changestamp(970622L)
                .filename("example.file")
                .download(BoolInt.ONE)
                .build();

        GetMediaPartResponse res = sdk.library().getMediaPart()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetMediaPartRequest](../../models/operations/GetMediaPartRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetMediaPartResponse](../../models/operations/GetMediaPartResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getImageFromBif

Extract an image from the BIF for a part at a particular offset

### Example Usage

<!-- UsageSnippet language="java" operationID="getImageFromBif" method="get" path="/library/parts/{partId}/indexes/{index}/{offset}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("abc123")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetImageFromBifRequest req = GetImageFromBifRequest.builder()
                .partId(304273L)
                .index(PathParamIndex.SD)
                .offset(939569L)
                .build();

        GetImageFromBifResponse res = sdk.library().getImageFromBif()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetImageFromBifRequest](../../models/operations/GetImageFromBifRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetImageFromBifResponse](../../models/operations/GetImageFromBifResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |