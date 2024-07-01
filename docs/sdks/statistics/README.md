# Statistics
(*statistics()*)

## Overview

API Calls that perform operations with Plex Media Server Statistics


### Available Operations

* [getStatistics](#getstatistics) - Get Media Statistics
* [getResourcesStatistics](#getresourcesstatistics) - Get Resources Statistics
* [getBandwidthStatistics](#getbandwidthstatistics) - Get Bandwidth Statistics

## getStatistics

This will return the media statistics for the server

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

            GetStatisticsResponse res = sdk.statistics().getStatistics()
                .timespan(4L)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetStatisticsResponseBody e) {
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `timespan`                                                                                | *Optional<? extends Long>*                                                                | :heavy_minus_sign:                                                                        | The timespan to retrieve statistics for<br/>the exact meaning of this parameter is not known<br/> | 4                                                                                         |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponse](../../models/operations/GetStatisticsResponse.md)**
### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetStatisticsResponseBody | 401                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | \*\/*                                   |

## getResourcesStatistics

This will return the resources for the server

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

            GetResourcesStatisticsResponse res = sdk.statistics().getResourcesStatistics()
                .timespan(4L)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetResourcesStatisticsResponseBody e) {
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `timespan`                                                                                | *Optional<? extends Long>*                                                                | :heavy_minus_sign:                                                                        | The timespan to retrieve statistics for<br/>the exact meaning of this parameter is not known<br/> | 4                                                                                         |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetResourcesStatisticsResponse](../../models/operations/GetResourcesStatisticsResponse.md)**
### Errors

| Error Object                                     | Status Code                                      | Content Type                                     |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| models/errors/GetResourcesStatisticsResponseBody | 401                                              | application/json                                 |
| models/errors/SDKError                           | 4xx-5xx                                          | \*\/*                                            |

## getBandwidthStatistics

This will return the bandwidth statistics for the server

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

            GetBandwidthStatisticsResponse res = sdk.statistics().getBandwidthStatistics()
                .timespan(4L)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetBandwidthStatisticsResponseBody e) {
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

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `timespan`                                                                                | *Optional<? extends Long>*                                                                | :heavy_minus_sign:                                                                        | The timespan to retrieve statistics for<br/>the exact meaning of this parameter is not known<br/> | 4                                                                                         |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetBandwidthStatisticsResponse](../../models/operations/GetBandwidthStatisticsResponse.md)**
### Errors

| Error Object                                     | Status Code                                      | Content Type                                     |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| models/errors/GetBandwidthStatisticsResponseBody | 401                                              | application/json                                 |
| models/errors/SDKError                           | 4xx-5xx                                          | \*\/*                                            |
