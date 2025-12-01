# Authentication
(*authentication()*)

## Overview

### Available Operations

* [getTokenDetails](#gettokendetails) - Get Token Details
* [postUsersSignInData](#postuserssignindata) - Get User Sign In Data

## getTokenDetails

Get the User data from the provided X-Plex-Token

### Example Usage

<!-- UsageSnippet language="java" operationID="getTokenDetails" method="get" path="/user" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTokenDetailsBadRequest;
import dev.plexapi.sdk.models.errors.GetTokenDetailsUnauthorized;
import dev.plexapi.sdk.models.operations.GetTokenDetailsRequest;
import dev.plexapi.sdk.models.operations.GetTokenDetailsResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTokenDetailsBadRequest, GetTokenDetailsUnauthorized, Exception {

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

        GetTokenDetailsRequest req = GetTokenDetailsRequest.builder()
                .build();

        GetTokenDetailsResponse res = sdk.authentication().getTokenDetails()
                .request(req)
                .call();

        if (res.userPlexAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                   | Type                                                                        | Required                                                                    | Description                                                                 |
| --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| `request`                                                                   | [GetTokenDetailsRequest](../../models/operations/GetTokenDetailsRequest.md) | :heavy_check_mark:                                                          | The request object to use for the request.                                  |
| `serverURL`                                                                 | *String*                                                                    | :heavy_minus_sign:                                                          | An optional server URL to use.                                              |

### Response

**[GetTokenDetailsResponse](../../models/operations/GetTokenDetailsResponse.md)**

### Errors

| Error Type                                | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetTokenDetailsBadRequest   | 400                                       | application/json                          |
| models/errors/GetTokenDetailsUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4XX, 5XX                                  | \*/\*                                     |

## postUsersSignInData

Sign in user with username and password and return user data with Plex authentication token

### Example Usage

<!-- UsageSnippet language="java" operationID="post-users-sign-in-data" method="post" path="/users/signin" -->
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.PostUsersSignInDataBadRequest;
import dev.plexapi.sdk.models.errors.PostUsersSignInDataUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PostUsersSignInDataBadRequest, PostUsersSignInDataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accepts(Accepts.APPLICATION_XML)
                .clientIdentifier("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .product("Plex for Roku")
                .version("2.4.1")
                .platform("Roku")
                .platformVersion("4.3 build 1057")
                .device("Roku 3")
                .model("4200X")
                .deviceVendor("Roku")
                .deviceName("Living Room TV")
                .marketplace("googlePlay")
            .build();

        PostUsersSignInDataRequest req = PostUsersSignInDataRequest.builder()
                .requestBody(PostUsersSignInDataRequestBody.builder()
                    .login("username@email.com")
                    .password("password123")
                    .verificationCode("123456")
                    .build())
                .build();

        PostUsersSignInDataResponse res = sdk.authentication().postUsersSignInData()
                .request(req)
                .call();

        if (res.userPlexAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                                                                           | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `request`                                                                           | [PostUsersSignInDataRequest](../../models/operations/PostUsersSignInDataRequest.md) | :heavy_check_mark:                                                                  | The request object to use for the request.                                          |
| `serverURL`                                                                         | *String*                                                                            | :heavy_minus_sign:                                                                  | An optional server URL to use.                                                      |

### Response

**[PostUsersSignInDataResponse](../../models/operations/PostUsersSignInDataResponse.md)**

### Errors

| Error Type                                    | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/PostUsersSignInDataBadRequest   | 400                                           | application/json                              |
| models/errors/PostUsersSignInDataUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4XX, 5XX                                      | \*/\*                                         |