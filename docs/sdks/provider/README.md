# Provider
(*provider()*)

## Overview

Media providers are the starting points for the entire Plex Media Server media library API.  It defines the paths for the groups of endpoints.  The `/media/providers` should be the only hard-coded path in clients when accessing the media library.  Non-media library endpoints are outside the scope of the media provider.  See the description in See [the section in API Info](#section/API-Info/Media-Providers) for more information on how to use media providers.

### Available Operations

* [listProviders](#listproviders) - Get the list of available media providers
* [addProvider](#addprovider) - Add a media provider
* [refreshProviders](#refreshproviders) - Refresh media providers
* [deleteMediaProvider](#deletemediaprovider) - Delete a media provider

## listProviders

Get the list of all available media providers for this PMS.  This will generally include the library provider and possibly EPG if DVR is set up.

### Example Usage

<!-- UsageSnippet language="java" operationID="listProviders" method="get" path="/media/providers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListProvidersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListProvidersResponse res = sdk.provider().listProviders()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListProvidersResponse](../../models/operations/ListProvidersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addProvider

This endpoint registers a media provider with the server. Once registered, the media server acts as a reverse proxy to the provider, allowing both local and remote providers to work.

### Example Usage

<!-- UsageSnippet language="java" operationID="addProvider" method="post" path="/media/providers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddProviderRequest;
import dev.plexapi.sdk.models.operations.AddProviderResponse;
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

        AddProviderRequest req = AddProviderRequest.builder()
                .url("https://steep-obedience.name/")
                .build();

        AddProviderResponse res = sdk.provider().addProvider()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [AddProviderRequest](../../models/operations/AddProviderRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[AddProviderResponse](../../models/operations/AddProviderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## refreshProviders

Refresh all known media providers. This is useful in case a provider has updated features.

### Example Usage

<!-- UsageSnippet language="java" operationID="refreshProviders" method="post" path="/media/providers/refresh" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RefreshProvidersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        RefreshProvidersResponse res = sdk.provider().refreshProviders()
                .call();

        // handle response
    }
}
```

### Response

**[RefreshProvidersResponse](../../models/operations/RefreshProvidersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteMediaProvider

Deletes a media provider with the given id

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteMediaProvider" method="delete" path="/media/providers/{provider}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteMediaProviderRequest;
import dev.plexapi.sdk.models.operations.DeleteMediaProviderResponse;
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

        DeleteMediaProviderRequest req = DeleteMediaProviderRequest.builder()
                .provider("<value>")
                .build();

        DeleteMediaProviderResponse res = sdk.provider().deleteMediaProvider()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeleteMediaProviderRequest](../../models/operations/DeleteMediaProviderRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeleteMediaProviderResponse](../../models/operations/DeleteMediaProviderResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |