# Plex
(*plex()*)

## Overview

### Available Operations

* [getServerResources](#getserverresources) - Get Server Resources

## getServerResources

Get Plex server access tokens and server connections

### Example Usage

<!-- UsageSnippet language="java" operationID="get-server-resources" method="get" path="/resources" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetServerResourcesUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetServerResourcesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetServerResourcesRequest req = GetServerResourcesRequest.builder()
                .includeHttps(IncludeHttps.True)
                .includeRelay(IncludeRelay.True)
                .includeIPv6(IncludeIPv6.True)
                .build();

        GetServerResourcesResponse res = sdk.plex().getServerResources()
                .request(req)
                .call();

        if (res.plexDevices().isPresent()) {
            // handle response
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

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/GetServerResourcesUnauthorized | 401                                          | application/json                             |
| models/errors/SDKError                       | 4XX, 5XX                                     | \*/\*                                        |