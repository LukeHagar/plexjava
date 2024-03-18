/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;


public class TranscodeSession {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<? extends String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("throttled")
    private Optional<? extends Boolean> throttled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("complete")
    private Optional<? extends Boolean> complete;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("progress")
    private Optional<? extends Double> progress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("speed")
    private Optional<? extends Double> speed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<? extends Boolean> error;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<? extends Integer> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remaining")
    private Optional<? extends Integer> remaining;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("context")
    private Optional<? extends String> context;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceVideoCodec")
    private Optional<? extends String> sourceVideoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAudioCodec")
    private Optional<? extends String> sourceAudioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoDecision")
    private Optional<? extends String> videoDecision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioDecision")
    private Optional<? extends String> audioDecision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitleDecision")
    private Optional<? extends String> subtitleDecision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    private Optional<? extends String> protocol;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<? extends String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    private Optional<? extends String> videoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    private Optional<? extends String> audioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    private Optional<? extends Integer> audioChannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transcodeHwRequested")
    private Optional<? extends Boolean> transcodeHwRequested;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timeStamp")
    private Optional<? extends Double> timeStamp;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxOffsetAvailable")
    private Optional<? extends Double> maxOffsetAvailable;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minOffsetAvailable")
    private Optional<? extends Double> minOffsetAvailable;

    public TranscodeSession(
            @JsonProperty("key") Optional<? extends String> key,
            @JsonProperty("throttled") Optional<? extends Boolean> throttled,
            @JsonProperty("complete") Optional<? extends Boolean> complete,
            @JsonProperty("progress") Optional<? extends Double> progress,
            @JsonProperty("size") Optional<? extends Integer> size,
            @JsonProperty("speed") Optional<? extends Double> speed,
            @JsonProperty("error") Optional<? extends Boolean> error,
            @JsonProperty("duration") Optional<? extends Integer> duration,
            @JsonProperty("remaining") Optional<? extends Integer> remaining,
            @JsonProperty("context") Optional<? extends String> context,
            @JsonProperty("sourceVideoCodec") Optional<? extends String> sourceVideoCodec,
            @JsonProperty("sourceAudioCodec") Optional<? extends String> sourceAudioCodec,
            @JsonProperty("videoDecision") Optional<? extends String> videoDecision,
            @JsonProperty("audioDecision") Optional<? extends String> audioDecision,
            @JsonProperty("subtitleDecision") Optional<? extends String> subtitleDecision,
            @JsonProperty("protocol") Optional<? extends String> protocol,
            @JsonProperty("container") Optional<? extends String> container,
            @JsonProperty("videoCodec") Optional<? extends String> videoCodec,
            @JsonProperty("audioCodec") Optional<? extends String> audioCodec,
            @JsonProperty("audioChannels") Optional<? extends Integer> audioChannels,
            @JsonProperty("transcodeHwRequested") Optional<? extends Boolean> transcodeHwRequested,
            @JsonProperty("timeStamp") Optional<? extends Double> timeStamp,
            @JsonProperty("maxOffsetAvailable") Optional<? extends Double> maxOffsetAvailable,
            @JsonProperty("minOffsetAvailable") Optional<? extends Double> minOffsetAvailable) {
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(throttled, "throttled");
        Utils.checkNotNull(complete, "complete");
        Utils.checkNotNull(progress, "progress");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(speed, "speed");
        Utils.checkNotNull(error, "error");
        Utils.checkNotNull(duration, "duration");
        Utils.checkNotNull(remaining, "remaining");
        Utils.checkNotNull(context, "context");
        Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
        Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
        Utils.checkNotNull(videoDecision, "videoDecision");
        Utils.checkNotNull(audioDecision, "audioDecision");
        Utils.checkNotNull(subtitleDecision, "subtitleDecision");
        Utils.checkNotNull(protocol, "protocol");
        Utils.checkNotNull(container, "container");
        Utils.checkNotNull(videoCodec, "videoCodec");
        Utils.checkNotNull(audioCodec, "audioCodec");
        Utils.checkNotNull(audioChannels, "audioChannels");
        Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
        Utils.checkNotNull(timeStamp, "timeStamp");
        Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
        Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
        this.key = key;
        this.throttled = throttled;
        this.complete = complete;
        this.progress = progress;
        this.size = size;
        this.speed = speed;
        this.error = error;
        this.duration = duration;
        this.remaining = remaining;
        this.context = context;
        this.sourceVideoCodec = sourceVideoCodec;
        this.sourceAudioCodec = sourceAudioCodec;
        this.videoDecision = videoDecision;
        this.audioDecision = audioDecision;
        this.subtitleDecision = subtitleDecision;
        this.protocol = protocol;
        this.container = container;
        this.videoCodec = videoCodec;
        this.audioCodec = audioCodec;
        this.audioChannels = audioChannels;
        this.transcodeHwRequested = transcodeHwRequested;
        this.timeStamp = timeStamp;
        this.maxOffsetAvailable = maxOffsetAvailable;
        this.minOffsetAvailable = minOffsetAvailable;
    }

