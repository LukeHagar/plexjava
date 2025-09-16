# Users
(*users()*)

## Overview

### Available Operations

* [getUsers](#getusers) - Get list of all connected users

## getUsers

Get list of all users that are friends and have library access with the provided Plex authentication token

### Example Usage

<!-- UsageSnippet language="java" operationID="get-users" method="get" path="/users" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetUsersBadRequest;
import dev.plexapi.sdk.models.errors.GetUsersUnauthorized;
import dev.plexapi.sdk.models.operations.GetUsersRequest;
import dev.plexapi.sdk.models.operations.GetUsersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetUsersBadRequest, GetUsersUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        GetUsersRequest req = GetUsersRequest.builder()
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .clientName("Plex for Roku")
                .deviceNickname("Roku 3")
                .deviceName("Chrome")
                .deviceScreenResolution("1487x1165,2560x1440")
                .clientVersion("2.4.1")
                .platform("Roku")
                .clientFeatures("external-media,indirect-media,hub-style-list")
                .model("4200X")
                .xPlexSessionId("97e136ef-4ddd-4ff3-89a7-a5820c96c2ca")
                .xPlexLanguage("en")
                .platformVersion("4.3 build 1057")
                .build();

        GetUsersResponse res = sdk.users().getUsers()
                .request(req)
                .call();

        if (res.body().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetUsersRequest](../../models/operations/GetUsersRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[GetUsersResponse](../../models/operations/GetUsersResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/GetUsersBadRequest   | 400                                | application/json                   |
| models/errors/GetUsersUnauthorized | 401                                | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |