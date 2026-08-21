# Users

## Overview

Plex Users operations

### Available Operations

* [getLegacyResources](#getlegacyresources) - Get Legacy Resources
* [getLegacyUsers](#getlegacyusers) - Get Legacy Users
* [getFriends](#getfriends) - Get Friends
* [getHome](#gethome) - Get home hubs
* [getHomeUsers](#gethomeusers) - Get home hubs Users
* [createHomeUser](#createhomeuser) - Create Home User
* [getMyPlexAccount](#getmyplexaccount) - Get MyPlex Account
* [getUserServer](#getuserserver) - Get User Server Association
* [getServerUserFeatures](#getserveruserfeatures) - Get Server User Features
* [shareServer](#shareserver) - Share Server
* [updateViewStateSync](#updateviewstatesync) - Update View State Sync
* [getUsers](#getusers) - Get list of all connected users
* [getAccountXML](#getaccountxml) - Get Account (XML)
* [getAccountJSON](#getaccountjson) - Get Account (JSON)
* [acceptInvite](#acceptinvite) - Accept an Invite
* [deleteHomeUser](#deletehomeuser) - Delete Home User
* [updateHomeUser](#updatehomeuser) - Update Home User
* [updateRestrictedUser](#updaterestricteduser) - Update Restricted User
* [getServerDetails](#getserverdetails) - Get Server Details
* [shareServerLegacy](#shareserverlegacy) - Share Server (Legacy v1)
* [removeShare](#removeshare) - Remove Share
* [updateShare](#updateshare) - Update Share
* [getUserOptOuts](#getuseroptouts) - Get User Opt-Outs

## getLegacyResources

Get legacy published server connections (XML).

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegacyResources" method="get" path="/api/resources" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetLegacyResourcesResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetLegacyResourcesResponse res = sdk.users().getLegacyResources()
                .call();

        if (res.body().isPresent()) {
            System.out.println(res.body().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetLegacyResourcesResponse](../../models/operations/GetLegacyResourcesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getLegacyUsers

Get legacy friends list (XML).

### Example Usage

<!-- UsageSnippet language="java" operationID="getLegacyUsers" method="get" path="/api/users/" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetLegacyUsersResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetLegacyUsersResponse res = sdk.users().getLegacyUsers()
                .call();

        if (res.body().isPresent()) {
            System.out.println(res.body().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetLegacyUsersResponse](../../models/operations/GetLegacyUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getFriends

Get the list of friends and shared users.

### Example Usage

<!-- UsageSnippet language="java" operationID="getFriends" method="get" path="/friends" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetFriendsRequest;
import dev.plexapi.sdk.models.operations.GetFriendsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetFriendsRequest req = GetFriendsRequest.builder()
                .build();

        GetFriendsResponse res = sdk.users().getFriends()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                         | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `request`                                                         | [GetFriendsRequest](../../models/operations/GetFriendsRequest.md) | :heavy_check_mark:                                                | The request object to use for the request.                        |
| `serverURL`                                                       | *String*                                                          | :heavy_minus_sign:                                                | An optional server URL to use.                                    |

### Response

**[GetFriendsResponse](../../models/operations/GetFriendsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHome

Get Plex Home user list.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHome" method="get" path="/home" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetHomeResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetHomeResponse res = sdk.users().getHome()
                .call();

        if (res.mediaContainerWithHubs().isPresent()) {
            System.out.println(res.mediaContainerWithHubs().get());
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetHomeResponse](../../models/operations/GetHomeResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getHomeUsers

Get the list of Plex Home users.

### Example Usage

<!-- UsageSnippet language="java" operationID="getHomeUsers" method="get" path="/home/users" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetHomeUsersRequest;
import dev.plexapi.sdk.models.operations.GetHomeUsersResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetHomeUsersRequest req = GetHomeUsersRequest.builder()
                .build();

        GetHomeUsersResponse res = sdk.users().getHomeUsers()
                .request(req)
                .call();

        if (res.mediaContainerWithDirectory().isPresent()) {
            System.out.println(res.mediaContainerWithDirectory().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [GetHomeUsersRequest](../../models/operations/GetHomeUsersRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[GetHomeUsersResponse](../../models/operations/GetHomeUsersResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## createHomeUser

Create a new Plex Home user.

### Example Usage

<!-- UsageSnippet language="java" operationID="createHomeUser" method="post" path="/home/users" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.CreateHomeUserRequest;
import dev.plexapi.sdk.models.operations.CreateHomeUserResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        CreateHomeUserRequest req = CreateHomeUserRequest.builder()
                .build();

        CreateHomeUserResponse res = sdk.users().createHomeUser()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [CreateHomeUserRequest](../../models/operations/CreateHomeUserRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[CreateHomeUserResponse](../../models/operations/CreateHomeUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getMyPlexAccount

Get linked MyPlex account info on PMS.

### Example Usage

<!-- UsageSnippet language="java" operationID="getMyPlexAccount" method="get" path="/myplex/account" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetMyPlexAccountResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
            .build();

        GetMyPlexAccountResponse res = sdk.users().getMyPlexAccount()
                .call();

        if (res.userPlexAccount().isPresent()) {
            System.out.println(res.userPlexAccount().get());
        }
    }
}
```

### Response

**[GetMyPlexAccountResponse](../../models/operations/GetMyPlexAccountResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUserServer

Get server association information for the logged-in user.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUserServer" method="get" path="/server" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetUserServerRequest;
import dev.plexapi.sdk.models.operations.GetUserServerResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetUserServerRequest req = GetUserServerRequest.builder()
                .build();

        GetUserServerResponse res = sdk.users().getUserServer()
                .request(req)
                .call();

        if (res.connectionInfo().isPresent()) {
            System.out.println(res.connectionInfo().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetUserServerRequest](../../models/operations/GetUserServerRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *String*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |

### Response

**[GetUserServerResponse](../../models/operations/GetUserServerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getServerUserFeatures

Get features enabled per shared user for the server.

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerUserFeatures" method="get" path="/server/users/features" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetServerUserFeaturesRequest;
import dev.plexapi.sdk.models.operations.GetServerUserFeaturesResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetServerUserFeaturesRequest req = GetServerUserFeaturesRequest.builder()
                .build();

        GetServerUserFeaturesResponse res = sdk.users().getServerUserFeatures()
                .request(req)
                .call();

        if (res.serverUserFeaturesResponse().isPresent()) {
            System.out.println(res.serverUserFeaturesResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                               | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `request`                                                                               | [GetServerUserFeaturesRequest](../../models/operations/GetServerUserFeaturesRequest.md) | :heavy_check_mark:                                                                      | The request object to use for the request.                                              |
| `serverURL`                                                                             | *String*                                                                                | :heavy_minus_sign:                                                                      | An optional server URL to use.                                                          |

### Response

**[GetServerUserFeaturesResponse](../../models/operations/GetServerUserFeaturesResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## shareServer

Share a server with a friend or managed user.

### Example Usage

<!-- UsageSnippet language="java" operationID="shareServer" method="post" path="/shared_servers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.ShareServerRequest;
import dev.plexapi.sdk.models.operations.ShareServerResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        ShareServerRequest req = ShareServerRequest.builder()
                .build();

        ShareServerResponse res = sdk.users().shareServer()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [ShareServerRequest](../../models/operations/ShareServerRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *String*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[ShareServerResponse](../../models/operations/ShareServerResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateViewStateSync

Enable or disable watch-state sync consent for the logged-in user.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateViewStateSync" method="put" path="/user/view_state_sync" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.UpdateViewStateSyncRequest;
import dev.plexapi.sdk.models.operations.UpdateViewStateSyncResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        UpdateViewStateSyncRequest req = UpdateViewStateSyncRequest.builder()
                .build();

        UpdateViewStateSyncResponse res = sdk.users().updateViewStateSync()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [UpdateViewStateSyncRequest](../../models/operations/UpdateViewStateSyncRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `serverURL`                                                                         | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[UpdateViewStateSyncResponse](../../models/operations/UpdateViewStateSyncResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUsers

Get list of all users that are friends and have library access with the provided Plex authentication token

### Example Usage

<!-- UsageSnippet language="java" operationID="getUsers" method="get" path="/users" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.BadRequest;
import dev.plexapi.sdk.models.errors.Unauthorized;
import dev.plexapi.sdk.models.operations.GetUsersRequest;
import dev.plexapi.sdk.models.operations.GetUsersResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws BadRequest, Unauthorized, Exception {

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

        GetUsersRequest req = GetUsersRequest.builder()
                .build();

        GetUsersResponse res = sdk.users().getUsers()
                .request(req)
                .call();

        if (res.object().isPresent()) {
            System.out.println(res.object().get());
        }
    }
}
```

### Parameters

| Parameter                                                     | Type                                                          | Required                                                      | Description                                                   |
| ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------------------- |
| `request`                                                     | [GetUsersRequest](../../models/operations/GetUsersRequest.md) | :heavy_check_mark:                                            | The request object to use for the request.                    |
| `serverURL`                                                   | *String*                                                      | :heavy_minus_sign:                                            | An optional server URL to use.                                |

### Response

**[GetUsersResponse](../../models/operations/GetUsersResponse.md)**

### Errors

| Error Type                 | Status Code                | Content Type               |
| -------------------------- | -------------------------- | -------------------------- |
| models/errors/BadRequest   | 400                        | application/json           |
| models/errors/Unauthorized | 401                        | application/json           |
| models/errors/SDKError     | 4XX, 5XX                   | \*/\*                      |

## getAccountXML

Get the logged-in user's account details in XML format (legacy v1 endpoint).

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountXML" method="get" path="/users/account" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetAccountXMLRequest;
import dev.plexapi.sdk.models.operations.GetAccountXMLResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetAccountXMLRequest req = GetAccountXMLRequest.builder()
                .build();

        GetAccountXMLResponse res = sdk.users().getAccountXML()
                .request(req)
                .call();

        if (res.body().isPresent()) {
            System.out.println(res.body().get());
        }
    }
}
```

### Parameters

| Parameter                                                               | Type                                                                    | Required                                                                | Description                                                             |
| ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- | ----------------------------------------------------------------------- |
| `request`                                                               | [GetAccountXMLRequest](../../models/operations/GetAccountXMLRequest.md) | :heavy_check_mark:                                                      | The request object to use for the request.                              |
| `serverURL`                                                             | *String*                                                                | :heavy_minus_sign:                                                      | An optional server URL to use.                                          |

### Response

**[GetAccountXMLResponse](../../models/operations/GetAccountXMLResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getAccountJSON

Get the logged-in user's account details in JSON format (legacy v1 endpoint).

### Example Usage

<!-- UsageSnippet language="java" operationID="getAccountJSON" method="get" path="/users/account.json" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetAccountJSONRequest;
import dev.plexapi.sdk.models.operations.GetAccountJSONResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetAccountJSONRequest req = GetAccountJSONRequest.builder()
                .build();

        GetAccountJSONResponse res = sdk.users().getAccountJSON()
                .request(req)
                .call();

        if (res.userPlexAccount().isPresent()) {
            System.out.println(res.userPlexAccount().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetAccountJSONRequest](../../models/operations/GetAccountJSONRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[GetAccountJSONResponse](../../models/operations/GetAccountJSONResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## acceptInvite

Accept a pending Plex friend, home, or server invitation.

### Example Usage

<!-- UsageSnippet language="java" operationID="acceptInvite" method="put" path="/api/invites/requests/{inviteId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.AcceptInviteRequest;
import dev.plexapi.sdk.models.operations.AcceptInviteResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import dev.plexapi.sdk.models.shared.BoolInt;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        AcceptInviteRequest req = AcceptInviteRequest.builder()
                .inviteId(530502L)
                .friend(BoolInt.True)
                .home(BoolInt.True)
                .server(BoolInt.True)
                .build();

        AcceptInviteResponse res = sdk.users().acceptInvite()
                .request(req)
                .call();

        if (res.body().isPresent()) {
            System.out.println(res.body().get());
        }
    }
}
```

### Parameters

| Parameter                                                             | Type                                                                  | Required                                                              | Description                                                           |
| --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- | --------------------------------------------------------------------- |
| `request`                                                             | [AcceptInviteRequest](../../models/operations/AcceptInviteRequest.md) | :heavy_check_mark:                                                    | The request object to use for the request.                            |
| `serverURL`                                                           | *String*                                                              | :heavy_minus_sign:                                                    | An optional server URL to use.                                        |

### Response

**[AcceptInviteResponse](../../models/operations/AcceptInviteResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## deleteHomeUser

Remove a Plex Home user.

### Example Usage

<!-- UsageSnippet language="java" operationID="deleteHomeUser" method="delete" path="/home/users/{userId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.DeleteHomeUserRequest;
import dev.plexapi.sdk.models.operations.DeleteHomeUserResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        DeleteHomeUserRequest req = DeleteHomeUserRequest.builder()
                .userId(768153L)
                .build();

        DeleteHomeUserResponse res = sdk.users().deleteHomeUser()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [DeleteHomeUserRequest](../../models/operations/DeleteHomeUserRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[DeleteHomeUserResponse](../../models/operations/DeleteHomeUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateHomeUser

Update a Plex Home user.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateHomeUser" method="put" path="/home/users/{userId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.UpdateHomeUserRequest;
import dev.plexapi.sdk.models.operations.UpdateHomeUserResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        UpdateHomeUserRequest req = UpdateHomeUserRequest.builder()
                .userId(187897L)
                .build();

        UpdateHomeUserResponse res = sdk.users().updateHomeUser()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [UpdateHomeUserRequest](../../models/operations/UpdateHomeUserRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[UpdateHomeUserResponse](../../models/operations/UpdateHomeUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateRestrictedUser

Update restricted (managed) home user settings.

### Example Usage

<!-- UsageSnippet language="java" operationID="updateRestrictedUser" method="put" path="/home/users/restricted/{userId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.UpdateRestrictedUserRequest;
import dev.plexapi.sdk.models.operations.UpdateRestrictedUserResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        UpdateRestrictedUserRequest req = UpdateRestrictedUserRequest.builder()
                .userId(130660L)
                .build();

        UpdateRestrictedUserResponse res = sdk.users().updateRestrictedUser()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                             | Type                                                                                  | Required                                                                              | Description                                                                           |
| ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------- |
| `request`                                                                             | [UpdateRestrictedUserRequest](../../models/operations/UpdateRestrictedUserRequest.md) | :heavy_check_mark:                                                                    | The request object to use for the request.                                            |
| `serverURL`                                                                           | *String*                                                                              | :heavy_minus_sign:                                                                    | An optional server URL to use.                                                        |

### Response

**[UpdateRestrictedUserResponse](../../models/operations/UpdateRestrictedUserResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getServerDetails

Get server details for sharing.

### Example Usage

<!-- UsageSnippet language="java" operationID="getServerDetails" method="get" path="/servers/{machineId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetServerDetailsRequest;
import dev.plexapi.sdk.models.operations.GetServerDetailsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetServerDetailsRequest req = GetServerDetailsRequest.builder()
                .machineId("<id>")
                .build();

        GetServerDetailsResponse res = sdk.users().getServerDetails()
                .request(req)
                .call();

        if (res.serverConfiguration().isPresent()) {
            System.out.println(res.serverConfiguration().get());
        }
    }
}
```

### Parameters

| Parameter                                                                     | Type                                                                          | Required                                                                      | Description                                                                   |
| ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- | ----------------------------------------------------------------------------- |
| `request`                                                                     | [GetServerDetailsRequest](../../models/operations/GetServerDetailsRequest.md) | :heavy_check_mark:                                                            | The request object to use for the request.                                    |
| `serverURL`                                                                   | *String*                                                                      | :heavy_minus_sign:                                                            | An optional server URL to use.                                                |

### Response

**[GetServerDetailsResponse](../../models/operations/GetServerDetailsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## shareServerLegacy

Share a library with a friend (legacy v1 XML endpoint).

### Example Usage

<!-- UsageSnippet language="java" operationID="shareServerLegacy" method="post" path="/servers/{machineId}/shared_servers" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.ShareServerLegacyRequest;
import dev.plexapi.sdk.models.operations.ShareServerLegacyResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        ShareServerLegacyRequest req = ShareServerLegacyRequest.builder()
                .machineId("<id>")
                .build();

        ShareServerLegacyResponse res = sdk.users().shareServerLegacy()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                       | Type                                                                            | Required                                                                        | Description                                                                     |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `request`                                                                       | [ShareServerLegacyRequest](../../models/operations/ShareServerLegacyRequest.md) | :heavy_check_mark:                                                              | The request object to use for the request.                                      |
| `serverURL`                                                                     | *String*                                                                        | :heavy_minus_sign:                                                              | An optional server URL to use.                                                  |

### Response

**[ShareServerLegacyResponse](../../models/operations/ShareServerLegacyResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## removeShare

Remove a share / friend.

### Example Usage

<!-- UsageSnippet language="java" operationID="removeShare" method="delete" path="/sharings/{userId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.RemoveShareRequest;
import dev.plexapi.sdk.models.operations.RemoveShareResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        RemoveShareRequest req = RemoveShareRequest.builder()
                .userId(858924L)
                .build();

        RemoveShareResponse res = sdk.users().removeShare()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [RemoveShareRequest](../../models/operations/RemoveShareRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *String*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[RemoveShareResponse](../../models/operations/RemoveShareResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## updateShare

Update friend filters (allowSync, filterMovies, etc.).

### Example Usage

<!-- UsageSnippet language="java" operationID="updateShare" method="put" path="/sharings/{userId}" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.UpdateShareRequest;
import dev.plexapi.sdk.models.operations.UpdateShareResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        UpdateShareRequest req = UpdateShareRequest.builder()
                .userId(139113L)
                .build();

        UpdateShareResponse res = sdk.users().updateShare()
                .request(req)
                .call();

        if (res.successResponse().isPresent()) {
            System.out.println(res.successResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                           | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `request`                                                           | [UpdateShareRequest](../../models/operations/UpdateShareRequest.md) | :heavy_check_mark:                                                  | The request object to use for the request.                          |
| `serverURL`                                                         | *String*                                                            | :heavy_minus_sign:                                                  | An optional server URL to use.                                      |

### Response

**[UpdateShareResponse](../../models/operations/UpdateShareResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |

## getUserOptOuts

Get online media source opt-out settings for a user.

### Example Usage

<!-- UsageSnippet language="java" operationID="getUserOptOuts" method="get" path="/user/{uuid}/settings/opt_outs" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.Error;
import dev.plexapi.sdk.models.operations.GetUserOptOutsRequest;
import dev.plexapi.sdk.models.operations.GetUserOptOutsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Error, Exception {

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

        GetUserOptOutsRequest req = GetUserOptOutsRequest.builder()
                .uuid("17dd8bb4-eb45-4878-97c7-017f7d9a2384")
                .build();

        GetUserOptOutsResponse res = sdk.users().getUserOptOuts()
                .request(req)
                .call();

        if (res.userOptOutsResponse().isPresent()) {
            System.out.println(res.userOptOutsResponse().get());
        }
    }
}
```

### Parameters

| Parameter                                                                 | Type                                                                      | Required                                                                  | Description                                                               |
| ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- | ------------------------------------------------------------------------- |
| `request`                                                                 | [GetUserOptOutsRequest](../../models/operations/GetUserOptOutsRequest.md) | :heavy_check_mark:                                                        | The request object to use for the request.                                |
| `serverURL`                                                               | *String*                                                                  | :heavy_minus_sign:                                                        | An optional server URL to use.                                            |

### Response

**[GetUserOptOutsResponse](../../models/operations/GetUserOptOutsResponse.md)**

### Errors

| Error Type             | Status Code            | Content Type           |
| ---------------------- | ---------------------- | ---------------------- |
| models/errors/Error    | 401                    | application/json       |
| models/errors/SDKError | 4XX, 5XX               | \*/\*                  |