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
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetUsersBadRequest, GetUsersUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Chrome")
                .marketplace("googlePlay")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetUsersRequest req = GetUsersRequest.builder()
                .build();

        GetUsersResponse res = sdk.users().getUsers()
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