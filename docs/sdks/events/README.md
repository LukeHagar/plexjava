# Events
(*events()*)

## Overview

The server can notify clients in real-time of a wide range of events, from library scanning, to preferences being modified, to changes to media, and many other things. This is also the mechanism by which activity progress is reported.

Two protocols for receiving the events are available: EventSource (also known as SSE), and WebSocket.


### Available Operations

* [getNotifications](#getnotifications) - Connect to Eventsource
* [connectWebSocket](#connectwebsocket) - Connect to WebSocket

## getNotifications

Connect to the event source to get a stream of events

### Example Usage

<!-- UsageSnippet language="java" operationID="getNotifications" method="get" path="/:/eventsource/notifications" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetNotificationsRequest;
import dev.plexapi.sdk.models.operations.GetNotificationsResponse;
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

        GetNotificationsRequest req = GetNotificationsRequest.builder()
                .build();

        GetNotificationsResponse res = sdk.events().getNotifications()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetNotificationsRequest](../../models/operations/GetNotificationsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetNotificationsResponse](../../models/operations/GetNotificationsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## connectWebSocket

Connect to the web socket to get a stream of events

### Example Usage

<!-- UsageSnippet language="java" operationID="connectWebSocket" method="get" path="/:/websocket/notifications" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ConnectWebSocketRequest;
import dev.plexapi.sdk.models.operations.ConnectWebSocketResponse;
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

        ConnectWebSocketRequest req = ConnectWebSocketRequest.builder()
                .build();

        ConnectWebSocketResponse res = sdk.events().connectWebSocket()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [ConnectWebSocketRequest](../../models/operations/ConnectWebSocketRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[ConnectWebSocketResponse](../../models/operations/ConnectWebSocketResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |