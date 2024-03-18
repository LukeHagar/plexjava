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

/**
 * DeletePlaylistResponseBody - Unauthorized - Returned if the X-Plex-Token is missing from the header or query.
 */

public class DeletePlaylistResponseBody {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("errors")
    private Optional<? extends java.util.List<DeletePlaylistErrors>> errors;

    public DeletePlaylistResponseBody(
            @JsonProperty("errors") Optional<? extends java.util.List<DeletePlaylistErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
    }

    public Optional<? extends java.util.List<DeletePlaylistErrors>> errors() {
        return errors;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public DeletePlaylistResponseBody withErrors(java.util.List<DeletePlaylistErrors> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = Optional.ofNullable(errors);
        return this;
    }

    public DeletePlaylistResponseBody withErrors(Optional<? extends java.util.List<DeletePlaylistErrors>> errors) {
        Utils.checkNotNull(errors, "errors");
        this.errors = errors;
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
        DeletePlaylistResponseBody other = (DeletePlaylistResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.errors, other.errors);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            errors);
    }
    
    @Override
    public String toString() {
        return Utils.toString(DeletePlaylistResponseBody.class,
                "errors", errors);
    }
    
    public final static class Builder {
 
        private Optional<? extends java.util.List<DeletePlaylistErrors>> errors = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder errors(java.util.List<DeletePlaylistErrors> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = Optional.ofNullable(errors);
            return this;
        }

        public Builder errors(Optional<? extends java.util.List<DeletePlaylistErrors>> errors) {
            Utils.checkNotNull(errors, "errors");
            this.errors = errors;
            return this;
        }
        
        public DeletePlaylistResponseBody build() {
            return new DeletePlaylistResponseBody(
                errors);
        }
    }
}

