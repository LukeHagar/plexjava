# General
(*general()*)

## Overview

General endpoints for basic PMS operation not specific to any media provider

### Available Operations

* [getServerInfo](#getserverinfo) - Get PMS info
* [getIdentity](#getidentity) - Get PMS identity
* [getSourceConnectionInformation](#getsourceconnectioninformation) - Get Source Connection Information
* [getTransientToken](#gettransienttoken) - Get Transient Tokens

## getServerInfo

Information about this PMS setup and configuration

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerInfo" method="get" path="/" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetServerInfoRequest;
import dev.plexapi.sdk.models.operations.GetServerInfoResponse;
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

        GetServerInfoRequest req = GetServerInfoRequest.builder()
                .build();

        GetServerInfoResponse res = sdk.general().getServerInfo()
                .request(req)
                .call();

        if (res.mediaContainerWithDirectory().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetServerInfoRequest](../../models/operations/GetServerInfoRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetServerInfoResponse](../../models/operations/GetServerInfoResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getIdentity

Get details about this PMS's identity

### Example Usage

<!-- UsageSnippet language="java" operationID="getIdentity" method="get" path="/identity" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetIdentityResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        GetIdentityResponse res = sdk.general().getIdentity()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetIdentityResponse](../../models/operations/GetIdentityResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSourceConnectionInformation

If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.

### Example Usage

<!-- UsageSnippet language="java" operationID="getSourceConnectionInformation" method="get" path="/security/resources" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationRequest;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
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

        GetSourceConnectionInformationRequest req = GetSourceConnectionInformationRequest.builder()
                .source("server://client-identifier")
                .refresh(BoolInt.ONE)
                .build();

        GetSourceConnectionInformationResponse res = sdk.general().getSourceConnectionInformation()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                 | Type                                                                                                      | Required                                                                                                  | Description                                                                                               |
| --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                 | [GetSourceConnectionInformationRequest](../../models/operations/GetSourceConnectionInformationRequest.md) | :heavy_check_mark:                                                                                        | The request object to use for the request.                                                                |

### Response

**[GetSourceConnectionInformationResponse](../../models/operations/GetSourceConnectionInformationResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTransientToken

This endpoint provides the caller with a temporary token with the same access level as the caller's token. These tokens are valid for up to 48 hours and are destroyed if the server instance is restarted.
Note: This endpoint responds to all HTTP verbs but POST in preferred

### Example Usage

<!-- UsageSnippet language="java" operationID="getTransientToken" method="post" path="/security/token" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
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

        GetTransientTokenRequest req = GetTransientTokenRequest.builder()
                .type(QueryParamType.DELEGATION)
                .scope(Scope.ALL)
                .build();

        GetTransientTokenResponse res = sdk.general().getTransientToken()
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
| `request`                                                                       | [GetTransientTokenRequest](../../models/operations/GetTransientTokenRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[GetTransientTokenResponse](../../models/operations/GetTransientTokenResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |