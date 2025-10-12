# Preferences
(*preferences()*)

## Overview

API Operations against the Preferences

### Available Operations

* [getAllPreferences](#getallpreferences) - Get all preferences
* [setPreferences](#setpreferences) - Set preferences
* [getPreference](#getpreference) - Get a preferences

## getAllPreferences

Get the list of all preferences

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllPreferences" method="get" path="/:/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAllPreferencesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetAllPreferencesResponse res = sdk.preferences().getAllPreferences()
                .call();

        if (res.mediaContainerWithSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetAllPreferencesResponse](../../models/operations/GetAllPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setPreferences

Set a set of preferences in query parameters

### Example Usage

<!-- UsageSnippet language="java" operationID="setPreferences" method="put" path="/:/prefs" -->
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

        SetPreferencesRequest req = SetPreferencesRequest.builder()
                .prefs(Prefs.builder()
                    .build())
                .build();

        SetPreferencesResponse res = sdk.preferences().setPreferences()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [SetPreferencesRequest](../../models/operations/SetPreferencesRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[SetPreferencesResponse](../../models/operations/SetPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPreference

Get a single preference and value

### Example Usage

<!-- UsageSnippet language="java" operationID="getPreference" method="get" path="/:/prefs/get" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPreferenceRequest;
import dev.plexapi.sdk.models.operations.GetPreferenceResponse;
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

        GetPreferenceRequest req = GetPreferenceRequest.builder()
                .build();

        GetPreferenceResponse res = sdk.preferences().getPreference()
                .request(req)
                .call();

        if (res.mediaContainerWithSettings().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetPreferenceRequest](../../models/operations/GetPreferenceRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetPreferenceResponse](../../models/operations/GetPreferenceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |