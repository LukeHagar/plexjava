/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class StartUniversalTranscodeRequest {

    /**
     * Whether the media item has MDE
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=hasMDE")
    private double hasMDE;

    /**
     * The path to the media item to transcode
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=path")
    private String path;

    /**
     * The index of the media item to transcode
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mediaIndex")
    private double mediaIndex;

    /**
     * The index of the part to transcode
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=partIndex")
    private double partIndex;

    /**
     * The protocol to use for the transcode session
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=protocol")
    private String protocol;

    /**
     * Whether to use fast seek or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=fastSeek")
    private Optional<? extends Double> fastSeek;

    /**
     * Whether to use direct play or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=directPlay")
    private Optional<? extends Double> directPlay;

    /**
     * Whether to use direct stream or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=directStream")
    private Optional<? extends Double> directStream;

    /**
     * The size of the subtitles
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subtitleSize")
    private Optional<? extends Double> subtitleSize;

    /**
     * The subtitles
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=subtites")
    private Optional<? extends String> subtites;

    /**
     * The audio boost
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=audioBoost")
    private Optional<? extends Double> audioBoost;

    /**
     * The location of the transcode session
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=location")
    private Optional<? extends String> location;

    /**
     * The size of the media buffer
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=mediaBufferSize")
    private Optional<? extends Double> mediaBufferSize;

    /**
     * The session ID
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=session")
    private Optional<? extends String> session;

    /**
     * Whether to add a debug overlay or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=addDebugOverlay")
    private Optional<? extends Double> addDebugOverlay;

    /**
     * Whether to auto adjust quality or not
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=autoAdjustQuality")
    private Optional<? extends Double> autoAdjustQuality;

    @JsonCreator
    public StartUniversalTranscodeRequest(
            double hasMDE,
            String path,
            double mediaIndex,
            double partIndex,
            String protocol,
            Optional<? extends Double> fastSeek,
            Optional<? extends Double> directPlay,
            Optional<? extends Double> directStream,
            Optional<? extends Double> subtitleSize,
            Optional<? extends String> subtites,
            Optional<? extends Double> audioBoost,
            Optional<? extends String> location,
            Optional<? extends Double> mediaBufferSize,
            Optional<? extends String> session,
            Optional<? extends Double> addDebugOverlay,
            Optional<? extends Double> autoAdjustQuality) {
        Utils.checkNotNull(hasMDE, "hasMDE");
        Utils.checkNotNull(path, "path");
        Utils.checkNotNull(mediaIndex, "mediaIndex");
        Utils.checkNotNull(partIndex, "partIndex");
        Utils.checkNotNull(protocol, "protocol");
        Utils.checkNotNull(fastSeek, "fastSeek");
        Utils.checkNotNull(directPlay, "directPlay");
        Utils.checkNotNull(directStream, "directStream");
        Utils.checkNotNull(subtitleSize, "subtitleSize");
        Utils.checkNotNull(subtites, "subtites");
        Utils.checkNotNull(audioBoost, "audioBoost");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(mediaBufferSize, "mediaBufferSize");
        Utils.checkNotNull(session, "session");
        Utils.checkNotNull(addDebugOverlay, "addDebugOverlay");
        Utils.checkNotNull(autoAdjustQuality, "autoAdjustQuality");
        this.hasMDE = hasMDE;
        this.path = path;
        this.mediaIndex = mediaIndex;
        this.partIndex = partIndex;
        this.protocol = protocol;
        this.fastSeek = fastSeek;
        this.directPlay = directPlay;
        this.directStream = directStream;
        this.subtitleSize = subtitleSize;
        this.subtites = subtites;
        this.audioBoost = audioBoost;
        this.location = location;
        this.mediaBufferSize = mediaBufferSize;
        this.session = session;
        this.addDebugOverlay = addDebugOverlay;
        this.autoAdjustQuality = autoAdjustQuality;
    }
    
    public StartUniversalTranscodeRequest(
            double hasMDE,
            String path,
            double mediaIndex,
            double partIndex,
            String protocol) {
        this(hasMDE, path, mediaIndex, partIndex, protocol, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Whether the media item has MDE
     */
    @JsonIgnore
    public double hasMDE() {
        return hasMDE;
    }

    /**
     * The path to the media item to transcode
     */
    @JsonIgnore
    public String path() {
        return path;
    }

    /**
     * The index of the media item to transcode
     */
    @JsonIgnore
    public double mediaIndex() {
        return mediaIndex;
    }

    /**
     * The index of the part to transcode
     */
    @JsonIgnore
    public double partIndex() {
        return partIndex;
    }

    /**
     * The protocol to use for the transcode session
     */
    @JsonIgnore
    public String protocol() {
        return protocol;
    }

    /**
     * Whether to use fast seek or not
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> fastSeek() {
        return (Optional<Double>) fastSeek;
    }

    /**
     * Whether to use direct play or not
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> directPlay() {
        return (Optional<Double>) directPlay;
    }

    /**
     * Whether to use direct stream or not
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> directStream() {
        return (Optional<Double>) directStream;
    }

    /**
     * The size of the subtitles
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> subtitleSize() {
        return (Optional<Double>) subtitleSize;
    }

    /**
     * The subtitles
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> subtites() {
        return (Optional<String>) subtites;
    }

    /**
     * The audio boost
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> audioBoost() {
        return (Optional<Double>) audioBoost;
    }

    /**
     * The location of the transcode session
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> location() {
        return (Optional<String>) location;
    }

    /**
     * The size of the media buffer
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> mediaBufferSize() {
        return (Optional<Double>) mediaBufferSize;
    }

    /**
     * The session ID
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> session() {
        return (Optional<String>) session;
    }

    /**
     * Whether to add a debug overlay or not
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> addDebugOverlay() {
        return (Optional<Double>) addDebugOverlay;
    }

    /**
     * Whether to auto adjust quality or not
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> autoAdjustQuality() {
        return (Optional<Double>) autoAdjustQuality;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Whether the media item has MDE
     */
    public StartUniversalTranscodeRequest withHasMDE(double hasMDE) {
        Utils.checkNotNull(hasMDE, "hasMDE");
        this.hasMDE = hasMDE;
        return this;
    }

    /**
     * The path to the media item to transcode
     */
    public StartUniversalTranscodeRequest withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
        return this;
    }

    /**
     * The index of the media item to transcode
     */
    public StartUniversalTranscodeRequest withMediaIndex(double mediaIndex) {
        Utils.checkNotNull(mediaIndex, "mediaIndex");
        this.mediaIndex = mediaIndex;
        return this;
    }

    /**
     * The index of the part to transcode
     */
    public StartUniversalTranscodeRequest withPartIndex(double partIndex) {
        Utils.checkNotNull(partIndex, "partIndex");
        this.partIndex = partIndex;
        return this;
    }

    /**
     * The protocol to use for the transcode session
     */
    public StartUniversalTranscodeRequest withProtocol(String protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = protocol;
        return this;
    }

    /**
     * Whether to use fast seek or not
     */
    public StartUniversalTranscodeRequest withFastSeek(double fastSeek) {
        Utils.checkNotNull(fastSeek, "fastSeek");
        this.fastSeek = Optional.ofNullable(fastSeek);
        return this;
    }

    /**
     * Whether to use fast seek or not
     */
    public StartUniversalTranscodeRequest withFastSeek(Optional<? extends Double> fastSeek) {
        Utils.checkNotNull(fastSeek, "fastSeek");
        this.fastSeek = fastSeek;
        return this;
    }

    /**
     * Whether to use direct play or not
     */
    public StartUniversalTranscodeRequest withDirectPlay(double directPlay) {
        Utils.checkNotNull(directPlay, "directPlay");
        this.directPlay = Optional.ofNullable(directPlay);
        return this;
    }

    /**
     * Whether to use direct play or not
     */
    public StartUniversalTranscodeRequest withDirectPlay(Optional<? extends Double> directPlay) {
        Utils.checkNotNull(directPlay, "directPlay");
        this.directPlay = directPlay;
        return this;
    }

    /**
     * Whether to use direct stream or not
     */
    public StartUniversalTranscodeRequest withDirectStream(double directStream) {
        Utils.checkNotNull(directStream, "directStream");
        this.directStream = Optional.ofNullable(directStream);
        return this;
    }

    /**
     * Whether to use direct stream or not
     */
    public StartUniversalTranscodeRequest withDirectStream(Optional<? extends Double> directStream) {
        Utils.checkNotNull(directStream, "directStream");
        this.directStream = directStream;
        return this;
    }

    /**
     * The size of the subtitles
     */
    public StartUniversalTranscodeRequest withSubtitleSize(double subtitleSize) {
        Utils.checkNotNull(subtitleSize, "subtitleSize");
        this.subtitleSize = Optional.ofNullable(subtitleSize);
        return this;
    }

    /**
     * The size of the subtitles
     */
    public StartUniversalTranscodeRequest withSubtitleSize(Optional<? extends Double> subtitleSize) {
        Utils.checkNotNull(subtitleSize, "subtitleSize");
        this.subtitleSize = subtitleSize;
        return this;
    }

    /**
     * The subtitles
     */
    public StartUniversalTranscodeRequest withSubtites(String subtites) {
        Utils.checkNotNull(subtites, "subtites");
        this.subtites = Optional.ofNullable(subtites);
        return this;
    }

    /**
     * The subtitles
     */
    public StartUniversalTranscodeRequest withSubtites(Optional<? extends String> subtites) {
        Utils.checkNotNull(subtites, "subtites");
        this.subtites = subtites;
        return this;
    }

    /**
     * The audio boost
     */
    public StartUniversalTranscodeRequest withAudioBoost(double audioBoost) {
        Utils.checkNotNull(audioBoost, "audioBoost");
        this.audioBoost = Optional.ofNullable(audioBoost);
        return this;
    }

    /**
     * The audio boost
     */
    public StartUniversalTranscodeRequest withAudioBoost(Optional<? extends Double> audioBoost) {
        Utils.checkNotNull(audioBoost, "audioBoost");
        this.audioBoost = audioBoost;
        return this;
    }

    /**
     * The location of the transcode session
     */
    public StartUniversalTranscodeRequest withLocation(String location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    /**
     * The location of the transcode session
     */
    public StartUniversalTranscodeRequest withLocation(Optional<? extends String> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    /**
     * The size of the media buffer
     */
    public StartUniversalTranscodeRequest withMediaBufferSize(double mediaBufferSize) {
        Utils.checkNotNull(mediaBufferSize, "mediaBufferSize");
        this.mediaBufferSize = Optional.ofNullable(mediaBufferSize);
        return this;
    }

    /**
     * The size of the media buffer
     */
    public StartUniversalTranscodeRequest withMediaBufferSize(Optional<? extends Double> mediaBufferSize) {
        Utils.checkNotNull(mediaBufferSize, "mediaBufferSize");
        this.mediaBufferSize = mediaBufferSize;
        return this;
    }

    /**
     * The session ID
     */
    public StartUniversalTranscodeRequest withSession(String session) {
        Utils.checkNotNull(session, "session");
        this.session = Optional.ofNullable(session);
        return this;
    }

    /**
     * The session ID
     */
    public StartUniversalTranscodeRequest withSession(Optional<? extends String> session) {
        Utils.checkNotNull(session, "session");
        this.session = session;
        return this;
    }

    /**
     * Whether to add a debug overlay or not
     */
    public StartUniversalTranscodeRequest withAddDebugOverlay(double addDebugOverlay) {
        Utils.checkNotNull(addDebugOverlay, "addDebugOverlay");
        this.addDebugOverlay = Optional.ofNullable(addDebugOverlay);
        return this;
    }

    /**
     * Whether to add a debug overlay or not
     */
    public StartUniversalTranscodeRequest withAddDebugOverlay(Optional<? extends Double> addDebugOverlay) {
        Utils.checkNotNull(addDebugOverlay, "addDebugOverlay");
        this.addDebugOverlay = addDebugOverlay;
        return this;
    }

    /**
     * Whether to auto adjust quality or not
     */
    public StartUniversalTranscodeRequest withAutoAdjustQuality(double autoAdjustQuality) {
        Utils.checkNotNull(autoAdjustQuality, "autoAdjustQuality");
        this.autoAdjustQuality = Optional.ofNullable(autoAdjustQuality);
        return this;
    }

    /**
     * Whether to auto adjust quality or not
     */
    public StartUniversalTranscodeRequest withAutoAdjustQuality(Optional<? extends Double> autoAdjustQuality) {
        Utils.checkNotNull(autoAdjustQuality, "autoAdjustQuality");
        this.autoAdjustQuality = autoAdjustQuality;
        return this;
    }
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartUniversalTranscodeRequest other = (StartUniversalTranscodeRequest) o;
        return 
            java.util.Objects.deepEquals(this.hasMDE, other.hasMDE) &&
            java.util.Objects.deepEquals(this.path, other.path) &&
            java.util.Objects.deepEquals(this.mediaIndex, other.mediaIndex) &&
            java.util.Objects.deepEquals(this.partIndex, other.partIndex) &&
            java.util.Objects.deepEquals(this.protocol, other.protocol) &&
            java.util.Objects.deepEquals(this.fastSeek, other.fastSeek) &&
            java.util.Objects.deepEquals(this.directPlay, other.directPlay) &&
            java.util.Objects.deepEquals(this.directStream, other.directStream) &&
            java.util.Objects.deepEquals(this.subtitleSize, other.subtitleSize) &&
            java.util.Objects.deepEquals(this.subtites, other.subtites) &&
            java.util.Objects.deepEquals(this.audioBoost, other.audioBoost) &&
            java.util.Objects.deepEquals(this.location, other.location) &&
            java.util.Objects.deepEquals(this.mediaBufferSize, other.mediaBufferSize) &&
            java.util.Objects.deepEquals(this.session, other.session) &&
            java.util.Objects.deepEquals(this.addDebugOverlay, other.addDebugOverlay) &&
            java.util.Objects.deepEquals(this.autoAdjustQuality, other.autoAdjustQuality);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            hasMDE,
            path,
            mediaIndex,
            partIndex,
            protocol,
            fastSeek,
            directPlay,
            directStream,
            subtitleSize,
            subtites,
            audioBoost,
            location,
            mediaBufferSize,
            session,
            addDebugOverlay,
            autoAdjustQuality);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StartUniversalTranscodeRequest.class,
                "hasMDE", hasMDE,
                "path", path,
                "mediaIndex", mediaIndex,
                "partIndex", partIndex,
                "protocol", protocol,
                "fastSeek", fastSeek,
                "directPlay", directPlay,
                "directStream", directStream,
                "subtitleSize", subtitleSize,
                "subtites", subtites,
                "audioBoost", audioBoost,
                "location", location,
                "mediaBufferSize", mediaBufferSize,
                "session", session,
                "addDebugOverlay", addDebugOverlay,
                "autoAdjustQuality", autoAdjustQuality);
    }
    
    public final static class Builder {
 
        private Double hasMDE;
 
        private String path;
 
        private Double mediaIndex;
 
        private Double partIndex;
 
        private String protocol;
 
        private Optional<? extends Double> fastSeek = Optional.empty();
 
        private Optional<? extends Double> directPlay = Optional.empty();
 
        private Optional<? extends Double> directStream = Optional.empty();
 
        private Optional<? extends Double> subtitleSize = Optional.empty();
 
        private Optional<? extends String> subtites = Optional.empty();
 
        private Optional<? extends Double> audioBoost = Optional.empty();
 
        private Optional<? extends String> location = Optional.empty();
 
        private Optional<? extends Double> mediaBufferSize = Optional.empty();
 
        private Optional<? extends String> session = Optional.empty();
 
        private Optional<? extends Double> addDebugOverlay = Optional.empty();
 
        private Optional<? extends Double> autoAdjustQuality = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Whether the media item has MDE
         */
        public Builder hasMDE(double hasMDE) {
            Utils.checkNotNull(hasMDE, "hasMDE");
            this.hasMDE = hasMDE;
            return this;
        }

        /**
         * The path to the media item to transcode
         */
        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }

        /**
         * The index of the media item to transcode
         */
        public Builder mediaIndex(double mediaIndex) {
            Utils.checkNotNull(mediaIndex, "mediaIndex");
            this.mediaIndex = mediaIndex;
            return this;
        }

        /**
         * The index of the part to transcode
         */
        public Builder partIndex(double partIndex) {
            Utils.checkNotNull(partIndex, "partIndex");
            this.partIndex = partIndex;
            return this;
        }

        /**
         * The protocol to use for the transcode session
         */
        public Builder protocol(String protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        /**
         * Whether to use fast seek or not
         */
        public Builder fastSeek(double fastSeek) {
            Utils.checkNotNull(fastSeek, "fastSeek");
            this.fastSeek = Optional.ofNullable(fastSeek);
            return this;
        }

        /**
         * Whether to use fast seek or not
         */
        public Builder fastSeek(Optional<? extends Double> fastSeek) {
            Utils.checkNotNull(fastSeek, "fastSeek");
            this.fastSeek = fastSeek;
            return this;
        }

        /**
         * Whether to use direct play or not
         */
        public Builder directPlay(double directPlay) {
            Utils.checkNotNull(directPlay, "directPlay");
            this.directPlay = Optional.ofNullable(directPlay);
            return this;
        }

        /**
         * Whether to use direct play or not
         */
        public Builder directPlay(Optional<? extends Double> directPlay) {
            Utils.checkNotNull(directPlay, "directPlay");
            this.directPlay = directPlay;
            return this;
        }

        /**
         * Whether to use direct stream or not
         */
        public Builder directStream(double directStream) {
            Utils.checkNotNull(directStream, "directStream");
            this.directStream = Optional.ofNullable(directStream);
            return this;
        }

        /**
         * Whether to use direct stream or not
         */
        public Builder directStream(Optional<? extends Double> directStream) {
            Utils.checkNotNull(directStream, "directStream");
            this.directStream = directStream;
            return this;
        }

        /**
         * The size of the subtitles
         */
        public Builder subtitleSize(double subtitleSize) {
            Utils.checkNotNull(subtitleSize, "subtitleSize");
            this.subtitleSize = Optional.ofNullable(subtitleSize);
            return this;
        }

        /**
         * The size of the subtitles
         */
        public Builder subtitleSize(Optional<? extends Double> subtitleSize) {
            Utils.checkNotNull(subtitleSize, "subtitleSize");
            this.subtitleSize = subtitleSize;
            return this;
        }

        /**
         * The subtitles
         */
        public Builder subtites(String subtites) {
            Utils.checkNotNull(subtites, "subtites");
            this.subtites = Optional.ofNullable(subtites);
            return this;
        }

        /**
         * The subtitles
         */
        public Builder subtites(Optional<? extends String> subtites) {
            Utils.checkNotNull(subtites, "subtites");
            this.subtites = subtites;
            return this;
        }

        /**
         * The audio boost
         */
        public Builder audioBoost(double audioBoost) {
            Utils.checkNotNull(audioBoost, "audioBoost");
            this.audioBoost = Optional.ofNullable(audioBoost);
            return this;
        }

        /**
         * The audio boost
         */
        public Builder audioBoost(Optional<? extends Double> audioBoost) {
            Utils.checkNotNull(audioBoost, "audioBoost");
            this.audioBoost = audioBoost;
            return this;
        }

        /**
         * The location of the transcode session
         */
        public Builder location(String location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        /**
         * The location of the transcode session
         */
        public Builder location(Optional<? extends String> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }

        /**
         * The size of the media buffer
         */
        public Builder mediaBufferSize(double mediaBufferSize) {
            Utils.checkNotNull(mediaBufferSize, "mediaBufferSize");
            this.mediaBufferSize = Optional.ofNullable(mediaBufferSize);
            return this;
        }

        /**
         * The size of the media buffer
         */
        public Builder mediaBufferSize(Optional<? extends Double> mediaBufferSize) {
            Utils.checkNotNull(mediaBufferSize, "mediaBufferSize");
            this.mediaBufferSize = mediaBufferSize;
            return this;
        }

        /**
         * The session ID
         */
        public Builder session(String session) {
            Utils.checkNotNull(session, "session");
            this.session = Optional.ofNullable(session);
            return this;
        }

        /**
         * The session ID
         */
        public Builder session(Optional<? extends String> session) {
            Utils.checkNotNull(session, "session");
            this.session = session;
            return this;
        }

        /**
         * Whether to add a debug overlay or not
         */
        public Builder addDebugOverlay(double addDebugOverlay) {
            Utils.checkNotNull(addDebugOverlay, "addDebugOverlay");
            this.addDebugOverlay = Optional.ofNullable(addDebugOverlay);
            return this;
        }

        /**
         * Whether to add a debug overlay or not
         */
        public Builder addDebugOverlay(Optional<? extends Double> addDebugOverlay) {
            Utils.checkNotNull(addDebugOverlay, "addDebugOverlay");
            this.addDebugOverlay = addDebugOverlay;
            return this;
        }

        /**
         * Whether to auto adjust quality or not
         */
        public Builder autoAdjustQuality(double autoAdjustQuality) {
            Utils.checkNotNull(autoAdjustQuality, "autoAdjustQuality");
            this.autoAdjustQuality = Optional.ofNullable(autoAdjustQuality);
            return this;
        }

        /**
         * Whether to auto adjust quality or not
         */
        public Builder autoAdjustQuality(Optional<? extends Double> autoAdjustQuality) {
            Utils.checkNotNull(autoAdjustQuality, "autoAdjustQuality");
            this.autoAdjustQuality = autoAdjustQuality;
            return this;
        }
        
        public StartUniversalTranscodeRequest build() {
            return new StartUniversalTranscodeRequest(
                hasMDE,
                path,
                mediaIndex,
                partIndex,
                protocol,
                fastSeek,
                directPlay,
                directStream,
                subtitleSize,
                subtites,
                audioBoost,
                location,
                mediaBufferSize,
                session,
                addDebugOverlay,
                autoAdjustQuality);
        }
    }
}

