# Authentication
(*authentication()*)

## Overview

API Calls regarding authentication for Plex Media Server


### Available Operations

* [getTransientToken](#gettransienttoken) - Get a Transient Token.
* [getSourceConnectionInformation](#getsourceconnectioninformation) - Get Source Connection Information

## getTransientToken

This endpoint provides the caller with a temporary token with the same access level as the caller's token. These tokens are valid for up to 48 hours and are destroyed if the server instance is restarted.


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

            GetTransientTokenResponse res = sdk.authentication().getTransientToken()
                .type(GetTransientTokenQueryParamType.DELEGATION)
                .scope(Scope.ALL)
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.GetTransientTokenResponseBody e) {
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

| Parameter                                                                                                                                 | Type                                                                                                                                      | Required                                                                                                                                  | Description                                                                                                                               |
| ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------- |
| `type`                                                                                                                                    | [lukehagar.plexapi.plexapi.models.operations.GetTransientTokenQueryParamType](../../models/operations/GetTransientTokenQueryParamType.md) | :heavy_check_mark:                                                                                                                        | `delegation` - This is the only supported `type` parameter.                                                                               |
| `scope`                                                                                                                                   | [lukehagar.plexapi.plexapi.models.operations.Scope](../../models/operations/Scope.md)                                                     | :heavy_check_mark:                                                                                                                        | `all` - This is the only supported `scope` parameter.                                                                                     |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetTransientTokenResponse](../../models/operations/GetTransientTokenResponse.md)**
### Errors

| Error Object                                | Status Code                                 | Content Type                                |
| ------------------------------------------- | ------------------------------------------- | ------------------------------------------- |
| models/errors/GetTransientTokenResponseBody | 401                                         | application/json                            |
| models/errors/SDKError                      | 4xx-5xx                                     | \*\/*                                       |

## getSourceConnectionInformation

If a caller requires connection details and a transient token for a source that is known to the server, for example a cloud media provider or shared PMS, then this endpoint can be called. This endpoint is only accessible with either an admin token or a valid transient token generated from an admin token.
Note: requires Plex Media Server >= 1.15.4.


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

            GetSourceConnectionInformationResponse res = sdk.authentication().getSourceConnectionInformation()
                .source("server://client-identifier")
                .call();

            // handle response
        } catch (lukehagar.plexapi.plexapi.models.errors.GetSourceConnectionInformationResponseBody e) {
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

| Parameter                                      | Type                                           | Required                                       | Description                                    | Example                                        |
| ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- | ---------------------------------------------- |
| `source`                                       | *String*                                       | :heavy_check_mark:                             | The source identifier with an included prefix. | server://client-identifier                     |


### Response

**[lukehagar.plexapi.plexapi.models.operations.GetSourceConnectionInformationResponse](../../models/operations/GetSourceConnectionInformationResponse.md)**
### Errors

| Error Object                                             | Status Code                                              | Content Type                                             |
| -------------------------------------------------------- | -------------------------------------------------------- | -------------------------------------------------------- |
| models/errors/GetSourceConnectionInformationResponseBody | 401                                                      | application/json                                         |
| models/errors/SDKError                                   | 4xx-5xx                                                  | \*\/*                                                    |
