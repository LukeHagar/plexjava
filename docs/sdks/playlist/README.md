# Playlist
(*playlist()*)

## Overview

Media playlists that can be created and played back

### Available Operations

* [listPlaylists](#listplaylists) - List playlists
* [getPlaylist](#getplaylist) - Retrieve Playlist
* [getPlaylistItems](#getplaylistitems) - Retrieve Playlist Contents

## listPlaylists

Gets a list of playlists and playlist folders for a user. General filters are permitted, such as `sort=lastViewedAt:desc`. A flat playlist list can be retrieved using `type=15` to limit the collection to just playlists.

### Example Usage

<!-- UsageSnippet language="java" operationID="listPlaylists" method="get" path="/playlists" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ListPlaylistsRequest;
import dev.plexapi.sdk.models.operations.ListPlaylistsResponse;
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

        ListPlaylistsRequest req = ListPlaylistsRequest.builder()
                .build();

        ListPlaylistsResponse res = sdk.playlist().listPlaylists()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [ListPlaylistsRequest](../../models/operations/ListPlaylistsRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |

### Response

**[ListPlaylistsResponse](../../models/operations/ListPlaylistsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlaylist

Gets detailed metadata for a playlist. A playlist for many purposes (rating, editing metadata, tagging), can be treated like a regular metadata item:
Smart playlist details contain the `content` attribute. This is the content URI for the generator. This can then be parsed by a client to provide smart playlist editing.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlaylist" method="get" path="/playlists/{playlistId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPlaylistRequest;
import dev.plexapi.sdk.models.operations.GetPlaylistResponse;
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

        GetPlaylistRequest req = GetPlaylistRequest.builder()
                .playlistId(841953L)
                .build();

        GetPlaylistResponse res = sdk.playlist().getPlaylist()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetPlaylistRequest](../../models/operations/GetPlaylistRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetPlaylistResponse](../../models/operations/GetPlaylistResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlaylistItems

Gets the contents of a playlist. Should be paged by clients via standard mechanisms. By default leaves are returned (e.g. episodes, movies). In order to return other types you can use the `type` parameter. For example, you could use this to display a list of recently added albums vis a smart playlist. Note that for dumb playlists, items have a `playlistItemID` attribute which is used for deleting or moving items.

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlaylistItems" method="get" path="/playlists/{playlistId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPlaylistItemsRequest;
import dev.plexapi.sdk.models.operations.GetPlaylistItemsResponse;
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

        GetPlaylistItemsRequest req = GetPlaylistItemsRequest.builder()
                .playlistId(118195L)
                .build();

        GetPlaylistItemsResponse res = sdk.playlist().getPlaylistItems()
                .request(req)
                .call();

        if (res.mediaContainerWithMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetPlaylistItemsRequest](../../models/operations/GetPlaylistItemsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[GetPlaylistItemsResponse](../../models/operations/GetPlaylistItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |