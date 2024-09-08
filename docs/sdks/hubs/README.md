# Hubs
(*hubs()*)

## Overview

Hubs are a structured two-dimensional container for media, generally represented by multiple horizontal rows.


### Available Operations

* [getGlobalHubs](#getglobalhubs) - Get Global Hubs
* [getLibraryHubs](#getlibraryhubs) - Get library specific hubs

## getGlobalHubs

Get Global Hubs filtered by the parameters provided.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetGlobalHubsResponse;
import dev.plexapi.sdk.models.operations.OnlyTransient;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetGlobalHubsResponse res = sdk.hubs().getGlobalHubs()
                .count(1262.49d)
                .onlyTransient(OnlyTransient.ONE)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetGlobalHubsResponseBody e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `count`                                                                                                                                               | *Optional<Double>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional<OnlyTransient>](../../models/operations/OnlyTransient.md)                                                                                   | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

### Response

**[GetGlobalHubsResponse](../../models/operations/GetGlobalHubsResponse.md)**

### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetGlobalHubsResponseBody | 401                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | \*\/*                                   |


## getLibraryHubs

This endpoint will return a list of library specific hubs


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetLibraryHubsResponse;
import dev.plexapi.sdk.models.operations.QueryParamOnlyTransient;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetLibraryHubsResponse res = sdk.hubs().getLibraryHubs()
                .sectionId(6728.76d)
                .count(9010.22d)
                .onlyTransient(QueryParamOnlyTransient.ZERO)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetLibraryHubsResponseBody e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionId`                                                                                                                                           | *double*                                                                                                                                              | :heavy_check_mark:                                                                                                                                    | the Id of the library to query                                                                                                                        |
| `count`                                                                                                                                               | *Optional<Double>*                                                                                                                                    | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional<QueryParamOnlyTransient>](../../models/operations/QueryParamOnlyTransient.md)                                                               | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

### Response

**[GetLibraryHubsResponse](../../models/operations/GetLibraryHubsResponse.md)**

### Errors

| Error Object                             | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetLibraryHubsResponseBody | 401                                      | application/json                         |
| models/errors/SDKError                   | 4xx-5xx                                  | \*\/*                                    |
