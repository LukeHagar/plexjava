
# PlexSDK Java SDK 0.0.1

A Java SDK for PlexSDK.

An Open API Spec for interacting with Plex.tv and Plex Servers

- API version: 0.0.1
- SDK version: 0.0.1

## Table of Contents

- [PlexSDK Java SDK 0.0.1](#plexsdk-java-sdk-001)
  - [Table of Contents](#table-of-contents)
  - [Requirements](#requirements)
  - [Installation](#installation)
  - [Authentication](#authentication)
    - [API Key](#api-key)
  - [API Endpoint Services](#api-endpoint-services)
  - [API Models](#api-models)
  - [Testing](#testing)
  - [Configuration](#configuration)
  - [Sample Usage](#sample-usage)
  - [License](#license)

## Requirements

- Java 8
- Maven

## Installation

If you use Maven, place the following within the `<dependencies>` tag in your pom.xml file:

```XML
<dependency>
  <groupId>47.one0</groupId>
  <artifactId>plex-sdk</artifactId>
  <version>0.0.1</version>
</dependency>
```

If you use Gradle, paste the next line inside the dependencies block of your build.gradle file:

```Gradle
implementation group: "47.one0", name: "PlexSDK", version: "0.0.1"
```

## Authentication

To see whether an endpoint needs a specific type of authentication check the endpoint's documentation.

### API Key

The PlexSDK API uses API keys as a form of authentication.
An API key is a unique identifier used to authenticate a user, developer, or calling program to an API.

The API key can be set for the SDK through: 

```Java
PlexSDK sdk = new PlexSDK("YOUR_API_KEY", "YOUR_API_KEY_HEADER");
```

## API Endpoint Services

All URIs are relative to http://10.10.10.47:32400.

Click the service name for a full list of the service methods.

| Service |
| :------ |
|[ServerService](src/main/java/47/one0/services/README.md#serverservice)|
|[MediaService](src/main/java/47/one0/services/README.md#mediaservice)|
|[ActivitiesService](src/main/java/47/one0/services/README.md#activitiesservice)|
|[ButlerService](src/main/java/47/one0/services/README.md#butlerservice)|
|[HubsService](src/main/java/47/one0/services/README.md#hubsservice)|
|[SearchService](src/main/java/47/one0/services/README.md#searchservice)|
|[LibraryService](src/main/java/47/one0/services/README.md#libraryservice)|
|[LogService](src/main/java/47/one0/services/README.md#logservice)|
|[PlaylistsService](src/main/java/47/one0/services/README.md#playlistsservice)|
|[SecurityService](src/main/java/47/one0/services/README.md#securityservice)|
|[SessionsService](src/main/java/47/one0/services/README.md#sessionsservice)|
|[UpdaterService](src/main/java/47/one0/services/README.md#updaterservice)|
|[VideoService](src/main/java/47/one0/services/README.md#videoservice)|

## API Models

[A list documenting all API models for this SDK](src/main/java/47/one0//models/README.md#plexsdk-models).

## Testing

Unit tests aren't available yet. When they are, you'll be able to run them with this command:

```Bash
mvn clean test
```

## Configuration

Your SDK may require some configuration changes.

This API is configured to use a security token for authorization. You should edit `examples/src/main/java/47/one0/examples/Main.java` and paste your own tokens in place of `PLEXSDK_API_KEY` & `PLEXSDK_API_KEY_HEADER`.

## Sample Usage

```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getServerCapabilities();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

Inside this directory is `examples/src/main/java/47/one0/examples/Main.java`. It's a simple, "hello, world" level program to demonstate this SDK. Run `install.sh` to prepare the SDK for use. 

To see what other functions this SDK is capable of, look inside `src/main/java/47/one0/http/*Client.java`.

## License

License: MIT. See license in LICENSE.

<!-- No SDK Installation -->
<!-- No SDK Example Usage -->
<!-- No SDK Available Operations -->
<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations.  All operations return a response object or raise an error.  If Error objects are specified in your OpenAPI Spec, the SDK will throw the appropriate Exception type.

| Error Object                                    | Status Code                                     | Content Type                                    |
| ----------------------------------------------- | ----------------------------------------------- | ----------------------------------------------- |
| models/errors/GetServerCapabilitiesResponseBody | 401                                             | application/json                                |
| models/errors/SDKError                          | 4xx-5xx                                         | */*                                             |

### Example

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

            GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetServerCapabilitiesResponseBody e) {
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
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally by passing a server index to the `serverIndex` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `{protocol}://{ip}:{port}` | `protocol` (default is `http`), `ip` (default is `10.10.10.47`), `port` (default is `32400`) |

#### Example

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
                .serverIndex(0)
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetServerCapabilitiesResponseBody e) {
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

#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following optional parameters are available when initializing the SDK client instance:
 * `ServerProtocol protocol`
 * `String ip`
 * `String port`

### Override Server URL Per-Client

The default server can also be overridden globally by passing a URL to the `serverURL` builder method when initializing the SDK client instance. For example:
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
                .serverURL("{protocol}://{ip}:{port}")
                .accessToken("<YOUR_API_KEY_HERE>")
                .xPlexClientIdentifier("Postman")
                .build();

            GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetServerCapabilitiesResponseBody e) {
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

### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
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
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("Postman")
                .build();

            GetPinResponse res = sdk.plex().getPin()
                .serverURL("https://plex.tv/api/v2")
                .strong(false)
                .xPlexClientIdentifier("Postman")
                .xPlexProduct("Postman")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetPinResponseBody e) {
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
<!-- End Server Selection [server] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name          | Type          | Scheme        |
| ------------- | ------------- | ------------- |
| `accessToken` | apiKey        | API key       |

To authenticate with the API the `accessToken` parameter must be set when initializing the SDK client instance. For example:
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

            GetServerCapabilitiesResponse res = sdk.server().getServerCapabilities()
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetServerCapabilitiesResponseBody e) {
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
<!-- End Authentication [security] -->

<!-- Start Global Parameters [global-parameters] -->
## Global Parameters

A parameter is configured globally. This parameter may be set on the SDK client instance itself during initialization. When configured as an option during SDK initialization, This global value will be used as the default on the operations that use it. When such operations are called, there is a place in each to override the global value, if needed.

For example, you can set `X-Plex-Client-Identifier` to `"Postman"` at SDK initialization and then you do not have to pass the same value on calls to operations like `getPin`. But if you want to do so you may, which will locally override the global setting. See the example code below for a demonstration.


### Available Globals

The following global parameter is available.

| Name | Type | Required | Description |
| ---- | ---- |:--------:| ----------- |
| xPlexClientIdentifier | String |  | The unique identifier for the client application
This is used to track the client application and its usage
(UUID, serial number, or other number unique per device)
 |


### Example

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
import lukehagar.plexapi.plexapi.utils.EventStream;
import org.openapitools.jackson.nullable.JsonNullable;
import static java.util.Map.entry;

public class Application {

    public static void main(String[] args) throws Exception {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .xPlexClientIdentifier("Postman")
                .build();

            GetPinResponse res = sdk.plex().getPin()
                .strong(false)
                .xPlexClientIdentifier("Postman")
                .xPlexProduct("Postman")
                .call();

            if (res.object().isPresent()) {
                // handle response
            }
        } catch (lukehagar.plexapi.plexapi.models.errors.GetPinResponseBody e) {
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
<!-- End Global Parameters [global-parameters] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->


