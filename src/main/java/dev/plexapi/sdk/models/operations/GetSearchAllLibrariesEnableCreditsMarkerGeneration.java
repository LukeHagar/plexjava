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
 * GetSearchAllLibrariesEnableCreditsMarkerGeneration
 * 
 * <p>Setting that indicates if credits markers detection is enabled. (-1 = Library default, 0 = Disabled).
 */
@JsonDeserialize(using = GetSearchAllLibrariesEnableCreditsMarkerGeneration._Deserializer.class)
@JsonSerialize(using = GetSearchAllLibrariesEnableCreditsMarkerGeneration._Serializer.class)
public class GetSearchAllLibrariesEnableCreditsMarkerGeneration {

    public static final GetSearchAllLibrariesEnableCreditsMarkerGeneration LibraryDefault = new GetSearchAllLibrariesEnableCreditsMarkerGeneration("-1");
    public static final GetSearchAllLibrariesEnableCreditsMarkerGeneration Disabled = new GetSearchAllLibrariesEnableCreditsMarkerGeneration("0");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, GetSearchAllLibrariesEnableCreditsMarkerGeneration> values = createValuesMap();
    private static final Map<String, GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum> enums = createEnumsMap();

    private final String value;

    private GetSearchAllLibrariesEnableCreditsMarkerGeneration(String value) {
        this.value = value;
    }

    /**
     * Returns a GetSearchAllLibrariesEnableCreditsMarkerGeneration with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as GetSearchAllLibrariesEnableCreditsMarkerGeneration
     */ 
    public static GetSearchAllLibrariesEnableCreditsMarkerGeneration of(String value) {
        synchronized (GetSearchAllLibrariesEnableCreditsMarkerGeneration.class) {
            return values.computeIfAbsent(value, v -> new GetSearchAllLibrariesEnableCreditsMarkerGeneration(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum> asEnum() {
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
        GetSearchAllLibrariesEnableCreditsMarkerGeneration other = (GetSearchAllLibrariesEnableCreditsMarkerGeneration) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "GetSearchAllLibrariesEnableCreditsMarkerGeneration [value=" + value + "]";
    }

    // return an array just like an enum
    public static GetSearchAllLibrariesEnableCreditsMarkerGeneration[] values() {
        synchronized (GetSearchAllLibrariesEnableCreditsMarkerGeneration.class) {
            return values.values().toArray(new GetSearchAllLibrariesEnableCreditsMarkerGeneration[] {});
        }
    }

    private static final Map<String, GetSearchAllLibrariesEnableCreditsMarkerGeneration> createValuesMap() {
        Map<String, GetSearchAllLibrariesEnableCreditsMarkerGeneration> map = new LinkedHashMap<>();
        map.put("-1", LibraryDefault);
        map.put("0", Disabled);
        return map;
    }

    private static final Map<String, GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum> createEnumsMap() {
        Map<String, GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum> map = new HashMap<>();
        map.put("-1", GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum.LibraryDefault);
        map.put("0", GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum.Disabled);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<GetSearchAllLibrariesEnableCreditsMarkerGeneration> {

        protected _Serializer() {
            super(GetSearchAllLibrariesEnableCreditsMarkerGeneration.class);
        }

        @Override
        public void serialize(GetSearchAllLibrariesEnableCreditsMarkerGeneration value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<GetSearchAllLibrariesEnableCreditsMarkerGeneration> {

        protected _Deserializer() {
            super(GetSearchAllLibrariesEnableCreditsMarkerGeneration.class);
        }

        @Override
        public GetSearchAllLibrariesEnableCreditsMarkerGeneration deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return GetSearchAllLibrariesEnableCreditsMarkerGeneration.of(v);
        }
    }
    
    public enum GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum {

        LibraryDefault("-1"),
        Disabled("0"),;

        private final String value;

        private GetSearchAllLibrariesEnableCreditsMarkerGenerationEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

