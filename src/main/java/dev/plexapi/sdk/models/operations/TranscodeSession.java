/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class TranscodeSession {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("throttled")
    private Optional<Boolean> throttled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("complete")
    private Optional<Boolean> complete;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("progress")
    private Optional<Double> progress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("speed")
    private Optional<Double> speed;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    private Optional<Boolean> error;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    private Optional<Integer> duration;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("remaining")
    private Optional<Integer> remaining;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("context")
    private Optional<String> context;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceVideoCodec")
    private Optional<String> sourceVideoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceAudioCodec")
    private Optional<String> sourceAudioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoDecision")
    private Optional<String> videoDecision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioDecision")
    private Optional<String> audioDecision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitleDecision")
    private Optional<String> subtitleDecision;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("protocol")
    private Optional<String> protocol;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("container")
    private Optional<String> container;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("videoCodec")
    private Optional<String> videoCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioCodec")
    private Optional<String> audioCodec;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audioChannels")
    private Optional<Integer> audioChannels;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("transcodeHwRequested")
    private Optional<Boolean> transcodeHwRequested;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timeStamp")
    private Optional<Double> timeStamp;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("maxOffsetAvailable")
    private Optional<Double> maxOffsetAvailable;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("minOffsetAvailable")
    private Optional<Double> minOffsetAvailable;

    @JsonCreator
    public TranscodeSession(
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("throttled") Optional<Boolean> throttled,
            @JsonProperty("complete") Optional<Boolean> complete,
            @JsonProperty("progress") Optional<Double> progress,
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("speed") Optional<Double> speed,
            @JsonProperty("error") Optional<Boolean> error,
            @JsonProperty("duration") Optional<Integer> duration,
            @JsonProperty("remaining") Optional<Integer> remaining,
            @JsonProperty("context") Optional<String> context,
            @JsonProperty("sourceVideoCodec") Optional<String> sourceVideoCodec,
            @JsonProperty("sourceAudioCodec") Optional<String> sourceAudioCodec,
            @JsonProperty("videoDecision") Optional<String> videoDecision,
            @JsonProperty("audioDecision") Optional<String> audioDecision,
            @JsonProperty("subtitleDecision") Optional<String> subtitleDecision,
            @JsonProperty("protocol") Optional<String> protocol,
            @JsonProperty("container") Optional<String> container,
            @JsonProperty("videoCodec") Optional<String> videoCodec,
            @JsonProperty("audioCodec") Optional<String> audioCodec,
            @JsonProperty("audioChannels") Optional<Integer> audioChannels,
            @JsonProperty("transcodeHwRequested") Optional<Boolean> transcodeHwRequested,
            @JsonProperty("timeStamp") Optional<Double> timeStamp,
            @JsonProperty("maxOffsetAvailable") Optional<Double> maxOffsetAvailable,
            @JsonProperty("minOffsetAvailable") Optional<Double> minOffsetAvailable) {
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
    
    public TranscodeSession() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<Boolean> throttled() {
        return throttled;
    }

    @JsonIgnore
    public Optional<Boolean> complete() {
        return complete;
    }

    @JsonIgnore
    public Optional<Double> progress() {
        return progress;
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @JsonIgnore
    public Optional<Double> speed() {
        return speed;
    }

    @JsonIgnore
    public Optional<Boolean> error() {
        return error;
    }

    @JsonIgnore
    public Optional<Integer> duration() {
        return duration;
    }

    @JsonIgnore
    public Optional<Integer> remaining() {
        return remaining;
    }

    @JsonIgnore
    public Optional<String> context() {
        return context;
    }

    @JsonIgnore
    public Optional<String> sourceVideoCodec() {
        return sourceVideoCodec;
    }

    @JsonIgnore
    public Optional<String> sourceAudioCodec() {
        return sourceAudioCodec;
    }

    @JsonIgnore
    public Optional<String> videoDecision() {
        return videoDecision;
    }

    @JsonIgnore
    public Optional<String> audioDecision() {
        return audioDecision;
    }

    @JsonIgnore
    public Optional<String> subtitleDecision() {
        return subtitleDecision;
    }

    @JsonIgnore
    public Optional<String> protocol() {
        return protocol;
    }

    @JsonIgnore
    public Optional<String> container() {
        return container;
    }

    @JsonIgnore
    public Optional<String> videoCodec() {
        return videoCodec;
    }

    @JsonIgnore
    public Optional<String> audioCodec() {
        return audioCodec;
    }

    @JsonIgnore
    public Optional<Integer> audioChannels() {
        return audioChannels;
    }

    @JsonIgnore
    public Optional<Boolean> transcodeHwRequested() {
        return transcodeHwRequested;
    }

    @JsonIgnore
    public Optional<Double> timeStamp() {
        return timeStamp;
    }

    @JsonIgnore
    public Optional<Double> maxOffsetAvailable() {
        return maxOffsetAvailable;
    }

    @JsonIgnore
    public Optional<Double> minOffsetAvailable() {
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

    public TranscodeSession withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public TranscodeSession withThrottled(boolean throttled) {
        Utils.checkNotNull(throttled, "throttled");
        this.throttled = Optional.ofNullable(throttled);
        return this;
    }

    public TranscodeSession withThrottled(Optional<Boolean> throttled) {
        Utils.checkNotNull(throttled, "throttled");
        this.throttled = throttled;
        return this;
    }

    public TranscodeSession withComplete(boolean complete) {
        Utils.checkNotNull(complete, "complete");
        this.complete = Optional.ofNullable(complete);
        return this;
    }

    public TranscodeSession withComplete(Optional<Boolean> complete) {
        Utils.checkNotNull(complete, "complete");
        this.complete = complete;
        return this;
    }

    public TranscodeSession withProgress(double progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = Optional.ofNullable(progress);
        return this;
    }

    public TranscodeSession withProgress(Optional<Double> progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = progress;
        return this;
    }

    public TranscodeSession withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public TranscodeSession withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public TranscodeSession withSpeed(double speed) {
        Utils.checkNotNull(speed, "speed");
        this.speed = Optional.ofNullable(speed);
        return this;
    }

    public TranscodeSession withSpeed(Optional<Double> speed) {
        Utils.checkNotNull(speed, "speed");
        this.speed = speed;
        return this;
    }

    public TranscodeSession withError(boolean error) {
        Utils.checkNotNull(error, "error");
        this.error = Optional.ofNullable(error);
        return this;
    }

    public TranscodeSession withError(Optional<Boolean> error) {
        Utils.checkNotNull(error, "error");
        this.error = error;
        return this;
    }

    public TranscodeSession withDuration(int duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = Optional.ofNullable(duration);
        return this;
    }

    public TranscodeSession withDuration(Optional<Integer> duration) {
        Utils.checkNotNull(duration, "duration");
        this.duration = duration;
        return this;
    }

    public TranscodeSession withRemaining(int remaining) {
        Utils.checkNotNull(remaining, "remaining");
        this.remaining = Optional.ofNullable(remaining);
        return this;
    }

    public TranscodeSession withRemaining(Optional<Integer> remaining) {
        Utils.checkNotNull(remaining, "remaining");
        this.remaining = remaining;
        return this;
    }

    public TranscodeSession withContext(String context) {
        Utils.checkNotNull(context, "context");
        this.context = Optional.ofNullable(context);
        return this;
    }

    public TranscodeSession withContext(Optional<String> context) {
        Utils.checkNotNull(context, "context");
        this.context = context;
        return this;
    }

    public TranscodeSession withSourceVideoCodec(String sourceVideoCodec) {
        Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
        this.sourceVideoCodec = Optional.ofNullable(sourceVideoCodec);
        return this;
    }

    public TranscodeSession withSourceVideoCodec(Optional<String> sourceVideoCodec) {
        Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
        this.sourceVideoCodec = sourceVideoCodec;
        return this;
    }

    public TranscodeSession withSourceAudioCodec(String sourceAudioCodec) {
        Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
        this.sourceAudioCodec = Optional.ofNullable(sourceAudioCodec);
        return this;
    }

    public TranscodeSession withSourceAudioCodec(Optional<String> sourceAudioCodec) {
        Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
        this.sourceAudioCodec = sourceAudioCodec;
        return this;
    }

    public TranscodeSession withVideoDecision(String videoDecision) {
        Utils.checkNotNull(videoDecision, "videoDecision");
        this.videoDecision = Optional.ofNullable(videoDecision);
        return this;
    }

    public TranscodeSession withVideoDecision(Optional<String> videoDecision) {
        Utils.checkNotNull(videoDecision, "videoDecision");
        this.videoDecision = videoDecision;
        return this;
    }

    public TranscodeSession withAudioDecision(String audioDecision) {
        Utils.checkNotNull(audioDecision, "audioDecision");
        this.audioDecision = Optional.ofNullable(audioDecision);
        return this;
    }

    public TranscodeSession withAudioDecision(Optional<String> audioDecision) {
        Utils.checkNotNull(audioDecision, "audioDecision");
        this.audioDecision = audioDecision;
        return this;
    }

    public TranscodeSession withSubtitleDecision(String subtitleDecision) {
        Utils.checkNotNull(subtitleDecision, "subtitleDecision");
        this.subtitleDecision = Optional.ofNullable(subtitleDecision);
        return this;
    }

    public TranscodeSession withSubtitleDecision(Optional<String> subtitleDecision) {
        Utils.checkNotNull(subtitleDecision, "subtitleDecision");
        this.subtitleDecision = subtitleDecision;
        return this;
    }

    public TranscodeSession withProtocol(String protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = Optional.ofNullable(protocol);
        return this;
    }

    public TranscodeSession withProtocol(Optional<String> protocol) {
        Utils.checkNotNull(protocol, "protocol");
        this.protocol = protocol;
        return this;
    }

    public TranscodeSession withContainer(String container) {
        Utils.checkNotNull(container, "container");
        this.container = Optional.ofNullable(container);
        return this;
    }

    public TranscodeSession withContainer(Optional<String> container) {
        Utils.checkNotNull(container, "container");
        this.container = container;
        return this;
    }

    public TranscodeSession withVideoCodec(String videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = Optional.ofNullable(videoCodec);
        return this;
    }

    public TranscodeSession withVideoCodec(Optional<String> videoCodec) {
        Utils.checkNotNull(videoCodec, "videoCodec");
        this.videoCodec = videoCodec;
        return this;
    }

    public TranscodeSession withAudioCodec(String audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = Optional.ofNullable(audioCodec);
        return this;
    }

    public TranscodeSession withAudioCodec(Optional<String> audioCodec) {
        Utils.checkNotNull(audioCodec, "audioCodec");
        this.audioCodec = audioCodec;
        return this;
    }

    public TranscodeSession withAudioChannels(int audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = Optional.ofNullable(audioChannels);
        return this;
    }

    public TranscodeSession withAudioChannels(Optional<Integer> audioChannels) {
        Utils.checkNotNull(audioChannels, "audioChannels");
        this.audioChannels = audioChannels;
        return this;
    }

    public TranscodeSession withTranscodeHwRequested(boolean transcodeHwRequested) {
        Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
        this.transcodeHwRequested = Optional.ofNullable(transcodeHwRequested);
        return this;
    }

    public TranscodeSession withTranscodeHwRequested(Optional<Boolean> transcodeHwRequested) {
        Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
        this.transcodeHwRequested = transcodeHwRequested;
        return this;
    }

    public TranscodeSession withTimeStamp(double timeStamp) {
        Utils.checkNotNull(timeStamp, "timeStamp");
        this.timeStamp = Optional.ofNullable(timeStamp);
        return this;
    }

    public TranscodeSession withTimeStamp(Optional<Double> timeStamp) {
        Utils.checkNotNull(timeStamp, "timeStamp");
        this.timeStamp = timeStamp;
        return this;
    }

    public TranscodeSession withMaxOffsetAvailable(double maxOffsetAvailable) {
        Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
        this.maxOffsetAvailable = Optional.ofNullable(maxOffsetAvailable);
        return this;
    }

    public TranscodeSession withMaxOffsetAvailable(Optional<Double> maxOffsetAvailable) {
        Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
        this.maxOffsetAvailable = maxOffsetAvailable;
        return this;
    }

    public TranscodeSession withMinOffsetAvailable(double minOffsetAvailable) {
        Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
        this.minOffsetAvailable = Optional.ofNullable(minOffsetAvailable);
        return this;
    }

    public TranscodeSession withMinOffsetAvailable(Optional<Double> minOffsetAvailable) {
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
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.throttled, other.throttled) &&
            Objects.deepEquals(this.complete, other.complete) &&
            Objects.deepEquals(this.progress, other.progress) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.speed, other.speed) &&
            Objects.deepEquals(this.error, other.error) &&
            Objects.deepEquals(this.duration, other.duration) &&
            Objects.deepEquals(this.remaining, other.remaining) &&
            Objects.deepEquals(this.context, other.context) &&
            Objects.deepEquals(this.sourceVideoCodec, other.sourceVideoCodec) &&
            Objects.deepEquals(this.sourceAudioCodec, other.sourceAudioCodec) &&
            Objects.deepEquals(this.videoDecision, other.videoDecision) &&
            Objects.deepEquals(this.audioDecision, other.audioDecision) &&
            Objects.deepEquals(this.subtitleDecision, other.subtitleDecision) &&
            Objects.deepEquals(this.protocol, other.protocol) &&
            Objects.deepEquals(this.container, other.container) &&
            Objects.deepEquals(this.videoCodec, other.videoCodec) &&
            Objects.deepEquals(this.audioCodec, other.audioCodec) &&
            Objects.deepEquals(this.audioChannels, other.audioChannels) &&
            Objects.deepEquals(this.transcodeHwRequested, other.transcodeHwRequested) &&
            Objects.deepEquals(this.timeStamp, other.timeStamp) &&
            Objects.deepEquals(this.maxOffsetAvailable, other.maxOffsetAvailable) &&
            Objects.deepEquals(this.minOffsetAvailable, other.minOffsetAvailable);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
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
 
        private Optional<String> key = Optional.empty();
 
        private Optional<Boolean> throttled = Optional.empty();
 
        private Optional<Boolean> complete = Optional.empty();
 
        private Optional<Double> progress = Optional.empty();
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<Double> speed = Optional.empty();
 
        private Optional<Boolean> error = Optional.empty();
 
        private Optional<Integer> duration = Optional.empty();
 
        private Optional<Integer> remaining = Optional.empty();
 
        private Optional<String> context = Optional.empty();
 
        private Optional<String> sourceVideoCodec = Optional.empty();
 
        private Optional<String> sourceAudioCodec = Optional.empty();
 
        private Optional<String> videoDecision = Optional.empty();
 
        private Optional<String> audioDecision = Optional.empty();
 
        private Optional<String> subtitleDecision = Optional.empty();
 
        private Optional<String> protocol = Optional.empty();
 
        private Optional<String> container = Optional.empty();
 
        private Optional<String> videoCodec = Optional.empty();
 
        private Optional<String> audioCodec = Optional.empty();
 
        private Optional<Integer> audioChannels = Optional.empty();
 
        private Optional<Boolean> transcodeHwRequested = Optional.empty();
 
        private Optional<Double> timeStamp = Optional.empty();
 
        private Optional<Double> maxOffsetAvailable = Optional.empty();
 
        private Optional<Double> minOffsetAvailable = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder throttled(boolean throttled) {
            Utils.checkNotNull(throttled, "throttled");
            this.throttled = Optional.ofNullable(throttled);
            return this;
        }

        public Builder throttled(Optional<Boolean> throttled) {
            Utils.checkNotNull(throttled, "throttled");
            this.throttled = throttled;
            return this;
        }

        public Builder complete(boolean complete) {
            Utils.checkNotNull(complete, "complete");
            this.complete = Optional.ofNullable(complete);
            return this;
        }

        public Builder complete(Optional<Boolean> complete) {
            Utils.checkNotNull(complete, "complete");
            this.complete = complete;
            return this;
        }

        public Builder progress(double progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = Optional.ofNullable(progress);
            return this;
        }

        public Builder progress(Optional<Double> progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = progress;
            return this;
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Integer> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder speed(double speed) {
            Utils.checkNotNull(speed, "speed");
            this.speed = Optional.ofNullable(speed);
            return this;
        }

        public Builder speed(Optional<Double> speed) {
            Utils.checkNotNull(speed, "speed");
            this.speed = speed;
            return this;
        }

        public Builder error(boolean error) {
            Utils.checkNotNull(error, "error");
            this.error = Optional.ofNullable(error);
            return this;
        }

        public Builder error(Optional<Boolean> error) {
            Utils.checkNotNull(error, "error");
            this.error = error;
            return this;
        }

        public Builder duration(int duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = Optional.ofNullable(duration);
            return this;
        }

        public Builder duration(Optional<Integer> duration) {
            Utils.checkNotNull(duration, "duration");
            this.duration = duration;
            return this;
        }

        public Builder remaining(int remaining) {
            Utils.checkNotNull(remaining, "remaining");
            this.remaining = Optional.ofNullable(remaining);
            return this;
        }

        public Builder remaining(Optional<Integer> remaining) {
            Utils.checkNotNull(remaining, "remaining");
            this.remaining = remaining;
            return this;
        }

        public Builder context(String context) {
            Utils.checkNotNull(context, "context");
            this.context = Optional.ofNullable(context);
            return this;
        }

        public Builder context(Optional<String> context) {
            Utils.checkNotNull(context, "context");
            this.context = context;
            return this;
        }

        public Builder sourceVideoCodec(String sourceVideoCodec) {
            Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
            this.sourceVideoCodec = Optional.ofNullable(sourceVideoCodec);
            return this;
        }

        public Builder sourceVideoCodec(Optional<String> sourceVideoCodec) {
            Utils.checkNotNull(sourceVideoCodec, "sourceVideoCodec");
            this.sourceVideoCodec = sourceVideoCodec;
            return this;
        }

        public Builder sourceAudioCodec(String sourceAudioCodec) {
            Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
            this.sourceAudioCodec = Optional.ofNullable(sourceAudioCodec);
            return this;
        }

        public Builder sourceAudioCodec(Optional<String> sourceAudioCodec) {
            Utils.checkNotNull(sourceAudioCodec, "sourceAudioCodec");
            this.sourceAudioCodec = sourceAudioCodec;
            return this;
        }

        public Builder videoDecision(String videoDecision) {
            Utils.checkNotNull(videoDecision, "videoDecision");
            this.videoDecision = Optional.ofNullable(videoDecision);
            return this;
        }

        public Builder videoDecision(Optional<String> videoDecision) {
            Utils.checkNotNull(videoDecision, "videoDecision");
            this.videoDecision = videoDecision;
            return this;
        }

        public Builder audioDecision(String audioDecision) {
            Utils.checkNotNull(audioDecision, "audioDecision");
            this.audioDecision = Optional.ofNullable(audioDecision);
            return this;
        }

        public Builder audioDecision(Optional<String> audioDecision) {
            Utils.checkNotNull(audioDecision, "audioDecision");
            this.audioDecision = audioDecision;
            return this;
        }

        public Builder subtitleDecision(String subtitleDecision) {
            Utils.checkNotNull(subtitleDecision, "subtitleDecision");
            this.subtitleDecision = Optional.ofNullable(subtitleDecision);
            return this;
        }

        public Builder subtitleDecision(Optional<String> subtitleDecision) {
            Utils.checkNotNull(subtitleDecision, "subtitleDecision");
            this.subtitleDecision = subtitleDecision;
            return this;
        }

        public Builder protocol(String protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = Optional.ofNullable(protocol);
            return this;
        }

        public Builder protocol(Optional<String> protocol) {
            Utils.checkNotNull(protocol, "protocol");
            this.protocol = protocol;
            return this;
        }

        public Builder container(String container) {
            Utils.checkNotNull(container, "container");
            this.container = Optional.ofNullable(container);
            return this;
        }

        public Builder container(Optional<String> container) {
            Utils.checkNotNull(container, "container");
            this.container = container;
            return this;
        }

        public Builder videoCodec(String videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = Optional.ofNullable(videoCodec);
            return this;
        }

        public Builder videoCodec(Optional<String> videoCodec) {
            Utils.checkNotNull(videoCodec, "videoCodec");
            this.videoCodec = videoCodec;
            return this;
        }

        public Builder audioCodec(String audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = Optional.ofNullable(audioCodec);
            return this;
        }

        public Builder audioCodec(Optional<String> audioCodec) {
            Utils.checkNotNull(audioCodec, "audioCodec");
            this.audioCodec = audioCodec;
            return this;
        }

        public Builder audioChannels(int audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = Optional.ofNullable(audioChannels);
            return this;
        }

        public Builder audioChannels(Optional<Integer> audioChannels) {
            Utils.checkNotNull(audioChannels, "audioChannels");
            this.audioChannels = audioChannels;
            return this;
        }

        public Builder transcodeHwRequested(boolean transcodeHwRequested) {
            Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
            this.transcodeHwRequested = Optional.ofNullable(transcodeHwRequested);
            return this;
        }

        public Builder transcodeHwRequested(Optional<Boolean> transcodeHwRequested) {
            Utils.checkNotNull(transcodeHwRequested, "transcodeHwRequested");
            this.transcodeHwRequested = transcodeHwRequested;
            return this;
        }

        public Builder timeStamp(double timeStamp) {
            Utils.checkNotNull(timeStamp, "timeStamp");
            this.timeStamp = Optional.ofNullable(timeStamp);
            return this;
        }

        public Builder timeStamp(Optional<Double> timeStamp) {
            Utils.checkNotNull(timeStamp, "timeStamp");
            this.timeStamp = timeStamp;
            return this;
        }

        public Builder maxOffsetAvailable(double maxOffsetAvailable) {
            Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
            this.maxOffsetAvailable = Optional.ofNullable(maxOffsetAvailable);
            return this;
        }

        public Builder maxOffsetAvailable(Optional<Double> maxOffsetAvailable) {
            Utils.checkNotNull(maxOffsetAvailable, "maxOffsetAvailable");
            this.maxOffsetAvailable = maxOffsetAvailable;
            return this;
        }

        public Builder minOffsetAvailable(double minOffsetAvailable) {
            Utils.checkNotNull(minOffsetAvailable, "minOffsetAvailable");
            this.minOffsetAvailable = Optional.ofNullable(minOffsetAvailable);
            return this;
        }

        public Builder minOffsetAvailable(Optional<Double> minOffsetAvailable) {
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

