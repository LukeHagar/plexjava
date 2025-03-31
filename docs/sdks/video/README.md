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

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTimelineBadRequest;
import dev.plexapi.sdk.models.errors.GetTimelineUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTimelineBadRequest, GetTimelineUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetTimelineRequest req = GetTimelineRequest.builder()
                .ratingKey(23409)
                .key("/library/metadata/23409")
                .state(State.PLAYING)
                .hasMDE(1)
                .time(2000)
                .duration(10000)
                .context("home:hub.continueWatching")
                .playQueueItemID(1)
                .playBackTime(2000)
                .row(1)
                .build();

        GetTimelineResponse res = sdk.video().getTimeline()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetTimelineRequest](../../models/operations/GetTimelineRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetTimelineResponse](../../models/operations/GetTimelineResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetTimelineBadRequest   | 400                                   | application/json                      |
| models/errors/GetTimelineUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4XX, 5XX                              | \*/\*                                 |

## startUniversalTranscode

Begin a Universal Transcode Session

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.StartUniversalTranscodeBadRequest;
import dev.plexapi.sdk.models.errors.StartUniversalTranscodeUnauthorized;
import dev.plexapi.sdk.models.operations.StartUniversalTranscodeRequest;
import dev.plexapi.sdk.models.operations.StartUniversalTranscodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws StartUniversalTranscodeBadRequest, StartUniversalTranscodeUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        StartUniversalTranscodeRequest req = StartUniversalTranscodeRequest.builder()
                .hasMDE(1)
                .path("/library/metadata/23409")
                .mediaIndex(0)
                .partIndex(0)
                .protocol("hls")
                .fastSeek(0)
                .directPlay(0)
                .directStream(0)
                .subtitleSize(100)
                .subtites("burn")
                .audioBoost(100)
                .location("lan")
                .mediaBufferSize(102400)
                .session("zvcage8b7rkioqcm8f4uns4c")
                .addDebugOverlay(0)
                .autoAdjustQuality(0)
                .build();

        StartUniversalTranscodeResponse res = sdk.video().startUniversalTranscode()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [StartUniversalTranscodeRequest](../../models/operations/StartUniversalTranscodeRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[StartUniversalTranscodeResponse](../../models/operations/StartUniversalTranscodeResponse.md)**

### Errors

| Error Type                                        | Status Code                                       | Content Type                                      |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| models/errors/StartUniversalTranscodeBadRequest   | 400                                               | application/json                                  |
| models/errors/StartUniversalTranscodeUnauthorized | 401                                               | application/json                                  |
| models/errors/SDKError                            | 4XX, 5XX                                          | \*/\*                                             |