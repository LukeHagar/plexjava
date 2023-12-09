# PlexSDK Services
A list of all services and services methods.
- Services

    - [Server](#server)

    - [Media](#media)

    - [Activities](#activities)

    - [Butler](#butler)

    - [Hubs](#hubs)

    - [Search](#search)

    - [Library](#library)

    - [Log](#log)

    - [Playlists](#playlists)

    - [Security](#security)

    - [Sessions](#sessions)

    - [Updater](#updater)

    - [Video](#video)
- [All Methods](#all-methods)


## Server

| Method    | Description|
| :-------- | :----------| 
| [getServerCapabilities](#getservercapabilities) | Server Capabilities |
| [getServerPreferences](#getserverpreferences) | Get Server Preferences |
| [getAvailableClients](#getavailableclients) | Get Available Clients |
| [getDevices](#getdevices) | Get Devices |
| [getServerIdentity](#getserveridentity) | Get Server Identity |
| [getMyPlexAccount](#getmyplexaccount) | Get MyPlex Account |
| [getResizedPhoto](#getresizedphoto) | Get a Resized Photo |
| [getServerList](#getserverlist) | Get Server List |


## Media

| Method    | Description|
| :-------- | :----------| 
| [markPlayed](#markplayed) | Mark Media Played |
| [markUnplayed](#markunplayed) | Mark Media Unplayed |
| [updatePlayProgress](#updateplayprogress) | Update Media Play Progress |


## Activities

| Method    | Description|
| :-------- | :----------| 
| [getServerActivities](#getserveractivities) | Get Server Activities |
| [cancelServerActivities](#cancelserveractivities) | Cancel Server Activities |


## Butler

| Method    | Description|
| :-------- | :----------| 
| [startAllTasks](#startalltasks) | Start all Butler tasks |
| [getButlerTasks](#getbutlertasks) | Get Butler tasks |
| [stopAllTasks](#stopalltasks) | Stop all Butler tasks |
| [startTask](#starttask) | Start a single Butler task |
| [stopTask](#stoptask) | Stop a single Butler task |


## Hubs

| Method    | Description|
| :-------- | :----------| 
| [getGlobalHubs](#getglobalhubs) | Get Global Hubs |
| [getLibraryHubs](#getlibraryhubs) | Get library specific hubs |


## Search

| Method    | Description|
| :-------- | :----------| 
| [performSearch](#performsearch) | Perform a search |
| [performVoiceSearch](#performvoicesearch) | Perform a voice search |
| [getSearchResults](#getsearchresults) | Get Search Results |


## Library

| Method    | Description|
| :-------- | :----------| 
| [getFileHash](#getfilehash) | Get Hash Value |
| [getRecentlyAdded](#getrecentlyadded) | Get Recently Added |
| [getLibraries](#getlibraries) | Get All Libraries |
| [getLibrary](#getlibrary) | Get Library Details |
| [deleteLibrary](#deletelibrary) | Delete Library Section |
| [getLibraryItems](#getlibraryitems) | Get Library Items |
| [refreshLibrary](#refreshlibrary) | Refresh Library |
| [getLatestLibraryItems](#getlatestlibraryitems) | Get Latest Library Items |
| [getCommonLibraryItems](#getcommonlibraryitems) | Get Common Library Items |
| [getMetadata](#getmetadata) | Get Items Metadata |
| [getMetadataChildren](#getmetadatachildren) | Get Items Children |
| [getOnDeck](#getondeck) | Get On Deck |


## Log

| Method    | Description|
| :-------- | :----------| 
| [logMultiLine](#logmultiline) | Logging a multi-line message |
| [logLine](#logline) | Logging a single line message. |
| [enablePaperTrail](#enablepapertrail) | Enabling Papertrail |


## Playlists

| Method    | Description|
| :-------- | :----------| 
| [createPlaylist](#createplaylist) | Create a Playlist |
| [getPlaylists](#getplaylists) | Get All Playlists |
| [getPlaylist](#getplaylist) | Retrieve Playlist |
| [deletePlaylist](#deleteplaylist) | Deletes a Playlist |
| [updatePlaylist](#updateplaylist) | Update a Playlist |
| [getPlaylistContents](#getplaylistcontents) | Retrieve Playlist Contents |
| [clearPlaylistContents](#clearplaylistcontents) | Delete Playlist Contents |
| [addPlaylistContents](#addplaylistcontents) | Adding to a Playlist |
| [uploadPlaylist](#uploadplaylist) | Upload Playlist |


## Security

| Method    | Description|
| :-------- | :----------| 
| [getTransientToken](#gettransienttoken) | Get a Transient Token. |
| [getSourceConnectionInformation](#getsourceconnectioninformation) | Get Source Connection Information |


## Sessions

| Method    | Description|
| :-------- | :----------| 
| [getSessions](#getsessions) | Get Active Sessions |
| [getSessionHistory](#getsessionhistory) | Get Session History |
| [getTranscodeSessions](#gettranscodesessions) | Get Transcode Sessions |
| [stopTranscodeSession](#stoptranscodesession) | Stop a Transcode Session |


## Updater

| Method    | Description|
| :-------- | :----------| 
| [getUpdateStatus](#getupdatestatus) | Querying status of updates |
| [checkForUpdates](#checkforupdates) | Checking for updates |
| [applyUpdates](#applyupdates) | Apply Updates |


## Video

| Method    | Description|
| :-------- | :----------| 
| [startUniversalTranscode](#startuniversaltranscode) | Start Universal Transcode |
| [getTimeline](#gettimeline) | Get the timeline for a media item |


## All Methods


### **getServerCapabilities**
Server Capabilities
- HTTP Method: GET
- Endpoint: /


**Parameters**

This method has no parameters.

**Return Type**

[GetServerCapabilitiesResponse](/src/main/java/io/plexsdk/models/README.md#getservercapabilitiesresponse) 

**Example Usage Code Snippet**
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

### **getServerPreferences**
Get Server Preferences
- HTTP Method: GET
- Endpoint: /:/prefs


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getServerPreferences();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getAvailableClients**
Get Available Clients
- HTTP Method: GET
- Endpoint: /clients


**Parameters**

This method has no parameters.

**Return Type**

[GetAvailableClientsResponse](/src/main/java/io/plexsdk/models/README.md#getavailableclientsresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getAvailableClients();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getDevices**
Get Devices
- HTTP Method: GET
- Endpoint: /devices


**Parameters**

This method has no parameters.

**Return Type**

[GetDevicesResponse](/src/main/java/io/plexsdk/models/README.md#getdevicesresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getDevices();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getServerIdentity**
Get Server Identity
- HTTP Method: GET
- Endpoint: /identity


**Parameters**

This method has no parameters.

**Return Type**

[GetServerIdentityResponse](/src/main/java/io/plexsdk/models/README.md#getserveridentityresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getServerIdentity();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getMyPlexAccount**
Get MyPlex Account
- HTTP Method: GET
- Endpoint: /myplex/account


**Parameters**

This method has no parameters.

**Return Type**

[GetMyPlexAccountResponse](/src/main/java/io/plexsdk/models/README.md#getmyplexaccountresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getMyPlexAccount();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getResizedPhoto**
Get a Resized Photo
- HTTP Method: GET
- Endpoint: /photo/:/transcode


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| width | Float | Required | The width for the resized photo |
| height | Float | Required | The height for the resized photo |
| opacity | Integer | Required | The opacity for the resized photo |
| blur | Float | Required | The width for the resized photo |
| minSize | [MinSize](/src/main/java/io/plexsdk/models/README.md#minsize) | Required | images are always scaled proportionally. A value of '1' in minSize will make the smaller native dimension the dimension resized against. |
| upscale | [Upscale](/src/main/java/io/plexsdk/models/README.md#upscale) | Required | allow images to be resized beyond native dimensions. |
| url | String | Required | path to image within Plex |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getResizedPhoto(258203268, 4, 3, 2, 9, 4, "urlSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getServerList**
Get Server List
- HTTP Method: GET
- Endpoint: /servers


**Parameters**

This method has no parameters.

**Return Type**

[GetServerListResponse](/src/main/java/io/plexsdk/models/README.md#getserverlistresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.serverService.getServerList();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **markPlayed**
Mark Media Played
- HTTP Method: GET
- Endpoint: /:/scrobble


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| key | Float | Required | The media key to mark as played |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.mediaService.markPlayed(6);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **markUnplayed**
Mark Media Unplayed
- HTTP Method: GET
- Endpoint: /:/unscrobble


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| key | Float | Required | The media key to mark as Unplayed |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.mediaService.markUnplayed(4);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **updatePlayProgress**
Update Media Play Progress
- HTTP Method: POST
- Endpoint: /:/progress


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| key | String | Required | the media key |
| time | Float | Required | The time, in milliseconds, used to set the media playback progress. |
| state | String | Required | The playback state of the media item. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.mediaService.updatePlayProgress("keySampleValue", 9, "stateSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **getServerActivities**
Get Server Activities
- HTTP Method: GET
- Endpoint: /activities


**Parameters**

This method has no parameters.

**Return Type**

[GetServerActivitiesResponse](/src/main/java/io/plexsdk/models/README.md#getserveractivitiesresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.activitiesService.getServerActivities();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **cancelServerActivities**
Cancel Server Activities
- HTTP Method: DELETE
- Endpoint: /activities/{activityUUID}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| activityUuid | String | Required | The UUID of the activity to cancel. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.activitiesService.cancelServerActivities("activityUUIDSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **startAllTasks**
Start all Butler tasks
- HTTP Method: POST
- Endpoint: /butler


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.butlerService.startAllTasks();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getButlerTasks**
Get Butler tasks
- HTTP Method: GET
- Endpoint: /butler


**Parameters**

This method has no parameters.

**Return Type**

[GetButlerTasksResponse](/src/main/java/io/plexsdk/models/README.md#getbutlertasksresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.butlerService.getButlerTasks();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **stopAllTasks**
Stop all Butler tasks
- HTTP Method: DELETE
- Endpoint: /butler


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.butlerService.stopAllTasks();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **startTask**
Start a single Butler task
- HTTP Method: POST
- Endpoint: /butler/{taskName}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| taskName | [TaskName](/src/main/java/io/plexsdk/models/README.md#taskname) | Required | the name of the task to be started. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.butlerService.startTask("taskNameSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **stopTask**
Stop a single Butler task
- HTTP Method: DELETE
- Endpoint: /butler/{taskName}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| taskName | [TaskName](/src/main/java/io/plexsdk/models/README.md#taskname) | Required | The name of the task to be started. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.butlerService.stopTask("taskNameSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **getGlobalHubs**
Get Global Hubs
- HTTP Method: GET
- Endpoint: /hubs


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| count | Float | Optional | The number of items to return with each hub. |
| onlyTransient | [OnlyTransient](/src/main/java/io/plexsdk/models/README.md#onlytransient) | Optional | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.hubsService.getGlobalHubs(6, 8);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getLibraryHubs**
Get library specific hubs
- HTTP Method: GET
- Endpoint: /hubs/sections/{sectionId}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to query |
| count | Float | Optional | The number of items to return with each hub. |
| onlyTransient | [OnlyTransient](/src/main/java/io/plexsdk/models/README.md#onlytransient) | Optional | Only return hubs which are "transient", meaning those which are prone to changing after media playback or addition (e.g. On Deck, or Recently Added). |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.hubsService.getLibraryHubs(8, 3, 5);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **performSearch**
Perform a search
- HTTP Method: GET
- Endpoint: /hubs/search


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| query | String | Required | The query term |
| sectionId | Float | Optional | This gives context to the search, and can result in re-ordering of search result hubs |
| limit | Float | Optional | The number of items to return per hub |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.searchService.performSearch("querySampleValue", 2, 4);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **performVoiceSearch**
Perform a voice search
- HTTP Method: GET
- Endpoint: /hubs/search/voice


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| query | String | Required | The query term |
| sectionId | Float | Optional | This gives context to the search, and can result in re-ordering of search result hubs |
| limit | Float | Optional | The number of items to return per hub |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.searchService.performVoiceSearch("querySampleValue", 1, 5);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getSearchResults**
Get Search Results
- HTTP Method: GET
- Endpoint: /search


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| query | String | Required | The search query string to use |

**Return Type**

[GetSearchResultsResponse](/src/main/java/io/plexsdk/models/README.md#getsearchresultsresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.searchService.getSearchResults("querySampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **getFileHash**
Get Hash Value
- HTTP Method: GET
- Endpoint: /library/hashes


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| url | String | Required | This is the path to the local file, must be prefixed by `file://` |
| type | Float | Optional | Item type |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getFileHash("urlSampleValue", 8);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getRecentlyAdded**
Get Recently Added
- HTTP Method: GET
- Endpoint: /library/recentlyAdded


**Parameters**

This method has no parameters.

**Return Type**

[GetRecentlyAddedResponse](/src/main/java/io/plexsdk/models/README.md#getrecentlyaddedresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getRecentlyAdded();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getLibraries**
Get All Libraries
- HTTP Method: GET
- Endpoint: /library/sections


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getLibraries();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getLibrary**
Get Library Details
- HTTP Method: GET
- Endpoint: /library/sections/{sectionId}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to query |
| includeDetails | [IncludeDetails](/src/main/java/io/plexsdk/models/README.md#includedetails) | Optional | Whether or not to include details for a section (types, filters, and sorts). <br>Only exists for backwards compatibility, media providers other than the server libraries have it on always.<br> |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getLibrary(8, 2);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **deleteLibrary**
Delete Library Section
- HTTP Method: DELETE
- Endpoint: /library/sections/{sectionId}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to query |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.deleteLibrary(2);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getLibraryItems**
Get Library Items
- HTTP Method: GET
- Endpoint: /library/sections/{sectionId}/all


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to query |
| type | Float | Optional | item type |
| filter | String | Optional | the filter parameter |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getLibraryItems(7, 5, "filterSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **refreshLibrary**
Refresh Library
- HTTP Method: GET
- Endpoint: /library/sections/{sectionId}/refresh


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to refresh |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.refreshLibrary(1);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getLatestLibraryItems**
Get Latest Library Items
- HTTP Method: GET
- Endpoint: /library/sections/{sectionId}/latest


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to query |
| type | Float | Required | item type |
| filter | String | Optional | the filter parameter |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getLatestLibraryItems(6, 6, "filterSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getCommonLibraryItems**
Get Common Library Items
- HTTP Method: GET
- Endpoint: /library/sections/{sectionId}/common


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sectionId | Float | Required | the Id of the library to query |
| type | Float | Required | item type |
| filter | String | Optional | the filter parameter |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getCommonLibraryItems(1, 3, "filterSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getMetadata**
Get Items Metadata
- HTTP Method: GET
- Endpoint: /library/metadata/{ratingKey}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| ratingKey | Float | Required | the id of the library item to return the children of. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getMetadata(4);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getMetadataChildren**
Get Items Children
- HTTP Method: GET
- Endpoint: /library/metadata/{ratingKey}/children


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| ratingKey | Float | Required | the id of the library item to return the children of. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getMetadataChildren(8);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getOnDeck**
Get On Deck
- HTTP Method: GET
- Endpoint: /library/onDeck


**Parameters**

This method has no parameters.

**Return Type**

[GetOnDeckResponse](/src/main/java/io/plexsdk/models/README.md#getondeckresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.libraryService.getOnDeck();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **logMultiLine**
Logging a multi-line message
- HTTP Method: POST
- Endpoint: /log


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.logService.logMultiLine();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **logLine**
Logging a single line message.
- HTTP Method: GET
- Endpoint: /log


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| level | [Level](/src/main/java/io/plexsdk/models/README.md#level) | Required | An integer log level to write to the PMS log with.  <br>0: Error  <br>1: Warning  <br>2: Info <br>3: Debug  <br>4: Verbose<br> |
| message | String | Required | The text of the message to write to the log. |
| source | String | Required | a string indicating the source of the message. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.logService.logLine(7, "messageSampleValue", "sourceSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **enablePaperTrail**
Enabling Papertrail
- HTTP Method: GET
- Endpoint: /log/networked


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.logService.enablePaperTrail();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **createPlaylist**
Create a Playlist
- HTTP Method: POST
- Endpoint: /playlists


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| title | String | Required | name of the playlist |
| type | [Type](/src/main/java/io/plexsdk/models/README.md#type) | Required | type of playlist to create |
| smart | [Smart](/src/main/java/io/plexsdk/models/README.md#smart) | Required | whether the playlist is smart or not |
| uri | String | Optional | the content URI for the playlist |
| playQueueId | Float | Optional | the play queue to copy to a playlist |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.createPlaylist("titleSampleValue", "typeSampleValue", 1, "uriSampleValue", 2);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getPlaylists**
Get All Playlists
- HTTP Method: GET
- Endpoint: /playlists/all


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistType | [PlaylistType](/src/main/java/io/plexsdk/models/README.md#playlisttype) | Optional | limit to a type of playlist. |
| smart | [Smart](/src/main/java/io/plexsdk/models/README.md#smart) | Optional | type of playlists to return (default is all). |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.getPlaylists("playlistTypeSampleValue", 4);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getPlaylist**
Retrieve Playlist
- HTTP Method: GET
- Endpoint: /playlists/{playlistID}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistId | Float | Required | the ID of the playlist |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.getPlaylist(8);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **deletePlaylist**
Deletes a Playlist
- HTTP Method: DELETE
- Endpoint: /playlists/{playlistID}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistId | Float | Required | the ID of the playlist |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.deletePlaylist(3);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **updatePlaylist**
Update a Playlist
- HTTP Method: PUT
- Endpoint: /playlists/{playlistID}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistId | Float | Required | the ID of the playlist |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.updatePlaylist(6);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getPlaylistContents**
Retrieve Playlist Contents
- HTTP Method: GET
- Endpoint: /playlists/{playlistID}/items


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistId | Float | Required | the ID of the playlist |
| type | Float | Required | the metadata type of the item to return |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.getPlaylistContents(2, 7);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **clearPlaylistContents**
Delete Playlist Contents
- HTTP Method: DELETE
- Endpoint: /playlists/{playlistID}/items


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistId | Float | Required | the ID of the playlist |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.clearPlaylistContents(2);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **addPlaylistContents**
Adding to a Playlist
- HTTP Method: PUT
- Endpoint: /playlists/{playlistID}/items


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| playlistId | Float | Required | the ID of the playlist |
| uri | String | Required | the content URI for the playlist |
| playQueueId | Float | Required | the play queue to add to a playlist |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.addPlaylistContents(1, "uriSampleValue", 3);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **uploadPlaylist**
Upload Playlist
- HTTP Method: POST
- Endpoint: /playlists/upload


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| path | String | Required | absolute path to a directory on the server where m3u files are stored, or the absolute path to a playlist file on the server. <br>If the `path` argument is a directory, that path will be scanned for playlist files to be processed. <br>Each file in that directory creates a separate playlist, with a name based on the filename of the file that created it. <br>The GUID of each playlist is based on the filename. <br>If the `path` argument is a file, that file will be used to create a new playlist, with the name based on the filename of the file that created it. <br>The GUID of each playlist is based on the filename.<br> |
| force | [Force](/src/main/java/io/plexsdk/models/README.md#force) | Required | force overwriting of duplicate playlists. By default, a playlist file uploaded with the same path will overwrite the existing playlist. <br>The `force` argument is used to disable overwriting. If the `force` argument is set to 0, a new playlist will be created suffixed with the date and time that the duplicate was uploaded.<br> |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.playlistsService.uploadPlaylist("pathSampleValue", 2);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **getTransientToken**
Get a Transient Token.
- HTTP Method: GET
- Endpoint: /security/token


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| type | [SecurityType](/src/main/java/io/plexsdk/models/README.md#securitytype) | Required | `delegation` - This is the only supported `type` parameter. |
| scope | [Scope](/src/main/java/io/plexsdk/models/README.md#scope) | Required | `all` - This is the only supported `scope` parameter. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.securityService.getTransientToken("typeSampleValue", "scopeSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getSourceConnectionInformation**
Get Source Connection Information
- HTTP Method: GET
- Endpoint: /security/resources


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| source | String | Required | The source identifier with an included prefix. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.securityService.getSourceConnectionInformation("sourceSampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **getSessions**
Get Active Sessions
- HTTP Method: GET
- Endpoint: /status/sessions


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.sessionsService.getSessions();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getSessionHistory**
Get Session History
- HTTP Method: GET
- Endpoint: /status/sessions/history/all


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.sessionsService.getSessionHistory();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getTranscodeSessions**
Get Transcode Sessions
- HTTP Method: GET
- Endpoint: /transcode/sessions


**Parameters**

This method has no parameters.

**Return Type**

[GetTranscodeSessionsResponse](/src/main/java/io/plexsdk/models/README.md#gettranscodesessionsresponse) 

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.sessionsService.getTranscodeSessions();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **stopTranscodeSession**
Stop a Transcode Session
- HTTP Method: DELETE
- Endpoint: /transcode/sessions/{sessionKey}


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| sessionKey | String | Required | the Key of the transcode session to stop |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.sessionsService.stopTranscodeSession("sessionKeySampleValue");
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **getUpdateStatus**
Querying status of updates
- HTTP Method: GET
- Endpoint: /updater/status


**Parameters**

This method has no parameters.

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.updaterService.getUpdateStatus();
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **checkForUpdates**
Checking for updates
- HTTP Method: PUT
- Endpoint: /updater/check


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| download | [Download](/src/main/java/io/plexsdk/models/README.md#download) | Optional | Indicate that you want to start download any updates found. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.updaterService.checkForUpdates(5);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **applyUpdates**
Apply Updates
- HTTP Method: PUT
- Endpoint: /updater/apply


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| tonight | [Tonight](/src/main/java/io/plexsdk/models/README.md#tonight) | Optional | Indicate that you want the update to run during the next Butler execution. Omitting this or setting it to false indicates that the update should install |
| skip | [Skip](/src/main/java/io/plexsdk/models/README.md#skip) | Optional | Indicate that the latest version should be marked as skipped. The <Release> entry for this version will have the `state` set to `skipped`. |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.updaterService.applyUpdates(5, 3);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



### **startUniversalTranscode**
Start Universal Transcode
- HTTP Method: GET
- Endpoint: /video/:/transcode/universal/start.mpd


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| hasMde | Float | Required | Whether the media item has MDE |
| path | String | Required | The path to the media item to transcode |
| mediaIndex | Float | Required | The index of the media item to transcode |
| partIndex | Float | Required | The index of the part to transcode |
| protocol | String | Required | The protocol to use for the transcode session |
| fastSeek | Float | Optional | Whether to use fast seek or not |
| directPlay | Float | Optional | Whether to use direct play or not |
| directStream | Float | Optional | Whether to use direct stream or not |
| subtitleSize | Float | Optional | The size of the subtitles |
| subtites | String | Optional | The subtitles |
| audioBoost | Float | Optional | The audio boost |
| location | String | Optional | The location of the transcode session |
| mediaBufferSize | Float | Optional | The size of the media buffer |
| session | String | Optional | The session ID |
| addDebugOverlay | Float | Optional | Whether to add a debug overlay or not |
| autoAdjustQuality | Float | Optional | Whether to auto adjust quality or not |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.videoService.startUniversalTranscode(9, "pathSampleValue", 6, 5, "protocolSampleValue", 2, 6, 1, 5, "subtitesSampleValue", 6, "locationSampleValue", 5, "sessionSampleValue", 6, 3);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```

### **getTimeline**
Get the timeline for a media item
- HTTP Method: GET
- Endpoint: /:/timeline


**Parameters**
| Name    | Type| Required | Description |
| :-------- | :----------| :----------| :----------| 
| ratingKey | Float | Required | The rating key of the media item |
| key | String | Required | The key of the media item to get the timeline for |
| state | [State](/src/main/java/io/plexsdk/models/README.md#state) | Required | The state of the media item |
| hasMde | Float | Required | Whether the media item has MDE |
| time | Float | Required | The time of the media item |
| duration | Float | Required | The duration of the media item |
| context | String | Required | The context of the media item |
| playQueueItemId | Float | Required | The play queue item ID of the media item |
| playBackTime | Float | Required | The playback time of the media item |
| row | Float | Required | The row of the media item |

**Return Type**

Returns a dict object.

**Example Usage Code Snippet**
```Java
package 47.one0.examples;

import 47.one0.exceptions.ApiException;
import 47.one0.PlexSDK;

public class Main {

  public static void main(String[] args) {
    PlexSDK client = new PlexSDK(System.getenv("PLEXSDK_API_KEY"), System.getenv("PLEXSDK_API_KEY_HEADER"));
    try {
        Object response = client.videoService.getTimeline(4, "keySampleValue", "stateSampleValue", 9, 4, 8, "contextSampleValue", 3, 7, 8);
        System.out.println(response);
    } catch(ApiException e) {
        e.printStackTrace();
    }
  }
}

```



