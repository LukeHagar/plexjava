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
import java.lang.Long;
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
 * QueryParamType
 * 
 * <p>The type of media to retrieve or filter by.
 * 1 = movie
 * 2 = show
 * 3 = season
 * 4 = episode
 * E.g. A movie library will not return anything with type 3 as there are no seasons for movie libraries
 */
@JsonDeserialize(using = QueryParamType._Deserializer.class)
@JsonSerialize(using = QueryParamType._Serializer.class)
public class QueryParamType {

    public static final QueryParamType Movie = new QueryParamType(1L);
    public static final QueryParamType TvShow = new QueryParamType(2L);
    public static final QueryParamType Season = new QueryParamType(3L);
    public static final QueryParamType Episode = new QueryParamType(4L);
    public static final QueryParamType Audio = new QueryParamType(8L);
    public static final QueryParamType Album = new QueryParamType(9L);
    public static final QueryParamType Track = new QueryParamType(10L);

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<Long, QueryParamType> values = createValuesMap();
    private static final Map<Long, QueryParamTypeEnum> enums = createEnumsMap();

    private final long value;

    private QueryParamType(long value) {
        this.value = value;
    }

    /**
     * Returns a QueryParamType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as QueryParamType
     */ 
    public static QueryParamType of(long value) {
        synchronized (QueryParamType.class) {
            return values.computeIfAbsent(value, v -> new QueryParamType(v));
        }
    }

    public long value() {
        return value;
    }

    public Optional<QueryParamTypeEnum> asEnum() {
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
        QueryParamType other = (QueryParamType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "QueryParamType [value=" + value + "]";
    }

    // return an array just like an enum
    public static QueryParamType[] values() {
        synchronized (QueryParamType.class) {
            return values.values().toArray(new QueryParamType[] {});
        }
    }

    private static final Map<Long, QueryParamType> createValuesMap() {
        Map<Long, QueryParamType> map = new LinkedHashMap<>();
        map.put(1L, Movie);
        map.put(2L, TvShow);
        map.put(3L, Season);
        map.put(4L, Episode);
        map.put(8L, Audio);
        map.put(9L, Album);
        map.put(10L, Track);
        return map;
    }

    private static final Map<Long, QueryParamTypeEnum> createEnumsMap() {
        Map<Long, QueryParamTypeEnum> map = new HashMap<>();
        map.put(1L, QueryParamTypeEnum.Movie);
        map.put(2L, QueryParamTypeEnum.TvShow);
        map.put(3L, QueryParamTypeEnum.Season);
        map.put(4L, QueryParamTypeEnum.Episode);
        map.put(8L, QueryParamTypeEnum.Audio);
        map.put(9L, QueryParamTypeEnum.Album);
        map.put(10L, QueryParamTypeEnum.Track);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<QueryParamType> {

        protected _Serializer() {
            super(QueryParamType.class);
        }

        @Override
        public void serialize(QueryParamType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<QueryParamType> {

        protected _Deserializer() {
            super(QueryParamType.class);
        }

        @Override
        public QueryParamType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            long v = p.readValueAs(new TypeReference<Long>() {});
            // use the factory method to ensure we get singletons
            return QueryParamType.of(v);
        }
    }
    
    public enum QueryParamTypeEnum {

        Movie(1L),
        TvShow(2L),
        Season(3L),
        Episode(4L),
        Audio(8L),
        Album(9L),
        Track(10L),;

        private final long value;

        private QueryParamTypeEnum(long value) {
            this.value = value;
        }

        public long value() {
            return value;
        }
    }
}

