# Activities
(*activities()*)

## Overview

Activities provide a way to monitor and control asynchronous operations on the server. In order to receive real-time updates for activities, a client would normally subscribe via either EventSource or Websocket endpoints.

Activities are associated with HTTP replies via a special `X-Plex-Activity` header which contains the UUID of the activity.

Activities are optional cancellable. If cancellable, they may be cancelled via the `DELETE` endpoint.


### Available Operations

* [listActivities](#listactivities) - Get all activities
* [cancelActivity](#cancelactivity) - Cancel a running activity

## listActivities

List all activities on the server.  Admins can see all activities but other users can only see their own

### Example Usage

<!-- UsageSnippet language="java" operationID="listActivities" method="get" path="/activities" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListActivitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListActivitiesResponse res = sdk.activities().listActivities()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListActivitiesResponse](../../models/operations/ListActivitiesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## cancelActivity

Cancel a running activity.  Admins can cancel all activities but other users can only cancel their own

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelActivity" method="delete" path="/activities/{activityId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CancelActivityRequest;
import dev.plexapi.sdk.models.operations.CancelActivityResponse;
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

        CancelActivityRequest req = CancelActivityRequest.builder()
                .activityId("d6199ba1-fb5e-4cae-bf17-1a5369c1cf1e")
                .build();

        CancelActivityResponse res = sdk.activities().cancelActivity()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CancelActivityRequest](../../models/operations/CancelActivityRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CancelActivityResponse](../../models/operations/CancelActivityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |