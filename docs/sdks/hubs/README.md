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

<!-- UsageSnippet language="java" operationID="getGlobalHubs" method="get" path="/hubs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetGlobalHubsBadRequest;
import dev.plexapi.sdk.models.errors.GetGlobalHubsUnauthorized;
import dev.plexapi.sdk.models.operations.GetGlobalHubsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetGlobalHubsBadRequest, GetGlobalHubsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetGlobalHubsResponse res = sdk.hubs().getGlobalHubs()
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
| `count`                                                                                                                                               | *Optional\<Double>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional\<OnlyTransient>](../../models/operations/OnlyTransient.md)                                                                                  | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

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

<!-- UsageSnippet language="java" operationID="get-recently-added" method="get" path="/hubs/home/recentlyAdded" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetRecentlyAddedRequest req = GetRecentlyAddedRequest.builder()
                .contentDirectoryID(39486L)
                .type(Type.TvShow)
                .sectionID(2L)
                .includeMeta(IncludeMeta.Enable)
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

<!-- UsageSnippet language="java" operationID="getLibraryHubs" method="get" path="/hubs/sections/{sectionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetLibraryHubsBadRequest;
import dev.plexapi.sdk.models.errors.GetLibraryHubsUnauthorized;
import dev.plexapi.sdk.models.operations.GetLibraryHubsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetLibraryHubsBadRequest, GetLibraryHubsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetLibraryHubsResponse res = sdk.hubs().getLibraryHubs()
                .sectionId(492.74)
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
| `count`                                                                                                                                               | *Optional\<Double>*                                                                                                                                   | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional\<QueryParamOnlyTransient>](../../models/operations/QueryParamOnlyTransient.md)                                                              | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

### Response

**[GetLibraryHubsResponse](../../models/operations/GetLibraryHubsResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetLibraryHubsBadRequest   | 400                                      | application/json                         |
| models/errors/GetLibraryHubsUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |