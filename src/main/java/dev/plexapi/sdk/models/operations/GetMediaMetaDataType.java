/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Wrapper class for an "open" enum. "Open" enums are those that are expected
 * to evolve (particularly with the addition of enum members over time). If an
 * open enum is used then the appearance of unexpected enum values (say in a 
 * response from an updated an API) will not bring about a runtime error thus 
 * ensuring that non-updated client versions can continue to work without error.
 *
 * <p>Note that instances are immutable and are singletons (an internal thread-safe
 * cache is maintained to ensure that). As a consequence instances created with the 
 * same value will satisfy reference equality (via {@code ==}).
 * 
 * <p>This class is intended to emulate an enum (in terms of common usage and with 
 * reference equality) but with the ability to carry unknown values. Unfortunately
 * Java does not permit the use of an instance in a switch expression but you can 
 * use the {@code asEnum()} method (after dealing with the `Optional` appropriately).
 *
 */
/**
 * GetMediaMetaDataType
 * 
 * <p>The type of media content in the Plex library. This can represent videos, music, or photos.
 */
@JsonDeserialize(using = GetMediaMetaDataType._Deserializer.class)
@JsonSerialize(using = GetMediaMetaDataType._Serializer.class)
public class GetMediaMetaDataType {

    public static final GetMediaMetaDataType Movie = new GetMediaMetaDataType("movie");
    public static final GetMediaMetaDataType TvShow = new GetMediaMetaDataType("show");
    public static final GetMediaMetaDataType Season = new GetMediaMetaDataType("season");
    public static final GetMediaMetaDataType Episode = new GetMediaMetaDataType("episode");
    public static final GetMediaMetaDataType Artist = new GetMediaMetaDataType("artist");
    public static final GetMediaMetaDataType Album = new GetMediaMetaDataType("album");
    public static final GetMediaMetaDataType Track = new GetMediaMetaDataType("track");
    public static final GetMediaMetaDataType PhotoAlbum = new GetMediaMetaDataType("photoalbum");
    public static final GetMediaMetaDataType Photo = new GetMediaMetaDataType("photo");
    public static final GetMediaMetaDataType Collection = new GetMediaMetaDataType("collection");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, GetMediaMetaDataType> values = createValuesMap();
    private static final Map<String, GetMediaMetaDataTypeEnum> enums = createEnumsMap();

    private final String value;

    private GetMediaMetaDataType(String value) {
        this.value = value;
    }

    /**
     * Returns a GetMediaMetaDataType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as GetMediaMetaDataType
     */ 
    public static GetMediaMetaDataType of(String value) {
        synchronized (GetMediaMetaDataType.class) {
            return values.computeIfAbsent(value, v -> new GetMediaMetaDataType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<GetMediaMetaDataTypeEnum> asEnum() {
        return Optional.ofNullable(enums.getOrDefault(value, null));
    }

    public boolean isKnown() {
        return asEnum().isPresent();
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GetMediaMetaDataType other = (GetMediaMetaDataType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "GetMediaMetaDataType [value=" + value + "]";
    }

    // return an array just like an enum
    public static GetMediaMetaDataType[] values() {
        synchronized (GetMediaMetaDataType.class) {
            return values.values().toArray(new GetMediaMetaDataType[] {});
        }
    }

    private static final Map<String, GetMediaMetaDataType> createValuesMap() {
        Map<String, GetMediaMetaDataType> map = new LinkedHashMap<>();
        map.put("movie", Movie);
        map.put("show", TvShow);
        map.put("season", Season);
        map.put("episode", Episode);
        map.put("artist", Artist);
        map.put("album", Album);
        map.put("track", Track);
        map.put("photoalbum", PhotoAlbum);
        map.put("photo", Photo);
        map.put("collection", Collection);
        return map;
    }

    private static final Map<String, GetMediaMetaDataTypeEnum> createEnumsMap() {
        Map<String, GetMediaMetaDataTypeEnum> map = new HashMap<>();
        map.put("movie", GetMediaMetaDataTypeEnum.Movie);
        map.put("show", GetMediaMetaDataTypeEnum.TvShow);
        map.put("season", GetMediaMetaDataTypeEnum.Season);
        map.put("episode", GetMediaMetaDataTypeEnum.Episode);
        map.put("artist", GetMediaMetaDataTypeEnum.Artist);
        map.put("album", GetMediaMetaDataTypeEnum.Album);
        map.put("track", GetMediaMetaDataTypeEnum.Track);
        map.put("photoalbum", GetMediaMetaDataTypeEnum.PhotoAlbum);
        map.put("photo", GetMediaMetaDataTypeEnum.Photo);
        map.put("collection", GetMediaMetaDataTypeEnum.Collection);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<GetMediaMetaDataType> {

        protected _Serializer() {
            super(GetMediaMetaDataType.class);
        }

        @Override
        public void serialize(GetMediaMetaDataType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<GetMediaMetaDataType> {

        protected _Deserializer() {
            super(GetMediaMetaDataType.class);
        }

        @Override
        public GetMediaMetaDataType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return GetMediaMetaDataType.of(v);
        }
    }
    
    public enum GetMediaMetaDataTypeEnum {

        Movie("movie"),
        TvShow("show"),
        Season("season"),
        Episode("episode"),
        Artist("artist"),
        Album("album"),
        Track("track"),
        PhotoAlbum("photoalbum"),
        Photo("photo"),
        Collection("collection"),;

        private final String value;

        private GetMediaMetaDataTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

