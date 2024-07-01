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

            GetGlobalHubsResponse res = sdk.hubs().getGlobalHubs()
                .count(1262.49d)
                .onlyTransient(OnlyTransient.ONE)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetGlobalHubsResponseBody e) {
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

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `count`                                                                                                                                               | *Optional<? extends Double>*                                                                                                                          | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional<? extends lukehagar.plexapi.plexapi.models.operations.OnlyTransient>](../../models/operations/OnlyTransient.md)                             | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse](../../models/operations/GetGlobalHubsResponse.md)**
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

            GetLibraryHubsResponse res = sdk.hubs().getLibraryHubs()
                .sectionId(6728.76d)
                .count(9010.22d)
                .onlyTransient(QueryParamOnlyTransient.ZERO)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetLibraryHubsResponseBody e) {
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

| Parameter                                                                                                                                             | Type                                                                                                                                                  | Required                                                                                                                                              | Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sectionId`                                                                                                                                           | *double*                                                                                                                                              | :heavy_check_mark:                                                                                                                                    | the Id of the library to query                                                                                                                        |
| `count`                                                                                                                                               | *Optional<? extends Double>*                                                                                                                          | :heavy_minus_sign:                                                                                                                                    | The number of items to return with each hub.                                                                                                          |
| `onlyTransient`                                                                                                                                       | [Optional<? extends lukehagar.plexapi.plexapi.models.operations.QueryParamOnlyTransient>](../../models/operations/QueryParamOnlyTransient.md)         | :heavy_minus_sign:                                                                                                                                    | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse](../../models/operations/GetLibraryHubsResponse.md)**
### Errors

| Error Object                             | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetLibraryHubsResponseBody | 401                                      | application/json                         |
| models/errors/SDKError                   | 4xx-5xx                                  | \*\/*                                    |
