# Butler
(*butler()*)

## Overview

Butler is the task manager of the Plex Media Server Ecosystem.


### Available Operations

* [getButlerTasks](#getbutlertasks) - Get Butler tasks
* [startAllTasks](#startalltasks) - Start all Butler tasks
* [stopAllTasks](#stopalltasks) - Stop all Butler tasks
* [startTask](#starttask) - Start a single Butler task
* [stopTask](#stoptask) - Stop a single Butler task

## getButlerTasks

Returns a list of butler tasks

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

            GetButlerTasksResponse res = sdk.butler().getButlerTasks()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetButlerTasksResponseBody e) {
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

**[lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponse](../../models/operations/GetButlerTasksResponse.md)**
### Errors

| Error Object                             | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetButlerTasksResponseBody | 401                                      | application/json                         |
| models/errors/SDKError                   | 4xx-5xx                                  | \*\/*                                    |

## startAllTasks

This endpoint will attempt to start all Butler tasks that are enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
1. Any tasks not scheduled to run on the current day will be skipped.
2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
4. If we are outside the configured window, the task will start immediately.


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

            StartAllTasksResponse res = sdk.butler().startAllTasks()
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.StartAllTasksResponseBody e) {
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

**[lukehagar.plexapi.plexapi.models.operations.StartAllTasksResponse](../../models/operations/StartAllTasksResponse.md)**
### Errors

| Error Object                            | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/StartAllTasksResponseBody | 401                                     | application/json                        |
| models/errors/SDKError                  | 4xx-5xx                                 | \*\/*                                   |

## stopAllTasks

This endpoint will stop all currently running tasks and remove any scheduled tasks from the queue.


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

            StopAllTasksResponse res = sdk.butler().stopAllTasks()
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.StopAllTasksResponseBody e) {
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

**[lukehagar.plexapi.plexapi.models.operations.StopAllTasksResponse](../../models/operations/StopAllTasksResponse.md)**
### Errors

| Error Object                           | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/StopAllTasksResponseBody | 401                                    | application/json                       |
| models/errors/SDKError                 | 4xx-5xx                                | \*\/*                                  |

## startTask

This endpoint will attempt to start a single Butler task that is enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
1. Any tasks not scheduled to run on the current day will be skipped.
2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
4. If we are outside the configured window, the task will start immediately.


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

            StartTaskResponse res = sdk.butler().startTask()
                .taskName(TaskName.CLEAN_OLD_BUNDLES)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.StartTaskResponseBody e) {
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

| Parameter                                                                                   | Type                                                                                        | Required                                                                                    | Description                                                                                 |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `taskName`                                                                                  | [lukehagar.plexapi.plexapi.models.operations.TaskName](../../models/operations/TaskName.md) | :heavy_check_mark:                                                                          | the name of the task to be started.                                                         |


### Response

**[lukehagar.plexapi.plexapi.models.operations.StartTaskResponse](../../models/operations/StartTaskResponse.md)**
### Errors

| Error Object                        | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/StartTaskResponseBody | 401                                 | application/json                    |
| models/errors/SDKError              | 4xx-5xx                             | \*\/*                               |

## stopTask

This endpoint will stop a currently running task by name, or remove it from the list of scheduled tasks if it exists. See the section above for a list of task names for this endpoint.


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

            StopTaskResponse res = sdk.butler().stopTask()
                .taskName(PathParamTaskName.BACKUP_DATABASE)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.StopTaskResponseBody e) {
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

| Parameter                                                                                                     | Type                                                                                                          | Required                                                                                                      | Description                                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------- |
| `taskName`                                                                                                    | [lukehagar.plexapi.plexapi.models.operations.PathParamTaskName](../../models/operations/PathParamTaskName.md) | :heavy_check_mark:                                                                                            | The name of the task to be started.                                                                           |


### Response

**[lukehagar.plexapi.plexapi.models.operations.StopTaskResponse](../../models/operations/StopTaskResponse.md)**
### Errors

| Error Object                       | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/StopTaskResponseBody | 401                                | application/json                   |
| models/errors/SDKError             | 4xx-5xx                            | \*\/*                              |
