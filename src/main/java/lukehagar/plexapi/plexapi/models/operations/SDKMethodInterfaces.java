/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class SDKMethodInterfaces {

    public interface MethodCallGetServerCapabilities {
        lukehagar.plexapi.plexapi.models.operations.GetServerCapabilitiesResponse getServerCapabilitiesDirect() throws Exception;
    }


    public interface MethodCallGetServerPreferences {
        lukehagar.plexapi.plexapi.models.operations.GetServerPreferencesResponse getServerPreferencesDirect() throws Exception;
    }


    public interface MethodCallGetAvailableClients {
        lukehagar.plexapi.plexapi.models.operations.GetAvailableClientsResponse getAvailableClientsDirect() throws Exception;
    }


    public interface MethodCallGetDevices {
        lukehagar.plexapi.plexapi.models.operations.GetDevicesResponse getDevicesDirect() throws Exception;
    }


    public interface MethodCallGetServerIdentity {
        lukehagar.plexapi.plexapi.models.operations.GetServerIdentityResponse getServerIdentityDirect() throws Exception;
    }


    public interface MethodCallGetMyPlexAccount {
        lukehagar.plexapi.plexapi.models.operations.GetMyPlexAccountResponse getMyPlexAccountDirect() throws Exception;
    }


    public interface MethodCallGetResizedPhoto {
        lukehagar.plexapi.plexapi.models.operations.GetResizedPhotoResponse getResizedPhoto(
            lukehagar.plexapi.plexapi.models.operations.GetResizedPhotoRequest request) throws Exception;
    }


    public interface MethodCallGetServerList {
        lukehagar.plexapi.plexapi.models.operations.GetServerListResponse getServerListDirect() throws Exception;
    }


    public interface MethodCallMarkPlayed {
        lukehagar.plexapi.plexapi.models.operations.MarkPlayedResponse markPlayed(
            double key) throws Exception;
    }


    public interface MethodCallMarkUnplayed {
        lukehagar.plexapi.plexapi.models.operations.MarkUnplayedResponse markUnplayed(
            double key) throws Exception;
    }


    public interface MethodCallUpdatePlayProgress {
        lukehagar.plexapi.plexapi.models.operations.UpdatePlayProgressResponse updatePlayProgress(
            String key,
            double time,
            String state) throws Exception;
    }


    public interface MethodCallGetTimeline {
        lukehagar.plexapi.plexapi.models.operations.GetTimelineResponse getTimeline(
            lukehagar.plexapi.plexapi.models.operations.GetTimelineRequest request) throws Exception;
    }


    public interface MethodCallStartUniversalTranscode {
        lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeResponse startUniversalTranscode(
            lukehagar.plexapi.plexapi.models.operations.StartUniversalTranscodeRequest request) throws Exception;
    }


    public interface MethodCallGetServerActivities {
        lukehagar.plexapi.plexapi.models.operations.GetServerActivitiesResponse getServerActivitiesDirect() throws Exception;
    }


    public interface MethodCallCancelServerActivities {
        lukehagar.plexapi.plexapi.models.operations.CancelServerActivitiesResponse cancelServerActivities(
            String activityUUID) throws Exception;
    }


    public interface MethodCallGetButlerTasks {
        lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponse getButlerTasksDirect() throws Exception;
    }


    public interface MethodCallStartAllTasks {
        lukehagar.plexapi.plexapi.models.operations.StartAllTasksResponse startAllTasksDirect() throws Exception;
    }


    public interface MethodCallStopAllTasks {
        lukehagar.plexapi.plexapi.models.operations.StopAllTasksResponse stopAllTasksDirect() throws Exception;
    }


    public interface MethodCallStartTask {
        lukehagar.plexapi.plexapi.models.operations.StartTaskResponse startTask(
            lukehagar.plexapi.plexapi.models.operations.TaskName taskName) throws Exception;
    }


    public interface MethodCallStopTask {
        lukehagar.plexapi.plexapi.models.operations.StopTaskResponse stopTask(
            lukehagar.plexapi.plexapi.models.operations.PathParamTaskName taskName) throws Exception;
    }


    public interface MethodCallGetHomeData {
        lukehagar.plexapi.plexapi.models.operations.GetHomeDataResponse getHomeDataDirect() throws Exception;
    }


    public interface MethodCallGetPin {
        lukehagar.plexapi.plexapi.models.operations.GetPinResponse getPin(
            Optional<? extends Boolean> strong,
            Optional<? extends String> xPlexClientIdentifier,
            String xPlexProduct,
            java.util.Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetToken {
        lukehagar.plexapi.plexapi.models.operations.GetTokenResponse getToken(
            String pinID,
            Optional<? extends String> xPlexClientIdentifier,
            java.util.Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetGlobalHubs {
        lukehagar.plexapi.plexapi.models.operations.GetGlobalHubsResponse getGlobalHubs(
            Optional<? extends Double> count,
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.OnlyTransient> onlyTransient) throws Exception;
    }


    public interface MethodCallGetLibraryHubs {
        lukehagar.plexapi.plexapi.models.operations.GetLibraryHubsResponse getLibraryHubs(
            double sectionId,
            Optional<? extends Double> count,
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.QueryParamOnlyTransient> onlyTransient) throws Exception;
    }


    public interface MethodCallPerformSearch {
        lukehagar.plexapi.plexapi.models.operations.PerformSearchResponse performSearch(
            String query,
            Optional<? extends Double> sectionId,
            Optional<? extends Double> limit) throws Exception;
    }


    public interface MethodCallPerformVoiceSearch {
        lukehagar.plexapi.plexapi.models.operations.PerformVoiceSearchResponse performVoiceSearch(
            String query,
            Optional<? extends Double> sectionId,
            Optional<? extends Double> limit) throws Exception;
    }


    public interface MethodCallGetSearchResults {
        lukehagar.plexapi.plexapi.models.operations.GetSearchResultsResponse getSearchResults(
            String query) throws Exception;
    }


    public interface MethodCallGetFileHash {
        lukehagar.plexapi.plexapi.models.operations.GetFileHashResponse getFileHash(
            String url,
            Optional<? extends Double> type) throws Exception;
    }


    public interface MethodCallGetRecentlyAdded {
        lukehagar.plexapi.plexapi.models.operations.GetRecentlyAddedResponse getRecentlyAddedDirect() throws Exception;
    }


    public interface MethodCallGetLibraries {
        lukehagar.plexapi.plexapi.models.operations.GetLibrariesResponse getLibrariesDirect() throws Exception;
    }


    public interface MethodCallGetLibrary {
        lukehagar.plexapi.plexapi.models.operations.GetLibraryResponse getLibrary(
            double sectionId,
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.IncludeDetails> includeDetails) throws Exception;
    }


    public interface MethodCallDeleteLibrary {
        lukehagar.plexapi.plexapi.models.operations.DeleteLibraryResponse deleteLibrary(
            double sectionId) throws Exception;
    }


    public interface MethodCallGetLibraryItems {
        lukehagar.plexapi.plexapi.models.operations.GetLibraryItemsResponse getLibraryItems(
            java.lang.Object sectionId,
            lukehagar.plexapi.plexapi.models.operations.Tag tag,
            Optional<? extends Long> includeGuids) throws Exception;
    }


    public interface MethodCallRefreshLibrary {
        lukehagar.plexapi.plexapi.models.operations.RefreshLibraryResponse refreshLibrary(
            double sectionId) throws Exception;
    }


    public interface MethodCallSearchLibrary {
        lukehagar.plexapi.plexapi.models.operations.SearchLibraryResponse searchLibrary(
            long sectionId,
            lukehagar.plexapi.plexapi.models.operations.Type type) throws Exception;
    }


    public interface MethodCallGetMetadata {
        lukehagar.plexapi.plexapi.models.operations.GetMetadataResponse getMetadata(
            double ratingKey) throws Exception;
    }


    public interface MethodCallGetMetadataChildren {
        lukehagar.plexapi.plexapi.models.operations.GetMetadataChildrenResponse getMetadataChildren(
            double ratingKey,
            Optional<? extends String> includeElements) throws Exception;
    }


    public interface MethodCallGetTopWatchedContent {
        lukehagar.plexapi.plexapi.models.operations.GetTopWatchedContentResponse getTopWatchedContent(
            long type,
            Optional<? extends Long> includeGuids) throws Exception;
    }


    public interface MethodCallGetOnDeck {
        lukehagar.plexapi.plexapi.models.operations.GetOnDeckResponse getOnDeckDirect() throws Exception;
    }


    public interface MethodCallLogLine {
        lukehagar.plexapi.plexapi.models.operations.LogLineResponse logLine(
            lukehagar.plexapi.plexapi.models.operations.Level level,
            String message,
            String source) throws Exception;
    }


    public interface MethodCallLogMultiLine {
        lukehagar.plexapi.plexapi.models.operations.LogMultiLineResponse logMultiLine(
            String request) throws Exception;
    }


    public interface MethodCallEnablePaperTrail {
        lukehagar.plexapi.plexapi.models.operations.EnablePaperTrailResponse enablePaperTrailDirect() throws Exception;
    }


    public interface MethodCallCreatePlaylist {
        lukehagar.plexapi.plexapi.models.operations.CreatePlaylistResponse createPlaylist(
            lukehagar.plexapi.plexapi.models.operations.CreatePlaylistRequest request) throws Exception;
    }


    public interface MethodCallGetPlaylists {
        lukehagar.plexapi.plexapi.models.operations.GetPlaylistsResponse getPlaylists(
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.PlaylistType> playlistType,
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.QueryParamSmart> smart) throws Exception;
    }


    public interface MethodCallGetPlaylist {
        lukehagar.plexapi.plexapi.models.operations.GetPlaylistResponse getPlaylist(
            double playlistID) throws Exception;
    }


    public interface MethodCallDeletePlaylist {
        lukehagar.plexapi.plexapi.models.operations.DeletePlaylistResponse deletePlaylist(
            double playlistID) throws Exception;
    }


    public interface MethodCallUpdatePlaylist {
        lukehagar.plexapi.plexapi.models.operations.UpdatePlaylistResponse updatePlaylist(
            double playlistID,
            Optional<? extends String> title,
            Optional<? extends String> summary) throws Exception;
    }


    public interface MethodCallGetPlaylistContents {
        lukehagar.plexapi.plexapi.models.operations.GetPlaylistContentsResponse getPlaylistContents(
            double playlistID,
            double type) throws Exception;
    }


    public interface MethodCallClearPlaylistContents {
        lukehagar.plexapi.plexapi.models.operations.ClearPlaylistContentsResponse clearPlaylistContents(
            double playlistID) throws Exception;
    }


    public interface MethodCallAddPlaylistContents {
        lukehagar.plexapi.plexapi.models.operations.AddPlaylistContentsResponse addPlaylistContents(
            double playlistID,
            String uri,
            Optional<? extends Double> playQueueID) throws Exception;
    }


    public interface MethodCallUploadPlaylist {
        lukehagar.plexapi.plexapi.models.operations.UploadPlaylistResponse uploadPlaylist(
            String path,
            lukehagar.plexapi.plexapi.models.operations.Force force) throws Exception;
    }


    public interface MethodCallGetTransientToken {
        lukehagar.plexapi.plexapi.models.operations.GetTransientTokenResponse getTransientToken(
            lukehagar.plexapi.plexapi.models.operations.GetTransientTokenQueryParamType type,
            lukehagar.plexapi.plexapi.models.operations.Scope scope) throws Exception;
    }


    public interface MethodCallGetSourceConnectionInformation {
        lukehagar.plexapi.plexapi.models.operations.GetSourceConnectionInformationResponse getSourceConnectionInformation(
            String source) throws Exception;
    }


    public interface MethodCallGetStatistics {
        lukehagar.plexapi.plexapi.models.operations.GetStatisticsResponse getStatistics(
            Optional<? extends Long> timespan) throws Exception;
    }


    public interface MethodCallGetResourcesStatistics {
        lukehagar.plexapi.plexapi.models.operations.GetResourcesStatisticsResponse getResourcesStatistics(
            Optional<? extends Long> timespan) throws Exception;
    }


    public interface MethodCallGetBandwidthStatistics {
        lukehagar.plexapi.plexapi.models.operations.GetBandwidthStatisticsResponse getBandwidthStatistics(
            Optional<? extends Long> timespan) throws Exception;
    }


    public interface MethodCallGetSessions {
        lukehagar.plexapi.plexapi.models.operations.GetSessionsResponse getSessionsDirect() throws Exception;
    }


    public interface MethodCallGetSessionHistory {
        lukehagar.plexapi.plexapi.models.operations.GetSessionHistoryResponse getSessionHistory(
            Optional<? extends String> sort,
            Optional<? extends Long> accountId,
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.Filter> filter,
            Optional<? extends Long> librarySectionID) throws Exception;
    }


    public interface MethodCallGetTranscodeSessions {
        lukehagar.plexapi.plexapi.models.operations.GetTranscodeSessionsResponse getTranscodeSessionsDirect() throws Exception;
    }


    public interface MethodCallStopTranscodeSession {
        lukehagar.plexapi.plexapi.models.operations.StopTranscodeSessionResponse stopTranscodeSession(
            String sessionKey) throws Exception;
    }


    public interface MethodCallGetUpdateStatus {
        lukehagar.plexapi.plexapi.models.operations.GetUpdateStatusResponse getUpdateStatusDirect() throws Exception;
    }


    public interface MethodCallCheckForUpdates {
        lukehagar.plexapi.plexapi.models.operations.CheckForUpdatesResponse checkForUpdates(
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.Download> download) throws Exception;
    }


    public interface MethodCallApplyUpdates {
        lukehagar.plexapi.plexapi.models.operations.ApplyUpdatesResponse applyUpdates(
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.Tonight> tonight,
            Optional<? extends lukehagar.plexapi.plexapi.models.operations.Skip> skip) throws Exception;
    }


    public interface MethodCallGetWatchlist {
        lukehagar.plexapi.plexapi.models.operations.GetWatchlistResponse getWatchlist(
            lukehagar.plexapi.plexapi.models.operations.GetWatchlistRequest request,
            java.util.Optional<String> serverURL) throws Exception;
    }

}