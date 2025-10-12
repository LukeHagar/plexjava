# DownloadQueue
(*downloadQueue()*)

## Overview

API Operations against the Download Queue

### Available Operations

* [createDownloadQueue](#createdownloadqueue) - Create download queue
* [getDownloadQueue](#getdownloadqueue) - Get a download queue
* [addDownloadQueueItems](#adddownloadqueueitems) - Add to download queue
* [listDownloadQueueItems](#listdownloadqueueitems) - Get download queue items
* [getItemDecision](#getitemdecision) - Grab download queue item decision
* [getDownloadQueueMedia](#getdownloadqueuemedia) - Grab download queue media
* [removeDownloadQueueItems](#removedownloadqueueitems) - Delete download queue items
* [getDownloadQueueItems](#getdownloadqueueitems) - Get download queue items
* [restartProcessingDownloadQueueItems](#restartprocessingdownloadqueueitems) - Restart processing of items from the decision

## createDownloadQueue

Available: 0.2.0

Creates a download queue for this client if one doesn't exist, or returns the existing queue for this client and user.


### Example Usage

<!-- UsageSnippet language="java" operationID="createDownloadQueue" method="post" path="/downloadQueue" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CreateDownloadQueueResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        CreateDownloadQueueResponse res = sdk.downloadQueue().createDownloadQueue()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[CreateDownloadQueueResponse](../../models/operations/CreateDownloadQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDownloadQueue

Available: 0.2.0

Get a download queue by its id


### Example Usage

<!-- UsageSnippet language="java" operationID="getDownloadQueue" method="get" path="/downloadQueue/{queueId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetDownloadQueueRequest;
import dev.plexapi.sdk.models.operations.GetDownloadQueueResponse;
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

        GetDownloadQueueRequest req = GetDownloadQueueRequest.builder()
                .queueId(922802L)
                .build();

        GetDownloadQueueResponse res = sdk.downloadQueue().getDownloadQueue()
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
| `request`                                                                     | [GetDownloadQueueRequest](../../models/operations/GetDownloadQueueRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetDownloadQueueResponse](../../models/operations/GetDownloadQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addDownloadQueueItems

Available: 0.2.0

Add items to the download queue


### Example Usage

<!-- UsageSnippet language="java" operationID="addDownloadQueueItems" method="post" path="/downloadQueue/{queueId}/add" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddDownloadQueueItemsRequest;
import dev.plexapi.sdk.models.operations.AddDownloadQueueItemsResponse;
import dev.plexapi.sdk.models.shared.*;
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

        AddDownloadQueueItemsRequest req = AddDownloadQueueItemsRequest.builder()
                .queueId(984925L)
                .keys(List.of(
                    "/library/metadata/3",
                    "/library/metadata/6"))
                .advancedSubtitles(AdvancedSubtitles.BURN)
                .audioBoost(50L)
                .audioChannelCount(5L)
                .autoAdjustQuality(BoolInt.ONE)
                .autoAdjustSubtitle(BoolInt.ONE)
                .directPlay(BoolInt.ONE)
                .directStream(BoolInt.ONE)
                .directStreamAudio(BoolInt.ONE)
                .disableResolutionRotation(BoolInt.ONE)
                .hasMDE(BoolInt.ONE)
                .location(Location.WAN)
                .mediaBufferSize(102400L)
                .mediaIndex(0L)
                .musicBitrate(5000L)
                .offset(90.5)
                .partIndex(0L)
                .path("/library/metadata/151671")
                .peakBitrate(12000L)
                .photoResolution("1080x1080")
                .protocol(Protocol.DASH)
                .secondsPerSegment(5L)
                .subtitleSize(50L)
                .videoBitrate(12000L)
                .videoQuality(50L)
                .videoResolution("1080x1080")
                .build();

        AddDownloadQueueItemsResponse res = sdk.downloadQueue().addDownloadQueueItems()
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
| `request`                                                                               | [AddDownloadQueueItemsRequest](../../models/operations/AddDownloadQueueItemsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[AddDownloadQueueItemsResponse](../../models/operations/AddDownloadQueueItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDownloadQueueItems

Available: 0.2.0

Get items from a download queue


### Example Usage

<!-- UsageSnippet language="java" operationID="listDownloadQueueItems" method="get" path="/downloadQueue/{queueId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListDownloadQueueItemsRequest;
import dev.plexapi.sdk.models.operations.ListDownloadQueueItemsResponse;
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

        ListDownloadQueueItemsRequest req = ListDownloadQueueItemsRequest.builder()
                .queueId(524138L)
                .build();

        ListDownloadQueueItemsResponse res = sdk.downloadQueue().listDownloadQueueItems()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `request`                                                                                 | [ListDownloadQueueItemsRequest](../../models/operations/ListDownloadQueueItemsRequest.md) | :heavy_check_mark:                                                                        | The request object to use for the request.                                                |

### Response

**[ListDownloadQueueItemsResponse](../../models/operations/ListDownloadQueueItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getItemDecision

Available: 0.2.0

Grab the decision for a download queue item


### Example Usage

<!-- UsageSnippet language="java" operationID="getItemDecision" method="get" path="/downloadQueue/{queueId}/item/{itemId}/decision" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetItemDecisionRequest;
import dev.plexapi.sdk.models.operations.GetItemDecisionResponse;
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

        GetItemDecisionRequest req = GetItemDecisionRequest.builder()
                .queueId(231605L)
                .itemId(32L)
                .build();

        GetItemDecisionResponse res = sdk.downloadQueue().getItemDecision()
                .request(req)
                .call();

        if (res.mediaContainerWithDecision().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetItemDecisionRequest](../../models/operations/GetItemDecisionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetItemDecisionResponse](../../models/operations/GetItemDecisionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDownloadQueueMedia

Available: 0.2.0

Grab the media for a download queue item


### Example Usage

<!-- UsageSnippet language="java" operationID="getDownloadQueueMedia" method="get" path="/downloadQueue/{queueId}/item/{itemId}/media" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetDownloadQueueMediaRequest;
import dev.plexapi.sdk.models.operations.GetDownloadQueueMediaResponse;
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

        GetDownloadQueueMediaRequest req = GetDownloadQueueMediaRequest.builder()
                .queueId(663184L)
                .itemId(32L)
                .build();

        GetDownloadQueueMediaResponse res = sdk.downloadQueue().getDownloadQueueMedia()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetDownloadQueueMediaRequest](../../models/operations/GetDownloadQueueMediaRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetDownloadQueueMediaResponse](../../models/operations/GetDownloadQueueMediaResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDownloadQueueItems

delete items from a download queue

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDownloadQueueItems" method="delete" path="/downloadQueue/{queueId}/items/{itemId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RemoveDownloadQueueItemsRequest;
import dev.plexapi.sdk.models.operations.RemoveDownloadQueueItemsResponse;
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

        RemoveDownloadQueueItemsRequest req = RemoveDownloadQueueItemsRequest.builder()
                .queueId(946275L)
                .itemId(List.of(
                    32L,
                    345L,
                    23L))
                .build();

        RemoveDownloadQueueItemsResponse res = sdk.downloadQueue().removeDownloadQueueItems()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `request`                                                                                     | [RemoveDownloadQueueItemsRequest](../../models/operations/RemoveDownloadQueueItemsRequest.md) | :heavy_check_mark:                                                                            | The request object to use for the request.                                                    |

### Response

**[RemoveDownloadQueueItemsResponse](../../models/operations/RemoveDownloadQueueItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDownloadQueueItems

Available: 0.2.0

Get items from a download queue


### Example Usage

<!-- UsageSnippet language="java" operationID="getDownloadQueueItems" method="get" path="/downloadQueue/{queueId}/items/{itemId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetDownloadQueueItemsRequest;
import dev.plexapi.sdk.models.operations.GetDownloadQueueItemsResponse;
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

        GetDownloadQueueItemsRequest req = GetDownloadQueueItemsRequest.builder()
                .queueId(809886L)
                .itemId(List.of(
                    32L,
                    345L,
                    23L))
                .build();

        GetDownloadQueueItemsResponse res = sdk.downloadQueue().getDownloadQueueItems()
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
| `request`                                                                               | [GetDownloadQueueItemsRequest](../../models/operations/GetDownloadQueueItemsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetDownloadQueueItemsResponse](../../models/operations/GetDownloadQueueItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## restartProcessingDownloadQueueItems

Available: 0.2.0

Reprocess download queue items with previous decision parameters


### Example Usage

<!-- UsageSnippet language="java" operationID="restartProcessingDownloadQueueItems" method="post" path="/downloadQueue/{queueId}/items/{itemId}/restart" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RestartProcessingDownloadQueueItemsRequest;
import dev.plexapi.sdk.models.operations.RestartProcessingDownloadQueueItemsResponse;
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

        RestartProcessingDownloadQueueItemsRequest req = RestartProcessingDownloadQueueItemsRequest.builder()
                .queueId(713001L)
                .itemId(List.of(
                    32L,
                    345L,
                    23L))
                .build();

        RestartProcessingDownloadQueueItemsResponse res = sdk.downloadQueue().restartProcessingDownloadQueueItems()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                           | Type                                                                                                                | Required                                                                                                            | Description                                                                                                         |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                           | [RestartProcessingDownloadQueueItemsRequest](../../models/operations/RestartProcessingDownloadQueueItemsRequest.md) | :heavy_check_mark:                                                                                                  | The request object to use for the request.                                                                          |

### Response

**[RestartProcessingDownloadQueueItemsResponse](../../models/operations/RestartProcessingDownloadQueueItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |