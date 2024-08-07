/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class GetServerListMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Double> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Server")
    private Optional<? extends java.util.List<GetServerListServer>> server;

    @JsonCreator
    public GetServerListMediaContainer(
            @JsonProperty("size") Optional<? extends Double> size,
            @JsonProperty("Server") Optional<? extends java.util.List<GetServerListServer>> server) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(server, "server");
        this.size = size;
        this.server = server;
    }
    
    public GetServerListMediaContainer() {
        this(Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> size() {
        return (Optional<Double>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<GetServerListServer>> server() {
        return (Optional<java.util.List<GetServerListServer>>) server;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetServerListMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetServerListMediaContainer withSize(Optional<? extends Double> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetServerListMediaContainer withServer(java.util.List<GetServerListServer> server) {
        Utils.checkNotNull(server, "server");
        this.server = Optional.ofNullable(server);
        return this;
    }

    public GetServerListMediaContainer withServer(Optional<? extends java.util.List<GetServerListServer>> server) {
        Utils.checkNotNull(server, "server");
        this.server = server;
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
        GetServerListMediaContainer other = (GetServerListMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.server, other.server);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            server);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetServerListMediaContainer.class,
                "size", size,
                "server", server);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> size = Optional.empty();
 
        private Optional<? extends java.util.List<GetServerListServer>> server = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<? extends Double> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder server(java.util.List<GetServerListServer> server) {
            Utils.checkNotNull(server, "server");
            this.server = Optional.ofNullable(server);
            return this;
        }

        public Builder server(Optional<? extends java.util.List<GetServerListServer>> server) {
            Utils.checkNotNull(server, "server");
            this.server = server;
            return this;
        }
        
        public GetServerListMediaContainer build() {
            return new GetServerListMediaContainer(
                size,
                server);
        }
    }
}

