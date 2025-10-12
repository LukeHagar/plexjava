# Collections
(*collections()*)

## Overview

API Operations against the Collections

### Available Operations

* [createCollection](#createcollection) - Create collection

## createCollection

Create a collection in the library

### Example Usage

<!-- UsageSnippet language="java" operationID="createCollection" method="post" path="/library/collections" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CreateCollectionRequest;
import dev.plexapi.sdk.models.operations.CreateCollectionResponse;
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

        CreateCollectionRequest req = CreateCollectionRequest.builder()
                .sectionId("<id>")
                .build();

        CreateCollectionResponse res = sdk.collections().createCollection()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [CreateCollectionRequest](../../models/operations/CreateCollectionRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[CreateCollectionResponse](../../models/operations/CreateCollectionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |