<!-- Start SDK Example Usage [usage] -->
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
                .autoAdjustQuality(BoolInt.True)
                .autoAdjustSubtitle(BoolInt.True)
                .directPlay(BoolInt.True)
                .directStream(BoolInt.True)
                .directStreamAudio(BoolInt.True)
                .disableResolutionRotation(BoolInt.True)
                .hasMDE(BoolInt.True)
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
<!-- End SDK Example Usage [usage] -->