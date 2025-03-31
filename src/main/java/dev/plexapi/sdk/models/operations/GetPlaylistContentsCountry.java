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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetPlaylistContentsCountry {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<String> tag;

    @JsonCreator
    public GetPlaylistContentsCountry(
            @JsonProperty("tag") Optional<String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
    }
    
    public GetPlaylistContentsCountry() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> tag() {
        return tag;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    public GetPlaylistContentsCountry withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetPlaylistContentsCountry withTag(Optional<String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
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
        GetPlaylistContentsCountry other = (GetPlaylistContentsCountry) o;
        return 
            Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPlaylistContentsCountry.class,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private Optional<String> tag = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = Optional.ofNullable(tag);
            return this;
        }

        public Builder tag(Optional<String> tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }
        
        public GetPlaylistContentsCountry build() {
            return new GetPlaylistContentsCountry(
                tag);
        }
    }
}
