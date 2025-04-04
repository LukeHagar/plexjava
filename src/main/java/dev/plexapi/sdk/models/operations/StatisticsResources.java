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
import java.lang.Float;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class StatisticsResources {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("timespan")
    private Optional<Long> timespan;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("at")
    private Optional<Long> at;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hostCpuUtilization")
    private Optional<Float> hostCpuUtilization;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("processCpuUtilization")
    private Optional<Float> processCpuUtilization;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hostMemoryUtilization")
    private Optional<Float> hostMemoryUtilization;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("processMemoryUtilization")
    private Optional<Float> processMemoryUtilization;

    @JsonCreator
    public StatisticsResources(
            @JsonProperty("timespan") Optional<Long> timespan,
            @JsonProperty("at") Optional<Long> at,
            @JsonProperty("hostCpuUtilization") Optional<Float> hostCpuUtilization,
            @JsonProperty("processCpuUtilization") Optional<Float> processCpuUtilization,
            @JsonProperty("hostMemoryUtilization") Optional<Float> hostMemoryUtilization,
            @JsonProperty("processMemoryUtilization") Optional<Float> processMemoryUtilization) {
        Utils.checkNotNull(timespan, "timespan");
        Utils.checkNotNull(at, "at");
        Utils.checkNotNull(hostCpuUtilization, "hostCpuUtilization");
        Utils.checkNotNull(processCpuUtilization, "processCpuUtilization");
        Utils.checkNotNull(hostMemoryUtilization, "hostMemoryUtilization");
        Utils.checkNotNull(processMemoryUtilization, "processMemoryUtilization");
        this.timespan = timespan;
        this.at = at;
        this.hostCpuUtilization = hostCpuUtilization;
        this.processCpuUtilization = processCpuUtilization;
        this.hostMemoryUtilization = hostMemoryUtilization;
        this.processMemoryUtilization = processMemoryUtilization;
    }
    
    public StatisticsResources() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Long> timespan() {
        return timespan;
    }

    @JsonIgnore
    public Optional<Long> at() {
        return at;
    }

    @JsonIgnore
    public Optional<Float> hostCpuUtilization() {
        return hostCpuUtilization;
    }

    @JsonIgnore
    public Optional<Float> processCpuUtilization() {
        return processCpuUtilization;
    }

    @JsonIgnore
    public Optional<Float> hostMemoryUtilization() {
        return hostMemoryUtilization;
    }

    @JsonIgnore
    public Optional<Float> processMemoryUtilization() {
        return processMemoryUtilization;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public StatisticsResources withTimespan(long timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = Optional.ofNullable(timespan);
        return this;
    }

    public StatisticsResources withTimespan(Optional<Long> timespan) {
        Utils.checkNotNull(timespan, "timespan");
        this.timespan = timespan;
        return this;
    }

    public StatisticsResources withAt(long at) {
        Utils.checkNotNull(at, "at");
        this.at = Optional.ofNullable(at);
        return this;
    }

    public StatisticsResources withAt(Optional<Long> at) {
        Utils.checkNotNull(at, "at");
        this.at = at;
        return this;
    }

    public StatisticsResources withHostCpuUtilization(float hostCpuUtilization) {
        Utils.checkNotNull(hostCpuUtilization, "hostCpuUtilization");
        this.hostCpuUtilization = Optional.ofNullable(hostCpuUtilization);
        return this;
    }

    public StatisticsResources withHostCpuUtilization(Optional<Float> hostCpuUtilization) {
        Utils.checkNotNull(hostCpuUtilization, "hostCpuUtilization");
        this.hostCpuUtilization = hostCpuUtilization;
        return this;
    }

    public StatisticsResources withProcessCpuUtilization(float processCpuUtilization) {
        Utils.checkNotNull(processCpuUtilization, "processCpuUtilization");
        this.processCpuUtilization = Optional.ofNullable(processCpuUtilization);
        return this;
    }

    public StatisticsResources withProcessCpuUtilization(Optional<Float> processCpuUtilization) {
        Utils.checkNotNull(processCpuUtilization, "processCpuUtilization");
        this.processCpuUtilization = processCpuUtilization;
        return this;
    }

    public StatisticsResources withHostMemoryUtilization(float hostMemoryUtilization) {
        Utils.checkNotNull(hostMemoryUtilization, "hostMemoryUtilization");
        this.hostMemoryUtilization = Optional.ofNullable(hostMemoryUtilization);
        return this;
    }

    public StatisticsResources withHostMemoryUtilization(Optional<Float> hostMemoryUtilization) {
        Utils.checkNotNull(hostMemoryUtilization, "hostMemoryUtilization");
        this.hostMemoryUtilization = hostMemoryUtilization;
        return this;
    }

    public StatisticsResources withProcessMemoryUtilization(float processMemoryUtilization) {
        Utils.checkNotNull(processMemoryUtilization, "processMemoryUtilization");
        this.processMemoryUtilization = Optional.ofNullable(processMemoryUtilization);
        return this;
    }

    public StatisticsResources withProcessMemoryUtilization(Optional<Float> processMemoryUtilization) {
        Utils.checkNotNull(processMemoryUtilization, "processMemoryUtilization");
        this.processMemoryUtilization = processMemoryUtilization;
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
        StatisticsResources other = (StatisticsResources) o;
        return 
            Objects.deepEquals(this.timespan, other.timespan) &&
            Objects.deepEquals(this.at, other.at) &&
            Objects.deepEquals(this.hostCpuUtilization, other.hostCpuUtilization) &&
            Objects.deepEquals(this.processCpuUtilization, other.processCpuUtilization) &&
            Objects.deepEquals(this.hostMemoryUtilization, other.hostMemoryUtilization) &&
            Objects.deepEquals(this.processMemoryUtilization, other.processMemoryUtilization);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            timespan,
            at,
            hostCpuUtilization,
            processCpuUtilization,
            hostMemoryUtilization,
            processMemoryUtilization);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StatisticsResources.class,
                "timespan", timespan,
                "at", at,
                "hostCpuUtilization", hostCpuUtilization,
                "processCpuUtilization", processCpuUtilization,
                "hostMemoryUtilization", hostMemoryUtilization,
                "processMemoryUtilization", processMemoryUtilization);
    }
    
    public final static class Builder {
 
        private Optional<Long> timespan = Optional.empty();
 
        private Optional<Long> at = Optional.empty();
 
        private Optional<Float> hostCpuUtilization = Optional.empty();
 
        private Optional<Float> processCpuUtilization = Optional.empty();
 
        private Optional<Float> hostMemoryUtilization = Optional.empty();
 
        private Optional<Float> processMemoryUtilization = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder timespan(long timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = Optional.ofNullable(timespan);
            return this;
        }

        public Builder timespan(Optional<Long> timespan) {
            Utils.checkNotNull(timespan, "timespan");
            this.timespan = timespan;
            return this;
        }

        public Builder at(long at) {
            Utils.checkNotNull(at, "at");
            this.at = Optional.ofNullable(at);
            return this;
        }

        public Builder at(Optional<Long> at) {
            Utils.checkNotNull(at, "at");
            this.at = at;
            return this;
        }

        public Builder hostCpuUtilization(float hostCpuUtilization) {
            Utils.checkNotNull(hostCpuUtilization, "hostCpuUtilization");
            this.hostCpuUtilization = Optional.ofNullable(hostCpuUtilization);
            return this;
        }

        public Builder hostCpuUtilization(Optional<Float> hostCpuUtilization) {
            Utils.checkNotNull(hostCpuUtilization, "hostCpuUtilization");
            this.hostCpuUtilization = hostCpuUtilization;
            return this;
        }

        public Builder processCpuUtilization(float processCpuUtilization) {
            Utils.checkNotNull(processCpuUtilization, "processCpuUtilization");
            this.processCpuUtilization = Optional.ofNullable(processCpuUtilization);
            return this;
        }

        public Builder processCpuUtilization(Optional<Float> processCpuUtilization) {
            Utils.checkNotNull(processCpuUtilization, "processCpuUtilization");
            this.processCpuUtilization = processCpuUtilization;
            return this;
        }

        public Builder hostMemoryUtilization(float hostMemoryUtilization) {
            Utils.checkNotNull(hostMemoryUtilization, "hostMemoryUtilization");
            this.hostMemoryUtilization = Optional.ofNullable(hostMemoryUtilization);
            return this;
        }

        public Builder hostMemoryUtilization(Optional<Float> hostMemoryUtilization) {
            Utils.checkNotNull(hostMemoryUtilization, "hostMemoryUtilization");
            this.hostMemoryUtilization = hostMemoryUtilization;
            return this;
        }

        public Builder processMemoryUtilization(float processMemoryUtilization) {
            Utils.checkNotNull(processMemoryUtilization, "processMemoryUtilization");
            this.processMemoryUtilization = Optional.ofNullable(processMemoryUtilization);
            return this;
        }

        public Builder processMemoryUtilization(Optional<Float> processMemoryUtilization) {
            Utils.checkNotNull(processMemoryUtilization, "processMemoryUtilization");
            this.processMemoryUtilization = processMemoryUtilization;
            return this;
        }
        
        public StatisticsResources build() {
            return new StatisticsResources(
                timespan,
                at,
                hostCpuUtilization,
                processCpuUtilization,
                hostMemoryUtilization,
                processMemoryUtilization);
        }
    }
}
