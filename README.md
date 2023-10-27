

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
  <groupId>com.plexsdk</groupId>
  <artifactId>plex-sdk</artifactId>
  <version>0.0.1</version>
</dependency>
```

If you use Gradle, paste the next line inside the dependencies block of your build.gradle file:

```Gradle
implementation group: "com.plexsdk", name: "PlexSDK", version: "0.0.1"
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

All URIs are relative to {protocol}://{ip}:{port}.

Click the service name for a full list of the service methods.

| Service |
| :------ |
|[ServerService](src/main/java/com/plexsdk/services/README.md#serverservice)|
|[MediaService](src/main/java/com/plexsdk/services/README.md#mediaservice)|
|[ActivitiesService](src/main/java/com/plexsdk/services/README.md#activitiesservice)|
|[ButlerService](src/main/java/com/plexsdk/services/README.md#butlerservice)|
|[HubsService](src/main/java/com/plexsdk/services/README.md#hubsservice)|
|[SearchService](src/main/java/com/plexsdk/services/README.md#searchservice)|
|[LibraryService](src/main/java/com/plexsdk/services/README.md#libraryservice)|
|[LogService](src/main/java/com/plexsdk/services/README.md#logservice)|
|[PlaylistsService](src/main/java/com/plexsdk/services/README.md#playlistsservice)|
|[SecurityService](src/main/java/com/plexsdk/services/README.md#securityservice)|
|[SessionsService](src/main/java/com/plexsdk/services/README.md#sessionsservice)|
|[UpdaterService](src/main/java/com/plexsdk/services/README.md#updaterservice)|
|[VideoService](src/main/java/com/plexsdk/services/README.md#videoservice)|

## API Models
[A list documenting all API models for this SDK](src/main/java/com/plexsdk//models/README.md#plexsdk-models).

## Testing

Unit tests aren't available yet. When they are, you'll be able to run them with this command:

```Bash
mvn clean test
```

## Configuration

Your SDK may require some configuration changes.


This API is configured to use a security token for authorization. You should edit `examples/src/main/java/com/plexsdk/examples/Main.java` and paste your own tokens in place of `PLEXSDK_API_KEY` & `PLEXSDK_API_KEY_HEADER`.


## Sample Usage

```Java
package com.plexsdk.examples;

import com.plexsdk.exceptions.ApiException;
import com.plexsdk.PlexSDK;

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

Inside this directory is `examples/src/main/java/com/plexsdk/examples/Main.java`. It's a simple, "hello, world" level program to demonstate this SDK. Run `install.sh` to prepare the SDK for use. 

To see what other functions this SDK is capable of, look inside `src/main/java/com/plexsdk/http/*Client.java`.

## License

License: MIT. See license in LICENSE.

