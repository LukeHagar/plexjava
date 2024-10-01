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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerIdentityRequestTimeout;
import dev.plexapi.sdk.models.operations.GetServerIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerIdentityRequestTimeout, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetResizedPhotoBadRequest;
import dev.plexapi.sdk.models.errors.GetResizedPhotoUnauthorized;
import dev.plexapi.sdk.models.operations.GetResizedPhotoRequest;
import dev.plexapi.sdk.models.operations.GetResizedPhotoResponse;
import dev.plexapi.sdk.models.operations.MinSize;
import dev.plexapi.sdk.models.operations.Upscale;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetResizedPhotoBadRequest, GetResizedPhotoUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetResizedPhotoRequest req = GetResizedPhotoRequest.builder()
                .width(110d)
                .height(165d)
                .opacity(100L)
                .blur(20d)
                .minSize(MinSize.ZERO)
                .upscale(Upscale.ONE)
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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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

| Parameter                 | Type                      | Required                  | Description               | Example                   |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `xPlexToken`              | *String*                  | :heavy_check_mark:        | Plex Authentication Token | CV5xoxjTpFKUzBTShsaf      |

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
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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