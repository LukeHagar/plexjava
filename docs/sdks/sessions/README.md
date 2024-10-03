# Sessions
(*sessions()*)

## Overview

API Calls that perform search operations with Plex Media Server Sessions


### Available Operations

* [getSessions](#getsessions) - Get Active Sessions
* [getSessionHistory](#getsessionhistory) - Get Session History
* [getTranscodeSessions](#gettranscodesessions) - Get Transcode Sessions
* [stopTranscodeSession](#stoptranscodesession) - Stop a Transcode Session

## getSessions

This will retrieve the "Now Playing" Information of the PMS.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetSessionsBadRequest;
import dev.plexapi.sdk.models.errors.GetSessionsUnauthorized;
import dev.plexapi.sdk.models.operations.GetSessionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetSessionsBadRequest, GetSessionsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        GetSessionsResponse res = sdk.sessions().getSessions()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetSessionsResponse](../../models/operations/GetSessionsResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetSessionsBadRequest   | 400                                   | application/json                      |
| models/errors/GetSessionsUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4XX, 5XX                              | \*/\*                                 |

## getSessionHistory

This will Retrieve a listing of all history views.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetSessionHistoryBadRequest;
import dev.plexapi.sdk.models.errors.GetSessionHistoryUnauthorized;
import dev.plexapi.sdk.models.operations.GetSessionHistoryResponse;
import dev.plexapi.sdk.models.operations.QueryParamFilter;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetSessionHistoryBadRequest, GetSessionHistoryUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        GetSessionHistoryResponse res = sdk.sessions().getSessionHistory()
                .sort("<value>")
                .accountId(1L)
                .filter(QueryParamFilter.builder()
                    .build())
                .librarySectionID(12L)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                     | Type                                                                                                                                                                                          | Required                                                                                                                                                                                      | Description                                                                                                                                                                                   | Example                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sort`                                                                                                                                                                                        | *Optional<String>*                                                                                                                                                                            | :heavy_minus_sign:                                                                                                                                                                            | Sorts the results by the specified field followed by the direction (asc, desc)<br/>                                                                                                           |                                                                                                                                                                                               |
| `accountId`                                                                                                                                                                                   | *Optional<Long>*                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                            | Filter results by those that are related to a specific users id<br/>                                                                                                                          | 1                                                                                                                                                                                             |
| `filter`                                                                                                                                                                                      | [Optional<QueryParamFilter>](../../models/operations/QueryParamFilter.md)                                                                                                                     | :heavy_minus_sign:                                                                                                                                                                            | Filters content by field and direction/equality<br/>(Unknown if viewedAt is the only supported column)<br/>                                                                                   | {<br/>"viewed-at-greater-than": {<br/>"value": "viewedAt\u003e"<br/>},<br/>"viewed-at-greater-than-or-equal-to": {<br/>"value": "viewedAt\u003e=\u003e"<br/>},<br/>"viewed-at-less-than": {<br/>"value": "viewedAt\u003c"<br/>}<br/>} |
| `librarySectionID`                                                                                                                                                                            | *Optional<Long>*                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                            | Filters the results based on the id of a valid library section<br/>                                                                                                                           | 12                                                                                                                                                                                            |

### Response

**[GetSessionHistoryResponse](../../models/operations/GetSessionHistoryResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetSessionHistoryBadRequest   | 400                                         | application/json                            |
| models/errors/GetSessionHistoryUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## getTranscodeSessions

Get Transcode Sessions

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTranscodeSessionsBadRequest;
import dev.plexapi.sdk.models.errors.GetTranscodeSessionsUnauthorized;
import dev.plexapi.sdk.models.operations.GetTranscodeSessionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTranscodeSessionsBadRequest, GetTranscodeSessionsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        GetTranscodeSessionsResponse res = sdk.sessions().getTranscodeSessions()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetTranscodeSessionsResponse](../../models/operations/GetTranscodeSessionsResponse.md)**

### Errors

| Error Type                                     | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/GetTranscodeSessionsBadRequest   | 400                                            | application/json                               |
| models/errors/GetTranscodeSessionsUnauthorized | 401                                            | application/json                               |
| models/errors/SDKError                         | 4XX, 5XX                                       | \*/\*                                          |

## stopTranscodeSession

Stop a Transcode Session

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.StopTranscodeSessionBadRequest;
import dev.plexapi.sdk.models.errors.StopTranscodeSessionUnauthorized;
import dev.plexapi.sdk.models.operations.StopTranscodeSessionResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws StopTranscodeSessionBadRequest, StopTranscodeSessionUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        StopTranscodeSessionResponse res = sdk.sessions().stopTranscodeSession()
                .sessionKey("zz7llzqlx8w9vnrsbnwhbmep")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `sessionKey`                             | *String*                                 | :heavy_check_mark:                       | the Key of the transcode session to stop | zz7llzqlx8w9vnrsbnwhbmep                 |

### Response

**[StopTranscodeSessionResponse](../../models/operations/StopTranscodeSessionResponse.md)**

### Errors

| Error Type                                     | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/StopTranscodeSessionBadRequest   | 400                                            | application/json                               |
| models/errors/StopTranscodeSessionUnauthorized | 401                                            | application/json                               |
| models/errors/SDKError                         | 4XX, 5XX                                       | \*/\*                                          |