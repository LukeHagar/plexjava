/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import dev.plexapi.sdk.utils.OneOfDeserializer;
import dev.plexapi.sdk.utils.TypedObject;
import dev.plexapi.sdk.utils.Utils.JsonShape;
import dev.plexapi.sdk.utils.Utils.TypeReferenceWithShape;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;

/**
 * GetAllMediaLibraryOptimizedForStreaming - Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
 */

@JsonDeserialize(using = GetAllMediaLibraryOptimizedForStreaming._Deserializer.class)
public class GetAllMediaLibraryOptimizedForStreaming {

    @JsonValue
    private TypedObject value;
    
    private GetAllMediaLibraryOptimizedForStreaming(TypedObject value) {
        this.value = value;
    }

    public static GetAllMediaLibraryOptimizedForStreaming of(One value) {
        Utils.checkNotNull(value, "value");
        return new GetAllMediaLibraryOptimizedForStreaming(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<One>(){}));
    }

    public static GetAllMediaLibraryOptimizedForStreaming of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new GetAllMediaLibraryOptimizedForStreaming(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code dev.plexapi.sdk.models.operations.One}</li>
     * <li>{@code boolean}</li>
     * </ul>
     * 
     * <p>Use {@code instanceof} to determine what type is returned. For example:
     * 
     * <pre>
     * if (obj.value() instanceof String) {
     *     String answer = (String) obj.value();
     *     System.out.println("answer=" + answer);
     * }
     * </pre>
     * 
     * @return value of oneOf type
     **/ 
    public java.lang.Object value() {
        return value.value();
    }    
    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAllMediaLibraryOptimizedForStreaming other = (GetAllMediaLibraryOptimizedForStreaming) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<GetAllMediaLibraryOptimizedForStreaming> {

        public _Deserializer() {
            super(GetAllMediaLibraryOptimizedForStreaming.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<One>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetAllMediaLibraryOptimizedForStreaming.class,
                "value", value);
    }
 
}
