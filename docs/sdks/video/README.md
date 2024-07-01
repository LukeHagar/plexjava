# Video
(*video()*)

## Overview

API Calls that perform operations with Plex Media Server Videos


### Available Operations

* [getTimeline](#gettimeline) - Get the timeline for a media item
* [startUniversalTranscode](#startuniversaltranscode) - Start Universal Transcode

## getTimeline

Get the timeline for a media item

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

            GetTimelineRequest req = GetTimelineRequest.builder()
                .ratingKey(23409d)
                .key("/library/metadata/23409")
                .state(State.PLAYING)
                .hasMDE(1d)
                .time(2000d)
                .duration(10000d)
                .context("home:hub.continueWatching")
                .playQueueItemID(1d)
                .playBackTime(2000d)
                .row(1d)
                .build();

            GetTimelineResponse res = sdk.video().getTimeline()
                .request(req)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.GetTimelineResponseBody e) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                       | [lukehagar.plexapi.plexapi.models.operations.GetTimelineRequest](../../models/operations/GetTimelineRequest.md) | :heavy_check_mark:                                                                                              | The request object to use for the request.                                                                      |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetTimelineResponse](../../models/operations/GetTimelineResponse.md)**
### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetTimelineResponseBody | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | \*\/*                                 |

## startUniversalTranscode

Begin a Universal Transcode Session

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

            StartUniversalTranscodeRequest req = StartUniversalTranscodeRequest.builder()
                .hasMDE(1d)
                .path("/library/metadata/23409")
                .mediaIndex(0d)
                .partIndex(0d)
                .protocol("hls")
                .fastSeek(0d)
                .directPlay(0d)
                .directStream(0d)
                .subtitleSize(100d)
                .subtites("burn")
                .audioBoost(100d)
                .location("lan")
                .mediaBufferSize(102400d)
                .session("zvcage8b7rkioqcm8f4uns4c")
                .addDebugOverlay(0d)
                .autoAdjustQuality(0d)
                .build();

            StartUniversalTranscodeResponse res = sdk.video().startUniversalTranscode()
                .request(req)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.StartUniversalTranscodeResponseBody e) {
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

| Parameter                                                                                                                               | Type                                                                                                                                    | Required                                                                                                                                | Description                                                                                                                             |
| --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                                               | [lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeRequest](../../models/operations/StartUniversalTranscodeRequest.md) | :heavy_check_mark:                                                                                                                      | The request object to use for the request.                                                                                              |


### Response

**[lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeResponse](../../models/operations/StartUniversalTranscodeResponse.md)**
### Errors

| Error Object                                      | Status Code                                       | Content Type                                      |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| models/errors/StartUniversalTranscodeResponseBody | 401                                               | application/json                                  |
| models/errors/SDKError                            | 4xx-5xx                                           | \*\/*                                             |
