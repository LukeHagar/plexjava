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
import java.lang.Integer;
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
 * StreamType
 * 
 * <p>Stream type:
 *   - 1 = video
 *   - 2 = audio
 *   - 3 = subtitle
 */
@JsonDeserialize(using = StreamType._Deserializer.class)
@JsonSerialize(using = StreamType._Serializer.class)
public class StreamType {

    public static final StreamType Video = new StreamType(1);
    public static final StreamType Audio = new StreamType(2);
    public static final StreamType Subtitle = new StreamType(3);

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<Integer, StreamType> values = createValuesMap();
    private static final Map<Integer, StreamTypeEnum> enums = createEnumsMap();

    private final int value;

    private StreamType(int value) {
        this.value = value;
    }

    /**
     * Returns a StreamType with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as StreamType
     */ 
    public static StreamType of(int value) {
        synchronized (StreamType.class) {
            return values.computeIfAbsent(value, v -> new StreamType(v));
        }
    }

    public int value() {
        return value;
    }

    public Optional<StreamTypeEnum> asEnum() {
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
        StreamType other = (StreamType) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "StreamType [value=" + value + "]";
    }

    // return an array just like an enum
    public static StreamType[] values() {
        synchronized (StreamType.class) {
            return values.values().toArray(new StreamType[] {});
        }
    }

    private static final Map<Integer, StreamType> createValuesMap() {
        Map<Integer, StreamType> map = new LinkedHashMap<>();
        map.put(1, Video);
        map.put(2, Audio);
        map.put(3, Subtitle);
        return map;
    }

    private static final Map<Integer, StreamTypeEnum> createEnumsMap() {
        Map<Integer, StreamTypeEnum> map = new HashMap<>();
        map.put(1, StreamTypeEnum.Video);
        map.put(2, StreamTypeEnum.Audio);
        map.put(3, StreamTypeEnum.Subtitle);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<StreamType> {

        protected _Serializer() {
            super(StreamType.class);
        }

        @Override
        public void serialize(StreamType value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<StreamType> {

        protected _Deserializer() {
            super(StreamType.class);
        }

        @Override
        public StreamType deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            int v = p.readValueAs(new TypeReference<Integer>() {});
            // use the factory method to ensure we get singletons
            return StreamType.of(v);
        }
    }
    
    public enum StreamTypeEnum {

        Video(1),
        Audio(2),
        Subtitle(3),;

        private final int value;

        private StreamTypeEnum(int value) {
            this.value = value;
        }

        public int value() {
            return value;
        }
    }
}

