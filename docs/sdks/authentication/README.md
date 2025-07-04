# Authentication
(*authentication()*)

## Overview

API Calls regarding authentication for Plex Media Server


### Available Operations

* [getTransientToken](#gettransienttoken) - Get a Transient Token
* [getSourceConnectionInformation](#getsourceconnectioninformation) - Get Source Connection Information
* [getTokenDetails](#gettokendetails) - Get Token Details
* [postUsersSignInData](#postuserssignindata) - Get User Sign In Data

## getTransientToken

This endpoint provides the caller with a temporary token with the same access level as the caller's token. These tokens are valid for up to 48 hours and are destroyed if the server instance is restarted.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTransientTokenBadRequest;
import dev.plexapi.sdk.models.errors.GetTransientTokenUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTransientTokenBadRequest, GetTransientTokenUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetTransientTokenResponse res = sdk.authentication().getTransientToken()
                .type(GetTransientTokenQueryParamType.DELEGATION)
                .scope(Scope.ALL)
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | [GetTransientTokenQueryParamType](../../models/operations/GetTransientTokenQueryParamType.md) | :heavy_check_mark:                                                                            | `delegation` - This is the only supported `type` parameter.                                   |
| `scope`                                                                                       | [Scope](../../models/operations/Scope.md)                                                     | :heavy_check_mark:                                                                            | `all` - This is the only supported `scope` parameter.                                         |

### Response

**[GetTransientTokenResponse](../../models/operations/GetTransientTokenResponse.md)**

### Errors

| Error Type                                  | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetTransientTokenBadRequest   | 400                                         | application/json                            |
| models/errors/GetTransientTokenUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4XX, 5XX                                    | \*/\*                                       |

## getSourceConnectionInformation

If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.
Note: requires Plex Media Server >= 1.15.4.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetSourceConnectionInformationBadRequest;
import dev.plexapi.sdk.models.errors.GetSourceConnectionInformationUnauthorized;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetSourceConnectionInformationBadRequest, GetSourceConnectionInformationUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetSourceConnectionInformationResponse res = sdk.authentication().getSourceConnectionInformation()
                .source("server://client-identifier")
                .call();

        // handle response
    }
}
```

### Parameters

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `source`                                       | *String*                                       | :heavy_check_mark:                             | The source identifier with an included prefix. | server://client-identifier                     |

### Response

**[GetSourceConnectionInformationResponse](../../models/operations/GetSourceConnectionInformationResponse.md)**

### Errors

| Error Type                                               | Status Code                                              | Content Type                                             |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| models/errors/GetSourceConnectionInformationBadRequest   | 400                                                      | application/json                                         |
| models/errors/GetSourceConnectionInformationUnauthorized | 401                                                      | application/json                                         |
| models/errors/SDKError                                   | 4XX, 5XX                                                 | \*/\*                                                    |

## getTokenDetails

Get the User data from the provided X-Plex-Token

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.GetTokenDetailsBadRequest;
import dev.plexapi.sdk.models.errors.GetTokenDetailsUnauthorized;
import dev.plexapi.sdk.models.operations.GetTokenDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws GetTokenDetailsBadRequest, GetTokenDetailsUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
            .build();

        GetTokenDetailsResponse res = sdk.authentication().getTokenDetails()
                .call();

        if (res.userPlexAccount().isPresent()) {
            // handle response
        }
    }
}
```

### Parameters

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

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

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.PostUsersSignInDataBadRequest;
import dev.plexapi.sdk.models.errors.PostUsersSignInDataUnauthorized;
import dev.plexapi.sdk.models.operations.*;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws PostUsersSignInDataBadRequest, PostUsersSignInDataUnauthorized, Exception {

        PlexAPI sdk = PlexAPI.builder()
            .build();

        PostUsersSignInDataRequest req = PostUsersSignInDataRequest.builder()
                .clientID("3381b62b-9ab7-4e37-827b-203e9809eb58")
                .clientName("Plex for Roku")
                .deviceNickname("Roku 3")
                .clientVersion("2.4.1")
                .platform("Roku")
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