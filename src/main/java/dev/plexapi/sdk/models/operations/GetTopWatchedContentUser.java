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


public class GetTopWatchedContentUser {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<Integer> id;

    @JsonCreator
    public GetTopWatchedContentUser(
            @JsonProperty("id") Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
    }
    
    public GetTopWatchedContentUser() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> id() {
        return id;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetTopWatchedContentUser withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public GetTopWatchedContentUser withId(Optional<Integer> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
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
        GetTopWatchedContentUser other = (GetTopWatchedContentUser) o;
        return 
            Objects.deepEquals(this.id, other.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTopWatchedContentUser.class,
                "id", id);
    }
    
    public final static class Builder {
 
        private Optional<Integer> id = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<Integer> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }
        
        public GetTopWatchedContentUser build() {
            return new GetTopWatchedContentUser(
                id);
        }
    }
}

