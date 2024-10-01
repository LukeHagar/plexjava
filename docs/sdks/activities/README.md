# Activities
(*activities()*)

## Overview

Activities are awesome. They provide a way to monitor and control asynchronous operations on the server. In order to receive real-time updates for activities, a client would normally subscribe via either EventSource or Websocket endpoints.
Activities are associated with HTTP replies via a special `X-Plex-Activity` header which contains the UUID of the activity.
Activities are optional cancellable. If cancellable, they may be cancelled via the `DELETE` endpoint. Other details:
- They can contain a `progress` (from 0 to 100) marking the percent completion of the activity.
- They must contain an `type` which is used by clients to distinguish the specific activity.
- They may contain a `Context` object with attributes which associate the activity with various specific entities (items, libraries, etc.)
- The may contain a `Response` object which attributes which represent the result of the asynchronous operation.


### Available Operations

* [getServerActivities](#getserveractivities) - Get Server Activities
* [cancelServerActivities](#cancelserveractivities) - Cancel Server Activities

## getServerActivities

Get Server Activities

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerActivitiesBadRequest;
import dev.plexapi.sdk.models.errors.GetServerActivitiesUnauthorized;
import dev.plexapi.sdk.models.operations.GetServerActivitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerActivitiesBadRequest, GetServerActivitiesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetServerActivitiesResponse res = sdk.activities().getServerActivities()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetServerActivitiesResponse](../../models/operations/GetServerActivitiesResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetServerActivitiesBadRequest   | 400                                           | application/json                              |
| models/errors/GetServerActivitiesUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

## cancelServerActivities

Cancel Server Activities

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.CancelServerActivitiesBadRequest;
import dev.plexapi.sdk.models.errors.CancelServerActivitiesUnauthorized;
import dev.plexapi.sdk.models.operations.CancelServerActivitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws CancelServerActivitiesBadRequest, CancelServerActivitiesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        CancelServerActivitiesResponse res = sdk.activities().cancelServerActivities()
                .activityUUID("25b71ed5-0f9d-461c-baa7-d404e9e10d3e")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                            | Type                                 | Required                             | Description                          | Example                              |
| ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| `activityUUID`                       | *String*                             | :heavy_check_mark:                   | The UUID of the activity to cancel.  | 25b71ed5-0f9d-461c-baa7-d404e9e10d3e |

### Response

**[CancelServerActivitiesResponse](../../models/operations/CancelServerActivitiesResponse.md)**

### Errors

| Error Type                                       | Status Code                                      | Content Type                                     |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| models/errors/CancelServerActivitiesBadRequest   | 400                                              | application/json                                 |
| models/errors/CancelServerActivitiesUnauthorized | 401                                              | application/json                                 |
| models/errors/SDKError                           | 4XX, 5XX                                         | \*/\*                                            |