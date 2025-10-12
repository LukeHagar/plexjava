# Devices
(*devices()*)

## Overview

Media grabbers provide ways for media to be obtained for a given protocol. The simplest ones are `stream` and `download`. More complex grabbers can have associated devices

Network tuners can present themselves on the network using the Simple Service Discovery Protocol and Plex Media Server will discover them. The following XML is an example of the data returned from SSDP. The `deviceType`, `serviceType`, and `serviceId` values must remain as they are in the example in order for PMS to properly discover the device. Other less-obvious fields are described in the parameters section below.

Example SSDP output
```
<root xmlns="urn:schemas-upnp-org:device-1-0">
    <specVersion>
        <major>1</major>
        <minor>0</minor>
    </specVersion>
    <device>
        <deviceType>urn:plex-tv:device:Media:1</deviceType>
        <friendlyName>Turing Hopper 3000</friendlyName>
        <manufacturer>Plex, Inc.</manufacturer>
        <manufacturerURL>https://plex.tv/</manufacturerURL>
        <modelDescription>Turing Hopper 3000 Media Grabber</modelDescription>
        <modelName>Plex Media Grabber</modelName>
        <modelNumber>1</modelNumber>
        <modelURL>https://plex.tv</modelURL>
        <UDN>uuid:42fde8e4-93b6-41e5-8a63-12d848655811</UDN>
        <serviceList>
            <service>
                <URLBase>http://10.0.0.5:8088</URLBase>
                <serviceType>urn:plex-tv:service:MediaGrabber:1</serviceType>
                <serviceId>urn:plex-tv:serviceId:MediaGrabber</serviceId>
            </service>
        </serviceList>
    </device>
</root>
```

  - UDN: (string) A UUID for the device. This should be unique across models of a device at minimum.
  - URLBase: (string) The base HTTP URL for the device from which all of the other endpoints are hosted.


### Available Operations

* [getAvailableGrabbers](#getavailablegrabbers) - Get available grabbers
* [listDevices](#listdevices) - Get all devices
* [addDevice](#adddevice) - Add a device
* [discoverDevices](#discoverdevices) - Tell grabbers to discover devices
* [removeDevice](#removedevice) - Remove a device
* [getDeviceDetails](#getdevicedetails) - Get device details
* [modifyDevice](#modifydevice) - Enable or disable a device
* [setChannelmap](#setchannelmap) - Set a device's channel mapping
* [getDevicesChannels](#getdeviceschannels) - Get a device's channels
* [setDevicePreferences](#setdevicepreferences) - Set device preferences
* [stopScan](#stopscan) - Tell a device to stop scanning for channels
* [scan](#scan) - Tell a device to scan for channels
* [getThumb](#getthumb) - Get device thumb

## getAvailableGrabbers

Get available grabbers visible to the server

### Example Usage

<!-- UsageSnippet language="java" operationID="getAvailableGrabbers" method="get" path="/media/grabbers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAvailableGrabbersRequest;
import dev.plexapi.sdk.models.operations.GetAvailableGrabbersResponse;
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

        GetAvailableGrabbersRequest req = GetAvailableGrabbersRequest.builder()
                .protocol("livetv")
                .build();

        GetAvailableGrabbersResponse res = sdk.devices().getAvailableGrabbers()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetAvailableGrabbersRequest](../../models/operations/GetAvailableGrabbersRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetAvailableGrabbersResponse](../../models/operations/GetAvailableGrabbersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## listDevices

Get the list of all devices present

### Example Usage

<!-- UsageSnippet language="java" operationID="listDevices" method="get" path="/media/grabbers/devices" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListDevicesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ListDevicesResponse res = sdk.devices().listDevices()
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[ListDevicesResponse](../../models/operations/ListDevicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addDevice

This endpoint adds a device to an existing grabber. The device is identified, and added to the correct grabber.

### Example Usage

<!-- UsageSnippet language="java" operationID="addDevice" method="post" path="/media/grabbers/devices" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddDeviceRequest;
import dev.plexapi.sdk.models.operations.AddDeviceResponse;
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

        AddDeviceRequest req = AddDeviceRequest.builder()
                .uri("http://10.0.0.5")
                .build();

        AddDeviceResponse res = sdk.devices().addDevice()
                .request(req)
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [AddDeviceRequest](../../models/operations/AddDeviceRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[AddDeviceResponse](../../models/operations/AddDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## discoverDevices

Tell grabbers to discover devices

### Example Usage

<!-- UsageSnippet language="java" operationID="discoverDevices" method="post" path="/media/grabbers/devices/discover" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DiscoverDevicesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        DiscoverDevicesResponse res = sdk.devices().discoverDevices()
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[DiscoverDevicesResponse](../../models/operations/DiscoverDevicesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeDevice

Remove a devices by its id along with its channel mappings

### Example Usage

<!-- UsageSnippet language="java" operationID="removeDevice" method="delete" path="/media/grabbers/devices/{deviceId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.RemoveDeviceRequest;
import dev.plexapi.sdk.models.operations.RemoveDeviceResponse;
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

        RemoveDeviceRequest req = RemoveDeviceRequest.builder()
                .deviceId(685908L)
                .build();

        RemoveDeviceResponse res = sdk.devices().removeDevice()
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
| `request`                                                             | [RemoveDeviceRequest](../../models/operations/RemoveDeviceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[RemoveDeviceResponse](../../models/operations/RemoveDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDeviceDetails

Get a device's details by its id

### Example Usage

<!-- UsageSnippet language="java" operationID="getDeviceDetails" method="get" path="/media/grabbers/devices/{deviceId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetDeviceDetailsRequest;
import dev.plexapi.sdk.models.operations.GetDeviceDetailsResponse;
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

        GetDeviceDetailsRequest req = GetDeviceDetailsRequest.builder()
                .deviceId(170949L)
                .build();

        GetDeviceDetailsResponse res = sdk.devices().getDeviceDetails()
                .request(req)
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetDeviceDetailsRequest](../../models/operations/GetDeviceDetailsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetDeviceDetailsResponse](../../models/operations/GetDeviceDetailsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## modifyDevice

Enable or disable a device by its id

### Example Usage

<!-- UsageSnippet language="java" operationID="modifyDevice" method="put" path="/media/grabbers/devices/{deviceId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ModifyDeviceRequest;
import dev.plexapi.sdk.models.operations.ModifyDeviceResponse;
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

        ModifyDeviceRequest req = ModifyDeviceRequest.builder()
                .deviceId(879135L)
                .enabled(BoolInt.ONE)
                .build();

        ModifyDeviceResponse res = sdk.devices().modifyDevice()
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
| `request`                                                             | [ModifyDeviceRequest](../../models/operations/ModifyDeviceRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[ModifyDeviceResponse](../../models/operations/ModifyDeviceResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setChannelmap

Set a device's channel mapping

### Example Usage

<!-- UsageSnippet language="java" operationID="setChannelmap" method="put" path="/media/grabbers/devices/{deviceId}/channelmap" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
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

        SetChannelmapRequest req = SetChannelmapRequest.builder()
                .deviceId(937661L)
                .channelMapping(ChannelMapping.builder()
                    .build())
                .channelMappingByKey(ChannelMappingByKey.builder()
                    .build())
                .channelsEnabled(List.of(
                    "4",
                    "6",
                    ".",
                    "1",
                    ",",
                    "4",
                    "4",
                    ".",
                    "1",
                    ",",
                    "4",
                    "5",
                    ".",
                    "1"))
                .build();

        SetChannelmapResponse res = sdk.devices().setChannelmap()
                .request(req)
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [SetChannelmapRequest](../../models/operations/SetChannelmapRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[SetChannelmapResponse](../../models/operations/SetChannelmapResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getDevicesChannels

Get a device's channels by its id

### Example Usage

<!-- UsageSnippet language="java" operationID="getDevicesChannels" method="get" path="/media/grabbers/devices/{deviceId}/channels" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetDevicesChannelsRequest;
import dev.plexapi.sdk.models.operations.GetDevicesChannelsResponse;
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

        GetDevicesChannelsRequest req = GetDevicesChannelsRequest.builder()
                .deviceId(517209L)
                .build();

        GetDevicesChannelsResponse res = sdk.devices().getDevicesChannels()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [GetDevicesChannelsRequest](../../models/operations/GetDevicesChannelsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[GetDevicesChannelsResponse](../../models/operations/GetDevicesChannelsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## setDevicePreferences

Set device preferences by its id

### Example Usage

<!-- UsageSnippet language="java" operationID="setDevicePreferences" method="put" path="/media/grabbers/devices/{deviceId}/prefs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.SetDevicePreferencesRequest;
import dev.plexapi.sdk.models.operations.SetDevicePreferencesResponse;
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

        SetDevicePreferencesRequest req = SetDevicePreferencesRequest.builder()
                .deviceId(420973L)
                .build();

        SetDevicePreferencesResponse res = sdk.devices().setDevicePreferences()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [SetDevicePreferencesRequest](../../models/operations/SetDevicePreferencesRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[SetDevicePreferencesResponse](../../models/operations/SetDevicePreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stopScan

Tell a device to stop scanning for channels

### Example Usage

<!-- UsageSnippet language="java" operationID="stopScan" method="delete" path="/media/grabbers/devices/{deviceId}/scan" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StopScanRequest;
import dev.plexapi.sdk.models.operations.StopScanResponse;
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

        StopScanRequest req = StopScanRequest.builder()
                .deviceId(576494L)
                .build();

        StopScanResponse res = sdk.devices().stopScan()
                .request(req)
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [StopScanRequest](../../models/operations/StopScanRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[StopScanResponse](../../models/operations/StopScanResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## scan

Tell a device to scan for channels

### Example Usage

<!-- UsageSnippet language="java" operationID="scan" method="post" path="/media/grabbers/devices/{deviceId}/scan" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ScanRequest;
import dev.plexapi.sdk.models.operations.ScanResponse;
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

        ScanRequest req = ScanRequest.builder()
                .deviceId(57391L)
                .source("Cable")
                .build();

        ScanResponse res = sdk.devices().scan()
                .request(req)
                .call();

        if (res.mediaContainerWithDevice().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                             | Type                                                  | Required                                              | Description                                           |
| ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- | ----------------------------------------------------- |
| `request`                                             | [ScanRequest](../../models/operations/ScanRequest.md) | :heavy_check_mark:                                    | The request object to use for the request.            |

### Response

**[ScanResponse](../../models/operations/ScanResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getThumb

Get a device's thumb for display to the user

### Example Usage

<!-- UsageSnippet language="java" operationID="getThumb" method="get" path="/media/grabbers/devices/{deviceId}/thumb/{version}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetThumbRequest;
import dev.plexapi.sdk.models.operations.GetThumbResponse;
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

        GetThumbRequest req = GetThumbRequest.builder()
                .deviceId(960617L)
                .versionPathParameter(1025L)
                .build();

        GetThumbResponse res = sdk.devices().getThumb()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetThumbRequest](../../models/operations/GetThumbRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetThumbResponse](../../models/operations/GetThumbResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |