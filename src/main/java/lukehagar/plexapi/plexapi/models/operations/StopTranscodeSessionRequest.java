/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class StopTranscodeSessionRequest {

    /**
     * the Key of the transcode session to stop
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=sessionKey")
    private String sessionKey;

    @JsonCreator
    public StopTranscodeSessionRequest(
            String sessionKey) {
        Utils.checkNotNull(sessionKey, "sessionKey");
        this.sessionKey = sessionKey;
    }

    /**
     * the Key of the transcode session to stop
     */
    @JsonIgnore
    public String sessionKey() {
        return sessionKey;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * the Key of the transcode session to stop
     */
    public StopTranscodeSessionRequest withSessionKey(String sessionKey) {
        Utils.checkNotNull(sessionKey, "sessionKey");
        this.sessionKey = sessionKey;
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
        StopTranscodeSessionRequest other = (StopTranscodeSessionRequest) o;
        return 
            java.util.Objects.deepEquals(this.sessionKey, other.sessionKey);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sessionKey);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StopTranscodeSessionRequest.class,
                "sessionKey", sessionKey);
    }
    
    public final static class Builder {
 
        private String sessionKey;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * the Key of the transcode session to stop
         */
        public Builder sessionKey(String sessionKey) {
            Utils.checkNotNull(sessionKey, "sessionKey");
            this.sessionKey = sessionKey;
            return this;
        }
        
        public StopTranscodeSessionRequest build() {
            return new StopTranscodeSessionRequest(
                sessionKey);
        }
    }
}
