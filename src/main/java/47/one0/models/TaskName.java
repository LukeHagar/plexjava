package 47.one0.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum TaskName {
    BACKUPDATABASE("BackupDatabase"),
    BUILDGRACENOTECOLLECTIONS("BuildGracenoteCollections"),
    CHECKFORUPDATES("CheckForUpdates"),
    CLEANOLDBUNDLES("CleanOldBundles"),
    CLEANOLDCACHEFILES("CleanOldCacheFiles"),
    DEEPMEDIAANALYSIS("DeepMediaAnalysis"),
    GENERATEAUTOTAGS("GenerateAutoTags"),
    GENERATECHAPTERTHUMBS("GenerateChapterThumbs"),
    GENERATEMEDIAINDEXFILES("GenerateMediaIndexFiles"),
    OPTIMIZEDATABASE("OptimizeDatabase"),
    REFRESHLIBRARIES("RefreshLibraries"),
    REFRESHLOCALMEDIA("RefreshLocalMedia"),
    REFRESHPERIODICMETADATA("RefreshPeriodicMetadata"),
    UPGRADEMEDIAANALYSIS("UpgradeMediaAnalysis");

  public final String label;
}
