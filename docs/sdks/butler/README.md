# Butler
(*butler()*)

## Overview

The butler is responsible for running periodic tasks.  Some tasks run daily, others every few days, and some weekly.  These includes database maintenance, metadata updating, thumbnail generation, media analysis, and other tasks.

### Available Operations

* [stopTasks](#stoptasks) - Stop all Butler tasks
* [getTasks](#gettasks) - Get all Butler tasks
* [startTasks](#starttasks) - Start all Butler tasks
* [stopTask](#stoptask) - Stop a single Butler task
* [startTask](#starttask) - Start a single Butler task

## stopTasks

This endpoint will stop all currently running tasks and remove any scheduled tasks from the queue.

### Example Usage

<!-- UsageSnippet language="java" operationID="stopTasks" method="delete" path="/butler" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StopTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        StopTasksResponse res = sdk.butler().stopTasks()
                .call();

        // handle response
    }
}
```

### Response

**[StopTasksResponse](../../models/operations/StopTasksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTasks

Get the list of butler tasks and their scheduling


### Example Usage

<!-- UsageSnippet language="java" operationID="getTasks" method="get" path="/butler" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetTasksResponse res = sdk.butler().getTasks()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetTasksResponse](../../models/operations/GetTasksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## startTasks

This endpoint will attempt to start all Butler tasks that are enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:

  1. Any tasks not scheduled to run on the current day will be skipped.
  2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
  3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
  4. If we are outside the configured window, the task will start immediately.


### Example Usage

<!-- UsageSnippet language="java" operationID="startTasks" method="post" path="/butler" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.StartTasksResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        StartTasksResponse res = sdk.butler().startTasks()
                .call();

        // handle response
    }
}
```

### Response

**[StartTasksResponse](../../models/operations/StartTasksResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## stopTask

This endpoint will stop a currently running task by name, or remove it from the list of scheduled tasks if it exists


### Example Usage

<!-- UsageSnippet language="java" operationID="stopTask" method="delete" path="/butler/{butlerTask}" -->
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

        StopTaskRequest req = StopTaskRequest.builder()
                .butlerTask(ButlerTask.CLEAN_OLD_BUNDLES)
                .build();

        StopTaskResponse res = sdk.butler().stopTask()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [StopTaskRequest](../../models/operations/StopTaskRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |

### Response

**[StopTaskResponse](../../models/operations/StopTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## startTask

This endpoint will attempt to start a specific Butler task by name.


### Example Usage

<!-- UsageSnippet language="java" operationID="startTask" method="post" path="/butler/{butlerTask}" -->
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

        StartTaskRequest req = StartTaskRequest.builder()
                .butlerTask(PathParamButlerTask.REFRESH_LOCAL_MEDIA)
                .build();

        StartTaskResponse res = sdk.butler().startTask()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                       | Type                                                            | Required                                                        | Description                                                     |
| --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- | --------------------------------------------------------------- |
| `request`                                                       | [StartTaskRequest](../../models/operations/StartTaskRequest.md) | :heavy_check_mark:                                              | The request object to use for the request.                      |

### Response

**[StartTaskResponse](../../models/operations/StartTaskResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |