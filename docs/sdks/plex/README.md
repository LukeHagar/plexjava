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
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetCompanionsDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetCompanionsDataResponse res = sdk.plex().getCompanionsData()
                .call();

            if (res.responseBodies().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetCompanionsDataResponseBody e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetCompanionsDataResponse](../../models/operations/GetCompanionsDataResponse.md)**

### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetCompanionsDataResponseBody | 401                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |


## getUserFriends

Get friends of provided auth token.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetUserFriendsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetUserFriendsResponse res = sdk.plex().getUserFriends()
                .call();

            if (res.friends().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetUserFriendsResponseBody e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetUserFriendsResponse](../../models/operations/GetUserFriendsResponse.md)**

### Errors

| Error Object                             | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetUserFriendsResponseBody | 401                                      | application/json                         |
| models/errors/SDKError                   | 4xx-5xx                                  | \*\/*                                    |


## getGeoData

Returns the geolocation and locale data of the caller

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetGeoDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetGeoDataResponse res = sdk.plex().getGeoData()
                .call();

            if (res.geoData().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetGeoDataResponseBody e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetGeoDataResponse](../../models/operations/GetGeoDataResponse.md)**

### Errors

| Error Object                         | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GetGeoDataResponseBody | 401                                  | application/json                     |
| models/errors/SDKError               | 4xx-5xx                              | \*\/*                                |


## getHomeData

Retrieves the home data for the authenticated user, including details like home ID, name, guest access information, and subscription status.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetHomeDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetHomeDataResponse res = sdk.plex().getHomeData()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetHomeDataResponseBody e) {
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

### Response

**[GetHomeDataResponse](../../models/operations/GetHomeDataResponse.md)**

### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetHomeDataResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | \*\/*                                 |


## getServerResources

Get Plex server access tokens and server connections

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetServerResourcesRequest;
import dev.plexapi.sdk.models.operations.GetServerResourcesResponse;
import dev.plexapi.sdk.models.operations.IncludeHttps;
import dev.plexapi.sdk.models.operations.IncludeIPv6;
import dev.plexapi.sdk.models.operations.IncludeRelay;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetServerResourcesRequest req = GetServerResourcesRequest.builder()
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .includeHttps(IncludeHttps.ONE)
                .includeRelay(IncludeRelay.ONE)
                .includeIPv6(IncludeIPv6.ONE)
                .build();

            GetServerResourcesResponse res = sdk.plex().getServerResources()
                .request(req)
                .call();

            if (res.plexDevices().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetServerResourcesResponseBody e) {
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

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetServerResourcesRequest](../../models/operations/GetServerResourcesRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |
| `serverURL`                                                                       | *String*                                                                          | :heavy_minus_sign:                                                                | An optional server URL to use.                                                    |

### Response

**[GetServerResourcesResponse](../../models/operations/GetServerResourcesResponse.md)**

### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/GetServerResourcesResponseBody | 401                                          | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | \*\/*                                        |


## getPin

Retrieve a Pin from Plex.tv for authentication flows

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetPinResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetPinResponse res = sdk.plex().getPin()
                .strong(false)
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .xPlexProduct("Plex Web")
                .call();

            if (res.authPinContainer().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetPinResponseBody e) {
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

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           | Example                                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `strong`                                                                                                                                                              | *Optional<Boolean>*                                                                                                                                                   | :heavy_minus_sign:                                                                                                                                                    | Determines the kind of code returned by the API call<br/>Strong codes are used for Pin authentication flows<br/>Non-Strong codes are used for `Plex.tv/link`<br/>     |                                                                                                                                                                       |
| `xPlexClientIdentifier`                                                                                                                                               | *Optional<String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                    | The unique identifier for the client application<br/>This is used to track the client application and its usage<br/>(UUID, serial number, or other number unique per device)<br/> | gcgzw5rz2xovp84b4vha3a40                                                                                                                                              |
| `xPlexProduct`                                                                                                                                                        | *Optional<String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                    | N/A                                                                                                                                                                   | Plex Web                                                                                                                                                              |
| `serverURL`                                                                                                                                                           | *String*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                    | An optional server URL to use.                                                                                                                                        | http://localhost:8080                                                                                                                                                 |

### Response

**[GetPinResponse](../../models/operations/GetPinResponse.md)**

### Errors

| Error Object                     | Status Code                      | Content Type                     |
| -------------------------------- | -------------------------------- | -------------------------------- |
| models/errors/GetPinResponseBody | 400                              | application/json                 |
| models/errors/SDKError           | 4xx-5xx                          | \*\/*                            |


## getTokenByPinId

Retrieve an Access Token from Plex.tv after the Pin has been authenticated

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetTokenByPinIdResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetTokenByPinIdResponse res = sdk.plex().getTokenByPinId()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .pinID(408895L)
                .call();

            if (res.authPinContainer().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetTokenByPinIdResponseBody e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.GetTokenByPinIdPlexResponseBody e) {
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

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           | Example                                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xPlexClientIdentifier`                                                                                                                                               | *Optional<String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                    | The unique identifier for the client application<br/>This is used to track the client application and its usage<br/>(UUID, serial number, or other number unique per device)<br/> | gcgzw5rz2xovp84b4vha3a40                                                                                                                                              |
| `pinID`                                                                                                                                                               | *long*                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                    | The PinID to retrieve an access token for                                                                                                                             |                                                                                                                                                                       |
| `serverURL`                                                                                                                                                           | *String*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                    | An optional server URL to use.                                                                                                                                        | http://localhost:8080                                                                                                                                                 |

### Response

**[GetTokenByPinIdResponse](../../models/operations/GetTokenByPinIdResponse.md)**

### Errors

| Error Object                                  | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetTokenByPinIdResponseBody     | 400                                           | application/json                              |
| models/errors/GetTokenByPinIdPlexResponseBody | 404                                           | application/json                              |
| models/errors/SDKError                        | 4xx-5xx                                       | \*\/*                                         |
