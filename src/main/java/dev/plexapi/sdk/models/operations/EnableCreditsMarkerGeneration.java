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
 * EnableCreditsMarkerGeneration
 * 
 * <p>Setting that indicates if credits markers detection is enabled. (-1 = Library default, 0 = Disabled).
 */
@JsonDeserialize(using = EnableCreditsMarkerGeneration._Deserializer.class)
@JsonSerialize(using = EnableCreditsMarkerGeneration._Serializer.class)
public class EnableCreditsMarkerGeneration {

    public static final EnableCreditsMarkerGeneration LibraryDefault = new EnableCreditsMarkerGeneration("-1");
    public static final EnableCreditsMarkerGeneration Disabled = new EnableCreditsMarkerGeneration("0");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, EnableCreditsMarkerGeneration> values = createValuesMap();
    private static final Map<String, EnableCreditsMarkerGenerationEnum> enums = createEnumsMap();

    private final String value;

    private EnableCreditsMarkerGeneration(String value) {
        this.value = value;
    }

    /**
     * Returns a EnableCreditsMarkerGeneration with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as EnableCreditsMarkerGeneration
     */ 
    public static EnableCreditsMarkerGeneration of(String value) {
        synchronized (EnableCreditsMarkerGeneration.class) {
            return values.computeIfAbsent(value, v -> new EnableCreditsMarkerGeneration(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<EnableCreditsMarkerGenerationEnum> asEnum() {
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
        EnableCreditsMarkerGeneration other = (EnableCreditsMarkerGeneration) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "EnableCreditsMarkerGeneration [value=" + value + "]";
    }

    // return an array just like an enum
    public static EnableCreditsMarkerGeneration[] values() {
        synchronized (EnableCreditsMarkerGeneration.class) {
            return values.values().toArray(new EnableCreditsMarkerGeneration[] {});
        }
    }

    private static final Map<String, EnableCreditsMarkerGeneration> createValuesMap() {
        Map<String, EnableCreditsMarkerGeneration> map = new LinkedHashMap<>();
        map.put("-1", LibraryDefault);
        map.put("0", Disabled);
        return map;
    }

    private static final Map<String, EnableCreditsMarkerGenerationEnum> createEnumsMap() {
        Map<String, EnableCreditsMarkerGenerationEnum> map = new HashMap<>();
        map.put("-1", EnableCreditsMarkerGenerationEnum.LibraryDefault);
        map.put("0", EnableCreditsMarkerGenerationEnum.Disabled);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<EnableCreditsMarkerGeneration> {

        protected _Serializer() {
            super(EnableCreditsMarkerGeneration.class);
        }

        @Override
        public void serialize(EnableCreditsMarkerGeneration value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<EnableCreditsMarkerGeneration> {

        protected _Deserializer() {
            super(EnableCreditsMarkerGeneration.class);
        }

        @Override
        public EnableCreditsMarkerGeneration deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return EnableCreditsMarkerGeneration.of(v);
        }
    }
    
    public enum EnableCreditsMarkerGenerationEnum {

        LibraryDefault("-1"),
        Disabled("0"),;

        private final String value;

        private EnableCreditsMarkerGenerationEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

