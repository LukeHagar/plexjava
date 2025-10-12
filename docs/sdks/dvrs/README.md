# DVRs
(*dvRs()*)

## Overview

The DVR provides means to watch and record live TV.  This section of endpoints describes how to setup the DVR itself


### Available Operations

* [listDVRs](#listdvrs) - Get DVRs
* [createDVR](#createdvr) - Create a DVR
* [deleteDVR](#deletedvr) - Delete a single DVR
* [getDVR](#getdvr) - Get a single DVR
* [deleteLineup](#deletelineup) - Delete a DVR Lineup
* [addLineup](#addlineup) - Add a DVR Lineup
* [setDVRPreferences](#setdvrpreferences) - Set DVR preferences
* [stopDVRReload](#stopdvrreload) - Tell a DVR to stop reloading program guide
* [reloadGuide](#reloadguide) - Tell a DVR to reload program guide
* [tuneChannel](#tunechannel) - Tune a channel on a DVR
* [removeDeviceFromDVR](#removedevicefromdvr) - Remove a device from an existing DVR
* [addDeviceToDVR](#adddevicetodvr) - Add a device to an existing DVR

## listDVRs

Get the list of all available DVRs

### Example Usage

<!-- UsageSnippet language="java" operationID="listDVRs" method="get" path="/livetv/dvrs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListDVRsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListDVRsResponse res = sdk.dvRs().listDVRs()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListDVRsResponse](../../models/operations/ListDVRsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createDVR

Creation of a DVR, after creation of a devcie and a lineup is selected

### Example Usage

<!-- UsageSnippet language="java" operationID="createDVR" method="post" path="/livetv/dvrs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CreateDVRRequest;
import dev.plexapi.sdk.models.operations.CreateDVRResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;
import java.util.List;

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

        CreateDVRRequest req = CreateDVRRequest.builder()
                .lineup("lineup://tv.plex.providers.epg.onconnect/USA-HI51418-DEFAULT")
                .deviceQueryParameter(List.of(
                    "d",
                    "e",
                    "v",
                    "i",
                    "c",
                    "e",
                    "[",
                    "]",
                    "=",
                    "d",
                    "e",
                    "v",
                    "i",
                    "c",
                    "e",
                    ":",
                    "/",
                    "/",
                    "t",
                    "v",
                    ".",
                    "p",
                    "l",
                    "e",
                    "x",
                    ".",
                    "g",
                    "r",
                    "a",
                    "b",
                    "b",
                    "e",
                    "r",
                    "s",
                    ".",
                    "h",
                    "d",
                    "h",
                    "o",
                    "m",
                    "e",
                    "r",
                    "u",
                    "n",
                    "/",
                    "1",
                    "0",
                    "5",
                    "3",
                    "C",
                    "0",
                    "C",
                    "A"))
                .language("eng")
                .build();

        CreateDVRResponse res = sdk.dvRs().createDVR()
                .request(req)
                .call();

        if (res.dvrRequestHandlerSlashGetResponses200().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [CreateDVRRequest](../../models/operations/CreateDVRRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[CreateDVRResponse](../../models/operations/CreateDVRResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteDVR

Delete a single DVR by its id (key)

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteDVR" method="delete" path="/livetv/dvrs/{dvrId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteDVRRequest;
import dev.plexapi.sdk.models.operations.DeleteDVRResponse;
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

        DeleteDVRRequest req = DeleteDVRRequest.builder()
                .dvrId(855088L)
                .build();

        DeleteDVRResponse res = sdk.dvRs().deleteDVR()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [DeleteDVRRequest](../../models/operations/DeleteDVRRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[DeleteDVRResponse](../../models/operations/DeleteDVRResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDVR

Get a single DVR by its id (key)

### Example Usage

<!-- UsageSnippet language="java" operationID="getDVR" method="get" path="/livetv/dvrs/{dvrId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetDVRRequest;
import dev.plexapi.sdk.models.operations.GetDVRResponse;
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

        GetDVRRequest req = GetDVRRequest.builder()
                .dvrId(973518L)
                .build();

        GetDVRResponse res = sdk.dvRs().getDVR()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                 | Type                                                      | Required                                                  | Description                                               |
| --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- | --------------------------------------------------------- |
| `request`                                                 | [GetDVRRequest](../../models/operations/GetDVRRequest.md) | :heavy_check_mark:                                        | The request object to use for the request.                |

### Response

**[GetDVRResponse](../../models/operations/GetDVRResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteLineup

Deletes a DVR device's lineup.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteLineup" method="delete" path="/livetv/dvrs/{dvrId}/lineups" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteLineupRequest;
import dev.plexapi.sdk.models.operations.DeleteLineupResponse;
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

        DeleteLineupRequest req = DeleteLineupRequest.builder()
                .dvrId(454470L)
                .lineup("<value>")
                .build();

        DeleteLineupResponse res = sdk.dvRs().deleteLineup()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [DeleteLineupRequest](../../models/operations/DeleteLineupRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[DeleteLineupResponse](../../models/operations/DeleteLineupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addLineup

Add a lineup to a DVR device's set of lineups.

### Example Usage

<!-- UsageSnippet language="java" operationID="addLineup" method="put" path="/livetv/dvrs/{dvrId}/lineups" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddLineupRequest;
import dev.plexapi.sdk.models.operations.AddLineupResponse;
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

        AddLineupRequest req = AddLineupRequest.builder()
                .dvrId(945235L)
                .lineup("<value>")
                .build();

        AddLineupResponse res = sdk.dvRs().addLineup()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [AddLineupRequest](../../models/operations/AddLineupRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[AddLineupResponse](../../models/operations/AddLineupResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setDVRPreferences

Set DVR preferences by name avd value

### Example Usage

<!-- UsageSnippet language="java" operationID="setDVRPreferences" method="put" path="/livetv/dvrs/{dvrId}/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SetDVRPreferencesRequest;
import dev.plexapi.sdk.models.operations.SetDVRPreferencesResponse;
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

        SetDVRPreferencesRequest req = SetDVRPreferencesRequest.builder()
                .dvrId(116357L)
                .build();

        SetDVRPreferencesResponse res = sdk.dvRs().setDVRPreferences()
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
| `request`                                                                       | [SetDVRPreferencesRequest](../../models/operations/SetDVRPreferencesRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[SetDVRPreferencesResponse](../../models/operations/SetDVRPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stopDVRReload

Tell a DVR to stop reloading program guide

### Example Usage

<!-- UsageSnippet language="java" operationID="stopDVRReload" method="delete" path="/livetv/dvrs/{dvrId}/reloadGuide" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StopDVRReloadRequest;
import dev.plexapi.sdk.models.operations.StopDVRReloadResponse;
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

        StopDVRReloadRequest req = StopDVRReloadRequest.builder()
                .dvrId(348053L)
                .build();

        StopDVRReloadResponse res = sdk.dvRs().stopDVRReload()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [StopDVRReloadRequest](../../models/operations/StopDVRReloadRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[StopDVRReloadResponse](../../models/operations/StopDVRReloadResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reloadGuide

Tell a DVR to reload program guide

### Example Usage

<!-- UsageSnippet language="java" operationID="reloadGuide" method="post" path="/livetv/dvrs/{dvrId}/reloadGuide" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ReloadGuideRequest;
import dev.plexapi.sdk.models.operations.ReloadGuideResponse;
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

        ReloadGuideRequest req = ReloadGuideRequest.builder()
                .dvrId(140753L)
                .build();

        ReloadGuideResponse res = sdk.dvRs().reloadGuide()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ReloadGuideRequest](../../models/operations/ReloadGuideRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[ReloadGuideResponse](../../models/operations/ReloadGuideResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## tuneChannel

Tune a channel on a DVR to the provided channel

### Example Usage

<!-- UsageSnippet language="java" operationID="tuneChannel" method="post" path="/livetv/dvrs/{dvrId}/channels/{channel}/tune" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.TuneChannelRequest;
import dev.plexapi.sdk.models.operations.TuneChannelResponse;
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

        TuneChannelRequest req = TuneChannelRequest.builder()
                .dvrId(834281L)
                .channel("2.1")
                .build();

        TuneChannelResponse res = sdk.dvRs().tuneChannel()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [TuneChannelRequest](../../models/operations/TuneChannelRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[TuneChannelResponse](../../models/operations/TuneChannelResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDeviceFromDVR

Remove a device from an existing DVR

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDeviceFromDVR" method="delete" path="/livetv/dvrs/{dvrId}/devices/{deviceId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RemoveDeviceFromDVRRequest;
import dev.plexapi.sdk.models.operations.RemoveDeviceFromDVRResponse;
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

        RemoveDeviceFromDVRRequest req = RemoveDeviceFromDVRRequest.builder()
                .dvrId(945416L)
                .deviceId(260761L)
                .build();

        RemoveDeviceFromDVRResponse res = sdk.dvRs().removeDeviceFromDVR()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [RemoveDeviceFromDVRRequest](../../models/operations/RemoveDeviceFromDVRRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[RemoveDeviceFromDVRResponse](../../models/operations/RemoveDeviceFromDVRResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addDeviceToDVR

Add a device to an existing DVR

### Example Usage

<!-- UsageSnippet language="java" operationID="addDeviceToDVR" method="put" path="/livetv/dvrs/{dvrId}/devices/{deviceId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddDeviceToDVRRequest;
import dev.plexapi.sdk.models.operations.AddDeviceToDVRResponse;
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

        AddDeviceToDVRRequest req = AddDeviceToDVRRequest.builder()
                .dvrId(334755L)
                .deviceId(852930L)
                .build();

        AddDeviceToDVRResponse res = sdk.dvRs().addDeviceToDVR()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [AddDeviceToDVRRequest](../../models/operations/AddDeviceToDVRRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[AddDeviceToDVRResponse](../../models/operations/AddDeviceToDVRResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |