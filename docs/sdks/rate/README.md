# Rate
(*rate()*)

## Overview

Operations for rating media items (thumbs up/down, star ratings, etc.)

### Available Operations

* [setRating](#setrating) - Rate an item

## setRating

Set the rating on an item.
This API does respond to the GET verb but applications should use PUT

### Example Usage

<!-- UsageSnippet language="java" operationID="setRating" method="put" path="/:/rate" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SetRatingRequest;
import dev.plexapi.sdk.models.operations.SetRatingResponse;
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

        SetRatingRequest req = SetRatingRequest.builder()
                .identifier("<value>")
                .key("<key>")
                .rating(8722.46)
                .build();

        SetRatingResponse res = sdk.rate().setRating()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [SetRatingRequest](../../models/operations/SetRatingRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[SetRatingResponse](../../models/operations/SetRatingResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |