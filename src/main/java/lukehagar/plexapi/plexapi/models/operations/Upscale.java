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
 * Upscale - allow images to be resized beyond native dimensions.
 */
public enum Upscale {
    ZERO(0L),
    ONE(1L);

    @JsonValue
    private final long value;

    private Upscale(long value) {
        this.value = value;
    }
    
    public long value() {
        return value;
    }
}
