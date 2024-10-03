# Log
(*log()*)

## Overview

Submit logs to the Log Handler for Plex Media Server


### Available Operations

* [logLine](#logline) - Logging a single line message.
* [logMultiLine](#logmultiline) - Logging a multi-line message
* [enablePaperTrail](#enablepapertrail) - Enabling Papertrail

## logLine

This endpoint will write a single-line log message, including a level and source to the main Plex Media Server log.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.LogLineBadRequest;
import dev.plexapi.sdk.models.errors.LogLineUnauthorized;
import dev.plexapi.sdk.models.operations.Level;
import dev.plexapi.sdk.models.operations.LogLineResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws LogLineBadRequest, LogLineUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        LogLineResponse res = sdk.log().logLine()
                .level(Level.THREE)
                .message("Test log message")
                .source("Postman")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   | Example                                                                                                       |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `level`                                                                                                       | [Level](../../models/operations/Level.md)                                                                     | :heavy_check_mark:                                                                                            | An integer log level to write to the PMS log with.  <br/>0: Error  <br/>1: Warning  <br/>2: Info  <br/>3: Debug  <br/>4: Verbose<br/> |                                                                                                               |
| `message`                                                                                                     | *String*                                                                                                      | :heavy_check_mark:                                                                                            | The text of the message to write to the log.                                                                  | Test log message                                                                                              |
| `source`                                                                                                      | *String*                                                                                                      | :heavy_check_mark:                                                                                            | a string indicating the source of the message.                                                                | Postman                                                                                                       |

### Response

**[LogLineResponse](../../models/operations/LogLineResponse.md)**

### Errors

| Error Type                        | Status Code                       | Content Type                      |
| --------------------------------- | --------------------------------- | --------------------------------- |
| models/errors/LogLineBadRequest   | 400                               | application/json                  |
| models/errors/LogLineUnauthorized | 401                               | application/json                  |
| models/errors/SDKError            | 4XX, 5XX                          | \*/\*                             |

## logMultiLine

This endpoint allows for the batch addition of log entries to the main Plex Media Server log.  
It accepts a text/plain request body, where each line represents a distinct log entry.  
Each log entry consists of URL-encoded key-value pairs, specifying log attributes such as 'level', 'message', and 'source'.  

Log entries are separated by a newline character (`\n`).  
Each entry's parameters should be URL-encoded to ensure accurate parsing and handling of special characters.  
This method is efficient for logging multiple entries in a single API call, reducing the overhead of multiple individual requests.  

The 'level' parameter specifies the log entry's severity or importance, with the following integer values:
- `0`: Error - Critical issues that require immediate attention.
- `1`: Warning - Important events that are not critical but may indicate potential issues.
- `2`: Info - General informational messages about system operation.
- `3`: Debug - Detailed information useful for debugging purposes.
- `4`: Verbose - Highly detailed diagnostic information for in-depth analysis.

The 'message' parameter contains the log text, and 'source' identifies the log message's origin (e.g., an application name or module).

Example of a single log entry format:
`level=4&message=Sample%20log%20entry&source=applicationName`

Ensure each parameter is properly URL-encoded to avoid interpretation issues.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.LogMultiLineBadRequest;
import dev.plexapi.sdk.models.errors.LogMultiLineUnauthorized;
import dev.plexapi.sdk.models.operations.LogMultiLineResponse;
import java.lang.Exception;
import java.lang.String;

public class Application {

    public static void main(String[] args) throws LogMultiLineBadRequest, LogMultiLineUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        String req = "level=4&message=Test%20message%201&source=postman\nlevel=3&message=Test%20message%202&source=postman
            level=1&message=Test%20message%203&source=postman";

        LogMultiLineResponse res = sdk.log().logMultiLine()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                  | Type                                       | Required                                   | Description                                |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `request`                                  | [String](../../models//.md)                | :heavy_check_mark:                         | The request object to use for the request. |

### Response

**[LogMultiLineResponse](../../models/operations/LogMultiLineResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/LogMultiLineBadRequest   | 400                                    | application/json                       |
| models/errors/LogMultiLineUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## enablePaperTrail

This endpoint will enable all Plex Media Serverlogs to be sent to the Papertrail networked logging site for a period of time.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.EnablePaperTrailBadRequest;
import dev.plexapi.sdk.models.errors.EnablePaperTrailUnauthorized;
import dev.plexapi.sdk.models.operations.EnablePaperTrailResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws EnablePaperTrailBadRequest, EnablePaperTrailUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        EnablePaperTrailResponse res = sdk.log().enablePaperTrail()
                .call();

        // handle response
    }
}
```

### Response

**[EnablePaperTrailResponse](../../models/operations/EnablePaperTrailResponse.md)**

### Errors

| Error Type                                 | Status Code                                | Content Type                               |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| models/errors/EnablePaperTrailBadRequest   | 400                                        | application/json                           |
| models/errors/EnablePaperTrailUnauthorized | 401                                        | application/json                           |
| models/errors/SDKError                     | 4XX, 5XX                                   | \*/\*                                      |