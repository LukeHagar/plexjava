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
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.MarkPlayedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            MarkPlayedResponse res = sdk.media().markPlayed()
                .key(59398d)
                .call();

            // handle response
        } catch (dev.plexapi.sdk.models.errors.MarkPlayedResponseBody e) {
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

| Parameter                       | Type                            | Required                        | Description                     | Example                         |
| ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- | ------------------------------- |
| `key`                           | *double*                        | :heavy_check_mark:              | The media key to mark as played | 59398                           |

### Response

**[MarkPlayedResponse](../../models/operations/MarkPlayedResponse.md)**

### Errors

| Error Object                         | Status Code                          | Content Type                         |
| ------------------------------------ | ------------------------------------ | ------------------------------------ |
| models/errors/MarkPlayedResponseBody | 401                                  | application/json                     |
| models/errors/SDKError               | 4xx-5xx                              | \*\/*                                |


## markUnplayed

This will mark the provided media key as Unplayed.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.MarkUnplayedResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            MarkUnplayedResponse res = sdk.media().markUnplayed()
                .key(59398d)
                .call();

            // handle response
        } catch (dev.plexapi.sdk.models.errors.MarkUnplayedResponseBody e) {
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

| Parameter                         | Type                              | Required                          | Description                       | Example                           |
| --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- | --------------------------------- |
| `key`                             | *double*                          | :heavy_check_mark:                | The media key to mark as Unplayed | 59398                             |

### Response

**[MarkUnplayedResponse](../../models/operations/MarkUnplayedResponse.md)**

### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/MarkUnplayedResponseBody | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | \*\/*                                  |


## updatePlayProgress

This API command can be used to update the play progress of a media item.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.UpdatePlayProgressResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            UpdatePlayProgressResponse res = sdk.media().updatePlayProgress()
                .key("<key>")
                .time(90000d)
                .state("played")
                .call();

            // handle response
        } catch (dev.plexapi.sdk.models.errors.UpdatePlayProgressResponseBody e) {
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

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         | Example                                                             |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `key`                                                               | *String*                                                            | :heavy_check_mark:                                                  | the media key                                                       |                                                                     |
| `time`                                                              | *double*                                                            | :heavy_check_mark:                                                  | The time, in milliseconds, used to set the media playback progress. | 90000                                                               |
| `state`                                                             | *String*                                                            | :heavy_check_mark:                                                  | The playback state of the media item.                               | played                                                              |

### Response

**[UpdatePlayProgressResponse](../../models/operations/UpdatePlayProgressResponse.md)**

### Errors

| Error Object                                 | Status Code                                  | Content Type                                 |
| -------------------------------------------- | -------------------------------------------- | -------------------------------------------- |
| models/errors/UpdatePlayProgressResponseBody | 401                                          | application/json                             |
| models/errors/SDKError                       | 4xx-5xx                                      | \*\/*                                        |


## getBannerImage

Gets the banner image of the media item

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetBannerImageRequest;
import dev.plexapi.sdk.models.operations.GetBannerImageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
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
        } catch (dev.plexapi.sdk.models.errors.GetBannerImageResponseBody e) {
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

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetBannerImageRequest](../../models/operations/GetBannerImageRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[GetBannerImageResponse](../../models/operations/GetBannerImageResponse.md)**

### Errors

| Error Object                             | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetBannerImageResponseBody | 401                                      | application/json                         |
| models/errors/SDKError                   | 4xx-5xx                                  | \*\/*                                    |


## getThumbImage

Gets the thumbnail image of the media item

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetThumbImageRequest;
import dev.plexapi.sdk.models.operations.GetThumbImageResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
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
        } catch (dev.plexapi.sdk.models.errors.GetThumbImageResponseBody e) {
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

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetThumbImageRequest](../../models/operations/GetThumbImageRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[GetThumbImageResponse](../../models/operations/GetThumbImageResponse.md)**

### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/GetThumbImageResponseBody | 401                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | \*\/*                                   |
