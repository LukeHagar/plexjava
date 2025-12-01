# PlayQueue
(*playQueue()*)

## Overview

The playqueue feature within a media provider
A play queue represents the current list of media for playback. Although queues are persisted by the server, they should be regarded by the user as a fairly lightweight, an ephemeral list of items queued up for playback in a session.  There is generally one active queue for each type of media (music, video, photos) that can be added to or destroyed and replaced with a fresh queue.
Play Queues has a region, which we refer to in this doc (partially for historical reasons) as "Up Next". This region is defined by `playQueueLastAddedItemID` existing on the media container. This follows iTunes' terminology. It is a special region after the currently playing item but before the originally-played items. This enables "Party Mode" listening/viewing, where items can be added on-the-fly, and normal queue playback resumed when completed. 
You can visualize the play queue as a sliding window in the complete list of media queued for playback. This model is important when scaling to larger play queues (e.g. shuffling 40,000 audio tracks). The client only needs visibility into small areas of the queue at any given time, and the server can optimize access in this fashion.
All created play queues will have an empty "Up Next" area - unless the item is an album and no `key` is provided. In this case the "Up Next" area will be populated by the contents of the album. This is to allow queueing of multiple albums - since the 'Add to Up Next' will insert after all the tracks. This means that If you're creating a PQ from an album, you can only shuffle it if you set `key`. This is due to the above implicit queueing of albums when no `key` is provided as well as the current limitation that you cannot shuffle a PQ with an "Up Next" area.
The play queue window advances as the server receives timeline requests. The client needs to retrieve the play queue as the “now playing” item changes. There is no play queue API to update the playing item.

### Available Operations

* [createPlayQueue](#createplayqueue) - Create a play queue
* [getPlayQueue](#getplayqueue) - Retrieve a play queue
* [addToPlayQueue](#addtoplayqueue) - Add a generator or playlist to a play queue
* [clearPlayQueue](#clearplayqueue) - Clear a play queue
* [resetPlayQueue](#resetplayqueue) - Reset a play queue
* [shuffle](#shuffle) - Shuffle a play queue
* [unshuffle](#unshuffle) - Unshuffle a play queue
* [deletePlayQueueItem](#deleteplayqueueitem) - Delete an item from a play queue
* [movePlayQueueItem](#moveplayqueueitem) - Move an item in a play queue

## createPlayQueue

Makes a new play queue for a device. The source of the playqueue can either be a URI, or a playlist. The response is a media container with the initial items in the queue. Each item in the queue will be a regular item but with `playQueueItemID` - a unique ID since the queue could have repeated items with the same `ratingKey`.
Note: Either `uri` or `playlistID` must be specified

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlayQueue" method="post" path="/playQueues" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
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

        CreatePlayQueueRequest req = CreatePlayQueueRequest.builder()
                .type(Type.AUDIO)
                .shuffle(BoolInt.True)
                .repeat(BoolInt.True)
                .continuous(BoolInt.True)
                .recursive(BoolInt.True)
                .onDeck(BoolInt.True)
                .build();

        CreatePlayQueueResponse res = sdk.playQueue().createPlayQueue()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [CreatePlayQueueRequest](../../models/operations/CreatePlayQueueRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[CreatePlayQueueResponse](../../models/operations/CreatePlayQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlayQueue

Retrieves the play queue, centered at current item. This can be treated as a regular container by play queue-oblivious clients, but they may wish to request a large window onto the queue since they won't know to refresh.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlayQueue" method="get" path="/playQueues/{playQueueId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPlayQueueRequest;
import dev.plexapi.sdk.models.operations.GetPlayQueueResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
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

        GetPlayQueueRequest req = GetPlayQueueRequest.builder()
                .playQueueId(210646L)
                .own(BoolInt.True)
                .includeBefore(BoolInt.True)
                .includeAfter(BoolInt.True)
                .build();

        GetPlayQueueResponse res = sdk.playQueue().getPlayQueue()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetPlayQueueRequest](../../models/operations/GetPlayQueueRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |

### Response

**[GetPlayQueueResponse](../../models/operations/GetPlayQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addToPlayQueue

Adds an item to a play queue (e.g. party mode). Increments the version of the play queue. Takes the following parameters (`uri` and `playlistID` are mutually exclusive). Returns the modified play queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="addToPlayQueue" method="put" path="/playQueues/{playQueueId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddToPlayQueueRequest;
import dev.plexapi.sdk.models.operations.AddToPlayQueueResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
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

        AddToPlayQueueRequest req = AddToPlayQueueRequest.builder()
                .playQueueId(919248L)
                .next(BoolInt.True)
                .build();

        AddToPlayQueueResponse res = sdk.playQueue().addToPlayQueue()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [AddToPlayQueueRequest](../../models/operations/AddToPlayQueueRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[AddToPlayQueueResponse](../../models/operations/AddToPlayQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## clearPlayQueue

Deletes all items in the play queue, and increases the version of the play queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="clearPlayQueue" method="delete" path="/playQueues/{playQueueId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ClearPlayQueueRequest;
import dev.plexapi.sdk.models.operations.ClearPlayQueueResponse;
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

        ClearPlayQueueRequest req = ClearPlayQueueRequest.builder()
                .playQueueId(86357L)
                .build();

        ClearPlayQueueResponse res = sdk.playQueue().clearPlayQueue()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ClearPlayQueueRequest](../../models/operations/ClearPlayQueueRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ClearPlayQueueResponse](../../models/operations/ClearPlayQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## resetPlayQueue

Reset a play queue to the first item being the current item

### Example Usage

<!-- UsageSnippet language="java" operationID="resetPlayQueue" method="put" path="/playQueues/{playQueueId}/reset" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ResetPlayQueueRequest;
import dev.plexapi.sdk.models.operations.ResetPlayQueueResponse;
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

        ResetPlayQueueRequest req = ResetPlayQueueRequest.builder()
                .playQueueId(581891L)
                .build();

        ResetPlayQueueResponse res = sdk.playQueue().resetPlayQueue()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [ResetPlayQueueRequest](../../models/operations/ResetPlayQueueRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[ResetPlayQueueResponse](../../models/operations/ResetPlayQueueResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## shuffle

Shuffle a play queue (or reshuffles if already shuffled). The currently selected item is maintained. Note that this is currently only supported for play queues *without* an Up Next area. Returns the modified play queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="shuffle" method="put" path="/playQueues/{playQueueId}/shuffle" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ShuffleRequest;
import dev.plexapi.sdk.models.operations.ShuffleResponse;
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

        ShuffleRequest req = ShuffleRequest.builder()
                .playQueueId(316150L)
                .build();

        ShuffleResponse res = sdk.playQueue().shuffle()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `request`                                                   | [ShuffleRequest](../../models/operations/ShuffleRequest.md) | :heavy_check_mark:                                          | The request object to use for the request.                  |

### Response

**[ShuffleResponse](../../models/operations/ShuffleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## unshuffle

Unshuffles a play queue and restores "natural order". Note that this is currently only supported for play queues *without* an Up Next area. Returns the modified play queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="unshuffle" method="put" path="/playQueues/{playQueueId}/unshuffle" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UnshuffleRequest;
import dev.plexapi.sdk.models.operations.UnshuffleResponse;
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

        UnshuffleRequest req = UnshuffleRequest.builder()
                .playQueueId(484388L)
                .build();

        UnshuffleResponse res = sdk.playQueue().unshuffle()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [UnshuffleRequest](../../models/operations/UnshuffleRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[UnshuffleResponse](../../models/operations/UnshuffleResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deletePlayQueueItem

Deletes an item in a play queue. Increments the version of the play queue. Returns the modified play queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="deletePlayQueueItem" method="delete" path="/playQueues/{playQueueId}/items/{playQueueItemId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeletePlayQueueItemRequest;
import dev.plexapi.sdk.models.operations.DeletePlayQueueItemResponse;
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

        DeletePlayQueueItemRequest req = DeletePlayQueueItemRequest.builder()
                .playQueueId(285738L)
                .playQueueItemId(464354L)
                .build();

        DeletePlayQueueItemResponse res = sdk.playQueue().deletePlayQueueItem()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [DeletePlayQueueItemRequest](../../models/operations/DeletePlayQueueItemRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[DeletePlayQueueItemResponse](../../models/operations/DeletePlayQueueItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## movePlayQueueItem

Moves an item in a play queue, and increases the version of the play queue. Returns the modified play queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="movePlayQueueItem" method="put" path="/playQueues/{playQueueId}/items/{playQueueItemId}/move" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.MovePlayQueueItemRequest;
import dev.plexapi.sdk.models.operations.MovePlayQueueItemResponse;
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

        MovePlayQueueItemRequest req = MovePlayQueueItemRequest.builder()
                .playQueueId(31341L)
                .playQueueItemId(495865L)
                .build();

        MovePlayQueueItemResponse res = sdk.playQueue().movePlayQueueItem()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [MovePlayQueueItemRequest](../../models/operations/MovePlayQueueItemRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |

### Response

**[MovePlayQueueItemResponse](../../models/operations/MovePlayQueueItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |