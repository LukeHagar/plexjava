# plexapi

<div align="left">
    <a href="https://speakeasyapi.dev/"><img src="https://custom-icon-badges.demolab.com/badge/-Built%20By%20Speakeasy-212015?style=for-the-badge&logoColor=FBE331&logo=speakeasy&labelColor=545454" /></a>
    <a href="https://mit-license.org/">
        <img src="https://img.shields.io/badge/License-MIT-blue.svg" style="width: 100px; height: 28px;" />
    </a>
</div>


<!-- Start Summary [summary] -->
## Summary


<!-- End Summary [summary] -->

<!-- Start Table of Contents [toc] -->
## Table of Contents
<!-- $toc-max-depth=2 -->
* [plexapi](#plexapi)
  * [SDK Installation](#sdk-installation)
  * [SDK Example Usage](#sdk-example-usage)
  * [Available Resources and Operations](#available-resources-and-operations)
  * [Error Handling](#error-handling)
  * [Server Selection](#server-selection)
  * [Asynchronous Support](#asynchronous-support)
  * [Authentication](#authentication)
  * [Custom HTTP Client](#custom-http-client)
  * [Debugging](#debugging)
* [Development](#development)
  * [Maturity](#maturity)
  * [Contributions](#contributions)

<!-- End Table of Contents [toc] -->

<!-- Start SDK Installation [installation] -->
## SDK Installation

### Getting started

JDK 11 or later is required.

The samples below show how a published SDK artifact is used:

Gradle:
```groovy
implementation 'dev.plexapi:plexapi:0.21.1'
```

Maven:
```xml
<dependency>
    <groupId>dev.plexapi</groupId>
    <artifactId>plexapi</artifactId>
    <version>0.21.1</version>
</dependency>
```

### How to build
After cloning the git repository to your file system you can build the SDK artifact from source to the `build` directory by running `./gradlew build` on *nix systems or `gradlew.bat` on Windows systems.

If you wish to build from source and publish the SDK artifact to your local Maven repository (on your filesystem) then use the following command (after cloning the git repo locally):

On *nix:
```bash
./gradlew publishToMavenLocal -Pskip.signing
```
On Windows:
```bash
gradlew.bat publishToMavenLocal -Pskip.signing
```
<!-- End SDK Installation [installation] -->

<!-- Start SDK Example Usage [usage] -->
## SDK Example Usage

### Example

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.*;
import dev.plexapi.sdk.models.shared.*;
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

        StartTranscodeSessionRequest req = StartTranscodeSessionRequest.builder()
                .transcodeType(TranscodeType.MUSIC)
                .extension(Extension.MPD)
                .advancedSubtitles(AdvancedSubtitles.BURN)
                .audioBoost(50L)
                .audioChannelCount(5L)
                .autoAdjustQuality(BoolInt.ONE)
                .autoAdjustSubtitle(BoolInt.ONE)
                .directPlay(BoolInt.ONE)
                .directStream(BoolInt.ONE)
                .directStreamAudio(BoolInt.ONE)
                .disableResolutionRotation(BoolInt.ONE)
                .hasMDE(BoolInt.ONE)
                .location(StartTranscodeSessionQueryParamLocation.WAN)
                .mediaBufferSize(102400L)
                .mediaIndex(0L)
                .musicBitrate(5000L)
                .offset(90.5)
                .partIndex(0L)
                .path("/library/metadata/151671")
                .peakBitrate(12000L)
                .photoResolution("1080x1080")
                .protocol(StartTranscodeSessionQueryParamProtocol.DASH)
                .secondsPerSegment(5L)
                .subtitleSize(50L)
                .videoBitrate(12000L)
                .videoQuality(50L)
                .videoResolution("1080x1080")
                .xPlexClientProfileExtra("add-limitation(scope=videoCodec&scopeName=*&type=upperBound&name=video.frameRate&value=60&replace=true)+append-transcode-target-codec(type=videoProfile&context=streaming&videoCodec=h264%2Chevc&audioCodec=aac&protocol=dash)")
                .xPlexClientProfileName("generic")
                .build();

        StartTranscodeSessionResponse res = sdk.transcoder().startTranscodeSession()
                .request(req)
                .call();

        if (res.responseStream().isPresent()) {
            // handle response
        }
    }
}
```
#### Asynchronous Call
An asynchronous SDK client is also available that returns a [`CompletableFuture<T>`][comp-fut]. See [Asynchronous Support](#asynchronous-support) for more details on async benefits and reactive library integration.
```java
package hello.world;

import dev.plexapi.sdk.AsyncPlexAPI;
import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetServerInfoRequest;
import dev.plexapi.sdk.models.operations.async.GetServerInfoResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.util.concurrent.CompletableFuture;

public class Application {

    public static void main(String[] args) {

        AsyncPlexAPI sdk = PlexAPI.builder()
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
            .build()
            .async();

        GetServerInfoRequest req = GetServerInfoRequest.builder()
                .build();

        CompletableFuture<GetServerInfoResponse> resFut = sdk.general().getServerInfo()
                .request(req)
                .call();

        resFut.thenAccept(res -> {
            if (res.mediaContainerWithDirectory().isPresent()) {
            // handle response
            }
        });
    }
}
```

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
<!-- End SDK Example Usage [usage] -->

<!-- Start Available Resources and Operations [operations] -->
## Available Resources and Operations

<details open>
<summary>Available methods</summary>

### [activities()](docs/sdks/activities/README.md)

* [listActivities](docs/sdks/activities/README.md#listactivities) - Get all activities
* [cancelActivity](docs/sdks/activities/README.md#cancelactivity) - Cancel a running activity

### [butler()](docs/sdks/butler/README.md)

* [stopTasks](docs/sdks/butler/README.md#stoptasks) - Stop all Butler tasks
* [getTasks](docs/sdks/butler/README.md#gettasks) - Get all Butler tasks
* [startTasks](docs/sdks/butler/README.md#starttasks) - Start all Butler tasks
* [stopTask](docs/sdks/butler/README.md#stoptask) - Stop a single Butler task
* [startTask](docs/sdks/butler/README.md#starttask) - Start a single Butler task

### [collections()](docs/sdks/collections/README.md)

* [createCollection](docs/sdks/collections/README.md#createcollection) - Create collection

### [content()](docs/sdks/content/README.md)

* [getCollectionItems](docs/sdks/content/README.md#getcollectionitems) - Get items in a collection
* [getMetadataItem](docs/sdks/content/README.md#getmetadataitem) - Get a metadata item
* [getAlbums](docs/sdks/content/README.md#getalbums) - Set section albums
* [listContent](docs/sdks/content/README.md#listcontent) - Get items in the section
* [getAllLeaves](docs/sdks/content/README.md#getallleaves) - Set section leaves
* [getArts](docs/sdks/content/README.md#getarts) - Set section artwork
* [getCategories](docs/sdks/content/README.md#getcategories) - Set section categories
* [getCluster](docs/sdks/content/README.md#getcluster) - Set section clusters
* [getSonicPath](docs/sdks/content/README.md#getsonicpath) - Similar tracks to transition from one to another
* [getFolders](docs/sdks/content/README.md#getfolders) - Get all folder locations
* [listMoments](docs/sdks/content/README.md#listmoments) - Set section moments
* [getSonicallySimilar](docs/sdks/content/README.md#getsonicallysimilar) - The nearest audio tracks
* [getCollectionImage](docs/sdks/content/README.md#getcollectionimage) - Get a collection's image

### [devices()](docs/sdks/devices/README.md)

* [getAvailableGrabbers](docs/sdks/devices/README.md#getavailablegrabbers) - Get available grabbers
* [listDevices](docs/sdks/devices/README.md#listdevices) - Get all devices
* [addDevice](docs/sdks/devices/README.md#adddevice) - Add a device
* [discoverDevices](docs/sdks/devices/README.md#discoverdevices) - Tell grabbers to discover devices
* [removeDevice](docs/sdks/devices/README.md#removedevice) - Remove a device
* [getDeviceDetails](docs/sdks/devices/README.md#getdevicedetails) - Get device details
* [modifyDevice](docs/sdks/devices/README.md#modifydevice) - Enable or disable a device
* [setChannelmap](docs/sdks/devices/README.md#setchannelmap) - Set a device's channel mapping
* [getDevicesChannels](docs/sdks/devices/README.md#getdeviceschannels) - Get a device's channels
* [setDevicePreferences](docs/sdks/devices/README.md#setdevicepreferences) - Set device preferences
* [stopScan](docs/sdks/devices/README.md#stopscan) - Tell a device to stop scanning for channels
* [scan](docs/sdks/devices/README.md#scan) - Tell a device to scan for channels
* [getThumb](docs/sdks/devices/README.md#getthumb) - Get device thumb

### [downloadQueue()](docs/sdks/downloadqueue/README.md)

* [createDownloadQueue](docs/sdks/downloadqueue/README.md#createdownloadqueue) - Create download queue
* [getDownloadQueue](docs/sdks/downloadqueue/README.md#getdownloadqueue) - Get a download queue
* [addDownloadQueueItems](docs/sdks/downloadqueue/README.md#adddownloadqueueitems) - Add to download queue
* [listDownloadQueueItems](docs/sdks/downloadqueue/README.md#listdownloadqueueitems) - Get download queue items
* [getItemDecision](docs/sdks/downloadqueue/README.md#getitemdecision) - Grab download queue item decision
* [getDownloadQueueMedia](docs/sdks/downloadqueue/README.md#getdownloadqueuemedia) - Grab download queue media
* [removeDownloadQueueItems](docs/sdks/downloadqueue/README.md#removedownloadqueueitems) - Delete download queue items
* [getDownloadQueueItems](docs/sdks/downloadqueue/README.md#getdownloadqueueitems) - Get download queue items
* [restartProcessingDownloadQueueItems](docs/sdks/downloadqueue/README.md#restartprocessingdownloadqueueitems) - Restart processing of items from the decision

### [dvRs()](docs/sdks/dvrs/README.md)

* [listDVRs](docs/sdks/dvrs/README.md#listdvrs) - Get DVRs
* [createDVR](docs/sdks/dvrs/README.md#createdvr) - Create a DVR
* [deleteDVR](docs/sdks/dvrs/README.md#deletedvr) - Delete a single DVR
* [getDVR](docs/sdks/dvrs/README.md#getdvr) - Get a single DVR
* [deleteLineup](docs/sdks/dvrs/README.md#deletelineup) - Delete a DVR Lineup
* [addLineup](docs/sdks/dvrs/README.md#addlineup) - Add a DVR Lineup
* [setDVRPreferences](docs/sdks/dvrs/README.md#setdvrpreferences) - Set DVR preferences
* [stopDVRReload](docs/sdks/dvrs/README.md#stopdvrreload) - Tell a DVR to stop reloading program guide
* [reloadGuide](docs/sdks/dvrs/README.md#reloadguide) - Tell a DVR to reload program guide
* [tuneChannel](docs/sdks/dvrs/README.md#tunechannel) - Tune a channel on a DVR
* [removeDeviceFromDVR](docs/sdks/dvrs/README.md#removedevicefromdvr) - Remove a device from an existing DVR
* [addDeviceToDVR](docs/sdks/dvrs/README.md#adddevicetodvr) - Add a device to an existing DVR

### [epg()](docs/sdks/epg/README.md)

* [computeChannelMap](docs/sdks/epg/README.md#computechannelmap) - Compute the best channel map
* [getChannels](docs/sdks/epg/README.md#getchannels) - Get channels for a lineup
* [getCountries](docs/sdks/epg/README.md#getcountries) - Get all countries
* [getAllLanguages](docs/sdks/epg/README.md#getalllanguages) - Get all languages
* [getLineup](docs/sdks/epg/README.md#getlineup) - Compute the best lineup
* [getLineupChannels](docs/sdks/epg/README.md#getlineupchannels) - Get the channels for mulitple lineups
* [getCountriesLineups](docs/sdks/epg/README.md#getcountrieslineups) - Get lineups for a country via postal code
* [getCountryRegions](docs/sdks/epg/README.md#getcountryregions) - Get regions for a country
* [listLineups](docs/sdks/epg/README.md#listlineups) - Get lineups for a region

### [events()](docs/sdks/events/README.md)

* [getNotifications](docs/sdks/events/README.md#getnotifications) - Connect to Eventsource
* [connectWebSocket](docs/sdks/events/README.md#connectwebsocket) - Connect to WebSocket

### [general()](docs/sdks/general/README.md)

* [getServerInfo](docs/sdks/general/README.md#getserverinfo) - Get PMS info
* [getIdentity](docs/sdks/general/README.md#getidentity) - Get PMS identity
* [getSourceConnectionInformation](docs/sdks/general/README.md#getsourceconnectioninformation) - Get Source Connection Information
* [getTransientToken](docs/sdks/general/README.md#gettransienttoken) - Get Transient Tokens

### [hubs()](docs/sdks/hubs/README.md)

* [getAllHubs](docs/sdks/hubs/README.md#getallhubs) - Get global hubs
* [getContinueWatching](docs/sdks/hubs/README.md#getcontinuewatching) - Get the continue watching hub
* [getHubItems](docs/sdks/hubs/README.md#gethubitems) - Get a hub's items
* [getPromotedHubs](docs/sdks/hubs/README.md#getpromotedhubs) - Get the hubs which are promoted
* [getMetadataHubs](docs/sdks/hubs/README.md#getmetadatahubs) - Get hubs for section by metadata item
* [getPostplayHubs](docs/sdks/hubs/README.md#getpostplayhubs) - Get postplay hubs
* [getRelatedHubs](docs/sdks/hubs/README.md#getrelatedhubs) - Get related hubs
* [getSectionHubs](docs/sdks/hubs/README.md#getsectionhubs) - Get section hubs
* [resetSectionDefaults](docs/sdks/hubs/README.md#resetsectiondefaults) - Reset hubs to defaults
* [listHubs](docs/sdks/hubs/README.md#listhubs) - Get hubs
* [createCustomHub](docs/sdks/hubs/README.md#createcustomhub) - Create a custom hub
* [moveHub](docs/sdks/hubs/README.md#movehub) - Move Hub
* [deleteCustomHub](docs/sdks/hubs/README.md#deletecustomhub) - Delete a custom hub
* [updateHubVisibility](docs/sdks/hubs/README.md#updatehubvisibility) - Change hub visibility

### [library()](docs/sdks/library/README.md)

* [getLibraryItems](docs/sdks/library/README.md#getlibraryitems) - Get all items in library
* [deleteCaches](docs/sdks/library/README.md#deletecaches) - Delete library caches
* [cleanBundles](docs/sdks/library/README.md#cleanbundles) - Clean bundles
* [ingestTransientItem](docs/sdks/library/README.md#ingesttransientitem) - Ingest a transient item
* [getLibraryMatches](docs/sdks/library/README.md#getlibrarymatches) - Get library matches
* [optimizeDatabase](docs/sdks/library/README.md#optimizedatabase) - Optimize the Database
* [getRandomArtwork](docs/sdks/library/README.md#getrandomartwork) - Get random artwork
* [getSections](docs/sdks/library/README.md#getsections) - Get library sections (main Media Provider Only)
* [addSection](docs/sdks/library/README.md#addsection) - Add a library section
* [stopAllRefreshes](docs/sdks/library/README.md#stopallrefreshes) - Stop refresh
* [getSectionsPrefs](docs/sdks/library/README.md#getsectionsprefs) - Get section prefs
* [refreshSectionsMetadata](docs/sdks/library/README.md#refreshsectionsmetadata) - Refresh all sections
* [getTags](docs/sdks/library/README.md#gettags) - Get all library tags of a type
* [deleteMetadataItem](docs/sdks/library/README.md#deletemetadataitem) - Delete a metadata item
* [editMetadataItem](docs/sdks/library/README.md#editmetadataitem) - Edit a metadata item
* [detectAds](docs/sdks/library/README.md#detectads) - Ad-detect an item
* [getAllItemLeaves](docs/sdks/library/README.md#getallitemleaves) - Get the leaves of an item
* [analyzeMetadata](docs/sdks/library/README.md#analyzemetadata) - Analyze an item
* [generateThumbs](docs/sdks/library/README.md#generatethumbs) - Generate thumbs of chapters for an item
* [detectCredits](docs/sdks/library/README.md#detectcredits) - Credit detect a metadata item
* [getExtras](docs/sdks/library/README.md#getextras) - Get an item's extras
* [addExtras](docs/sdks/library/README.md#addextras) - Add to an item's extras
* [getFile](docs/sdks/library/README.md#getfile) - Get a file from a metadata or media bundle
* [startBifGeneration](docs/sdks/library/README.md#startbifgeneration) - Start BIF generation of an item
* [detectIntros](docs/sdks/library/README.md#detectintros) - Intro detect an item
* [createMarker](docs/sdks/library/README.md#createmarker) - Create a marker
* [matchItem](docs/sdks/library/README.md#matchitem) - Match a metadata item
* [listMatches](docs/sdks/library/README.md#listmatches) - Get metadata matches for an item
* [mergeItems](docs/sdks/library/README.md#mergeitems) - Merge a metadata item
* [listSonicallySimilar](docs/sdks/library/README.md#listsonicallysimilar) - Get nearest tracks to metadata item
* [setItemPreferences](docs/sdks/library/README.md#setitempreferences) - Set metadata preferences
* [refreshItemsMetadata](docs/sdks/library/README.md#refreshitemsmetadata) - Refresh a metadata item
* [getRelatedItems](docs/sdks/library/README.md#getrelateditems) - Get related items
* [listSimilar](docs/sdks/library/README.md#listsimilar) - Get similar items
* [splitItem](docs/sdks/library/README.md#splititem) - Split a metadata item
* [addSubtitles](docs/sdks/library/README.md#addsubtitles) - Add subtitles
* [getItemTree](docs/sdks/library/README.md#getitemtree) - Get metadata items as a tree
* [unmatch](docs/sdks/library/README.md#unmatch) - Unmatch a metadata item
* [listTopUsers](docs/sdks/library/README.md#listtopusers) - Get metadata top users
* [detectVoiceActivity](docs/sdks/library/README.md#detectvoiceactivity) - Detect voice activity
* [getAugmentationStatus](docs/sdks/library/README.md#getaugmentationstatus) - Get augmentation status
* [setStreamSelection](docs/sdks/library/README.md#setstreamselection) - Set stream selection
* [getPerson](docs/sdks/library/README.md#getperson) - Get person details
* [listPersonMedia](docs/sdks/library/README.md#listpersonmedia) - Get media for a person
* [deleteLibrarySection](docs/sdks/library/README.md#deletelibrarysection) - Delete a library section
* [getLibraryDetails](docs/sdks/library/README.md#getlibrarydetails) - Get a library section by id
* [editSection](docs/sdks/library/README.md#editsection) - Edit a library section
* [updateItems](docs/sdks/library/README.md#updateitems) - Set the fields of the filtered items
* [startAnalysis](docs/sdks/library/README.md#startanalysis) - Analyze a section
* [autocomplete](docs/sdks/library/README.md#autocomplete) - Get autocompletions for search
* [getCollections](docs/sdks/library/README.md#getcollections) - Get collections in a section
* [getCommon](docs/sdks/library/README.md#getcommon) - Get common fields for items
* [emptyTrash](docs/sdks/library/README.md#emptytrash) - Empty section trash
* [getSectionFilters](docs/sdks/library/README.md#getsectionfilters) - Get section filters
* [getFirstCharacters](docs/sdks/library/README.md#getfirstcharacters) - Get list of first characters
* [deleteIndexes](docs/sdks/library/README.md#deleteindexes) - Delete section indexes
* [deleteIntros](docs/sdks/library/README.md#deleteintros) - Delete section intro markers
* [getSectionPreferences](docs/sdks/library/README.md#getsectionpreferences) - Get section prefs
* [setSectionPreferences](docs/sdks/library/README.md#setsectionpreferences) - Set section prefs
* [cancelRefresh](docs/sdks/library/README.md#cancelrefresh) - Cancel section refresh
* [refreshSection](docs/sdks/library/README.md#refreshsection) - Refresh section
* [getAvailableSorts](docs/sdks/library/README.md#getavailablesorts) - Get a section sorts
* [getStreamLevels](docs/sdks/library/README.md#getstreamlevels) - Get loudness about a stream in json
* [getStreamLoudness](docs/sdks/library/README.md#getstreamloudness) - Get loudness about a stream
* [getChapterImage](docs/sdks/library/README.md#getchapterimage) - Get a chapter image
* [setItemArtwork](docs/sdks/library/README.md#setitemartwork) - Set an item's artwork, theme, etc
* [updateItemArtwork](docs/sdks/library/README.md#updateitemartwork) - Set an item's artwork, theme, etc
* [deleteMarker](docs/sdks/library/README.md#deletemarker) - Delete a marker
* [editMarker](docs/sdks/library/README.md#editmarker) - Edit a marker
* [deleteMediaItem](docs/sdks/library/README.md#deletemediaitem) - Delete a media item
* [getPartIndex](docs/sdks/library/README.md#getpartindex) - Get BIF index for a part
* [deleteCollection](docs/sdks/library/README.md#deletecollection) - Delete a collection
* [getSectionImage](docs/sdks/library/README.md#getsectionimage) - Get a section composite image
* [deleteStream](docs/sdks/library/README.md#deletestream) - Delete a stream
* [getStream](docs/sdks/library/README.md#getstream) - Get a stream
* [setStreamOffset](docs/sdks/library/README.md#setstreamoffset) - Set a stream offset
* [getItemArtwork](docs/sdks/library/README.md#getitemartwork) - Get an item's artwork, theme, etc
* [getMediaPart](docs/sdks/library/README.md#getmediapart) - Get a media part
* [getImageFromBif](docs/sdks/library/README.md#getimagefrombif) - Get an image from part BIF

### [libraryCollections()](docs/sdks/librarycollections/README.md)

* [addCollectionItems](docs/sdks/librarycollections/README.md#addcollectionitems) - Add items to a collection
* [deleteCollectionItem](docs/sdks/librarycollections/README.md#deletecollectionitem) - Delete an item from a collection
* [moveCollectionItem](docs/sdks/librarycollections/README.md#movecollectionitem) - Reorder an item in the collection

### [libraryPlaylists()](docs/sdks/libraryplaylists/README.md)

* [createPlaylist](docs/sdks/libraryplaylists/README.md#createplaylist) - Create a Playlist
* [uploadPlaylist](docs/sdks/libraryplaylists/README.md#uploadplaylist) - Upload
* [deletePlaylist](docs/sdks/libraryplaylists/README.md#deleteplaylist) - Delete a Playlist
* [updatePlaylist](docs/sdks/libraryplaylists/README.md#updateplaylist) - Editing a Playlist
* [getPlaylistGenerators](docs/sdks/libraryplaylists/README.md#getplaylistgenerators) - Get a playlist's generators
* [clearPlaylistItems](docs/sdks/libraryplaylists/README.md#clearplaylistitems) - Clearing a playlist
* [addPlaylistItems](docs/sdks/libraryplaylists/README.md#addplaylistitems) - Adding to  a Playlist
* [deletePlaylistItem](docs/sdks/libraryplaylists/README.md#deleteplaylistitem) - Delete a Generator
* [getPlaylistGenerator](docs/sdks/libraryplaylists/README.md#getplaylistgenerator) - Get a playlist generator
* [getPlaylistGeneratorItems](docs/sdks/libraryplaylists/README.md#getplaylistgeneratoritems) - Get a playlist generator's items
* [movePlaylistItem](docs/sdks/libraryplaylists/README.md#moveplaylistitem) - Moving items in a playlist
* [refreshPlaylist](docs/sdks/libraryplaylists/README.md#refreshplaylist) - Reprocess a generator

### [liveTV()](docs/sdks/livetv/README.md)

* [getSessions](docs/sdks/livetv/README.md#getsessions) - Get all sessions
* [getLiveTVSession](docs/sdks/livetv/README.md#getlivetvsession) - Get a single session
* [getSessionPlaylistIndex](docs/sdks/livetv/README.md#getsessionplaylistindex) - Get a session playlist index
* [getSessionSegment](docs/sdks/livetv/README.md#getsessionsegment) - Get a single session segment

### [log()](docs/sdks/log/README.md)

* [writeLog](docs/sdks/log/README.md#writelog) - Logging a multi-line message to the Plex Media Server log
* [writeMessage](docs/sdks/log/README.md#writemessage) - Logging a single-line message to the Plex Media Server log
* [enablePapertrail](docs/sdks/log/README.md#enablepapertrail) - Enabling Papertrail

### [playlist()](docs/sdks/playlist/README.md)

* [listPlaylists](docs/sdks/playlist/README.md#listplaylists) - List playlists
* [getPlaylist](docs/sdks/playlist/README.md#getplaylist) - Retrieve Playlist
* [getPlaylistItems](docs/sdks/playlist/README.md#getplaylistitems) - Retrieve Playlist Contents

### [playQueue()](docs/sdks/playqueue/README.md)

* [createPlayQueue](docs/sdks/playqueue/README.md#createplayqueue) - Create a play queue
* [getPlayQueue](docs/sdks/playqueue/README.md#getplayqueue) - Retrieve a play queue
* [addToPlayQueue](docs/sdks/playqueue/README.md#addtoplayqueue) - Add a generator or playlist to a play queue
* [clearPlayQueue](docs/sdks/playqueue/README.md#clearplayqueue) - Clear a play queue
* [resetPlayQueue](docs/sdks/playqueue/README.md#resetplayqueue) - Reset a play queue
* [shuffle](docs/sdks/playqueue/README.md#shuffle) - Shuffle a play queue
* [unshuffle](docs/sdks/playqueue/README.md#unshuffle) - Unshuffle a play queue
* [deletePlayQueueItem](docs/sdks/playqueue/README.md#deleteplayqueueitem) - Delete an item from a play queue
* [movePlayQueueItem](docs/sdks/playqueue/README.md#moveplayqueueitem) - Move an item in a play queue


### [preferences()](docs/sdks/preferences/README.md)

* [getAllPreferences](docs/sdks/preferences/README.md#getallpreferences) - Get all preferences
* [setPreferences](docs/sdks/preferences/README.md#setpreferences) - Set preferences
* [getPreference](docs/sdks/preferences/README.md#getpreference) - Get a preferences

### [provider()](docs/sdks/provider/README.md)

* [listProviders](docs/sdks/provider/README.md#listproviders) - Get the list of available media providers
* [addProvider](docs/sdks/provider/README.md#addprovider) - Add a media provider
* [refreshProviders](docs/sdks/provider/README.md#refreshproviders) - Refresh media providers
* [deleteMediaProvider](docs/sdks/provider/README.md#deletemediaprovider) - Delete a media provider

### [rate()](docs/sdks/rate/README.md)

* [setRating](docs/sdks/rate/README.md#setrating) - Rate an item

### [search()](docs/sdks/search/README.md)

* [searchHubs](docs/sdks/search/README.md#searchhubs) - Search Hub
* [voiceSearchHubs](docs/sdks/search/README.md#voicesearchhubs) - Voice Search Hub

### [status()](docs/sdks/status/README.md)

* [listSessions](docs/sdks/status/README.md#listsessions) - List Sessions
* [getBackgroundTasks](docs/sdks/status/README.md#getbackgroundtasks) - Get background tasks
* [listPlaybackHistory](docs/sdks/status/README.md#listplaybackhistory) - List Playback History
* [terminateSession](docs/sdks/status/README.md#terminatesession) - Terminate a session
* [deleteHistory](docs/sdks/status/README.md#deletehistory) - Delete Single History Item
* [getHistoryItem](docs/sdks/status/README.md#gethistoryitem) - Get Single History Item

### [subscriptions()](docs/sdks/subscriptions/README.md)

* [getAllSubscriptions](docs/sdks/subscriptions/README.md#getallsubscriptions) - Get all subscriptions
* [createSubscription](docs/sdks/subscriptions/README.md#createsubscription) - Create a subscription
* [processSubscriptions](docs/sdks/subscriptions/README.md#processsubscriptions) - Process all subscriptions
* [getScheduledRecordings](docs/sdks/subscriptions/README.md#getscheduledrecordings) - Get all scheduled recordings
* [getTemplate](docs/sdks/subscriptions/README.md#gettemplate) - Get the subscription template
* [cancelGrab](docs/sdks/subscriptions/README.md#cancelgrab) - Cancel an existing grab
* [deleteSubscription](docs/sdks/subscriptions/README.md#deletesubscription) - Delete a subscription
* [getSubscription](docs/sdks/subscriptions/README.md#getsubscription) - Get a single subscription
* [editSubscriptionPreferences](docs/sdks/subscriptions/README.md#editsubscriptionpreferences) - Edit a subscription
* [reorderSubscription](docs/sdks/subscriptions/README.md#reordersubscription) - Re-order a subscription

### [timeline()](docs/sdks/timeline/README.md)

* [markPlayed](docs/sdks/timeline/README.md#markplayed) - Mark an item as played
* [report](docs/sdks/timeline/README.md#report) - Report media timeline
* [unscrobble](docs/sdks/timeline/README.md#unscrobble) - Mark an item as unplayed

### [transcoder()](docs/sdks/transcoder/README.md)

* [transcodeImage](docs/sdks/transcoder/README.md#transcodeimage) - Transcode an image
* [makeDecision](docs/sdks/transcoder/README.md#makedecision) - Make a decision on media playback
* [triggerFallback](docs/sdks/transcoder/README.md#triggerfallback) - Manually trigger a transcoder fallback
* [transcodeSubtitles](docs/sdks/transcoder/README.md#transcodesubtitles) - Transcode subtitles
* [startTranscodeSession](docs/sdks/transcoder/README.md#starttranscodesession) - Start A Transcoding Session

### [ultraBlur()](docs/sdks/ultrablur/README.md)

* [getColors](docs/sdks/ultrablur/README.md#getcolors) - Get UltraBlur Colors
* [getImage](docs/sdks/ultrablur/README.md#getimage) - Get UltraBlur Image

### [updater()](docs/sdks/updater/README.md)

* [applyUpdates](docs/sdks/updater/README.md#applyupdates) - Applying updates
* [checkUpdates](docs/sdks/updater/README.md#checkupdates) - Checking for updates
* [getUpdatesStatus](docs/sdks/updater/README.md#getupdatesstatus) - Querying status of updates

</details>
<!-- End Available Resources and Operations [operations] -->

<!-- Start Error Handling [errors] -->
## Error Handling

Handling errors in this SDK should largely match your expectations. All operations return a response object or raise an exception.

By default, an API error will throw a `models/errors/SDKError` exception. When custom error responses are specified for an operation, the SDK may also throw their associated exception. You can refer to respective *Errors* tables in SDK docs for more details on possible exception types for each operation. For example, the `getServerInfo` method throws the following exceptions:

| Error Type             | Status Code | Content Type |
| ---------------------- | ----------- | ------------ |
| models/errors/SDKError | 4XX, 5XX    | \*/\*        |

### Example

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetServerInfoRequest;
import dev.plexapi.sdk.models.operations.GetServerInfoResponse;
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

        GetServerInfoRequest req = GetServerInfoRequest.builder()
                .build();

        GetServerInfoResponse res = sdk.general().getServerInfo()
                .request(req)
                .call();

        if (res.mediaContainerWithDirectory().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Error Handling [errors] -->

<!-- Start Server Selection [server] -->
## Server Selection

### Select Server by Index

You can override the default server globally using the `.serverIndex(int serverIdx)` builder method when initializing the SDK client instance. The selected server will then be used as the default on the operations that use it. This table lists the indexes associated with the available servers:

| #   | Server                                                     | Variables                                    | Description |
| --- | ---------------------------------------------------------- | -------------------------------------------- | ----------- |
| 0   | `https://{IP-description}.{identifier}.plex.direct:{port}` | `identifier`<br/>`IP-description`<br/>`port` |             |
| 1   | `{protocol}://{host}:{port}`                               | `protocol`<br/>`host`<br/>`port`             |             |
| 2   | `https://{full_server_url}`                                | `full_server_url`                            |             |

If the selected server has variables, you may override its default values using the associated builder method(s):

| Variable          | BuilderMethod                         | Default                              | Description                                                                                                                                                                                                                                                                                                                                                                          |
| ----------------- | ------------------------------------- | ------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `identifier`      | `identifier(String identifier)`       | `"0123456789abcdef0123456789abcdef"` | The unique identifier of this particular PMS                                                                                                                                                                                                                                                                                                                                         |
| `IP-description`  | `ipDescription(String ipDescription)` | `"1-2-3-4"`                          | A `-` separated string of the IPv4 or IPv6 address components                                                                                                                                                                                                                                                                                                                        |
| `port`            | `port(String port)`                   | `"32400"`                            | The Port number configured on the PMS. Typically (`32400`). <br/>If using a reverse proxy, this would be the port number configured on the proxy.<br/>                                                                                                                                                                                                                               |
| `protocol`        | `protocol(String protocol)`           | `"http"`                             | The network protocol to use. Typically (`http` or `https`)                                                                                                                                                                                                                                                                                                                           |
| `host`            | `host(String host)`                   | `"localhost"`                        | The Host of the PMS.<br/>If using on a local network, this is the internal IP address of the server hosting the PMS.<br/>If using on an external network, this is the external IP address for your network, and requires port forwarding.<br/>If using a reverse proxy, this would be the external DNS domain for your network, and requires the proxy handle port forwarding. <br/> |
| `full_server_url` | `fullServerUrl(String fullServerUrl)` | `"http://localhost:32400"`           | The full manual URL to access the PMS                                                                                                                                                                                                                                                                                                                                                |

#### Example

```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetServerInfoRequest;
import dev.plexapi.sdk.models.operations.GetServerInfoResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .serverIndex(1)
                .protocol("<value>")
                .host("electric-excess.name")
                .port("36393")
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

        GetServerInfoRequest req = GetServerInfoRequest.builder()
                .build();

        GetServerInfoResponse res = sdk.general().getServerInfo()
                .request(req)
                .call();

        if (res.mediaContainerWithDirectory().isPresent()) {
            // handle response
        }
    }
}
```

### Override Server URL Per-Client

The default server can also be overridden globally using the `.serverURL(String serverUrl)` builder method when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetServerInfoRequest;
import dev.plexapi.sdk.models.operations.GetServerInfoResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .serverURL("https://http://localhost:32400")
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

        GetServerInfoRequest req = GetServerInfoRequest.builder()
                .build();

        GetServerInfoResponse res = sdk.general().getServerInfo()
                .request(req)
                .call();

        if (res.mediaContainerWithDirectory().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Server Selection [server] -->

<!-- Start Asynchronous Support [async-support] -->
## Asynchronous Support

The SDK provides comprehensive asynchronous support using Java's [`CompletableFuture<T>`][comp-fut] and [Reactive Streams `Publisher<T>`][reactive-streams] APIs. This design makes no assumptions about your choice of reactive toolkit, allowing seamless integration with any reactive library.

<details>
<summary>Why Use Async?</summary>

Asynchronous operations provide several key benefits:

- **Non-blocking I/O**: Your threads stay free for other work while operations are in flight
- **Better resource utilization**: Handle more concurrent operations with fewer threads
- **Improved scalability**: Build highly responsive applications that can handle thousands of concurrent requests
- **Reactive integration**: Works seamlessly with reactive streams and backpressure handling

</details>

<details>
<summary>Reactive Library Integration</summary>

The SDK returns [Reactive Streams `Publisher<T>`][reactive-streams] instances for operations dealing with streams involving multiple I/O interactions. We use Reactive Streams instead of JDK Flow API to provide broader compatibility with the reactive ecosystem, as most reactive libraries natively support Reactive Streams.

**Why Reactive Streams over JDK Flow?**
- **Broader ecosystem compatibility**: Most reactive libraries (Project Reactor, RxJava, Akka Streams, etc.) natively support Reactive Streams
- **Industry standard**: Reactive Streams is the de facto standard for reactive programming in Java
- **Better interoperability**: Seamless integration without additional adapters for most use cases

**Integration with Popular Libraries:**
- **Project Reactor**: Use `Flux.from(publisher)` to convert to Reactor types
- **RxJava**: Use `Flowable.fromPublisher(publisher)` for RxJava integration
- **Akka Streams**: Use `Source.fromPublisher(publisher)` for Akka Streams integration
- **Vert.x**: Use `ReadStream.fromPublisher(vertx, publisher)` for Vert.x reactive streams
- **Mutiny**: Use `Multi.createFrom().publisher(publisher)` for Quarkus Mutiny integration

**For JDK Flow API Integration:**
If you need JDK Flow API compatibility (e.g., for Quarkus/Mutiny 2), you can use adapters:
```java
// Convert Reactive Streams Publisher to Flow Publisher
Flow.Publisher<T> flowPublisher = FlowAdapters.toFlowPublisher(reactiveStreamsPublisher);

// Convert Flow Publisher to Reactive Streams Publisher
Publisher<T> reactiveStreamsPublisher = FlowAdapters.toPublisher(flowPublisher);
```

For standard single-response operations, the SDK returns `CompletableFuture<T>` for straightforward async execution.

</details>

<details>
<summary>Supported Operations</summary>

Async support is available for:

- **[Server-sent Events](#server-sent-event-streaming)**: Stream real-time events with Reactive Streams `Publisher<T>`
- **[JSONL Streaming](#jsonl-streaming)**: Process streaming JSON lines asynchronously
- **[Pagination](#pagination)**: Iterate through paginated results using `callAsPublisher()` and `callAsPublisherUnwrapped()`
- **[File Uploads](#file-uploads)**: Upload files asynchronously with progress tracking
- **[File Downloads](#file-downloads)**: Download files asynchronously with streaming support
- **[Standard Operations](#example)**: All regular API calls return `CompletableFuture<T>` for async execution

</details>

[comp-fut]: https://docs.oracle.com/javase/8/docs/api/java/util/concurrent/CompletableFuture.html
[reactive-streams]: https://www.reactive-streams.org/
<!-- End Asynchronous Support [async-support] -->

<!-- Start Authentication [security] -->
## Authentication

### Per-Client Security Schemes

This SDK supports the following security scheme globally:

| Name    | Type   | Scheme  |
| ------- | ------ | ------- |
| `token` | apiKey | API key |

To authenticate with the API the `token` parameter must be set when initializing the SDK client instance. For example:
```java
package hello.world;

import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.models.operations.GetServerInfoRequest;
import dev.plexapi.sdk.models.operations.GetServerInfoResponse;
import dev.plexapi.sdk.models.shared.Accepts;
import java.lang.Exception;

public class Application {

    public static void main(String[] args) throws Exception {

        PlexAPI sdk = PlexAPI.builder()
                .token(System.getenv().getOrDefault("TOKEN", ""))
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
            .build();

        GetServerInfoRequest req = GetServerInfoRequest.builder()
                .build();

        GetServerInfoResponse res = sdk.general().getServerInfo()
                .request(req)
                .call();

        if (res.mediaContainerWithDirectory().isPresent()) {
            // handle response
        }
    }
}
```
<!-- End Authentication [security] -->

<!-- Start Custom HTTP Client [http-client] -->
## Custom HTTP Client

The Java SDK makes API calls using an `HTTPClient` that wraps the native
[HttpClient](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpClient.html). This
client provides the ability to attach hooks around the request lifecycle that can be used to modify the request or handle
errors and response.

The `HTTPClient` interface allows you to either use the default `SpeakeasyHTTPClient` that comes with the SDK,
or provide your own custom implementation with customized configuration such as custom executors, SSL context,
connection pools, and other HTTP client settings.

The interface provides synchronous (`send`) methods and asynchronous (`sendAsync`) methods. The `sendAsync` method
is used to power the async SDK methods and returns a `CompletableFuture<HttpResponse<Blob>>` for non-blocking operations.

The following example shows how to add a custom header and handle errors:

```java
import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.utils.HTTPClient;
import dev.plexapi.sdk.utils.SpeakeasyHTTPClient;
import dev.plexapi.sdk.utils.Utils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;

public class Application {
    public static void main(String[] args) {
        // Create a custom HTTP client with hooks
        HTTPClient httpClient = new HTTPClient() {
            private final HTTPClient defaultClient = new SpeakeasyHTTPClient();
            
            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                // Add custom header and timeout using Utils.copy()
                HttpRequest modifiedRequest = Utils.copy(request)
                    .header("x-custom-header", "custom value")
                    .timeout(Duration.ofSeconds(30))
                    .build();
                    
                try {
                    HttpResponse<InputStream> response = defaultClient.send(modifiedRequest);
                    // Log successful response
                    System.out.println("Request successful: " + response.statusCode());
                    return response;
                } catch (Exception error) {
                    // Log error
                    System.err.println("Request failed: " + error.getMessage());
                    throw error;
                }
            }
        };

        PlexAPI sdk = PlexAPI.builder()
            .client(httpClient)
            .build();
    }
}
```

<details>
<summary>Custom HTTP Client Configuration</summary>

You can also provide a completely custom HTTP client with your own configuration:

```java
import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.utils.HTTPClient;
import dev.plexapi.sdk.utils.Blob;
import dev.plexapi.sdk.utils.ResponseWithBody;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.InputStream;
import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.CompletableFuture;

public class Application {
    public static void main(String[] args) {
        // Custom HTTP client with custom configuration
        HTTPClient customHttpClient = new HTTPClient() {
            private final HttpClient client = HttpClient.newBuilder()
                .executor(Executors.newFixedThreadPool(10))
                .connectTimeout(Duration.ofSeconds(30))
                // .sslContext(customSslContext) // Add custom SSL context if needed
                .build();

            @Override
            public HttpResponse<InputStream> send(HttpRequest request) throws IOException, URISyntaxException, InterruptedException {
                return client.send(request, HttpResponse.BodyHandlers.ofInputStream());
            }

            @Override
            public CompletableFuture<HttpResponse<Blob>> sendAsync(HttpRequest request) {
                // Convert response to HttpResponse<Blob> for async operations
                return client.sendAsync(request, HttpResponse.BodyHandlers.ofPublisher())
                    .thenApply(resp -> new ResponseWithBody<>(resp, Blob::from));
            }
        };

        PlexAPI sdk = PlexAPI.builder()
            .client(customHttpClient)
            .build();
    }
}
```

</details>

You can also enable debug logging on the default `SpeakeasyHTTPClient`:

```java
import dev.plexapi.sdk.PlexAPI;
import dev.plexapi.sdk.utils.SpeakeasyHTTPClient;

public class Application {
    public static void main(String[] args) {
        SpeakeasyHTTPClient httpClient = new SpeakeasyHTTPClient();
        httpClient.enableDebugLogging(true);

        PlexAPI sdk = PlexAPI.builder()
            .client(httpClient)
            .build();
    }
}
```
<!-- End Custom HTTP Client [http-client] -->

<!-- Start Debugging [debug] -->
## Debugging

### Debug
You can setup your SDK to emit debug logs for SDK requests and responses.

For request and response logging (especially json bodies), call `enableHTTPDebugLogging(boolean)` on the SDK builder like so:
```java
SDK.builder()
    .enableHTTPDebugLogging(true)
    .build();
```
Example output:
```
Sending request: http://localhost:35123/bearer#global GET
Request headers: {Accept=[application/json], Authorization=[******], Client-Level-Header=[added by client], Idempotency-Key=[some-key], x-speakeasy-user-agent=[speakeasy-sdk/java 0.0.1 internal 0.1.0 org.openapis.openapi]}
Received response: (GET http://localhost:35123/bearer#global) 200
Response headers: {access-control-allow-credentials=[true], access-control-allow-origin=[*], connection=[keep-alive], content-length=[50], content-type=[application/json], date=[Wed, 09 Apr 2025 01:43:29 GMT], server=[gunicorn/19.9.0]}
Response body:
{
  "authenticated": true, 
  "token": "global"
}
```
__WARNING__: This should only used for temporary debugging purposes. Leaving this option on in a production system could expose credentials/secrets in logs. <i>Authorization</i> headers are redacted by default and there is the ability to specify redacted header names via `SpeakeasyHTTPClient.setRedactedHeaders`.

__NOTE__: This is a convenience method that calls `HTTPClient.enableDebugLogging()`. The `SpeakeasyHTTPClient` honors this setting. If you are using a custom HTTP client, it is up to the custom client to honor this setting.

Another option is to set the System property `-Djdk.httpclient.HttpClient.log=all`. However, this second option does not log bodies.
<!-- End Debugging [debug] -->

<!-- Placeholder for Future Speakeasy SDK Sections -->

# Development

## Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

## Contributions

While we value open-source contributions to this SDK, this library is generated programmatically. Any manual changes added to internal files will be overwritten on the next generation. 
We look forward to hearing your feedback. Feel free to open a PR or an issue with a proof of concept and we'll do our best to include it in a future release. 

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
