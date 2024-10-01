# Hubs
(*hubs()*)

## Overview

Hubs are a structured two-dimensional container for media, generally represented by multiple horizontal rows.


### Available Operations

* [getGlobalHubs](#getglobalhubs) - Get Global Hubs
* [getRecentlyAdded](#getrecentlyadded) - Get Recently Added
* [getLibraryHubs](#getlibraryhubs) - Get library specific hubs

## getGlobalHubs

Get Global Hubs filtered by the parameters provided.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetGlobalHubsBadRequest;
import dev.plexapi.sdk.models.errors.GetGlobalHubsUnauthorized;
import dev.plexapi.sdk.models.operations.GetGlobalHubsResponse;
import dev.plexapi.sdk.models.operations.OnlyTransient;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetGlobalHubsBadRequest, GetGlobalHubsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetGlobalHubsResponse res = sdk.hubs().getGlobalHubs()
                .count(1262.49d)
                .onlyTransient(OnlyTransient.ONE)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `count`                                                                                                                                               | *Optional<Double>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional<OnlyTransient>](../../models/operations/OnlyTransient.md)                                                                                   | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

### Response

**[GetGlobalHubsResponse](../../models/operations/GetGlobalHubsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetGlobalHubsBadRequest   | 400                                     | application/json                        |
| models/errors/GetGlobalHubsUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |

## getRecentlyAdded

This endpoint will return the recently added content.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetRecentlyAddedRequest;
import dev.plexapi.sdk.models.operations.GetRecentlyAddedResponse;
import dev.plexapi.sdk.models.operations.IncludeMeta;
import dev.plexapi.sdk.models.operations.Type;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetRecentlyAddedRequest req = GetRecentlyAddedRequest.builder()
                .contentDirectoryID(470161L)
                .type(Type.TvShow)
                .sectionID(2L)
                .includeMeta(IncludeMeta.Enable)
                .xPlexContainerStart(0)
                .xPlexContainerSize(50)
                .build();

        GetRecentlyAddedResponse res = sdk.hubs().getRecentlyAdded()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetRecentlyAddedRequest](../../models/operations/GetRecentlyAddedRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetRecentlyAddedResponse](../../models/operations/GetRecentlyAddedResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLibraryHubs

This endpoint will return a list of library specific hubs


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetLibraryHubsBadRequest;
import dev.plexapi.sdk.models.errors.GetLibraryHubsUnauthorized;
import dev.plexapi.sdk.models.operations.GetLibraryHubsResponse;
import dev.plexapi.sdk.models.operations.QueryParamOnlyTransient;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetLibraryHubsBadRequest, GetLibraryHubsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetLibraryHubsResponse res = sdk.hubs().getLibraryHubs()
                .sectionId(6728.76d)
                .count(639.24d)
                .onlyTransient(QueryParamOnlyTransient.ONE)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionId`                                                                                                                                           | *double*                                                                                                                                              | :heavy_check_mark:                                                                                                                                    | the Id of the library to query                                                                                                                        |
| `count`                                                                                                                                               | *Optional<Double>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional<QueryParamOnlyTransient>](../../models/operations/QueryParamOnlyTransient.md)                                                               | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

### Response

**[GetLibraryHubsResponse](../../models/operations/GetLibraryHubsResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetLibraryHubsBadRequest   | 400                                      | application/json                         |
| models/errors/GetLibraryHubsUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |