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

<!-- UsageSnippet language="java" operationID="getTimeline" method="get" path="/:/timeline" -->
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
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
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

<!-- UsageSnippet language="java" operationID="startUniversalTranscode" method="get" path="/video/:/transcode/universal/start.mpd" -->
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
                .accessToken(System.getenv().getOrDefault("ACCESS_TOKEN", ""))
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