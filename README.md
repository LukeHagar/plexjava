

# PlexSDK Java SDK 0.0.1
A Java SDK for PlexSDK. 

An Open API Spec for interacting with Plex.tv and Plex Servers

- API version: 0.0.1
- SDK version: 0.0.1

## Table of Contents
- [Requirements](#requirements)
- [Installation](#installation)
    - [Dependencies](#dependencies)
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

If you use Maven, place the following within the <dependencies> tag in your pom.xml file:

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
<!-- Start Server Selection [server] -->
## Server Selection

## Server Selection

### Select Server by Index

You can override the default server globally using the `setServerIndex` option when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| # | Server | Variables |
| - | ------ | --------- |
| 0 | `{protocol}://{ip}:{port}` | `0` (default is `http`), `1` (default is `10.10.10.47`), `2` (default is `32400`) |



#### Variables

Some of the server options above contain variables. If you want to set the values of those variables, the following options are provided for doing so:
 * `setZero ServerProtocol`
 * `setOne String`
 * `setTwo String`

### Override Server URL Per-Client

The default server can also be overridden globally using the `setServerURL` option when initializing the SDK client instance. For example:


### Override Server URL Per-Operation

The server URL can also be overridden on a per-operation basis, provided a server list was specified for the operation. For example:
```java
package hello.world;

import lukehagar.plexapi.plexapi.PlexAPI;
import lukehagar.plexapi.plexapi.models.operations.GetPinRequest;
import lukehagar.plexapi.plexapi.models.operations.GetPinResponse;
import lukehagar.plexapi.plexapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            PlexAPI sdk = PlexAPI.builder()
                .setSecurity(new Security(
                "<value>"){{
                    accessToken = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            lukehagar.plexapi.plexapi.models.operations.GetPinResponse res = sdk.plex.getPin(serverUrl="https://plex.tv/api/v2", "<value>", false);

            if (res.twoHundredApplicationJsonObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->


