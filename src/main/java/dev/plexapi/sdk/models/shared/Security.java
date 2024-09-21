/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.shared;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=X-Plex-Token")
    private Optional<String> accessToken;

    @JsonCreator
    public Security(
            Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
    }
    
    public Security() {
        this(Optional.empty());
    }

    @JsonIgnore
    public Optional<String> accessToken() {
        return accessToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Security withAccessToken(String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = Optional.ofNullable(accessToken);
        return this;
    }

    public Security withAccessToken(Optional<String> accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
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
        Security other = (Security) o;
        return 
            Objects.deepEquals(this.accessToken, other.accessToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            accessToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "accessToken", accessToken);
    }
    
    public final static class Builder {
 
        private Optional<String> accessToken = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessToken(String accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = Optional.ofNullable(accessToken);
            return this;
        }

        public Builder accessToken(Optional<String> accessToken) {
            Utils.checkNotNull(accessToken, "accessToken");
            this.accessToken = accessToken;
            return this;
        }
        
        public Security build() {
            return new Security(
                accessToken);
        }
    }
}

