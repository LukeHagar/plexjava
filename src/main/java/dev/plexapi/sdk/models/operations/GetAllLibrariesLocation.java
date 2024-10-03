/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetAllLibrariesLocation {

    @JsonProperty("id")
    private int id;

    @JsonProperty("path")
    private String path;

    @JsonCreator
    public GetAllLibrariesLocation(
            @JsonProperty("id") int id,
            @JsonProperty("path") String path) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(path, "path");
        this.id = id;
        this.path = path;
    }

    @JsonIgnore
    public int id() {
        return id;
    }

    @JsonIgnore
    public String path() {
        return path;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetAllLibrariesLocation withId(int id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetAllLibrariesLocation withPath(String path) {
        Utils.checkNotNull(path, "path");
        this.path = path;
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
        GetAllLibrariesLocation other = (GetAllLibrariesLocation) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.path, other.path);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            path);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllLibrariesLocation.class,
                "id", id,
                "path", path);
    }
    
    public final static class Builder {
 
        private Integer id;
 
        private String path;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(int id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder path(String path) {
            Utils.checkNotNull(path, "path");
            this.path = path;
            return this;
        }
        
        public GetAllLibrariesLocation build() {
            return new GetAllLibrariesLocation(
                id,
                path);
        }
    }
}

