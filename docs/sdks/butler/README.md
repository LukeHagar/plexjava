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

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetButlerTasksBadRequest;
import dev.plexapi.sdk.models.errors.GetButlerTasksUnauthorized;
import dev.plexapi.sdk.models.operations.GetButlerTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetButlerTasksBadRequest, GetButlerTasksUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        GetButlerTasksResponse res = sdk.butler().getButlerTasks()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetButlerTasksResponse](../../models/operations/GetButlerTasksResponse.md)**

### Errors

| Error Type                               | Status Code                              | Content Type                             |
| ---------------------------------------- | ---------------------------------------- | ---------------------------------------- |
| models/errors/GetButlerTasksBadRequest   | 400                                      | application/json                         |
| models/errors/GetButlerTasksUnauthorized | 401                                      | application/json                         |
| models/errors/SDKError                   | 4XX, 5XX                                 | \*/\*                                    |

## startAllTasks

This endpoint will attempt to start all Butler tasks that are enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
1. Any tasks not scheduled to run on the current day will be skipped.
2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
4. If we are outside the configured window, the task will start immediately.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.StartAllTasksBadRequest;
import dev.plexapi.sdk.models.errors.StartAllTasksUnauthorized;
import dev.plexapi.sdk.models.operations.StartAllTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws StartAllTasksBadRequest, StartAllTasksUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        StartAllTasksResponse res = sdk.butler().startAllTasks()
                .call();

        // handle response
    }
}
```

### Response

**[StartAllTasksResponse](../../models/operations/StartAllTasksResponse.md)**

### Errors

| Error Type                              | Status Code                             | Content Type                            |
| --------------------------------------- | --------------------------------------- | --------------------------------------- |
| models/errors/StartAllTasksBadRequest   | 400                                     | application/json                        |
| models/errors/StartAllTasksUnauthorized | 401                                     | application/json                        |
| models/errors/SDKError                  | 4XX, 5XX                                | \*/\*                                   |

## stopAllTasks

This endpoint will stop all currently running tasks and remove any scheduled tasks from the queue.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.StopAllTasksBadRequest;
import dev.plexapi.sdk.models.errors.StopAllTasksUnauthorized;
import dev.plexapi.sdk.models.operations.StopAllTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws StopAllTasksBadRequest, StopAllTasksUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        StopAllTasksResponse res = sdk.butler().stopAllTasks()
                .call();

        // handle response
    }
}
```

### Response

**[StopAllTasksResponse](../../models/operations/StopAllTasksResponse.md)**

### Errors

| Error Type                             | Status Code                            | Content Type                           |
| -------------------------------------- | -------------------------------------- | -------------------------------------- |
| models/errors/StopAllTasksBadRequest   | 400                                    | application/json                       |
| models/errors/StopAllTasksUnauthorized | 401                                    | application/json                       |
| models/errors/SDKError                 | 4XX, 5XX                               | \*/\*                                  |

## startTask

This endpoint will attempt to start a single Butler task that is enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
1. Any tasks not scheduled to run on the current day will be skipped.
2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
4. If we are outside the configured window, the task will start immediately.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.StartTaskBadRequest;
import dev.plexapi.sdk.models.errors.StartTaskUnauthorized;
import dev.plexapi.sdk.models.operations.StartTaskResponse;
import dev.plexapi.sdk.models.operations.TaskName;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws StartTaskBadRequest, StartTaskUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        StartTaskResponse res = sdk.butler().startTask()
                .taskName(TaskName.CLEAN_OLD_BUNDLES)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                       | Type                                            | Required                                        | Description                                     |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| `taskName`                                      | [TaskName](../../models/operations/TaskName.md) | :heavy_check_mark:                              | the name of the task to be started.             |

### Response

**[StartTaskResponse](../../models/operations/StartTaskResponse.md)**

### Errors

| Error Type                          | Status Code                         | Content Type                        |
| ----------------------------------- | ----------------------------------- | ----------------------------------- |
| models/errors/StartTaskBadRequest   | 400                                 | application/json                    |
| models/errors/StartTaskUnauthorized | 401                                 | application/json                    |
| models/errors/SDKError              | 4XX, 5XX                            | \*/\*                               |

## stopTask

This endpoint will stop a currently running task by name, or remove it from the list of scheduled tasks if it exists. See the section above for a list of task names for this endpoint.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.StopTaskBadRequest;
import dev.plexapi.sdk.models.errors.StopTaskUnauthorized;
import dev.plexapi.sdk.models.operations.PathParamTaskName;
import dev.plexapi.sdk.models.operations.StopTaskResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws StopTaskBadRequest, StopTaskUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .clientVersion("2.4.1")
                .platform("Roku")
                .deviceNickname("Roku 3")
            .build();

        StopTaskResponse res = sdk.butler().stopTask()
                .taskName(PathParamTaskName.BACKUP_DATABASE)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `taskName`                                                        | [PathParamTaskName](../../models/operations/PathParamTaskName.md) | :heavy_check_mark:                                                | The name of the task to be started.                               |

### Response

**[StopTaskResponse](../../models/operations/StopTaskResponse.md)**

### Errors

| Error Type                         | Status Code                        | Content Type                       |
| ---------------------------------- | ---------------------------------- | ---------------------------------- |
| models/errors/StopTaskBadRequest   | 400                                | application/json                   |
| models/errors/StopTaskUnauthorized | 401                                | application/json                   |
| models/errors/SDKError             | 4XX, 5XX                           | \*/\*                              |