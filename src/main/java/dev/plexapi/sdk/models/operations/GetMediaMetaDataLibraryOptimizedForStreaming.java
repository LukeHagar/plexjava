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
 * GetMediaMetaDataLibraryOptimizedForStreaming - Has this media been optimized for streaming. NOTE: This can be 0, 1, false or true
 */

@JsonDeserialize(using = GetMediaMetaDataLibraryOptimizedForStreaming._Deserializer.class)
public class GetMediaMetaDataLibraryOptimizedForStreaming {

    @JsonValue
    private TypedObject value;
    
    private GetMediaMetaDataLibraryOptimizedForStreaming(TypedObject value) {
        this.value = value;
    }

    public static GetMediaMetaDataLibraryOptimizedForStreaming of(GetMediaMetaDataOptimizedForStreaming1 value) {
        Utils.checkNotNull(value, "value");
        return new GetMediaMetaDataLibraryOptimizedForStreaming(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<GetMediaMetaDataOptimizedForStreaming1>(){}));
    }

    public static GetMediaMetaDataLibraryOptimizedForStreaming of(boolean value) {
        Utils.checkNotNull(value, "value");
        return new GetMediaMetaDataLibraryOptimizedForStreaming(TypedObject.of(value, JsonShape.DEFAULT, new TypeReference<java.lang.Boolean>(){}));
    }
    
    /**
     * Returns an instance of one of these types:
     * <ul>
     * <li>{@code dev.plexapi.sdk.models.operations.GetMediaMetaDataOptimizedForStreaming1}</li>
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
        GetMediaMetaDataLibraryOptimizedForStreaming other = (GetMediaMetaDataLibraryOptimizedForStreaming) o;
        return Objects.deepEquals(this.value.value(), other.value.value()); 
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(value.value());
    }
    
    @SuppressWarnings("serial")
    public static final class _Deserializer extends OneOfDeserializer<GetMediaMetaDataLibraryOptimizedForStreaming> {

        public _Deserializer() {
            super(GetMediaMetaDataLibraryOptimizedForStreaming.class, false,
                  TypeReferenceWithShape.of(new TypeReference<Boolean>() {}, JsonShape.DEFAULT),
                  TypeReferenceWithShape.of(new TypeReference<GetMediaMetaDataOptimizedForStreaming1>() {}, JsonShape.DEFAULT));
        }
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMediaMetaDataLibraryOptimizedForStreaming.class,
                "value", value);
    }
 
}
