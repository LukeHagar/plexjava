/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class GetLibraryHubsDirector {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tag")
    private Optional<? extends String> tag;

    @JsonCreator
    public GetLibraryHubsDirector(
            @JsonProperty("tag") Optional<? extends String> tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = tag;
    }
    
    public GetLibraryHubsDirector() {
        this(Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> tag() {
        return (Optional<String>) tag;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetLibraryHubsDirector withTag(String tag) {
        Utils.checkNotNull(tag, "tag");
        this.tag = Optional.ofNullable(tag);
        return this;
    }

    public GetLibraryHubsDirector withTag(Optional<? extends String> tag) {
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
        GetLibraryHubsDirector other = (GetLibraryHubsDirector) o;
        return 
            java.util.Objects.deepEquals(this.tag, other.tag);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            tag);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetLibraryHubsDirector.class,
                "tag", tag);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> tag = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder tag(String tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = Optional.ofNullable(tag);
            return this;
        }

        public Builder tag(Optional<? extends String> tag) {
            Utils.checkNotNull(tag, "tag");
            this.tag = tag;
            return this;
        }
        
        public GetLibraryHubsDirector build() {
            return new GetLibraryHubsDirector(
                tag);
        }
    }
}

