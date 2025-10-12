# Status
(*status()*)

## Overview

The status endpoints give you information about current playbacks, play history, and even terminating sessions.

### Available Operations

* [listSessions](#listsessions) - List Sessions
* [getBackgroundTasks](#getbackgroundtasks) - Get background tasks
* [listPlaybackHistory](#listplaybackhistory) - List Playback History
* [terminateSession](#terminatesession) - Terminate a session
* [deleteHistory](#deletehistory) - Delete Single History Item
* [getHistoryItem](#gethistoryitem) - Get Single History Item

## listSessions

List all current playbacks on this server

### Example Usage

<!-- UsageSnippet language="java" operationID="listSessions" method="get" path="/status/sessions" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListSessionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListSessionsResponse res = sdk.status().listSessions()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListSessionsResponse](../../models/operations/ListSessionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getBackgroundTasks

Get the list of all background tasks

### Example Usage

<!-- UsageSnippet language="java" operationID="getBackgroundTasks" method="get" path="/status/sessions/background" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetBackgroundTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetBackgroundTasksResponse res = sdk.status().getBackgroundTasks()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetBackgroundTasksResponse](../../models/operations/GetBackgroundTasksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listPlaybackHistory

List all playback history (Admin can see all users, others can only see their own).
Pagination should be used on this endpoint.  Additionally this endpoint supports `includeFields`, `excludeFields`, `includeElements`, and `excludeElements` parameters.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlaybackHistory" method="get" path="/status/sessions/history/all" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListPlaybackHistoryRequest;
import dev.plexapi.sdk.models.operations.ListPlaybackHistoryResponse;
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

        ListPlaybackHistoryRequest req = ListPlaybackHistoryRequest.builder()
                .sort(List.of(
                    "v",
                    "i",
                    "e",
                    "w",
                    "e",
                    "d",
                    "A",
                    "t",
                    ":",
                    "d",
                    "e",
                    "s",
                    "c",
                    ",",
                    "a",
                    "c",
                    "c",
                    "o",
                    "u",
                    "n",
                    "t",
                    "I",
                    "D"))
                .build();

        ListPlaybackHistoryResponse res = sdk.status().listPlaybackHistory()
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
| `request`                                                                           | [ListPlaybackHistoryRequest](../../models/operations/ListPlaybackHistoryRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ListPlaybackHistoryResponse](../../models/operations/ListPlaybackHistoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## terminateSession

Terminate a playback session kicking off the user

### Example Usage

<!-- UsageSnippet language="java" operationID="terminateSession" method="post" path="/status/sessions/terminate" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.TerminateSessionRequest;
import dev.plexapi.sdk.models.operations.TerminateSessionResponse;
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

        TerminateSessionRequest req = TerminateSessionRequest.builder()
                .sessionId("cdefghijklmnopqrstuvwxyz")
                .reason("Stop Playing")
                .build();

        TerminateSessionResponse res = sdk.status().terminateSession()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [TerminateSessionRequest](../../models/operations/TerminateSessionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[TerminateSessionResponse](../../models/operations/TerminateSessionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteHistory

Delete a single history item by id

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteHistory" method="delete" path="/status/sessions/history/{historyId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteHistoryRequest;
import dev.plexapi.sdk.models.operations.DeleteHistoryResponse;
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

        DeleteHistoryRequest req = DeleteHistoryRequest.builder()
                .historyId(953579L)
                .build();

        DeleteHistoryResponse res = sdk.status().deleteHistory()
                .request(req)
                .call();

        if (res.mediaContainer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [DeleteHistoryRequest](../../models/operations/DeleteHistoryRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[DeleteHistoryResponse](../../models/operations/DeleteHistoryResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHistoryItem

Get a single history item by id

### Example Usage

<!-- UsageSnippet language="java" operationID="getHistoryItem" method="get" path="/status/sessions/history/{historyId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetHistoryItemRequest;
import dev.plexapi.sdk.models.operations.GetHistoryItemResponse;
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

        GetHistoryItemRequest req = GetHistoryItemRequest.builder()
                .historyId(832213L)
                .build();

        GetHistoryItemResponse res = sdk.status().getHistoryItem()
                .request(req)
                .call();

        if (res.historyAllGetResponses200().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetHistoryItemRequest](../../models/operations/GetHistoryItemRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetHistoryItemResponse](../../models/operations/GetHistoryItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |