/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class MarkUnplayedRequest {

    /**
     * The media key to mark as Unplayed
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=key")
    private double key;

    @JsonCreator
    public MarkUnplayedRequest(
            double key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
    }

    /**
     * The media key to mark as Unplayed
     */
    @JsonIgnore
    public double key() {
        return key;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The media key to mark as Unplayed
     */
    public MarkUnplayedRequest withKey(double key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
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
        MarkUnplayedRequest other = (MarkUnplayedRequest) o;
        return 
            Objects.deepEquals(this.key, other.key);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            key);
    }
    
    @Override
    public String toString() {
        return Utils.toString(MarkUnplayedRequest.class,
                "key", key);
    }
    
    public final static class Builder {
 
        private Double key;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The media key to mark as Unplayed
         */
        public Builder key(double key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }
        
        public MarkUnplayedRequest build() {
            return new MarkUnplayedRequest(
                key);
        }
    }
}

