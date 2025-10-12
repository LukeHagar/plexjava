# Log
(*log()*)

## Overview

Logging mechanism to allow clients to log to the server

### Available Operations

* [writeLog](#writelog) - Logging a multi-line message to the Plex Media Server log
* [writeMessage](#writemessage) - Logging a single-line message to the Plex Media Server log
* [enablePapertrail](#enablepapertrail) - Enabling Papertrail

## writeLog

This endpoint will write multiple lines to the main Plex Media Server log in a single request. It takes a set of query strings as would normally sent to the above PUT endpoint as a linefeed-separated block of POST data. The parameters for each query string match as above.


### Example Usage

<!-- UsageSnippet language="java" operationID="writeLog" method="post" path="/log" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.WriteLogResponse;
import dev.plexapi.sdk.utils.Utils;
import java.io.FileInputStream;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        byte[] req = Utils.readBytesAndClose(new FileInputStream("example.file"));

        WriteLogResponse res = sdk.log().writeLog()
                .request(req)
                .call();

    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [byte[]](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[WriteLogResponse](../../models/operations/WriteLogResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## writeMessage

This endpoint will write a single-line log message, including a level and source to the main Plex Media Server log.

Note: This endpoint responds to all HTTP verbs **except POST** but PUT is preferred


### Example Usage

<!-- UsageSnippet language="java" operationID="writeMessage" method="put" path="/log" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.WriteMessageRequest;
import dev.plexapi.sdk.models.operations.WriteMessageResponse;
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

        WriteMessageRequest req = WriteMessageRequest.builder()
                .build();

        WriteMessageResponse res = sdk.log().writeMessage()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [WriteMessageRequest](../../models/operations/WriteMessageRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[WriteMessageResponse](../../models/operations/WriteMessageResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## enablePapertrail

This endpoint will enable all Plex Media Server logs to be sent to the Papertrail networked logging site for a period of time

Note: This endpoint responds to all HTTP verbs but POST is preferred


### Example Usage

<!-- UsageSnippet language="java" operationID="enablePapertrail" method="post" path="/log/networked" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.EnablePapertrailRequest;
import dev.plexapi.sdk.models.operations.EnablePapertrailResponse;
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

        EnablePapertrailRequest req = EnablePapertrailRequest.builder()
                .build();

        EnablePapertrailResponse res = sdk.log().enablePapertrail()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [EnablePapertrailRequest](../../models/operations/EnablePapertrailRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[EnablePapertrailResponse](../../models/operations/EnablePapertrailResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |