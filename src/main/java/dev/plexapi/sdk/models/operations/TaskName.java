/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * TaskName - the name of the task to be started.
 */
public enum TaskName {
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
    UPGRADE_MEDIA_ANALYSIS("UpgradeMediaAnalysis");

    @JsonValue
    private final String value;

    private TaskName(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<TaskName> fromValue(String value) {
        for (TaskName o: TaskName.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}
