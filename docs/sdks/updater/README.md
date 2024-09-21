# Updater
(*updater()*)

## Overview

This describes the API for searching and applying updates to the Plex Media Server.
Updates to the status can be observed via the Event API.


### Available Operations

* [getUpdateStatus](#getupdatestatus) - Querying status of updates
* [checkForUpdates](#checkforupdates) - Checking for updates
* [applyUpdates](#applyupdates) - Apply Updates

## getUpdateStatus

Querying status of updates

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetUpdateStatusBadRequest;
import dev.plexapi.sdk.models.errors.GetUpdateStatusUnauthorized;
import dev.plexapi.sdk.models.operations.GetUpdateStatusResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetUpdateStatusBadRequest, GetUpdateStatusUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        GetUpdateStatusResponse res = sdk.updater().getUpdateStatus()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetUpdateStatusResponse](../../models/operations/GetUpdateStatusResponse.md)**

### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetUpdateStatusBadRequest   | 400                                       | application/json                          |
| models/errors/GetUpdateStatusUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |


## checkForUpdates

Checking for updates

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.CheckForUpdatesBadRequest;
import dev.plexapi.sdk.models.errors.CheckForUpdatesUnauthorized;
import dev.plexapi.sdk.models.operations.CheckForUpdatesResponse;
import dev.plexapi.sdk.models.operations.Download;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws CheckForUpdatesBadRequest, CheckForUpdatesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        CheckForUpdatesResponse res = sdk.updater().checkForUpdates()
                .download(Download.ONE)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                   | Type                                                        | Required                                                    | Description                                                 | Example                                                     |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `download`                                                  | [Optional<Download>](../../models/operations/Download.md)   | :heavy_minus_sign:                                          | Indicate that you want to start download any updates found. | 1                                                           |

### Response

**[CheckForUpdatesResponse](../../models/operations/CheckForUpdatesResponse.md)**

### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/CheckForUpdatesBadRequest   | 400                                       | application/json                          |
| models/errors/CheckForUpdatesUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |


## applyUpdates

Note that these two parameters are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.ApplyUpdatesBadRequest;
import dev.plexapi.sdk.models.errors.ApplyUpdatesUnauthorized;
import dev.plexapi.sdk.models.operations.ApplyUpdatesResponse;
import dev.plexapi.sdk.models.operations.Skip;
import dev.plexapi.sdk.models.operations.Tonight;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws ApplyUpdatesBadRequest, ApplyUpdatesUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("gcgzw5rz2xovp84b4vha3a40")
                .clientName("Plex Web")
                .clientVersion("4.133.0")
                .clientPlatform("Chrome")
                .deviceName("Linux")
            .build();

        ApplyUpdatesResponse res = sdk.updater().applyUpdates()
                .tonight(Tonight.ONE)
                .skip(Skip.ONE)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              | Example                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `tonight`                                                                                                                                                | [Optional<Tonight>](../../models/operations/Tonight.md)                                                                                                  | :heavy_minus_sign:                                                                                                                                       | Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install | 1                                                                                                                                                        |
| `skip`                                                                                                                                                   | [Optional<Skip>](../../models/operations/Skip.md)                                                                                                        | :heavy_minus_sign:                                                                                                                                       | Indicate that the latest version should be marked as skipped. The [Release] entry for this version will have the `state` set to `skipped`.               | 1                                                                                                                                                        |

### Response

**[ApplyUpdatesResponse](../../models/operations/ApplyUpdatesResponse.md)**

### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ApplyUpdatesBadRequest   | 400                                    | application/json                       |
| models/errors/ApplyUpdatesUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | \*\/*                                  |
