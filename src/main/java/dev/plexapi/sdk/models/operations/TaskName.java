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
 * TaskName
 * 
 * <p>the name of the task to be started.
 */
@JsonDeserialize(using = TaskName._Deserializer.class)
@JsonSerialize(using = TaskName._Serializer.class)
public class TaskName {

    public static final TaskName BACKUP_DATABASE = new TaskName("BackupDatabase");
    public static final TaskName BUILD_GRACENOTE_COLLECTIONS = new TaskName("BuildGracenoteCollections");
    public static final TaskName CHECK_FOR_UPDATES = new TaskName("CheckForUpdates");
    public static final TaskName CLEAN_OLD_BUNDLES = new TaskName("CleanOldBundles");
    public static final TaskName CLEAN_OLD_CACHE_FILES = new TaskName("CleanOldCacheFiles");
    public static final TaskName DEEP_MEDIA_ANALYSIS = new TaskName("DeepMediaAnalysis");
    public static final TaskName GENERATE_AUTO_TAGS = new TaskName("GenerateAutoTags");
    public static final TaskName GENERATE_CHAPTER_THUMBS = new TaskName("GenerateChapterThumbs");
    public static final TaskName GENERATE_MEDIA_INDEX_FILES = new TaskName("GenerateMediaIndexFiles");
    public static final TaskName OPTIMIZE_DATABASE = new TaskName("OptimizeDatabase");
    public static final TaskName REFRESH_LIBRARIES = new TaskName("RefreshLibraries");
    public static final TaskName REFRESH_LOCAL_MEDIA = new TaskName("RefreshLocalMedia");
    public static final TaskName REFRESH_PERIODIC_METADATA = new TaskName("RefreshPeriodicMetadata");
    public static final TaskName UPGRADE_MEDIA_ANALYSIS = new TaskName("UpgradeMediaAnalysis");

    // This map will grow whenever a Color gets created with a new
    // unrecognized value (a potential memory leak if the user is not
    // careful). Keep this field lower case to avoid clashing with
    // generated member names which will always be upper cased (Java
    // convention)
    private static final Map<String, TaskName> values = createValuesMap();
    private static final Map<String, TaskNameEnum> enums = createEnumsMap();

    private final String value;

    private TaskName(String value) {
        this.value = value;
    }

    /**
     * Returns a TaskName with the given value. For a specific value the 
     * returned object will always be a singleton so reference equality 
     * is satisfied when the values are the same.
     * 
     * @param value value to be wrapped as TaskName
     */ 
    public static TaskName of(String value) {
        synchronized (TaskName.class) {
            return values.computeIfAbsent(value, v -> new TaskName(v));
        }
    }

    public String value() {
        return value;
    }

    public Optional<TaskNameEnum> asEnum() {
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
        TaskName other = (TaskName) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "TaskName [value=" + value + "]";
    }

    // return an array just like an enum
    public static TaskName[] values() {
        synchronized (TaskName.class) {
            return values.values().toArray(new TaskName[] {});
        }
    }

    private static final Map<String, TaskName> createValuesMap() {
        Map<String, TaskName> map = new LinkedHashMap<>();
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

    private static final Map<String, TaskNameEnum> createEnumsMap() {
        Map<String, TaskNameEnum> map = new HashMap<>();
        map.put("BackupDatabase", TaskNameEnum.BACKUP_DATABASE);
        map.put("BuildGracenoteCollections", TaskNameEnum.BUILD_GRACENOTE_COLLECTIONS);
        map.put("CheckForUpdates", TaskNameEnum.CHECK_FOR_UPDATES);
        map.put("CleanOldBundles", TaskNameEnum.CLEAN_OLD_BUNDLES);
        map.put("CleanOldCacheFiles", TaskNameEnum.CLEAN_OLD_CACHE_FILES);
        map.put("DeepMediaAnalysis", TaskNameEnum.DEEP_MEDIA_ANALYSIS);
        map.put("GenerateAutoTags", TaskNameEnum.GENERATE_AUTO_TAGS);
        map.put("GenerateChapterThumbs", TaskNameEnum.GENERATE_CHAPTER_THUMBS);
        map.put("GenerateMediaIndexFiles", TaskNameEnum.GENERATE_MEDIA_INDEX_FILES);
        map.put("OptimizeDatabase", TaskNameEnum.OPTIMIZE_DATABASE);
        map.put("RefreshLibraries", TaskNameEnum.REFRESH_LIBRARIES);
        map.put("RefreshLocalMedia", TaskNameEnum.REFRESH_LOCAL_MEDIA);
        map.put("RefreshPeriodicMetadata", TaskNameEnum.REFRESH_PERIODIC_METADATA);
        map.put("UpgradeMediaAnalysis", TaskNameEnum.UPGRADE_MEDIA_ANALYSIS);
        return map;
    }
    
    @SuppressWarnings("serial")
    public static final class _Serializer extends StdSerializer<TaskName> {

        protected _Serializer() {
            super(TaskName.class);
        }

        @Override
        public void serialize(TaskName value, JsonGenerator g, SerializerProvider provider)
                throws IOException, JsonProcessingException {
            g.writeObject(value.value);
        }
    }

    @SuppressWarnings("serial")
    public static final class _Deserializer extends StdDeserializer<TaskName> {

        protected _Deserializer() {
            super(TaskName.class);
        }

        @Override
        public TaskName deserialize(JsonParser p, DeserializationContext ctxt)
                throws IOException, JacksonException {
            String v = p.readValueAs(new TypeReference<String>() {});
            // use the factory method to ensure we get singletons
            return TaskName.of(v);
        }
    }
    
    public enum TaskNameEnum {

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

        private TaskNameEnum(String value) {
            this.value = value;
        }

        public String value() {
            return value;
        }
    }
}

