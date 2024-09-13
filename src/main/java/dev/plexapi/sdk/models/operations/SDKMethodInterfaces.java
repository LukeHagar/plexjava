/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallGetServerCapabilities {
        dev.plexapi.sdk.models.operations.GetServerCapabilitiesResponse getServerCapabilitiesDirect() throws Exception;
    }


    public interface MethodCallGetServerPreferences {
        dev.plexapi.sdk.models.operations.GetServerPreferencesResponse getServerPreferencesDirect() throws Exception;
    }


    public interface MethodCallGetAvailableClients {
        dev.plexapi.sdk.models.operations.GetAvailableClientsResponse getAvailableClientsDirect() throws Exception;
    }


    public interface MethodCallGetDevices {
        dev.plexapi.sdk.models.operations.GetDevicesResponse getDevicesDirect() throws Exception;
    }


    public interface MethodCallGetServerIdentity {
        dev.plexapi.sdk.models.operations.GetServerIdentityResponse getServerIdentityDirect() throws Exception;
    }


    public interface MethodCallGetMyPlexAccount {
        dev.plexapi.sdk.models.operations.GetMyPlexAccountResponse getMyPlexAccountDirect() throws Exception;
    }


    public interface MethodCallGetResizedPhoto {
        dev.plexapi.sdk.models.operations.GetResizedPhotoResponse getResizedPhoto(
            GetResizedPhotoRequest request) throws Exception;
    }


    public interface MethodCallGetMediaProviders {
        dev.plexapi.sdk.models.operations.GetMediaProvidersResponse getMediaProviders(
            String xPlexToken) throws Exception;
    }


    public interface MethodCallGetServerList {
        dev.plexapi.sdk.models.operations.GetServerListResponse getServerListDirect() throws Exception;
    }


    public interface MethodCallMarkPlayed {
        dev.plexapi.sdk.models.operations.MarkPlayedResponse markPlayed(
            double key) throws Exception;
    }


    public interface MethodCallMarkUnplayed {
        dev.plexapi.sdk.models.operations.MarkUnplayedResponse markUnplayed(
            double key) throws Exception;
    }


    public interface MethodCallUpdatePlayProgress {
        dev.plexapi.sdk.models.operations.UpdatePlayProgressResponse updatePlayProgress(
            String key,
            double time,
            String state) throws Exception;
    }


    public interface MethodCallGetBannerImage {
        dev.plexapi.sdk.models.operations.GetBannerImageResponse getBannerImage(
            GetBannerImageRequest request) throws Exception;
    }


    public interface MethodCallGetThumbImage {
        dev.plexapi.sdk.models.operations.GetThumbImageResponse getThumbImage(
            GetThumbImageRequest request) throws Exception;
    }


    public interface MethodCallGetTimeline {
        dev.plexapi.sdk.models.operations.GetTimelineResponse getTimeline(
            GetTimelineRequest request) throws Exception;
    }


    public interface MethodCallStartUniversalTranscode {
        dev.plexapi.sdk.models.operations.StartUniversalTranscodeResponse startUniversalTranscode(
            StartUniversalTranscodeRequest request) throws Exception;
    }


    public interface MethodCallGetServerActivities {
        dev.plexapi.sdk.models.operations.GetServerActivitiesResponse getServerActivitiesDirect() throws Exception;
    }


    public interface MethodCallCancelServerActivities {
        dev.plexapi.sdk.models.operations.CancelServerActivitiesResponse cancelServerActivities(
            String activityUUID) throws Exception;
    }


    public interface MethodCallGetButlerTasks {
        dev.plexapi.sdk.models.operations.GetButlerTasksResponse getButlerTasksDirect() throws Exception;
    }


    public interface MethodCallStartAllTasks {
        dev.plexapi.sdk.models.operations.StartAllTasksResponse startAllTasksDirect() throws Exception;
    }


    public interface MethodCallStopAllTasks {
        dev.plexapi.sdk.models.operations.StopAllTasksResponse stopAllTasksDirect() throws Exception;
    }


    public interface MethodCallStartTask {
        dev.plexapi.sdk.models.operations.StartTaskResponse startTask(
            TaskName taskName) throws Exception;
    }


    public interface MethodCallStopTask {
        dev.plexapi.sdk.models.operations.StopTaskResponse stopTask(
            PathParamTaskName taskName) throws Exception;
    }


    public interface MethodCallGetCompanionsData {
        dev.plexapi.sdk.models.operations.GetCompanionsDataResponse getCompanionsData(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetUserFriends {
        dev.plexapi.sdk.models.operations.GetUserFriendsResponse getUserFriends(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetGeoData {
        dev.plexapi.sdk.models.operations.GetGeoDataResponse getGeoData(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetHomeData {
        dev.plexapi.sdk.models.operations.GetHomeDataResponse getHomeDataDirect() throws Exception;
    }


    public interface MethodCallGetServerResources {
        dev.plexapi.sdk.models.operations.GetServerResourcesResponse getServerResources(
            Optional<String> xPlexClientIdentifier,
            Optional<? extends IncludeHttps> includeHttps,
            Optional<? extends IncludeRelay> includeRelay,
            Optional<? extends IncludeIPv6> includeIPv6,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetPin {
        dev.plexapi.sdk.models.operations.GetPinResponse getPin(
            Optional<Boolean> strong,
            Optional<String> xPlexClientIdentifier,
            Optional<String> xPlexProduct,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetTokenByPinId {
        dev.plexapi.sdk.models.operations.GetTokenByPinIdResponse getTokenByPinId(
            Optional<String> xPlexClientIdentifier,
            long pinID,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetGlobalHubs {
        dev.plexapi.sdk.models.operations.GetGlobalHubsResponse getGlobalHubs(
            Optional<Double> count,
            Optional<? extends OnlyTransient> onlyTransient) throws Exception;
    }


    public interface MethodCallGetLibraryHubs {
        dev.plexapi.sdk.models.operations.GetLibraryHubsResponse getLibraryHubs(
            double sectionId,
            Optional<Double> count,
            Optional<? extends QueryParamOnlyTransient> onlyTransient) throws Exception;
    }


    public interface MethodCallPerformSearch {
        dev.plexapi.sdk.models.operations.PerformSearchResponse performSearch(
            String query,
            Optional<Double> sectionId,
            Optional<Double> limit) throws Exception;
    }


    public interface MethodCallPerformVoiceSearch {
        dev.plexapi.sdk.models.operations.PerformVoiceSearchResponse performVoiceSearch(
            String query,
            Optional<Double> sectionId,
            Optional<Double> limit) throws Exception;
    }


    public interface MethodCallGetSearchResults {
        dev.plexapi.sdk.models.operations.GetSearchResultsResponse getSearchResults(
            String query) throws Exception;
    }


    public interface MethodCallGetFileHash {
        dev.plexapi.sdk.models.operations.GetFileHashResponse getFileHash(
            String url,
            Optional<Double> type) throws Exception;
    }


    public interface MethodCallGetRecentlyAdded {
        dev.plexapi.sdk.models.operations.GetRecentlyAddedResponse getRecentlyAdded(
            Optional<Integer> xPlexContainerStart,
            Optional<Integer> xPlexContainerSize) throws Exception;
    }


    public interface MethodCallGetAllLibraries {
        dev.plexapi.sdk.models.operations.GetAllLibrariesResponse getAllLibrariesDirect() throws Exception;
    }


    public interface MethodCallGetLibraryDetails {
        dev.plexapi.sdk.models.operations.GetLibraryDetailsResponse getLibraryDetails(
            int sectionKey,
            Optional<? extends IncludeDetails> includeDetails) throws Exception;
    }


    public interface MethodCallDeleteLibrary {
        dev.plexapi.sdk.models.operations.DeleteLibraryResponse deleteLibrary(
            int sectionKey) throws Exception;
    }


    public interface MethodCallGetLibraryItems {
        dev.plexapi.sdk.models.operations.GetLibraryItemsResponse getLibraryItems(
            GetLibraryItemsRequest request) throws Exception;
    }


    public interface MethodCallGetRefreshLibraryMetadata {
        dev.plexapi.sdk.models.operations.GetRefreshLibraryMetadataResponse getRefreshLibraryMetadata(
            int sectionKey,
            Optional<? extends Force> force) throws Exception;
    }


    public interface MethodCallGetSearchLibrary {
        dev.plexapi.sdk.models.operations.GetSearchLibraryResponse getSearchLibrary(
            int sectionKey,
            QueryParamType type) throws Exception;
    }


    public interface MethodCallGetMetaDataByRatingKey {
        dev.plexapi.sdk.models.operations.GetMetaDataByRatingKeyResponse getMetaDataByRatingKey(
            long ratingKey) throws Exception;
    }


    public interface MethodCallGetMetadataChildren {
        dev.plexapi.sdk.models.operations.GetMetadataChildrenResponse getMetadataChildren(
            double ratingKey,
            Optional<String> includeElements) throws Exception;
    }


    public interface MethodCallGetTopWatchedContent {
        dev.plexapi.sdk.models.operations.GetTopWatchedContentResponse getTopWatchedContent(
            GetTopWatchedContentQueryParamType type,
            Optional<Long> includeGuids) throws Exception;
    }


    public interface MethodCallGetOnDeck {
        dev.plexapi.sdk.models.operations.GetOnDeckResponse getOnDeckDirect() throws Exception;
    }


    public interface MethodCallGetWatchList {
        dev.plexapi.sdk.models.operations.GetWatchListResponse getWatchList(
            GetWatchListRequest request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallLogLine {
        dev.plexapi.sdk.models.operations.LogLineResponse logLine(
            Level level,
            String message,
            String source) throws Exception;
    }


    public interface MethodCallLogMultiLine {
        dev.plexapi.sdk.models.operations.LogMultiLineResponse logMultiLine(
            String request) throws Exception;
    }


    public interface MethodCallEnablePaperTrail {
        dev.plexapi.sdk.models.operations.EnablePaperTrailResponse enablePaperTrailDirect() throws Exception;
    }


    public interface MethodCallCreatePlaylist {
        dev.plexapi.sdk.models.operations.CreatePlaylistResponse createPlaylist(
            CreatePlaylistRequest request) throws Exception;
    }


    public interface MethodCallGetPlaylists {
        dev.plexapi.sdk.models.operations.GetPlaylistsResponse getPlaylists(
            Optional<? extends PlaylistType> playlistType,
            Optional<? extends QueryParamSmart> smart) throws Exception;
    }


    public interface MethodCallGetPlaylist {
        dev.plexapi.sdk.models.operations.GetPlaylistResponse getPlaylist(
            double playlistID) throws Exception;
    }


    public interface MethodCallDeletePlaylist {
        dev.plexapi.sdk.models.operations.DeletePlaylistResponse deletePlaylist(
            double playlistID) throws Exception;
    }


    public interface MethodCallUpdatePlaylist {
        dev.plexapi.sdk.models.operations.UpdatePlaylistResponse updatePlaylist(
            double playlistID,
            Optional<String> title,
            Optional<String> summary) throws Exception;
    }


    public interface MethodCallGetPlaylistContents {
        dev.plexapi.sdk.models.operations.GetPlaylistContentsResponse getPlaylistContents(
            double playlistID,
            GetPlaylistContentsQueryParamType type) throws Exception;
    }


    public interface MethodCallClearPlaylistContents {
        dev.plexapi.sdk.models.operations.ClearPlaylistContentsResponse clearPlaylistContents(
            double playlistID) throws Exception;
    }


    public interface MethodCallAddPlaylistContents {
        dev.plexapi.sdk.models.operations.AddPlaylistContentsResponse addPlaylistContents(
            double playlistID,
            String uri,
            Optional<Double> playQueueID) throws Exception;
    }


    public interface MethodCallUploadPlaylist {
        dev.plexapi.sdk.models.operations.UploadPlaylistResponse uploadPlaylist(
            String path,
            QueryParamForce force) throws Exception;
    }


    public interface MethodCallGetTransientToken {
        dev.plexapi.sdk.models.operations.GetTransientTokenResponse getTransientToken(
            GetTransientTokenQueryParamType type,
            Scope scope) throws Exception;
    }


    public interface MethodCallGetSourceConnectionInformation {
        dev.plexapi.sdk.models.operations.GetSourceConnectionInformationResponse getSourceConnectionInformation(
            String source) throws Exception;
    }


    public interface MethodCallGetTokenDetails {
        dev.plexapi.sdk.models.operations.GetTokenDetailsResponse getTokenDetails(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallPostUsersSignInData {
        dev.plexapi.sdk.models.operations.PostUsersSignInDataResponse postUsersSignInData(
            Optional<String> xPlexClientIdentifier,
            Optional<? extends PostUsersSignInDataRequestBody> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetStatistics {
        dev.plexapi.sdk.models.operations.GetStatisticsResponse getStatistics(
            Optional<Long> timespan) throws Exception;
    }


    public interface MethodCallGetResourcesStatistics {
        dev.plexapi.sdk.models.operations.GetResourcesStatisticsResponse getResourcesStatistics(
            Optional<Long> timespan) throws Exception;
    }


    public interface MethodCallGetBandwidthStatistics {
        dev.plexapi.sdk.models.operations.GetBandwidthStatisticsResponse getBandwidthStatistics(
            Optional<Long> timespan) throws Exception;
    }


    public interface MethodCallGetSessions {
        dev.plexapi.sdk.models.operations.GetSessionsResponse getSessionsDirect() throws Exception;
    }


    public interface MethodCallGetSessionHistory {
        dev.plexapi.sdk.models.operations.GetSessionHistoryResponse getSessionHistory(
            Optional<String> sort,
            Optional<Long> accountId,
            Optional<? extends QueryParamFilter> filter,
            Optional<Long> librarySectionID) throws Exception;
    }


    public interface MethodCallGetTranscodeSessions {
        dev.plexapi.sdk.models.operations.GetTranscodeSessionsResponse getTranscodeSessionsDirect() throws Exception;
    }


    public interface MethodCallStopTranscodeSession {
        dev.plexapi.sdk.models.operations.StopTranscodeSessionResponse stopTranscodeSession(
            String sessionKey) throws Exception;
    }


    public interface MethodCallGetUpdateStatus {
        dev.plexapi.sdk.models.operations.GetUpdateStatusResponse getUpdateStatusDirect() throws Exception;
    }


    public interface MethodCallCheckForUpdates {
        dev.plexapi.sdk.models.operations.CheckForUpdatesResponse checkForUpdates(
            Optional<? extends Download> download) throws Exception;
    }


    public interface MethodCallApplyUpdates {
        dev.plexapi.sdk.models.operations.ApplyUpdatesResponse applyUpdates(
            Optional<? extends Tonight> tonight,
            Optional<? extends Skip> skip) throws Exception;
    }


}
