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
 * ShowOrdering
 * 
 * <p>Setting that indicates the episode ordering for the show.
 * Options:
 *   - None = Library default
 *   - tmdbAiring = The Movie Database (Aired)
 *   - aired = TheTVDB (Aired)
 *   - dvd = TheTVDB (DVD)
 *   - absolute = TheTVDB (Absolute)
 */
@JsonDeserialize(using = ShowOrdering._Deserializer.class)
@JsonSerialize(using = ShowOrdering._Serializer.class)
public class ShowOrdering {

    public static final ShowOrdering None = new ShowOrdering("None");
    public static final ShowOrdering TmdbAiring = new ShowOrdering("tmdbAiring");
    public static final ShowOrdering TvdbAired = new ShowOrdering("aired");
    public static final ShowOrdering TvdbDvd = new ShowOrdering("dvd");
    public static final ShowOrdering TvdbAbsolute = new ShowOrdering("absolute");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, ShowOrdering> values = createValuesMap();
    private static final Map<String, ShowOrderingEnum> enums = createEnumsMap();

    private final String value;

    private ShowOrdering(String value) {
        this.value = value;
    }

    /**
     * Returns a ShowOrdering with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as ShowOrdering
     */ 
    public static ShowOrdering of(String value) {
        synchronized (ShowOrdering.class) {
            return values.computeIfAbsent(value, v -> new ShowOrdering(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<ShowOrderingEnum> asEnum() {
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
        ShowOrdering other = (ShowOrdering) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "ShowOrdering [value=" + value + "]";
    }

    // return an array just like an enum
    public static ShowOrdering[] values() {
        synchronized (ShowOrdering.class) {
            return values.values().toArray(new ShowOrdering[] {});
        }
    }

    private static final Map<String, ShowOrdering> createValuesMap() {
        Map<String, ShowOrdering> map = new LinkedHashMap<>();
        map.put("None", None);
        map.put("tmdbAiring", TmdbAiring);
        map.put("aired", TvdbAired);
        map.put("dvd", TvdbDvd);
        map.put("absolute", TvdbAbsolute);
        return map;
    }

    private static final Map<String, ShowOrderingEnum> createEnumsMap() {
        Map<String, ShowOrderingEnum> map = new HashMap<>();
        map.put("None", ShowOrderingEnum.None);
        map.put("tmdbAiring", ShowOrderingEnum.TmdbAiring);
        map.put("aired", ShowOrderingEnum.TvdbAired);
        map.put("dvd", ShowOrderingEnum.TvdbDvd);
        map.put("absolute", ShowOrderingEnum.TvdbAbsolute);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<ShowOrdering> {

        protected _Serializer() {
            super(ShowOrdering.class);
        }

        @Override
        public void serialize(ShowOrdering value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<ShowOrdering> {

        protected _Deserializer() {
            super(ShowOrdering.class);
        }

        @Override
        public ShowOrdering deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return ShowOrdering.of(v);
        }
    }
    
    public enum ShowOrderingEnum {

        None("None"),
        TmdbAiring("tmdbAiring"),
        TvdbAired("aired"),
        TvdbDvd("dvd"),
        TvdbAbsolute("absolute"),;

        private final String value;

        private ShowOrderingEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

