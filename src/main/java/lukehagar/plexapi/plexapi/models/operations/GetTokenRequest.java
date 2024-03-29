/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;


public class GetTokenRequest {

    /**
     * The PinID to retrieve an access token for
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=pinID")
    private String pinID;

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=X-Plex-Client-Identifier")
    private String xPlexClientIdentifier;

    public GetTokenRequest(
            String pinID,
            String xPlexClientIdentifier) {
        Utils.checkNotNull(pinID, "pinID");
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.pinID = pinID;
        this.xPlexClientIdentifier = xPlexClientIdentifier;
    }

    /**
     * The PinID to retrieve an access token for
     */
    public String pinID() {
        return pinID;
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    public String xPlexClientIdentifier() {
        return xPlexClientIdentifier;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The PinID to retrieve an access token for
     */
    public GetTokenRequest withPinID(String pinID) {
        Utils.checkNotNull(pinID, "pinID");
        this.pinID = pinID;
        return this;
    }

    /**
     * The unique identifier for the client application
     * This is used to track the client application and its usage
     * (UUID, serial number, or other number unique per device)
     * 
     */
    public GetTokenRequest withXPlexClientIdentifier(String xPlexClientIdentifier) {
        Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
        this.xPlexClientIdentifier = xPlexClientIdentifier;
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
        GetTokenRequest other = (GetTokenRequest) o;
        return 
            java.util.Objects.deepEquals(this.pinID, other.pinID) &&
            java.util.Objects.deepEquals(this.xPlexClientIdentifier, other.xPlexClientIdentifier);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            pinID,
            xPlexClientIdentifier);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTokenRequest.class,
                "pinID", pinID,
                "xPlexClientIdentifier", xPlexClientIdentifier);
    }
    
    public final static class Builder {
 
        private String pinID;
 
        private String xPlexClientIdentifier;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The PinID to retrieve an access token for
         */
        public Builder pinID(String pinID) {
            Utils.checkNotNull(pinID, "pinID");
            this.pinID = pinID;
            return this;
        }

        /**
         * The unique identifier for the client application
         * This is used to track the client application and its usage
         * (UUID, serial number, or other number unique per device)
         * 
         */
        public Builder xPlexClientIdentifier(String xPlexClientIdentifier) {
            Utils.checkNotNull(xPlexClientIdentifier, "xPlexClientIdentifier");
            this.xPlexClientIdentifier = xPlexClientIdentifier;
            return this;
        }
        
        public GetTokenRequest build() {
            return new GetTokenRequest(
                pinID,
                xPlexClientIdentifier);
        }
    }
}

