# Subscriptions
(*subscriptions()*)

## Overview

Subscriptions determine which media will be recorded and the criteria for selecting an airing when multiple are available


### Available Operations

* [getAllSubscriptions](#getallsubscriptions) - Get all subscriptions
* [createSubscription](#createsubscription) - Create a subscription
* [processSubscriptions](#processsubscriptions) - Process all subscriptions
* [getScheduledRecordings](#getscheduledrecordings) - Get all scheduled recordings
* [getTemplate](#gettemplate) - Get the subscription template
* [cancelGrab](#cancelgrab) - Cancel an existing grab
* [deleteSubscription](#deletesubscription) - Delete a subscription
* [getSubscription](#getsubscription) - Get a single subscription
* [editSubscriptionPreferences](#editsubscriptionpreferences) - Edit a subscription
* [reorderSubscription](#reordersubscription) - Re-order a subscription

## getAllSubscriptions

Get all subscriptions and potentially the grabs too

### Example Usage

<!-- UsageSnippet language="java" operationID="getAllSubscriptions" method="get" path="/media/subscriptions" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetAllSubscriptionsRequest;
import dev.plexapi.sdk.models.operations.GetAllSubscriptionsResponse;
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

        GetAllSubscriptionsRequest req = GetAllSubscriptionsRequest.builder()
                .includeGrabs(BoolInt.True)
                .includeStorage(BoolInt.True)
                .build();

        GetAllSubscriptionsResponse res = sdk.subscriptions().getAllSubscriptions()
                .request(req)
                .call();

        if (res.mediaContainerWithSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [GetAllSubscriptionsRequest](../../models/operations/GetAllSubscriptionsRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[GetAllSubscriptionsResponse](../../models/operations/GetAllSubscriptionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createSubscription

Create a subscription. The query parameters should be mostly derived from the [template](#tag/Subscriptions/operation/mediaSubscriptionsGetTemplate)

### Example Usage

<!-- UsageSnippet language="java" operationID="createSubscription" method="post" path="/media/subscriptions" -->
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

        CreateSubscriptionRequest req = CreateSubscriptionRequest.builder()
                .targetLibrarySectionID(1L)
                .targetSectionLocationID(3L)
                .type(2L)
                .hints(Hints.builder()
                    .build())
                .prefs(CreateSubscriptionQueryParamPrefs.builder()
                    .build())
                .params(Params.builder()
                    .build())
                .build();

        CreateSubscriptionResponse res = sdk.subscriptions().createSubscription()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [CreateSubscriptionRequest](../../models/operations/CreateSubscriptionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[CreateSubscriptionResponse](../../models/operations/CreateSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## processSubscriptions

Process all subscriptions asynchronously

### Example Usage

<!-- UsageSnippet language="java" operationID="processSubscriptions" method="post" path="/media/subscriptions/process" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ProcessSubscriptionsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        ProcessSubscriptionsResponse res = sdk.subscriptions().processSubscriptions()
                .call();

        // handle response
    }
}
```

### Response

**[ProcessSubscriptionsResponse](../../models/operations/ProcessSubscriptionsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getScheduledRecordings

Get all scheduled recordings across all subscriptions

### Example Usage

<!-- UsageSnippet language="java" operationID="getScheduledRecordings" method="get" path="/media/subscriptions/scheduled" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetScheduledRecordingsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetScheduledRecordingsResponse res = sdk.subscriptions().getScheduledRecordings()
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Response

**[GetScheduledRecordingsResponse](../../models/operations/GetScheduledRecordingsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getTemplate

Get the templates for a piece of media which could include fetching one airing, season, the whole show, etc.

### Example Usage

<!-- UsageSnippet language="java" operationID="getTemplate" method="get" path="/media/subscriptions/template" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetTemplateRequest;
import dev.plexapi.sdk.models.operations.GetTemplateResponse;
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

        GetTemplateRequest req = GetTemplateRequest.builder()
                .guid("plex://episode/5fc70265c40548002d539d23")
                .build();

        GetTemplateResponse res = sdk.subscriptions().getTemplate()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [GetTemplateRequest](../../models/operations/GetTemplateRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |

### Response

**[GetTemplateResponse](../../models/operations/GetTemplateResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## cancelGrab

Cancels an existing media grab (recording). It can be used to resolve a conflict which exists for a rolling subscription.
Note: This cancellation does not persist across a server restart, but neither does a rolling subscription itself.

### Example Usage

<!-- UsageSnippet language="java" operationID="cancelGrab" method="delete" path="/media/grabbers/operations/{operationId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.CancelGrabRequest;
import dev.plexapi.sdk.models.operations.CancelGrabResponse;
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

        CancelGrabRequest req = CancelGrabRequest.builder()
                .operationId("<id>")
                .build();

        CancelGrabResponse res = sdk.subscriptions().cancelGrab()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [CancelGrabRequest](../../models/operations/CancelGrabRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |

### Response

**[CancelGrabResponse](../../models/operations/CancelGrabResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteSubscription

Delete a subscription, cancelling all of its grabs as well

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteSubscription" method="delete" path="/media/subscriptions/{subscriptionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.DeleteSubscriptionRequest;
import dev.plexapi.sdk.models.operations.DeleteSubscriptionResponse;
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

        DeleteSubscriptionRequest req = DeleteSubscriptionRequest.builder()
                .subscriptionId(974618L)
                .build();

        DeleteSubscriptionResponse res = sdk.subscriptions().deleteSubscription()
                .request(req)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                         | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `request`                                                                         | [DeleteSubscriptionRequest](../../models/operations/DeleteSubscriptionRequest.md) | :heavy_check_mark:                                                                | The request object to use for the request.                                        |

### Response

**[DeleteSubscriptionResponse](../../models/operations/DeleteSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getSubscription

Get a single subscription and potentially the grabs too

### Example Usage

<!-- UsageSnippet language="java" operationID="getSubscription" method="get" path="/media/subscriptions/{subscriptionId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetSubscriptionRequest;
import dev.plexapi.sdk.models.operations.GetSubscriptionResponse;
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

        GetSubscriptionRequest req = GetSubscriptionRequest.builder()
                .subscriptionId(186713L)
                .includeGrabs(BoolInt.True)
                .includeStorage(BoolInt.True)
                .build();

        GetSubscriptionResponse res = sdk.subscriptions().getSubscription()
                .request(req)
                .call();

        if (res.mediaContainerWithSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetSubscriptionRequest](../../models/operations/GetSubscriptionRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |

### Response

**[GetSubscriptionResponse](../../models/operations/GetSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## editSubscriptionPreferences

Edit a subscription's preferences

### Example Usage

<!-- UsageSnippet language="java" operationID="editSubscriptionPreferences" method="put" path="/media/subscriptions/{subscriptionId}" -->
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

        EditSubscriptionPreferencesRequest req = EditSubscriptionPreferencesRequest.builder()
                .subscriptionId(673918L)
                .prefs(EditSubscriptionPreferencesQueryParamPrefs.builder()
                    .build())
                .build();

        EditSubscriptionPreferencesResponse res = sdk.subscriptions().editSubscriptionPreferences()
                .request(req)
                .call();

        if (res.mediaContainerWithSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                                           | Type                                                                                                | Required                                                                                            | Description                                                                                         |
| --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------- |
| `request`                                                                                           | [EditSubscriptionPreferencesRequest](../../models/operations/EditSubscriptionPreferencesRequest.md) | :heavy_check_mark:                                                                                  | The request object to use for the request.                                                          |

### Response

**[EditSubscriptionPreferencesResponse](../../models/operations/EditSubscriptionPreferencesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## reorderSubscription

Re-order a subscription to change its priority

### Example Usage

<!-- UsageSnippet language="java" operationID="reorderSubscription" method="put" path="/media/subscriptions/{subscriptionId}/move" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.ReorderSubscriptionRequest;
import dev.plexapi.sdk.models.operations.ReorderSubscriptionResponse;
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

        ReorderSubscriptionRequest req = ReorderSubscriptionRequest.builder()
                .subscriptionId(440634L)
                .build();

        ReorderSubscriptionResponse res = sdk.subscriptions().reorderSubscription()
                .request(req)
                .call();

        if (res.mediaContainerWithSubscription().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [ReorderSubscriptionRequest](../../models/operations/ReorderSubscriptionRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |

### Response

**[ReorderSubscriptionResponse](../../models/operations/ReorderSubscriptionResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |