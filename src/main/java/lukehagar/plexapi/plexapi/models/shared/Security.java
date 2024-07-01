/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.shared;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class Security {

    @SpeakeasyMetadata("security:scheme=true,type=apiKey,subtype=header,name=X-Plex-Token")
    private String accessToken;

    @JsonCreator
    public Security(
            String accessToken) {
        Utils.checkNotNull(accessToken, "accessToken");
        this.accessToken = accessToken;
    }

    @JsonIgnore
    public String accessToken() {
        return accessToken;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Security withAccessToken(String accessToken) {
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
            java.util.Objects.deepEquals(this.accessToken, other.accessToken);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            accessToken);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Security.class,
                "accessToken", accessToken);
    }
    
    public final static class Builder {
 
        private String accessToken;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder accessToken(String accessToken) {
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
