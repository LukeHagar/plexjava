# LiveTV
(*liveTV()*)

## Overview

LiveTV contains the playback sessions of a channel from a DVR device


### Available Operations

* [getSessions](#getsessions) - Get all sessions
* [getLiveTVSession](#getlivetvsession) - Get a single session
* [getSessionPlaylistIndex](#getsessionplaylistindex) - Get a session playlist index
* [getSessionSegment](#getsessionsegment) - Get a single session segment

## getSessions

Get all livetv sessions and metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessions" method="get" path="/livetv/sessions" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSessionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetSessionsResponse res = sdk.liveTV().getSessions()
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSessionsResponse](../../models/operations/GetSessionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLiveTVSession

Get a single livetv session and metadata

### Example Usage

<!-- UsageSnippet language="java" operationID="getLiveTVSession" method="get" path="/livetv/sessions/{sessionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetLiveTVSessionRequest;
import dev.plexapi.sdk.models.operations.GetLiveTVSessionResponse;
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

        GetLiveTVSessionRequest req = GetLiveTVSessionRequest.builder()
                .sessionId("<id>")
                .build();

        GetLiveTVSessionResponse res = sdk.liveTV().getLiveTVSession()
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
| `request`                                                                     | [GetLiveTVSessionRequest](../../models/operations/GetLiveTVSessionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetLiveTVSessionResponse](../../models/operations/GetLiveTVSessionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSessionPlaylistIndex

Get a playlist index for playing this session

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionPlaylistIndex" method="get" path="/livetv/sessions/{sessionId}/{consumerId}/index.m3u8" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSessionPlaylistIndexRequest;
import dev.plexapi.sdk.models.operations.GetSessionPlaylistIndexResponse;
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

        GetSessionPlaylistIndexRequest req = GetSessionPlaylistIndexRequest.builder()
                .sessionId("<id>")
                .consumerId("<id>")
                .build();

        GetSessionPlaylistIndexResponse res = sdk.liveTV().getSessionPlaylistIndex()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [GetSessionPlaylistIndexRequest](../../models/operations/GetSessionPlaylistIndexRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[GetSessionPlaylistIndexResponse](../../models/operations/GetSessionPlaylistIndexResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSessionSegment

Get a single LiveTV session segment

### Example Usage

<!-- UsageSnippet language="java" operationID="getSessionSegment" method="get" path="/livetv/sessions/{sessionId}/{consumerId}/{segmentId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSessionSegmentRequest;
import dev.plexapi.sdk.models.operations.GetSessionSegmentResponse;
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

        GetSessionSegmentRequest req = GetSessionSegmentRequest.builder()
                .sessionId("<id>")
                .consumerId("<id>")
                .segmentId("<id>")
                .build();

        GetSessionSegmentResponse res = sdk.liveTV().getSessionSegment()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetSessionSegmentRequest](../../models/operations/GetSessionSegmentRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetSessionSegmentResponse](../../models/operations/GetSessionSegmentResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |