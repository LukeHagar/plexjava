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
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetServerCapabilitiesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetServerCapabilitiesResponseBody e) {
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

**[GetServerCapabilitiesResponse](../../models/operations/GetServerCapabilitiesResponse.md)**

### Errors

| Error Object                                    | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/GetServerCapabilitiesResponseBody | 401                                             | application/json                                |
| models/errors/SDKError                          | 4xx-5xx                                         | \*\/*                                           |


## getServerPreferences

Get Server Preferences

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetServerPreferencesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetServerPreferencesResponse res = sdk.server().getServerPreferences()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetServerPreferencesResponseBody e) {
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

**[GetServerPreferencesResponse](../../models/operations/GetServerPreferencesResponse.md)**

### Errors

| Error Object                                   | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/GetServerPreferencesResponseBody | 401                                            | application/json                               |
| models/errors/SDKError                         | 4xx-5xx                                        | \*\/*                                          |


## getAvailableClients

Get Available Clients

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetAvailableClientsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetAvailableClientsResponse res = sdk.server().getAvailableClients()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetAvailableClientsResponseBody e) {
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

**[GetAvailableClientsResponse](../../models/operations/GetAvailableClientsResponse.md)**

### Errors

| Error Object                                  | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetAvailableClientsResponseBody | 401                                           | application/json                              |
| models/errors/SDKError                        | 4xx-5xx                                       | \*\/*                                         |


## getDevices

Get Devices

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetDevicesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetDevicesResponse res = sdk.server().getDevices()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetDevicesResponseBody e) {
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

**[GetDevicesResponse](../../models/operations/GetDevicesResponse.md)**

### Errors

| Error Object                         | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/GetDevicesResponseBody | 401                                  | application/json                     |
| models/errors/SDKError               | 4xx-5xx                              | \*\/*                                |


## getServerIdentity

This request is useful to determine if the server is online or offline

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetServerIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetServerIdentityResponse res = sdk.server().getServerIdentity()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetServerIdentityResponseBody e) {
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

**[GetServerIdentityResponse](../../models/operations/GetServerIdentityResponse.md)**

### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetServerIdentityResponseBody | 408                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |


## getMyPlexAccount

Returns MyPlex Account Information

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetMyPlexAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetMyPlexAccountResponse res = sdk.server().getMyPlexAccount()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetMyPlexAccountResponseBody e) {
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

**[GetMyPlexAccountResponse](../../models/operations/GetMyPlexAccountResponse.md)**

### Errors

| Error Object                               | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/GetMyPlexAccountResponseBody | 401                                        | application/json                           |
| models/errors/SDKError                     | 4xx-5xx                                    | \*\/*                                      |


## getResizedPhoto

Plex's Photo transcoder is used throughout the service to serve images at specified sizes.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetResizedPhotoRequest;
import dev.plexapi.sdk.models.operations.GetResizedPhotoResponse;
import dev.plexapi.sdk.models.operations.MinSize;
import dev.plexapi.sdk.models.operations.Upscale;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetResizedPhotoRequest req = GetResizedPhotoRequest.builder()
                .width(110d)
                .height(165d)
                .opacity(643869L)
                .blur(4000d)
                .minSize(MinSize.ZERO)
                .upscale(Upscale.ZERO)
                .url("/library/metadata/49564/thumb/1654258204")
                .build();

            GetResizedPhotoResponse res = sdk.server().getResizedPhoto()
                .request(req)
                .call();

            // handle response
        } catch (dev.plexapi.sdk.models.errors.GetResizedPhotoResponseBody e) {
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

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetResizedPhotoRequest](../../models/operations/GetResizedPhotoRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetResizedPhotoResponse](../../models/operations/GetResizedPhotoResponse.md)**

### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetResizedPhotoResponseBody | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |


## getMediaProviders

Retrieves media providers and their features from the Plex server.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetMediaProvidersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetMediaProvidersResponse res = sdk.server().getMediaProviders()
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetMediaProvidersResponseBody e) {
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

| Parameter                 | Type                      | Required                  | Description               | Example                   |
| ------------------------- | ------------------------- | ------------------------- | ------------------------- | ------------------------- |
| `xPlexToken`              | *String*                  | :heavy_check_mark:        | Plex Authentication Token | CV5xoxjTpFKUzBTShsaf      |

### Response

**[GetMediaProvidersResponse](../../models/operations/GetMediaProvidersResponse.md)**

### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetMediaProvidersResponseBody | 401                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |


## getServerList

Get Server List

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetServerListResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetServerListResponse res = sdk.server().getServerList()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetServerListResponseBody e) {
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

**[GetServerListResponse](../../models/operations/GetServerListResponse.md)**

### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetServerListResponseBody | 401                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | \*\/*                                   |
