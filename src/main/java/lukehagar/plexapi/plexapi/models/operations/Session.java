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


public class Session {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("bandwidth")
    private Optional<? extends Integer> bandwidth;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<? extends String> location;

    public Session(
            @JsonProperty("id") Optional<? extends String> id,
            @JsonProperty("bandwidth") Optional<? extends Integer> bandwidth,
            @JsonProperty("location") Optional<? extends String> location) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(bandwidth, "bandwidth");
        Utils.checkNotNull(location, "location");
        this.id = id;
        this.bandwidth = bandwidth;
        this.location = location;
    }

    public Optional<? extends String> id() {
        return id;
    }

    public Optional<? extends Integer> bandwidth() {
        return bandwidth;
    }

    public Optional<? extends String> location() {
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

    public Session withId(Optional<? extends String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Session withBandwidth(int bandwidth) {
        Utils.checkNotNull(bandwidth, "bandwidth");
        this.bandwidth = Optional.ofNullable(bandwidth);
        return this;
    }

    public Session withBandwidth(Optional<? extends Integer> bandwidth) {
        Utils.checkNotNull(bandwidth, "bandwidth");
        this.bandwidth = bandwidth;
        return this;
    }

    public Session withLocation(String location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public Session withLocation(Optional<? extends String> location) {
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
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.bandwidth, other.bandwidth) &&
            java.util.Objects.deepEquals(this.location, other.location);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
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
 
        private Optional<? extends String> id = Optional.empty();
 
        private Optional<? extends Integer> bandwidth = Optional.empty();
 
        private Optional<? extends String> location = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<? extends String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder bandwidth(int bandwidth) {
            Utils.checkNotNull(bandwidth, "bandwidth");
            this.bandwidth = Optional.ofNullable(bandwidth);
            return this;
        }

        public Builder bandwidth(Optional<? extends Integer> bandwidth) {
            Utils.checkNotNull(bandwidth, "bandwidth");
            this.bandwidth = bandwidth;
            return this;
        }

        public Builder location(String location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<? extends String> location) {
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

