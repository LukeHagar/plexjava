# Watchlist
(*watchlist()*)

## Overview

API Calls that perform operations with Plex Media Server Watchlists


### Available Operations

* [getWatchList](#getwatchlist) - Get User Watchlist

## getWatchList

Get User Watchlist

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetWatchListBadRequest;
import dev.plexapi.sdk.models.errors.GetWatchListUnauthorized;
import dev.plexapi.sdk.models.operations.Filter;
import dev.plexapi.sdk.models.operations.GetWatchListRequest;
import dev.plexapi.sdk.models.operations.GetWatchListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetWatchListBadRequest, GetWatchListUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetWatchListRequest req = GetWatchListRequest.builder()
                .filter(Filter.AVAILABLE)
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .xPlexContainerStart(0)
                .xPlexContainerSize(50)
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

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/GetWatchListBadRequest   | 400                                    | application/json                       |
| models/errors/GetWatchListUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | \*\/*                                  |
