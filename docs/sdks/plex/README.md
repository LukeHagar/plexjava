# Plex
(*plex()*)

## Overview

API Calls that perform operations directly against https://Plex.tv


### Available Operations

* [getCompanionsData](#getcompanionsdata) - Get Companions Data
* [getUserFriends](#getuserfriends) - Get list of friends of the user logged in
* [getGeoData](#getgeodata) - Get Geo Data
* [getHomeData](#gethomedata) - Get Plex Home Data
* [getServerResources](#getserverresources) - Get Server Resources
* [getPin](#getpin) - Get a Pin
* [getTokenByPinId](#gettokenbypinid) - Get Access Token by PinId

## getCompanionsData

Get Companions Data

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetCompanionsDataBadRequest;
import dev.plexapi.sdk.models.errors.GetCompanionsDataUnauthorized;
import dev.plexapi.sdk.models.operations.GetCompanionsDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetCompanionsDataBadRequest, GetCompanionsDataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetCompanionsDataResponse res = sdk.plex().getCompanionsData()
                .call();

        if (res.responseBodies().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetCompanionsDataResponse](../../models/operations/GetCompanionsDataResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetCompanionsDataBadRequest   | 400                                         | application/json                            |
| models/errors/GetCompanionsDataUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## getUserFriends

Get friends of provided auth token.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetUserFriendsBadRequest;
import dev.plexapi.sdk.models.errors.GetUserFriendsUnauthorized;
import dev.plexapi.sdk.models.operations.GetUserFriendsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetUserFriendsBadRequest, GetUserFriendsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetUserFriendsResponse res = sdk.plex().getUserFriends()
                .call();

        if (res.friends().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetUserFriendsResponse](../../models/operations/GetUserFriendsResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetUserFriendsBadRequest   | 400                                      | application/json                         |
| models/errors/GetUserFriendsUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |

## getGeoData

Returns the geolocation and locale data of the caller

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetGeoDataBadRequest;
import dev.plexapi.sdk.models.errors.GetGeoDataUnauthorized;
import dev.plexapi.sdk.models.operations.GetGeoDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetGeoDataBadRequest, GetGeoDataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        GetGeoDataResponse res = sdk.plex().getGeoData()
                .call();

        if (res.geoData().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetGeoDataResponse](../../models/operations/GetGeoDataResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GetGeoDataBadRequest   | 400                                  | application/json                     |
| models/errors/GetGeoDataUnauthorized | 401                                  | application/json                     |
| models/errors/SDKError               | 4XX, 5XX                             | \*/\*                                |

## getHomeData

Retrieves the home data for the authenticated user, including details like home ID, name, guest access information, and subscription status.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetHomeDataBadRequest;
import dev.plexapi.sdk.models.errors.GetHomeDataUnauthorized;
import dev.plexapi.sdk.models.operations.GetHomeDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetHomeDataBadRequest, GetHomeDataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetHomeDataResponse res = sdk.plex().getHomeData()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetHomeDataResponse](../../models/operations/GetHomeDataResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetHomeDataBadRequest   | 400                                   | application/json                      |
| models/errors/GetHomeDataUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4XX, 5XX                              | \*/\*                                 |

## getServerResources

Get Plex server access tokens and server connections

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerResourcesBadRequest;
import dev.plexapi.sdk.models.errors.GetServerResourcesUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerResourcesBadRequest, GetServerResourcesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetServerResourcesResponse res = sdk.plex().getServerResources()
                .includeHttps(IncludeHttps.Enable)
                .includeRelay(IncludeRelay.Enable)
                .includeIPv6(IncludeIPv6.Enable)
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .call();

        if (res.plexDevices().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                          | Type                                                                                                               | Required                                                                                                           | Description                                                                                                        | Example                                                                                                            |
| ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------ |
| `includeHttps`                                                                                                     | [Optional\<IncludeHttps>](../../models/operations/IncludeHttps.md)                                                 | :heavy_minus_sign:                                                                                                 | Include Https entries in the results                                                                               | 1                                                                                                                  |
| `includeRelay`                                                                                                     | [Optional\<IncludeRelay>](../../models/operations/IncludeRelay.md)                                                 | :heavy_minus_sign:                                                                                                 | Include Relay addresses in the results <br/>E.g: https://10-0-0-25.bbf8e10c7fa20447cacee74cd9914cde.plex.direct:32400<br/> | 1                                                                                                                  |
| `includeIPv6`                                                                                                      | [Optional\<IncludeIPv6>](../../models/operations/IncludeIPv6.md)                                                   | :heavy_minus_sign:                                                                                                 | Include IPv6 entries in the results                                                                                | 1                                                                                                                  |
| `clientID`                                                                                                         | *String*                                                                                                           | :heavy_check_mark:                                                                                                 | An opaque identifier unique to the client (UUID, serial number, or other unique device ID)                         | 3381b62b-9ab7-4e37-827b-203e9809eb58                                                                               |
| `serverURL`                                                                                                        | *String*                                                                                                           | :heavy_minus_sign:                                                                                                 | An optional server URL to use.                                                                                     | http://localhost:8080                                                                                              |

### Response

**[GetServerResourcesResponse](../../models/operations/GetServerResourcesResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/GetServerResourcesBadRequest   | 400                                          | application/json                             |
| models/errors/GetServerResourcesUnauthorized | 401                                          | application/json                             |
| models/errors/SDKError                       | 4XX, 5XX                                     | \*/\*                                        |

## getPin

Retrieve a Pin ID from Plex.tv to use for authentication flows

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetPinBadRequest;
import dev.plexapi.sdk.models.operations.GetPinRequest;
import dev.plexapi.sdk.models.operations.GetPinResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetPinBadRequest, Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        GetPinRequest req = GetPinRequest.builder()
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .deviceNickname("Roku 3")
                .clientVersion("2.4.1")
                .platform("Roku")
                .build();

        GetPinResponse res = sdk.plex().getPin()
                .request(req)
                .call();

        if (res.authPinContainer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetPinRequest](../../models/operations/GetPinRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |
| `serverURL`                                               | *String*                                                  | :heavy_minus_sign:                                        | An optional server URL to use.                            |

### Response

**[GetPinResponse](../../models/operations/GetPinResponse.md)**

### Errors

| Error Type                     | Status Code                    | Content Type                   |
| ------------------------------ | ------------------------------ | ------------------------------ |
| models/errors/GetPinBadRequest | 400                            | application/json               |
| models/errors/SDKError         | 4XX, 5XX                       | \*/\*                          |

## getTokenByPinId

Retrieve an Access Token from Plex.tv after the Pin has been authenticated

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTokenByPinIdBadRequest;
import dev.plexapi.sdk.models.errors.GetTokenByPinIdResponseBody;
import dev.plexapi.sdk.models.operations.GetTokenByPinIdRequest;
import dev.plexapi.sdk.models.operations.GetTokenByPinIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTokenByPinIdBadRequest, GetTokenByPinIdResponseBody, Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        GetTokenByPinIdRequest req = GetTokenByPinIdRequest.builder()
                .pinID(232248L)
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .deviceNickname("Roku 3")
                .clientVersion("2.4.1")
                .platform("Roku")
                .build();

        GetTokenByPinIdResponse res = sdk.plex().getTokenByPinId()
                .request(req)
                .call();

        if (res.authPinContainer().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTokenByPinIdRequest](../../models/operations/GetTokenByPinIdRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `serverURL`                                                                 | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[GetTokenByPinIdResponse](../../models/operations/GetTokenByPinIdResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetTokenByPinIdBadRequest   | 400                                       | application/json                          |
| models/errors/GetTokenByPinIdResponseBody | 404                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |