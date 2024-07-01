/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.Utils;

/**
 * Type - Plex content type to search for
 */
public enum Type {
    ONE(1L),
    TWO(2L),
    THREE(3L),
    FOUR(4L);

    @JsonValue
    private final long value;

    private Type(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}
