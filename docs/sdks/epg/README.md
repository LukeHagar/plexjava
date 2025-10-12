# Epg
(*epg()*)

## Overview

The EPG (Electronic Program Guide) is responsible for obtaining metadata for what is airing on each channel and when


### Available Operations

* [computeChannelMap](#computechannelmap) - Compute the best channel map
* [getChannels](#getchannels) - Get channels for a lineup
* [getCountries](#getcountries) - Get all countries
* [getAllLanguages](#getalllanguages) - Get all languages
* [getLineup](#getlineup) - Compute the best lineup
* [getLineupChannels](#getlineupchannels) - Get the channels for mulitple lineups
* [getCountriesLineups](#getcountrieslineups) - Get lineups for a country via postal code
* [getCountryRegions](#getcountryregions) - Get regions for a country
* [listLineups](#listlineups) - Get lineups for a region

## computeChannelMap

Compute the best channel map, given device and lineup

### Example Usage

<!-- UsageSnippet language="java" operationID="computeChannelMap" method="get" path="/livetv/epg/channelmap" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ComputeChannelMapRequest;
import dev.plexapi.sdk.models.operations.ComputeChannelMapResponse;
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

        ComputeChannelMapRequest req = ComputeChannelMapRequest.builder()
                .deviceQueryParameter("<value>")
                .lineup("<value>")
                .build();

        ComputeChannelMapResponse res = sdk.epg().computeChannelMap()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ComputeChannelMapRequest](../../models/operations/ComputeChannelMapRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[ComputeChannelMapResponse](../../models/operations/ComputeChannelMapResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getChannels

Get channels for a lineup within an EPG provider

### Example Usage

<!-- UsageSnippet language="java" operationID="getChannels" method="get" path="/livetv/epg/channels" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetChannelsRequest;
import dev.plexapi.sdk.models.operations.GetChannelsResponse;
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

        GetChannelsRequest req = GetChannelsRequest.builder()
                .lineup("<value>")
                .build();

        GetChannelsResponse res = sdk.epg().getChannels()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetChannelsRequest](../../models/operations/GetChannelsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetChannelsResponse](../../models/operations/GetChannelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCountries

This endpoint returns a list of countries which EPG data is available for. There are three flavors, as specfied by the `flavor` attribute

### Example Usage

<!-- UsageSnippet language="java" operationID="getCountries" method="get" path="/livetv/epg/countries" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCountriesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetCountriesResponse res = sdk.epg().getCountries()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetCountriesResponse](../../models/operations/GetCountriesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAllLanguages

Returns a list of all possible languages for EPG data.

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllLanguages" method="get" path="/livetv/epg/languages" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAllLanguagesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetAllLanguagesResponse res = sdk.epg().getAllLanguages()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetAllLanguagesResponse](../../models/operations/GetAllLanguagesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLineup

Compute the best lineup, given lineup group and device

### Example Usage

<!-- UsageSnippet language="java" operationID="getLineup" method="get" path="/livetv/epg/lineup" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetLineupRequest;
import dev.plexapi.sdk.models.operations.GetLineupResponse;
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

        GetLineupRequest req = GetLineupRequest.builder()
                .deviceQueryParameter("<value>")
                .lineupGroup("<value>")
                .build();

        GetLineupResponse res = sdk.epg().getLineup()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [GetLineupRequest](../../models/operations/GetLineupRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetLineupResponse](../../models/operations/GetLineupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLineupChannels

Get the channels across multiple lineups

### Example Usage

<!-- UsageSnippet language="java" operationID="getLineupChannels" method="get" path="/livetv/epg/lineupchannels" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetLineupChannelsRequest;
import dev.plexapi.sdk.models.operations.GetLineupChannelsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;
import java.util.List;

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

        GetLineupChannelsRequest req = GetLineupChannelsRequest.builder()
                .lineup(List.of(
                    "<value 1>",
                    "<value 2>"))
                .build();

        GetLineupChannelsResponse res = sdk.epg().getLineupChannels()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetLineupChannelsRequest](../../models/operations/GetLineupChannelsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetLineupChannelsResponse](../../models/operations/GetLineupChannelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCountriesLineups

Returns a list of lineups for a given country, EPG provider and postal code

### Example Usage

<!-- UsageSnippet language="java" operationID="getCountriesLineups" method="get" path="/livetv/epg/countries/{country}/{epgId}/lineups" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCountriesLineupsRequest;
import dev.plexapi.sdk.models.operations.GetCountriesLineupsResponse;
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

        GetCountriesLineupsRequest req = GetCountriesLineupsRequest.builder()
                .country("Malawi")
                .epgId("<id>")
                .build();

        GetCountriesLineupsResponse res = sdk.epg().getCountriesLineups()
                .request(req)
                .call();

        if (res.mediaContainerWithLineup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetCountriesLineupsRequest](../../models/operations/GetCountriesLineupsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetCountriesLineupsResponse](../../models/operations/GetCountriesLineupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getCountryRegions

Get regions for a country within an EPG provider

### Example Usage

<!-- UsageSnippet language="java" operationID="getCountryRegions" method="get" path="/livetv/epg/countries/{country}/{epgId}/regions" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetCountryRegionsRequest;
import dev.plexapi.sdk.models.operations.GetCountryRegionsResponse;
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

        GetCountryRegionsRequest req = GetCountryRegionsRequest.builder()
                .country("Morocco")
                .epgId("<id>")
                .build();

        GetCountryRegionsResponse res = sdk.epg().getCountryRegions()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [GetCountryRegionsRequest](../../models/operations/GetCountryRegionsRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetCountryRegionsResponse](../../models/operations/GetCountryRegionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listLineups

Get lineups for a region within an EPG provider

### Example Usage

<!-- UsageSnippet language="java" operationID="listLineups" method="get" path="/livetv/epg/countries/{country}/{epgId}/regions/{region}/lineups" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListLineupsRequest;
import dev.plexapi.sdk.models.operations.ListLineupsResponse;
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

        ListLineupsRequest req = ListLineupsRequest.builder()
                .country("Vanuatu")
                .epgId("<id>")
                .region("<value>")
                .build();

        ListLineupsResponse res = sdk.epg().listLineups()
                .request(req)
                .call();

        if (res.mediaContainerWithLineup().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ListLineupsRequest](../../models/operations/ListLineupsRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ListLineupsResponse](../../models/operations/ListLineupsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |