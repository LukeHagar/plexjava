# LibraryPlaylists
(*libraryPlaylists()*)

## Overview

Endpoints for manipulating playlists.

### Available Operations

* [createPlaylist](#createplaylist) - Create a Playlist
* [uploadPlaylist](#uploadplaylist) - Upload
* [deletePlaylist](#deleteplaylist) - Delete a Playlist
* [updatePlaylist](#updateplaylist) - Editing a Playlist
* [getPlaylistGenerators](#getplaylistgenerators) - Get a playlist's generators
* [clearPlaylistItems](#clearplaylistitems) - Clearing a playlist
* [addPlaylistItems](#addplaylistitems) - Adding to  a Playlist
* [deletePlaylistItem](#deleteplaylistitem) - Delete a Generator
* [getPlaylistGenerator](#getplaylistgenerator) - Get a playlist generator
* [getPlaylistGeneratorItems](#getplaylistgeneratoritems) - Get a playlist generator's items
* [movePlaylistItem](#moveplaylistitem) - Moving items in a playlist
* [refreshPlaylist](#refreshplaylist) - Reprocess a generator

## createPlaylist

Create a new playlist. By default the playlist is blank.

### Example Usage

<!-- UsageSnippet language="java" operationID="createPlaylist" method="post" path="/playlists" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CreatePlaylistRequest;
import dev.plexapi.sdk.models.operations.CreatePlaylistResponse;
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

        CreatePlaylistRequest req = CreatePlaylistRequest.builder()
                .uri("https://short-term-disconnection.name/")
                .build();

        CreatePlaylistResponse res = sdk.libraryPlaylists().createPlaylist()
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
| `request`                                                                 | [CreatePlaylistRequest](../../models/operations/CreatePlaylistRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[CreatePlaylistResponse](../../models/operations/CreatePlaylistResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## uploadPlaylist

Imports m3u playlists by passing a path on the server to scan for m3u-formatted playlist files, or a path to a single playlist file.

### Example Usage

<!-- UsageSnippet language="java" operationID="uploadPlaylist" method="post" path="/playlists/upload" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UploadPlaylistRequest;
import dev.plexapi.sdk.models.operations.UploadPlaylistResponse;
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

        UploadPlaylistRequest req = UploadPlaylistRequest.builder()
                .path("/home/barkley/playlist.m3u")
                .force(BoolInt.ONE)
                .build();

        UploadPlaylistResponse res = sdk.libraryPlaylists().uploadPlaylist()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UploadPlaylistRequest](../../models/operations/UploadPlaylistRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UploadPlaylistResponse](../../models/operations/UploadPlaylistResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deletePlaylist

Deletes a playlist by provided id

### Example Usage

<!-- UsageSnippet language="java" operationID="deletePlaylist" method="delete" path="/playlists/{playlistId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeletePlaylistRequest;
import dev.plexapi.sdk.models.operations.DeletePlaylistResponse;
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

        DeletePlaylistRequest req = DeletePlaylistRequest.builder()
                .playlistId(343293L)
                .build();

        DeletePlaylistResponse res = sdk.libraryPlaylists().deletePlaylist()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DeletePlaylistRequest](../../models/operations/DeletePlaylistRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[DeletePlaylistResponse](../../models/operations/DeletePlaylistResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updatePlaylist

Edits a playlist in the same manner as [editing metadata](#tag/Provider/operation/metadataPutItem)

### Example Usage

<!-- UsageSnippet language="java" operationID="updatePlaylist" method="put" path="/playlists/{playlistId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.UpdatePlaylistRequest;
import dev.plexapi.sdk.models.operations.UpdatePlaylistResponse;
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

        UpdatePlaylistRequest req = UpdatePlaylistRequest.builder()
                .playlistId(157966L)
                .build();

        UpdatePlaylistResponse res = sdk.libraryPlaylists().updatePlaylist()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdatePlaylistRequest](../../models/operations/UpdatePlaylistRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |

### Response

**[UpdatePlaylistResponse](../../models/operations/UpdatePlaylistResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlaylistGenerators

Get all the generators in a playlist

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlaylistGenerators" method="get" path="/playlists/{playlistId}/generators" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPlaylistGeneratorsRequest;
import dev.plexapi.sdk.models.operations.GetPlaylistGeneratorsResponse;
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

        GetPlaylistGeneratorsRequest req = GetPlaylistGeneratorsRequest.builder()
                .playlistId(162342L)
                .build();

        GetPlaylistGeneratorsResponse res = sdk.libraryPlaylists().getPlaylistGenerators()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetPlaylistGeneratorsRequest](../../models/operations/GetPlaylistGeneratorsRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |

### Response

**[GetPlaylistGeneratorsResponse](../../models/operations/GetPlaylistGeneratorsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## clearPlaylistItems

Clears a playlist, only works with dumb playlists. Returns the playlist.

### Example Usage

<!-- UsageSnippet language="java" operationID="clearPlaylistItems" method="delete" path="/playlists/{playlistId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ClearPlaylistItemsRequest;
import dev.plexapi.sdk.models.operations.ClearPlaylistItemsResponse;
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

        ClearPlaylistItemsRequest req = ClearPlaylistItemsRequest.builder()
                .playlistId(552140L)
                .build();

        ClearPlaylistItemsResponse res = sdk.libraryPlaylists().clearPlaylistItems()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [ClearPlaylistItemsRequest](../../models/operations/ClearPlaylistItemsRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[ClearPlaylistItemsResponse](../../models/operations/ClearPlaylistItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## addPlaylistItems

Adds a generator to a playlist, same parameters as the POST above. With a dumb playlist, this adds the specified items to the playlist. With a smart playlist, passing a new `uri` parameter replaces the rules for the playlist. Returns the playlist.

### Example Usage

<!-- UsageSnippet language="java" operationID="addPlaylistItems" method="put" path="/playlists/{playlistId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.AddPlaylistItemsRequest;
import dev.plexapi.sdk.models.operations.AddPlaylistItemsResponse;
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

        AddPlaylistItemsRequest req = AddPlaylistItemsRequest.builder()
                .playlistId(533723L)
                .build();

        AddPlaylistItemsResponse res = sdk.libraryPlaylists().addPlaylistItems()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [AddPlaylistItemsRequest](../../models/operations/AddPlaylistItemsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[AddPlaylistItemsResponse](../../models/operations/AddPlaylistItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deletePlaylistItem

Deletes an item from a playlist. Only works with dumb playlists.

### Example Usage

<!-- UsageSnippet language="java" operationID="deletePlaylistItem" method="delete" path="/playlists/{playlistId}/items/{generatorId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeletePlaylistItemRequest;
import dev.plexapi.sdk.models.operations.DeletePlaylistItemResponse;
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

        DeletePlaylistItemRequest req = DeletePlaylistItemRequest.builder()
                .playlistId(981646L)
                .generatorId(194010L)
                .build();

        DeletePlaylistItemResponse res = sdk.libraryPlaylists().deletePlaylistItem()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeletePlaylistItemRequest](../../models/operations/DeletePlaylistItemRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeletePlaylistItemResponse](../../models/operations/DeletePlaylistItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlaylistGenerator

Get a playlist's generator.  Only used for optimized versions

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlaylistGenerator" method="get" path="/playlists/{playlistId}/items/{generatorId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPlaylistGeneratorRequest;
import dev.plexapi.sdk.models.operations.GetPlaylistGeneratorResponse;
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

        GetPlaylistGeneratorRequest req = GetPlaylistGeneratorRequest.builder()
                .playlistId(744880L)
                .generatorId(322168L)
                .build();

        GetPlaylistGeneratorResponse res = sdk.libraryPlaylists().getPlaylistGenerator()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [GetPlaylistGeneratorRequest](../../models/operations/GetPlaylistGeneratorRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |

### Response

**[GetPlaylistGeneratorResponse](../../models/operations/GetPlaylistGeneratorResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getPlaylistGeneratorItems

Get a playlist generator's items

### Example Usage

<!-- UsageSnippet language="java" operationID="getPlaylistGeneratorItems" method="get" path="/playlists/{playlistId}/items/{generatorId}/items" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetPlaylistGeneratorItemsRequest;
import dev.plexapi.sdk.models.operations.GetPlaylistGeneratorItemsResponse;
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

        GetPlaylistGeneratorItemsRequest req = GetPlaylistGeneratorItemsRequest.builder()
                .playlistId(77230L)
                .generatorId(979714L)
                .build();

        GetPlaylistGeneratorItemsResponse res = sdk.libraryPlaylists().getPlaylistGeneratorItems()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                       | Type                                                                                            | Required                                                                                        | Description                                                                                     |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| `request`                                                                                       | [GetPlaylistGeneratorItemsRequest](../../models/operations/GetPlaylistGeneratorItemsRequest.md) | :heavy_check_mark:                                                                              | The request object to use for the request.                                                      |

### Response

**[GetPlaylistGeneratorItemsResponse](../../models/operations/GetPlaylistGeneratorItemsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## movePlaylistItem

Moves an item in a playlist. Only works with dumb playlists.

### Example Usage

<!-- UsageSnippet language="java" operationID="movePlaylistItem" method="put" path="/playlists/{playlistId}/items/{playlistItemId}/move" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.MovePlaylistItemRequest;
import dev.plexapi.sdk.models.operations.MovePlaylistItemResponse;
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

        MovePlaylistItemRequest req = MovePlaylistItemRequest.builder()
                .playlistId(940298L)
                .playlistItemId(375626L)
                .build();

        MovePlaylistItemResponse res = sdk.libraryPlaylists().movePlaylistItem()
                .request(req)
                .call();

        if (res.mediaContainerWithPlaylistMetadata().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [MovePlaylistItemRequest](../../models/operations/MovePlaylistItemRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |

### Response

**[MovePlaylistItemResponse](../../models/operations/MovePlaylistItemResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## refreshPlaylist

Make a generator reprocess (refresh)

### Example Usage

<!-- UsageSnippet language="java" operationID="refreshPlaylist" method="put" path="/playlists/{playlistId}/items/{generatorId}/{metadataId}/{action}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
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

        RefreshPlaylistRequest req = RefreshPlaylistRequest.builder()
                .playlistId(895314L)
                .generatorId(629742L)
                .metadataId(724422L)
                .action(Action.DISABLE)
                .build();

        RefreshPlaylistResponse res = sdk.libraryPlaylists().refreshPlaylist()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [RefreshPlaylistRequest](../../models/operations/RefreshPlaylistRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[RefreshPlaylistResponse](../../models/operations/RefreshPlaylistResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |