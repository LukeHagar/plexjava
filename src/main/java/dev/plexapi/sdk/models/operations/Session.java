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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class Session {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bandwidth")
    private Optional<Integer> bandwidth;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<String> location;

    @JsonCreator
    public Session(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("bandwidth") Optional<Integer> bandwidth,
            @JsonProperty("location") Optional<String> location) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(bandwidth, "bandwidth");
        Utils.checkNotNull(location, "location");
        this.id = id;
        this.bandwidth = bandwidth;
        this.location = location;
    }
    
    public Session() {
        this(Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<Integer> bandwidth() {
        return bandwidth;
    }

    @JsonIgnore
    public Optional<String> location() {
        return location;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public Session withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Session withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Session withBandwidth(int bandwidth) {
        Utils.checkNotNull(bandwidth, "bandwidth");
        this.bandwidth = Optional.ofNullable(bandwidth);
        return this;
    }

    public Session withBandwidth(Optional<Integer> bandwidth) {
        Utils.checkNotNull(bandwidth, "bandwidth");
        this.bandwidth = bandwidth;
        return this;
    }

    public Session withLocation(String location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public Session withLocation(Optional<String> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
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
        Session other = (Session) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.bandwidth, other.bandwidth) &&
            Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            bandwidth,
            location);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Session.class,
                "id", id,
                "bandwidth", bandwidth,
                "location", location);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<Integer> bandwidth = Optional.empty();
 
        private Optional<String> location = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder bandwidth(int bandwidth) {
            Utils.checkNotNull(bandwidth, "bandwidth");
            this.bandwidth = Optional.ofNullable(bandwidth);
            return this;
        }

        public Builder bandwidth(Optional<Integer> bandwidth) {
            Utils.checkNotNull(bandwidth, "bandwidth");
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder location(String location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<String> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }
        
        public Session build() {
            return new Session(
                id,
                bandwidth,
                location);
        }
    }
}
