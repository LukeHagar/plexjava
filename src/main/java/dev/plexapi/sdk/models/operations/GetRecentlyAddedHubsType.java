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
 * GetRecentlyAddedHubsType
 * 
 * <p>The type of media content in the Plex library. This can represent videos, music, or photos.
 */
@JsonDeserialize(using = GetRecentlyAddedHubsType._Deserializer.class)
@JsonSerialize(using = GetRecentlyAddedHubsType._Serializer.class)
public class GetRecentlyAddedHubsType {

    public static final GetRecentlyAddedHubsType Movie = new GetRecentlyAddedHubsType("movie");
    public static final GetRecentlyAddedHubsType TvShow = new GetRecentlyAddedHubsType("show");
    public static final GetRecentlyAddedHubsType Season = new GetRecentlyAddedHubsType("season");
    public static final GetRecentlyAddedHubsType Episode = new GetRecentlyAddedHubsType("episode");
    public static final GetRecentlyAddedHubsType Artist = new GetRecentlyAddedHubsType("artist");
    public static final GetRecentlyAddedHubsType Album = new GetRecentlyAddedHubsType("album");
    public static final GetRecentlyAddedHubsType Track = new GetRecentlyAddedHubsType("track");
    public static final GetRecentlyAddedHubsType PhotoAlbum = new GetRecentlyAddedHubsType("photoalbum");
    public static final GetRecentlyAddedHubsType Photo = new GetRecentlyAddedHubsType("photo");
    public static final GetRecentlyAddedHubsType Collection = new GetRecentlyAddedHubsType("collection");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, GetRecentlyAddedHubsType> values = createValuesMap();
    private static final Map<String, GetRecentlyAddedHubsTypeEnum> enums = createEnumsMap();

    private final String value;

    private GetRecentlyAddedHubsType(String value) {
        this.value = value;
    }

    /**
     * Returns a GetRecentlyAddedHubsType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as GetRecentlyAddedHubsType
     */ 
    public static GetRecentlyAddedHubsType of(String value) {
        synchronized (GetRecentlyAddedHubsType.class) {
            return values.computeIfAbsent(value, v -> new GetRecentlyAddedHubsType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<GetRecentlyAddedHubsTypeEnum> asEnum() {
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
        GetRecentlyAddedHubsType other = (GetRecentlyAddedHubsType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "GetRecentlyAddedHubsType [value=" + value + "]";
    }

    // return an array just like an enum
    public static GetRecentlyAddedHubsType[] values() {
        synchronized (GetRecentlyAddedHubsType.class) {
            return values.values().toArray(new GetRecentlyAddedHubsType[] {});
        }
    }

    private static final Map<String, GetRecentlyAddedHubsType> createValuesMap() {
        Map<String, GetRecentlyAddedHubsType> map = new LinkedHashMap<>();
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

    private static final Map<String, GetRecentlyAddedHubsTypeEnum> createEnumsMap() {
        Map<String, GetRecentlyAddedHubsTypeEnum> map = new HashMap<>();
        map.put("movie", GetRecentlyAddedHubsTypeEnum.Movie);
        map.put("show", GetRecentlyAddedHubsTypeEnum.TvShow);
        map.put("season", GetRecentlyAddedHubsTypeEnum.Season);
        map.put("episode", GetRecentlyAddedHubsTypeEnum.Episode);
        map.put("artist", GetRecentlyAddedHubsTypeEnum.Artist);
        map.put("album", GetRecentlyAddedHubsTypeEnum.Album);
        map.put("track", GetRecentlyAddedHubsTypeEnum.Track);
        map.put("photoalbum", GetRecentlyAddedHubsTypeEnum.PhotoAlbum);
        map.put("photo", GetRecentlyAddedHubsTypeEnum.Photo);
        map.put("collection", GetRecentlyAddedHubsTypeEnum.Collection);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<GetRecentlyAddedHubsType> {

        protected _Serializer() {
            super(GetRecentlyAddedHubsType.class);
        }

        @Override
        public void serialize(GetRecentlyAddedHubsType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<GetRecentlyAddedHubsType> {

        protected _Deserializer() {
            super(GetRecentlyAddedHubsType.class);
        }

        @Override
        public GetRecentlyAddedHubsType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return GetRecentlyAddedHubsType.of(v);
        }
    }
    
    public enum GetRecentlyAddedHubsTypeEnum {

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

        private GetRecentlyAddedHubsTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

