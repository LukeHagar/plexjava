# Timeline
(*timeline()*)

## Overview

The actions feature within a media provider

### Available Operations

* [markPlayed](#markplayed) - Mark an item as played
* [report](#report) - Report media timeline
* [unscrobble](#unscrobble) - Mark an item as unplayed

## markPlayed

Mark an item as played.  Note, this does not create any view history of this item but rather just sets the state as played. The client must provide either the `key` or `uri` query parameter
This API does respond to the GET verb but applications should use PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="markPlayed" method="put" path="/:/scrobble" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.MarkPlayedRequest;
import dev.plexapi.sdk.models.operations.MarkPlayedResponse;
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

        MarkPlayedRequest req = MarkPlayedRequest.builder()
                .identifier("<value>")
                .key("59398")
                .build();

        MarkPlayedResponse res = sdk.timeline().markPlayed()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [MarkPlayedRequest](../../models/operations/MarkPlayedRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[MarkPlayedResponse](../../models/operations/MarkPlayedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## report

This endpoint is hit during media playback for an item. It must be hit whenever the play state changes, or in the absence of a play state change, in a regular fashion (generally this means every 10 seconds on a LAN/WAN, and every 20 seconds over cellular).


### Example Usage

<!-- UsageSnippet language="java" operationID="report" method="post" path="/:/timeline" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
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

        ReportRequest req = ReportRequest.builder()
                .key("/foo")
                .ratingKey("xyz")
                .state(State.PLAYING)
                .playQueueItemID("123")
                .time(0L)
                .duration(10000L)
                .continuing(BoolInt.ONE)
                .updated(14200000L)
                .offline(BoolInt.ONE)
                .timeToFirstFrame(1000L)
                .timeStalled(1000L)
                .bandwidth(100L)
                .bufferedTime(100L)
                .bufferedSize(1024L)
                .build();

        ReportResponse res = sdk.timeline().report()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [ReportRequest](../../models/operations/ReportRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[ReportResponse](../../models/operations/ReportResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unscrobble

Mark an item as unplayed. The client must provide either the `key` or `uri` query parameter
This API does respond to the GET verb but applications should use PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="unscrobble" method="put" path="/:/unscrobble" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UnscrobbleRequest;
import dev.plexapi.sdk.models.operations.UnscrobbleResponse;
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

        UnscrobbleRequest req = UnscrobbleRequest.builder()
                .identifier("<value>")
                .build();

        UnscrobbleResponse res = sdk.timeline().unscrobble()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [UnscrobbleRequest](../../models/operations/UnscrobbleRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[UnscrobbleResponse](../../models/operations/UnscrobbleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |