# Watchlist
(*watchlist()*)

## Overview

API Calls that perform operations with Plex Media Server Watchlists


### Available Operations

* [getWatchList](#getwatchlist) - Get User Watchlist

## getWatchList

Get User Watchlist

### Example Usage

<!-- UsageSnippet language="java" operationID="get-watch-list" method="get" path="/library/sections/watchlist/{filter}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetWatchListBadRequest;
import dev.plexapi.sdk.models.errors.GetWatchListUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetWatchListBadRequest, GetWatchListUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetWatchListRequest req = GetWatchListRequest.builder()
                .filter(Filter.RELEASED)
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .build();

        GetWatchListResponse res = sdk.watchlist().getWatchList()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetWatchListRequest](../../models/operations/GetWatchListRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[GetWatchListResponse](../../models/operations/GetWatchListResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/GetWatchListBadRequest   | 400                                    | application/json                       |
| models/errors/GetWatchListUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |