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
 * PathParamTaskName
 * 
 * <p>The name of the task to be started.
 */
@JsonDeserialize(using = PathParamTaskName._Deserializer.class)
@JsonSerialize(using = PathParamTaskName._Serializer.class)
public class PathParamTaskName {

    public static final PathParamTaskName BACKUP_DATABASE = new PathParamTaskName("BackupDatabase");
    public static final PathParamTaskName BUILD_GRACENOTE_COLLECTIONS = new PathParamTaskName("BuildGracenoteCollections");
    public static final PathParamTaskName CHECK_FOR_UPDATES = new PathParamTaskName("CheckForUpdates");
    public static final PathParamTaskName CLEAN_OLD_BUNDLES = new PathParamTaskName("CleanOldBundles");
    public static final PathParamTaskName CLEAN_OLD_CACHE_FILES = new PathParamTaskName("CleanOldCacheFiles");
    public static final PathParamTaskName DEEP_MEDIA_ANALYSIS = new PathParamTaskName("DeepMediaAnalysis");
    public static final PathParamTaskName GENERATE_AUTO_TAGS = new PathParamTaskName("GenerateAutoTags");
    public static final PathParamTaskName GENERATE_CHAPTER_THUMBS = new PathParamTaskName("GenerateChapterThumbs");
    public static final PathParamTaskName GENERATE_MEDIA_INDEX_FILES = new PathParamTaskName("GenerateMediaIndexFiles");
    public static final PathParamTaskName OPTIMIZE_DATABASE = new PathParamTaskName("OptimizeDatabase");
    public static final PathParamTaskName REFRESH_LIBRARIES = new PathParamTaskName("RefreshLibraries");
    public static final PathParamTaskName REFRESH_LOCAL_MEDIA = new PathParamTaskName("RefreshLocalMedia");
    public static final PathParamTaskName REFRESH_PERIODIC_METADATA = new PathParamTaskName("RefreshPeriodicMetadata");
    public static final PathParamTaskName UPGRADE_MEDIA_ANALYSIS = new PathParamTaskName("UpgradeMediaAnalysis");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, PathParamTaskName> values = createValuesMap();
    private static final Map<String, PathParamTaskNameEnum> enums = createEnumsMap();

    private final String value;

    private PathParamTaskName(String value) {
        this.value = value;
    }

    /**
     * Returns a PathParamTaskName with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as PathParamTaskName
     */ 
    public static PathParamTaskName of(String value) {
        synchronized (PathParamTaskName.class) {
            return values.computeIfAbsent(value, v -> new PathParamTaskName(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<PathParamTaskNameEnum> asEnum() {
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
        PathParamTaskName other = (PathParamTaskName) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "PathParamTaskName [value=" + value + "]";
    }

    // return an array just like an enum
    public static PathParamTaskName[] values() {
        synchronized (PathParamTaskName.class) {
            return values.values().toArray(new PathParamTaskName[] {});
        }
    }

    private static final Map<String, PathParamTaskName> createValuesMap() {
        Map<String, PathParamTaskName> map = new LinkedHashMap<>();
        map.put("BackupDatabase", BACKUP_DATABASE);
        map.put("BuildGracenoteCollections", BUILD_GRACENOTE_COLLECTIONS);
        map.put("CheckForUpdates", CHECK_FOR_UPDATES);
        map.put("CleanOldBundles", CLEAN_OLD_BUNDLES);
        map.put("CleanOldCacheFiles", CLEAN_OLD_CACHE_FILES);
        map.put("DeepMediaAnalysis", DEEP_MEDIA_ANALYSIS);
        map.put("GenerateAutoTags", GENERATE_AUTO_TAGS);
        map.put("GenerateChapterThumbs", GENERATE_CHAPTER_THUMBS);
        map.put("GenerateMediaIndexFiles", GENERATE_MEDIA_INDEX_FILES);
        map.put("OptimizeDatabase", OPTIMIZE_DATABASE);
        map.put("RefreshLibraries", REFRESH_LIBRARIES);
        map.put("RefreshLocalMedia", REFRESH_LOCAL_MEDIA);
        map.put("RefreshPeriodicMetadata", REFRESH_PERIODIC_METADATA);
        map.put("UpgradeMediaAnalysis", UPGRADE_MEDIA_ANALYSIS);
        return map;
    }

    private static final Map<String, PathParamTaskNameEnum> createEnumsMap() {
        Map<String, PathParamTaskNameEnum> map = new HashMap<>();
        map.put("BackupDatabase", PathParamTaskNameEnum.BACKUP_DATABASE);
        map.put("BuildGracenoteCollections", PathParamTaskNameEnum.BUILD_GRACENOTE_COLLECTIONS);
        map.put("CheckForUpdates", PathParamTaskNameEnum.CHECK_FOR_UPDATES);
        map.put("CleanOldBundles", PathParamTaskNameEnum.CLEAN_OLD_BUNDLES);
        map.put("CleanOldCacheFiles", PathParamTaskNameEnum.CLEAN_OLD_CACHE_FILES);
        map.put("DeepMediaAnalysis", PathParamTaskNameEnum.DEEP_MEDIA_ANALYSIS);
        map.put("GenerateAutoTags", PathParamTaskNameEnum.GENERATE_AUTO_TAGS);
        map.put("GenerateChapterThumbs", PathParamTaskNameEnum.GENERATE_CHAPTER_THUMBS);
        map.put("GenerateMediaIndexFiles", PathParamTaskNameEnum.GENERATE_MEDIA_INDEX_FILES);
        map.put("OptimizeDatabase", PathParamTaskNameEnum.OPTIMIZE_DATABASE);
        map.put("RefreshLibraries", PathParamTaskNameEnum.REFRESH_LIBRARIES);
        map.put("RefreshLocalMedia", PathParamTaskNameEnum.REFRESH_LOCAL_MEDIA);
        map.put("RefreshPeriodicMetadata", PathParamTaskNameEnum.REFRESH_PERIODIC_METADATA);
        map.put("UpgradeMediaAnalysis", PathParamTaskNameEnum.UPGRADE_MEDIA_ANALYSIS);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<PathParamTaskName> {

        protected _Serializer() {
            super(PathParamTaskName.class);
        }

        @Override
        public void serialize(PathParamTaskName value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<PathParamTaskName> {

        protected _Deserializer() {
            super(PathParamTaskName.class);
        }

        @Override
        public PathParamTaskName deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return PathParamTaskName.of(v);
        }
    }
    
    public enum PathParamTaskNameEnum {

        BACKUP_DATABASE("BackupDatabase"),
        BUILD_GRACENOTE_COLLECTIONS("BuildGracenoteCollections"),
        CHECK_FOR_UPDATES("CheckForUpdates"),
        CLEAN_OLD_BUNDLES("CleanOldBundles"),
        CLEAN_OLD_CACHE_FILES("CleanOldCacheFiles"),
        DEEP_MEDIA_ANALYSIS("DeepMediaAnalysis"),
        GENERATE_AUTO_TAGS("GenerateAutoTags"),
        GENERATE_CHAPTER_THUMBS("GenerateChapterThumbs"),
        GENERATE_MEDIA_INDEX_FILES("GenerateMediaIndexFiles"),
        OPTIMIZE_DATABASE("OptimizeDatabase"),
        REFRESH_LIBRARIES("RefreshLibraries"),
        REFRESH_LOCAL_MEDIA("RefreshLocalMedia"),
        REFRESH_PERIODIC_METADATA("RefreshPeriodicMetadata"),
        UPGRADE_MEDIA_ANALYSIS("UpgradeMediaAnalysis"),;

        private final String value;

        private PathParamTaskNameEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

