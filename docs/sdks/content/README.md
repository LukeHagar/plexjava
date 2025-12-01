# Content
(*content()*)

## Overview

The actual content of the media provider

### Available Operations

* [getCollectionItems](#getcollectionitems) - Get items in a collection
* [getMetadataItem](#getmetadataitem) - Get a metadata item
* [getAlbums](#getalbums) - Set section albums
* [listContent](#listcontent) - Get items in the section
* [getAllLeaves](#getallleaves) - Set section leaves
* [getArts](#getarts) - Set section artwork
* [getCategories](#getcategories) - Set section categories
* [getCluster](#getcluster) - Set section clusters
* [getSonicPath](#getsonicpath) - Similar tracks to transition from one to another
* [getFolders](#getfolders) - Get all folder locations
* [listMoments](#listmoments) - Set section moments
* [getSonicallySimilar](#getsonicallysimilar) - The nearest audio tracks
* [getCollectionImage](#getcollectionimage) - Get a collection's image

## getCollectionItems

Get items in a collection.  Note if this collection contains more than 100 items, paging must be used.

### Example Usage

<!-- UsageSnippet language="java" operationID="getCollectionItems" method="get" path="/library/collections/{collectionId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCollectionItemsRequest;
import dev.plexapi.sdk.models.operations.GetCollectionItemsResponse;
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

        GetCollectionItemsRequest req = GetCollectionItemsRequest.builder()
                .collectionId(314585L)
                .build();

        GetCollectionItemsResponse res = sdk.content().getCollectionItems()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCollectionItemsRequest](../../models/operations/GetCollectionItemsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCollectionItemsResponse](../../models/operations/GetCollectionItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMetadataItem

Get one or more metadata items.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMetadataItem" method="get" path="/library/metadata/{ids}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetMetadataItemRequest;
import dev.plexapi.sdk.models.operations.GetMetadataItemResponse;
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

        GetMetadataItemRequest req = GetMetadataItemRequest.builder()
                .ids(List.of())
                .asyncCheckFiles(BoolInt.True)
                .asyncRefreshLocalMediaAgent(BoolInt.True)
                .asyncRefreshAnalysis(BoolInt.True)
                .checkFiles(BoolInt.True)
                .skipRefresh(BoolInt.True)
                .checkFileAvailability(BoolInt.True)
                .asyncAugmentMetadata(BoolInt.True)
                .augmentCount(BoolInt.True)
                .build();

        GetMetadataItemResponse res = sdk.content().getMetadataItem()
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
| `request`                                                                   | [GetMetadataItemRequest](../../models/operations/GetMetadataItemRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetMetadataItemResponse](../../models/operations/GetMetadataItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAlbums

Get all albums in a music section

### Example Usage

<!-- UsageSnippet language="java" operationID="getAlbums" method="get" path="/library/sections/{sectionId}/albums" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAlbumsRequest;
import dev.plexapi.sdk.models.operations.GetAlbumsResponse;
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

        GetAlbumsRequest req = GetAlbumsRequest.builder()
                .sectionId(817133L)
                .build();

        GetAlbumsResponse res = sdk.content().getAlbums()
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
| `request`                                                       | [GetAlbumsRequest](../../models/operations/GetAlbumsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetAlbumsResponse](../../models/operations/GetAlbumsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listContent

Get the items in a section, potentially filtering them

### Example Usage

<!-- UsageSnippet language="java" operationID="listContent" method="get" path="/library/sections/{sectionId}/all" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListContentRequest;
import dev.plexapi.sdk.models.operations.ListContentResponse;
import dev.plexapi.sdk.models.shared.*;
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

        ListContentRequest req = ListContentRequest.builder()
                .sectionId("<id>")
                .mediaQuery(MediaQuery.builder()
                    .type(MediaType.Episode)
                    .sourceType(2L)
                    .sort("duration:desc,index")
                    .build())
                .includeMeta(BoolInt.True)
                .includeGuids(BoolInt.True)
                .build();

        ListContentResponse res = sdk.content().listContent()
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
| `request`                                                           | [ListContentRequest](../../models/operations/ListContentRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListContentResponse](../../models/operations/ListContentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAllLeaves

Get all leaves in a section (such as episodes in a show section)

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllLeaves" method="get" path="/library/sections/{sectionId}/allLeaves" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAllLeavesRequest;
import dev.plexapi.sdk.models.operations.GetAllLeavesResponse;
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

        GetAllLeavesRequest req = GetAllLeavesRequest.builder()
                .sectionId(633197L)
                .build();

        GetAllLeavesResponse res = sdk.content().getAllLeaves()
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
| `request`                                                             | [GetAllLeavesRequest](../../models/operations/GetAllLeavesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetAllLeavesResponse](../../models/operations/GetAllLeavesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getArts

Get artwork for a library section

### Example Usage

<!-- UsageSnippet language="java" operationID="getArts" method="get" path="/library/sections/{sectionId}/arts" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetArtsRequest;
import dev.plexapi.sdk.models.operations.GetArtsResponse;
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

        GetArtsRequest req = GetArtsRequest.builder()
                .sectionId(859200L)
                .build();

        GetArtsResponse res = sdk.content().getArts()
                .request(req)
                .call();

        if (res.mediaContainerWithArtwork().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [GetArtsRequest](../../models/operations/GetArtsRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[GetArtsResponse](../../models/operations/GetArtsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCategories

Get categories in a library section

### Example Usage

<!-- UsageSnippet language="java" operationID="getCategories" method="get" path="/library/sections/{sectionId}/categories" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCategoriesRequest;
import dev.plexapi.sdk.models.operations.GetCategoriesResponse;
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

        GetCategoriesRequest req = GetCategoriesRequest.builder()
                .sectionId(21841L)
                .build();

        GetCategoriesResponse res = sdk.content().getCategories()
                .request(req)
                .call();

        if (res.mediaContainerWithArtwork().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetCategoriesRequest](../../models/operations/GetCategoriesRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetCategoriesResponse](../../models/operations/GetCategoriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCluster

Get clusters in a library section (typically for photos)

### Example Usage

<!-- UsageSnippet language="java" operationID="getCluster" method="get" path="/library/sections/{sectionId}/cluster" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetClusterRequest;
import dev.plexapi.sdk.models.operations.GetClusterResponse;
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

        GetClusterRequest req = GetClusterRequest.builder()
                .sectionId(138560L)
                .build();

        GetClusterResponse res = sdk.content().getCluster()
                .request(req)
                .call();

        if (res.mediaContainerWithArtwork().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetClusterRequest](../../models/operations/GetClusterRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetClusterResponse](../../models/operations/GetClusterResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSonicPath

Get a list of audio tracks starting at one and ending at another which are similar across the path

### Example Usage

<!-- UsageSnippet language="java" operationID="getSonicPath" method="get" path="/library/sections/{sectionId}/computePath" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSonicPathRequest;
import dev.plexapi.sdk.models.operations.GetSonicPathResponse;
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

        GetSonicPathRequest req = GetSonicPathRequest.builder()
                .sectionId(914549L)
                .startID(629990L)
                .endID(687740L)
                .build();

        GetSonicPathResponse res = sdk.content().getSonicPath()
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
| `request`                                                             | [GetSonicPathRequest](../../models/operations/GetSonicPathRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetSonicPathResponse](../../models/operations/GetSonicPathResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFolders

Get all folder locations of the media in a section

### Example Usage

<!-- UsageSnippet language="java" operationID="getFolders" method="get" path="/library/sections/{sectionId}/location" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetFoldersRequest;
import dev.plexapi.sdk.models.operations.GetFoldersResponse;
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

        GetFoldersRequest req = GetFoldersRequest.builder()
                .sectionId(892532L)
                .build();

        GetFoldersResponse res = sdk.content().getFolders()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetFoldersRequest](../../models/operations/GetFoldersRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetFoldersResponse](../../models/operations/GetFoldersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listMoments

Get moments in a library section (typically for photos)

### Example Usage

<!-- UsageSnippet language="java" operationID="listMoments" method="get" path="/library/sections/{sectionId}/moment" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListMomentsRequest;
import dev.plexapi.sdk.models.operations.ListMomentsResponse;
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

        ListMomentsRequest req = ListMomentsRequest.builder()
                .sectionId(403239L)
                .build();

        ListMomentsResponse res = sdk.content().listMoments()
                .request(req)
                .call();

        if (res.mediaContainerWithArtwork().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListMomentsRequest](../../models/operations/ListMomentsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListMomentsResponse](../../models/operations/ListMomentsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSonicallySimilar

Get the nearest audio tracks to a particular analysis

### Example Usage

<!-- UsageSnippet language="java" operationID="getSonicallySimilar" method="get" path="/library/sections/{sectionId}/nearest" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSonicallySimilarRequest;
import dev.plexapi.sdk.models.operations.GetSonicallySimilarResponse;
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

        GetSonicallySimilarRequest req = GetSonicallySimilarRequest.builder()
                .sectionId(525956L)
                .values(List.of())
                .build();

        GetSonicallySimilarResponse res = sdk.content().getSonicallySimilar()
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
| `request`                                                                           | [GetSonicallySimilarRequest](../../models/operations/GetSonicallySimilarRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetSonicallySimilarResponse](../../models/operations/GetSonicallySimilarResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCollectionImage

Get an image for the collection based on the items within

### Example Usage

<!-- UsageSnippet language="java" operationID="getCollectionImage" method="get" path="/library/collections/{collectionId}/composite/{updatedAt}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCollectionImageRequest;
import dev.plexapi.sdk.models.operations.GetCollectionImageResponse;
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

        GetCollectionImageRequest req = GetCollectionImageRequest.builder()
                .collectionId(474227L)
                .updatedAt(759379L)
                .build();

        GetCollectionImageResponse res = sdk.content().getCollectionImage()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetCollectionImageRequest](../../models/operations/GetCollectionImageRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetCollectionImageResponse](../../models/operations/GetCollectionImageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |