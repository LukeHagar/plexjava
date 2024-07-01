# Watchlist
(*watchlist()*)

## Overview

API Calls that perform operations with Plex Media Server Watchlists


### Available Operations

* [getWatchlist](#getwatchlist) - Get User Watchlist

## getWatchlist

Get User Watchlist

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetWatchlistRequest req = GetWatchlistRequest.builder()
                .filter(PathParamFilter.RELEASED)
                .xPlexToken("<value>")
                .build();

            GetWatchlistResponse res = sdk.watchlist().getWatchlist()
                .request(req)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetWatchlistResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                         | Type                                                                                                              | Required                                                                                                          | Description                                                                                                       |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                         | [lukehagar.plexapi.plexapi.models.operations.GetWatchlistRequest](../../models/operations/GetWatchlistRequest.md) | :heavy_check_mark:                                                                                                | The request object to use for the request.                                                                        |
| `serverURL`                                                                                                       | *String*                                                                                                          | :heavy_minus_sign:                                                                                                | An optional server URL to use.                                                                                    |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetWatchlistResponse](../../models/operations/GetWatchlistResponse.md)**
### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/GetWatchlistResponseBody | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | \*\/*                                  |
