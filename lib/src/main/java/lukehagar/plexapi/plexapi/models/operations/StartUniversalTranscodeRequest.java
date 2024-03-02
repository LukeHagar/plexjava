/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;


public class StartUniversalTranscodeRequest {
    /**
     * Whether the media item has MDE
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=hasMDE")
    public Double hasMDE;

    public StartUniversalTranscodeRequest withHasMDE(Double hasMDE) {
        this.hasMDE = hasMDE;
        return this;
    }
    
    /**
     * The path to the media item to transcode
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=path")
    public String path;

    public StartUniversalTranscodeRequest withPath(String path) {
        this.path = path;
        return this;
    }
    
    /**
     * The index of the media item to transcode
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mediaIndex")
    public Double mediaIndex;

    public StartUniversalTranscodeRequest withMediaIndex(Double mediaIndex) {
        this.mediaIndex = mediaIndex;
        return this;
    }
    
    /**
     * The index of the part to transcode
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=partIndex")
    public Double partIndex;

    public StartUniversalTranscodeRequest withPartIndex(Double partIndex) {
        this.partIndex = partIndex;
        return this;
    }
    
    /**
     * The protocol to use for the transcode session
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=protocol")
    public String protocol;

    public StartUniversalTranscodeRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    /**
     * Whether to use fast seek or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fastSeek")
    public Double fastSeek;

    public StartUniversalTranscodeRequest withFastSeek(Double fastSeek) {
        this.fastSeek = fastSeek;
        return this;
    }
    
    /**
     * Whether to use direct play or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=directPlay")
    public Double directPlay;

    public StartUniversalTranscodeRequest withDirectPlay(Double directPlay) {
        this.directPlay = directPlay;
        return this;
    }
    
    /**
     * Whether to use direct stream or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=directStream")
    public Double directStream;

    public StartUniversalTranscodeRequest withDirectStream(Double directStream) {
        this.directStream = directStream;
        return this;
    }
    
    /**
     * The size of the subtitles
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subtitleSize")
    public Double subtitleSize;

    public StartUniversalTranscodeRequest withSubtitleSize(Double subtitleSize) {
        this.subtitleSize = subtitleSize;
        return this;
    }
    
    /**
     * The subtitles
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subtites")
    public String subtites;

    public StartUniversalTranscodeRequest withSubtites(String subtites) {
        this.subtites = subtites;
        return this;
    }
    
    /**
     * The audio boost
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=audioBoost")
    public Double audioBoost;

    public StartUniversalTranscodeRequest withAudioBoost(Double audioBoost) {
        this.audioBoost = audioBoost;
        return this;
    }
    
    /**
     * The location of the transcode session
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=location")
    public String location;

    public StartUniversalTranscodeRequest withLocation(String location) {
        this.location = location;
        return this;
    }
    
    /**
     * The size of the media buffer
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mediaBufferSize")
    public Double mediaBufferSize;

    public StartUniversalTranscodeRequest withMediaBufferSize(Double mediaBufferSize) {
        this.mediaBufferSize = mediaBufferSize;
        return this;
    }
    
    /**
     * The session ID
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=session")
    public String session;

    public StartUniversalTranscodeRequest withSession(String session) {
        this.session = session;
        return this;
    }
    
    /**
     * Whether to add a debug overlay or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=addDebugOverlay")
    public Double addDebugOverlay;

    public StartUniversalTranscodeRequest withAddDebugOverlay(Double addDebugOverlay) {
        this.addDebugOverlay = addDebugOverlay;
        return this;
    }
    
    /**
     * Whether to auto adjust quality or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=autoAdjustQuality")
    public Double autoAdjustQuality;

    public StartUniversalTranscodeRequest withAutoAdjustQuality(Double autoAdjustQuality) {
        this.autoAdjustQuality = autoAdjustQuality;
        return this;
    }
    
    public StartUniversalTranscodeRequest(@JsonProperty("hasMDE") Double hasMDE, @JsonProperty("path") String path, @JsonProperty("mediaIndex") Double mediaIndex, @JsonProperty("partIndex") Double partIndex, @JsonProperty("protocol") String protocol) {
        this.hasMDE = hasMDE;
        this.path = path;
        this.mediaIndex = mediaIndex;
        this.partIndex = partIndex;
        this.protocol = protocol;
  }
}