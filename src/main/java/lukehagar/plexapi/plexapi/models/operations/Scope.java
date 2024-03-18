/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.Utils;

/**
 * Scope - `all` - This is the only supported `scope` parameter.
 */
public enum Scope {
    ALL("all");

    @JsonValue
    private final String value;

    private Scope(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}
