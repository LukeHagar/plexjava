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

public class LogLineRequest {

    /**
     * An integer log level to write to the PMS log with.  
     * 0: Error  
     * 1: Warning  
     * 2: Info  
     * 3: Debug  
     * 4: Verbose
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=level")
    private Level level;

    /**
     * The text of the message to write to the log.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=message")
    private String message;

    /**
     * a string indicating the source of the message.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=source")
    private String source;

    @JsonCreator
    public LogLineRequest(
            Level level,
            String message,
            String source) {
        Utils.checkNotNull(level, "level");
        Utils.checkNotNull(message, "message");
        Utils.checkNotNull(source, "source");
        this.level = level;
        this.message = message;
        this.source = source;
    }

    /**
     * An integer log level to write to the PMS log with.  
     * 0: Error  
     * 1: Warning  
     * 2: Info  
     * 3: Debug  
     * 4: Verbose
     * 
     */
    @JsonIgnore
    public Level level() {
        return level;
    }

    /**
     * The text of the message to write to the log.
     */
    @JsonIgnore
    public String message() {
        return message;
    }

    /**
     * a string indicating the source of the message.
     */
    @JsonIgnore
    public String source() {
        return source;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * An integer log level to write to the PMS log with.  
     * 0: Error  
     * 1: Warning  
     * 2: Info  
     * 3: Debug  
     * 4: Verbose
     * 
     */
    public LogLineRequest withLevel(Level level) {
        Utils.checkNotNull(level, "level");
        this.level = level;
        return this;
    }

    /**
     * The text of the message to write to the log.
     */
    public LogLineRequest withMessage(String message) {
        Utils.checkNotNull(message, "message");
        this.message = message;
        return this;
    }

    /**
     * a string indicating the source of the message.
     */
    public LogLineRequest withSource(String source) {
        Utils.checkNotNull(source, "source");
        this.source = source;
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
        LogLineRequest other = (LogLineRequest) o;
        return 
            java.util.Objects.deepEquals(this.level, other.level) &&
            java.util.Objects.deepEquals(this.message, other.message) &&
            java.util.Objects.deepEquals(this.source, other.source);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            level,
            message,
            source);
    }
    
    @Override
    public String toString() {
        return Utils.toString(LogLineRequest.class,
                "level", level,
                "message", message,
                "source", source);
    }
    
    public final static class Builder {
 
        private Level level;
 
        private String message;
 
        private String source;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * An integer log level to write to the PMS log with.  
         * 0: Error  
         * 1: Warning  
         * 2: Info  
         * 3: Debug  
         * 4: Verbose
         * 
         */
        public Builder level(Level level) {
            Utils.checkNotNull(level, "level");
            this.level = level;
            return this;
        }

        /**
         * The text of the message to write to the log.
         */
        public Builder message(String message) {
            Utils.checkNotNull(message, "message");
            this.message = message;
            return this;
        }

        /**
         * a string indicating the source of the message.
         */
        public Builder source(String source) {
            Utils.checkNotNull(source, "source");
            this.source = source;
            return this;
        }
        
        public LogLineRequest build() {
            return new LogLineRequest(
                level,
                message,
                source);
        }
    }
}
