# Updater
(*updater()*)

## Overview

This describes the API for searching and applying updates to the Plex Media Server.
Updates to the status can be observed via the Event API.


### Available Operations

* [applyUpdates](#applyupdates) - Applying updates
* [checkUpdates](#checkupdates) - Checking for updates
* [getUpdatesStatus](#getupdatesstatus) - Querying status of updates

## applyUpdates

Apply any downloaded updates.  Note that the two parameters `tonight` and `skip` are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed.

### Example Usage

<!-- UsageSnippet language="java" operationID="applyUpdates" method="put" path="/updater/apply" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ApplyUpdatesRequest;
import dev.plexapi.sdk.models.operations.ApplyUpdatesResponse;
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

        ApplyUpdatesRequest req = ApplyUpdatesRequest.builder()
                .tonight(BoolInt.ONE)
                .skip(BoolInt.ONE)
                .build();

        ApplyUpdatesResponse res = sdk.updater().applyUpdates()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [ApplyUpdatesRequest](../../models/operations/ApplyUpdatesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ApplyUpdatesResponse](../../models/operations/ApplyUpdatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## checkUpdates

Perform an update check and potentially download

### Example Usage

<!-- UsageSnippet language="java" operationID="checkUpdates" method="put" path="/updater/check" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CheckUpdatesRequest;
import dev.plexapi.sdk.models.operations.CheckUpdatesResponse;
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

        CheckUpdatesRequest req = CheckUpdatesRequest.builder()
                .download(BoolInt.ONE)
                .build();

        CheckUpdatesResponse res = sdk.updater().checkUpdates()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [CheckUpdatesRequest](../../models/operations/CheckUpdatesRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[CheckUpdatesResponse](../../models/operations/CheckUpdatesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUpdatesStatus

Get the status of updating the server

### Example Usage

<!-- UsageSnippet language="java" operationID="getUpdatesStatus" method="get" path="/updater/status" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetUpdatesStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetUpdatesStatusResponse res = sdk.updater().getUpdatesStatus()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetUpdatesStatusResponse](../../models/operations/GetUpdatesStatusResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |