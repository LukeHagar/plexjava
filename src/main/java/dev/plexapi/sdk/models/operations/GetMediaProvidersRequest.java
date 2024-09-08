/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;


public class GetMediaProvidersRequest {

    /**
     * Plex Authentication Token
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=X-Plex-Token")
    private String xPlexToken;

    @JsonCreator
    public GetMediaProvidersRequest(
            String xPlexToken) {
        Utils.checkNotNull(xPlexToken, "xPlexToken");
        this.xPlexToken = xPlexToken;
    }

    /**
     * Plex Authentication Token
     */
    @JsonIgnore
    public String xPlexToken() {
        return xPlexToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Plex Authentication Token
     */
    public GetMediaProvidersRequest withXPlexToken(String xPlexToken) {
        Utils.checkNotNull(xPlexToken, "xPlexToken");
        this.xPlexToken = xPlexToken;
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
        GetMediaProvidersRequest other = (GetMediaProvidersRequest) o;
        return 
            Objects.deepEquals(this.xPlexToken, other.xPlexToken);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            xPlexToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMediaProvidersRequest.class,
                "xPlexToken", xPlexToken);
    }
    
    public final static class Builder {
 
        private String xPlexToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Plex Authentication Token
         */
        public Builder xPlexToken(String xPlexToken) {
            Utils.checkNotNull(xPlexToken, "xPlexToken");
            this.xPlexToken = xPlexToken;
            return this;
        }
        
        public GetMediaProvidersRequest build() {
            return new GetMediaProvidersRequest(
                xPlexToken);
        }
    }
}