    public Optional<? extends String> key() {
        return key;
    }

    public Optional<? extends Boolean> throttled() {
        return throttled;
    }

    public Optional<? extends Boolean> complete() {
        return complete;
    }

    public Optional<? extends Double> progress() {
        return progress;
    }

    public Optional<? extends Integer> size() {
        return size;
    }

    public Optional<? extends Double> speed() {
        return speed;
    }

    public Optional<? extends Boolean> error() {
        return error;
    }

    public Optional<? extends Integer> duration() {
        return duration;
    }

    public Optional<? extends Integer> remaining() {
        return remaining;
    }

    public Optional<? extends String> context() {
        return context;
    }

    public Optional<? extends String> sourceVideoCodec() {
        return sourceVideoCodec;
    }

    public Optional<? extends String> sourceAudioCodec() {
        return sourceAudioCodec;
    }

    public Optional<? extends String> videoDecision() {
        return videoDecision;
    }

    public Optional<? extends String> audioDecision() {
        return audioDecision;
    }

    public Optional<? extends String> subtitleDecision() {
        return subtitleDecision;
    }

    public Optional<? extends String> protocol() {
        return protocol;
    }

    public Optional<? extends String> container() {
        return container;
    }

    public Optional<? extends String> videoCodec() {
        return videoCodec;
    }

    public Optional<? extends String> audioCodec() {
        return audioCodec;
    }

    public Optional<? extends Integer> audioChannels() {
        return audioChannels;
    }

    public Optional<? extends Boolean> transcodeHwRequested() {
        return transcodeHwRequested;
    }

    public Optional<? extends Double> timeStamp() {
        return timeStamp;
    }

    public Optional<? extends Double> maxOffsetAvailable() {
        return maxOffsetAvailable;
    }

    public Optional<? extends Double> minOffsetAvailable() {
        return minOffsetAvailable;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public TranscodeSession withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public TranscodeSession withKey(Optional<? extends String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public TranscodeSession withThrottled(boolean throttled) {
        Utils.checkNotNull(throttled, "throttled");
        this.throttled = Optional.ofNullable(throttled);
        return this;
    }

    public TranscodeSession withThrottled(Optional<? extends Boolean> throttled) {
        Utils.checkNotNull(throttled, "throttled");
        this.throttled = throttled;
        return this;
    }

    public TranscodeSession withComplete(boolean complete) {
        Utils.checkNotNull(complete, "complete");
        this.complete = Optional.ofNullable(complete);
        return this;
    }

    public TranscodeSession withComplete(Optional<? extends Boolean> complete) {
        Utils.checkNotNull(complete, "complete");
        this.complete = complete;
        return this;
    }

    public TranscodeSession withProgress(double progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = Optional.ofNullable(progress);
        return this;
    }

    public TranscodeSession withProgress(Optional<? extends Double> progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = progress;
        return this;
    }

    public TranscodeSession withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public TranscodeSession withSize(Optional<? extends Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public TranscodeSession withSpeed(double speed) {
        Utils.checkNotNull(speed, "speed");
        this.speed = Optional.ofNullable(speed);
        return this;
    }

    public TranscodeSession withSpeed(Optional<? extends Double> speed) {
        Utils.checkNotNull(speed, "speed");
        this.speed = speed;
        return this;
    }

    public TranscodeSession withError(boolean error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public TranscodeSession withError(Optional<? extends Boolean> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TranscodeSession withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public TranscodeSession withDuration(Optional<? extends Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public TranscodeSession withRemaining(int remaining) {
        Utils.checkNotNull(remaining, "remaining");
        this.remaining = Optional.ofNullable(remaining);
        return this;
    }

    public TranscodeSession withRemaining(Optional<? extends Integer> remaining) {
        Utils.checkNotNull(remaining, "remaining");
        this.remaining = remaining;
        return this;
    }

    public TranscodeSession withContext(String context) {
        Utils.checkNotNull(context, "context");
        this.context = Optional.ofNullable(context);
        return this;
    }

    public TranscodeSession withContext(Optional<? extends String> context) {
        Utils.checkNotNull(context, "context");
        this.context = context;
        return this;
    }

    public TranscodeSession withSourceVideoCodec(String sourceVideoCodec) {
        Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
        this.sourceVideoCodec = Optional.ofNullable(sourceVideoCodec);
        return this;
    }

    public TranscodeSession withSourceVideoCodec(Optional<? extends String> sourceVideoCodec) {
        Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
        this.sourceVideoCodec = sourceVideoCodec;
        return this;
    }

    public TranscodeSession withSourceAudioCodec(String sourceAudioCodec) {
        Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
        this.sourceAudioCodec = Optional.ofNullable(sourceAudioCodec);
        return this;
    }

    public TranscodeSession withSourceAudioCodec(Optional<? extends String> sourceAudioCodec) {
        Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
        this.sourceAudioCodec = sourceAudioCodec;
        return this;
    }

    public TranscodeSession withVideoDecision(String videoDecision) {
        Utils.checkNotNull(videoDecision, "videoDecision");
        this.videoDecision = Optional.ofNullable(videoDecision);
        return this;
    }

    public TranscodeSession withVideoDecision(Optional<? extends String> videoDecision) {
        Utils.checkNotNull(videoDecision, "videoDecision");
        this.videoDecision = videoDecision;
        return this;
    }

    public TranscodeSession withAudioDecision(String audioDecision) {
        Utils.checkNotNull(audioDecision, "audioDecision");
        this.audioDecision = Optional.ofNullable(audioDecision);
        return this;
    }

    public TranscodeSession withAudioDecision(Optional<? extends String> audioDecision) {
        Utils.checkNotNull(audioDecision, "audioDecision");
        this.audioDecision = audioDecision;
        return this;
    }

    public TranscodeSession withSubtitleDecision(String subtitleDecision) {
        Utils.checkNotNull(subtitleDecision, "subtitleDecision");
        this.subtitleDecision = Optional.ofNullable(subtitleDecision);
        return this;
    }

    public TranscodeSession withSubtitleDecision(Optional<? extends String> subtitleDecision) {
        Utils.checkNotNull(subtitleDecision, "subtitleDecision");
        this.subtitleDecision = subtitleDecision;
        return this;
    }

    public TranscodeSession withProtocol(String protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = Optional.ofNullable(protocol);
        return this;
    }

    public TranscodeSession withProtocol(Optional<? extends String> protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = protocol;
        return this;
    }

    public TranscodeSession withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public TranscodeSession withContainer(Optional<? extends String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public TranscodeSession withVideoCodec(String videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = Optional.ofNullable(videoCodec);
        return this;
    }

    public TranscodeSession withVideoCodec(Optional<? extends String> videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = videoCodec;
        return this;
    }

    public TranscodeSession withAudioCodec(String audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = Optional.ofNullable(audioCodec);
        return this;
    }

    public TranscodeSession withAudioCodec(Optional<? extends String> audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = audioCodec;
        return this;
    }

    public TranscodeSession withAudioChannels(int audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = Optional.ofNullable(audioChannels);
        return this;
    }

    public TranscodeSession withAudioChannels(Optional<? extends Integer> audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = audioChannels;
        return this;
    }

    public TranscodeSession withTranscodeHwRequested(boolean transcodeHwRequested) {
        Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
        this.transcodeHwRequested = Optional.ofNullable(transcodeHwRequested);
        return this;
    }

    public TranscodeSession withTranscodeHwRequested(Optional<? extends Boolean> transcodeHwRequested) {
        Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
        this.transcodeHwRequested = transcodeHwRequested;
        return this;
    }

    public TranscodeSession withTimeStamp(double timeStamp) {
        Utils.checkNotNull(timeStamp, "timeStamp");
        this.timeStamp = Optional.ofNullable(timeStamp);
        return this;
    }

    public TranscodeSession withTimeStamp(Optional<? extends Double> timeStamp) {
        Utils.checkNotNull(timeStamp, "timeStamp");
        this.timeStamp = timeStamp;
        return this;
    }

    public TranscodeSession withMaxOffsetAvailable(double maxOffsetAvailable) {
        Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
        this.maxOffsetAvailable = Optional.ofNullable(maxOffsetAvailable);
        return this;
    }

    public TranscodeSession withMaxOffsetAvailable(Optional<? extends Double> maxOffsetAvailable) {
        Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
        this.maxOffsetAvailable = maxOffsetAvailable;
        return this;
    }

    public TranscodeSession withMinOffsetAvailable(double minOffsetAvailable) {
        Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
        this.minOffsetAvailable = Optional.ofNullable(minOffsetAvailable);
        return this;
    }

    public TranscodeSession withMinOffsetAvailable(Optional<? extends Double> minOffsetAvailable) {
        Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
        this.minOffsetAvailable = minOffsetAvailable;
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
        TranscodeSession other = (TranscodeSession) o;
        return 
            java.util.Objects.deepEquals(this.key, other.key) &&
            java.util.Objects.deepEquals(this.throttled, other.throttled) &&
            java.util.Objects.deepEquals(this.complete, other.complete) &&
            java.util.Objects.deepEquals(this.progress, other.progress) &&
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.speed, other.speed) &&
            java.util.Objects.deepEquals(this.error, other.error) &&
            java.util.Objects.deepEquals(this.duration, other.duration) &&
            java.util.Objects.deepEquals(this.remaining, other.remaining) &&
            java.util.Objects.deepEquals(this.context, other.context) &&
            java.util.Objects.deepEquals(this.sourceVideoCodec, other.sourceVideoCodec) &&
            java.util.Objects.deepEquals(this.sourceAudioCodec, other.sourceAudioCodec) &&
            java.util.Objects.deepEquals(this.videoDecision, other.videoDecision) &&
            java.util.Objects.deepEquals(this.audioDecision, other.audioDecision) &&
            java.util.Objects.deepEquals(this.subtitleDecision, other.subtitleDecision) &&
            java.util.Objects.deepEquals(this.protocol, other.protocol) &&
            java.util.Objects.deepEquals(this.container, other.container) &&
            java.util.Objects.deepEquals(this.videoCodec, other.videoCodec) &&
            java.util.Objects.deepEquals(this.audioCodec, other.audioCodec) &&
            java.util.Objects.deepEquals(this.audioChannels, other.audioChannels) &&
            java.util.Objects.deepEquals(this.transcodeHwRequested, other.transcodeHwRequested) &&
            java.util.Objects.deepEquals(this.timeStamp, other.timeStamp) &&
            java.util.Objects.deepEquals(this.maxOffsetAvailable, other.maxOffsetAvailable) &&
            java.util.Objects.deepEquals(this.minOffsetAvailable, other.minOffsetAvailable);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            key,
            throttled,
            complete,
            progress,
            size,
            speed,
            error,
            duration,
            remaining,
            context,
            sourceVideoCodec,
            sourceAudioCodec,
            videoDecision,
            audioDecision,
            subtitleDecision,
            protocol,
            container,
            videoCodec,
            audioCodec,
            audioChannels,
            transcodeHwRequested,
            timeStamp,
            maxOffsetAvailable,
            minOffsetAvailable);
    }
    
    @Override
    public String toString() {
        return Utils.toString(TranscodeSession.class,
                "key", key,
                "throttled", throttled,
                "complete", complete,
                "progress", progress,
                "size", size,
                "speed", speed,
                "error", error,
                "duration", duration,
                "remaining", remaining,
                "context", context,
                "sourceVideoCodec", sourceVideoCodec,
                "sourceAudioCodec", sourceAudioCodec,
                "videoDecision", videoDecision,
                "audioDecision", audioDecision,
                "subtitleDecision", subtitleDecision,
                "protocol", protocol,
                "container", container,
                "videoCodec", videoCodec,
                "audioCodec", audioCodec,
                "audioChannels", audioChannels,
                "transcodeHwRequested", transcodeHwRequested,
                "timeStamp", timeStamp,
                "maxOffsetAvailable", maxOffsetAvailable,
                "minOffsetAvailable", minOffsetAvailable);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> key = Optional.empty();
 
        private Optional<? extends Boolean> throttled = Optional.empty();
 
        private Optional<? extends Boolean> complete = Optional.empty();
 
        private Optional<? extends Double> progress = Optional.empty();
 
        private Optional<? extends Integer> size = Optional.empty();
 
        private Optional<? extends Double> speed = Optional.empty();
 
        private Optional<? extends Boolean> error = Optional.empty();
 
        private Optional<? extends Integer> duration = Optional.empty();
 
        private Optional<? extends Integer> remaining = Optional.empty();
 
        private Optional<? extends String> context = Optional.empty();
 
        private Optional<? extends String> sourceVideoCodec = Optional.empty();
 
        private Optional<? extends String> sourceAudioCodec = Optional.empty();
 
        private Optional<? extends String> videoDecision = Optional.empty();
 
        private Optional<? extends String> audioDecision = Optional.empty();
 
        private Optional<? extends String> subtitleDecision = Optional.empty();
 
        private Optional<? extends String> protocol = Optional.empty();
 
        private Optional<? extends String> container = Optional.empty();
 
        private Optional<? extends String> videoCodec = Optional.empty();
 
        private Optional<? extends String> audioCodec = Optional.empty();
 
        private Optional<? extends Integer> audioChannels = Optional.empty();
 
        private Optional<? extends Boolean> transcodeHwRequested = Optional.empty();
 
        private Optional<? extends Double> timeStamp = Optional.empty();
 
        private Optional<? extends Double> maxOffsetAvailable = Optional.empty();
 
        private Optional<? extends Double> minOffsetAvailable = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<? extends String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder throttled(boolean throttled) {
            Utils.checkNotNull(throttled, "throttled");
            this.throttled = Optional.ofNullable(throttled);
            return this;
        }

        public Builder throttled(Optional<? extends Boolean> throttled) {
            Utils.checkNotNull(throttled, "throttled");
            this.throttled = throttled;
            return this;
        }

        public Builder complete(boolean complete) {
            Utils.checkNotNull(complete, "complete");
            this.complete = Optional.ofNullable(complete);
            return this;
        }

        public Builder complete(Optional<? extends Boolean> complete) {
            Utils.checkNotNull(complete, "complete");
            this.complete = complete;
            return this;
        }

        public Builder progress(double progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = Optional.ofNullable(progress);
            return this;
        }

        public Builder progress(Optional<? extends Double> progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = progress;
            return this;
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<? extends Integer> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder speed(double speed) {
            Utils.checkNotNull(speed, "speed");
            this.speed = Optional.ofNullable(speed);
            return this;
        }

        public Builder speed(Optional<? extends Double> speed) {
            Utils.checkNotNull(speed, "speed");
            this.speed = speed;
            return this;
        }

        public Builder error(boolean error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<? extends Boolean> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder duration(int duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<? extends Integer> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder remaining(int remaining) {
            Utils.checkNotNull(remaining, "remaining");
            this.remaining = Optional.ofNullable(remaining);
            return this;
        }

        public Builder remaining(Optional<? extends Integer> remaining) {
            Utils.checkNotNull(remaining, "remaining");
            this.remaining = remaining;
            return this;
        }

        public Builder context(String context) {
            Utils.checkNotNull(context, "context");
            this.context = Optional.ofNullable(context);
            return this;
        }

        public Builder context(Optional<? extends String> context) {
            Utils.checkNotNull(context, "context");
            this.context = context;
            return this;
        }

        public Builder sourceVideoCodec(String sourceVideoCodec) {
            Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
            this.sourceVideoCodec = Optional.ofNullable(sourceVideoCodec);
            return this;
        }

        public Builder sourceVideoCodec(Optional<? extends String> sourceVideoCodec) {
            Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
            this.sourceVideoCodec = sourceVideoCodec;
            return this;
        }

        public Builder sourceAudioCodec(String sourceAudioCodec) {
            Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
            this.sourceAudioCodec = Optional.ofNullable(sourceAudioCodec);
            return this;
        }

        public Builder sourceAudioCodec(Optional<? extends String> sourceAudioCodec) {
            Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
            this.sourceAudioCodec = sourceAudioCodec;
            return this;
        }

        public Builder videoDecision(String videoDecision) {
            Utils.checkNotNull(videoDecision, "videoDecision");
            this.videoDecision = Optional.ofNullable(videoDecision);
            return this;
        }

        public Builder videoDecision(Optional<? extends String> videoDecision) {
            Utils.checkNotNull(videoDecision, "videoDecision");
            this.videoDecision = videoDecision;
            return this;
        }

        public Builder audioDecision(String audioDecision) {
            Utils.checkNotNull(audioDecision, "audioDecision");
            this.audioDecision = Optional.ofNullable(audioDecision);
            return this;
        }

        public Builder audioDecision(Optional<? extends String> audioDecision) {
            Utils.checkNotNull(audioDecision, "audioDecision");
            this.audioDecision = audioDecision;
            return this;
        }

        public Builder subtitleDecision(String subtitleDecision) {
            Utils.checkNotNull(subtitleDecision, "subtitleDecision");
            this.subtitleDecision = Optional.ofNullable(subtitleDecision);
            return this;
        }

        public Builder subtitleDecision(Optional<? extends String> subtitleDecision) {
            Utils.checkNotNull(subtitleDecision, "subtitleDecision");
            this.subtitleDecision = subtitleDecision;
            return this;
        }

        public Builder protocol(String protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = Optional.ofNullable(protocol);
            return this;
        }

        public Builder protocol(Optional<? extends String> protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder container(String container) {
            Utils.checkNotNull(container, "container");
            this.container = Optional.ofNullable(container);
            return this;
        }

        public Builder container(Optional<? extends String> container) {
            Utils.checkNotNull(container, "container");
            this.container = container;
            return this;
        }

        public Builder videoCodec(String videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = Optional.ofNullable(videoCodec);
            return this;
        }

        public Builder videoCodec(Optional<? extends String> videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = videoCodec;
            return this;
        }

        public Builder audioCodec(String audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = Optional.ofNullable(audioCodec);
            return this;
        }

        public Builder audioCodec(Optional<? extends String> audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = audioCodec;
            return this;
        }

        public Builder audioChannels(int audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = Optional.ofNullable(audioChannels);
            return this;
        }

        public Builder audioChannels(Optional<? extends Integer> audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = audioChannels;
            return this;
        }

        public Builder transcodeHwRequested(boolean transcodeHwRequested) {
            Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
            this.transcodeHwRequested = Optional.ofNullable(transcodeHwRequested);
            return this;
        }

        public Builder transcodeHwRequested(Optional<? extends Boolean> transcodeHwRequested) {
            Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
            this.transcodeHwRequested = transcodeHwRequested;
            return this;
        }

        public Builder timeStamp(double timeStamp) {
            Utils.checkNotNull(timeStamp, "timeStamp");
            this.timeStamp = Optional.ofNullable(timeStamp);
            return this;
        }

        public Builder timeStamp(Optional<? extends Double> timeStamp) {
            Utils.checkNotNull(timeStamp, "timeStamp");
            this.timeStamp = timeStamp;
            return this;
        }

        public Builder maxOffsetAvailable(double maxOffsetAvailable) {
            Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
            this.maxOffsetAvailable = Optional.ofNullable(maxOffsetAvailable);
            return this;
        }

        public Builder maxOffsetAvailable(Optional<? extends Double> maxOffsetAvailable) {
            Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
            this.maxOffsetAvailable = maxOffsetAvailable;
            return this;
        }

        public Builder minOffsetAvailable(double minOffsetAvailable) {
            Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
            this.minOffsetAvailable = Optional.ofNullable(minOffsetAvailable);
            return this;
        }

        public Builder minOffsetAvailable(Optional<? extends Double> minOffsetAvailable) {
            Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
            this.minOffsetAvailable = minOffsetAvailable;
            return this;
        }
        
        public TranscodeSession build() {
            return new TranscodeSession(
                key,
                throttled,
                complete,
                progress,
                size,
                speed,
                error,
                duration,
                remaining,
                context,
                sourceVideoCodec,
                sourceAudioCodec,
                videoDecision,
                audioDecision,
                subtitleDecision,
                protocol,
                container,
                videoCodec,
                audioCodec,
                audioChannels,
                transcodeHwRequested,
                timeStamp,
                maxOffsetAvailable,
                minOffsetAvailable);
        }
    }
}

