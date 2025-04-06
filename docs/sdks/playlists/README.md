# Playlists
(*playlists()*)

## Overview

Playlists are ordered collections of media. They can be dumb (just a list of media) or smart (based on a media query, such as "all albums from 2017"). 
They can be organized in (optionally nesting) folders.
Retrieving a playlist, or its items, will trigger a refresh of its metadata. 
This may cause the duration and number of items to change.


### Available Operations

* [createPlaylist](#createplaylist) - Create a Playlist
* [getPlaylists](#getplaylists) - Get All Playlists
* [getPlaylist](#getplaylist) - Retrieve Playlist
* [deletePlaylist](#deleteplaylist) - Deletes a Playlist
* [updatePlaylist](#updateplaylist) - Update a Playlist
* [getPlaylistContents](#getplaylistcontents) - Retrieve Playlist Contents
* [clearPlaylistContents](#clearplaylistcontents) - Delete Playlist Contents
* [addPlaylistContents](#addplaylistcontents) - Adding to a Playlist
* [uploadPlaylist](#uploadplaylist) - Upload Playlist

## createPlaylist

Create a new playlist. By default the playlist is blank. To create a playlist along with a first item, pass:
- `uri` - The content URI for what we're playing (e.g. `server://1234/com.plexapp.plugins.library/library/metadata/1`).
- `playQueueID` - To create a playlist from an existing play queue.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.CreatePlaylistBadRequest;
import dev.plexapi.sdk.models.errors.CreatePlaylistUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws CreatePlaylistBadRequest, CreatePlaylistUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        CreatePlaylistRequest req = CreatePlaylistRequest.builder()
                .title("<value>")
                .type(CreatePlaylistQueryParamType.PHOTO)
                .smart(Smart.ONE)
                .uri("https://hoarse-testing.info/")
                .build();

        CreatePlaylistResponse res = sdk.playlists().createPlaylist()
                .request(req)
                .call();

        if (res.object().isPresent()) {
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

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/CreatePlaylistBadRequest   | 400                                      | application/json                         |
| models/errors/CreatePlaylistUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |

## getPlaylists

Get All Playlists given the specified filters.

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetPlaylistsBadRequest;
import dev.plexapi.sdk.models.errors.GetPlaylistsUnauthorized;
import dev.plexapi.sdk.models.operations.GetPlaylistsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetPlaylistsBadRequest, GetPlaylistsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetPlaylistsResponse res = sdk.playlists().getPlaylists()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                | Type                                                                     | Required                                                                 | Description                                                              |
| ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ | ------------------------------------------------------------------------ |
| `playlistType`                                                           | [Optional\<PlaylistType>](../../models/operations/PlaylistType.md)       | :heavy_minus_sign:                                                       | limit to a type of playlist.                                             |
| `smart`                                                                  | [Optional\<QueryParamSmart>](../../models/operations/QueryParamSmart.md) | :heavy_minus_sign:                                                       | type of playlists to return (default is all).                            |

### Response

**[GetPlaylistsResponse](../../models/operations/GetPlaylistsResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/GetPlaylistsBadRequest   | 400                                    | application/json                       |
| models/errors/GetPlaylistsUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## getPlaylist

Gets detailed metadata for a playlist. A playlist for many purposes (rating, editing metadata, tagging), can be treated like a regular metadata item:
Smart playlist details contain the `content` attribute. This is the content URI for the generator. This can then be parsed by a client to provide smart playlist editing.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetPlaylistBadRequest;
import dev.plexapi.sdk.models.errors.GetPlaylistUnauthorized;
import dev.plexapi.sdk.models.operations.GetPlaylistResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetPlaylistBadRequest, GetPlaylistUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetPlaylistResponse res = sdk.playlists().getPlaylist()
                .playlistID(4109.48)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `playlistID`           | *double*               | :heavy_check_mark:     | the ID of the playlist |

### Response

**[GetPlaylistResponse](../../models/operations/GetPlaylistResponse.md)**

### Errors

| Error Type                            | Status Code                           | Content Type                          |
| ------------------------------------- | ------------------------------------- | ------------------------------------- |
| models/errors/GetPlaylistBadRequest   | 400                                   | application/json                      |
| models/errors/GetPlaylistUnauthorized | 401                                   | application/json                      |
| models/errors/SDKError                | 4XX, 5XX                              | \*/\*                                 |

## deletePlaylist

This endpoint will delete a playlist


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.DeletePlaylistBadRequest;
import dev.plexapi.sdk.models.errors.DeletePlaylistUnauthorized;
import dev.plexapi.sdk.models.operations.DeletePlaylistResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws DeletePlaylistBadRequest, DeletePlaylistUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        DeletePlaylistResponse res = sdk.playlists().deletePlaylist()
                .playlistID(216.22)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `playlistID`           | *double*               | :heavy_check_mark:     | the ID of the playlist |

### Response

**[DeletePlaylistResponse](../../models/operations/DeletePlaylistResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/DeletePlaylistBadRequest   | 400                                      | application/json                         |
| models/errors/DeletePlaylistUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |

## updatePlaylist

From PMS version 1.9.1 clients can also edit playlist metadata using this endpoint as they would via `PUT /library/metadata/{playlistID}`


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.UpdatePlaylistBadRequest;
import dev.plexapi.sdk.models.errors.UpdatePlaylistUnauthorized;
import dev.plexapi.sdk.models.operations.UpdatePlaylistResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UpdatePlaylistBadRequest, UpdatePlaylistUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        UpdatePlaylistResponse res = sdk.playlists().updatePlaylist()
                .playlistID(3915)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                           | Type                                | Required                            | Description                         |
| ----------------------------------- | ----------------------------------- | ----------------------------------- | ----------------------------------- |
| `playlistID`                        | *double*                            | :heavy_check_mark:                  | the ID of the playlist              |
| `title`                             | *Optional\<String>*                 | :heavy_minus_sign:                  | name of the playlist                |
| `summary`                           | *Optional\<String>*                 | :heavy_minus_sign:                  | summary description of the playlist |

### Response

**[UpdatePlaylistResponse](../../models/operations/UpdatePlaylistResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/UpdatePlaylistBadRequest   | 400                                      | application/json                         |
| models/errors/UpdatePlaylistUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |

## getPlaylistContents

Gets the contents of a playlist. Should be paged by clients via standard mechanisms. 
By default leaves are returned (e.g. episodes, movies). In order to return other types you can use the `type` parameter. 
For example, you could use this to display a list of recently added albums vis a smart playlist. 
Note that for dumb playlists, items have a `playlistItemID` attribute which is used for deleting or moving items.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetPlaylistContentsBadRequest;
import dev.plexapi.sdk.models.errors.GetPlaylistContentsUnauthorized;
import dev.plexapi.sdk.models.operations.GetPlaylistContentsQueryParamType;
import dev.plexapi.sdk.models.operations.GetPlaylistContentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetPlaylistContentsBadRequest, GetPlaylistContentsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetPlaylistContentsResponse res = sdk.playlists().getPlaylistContents()
                .playlistID(5004.46)
                .type(GetPlaylistContentsQueryParamType.TvShow)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                    | Type                                                                                                                                                                                         | Required                                                                                                                                                                                     | Description                                                                                                                                                                                  | Example                                                                                                                                                                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `playlistID`                                                                                                                                                                                 | *double*                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                           | the ID of the playlist                                                                                                                                                                       |                                                                                                                                                                                              |
| `type`                                                                                                                                                                                       | [GetPlaylistContentsQueryParamType](../../models/operations/GetPlaylistContentsQueryParamType.md)                                                                                            | :heavy_check_mark:                                                                                                                                                                           | The type of media to retrieve or filter by.<br/>1 = movie<br/>2 = show<br/>3 = season<br/>4 = episode<br/>E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries<br/> | 2                                                                                                                                                                                            |

### Response

**[GetPlaylistContentsResponse](../../models/operations/GetPlaylistContentsResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/GetPlaylistContentsBadRequest   | 400                                           | application/json                              |
| models/errors/GetPlaylistContentsUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

## clearPlaylistContents

Clears a playlist, only works with dumb playlists. Returns the playlist.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.ClearPlaylistContentsBadRequest;
import dev.plexapi.sdk.models.errors.ClearPlaylistContentsUnauthorized;
import dev.plexapi.sdk.models.operations.ClearPlaylistContentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ClearPlaylistContentsBadRequest, ClearPlaylistContentsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        ClearPlaylistContentsResponse res = sdk.playlists().clearPlaylistContents()
                .playlistID(1893.18)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter              | Type                   | Required               | Description            |
| ---------------------- | ---------------------- | ---------------------- | ---------------------- |
| `playlistID`           | *double*               | :heavy_check_mark:     | the ID of the playlist |

### Response

**[ClearPlaylistContentsResponse](../../models/operations/ClearPlaylistContentsResponse.md)**

### Errors

| Error Type                                      | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/ClearPlaylistContentsBadRequest   | 400                                             | application/json                                |
| models/errors/ClearPlaylistContentsUnauthorized | 401                                             | application/json                                |
| models/errors/SDKError                          | 4XX, 5XX                                        | \*/\*                                           |

## addPlaylistContents

Adds a generator to a playlist, same parameters as the POST to create. With a dumb playlist, this adds the specified items to the playlist.
With a smart playlist, passing a new `uri` parameter replaces the rules for the playlist. Returns the playlist.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.AddPlaylistContentsBadRequest;
import dev.plexapi.sdk.models.errors.AddPlaylistContentsUnauthorized;
import dev.plexapi.sdk.models.operations.AddPlaylistContentsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws AddPlaylistContentsBadRequest, AddPlaylistContentsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        AddPlaylistContentsResponse res = sdk.playlists().addPlaylistContents()
                .playlistID(8502.01)
                .uri("server://12345/com.plexapp.plugins.library/library/metadata/1")
                .playQueueID(123)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   | Example                                                       |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `playlistID`                                                  | *double*                                                      | :heavy_check_mark:                                            | the ID of the playlist                                        |                                                               |
| `uri`                                                         | *String*                                                      | :heavy_check_mark:                                            | the content URI for the playlist                              | server://12345/com.plexapp.plugins.library/library/metadata/1 |
| `playQueueID`                                                 | *Optional\<Double>*                                           | :heavy_minus_sign:                                            | the play queue to add to a playlist                           | 123                                                           |

### Response

**[AddPlaylistContentsResponse](../../models/operations/AddPlaylistContentsResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/AddPlaylistContentsBadRequest   | 400                                           | application/json                              |
| models/errors/AddPlaylistContentsUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |

## uploadPlaylist

Imports m3u playlists by passing a path on the server to scan for m3u-formatted playlist files, or a path to a single playlist file.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.UploadPlaylistBadRequest;
import dev.plexapi.sdk.models.errors.UploadPlaylistUnauthorized;
import dev.plexapi.sdk.models.operations.QueryParamForce;
import dev.plexapi.sdk.models.operations.UploadPlaylistResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws UploadPlaylistBadRequest, UploadPlaylistUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        UploadPlaylistResponse res = sdk.playlists().uploadPlaylist()
                .path("/home/barkley/playlist.m3u")
                .force(QueryParamForce.ZERO)
                .sectionID(1L)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    | Type                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Required                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Example                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `path`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | *String*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server. <br/>If the `path` argument is a directory, that path will be scanned for playlist files to be processed. <br/>Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it. <br/>The GUID of each playlist is based on the filename. <br/>If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it. <br/>The GUID of each playlist is based on the filename.<br/> | /home/barkley/playlist.m3u                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| `force`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      | [QueryParamForce](../../models/operations/QueryParamForce.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Force overwriting of duplicate playlists.  <br/>By default, a playlist file uploaded with the same path will overwrite the existing playlist. <br/>The `force` argument is used to disable overwriting.  <br/>If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.<br/>                                                                                                                                                                                                                                                                      |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| `sectionID`                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | *long*                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | :heavy_check_mark:                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           | Possibly the section ID to upload the playlist to, we are not certain.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       | 1                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |

### Response

**[UploadPlaylistResponse](../../models/operations/UploadPlaylistResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/UploadPlaylistBadRequest   | 400                                      | application/json                         |
| models/errors/UploadPlaylistUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |