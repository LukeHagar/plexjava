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
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetTransientTokenQueryParamType;
import dev.plexapi.sdk.models.operations.GetTransientTokenResponse;
import dev.plexapi.sdk.models.operations.Scope;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetTransientTokenResponse res = sdk.authentication().getTransientToken()
                .type(GetTransientTokenQueryParamType.DELEGATION)
                .scope(Scope.ALL)
                .call();

            // handle response
        } catch (dev.plexapi.sdk.models.errors.GetTransientTokenBadRequest e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.GetTransientTokenUnauthorized e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                     | Type                                                                                          | Required                                                                                      | Description                                                                                   |
| --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------- |
| `type`                                                                                        | [GetTransientTokenQueryParamType](../../models/operations/GetTransientTokenQueryParamType.md) | :heavy_check_mark:                                                                            | `delegation` - This is the only supported `type` parameter.                                   |
| `scope`                                                                                       | [Scope](../../models/operations/Scope.md)                                                     | :heavy_check_mark:                                                                            | `all` - This is the only supported `scope` parameter.                                         |

### Response

**[GetTransientTokenResponse](../../models/operations/GetTransientTokenResponse.md)**

### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetTransientTokenBadRequest   | 400                                         | application/json                            |
| models/errors/GetTransientTokenUnauthorized | 401                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |


## getSourceConnectionInformation

If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.
Note: requires Plex Media Server >= 1.15.4.


### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetSourceConnectionInformationResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetSourceConnectionInformationResponse res = sdk.authentication().getSourceConnectionInformation()
                .source("server://client-identifier")
                .call();

            // handle response
        } catch (dev.plexapi.sdk.models.errors.GetSourceConnectionInformationBadRequest e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.GetSourceConnectionInformationUnauthorized e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `source`                                       | *String*                                       | :heavy_check_mark:                             | The source identifier with an included prefix. | server://client-identifier                     |

### Response

**[GetSourceConnectionInformationResponse](../../models/operations/GetSourceConnectionInformationResponse.md)**

### Errors

| Error Object                                             | Status Code                                              | Content Type                                             |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| models/errors/GetSourceConnectionInformationBadRequest   | 400                                                      | application/json                                         |
| models/errors/GetSourceConnectionInformationUnauthorized | 401                                                      | application/json                                         |
| models/errors/SDKError                                   | 4xx-5xx                                                  | \*\/*                                                    |


## getTokenDetails

Get the User data from the provided X-Plex-Token

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.GetTokenDetailsResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            GetTokenDetailsResponse res = sdk.authentication().getTokenDetails()
                .call();

            if (res.userPlexAccount().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.GetTokenDetailsBadRequest e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.GetTokenDetailsUnauthorized e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                      | Type                           | Required                       | Description                    |
| ------------------------------ | ------------------------------ | ------------------------------ | ------------------------------ |
| `serverURL`                    | *String*                       | :heavy_minus_sign:             | An optional server URL to use. |

### Response

**[GetTokenDetailsResponse](../../models/operations/GetTokenDetailsResponse.md)**

### Errors

| Error Object                              | Status Code                               | Content Type                              |
| ----------------------------------------- | ----------------------------------------- | ----------------------------------------- |
| models/errors/GetTokenDetailsBadRequest   | 400                                       | application/json                          |
| models/errors/GetTokenDetailsUnauthorized | 401                                       | application/json                          |
| models/errors/SDKError                    | 4xx-5xx                                   | \*\/*                                     |


## postUsersSignInData

Sign in user with username and password and return user data with Plex authentication token

### Example Usage

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.errors.SDKError;
import dev.plexapi.sdk.models.operations.PostUsersSignInDataRequestBody;
import dev.plexapi.sdk.models.operations.PostUsersSignInDataResponse;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .build();

            PostUsersSignInDataResponse res = sdk.authentication().postUsersSignInData()
                .xPlexClientIdentifier("gcgzw5rz2xovp84b4vha3a40")
                .requestBody(PostUsersSignInDataRequestBody.builder()
                    .login("username@email.com")
                    .password("password123")
                    .verificationCode("123456")
                    .build())
                .call();

            if (res.userPlexAccount().isPresent()) {
                // handle response
            }
        } catch (dev.plexapi.sdk.models.errors.PostUsersSignInDataBadRequest e) {
            // handle exception
            throw e;
        } catch (dev.plexapi.sdk.models.errors.PostUsersSignInDataUnauthorized e) {
            // handle exception
            throw e;
        } catch (SDKError e) {
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

| Parameter                                                                                                                                                             | Type                                                                                                                                                                  | Required                                                                                                                                                              | Description                                                                                                                                                           | Example                                                                                                                                                               |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `xPlexClientIdentifier`                                                                                                                                               | *Optional<String>*                                                                                                                                                    | :heavy_minus_sign:                                                                                                                                                    | The unique identifier for the client application<br/>This is used to track the client application and its usage<br/>(UUID, serial number, or other number unique per device)<br/> | gcgzw5rz2xovp84b4vha3a40                                                                                                                                              |
| `requestBody`                                                                                                                                                         | [Optional<PostUsersSignInDataRequestBody>](../../models/operations/PostUsersSignInDataRequestBody.md)                                                                 | :heavy_minus_sign:                                                                                                                                                    | Login credentials                                                                                                                                                     |                                                                                                                                                                       |
| `serverURL`                                                                                                                                                           | *String*                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                    | An optional server URL to use.                                                                                                                                        | http://localhost:8080                                                                                                                                                 |

### Response

**[PostUsersSignInDataResponse](../../models/operations/PostUsersSignInDataResponse.md)**

### Errors

| Error Object                                  | Status Code                                   | Content Type                                  |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| models/errors/PostUsersSignInDataBadRequest   | 400                                           | application/json                              |
| models/errors/PostUsersSignInDataUnauthorized | 401                                           | application/json                              |
| models/errors/SDKError                        | 4xx-5xx                                       | \*\/*                                         |
