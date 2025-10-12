# Hubs
(*hubs()*)

## Overview

The hubs within a media provider

### Available Operations

* [getAllHubs](#getallhubs) - Get global hubs
* [getContinueWatching](#getcontinuewatching) - Get the continue watching hub
* [getHubItems](#gethubitems) - Get a hub's items
* [getPromotedHubs](#getpromotedhubs) - Get the hubs which are promoted
* [getMetadataHubs](#getmetadatahubs) - Get hubs for section by metadata item
* [getPostplayHubs](#getpostplayhubs) - Get postplay hubs
* [getRelatedHubs](#getrelatedhubs) - Get related hubs
* [getSectionHubs](#getsectionhubs) - Get section hubs
* [resetSectionDefaults](#resetsectiondefaults) - Reset hubs to defaults
* [listHubs](#listhubs) - Get hubs
* [createCustomHub](#createcustomhub) - Create a custom hub
* [moveHub](#movehub) - Move Hub
* [deleteCustomHub](#deletecustomhub) - Delete a custom hub
* [updateHubVisibility](#updatehubvisibility) - Change hub visibility

## getAllHubs

Get the global hubs in this PMS

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllHubs" method="get" path="/hubs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAllHubsRequest;
import dev.plexapi.sdk.models.operations.GetAllHubsResponse;
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

        GetAllHubsRequest req = GetAllHubsRequest.builder()
                .onlyTransient(BoolInt.ONE)
                .build();

        GetAllHubsResponse res = sdk.hubs().getAllHubs()
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
| `request`                                                         | [GetAllHubsRequest](../../models/operations/GetAllHubsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[GetAllHubsResponse](../../models/operations/GetAllHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getContinueWatching

Get the global continue watching hub

### Example Usage

<!-- UsageSnippet language="java" operationID="getContinueWatching" method="get" path="/hubs/continueWatching" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetContinueWatchingRequest;
import dev.plexapi.sdk.models.operations.GetContinueWatchingResponse;
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

        GetContinueWatchingRequest req = GetContinueWatchingRequest.builder()
                .build();

        GetContinueWatchingResponse res = sdk.hubs().getContinueWatching()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetContinueWatchingRequest](../../models/operations/GetContinueWatchingRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetContinueWatchingResponse](../../models/operations/GetContinueWatchingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHubItems

Get the items within a single hub specified by identifier

### Example Usage

<!-- UsageSnippet language="java" operationID="getHubItems" method="get" path="/hubs/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetHubItemsRequest;
import dev.plexapi.sdk.models.operations.GetHubItemsResponse;
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

        GetHubItemsRequest req = GetHubItemsRequest.builder()
                .identifier(List.of(
                    "<value 1>",
                    "<value 2>",
                    "<value 3>"))
                .build();

        GetHubItemsResponse res = sdk.hubs().getHubItems()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetHubItemsRequest](../../models/operations/GetHubItemsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetHubItemsResponse](../../models/operations/GetHubItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPromotedHubs

Get the global hubs which are promoted (should be displayed on the home screen)

### Example Usage

<!-- UsageSnippet language="java" operationID="getPromotedHubs" method="get" path="/hubs/promoted" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPromotedHubsRequest;
import dev.plexapi.sdk.models.operations.GetPromotedHubsResponse;
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

        GetPromotedHubsRequest req = GetPromotedHubsRequest.builder()
                .build();

        GetPromotedHubsResponse res = sdk.hubs().getPromotedHubs()
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
| `request`                                                                   | [GetPromotedHubsRequest](../../models/operations/GetPromotedHubsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetPromotedHubsResponse](../../models/operations/GetPromotedHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMetadataHubs

Get the hubs for a section by metadata item.  Currently only for music sections

### Example Usage

<!-- UsageSnippet language="java" operationID="getMetadataHubs" method="get" path="/hubs/metadata/{metadataId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetMetadataHubsRequest;
import dev.plexapi.sdk.models.operations.GetMetadataHubsResponse;
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

        GetMetadataHubsRequest req = GetMetadataHubsRequest.builder()
                .metadataId(605482L)
                .onlyTransient(BoolInt.ONE)
                .build();

        GetMetadataHubsResponse res = sdk.hubs().getMetadataHubs()
                .request(req)
                .call();

        if (res.mediaContainerWithHubs().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetMetadataHubsRequest](../../models/operations/GetMetadataHubsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetMetadataHubsResponse](../../models/operations/GetMetadataHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPostplayHubs

Get the hubs for a metadata to be displayed in post play

### Example Usage

<!-- UsageSnippet language="java" operationID="getPostplayHubs" method="get" path="/hubs/metadata/{metadataId}/postplay" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPostplayHubsRequest;
import dev.plexapi.sdk.models.operations.GetPostplayHubsResponse;
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

        GetPostplayHubsRequest req = GetPostplayHubsRequest.builder()
                .metadataId(441419L)
                .onlyTransient(BoolInt.ONE)
                .build();

        GetPostplayHubsResponse res = sdk.hubs().getPostplayHubs()
                .request(req)
                .call();

        if (res.mediaContainerWithHubs().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetPostplayHubsRequest](../../models/operations/GetPostplayHubsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetPostplayHubsResponse](../../models/operations/GetPostplayHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getRelatedHubs

Get the hubs for a metadata related to the provided metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="getRelatedHubs" method="get" path="/hubs/metadata/{metadataId}/related" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetRelatedHubsRequest;
import dev.plexapi.sdk.models.operations.GetRelatedHubsResponse;
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

        GetRelatedHubsRequest req = GetRelatedHubsRequest.builder()
                .metadataId(8858L)
                .onlyTransient(BoolInt.ONE)
                .build();

        GetRelatedHubsResponse res = sdk.hubs().getRelatedHubs()
                .request(req)
                .call();

        if (res.mediaContainerWithHubs().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetRelatedHubsRequest](../../models/operations/GetRelatedHubsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetRelatedHubsResponse](../../models/operations/GetRelatedHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSectionHubs

Get the hubs for a single section

### Example Usage

<!-- UsageSnippet language="java" operationID="getSectionHubs" method="get" path="/hubs/sections/{sectionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSectionHubsRequest;
import dev.plexapi.sdk.models.operations.GetSectionHubsResponse;
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

        GetSectionHubsRequest req = GetSectionHubsRequest.builder()
                .sectionId(336924L)
                .onlyTransient(BoolInt.ONE)
                .build();

        GetSectionHubsResponse res = sdk.hubs().getSectionHubs()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetSectionHubsRequest](../../models/operations/GetSectionHubsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetSectionHubsResponse](../../models/operations/GetSectionHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## resetSectionDefaults

Reset hubs for this section to defaults and delete custom hubs

### Example Usage

<!-- UsageSnippet language="java" operationID="resetSectionDefaults" method="delete" path="/hubs/sections/{sectionId}/manage" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ResetSectionDefaultsRequest;
import dev.plexapi.sdk.models.operations.ResetSectionDefaultsResponse;
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

        ResetSectionDefaultsRequest req = ResetSectionDefaultsRequest.builder()
                .sectionId(383022L)
                .build();

        ResetSectionDefaultsResponse res = sdk.hubs().resetSectionDefaults()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [ResetSectionDefaultsRequest](../../models/operations/ResetSectionDefaultsRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[ResetSectionDefaultsResponse](../../models/operations/ResetSectionDefaultsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listHubs

Get the list of hubs including both built-in and custom

### Example Usage

<!-- UsageSnippet language="java" operationID="listHubs" method="get" path="/hubs/sections/{sectionId}/manage" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListHubsRequest;
import dev.plexapi.sdk.models.operations.ListHubsResponse;
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

        ListHubsRequest req = ListHubsRequest.builder()
                .sectionId(442546L)
                .build();

        ListHubsResponse res = sdk.hubs().listHubs()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [ListHubsRequest](../../models/operations/ListHubsRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[ListHubsResponse](../../models/operations/ListHubsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createCustomHub

Create a custom hub based on a metadata item

### Example Usage

<!-- UsageSnippet language="java" operationID="createCustomHub" method="post" path="/hubs/sections/{sectionId}/manage" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CreateCustomHubRequest;
import dev.plexapi.sdk.models.operations.CreateCustomHubResponse;
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

        CreateCustomHubRequest req = CreateCustomHubRequest.builder()
                .sectionId(869922L)
                .metadataItemId(703843L)
                .promotedToRecommended(BoolInt.ONE)
                .promotedToOwnHome(BoolInt.ONE)
                .promotedToSharedHome(BoolInt.ONE)
                .build();

        CreateCustomHubResponse res = sdk.hubs().createCustomHub()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreateCustomHubRequest](../../models/operations/CreateCustomHubRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreateCustomHubResponse](../../models/operations/CreateCustomHubResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## moveHub

Changed the ordering of a hub among others hubs

### Example Usage

<!-- UsageSnippet language="java" operationID="moveHub" method="put" path="/hubs/sections/{sectionId}/manage/move" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.MoveHubRequest;
import dev.plexapi.sdk.models.operations.MoveHubResponse;
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

        MoveHubRequest req = MoveHubRequest.builder()
                .sectionId(755710L)
                .identifier("<value>")
                .build();

        MoveHubResponse res = sdk.hubs().moveHub()
                .request(req)
                .call();

        if (res.getResponses200().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [MoveHubRequest](../../models/operations/MoveHubRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[MoveHubResponse](../../models/operations/MoveHubResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteCustomHub

Delete a custom hub from the server

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteCustomHub" method="delete" path="/hubs/sections/{sectionId}/manage/{identifier}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteCustomHubRequest;
import dev.plexapi.sdk.models.operations.DeleteCustomHubResponse;
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

        DeleteCustomHubRequest req = DeleteCustomHubRequest.builder()
                .sectionId(625677L)
                .identifier("<value>")
                .build();

        DeleteCustomHubResponse res = sdk.hubs().deleteCustomHub()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [DeleteCustomHubRequest](../../models/operations/DeleteCustomHubRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[DeleteCustomHubResponse](../../models/operations/DeleteCustomHubResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHubVisibility

Changed the visibility of a hub for both the admin and shared users

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHubVisibility" method="put" path="/hubs/sections/{sectionId}/manage/{identifier}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UpdateHubVisibilityRequest;
import dev.plexapi.sdk.models.operations.UpdateHubVisibilityResponse;
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

        UpdateHubVisibilityRequest req = UpdateHubVisibilityRequest.builder()
                .sectionId(341650L)
                .identifier("<value>")
                .promotedToRecommended(BoolInt.ONE)
                .promotedToOwnHome(BoolInt.ONE)
                .promotedToSharedHome(BoolInt.ONE)
                .build();

        UpdateHubVisibilityResponse res = sdk.hubs().updateHubVisibility()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateHubVisibilityRequest](../../models/operations/UpdateHubVisibilityRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[UpdateHubVisibilityResponse](../../models/operations/UpdateHubVisibilityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |