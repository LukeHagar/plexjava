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
 * GetSearchAllLibrariesType
 * 
 * <p>The type of media content
 */
@JsonDeserialize(using = GetSearchAllLibrariesType._Deserializer.class)
@JsonSerialize(using = GetSearchAllLibrariesType._Serializer.class)
public class GetSearchAllLibrariesType {

    public static final GetSearchAllLibrariesType Movie = new GetSearchAllLibrariesType("movie");
    public static final GetSearchAllLibrariesType TvShow = new GetSearchAllLibrariesType("show");
    public static final GetSearchAllLibrariesType Season = new GetSearchAllLibrariesType("season");
    public static final GetSearchAllLibrariesType Episode = new GetSearchAllLibrariesType("episode");
    public static final GetSearchAllLibrariesType Artist = new GetSearchAllLibrariesType("artist");
    public static final GetSearchAllLibrariesType Album = new GetSearchAllLibrariesType("album");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, GetSearchAllLibrariesType> values = createValuesMap();
    private static final Map<String, GetSearchAllLibrariesTypeEnum> enums = createEnumsMap();

    private final String value;

    private GetSearchAllLibrariesType(String value) {
        this.value = value;
    }

    /**
     * Returns a GetSearchAllLibrariesType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as GetSearchAllLibrariesType
     */ 
    public static GetSearchAllLibrariesType of(String value) {
        synchronized (GetSearchAllLibrariesType.class) {
            return values.computeIfAbsent(value, v -> new GetSearchAllLibrariesType(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<GetSearchAllLibrariesTypeEnum> asEnum() {
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
        GetSearchAllLibrariesType other = (GetSearchAllLibrariesType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "GetSearchAllLibrariesType [value=" + value + "]";
    }

    // return an array just like an enum
    public static GetSearchAllLibrariesType[] values() {
        synchronized (GetSearchAllLibrariesType.class) {
            return values.values().toArray(new GetSearchAllLibrariesType[] {});
        }
    }

    private static final Map<String, GetSearchAllLibrariesType> createValuesMap() {
        Map<String, GetSearchAllLibrariesType> map = new LinkedHashMap<>();
        map.put("movie", Movie);
        map.put("show", TvShow);
        map.put("season", Season);
        map.put("episode", Episode);
        map.put("artist", Artist);
        map.put("album", Album);
        return map;
    }

    private static final Map<String, GetSearchAllLibrariesTypeEnum> createEnumsMap() {
        Map<String, GetSearchAllLibrariesTypeEnum> map = new HashMap<>();
        map.put("movie", GetSearchAllLibrariesTypeEnum.Movie);
        map.put("show", GetSearchAllLibrariesTypeEnum.TvShow);
        map.put("season", GetSearchAllLibrariesTypeEnum.Season);
        map.put("episode", GetSearchAllLibrariesTypeEnum.Episode);
        map.put("artist", GetSearchAllLibrariesTypeEnum.Artist);
        map.put("album", GetSearchAllLibrariesTypeEnum.Album);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<GetSearchAllLibrariesType> {

        protected _Serializer() {
            super(GetSearchAllLibrariesType.class);
        }

        @Override
        public void serialize(GetSearchAllLibrariesType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<GetSearchAllLibrariesType> {

        protected _Deserializer() {
            super(GetSearchAllLibrariesType.class);
        }

        @Override
        public GetSearchAllLibrariesType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return GetSearchAllLibrariesType.of(v);
        }
    }
    
    public enum GetSearchAllLibrariesTypeEnum {

        Movie("movie"),
        TvShow("show"),
        Season("season"),
        Episode("episode"),
        Artist("artist"),
        Album("album"),;

        private final String value;

        private GetSearchAllLibrariesTypeEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

