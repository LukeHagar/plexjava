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

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetUpdateStatusResponse res = sdk.updater().getUpdateStatus()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetUpdateStatusResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
            // handle exception
            throw e;
        } catch (Exception e) {
            // handle exception
            throw e;
        }

    }
}
```


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponse](../../models/operations/GetUpdateStatusResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetUpdateStatusResponseBody | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## checkForUpdates

Checking for updates

### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            CheckForUpdatesResponse res = sdk.updater().checkForUpdates()
                .download(Download.ONE)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.CheckForUpdatesResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
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

| Parameter                                                                                                       | Type                                                                                                            | Required                                                                                                        | Description                                                                                                     | Example                                                                                                         |
| --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| `download`                                                                                                      | [Optional<? extends lukehagar.plexapi.plexapi.models.operations.Download>](../../models/operations/Download.md) | :heavy_minus_sign:                                                                                              | Indicate that you want to start download any updates found.                                                     | 1                                                                                                               |


### Response

**[lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponse](../../models/operations/CheckForUpdatesResponse.md)**
### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/CheckForUpdatesResponseBody | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |

## applyUpdates

Note that these two parameters are effectively mutually exclusive. The `tonight` parameter takes precedence and `skip` will be ignored if `tonight` is also passed


### Example Usage

```java
package hello.world;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.*;
import lukehagar.plexapi.plexapi.models.shared.*;
import lukehagar.plexapi.plexapi.models.shared.Security;
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            ApplyUpdatesResponse res = sdk.updater().applyUpdates()
                .tonight(Tonight.ONE)
                .skip(Skip.ONE)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.ApplyUpdatesResponseBody e) {
            // handle exception
            throw e;
        } catch (lukehagar.plexapi.plexapi.models.errors.SDKError e) {
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

| Parameter                                                                                                                                                | Type                                                                                                                                                     | Required                                                                                                                                                 | Description                                                                                                                                              | Example                                                                                                                                                  |
| -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `tonight`                                                                                                                                                | [Optional<? extends lukehagar.plexapi.plexapi.models.operations.Tonight>](../../models/operations/Tonight.md)                                            | :heavy_minus_sign:                                                                                                                                       | Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install | 1                                                                                                                                                        |
| `skip`                                                                                                                                                   | [Optional<? extends lukehagar.plexapi.plexapi.models.operations.Skip>](../../models/operations/Skip.md)                                                  | :heavy_minus_sign:                                                                                                                                       | Indicate that the latest version should be marked as skipped. The <Release> entry for this version will have the `state` set to `skipped`.               | 1                                                                                                                                                        |


### Response

**[lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse](../../models/operations/ApplyUpdatesResponse.md)**
### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/ApplyUpdatesResponseBody | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | \*\/*                                  |
