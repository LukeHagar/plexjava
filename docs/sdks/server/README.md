# Server
(*server()*)

## Overview

Operations against the Plex Media Server System.


### Available Operations

* [getServerCapabilities](#getservercapabilities) - Get Server Capabilities
* [getServerPreferences](#getserverpreferences) - Get Server Preferences
* [getAvailableClients](#getavailableclients) - Get Available Clients
* [getDevices](#getdevices) - Get Devices
* [getServerIdentity](#getserveridentity) - Get Server Identity
* [getMyPlexAccount](#getmyplexaccount) - Get MyPlex Account
* [getResizedPhoto](#getresizedphoto) - Get a Resized Photo
* [getMediaProviders](#getmediaproviders) - Get Media Providers
* [getServerList](#getserverlist) - Get Server List

## getServerCapabilities

Get Server Capabilities

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerCapabilities" method="get" path="/" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerCapabilitiesBadRequest;
import dev.plexapi.sdk.models.errors.GetServerCapabilitiesUnauthorized;
import dev.plexapi.sdk.models.operations.GetServerCapabilitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerCapabilitiesBadRequest, GetServerCapabilitiesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetServerCapabilitiesResponse](../../models/operations/GetServerCapabilitiesResponse.md)**

### Errors

| Error Type                                      | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/GetServerCapabilitiesBadRequest   | 400                                             | application/json                                |
| models/errors/GetServerCapabilitiesUnauthorized | 401                                             | application/json                                |
| models/errors/SDKError                          | 4XX, 5XX                                        | \*/\*                                           |

## getServerPreferences

Get Server Preferences

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerPreferences" method="get" path="/:/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerPreferencesBadRequest;
import dev.plexapi.sdk.models.errors.GetServerPreferencesUnauthorized;
import dev.plexapi.sdk.models.operations.GetServerPreferencesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerPreferencesBadRequest, GetServerPreferencesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetServerPreferencesResponse res = sdk.server().getServerPreferences()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetServerPreferencesResponse](../../models/operations/GetServerPreferencesResponse.md)**

### Errors

| Error Type                                     | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/GetServerPreferencesBadRequest   | 400                                            | application/json                               |
| models/errors/GetServerPreferencesUnauthorized | 401                                            | application/json                               |
| models/errors/SDKError                         | 4XX, 5XX                                       | \*/\*                                          |

## getAvailableClients

Get Available Clients

### Example Usage

<!-- UsageSnippet language="java" operationID="getAvailableClients" method="get" path="/clients" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetAvailableClientsBadRequest;
import dev.plexapi.sdk.models.errors.GetAvailableClientsUnauthorized;
import dev.plexapi.sdk.models.operations.GetAvailableClientsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetAvailableClientsBadRequest, GetAvailableClientsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetAvailableClientsResponse res = sdk.server().getAvailableClients()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetAvailableClientsResponse](../../models/operations/GetAvailableClientsResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetAvailableClientsBadRequest   | 400                                           | application/json                              |
| models/errors/GetAvailableClientsUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

## getDevices

Get Devices

### Example Usage

<!-- UsageSnippet language="java" operationID="getDevices" method="get" path="/devices" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetDevicesBadRequest;
import dev.plexapi.sdk.models.errors.GetDevicesUnauthorized;
import dev.plexapi.sdk.models.operations.GetDevicesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetDevicesBadRequest, GetDevicesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetDevicesResponse res = sdk.server().getDevices()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetDevicesResponse](../../models/operations/GetDevicesResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GetDevicesBadRequest   | 400                                  | application/json                     |
| models/errors/GetDevicesUnauthorized | 401                                  | application/json                     |
| models/errors/SDKError               | 4XX, 5XX                             | \*/\*                                |

## getServerIdentity

This request is useful to determine if the server is online or offline

### Example Usage

<!-- UsageSnippet language="java" operationID="get-server-identity" method="get" path="/identity" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerIdentityRequestTimeout;
import dev.plexapi.sdk.models.operations.GetServerIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerIdentityRequestTimeout, Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        GetServerIdentityResponse res = sdk.server().getServerIdentity()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetServerIdentityResponse](../../models/operations/GetServerIdentityResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetServerIdentityRequestTimeout | 408                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

## getMyPlexAccount

Returns MyPlex Account Information

### Example Usage

<!-- UsageSnippet language="java" operationID="getMyPlexAccount" method="get" path="/myplex/account" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetMyPlexAccountBadRequest;
import dev.plexapi.sdk.models.errors.GetMyPlexAccountUnauthorized;
import dev.plexapi.sdk.models.operations.GetMyPlexAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetMyPlexAccountBadRequest, GetMyPlexAccountUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetMyPlexAccountResponse res = sdk.server().getMyPlexAccount()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetMyPlexAccountResponse](../../models/operations/GetMyPlexAccountResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetMyPlexAccountBadRequest   | 400                                        | application/json                           |
| models/errors/GetMyPlexAccountUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |

## getResizedPhoto

Plex's Photo transcoder is used throughout the service to serve images at specified sizes.


### Example Usage

<!-- UsageSnippet language="java" operationID="getResizedPhoto" method="get" path="/photo/:/transcode" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetResizedPhotoBadRequest;
import dev.plexapi.sdk.models.errors.GetResizedPhotoUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetResizedPhotoBadRequest, GetResizedPhotoUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetResizedPhotoRequest req = GetResizedPhotoRequest.builder()
                .width(110d)
                .height(165d)
                .opacity(100L)
                .blur(0d)
                .minSize(MinSize.ZERO)
                .upscale(Upscale.ZERO)
                .url("/library/metadata/49564/thumb/1654258204")
                .build();

        GetResizedPhotoResponse res = sdk.server().getResizedPhoto()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetResizedPhotoRequest](../../models/operations/GetResizedPhotoRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetResizedPhotoResponse](../../models/operations/GetResizedPhotoResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetResizedPhotoBadRequest   | 400                                       | application/json                          |
| models/errors/GetResizedPhotoUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## getMediaProviders

Retrieves media providers and their features from the Plex server.

### Example Usage

<!-- UsageSnippet language="java" operationID="get-media-providers" method="get" path="/media/providers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetMediaProvidersBadRequest;
import dev.plexapi.sdk.models.errors.GetMediaProvidersUnauthorized;
import dev.plexapi.sdk.models.operations.GetMediaProvidersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetMediaProvidersBadRequest, GetMediaProvidersUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetMediaProvidersResponse res = sdk.server().getMediaProviders()
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `xPlexToken`                                   | *String*                                       | :heavy_check_mark:                             | An authentication token, obtained from plex.tv | CV5xoxjTpFKUzBTShsaf                           |

### Response

**[GetMediaProvidersResponse](../../models/operations/GetMediaProvidersResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetMediaProvidersBadRequest   | 400                                         | application/json                            |
| models/errors/GetMediaProvidersUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## getServerList

Get Server List

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerList" method="get" path="/servers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerListBadRequest;
import dev.plexapi.sdk.models.errors.GetServerListUnauthorized;
import dev.plexapi.sdk.models.operations.GetServerListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerListBadRequest, GetServerListUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
            .build();

        GetServerListResponse res = sdk.server().getServerList()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetServerListResponse](../../models/operations/GetServerListResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetServerListBadRequest   | 400                                     | application/json                        |
| models/errors/GetServerListUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |