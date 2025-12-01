# UltraBlur
(*ultraBlur()*)

## Overview

Service provided to compute UltraBlur colors and images.

### Available Operations

* [getColors](#getcolors) - Get UltraBlur Colors
* [getImage](#getimage) - Get UltraBlur Image

## getColors

Retrieves the four colors extracted from an image for clients to use to generate an ultrablur image.

### Example Usage

<!-- UsageSnippet language="java" operationID="getColors" method="get" path="/services/ultrablur/colors" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetColorsRequest;
import dev.plexapi.sdk.models.operations.GetColorsResponse;
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

        GetColorsRequest req = GetColorsRequest.builder()
                .url("/library/metadata/217745/art/1718931408")
                .build();

        GetColorsResponse res = sdk.ultraBlur().getColors()
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
| `request`                                                       | [GetColorsRequest](../../models/operations/GetColorsRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[GetColorsResponse](../../models/operations/GetColorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getImage

Retrieves a server-side generated UltraBlur image based on the provided color inputs. Clients should always call this via the photo transcoder endpoint.

### Example Usage

<!-- UsageSnippet language="java" operationID="getImage" method="get" path="/services/ultrablur/image" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetImageRequest;
import dev.plexapi.sdk.models.operations.GetImageResponse;
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

        GetImageRequest req = GetImageRequest.builder()
                .topLeft("3f280a")
                .topRight("6b4713")
                .bottomRight("0f2a43")
                .bottomLeft("1c425d")
                .width(1920L)
                .height(1080L)
                .noise(BoolInt.True)
                .build();

        GetImageResponse res = sdk.ultraBlur().getImage()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetImageRequest](../../models/operations/GetImageRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[GetImageResponse](../../models/operations/GetImageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |