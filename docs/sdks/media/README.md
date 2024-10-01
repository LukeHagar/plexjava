# Media
(*media()*)

## Overview

API Calls interacting with Plex Media Server Media


### Available Operations

* [markPlayed](#markplayed) - Mark Media Played
* [markUnplayed](#markunplayed) - Mark Media Unplayed
* [updatePlayProgress](#updateplayprogress) - Update Media Play Progress
* [getBannerImage](#getbannerimage) - Get Banner Image
* [getThumbImage](#getthumbimage) - Get Thumb Image

## markPlayed

This will mark the provided media key as Played.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.MarkPlayedBadRequest;
import dev.plexapi.sdk.models.errors.MarkPlayedUnauthorized;
import dev.plexapi.sdk.models.operations.MarkPlayedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws MarkPlayedBadRequest, MarkPlayedUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        MarkPlayedResponse res = sdk.media().markPlayed()
                .key(59398d)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `key`                           | *double*                        | :heavy_check_mark:              | The media key to mark as played | 59398                           |

### Response

**[MarkPlayedResponse](../../models/operations/MarkPlayedResponse.md)**

### Errors

| Error Type                           | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/MarkPlayedBadRequest   | 400                                  | application/json                     |
| models/errors/MarkPlayedUnauthorized | 401                                  | application/json                     |
| models/errors/SDKError               | 4XX, 5XX                             | \*/\*                                |

## markUnplayed

This will mark the provided media key as Unplayed.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.MarkUnplayedBadRequest;
import dev.plexapi.sdk.models.errors.MarkUnplayedUnauthorized;
import dev.plexapi.sdk.models.operations.MarkUnplayedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws MarkUnplayedBadRequest, MarkUnplayedUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        MarkUnplayedResponse res = sdk.media().markUnplayed()
                .key(59398d)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                         | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `key`                             | *double*                          | :heavy_check_mark:                | The media key to mark as Unplayed | 59398                             |

### Response

**[MarkUnplayedResponse](../../models/operations/MarkUnplayedResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/MarkUnplayedBadRequest   | 400                                    | application/json                       |
| models/errors/MarkUnplayedUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## updatePlayProgress

This API command can be used to update the play progress of a media item.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.UpdatePlayProgressBadRequest;
import dev.plexapi.sdk.models.errors.UpdatePlayProgressUnauthorized;
import dev.plexapi.sdk.models.operations.UpdatePlayProgressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UpdatePlayProgressBadRequest, UpdatePlayProgressUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        UpdatePlayProgressResponse res = sdk.media().updatePlayProgress()
                .key("<key>")
                .time(90000d)
                .state("played")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `key`                                                               | *String*                                                            | :heavy_check_mark:                                                  | the media key                                                       |                                                                     |
| `time`                                                              | *double*                                                            | :heavy_check_mark:                                                  | The time, in milliseconds, used to set the media playback progress. | 90000                                                               |
| `state`                                                             | *String*                                                            | :heavy_check_mark:                                                  | The playback state of the media item.                               | played                                                              |

### Response

**[UpdatePlayProgressResponse](../../models/operations/UpdatePlayProgressResponse.md)**

### Errors

| Error Type                                   | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UpdatePlayProgressBadRequest   | 400                                          | application/json                             |
| models/errors/UpdatePlayProgressUnauthorized | 401                                          | application/json                             |
| models/errors/SDKError                       | 4XX, 5XX                                     | \*/\*                                        |

## getBannerImage

Gets the banner image of the media item

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetBannerImageBadRequest;
import dev.plexapi.sdk.models.errors.GetBannerImageUnauthorized;
import dev.plexapi.sdk.models.operations.GetBannerImageRequest;
import dev.plexapi.sdk.models.operations.GetBannerImageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetBannerImageBadRequest, GetBannerImageUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetBannerImageRequest req = GetBannerImageRequest.builder()
                .ratingKey(9518L)
                .width(396L)
                .height(396L)
                .minSize(1L)
                .upscale(1L)
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .build();

        GetBannerImageResponse res = sdk.media().getBannerImage()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetBannerImageRequest](../../models/operations/GetBannerImageRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetBannerImageResponse](../../models/operations/GetBannerImageResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetBannerImageBadRequest   | 400                                      | application/json                         |
| models/errors/GetBannerImageUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |

## getThumbImage

Gets the thumbnail image of the media item

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetThumbImageBadRequest;
import dev.plexapi.sdk.models.errors.GetThumbImageUnauthorized;
import dev.plexapi.sdk.models.operations.GetThumbImageRequest;
import dev.plexapi.sdk.models.operations.GetThumbImageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetThumbImageBadRequest, GetThumbImageUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetThumbImageRequest req = GetThumbImageRequest.builder()
                .ratingKey(9518L)
                .width(396L)
                .height(396L)
                .minSize(1L)
                .upscale(1L)
                .xPlexToken("CV5xoxjTpFKUzBTShsaf")
                .build();

        GetThumbImageResponse res = sdk.media().getThumbImage()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetThumbImageRequest](../../models/operations/GetThumbImageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetThumbImageResponse](../../models/operations/GetThumbImageResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetThumbImageBadRequest   | 400                                     | application/json                        |
| models/errors/GetThumbImageUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |