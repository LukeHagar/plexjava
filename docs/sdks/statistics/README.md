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

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetStatisticsBadRequest;
import dev.plexapi.sdk.models.errors.GetStatisticsUnauthorized;
import dev.plexapi.sdk.models.operations.GetStatisticsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetStatisticsBadRequest, GetStatisticsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetStatisticsResponse res = sdk.statistics().getStatistics()
                .timespan(4L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `timespan`                                                                                | *Optional<Long>*                                                                          | :heavy_minus_sign:                                                                        | The timespan to retrieve statistics for<br/>the exact meaning of this parameter is not known<br/> | 4                                                                                         |

### Response

**[GetStatisticsResponse](../../models/operations/GetStatisticsResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetStatisticsBadRequest   | 400                                     | application/json                        |
| models/errors/GetStatisticsUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |

## getResourcesStatistics

This will return the resources for the server

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetResourcesStatisticsBadRequest;
import dev.plexapi.sdk.models.errors.GetResourcesStatisticsUnauthorized;
import dev.plexapi.sdk.models.operations.GetResourcesStatisticsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetResourcesStatisticsBadRequest, GetResourcesStatisticsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetResourcesStatisticsResponse res = sdk.statistics().getResourcesStatistics()
                .timespan(4L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `timespan`                                                                                | *Optional<Long>*                                                                          | :heavy_minus_sign:                                                                        | The timespan to retrieve statistics for<br/>the exact meaning of this parameter is not known<br/> | 4                                                                                         |

### Response

**[GetResourcesStatisticsResponse](../../models/operations/GetResourcesStatisticsResponse.md)**

### Errors

| Error Type                                       | Status Code                                      | Content Type                                     |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| models/errors/GetResourcesStatisticsBadRequest   | 400                                              | application/json                                 |
| models/errors/GetResourcesStatisticsUnauthorized | 401                                              | application/json                                 |
| models/errors/SDKError                           | 4XX, 5XX                                         | \*/\*                                            |

## getBandwidthStatistics

This will return the bandwidth statistics for the server

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetBandwidthStatisticsBadRequest;
import dev.plexapi.sdk.models.errors.GetBandwidthStatisticsUnauthorized;
import dev.plexapi.sdk.models.operations.GetBandwidthStatisticsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetBandwidthStatisticsBadRequest, GetBandwidthStatisticsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetBandwidthStatisticsResponse res = sdk.statistics().getBandwidthStatistics()
                .timespan(4L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                 | Type                                                                                      | Required                                                                                  | Description                                                                               | Example                                                                                   |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| `timespan`                                                                                | *Optional<Long>*                                                                          | :heavy_minus_sign:                                                                        | The timespan to retrieve statistics for<br/>the exact meaning of this parameter is not known<br/> | 4                                                                                         |

### Response

**[GetBandwidthStatisticsResponse](../../models/operations/GetBandwidthStatisticsResponse.md)**

### Errors

| Error Type                                       | Status Code                                      | Content Type                                     |
| ------------------------------------------------ | ------------------------------------------------ | ------------------------------------------------ |
| models/errors/GetBandwidthStatisticsBadRequest   | 400                                              | application/json                                 |
| models/errors/GetBandwidthStatisticsUnauthorized | 401                                              | application/json                                 |
| models/errors/SDKError                           | 4XX, 5XX                                         | \*/\*                                            |