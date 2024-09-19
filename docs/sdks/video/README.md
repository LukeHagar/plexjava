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
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetTimelineRequest;
import dev.plexapi.sdk.models.operations.GetTimelineResponse;
import dev.plexapi.sdk.models.operations.State;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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
        } catch (dev.plexapi.sdk.models.errors.GetTimelineBadRequest e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.GetTimelineUnauthorized e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetTimelineRequest](../../models/operations/GetTimelineRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetTimelineResponse](../../models/operations/GetTimelineResponse.md)**

### Errors

| Error Object                          | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetTimelineBadRequest   | 400                                   | application/json                      |
| models/errors/GetTimelineUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4xx-5xx                               | \*\/*                                 |


## startUniversalTranscode

Begin a Universal Transcode Session

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.StartUniversalTranscodeRequest;
import dev.plexapi.sdk.models.operations.StartUniversalTranscodeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
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
        } catch (dev.plexapi.sdk.models.errors.StartUniversalTranscodeBadRequest e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.StartUniversalTranscodeUnauthorized e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `request`                                                                                   | [StartUniversalTranscodeRequest](../../models/operations/StartUniversalTranscodeRequest.md) | :heavy_check_mark:                                                                          | The request object to use for the request.                                                  |

### Response

**[StartUniversalTranscodeResponse](../../models/operations/StartUniversalTranscodeResponse.md)**

### Errors

| Error Object                                      | Status Code                                       | Content Type                                      |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| models/errors/StartUniversalTranscodeBadRequest   | 400                                               | application/json                                  |
| models/errors/StartUniversalTranscodeUnauthorized | 401                                               | application/json                                  |
| models/errors/SDKError                            | 4xx-5xx                                           | \*\/*                                             |
