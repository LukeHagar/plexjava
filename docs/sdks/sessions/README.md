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

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetSessionsResponse res = sdk.sessions().getSessions()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetSessionsResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetSessionsResponse](../../models/operations/GetSessionsResponse.md)**
### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetSessionsResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | \*\/*                                 |

## getSessionHistory

This will Retrieve a listing of all history views.

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetSessionHistoryResponse res = sdk.sessions().getSessionHistory()
                .sort("<value>")
                .accountId(1L)
                .filter(Filter.builder()
                    .build())
                .librarySectionID(12L)
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetSessionHistoryResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                                                                                                                                                                     | Type                                                                                                                                                                                          | Required                                                                                                                                                                                      | Description                                                                                                                                                                                   | Example                                                                                                                                                                                       |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `sort`                                                                                                                                                                                        | *Optional<? extends String>*                                                                                                                                                                  | :heavy_minus_sign:                                                                                                                                                                            | Sorts the results by the specified field followed by the direction (asc, desc)<br/>                                                                                                           |                                                                                                                                                                                               |
| `accountId`                                                                                                                                                                                   | *Optional<? extends Long>*                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                            | Filter results by those that are related to a specific users id<br/>                                                                                                                          | 1                                                                                                                                                                                             |
| `filter`                                                                                                                                                                                      | [Optional<? extends lukehagar.plexapi.plexapi.models.operations.Filter>](../../models/operations/Filter.md)                                                                                   | :heavy_minus_sign:                                                                                                                                                                            | Filters content by field and direction/equality<br/>(Unknown if viewedAt is the only supported column)<br/>                                                                                   | {<br/>"viewed-at-greater-than": {<br/>"value": "viewedAt\u003e"<br/>},<br/>"viewed-at-greater-than-or-equal-to": {<br/>"value": "viewedAt\u003e=\u003e"<br/>},<br/>"viewed-at-less-than": {<br/>"value": "viewedAt\u003c"<br/>}<br/>} |
| `librarySectionID`                                                                                                                                                                            | *Optional<? extends Long>*                                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                                            | Filters the results based on the id of a valid library section<br/>                                                                                                                           | 12                                                                                                                                                                                            |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponse](../../models/operations/GetSessionHistoryResponse.md)**
### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetSessionHistoryResponseBody | 401                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |

## getTranscodeSessions

Get Transcode Sessions

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetTranscodeSessionsResponse res = sdk.sessions().getTranscodeSessions()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetTranscodeSessionsResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponse](../../models/operations/GetTranscodeSessionsResponse.md)**
### Errors

| Error Object                                   | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/GetTranscodeSessionsResponseBody | 401                                            | application/json                               |
| models/errors/SDKError                         | 4xx-5xx                                        | \*\/*                                          |

## stopTranscodeSession

Stop a Transcode Session

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            StopTranscodeSessionResponse res = sdk.sessions().stopTranscodeSession()
                .sessionKey("zz7llzqlx8w9vnrsbnwhbmep")
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.StopTranscodeSessionResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```

### Parameters

| Parameter                                | Type                                     | Required                                 | Description                              | Example                                  |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| `sessionKey`                             | *String*                                 | :heavy_check_mark:                       | the Key of the transcode session to stop | zz7llzqlx8w9vnrsbnwhbmep                 |


### Response

**[lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponse](../../models/operations/StopTranscodeSessionResponse.md)**
### Errors

| Error Object                                   | Status Code                                    | Content Type                                   |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| models/errors/StopTranscodeSessionResponseBody | 401                                            | application/json                               |
| models/errors/SDKError                         | 4xx-5xx                                        | \*\/*                                          |
