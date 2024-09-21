/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import java.lang.Double;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallGetServerCapabilities {
        GetServerCapabilitiesResponse getServerCapabilitiesDirect() throws Exception;
    }


    public interface MethodCallGetServerPreferences {
        GetServerPreferencesResponse getServerPreferencesDirect() throws Exception;
    }


    public interface MethodCallGetAvailableClients {
        GetAvailableClientsResponse getAvailableClientsDirect() throws Exception;
    }


    public interface MethodCallGetDevices {
        GetDevicesResponse getDevicesDirect() throws Exception;
    }


    public interface MethodCallGetServerIdentity {
        GetServerIdentityResponse getServerIdentityDirect() throws Exception;
    }


    public interface MethodCallGetMyPlexAccount {
        GetMyPlexAccountResponse getMyPlexAccountDirect() throws Exception;
    }


    public interface MethodCallGetResizedPhoto {
        GetResizedPhotoResponse getResizedPhoto(
            GetResizedPhotoRequest request) throws Exception;
    }


    public interface MethodCallGetMediaProviders {
        GetMediaProvidersResponse getMediaProviders(
            String xPlexToken) throws Exception;
    }


    public interface MethodCallGetServerList {
        GetServerListResponse getServerListDirect() throws Exception;
    }


    public interface MethodCallMarkPlayed {
        MarkPlayedResponse markPlayed(
            double key) throws Exception;
    }


    public interface MethodCallMarkUnplayed {
        MarkUnplayedResponse markUnplayed(
            double key) throws Exception;
    }


    public interface MethodCallUpdatePlayProgress {
        UpdatePlayProgressResponse updatePlayProgress(
            String key,
            double time,
            String state) throws Exception;
    }


    public interface MethodCallGetBannerImage {
        GetBannerImageResponse getBannerImage(
            GetBannerImageRequest request) throws Exception;
    }


    public interface MethodCallGetThumbImage {
        GetThumbImageResponse getThumbImage(
            GetThumbImageRequest request) throws Exception;
    }


    public interface MethodCallGetTimeline {
        GetTimelineResponse getTimeline(
            GetTimelineRequest request) throws Exception;
    }


    public interface MethodCallStartUniversalTranscode {
        StartUniversalTranscodeResponse startUniversalTranscode(
            StartUniversalTranscodeRequest request) throws Exception;
    }


    public interface MethodCallGetServerActivities {
        GetServerActivitiesResponse getServerActivitiesDirect() throws Exception;
    }


    public interface MethodCallCancelServerActivities {
        CancelServerActivitiesResponse cancelServerActivities(
            String activityUUID) throws Exception;
    }


    public interface MethodCallGetButlerTasks {
        GetButlerTasksResponse getButlerTasksDirect() throws Exception;
    }


    public interface MethodCallStartAllTasks {
        StartAllTasksResponse startAllTasksDirect() throws Exception;
    }


    public interface MethodCallStopAllTasks {
        StopAllTasksResponse stopAllTasksDirect() throws Exception;
    }


    public interface MethodCallStartTask {
        StartTaskResponse startTask(
            TaskName taskName) throws Exception;
    }


    public interface MethodCallStopTask {
        StopTaskResponse stopTask(
            PathParamTaskName taskName) throws Exception;
    }


    public interface MethodCallGetCompanionsData {
        GetCompanionsDataResponse getCompanionsData(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetUserFriends {
        GetUserFriendsResponse getUserFriends(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetGeoData {
        GetGeoDataResponse getGeoData(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetHomeData {
        GetHomeDataResponse getHomeDataDirect() throws Exception;
    }


    public interface MethodCallGetServerResources {
        GetServerResourcesResponse getServerResources(
            Optional<? extends IncludeHttps> includeHttps,
            Optional<? extends IncludeRelay> includeRelay,
            Optional<? extends IncludeIPv6> includeIPv6,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetPin {
        GetPinResponse getPin(
            GetPinRequest request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetTokenByPinId {
        GetTokenByPinIdResponse getTokenByPinId(
            long pinID,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetGlobalHubs {
        GetGlobalHubsResponse getGlobalHubs(
            Optional<Double> count,
            Optional<? extends OnlyTransient> onlyTransient) throws Exception;
    }


    public interface MethodCallGetLibraryHubs {
        GetLibraryHubsResponse getLibraryHubs(
            double sectionId,
            Optional<Double> count,
            Optional<? extends QueryParamOnlyTransient> onlyTransient) throws Exception;
    }


    public interface MethodCallPerformSearch {
        PerformSearchResponse performSearch(
            String query,
            Optional<Double> sectionId,
            Optional<Double> limit) throws Exception;
    }


    public interface MethodCallPerformVoiceSearch {
        PerformVoiceSearchResponse performVoiceSearch(
            String query,
            Optional<Double> sectionId,
            Optional<Double> limit) throws Exception;
    }


    public interface MethodCallGetSearchResults {
        GetSearchResultsResponse getSearchResults(
            String query) throws Exception;
    }


    public interface MethodCallGetFileHash {
        GetFileHashResponse getFileHash(
            String url,
            Optional<Double> type) throws Exception;
    }


    public interface MethodCallGetRecentlyAdded {
        GetRecentlyAddedResponse getRecentlyAdded(
            Optional<Integer> xPlexContainerStart,
            Optional<Integer> xPlexContainerSize) throws Exception;
    }


    public interface MethodCallGetAllLibraries {
        GetAllLibrariesResponse getAllLibrariesDirect() throws Exception;
    }


    public interface MethodCallGetLibraryDetails {
        GetLibraryDetailsResponse getLibraryDetails(
            int sectionKey,
            Optional<? extends IncludeDetails> includeDetails) throws Exception;
    }


    public interface MethodCallDeleteLibrary {
        DeleteLibraryResponse deleteLibrary(
            int sectionKey) throws Exception;
    }


    public interface MethodCallGetLibraryItems {
        GetLibraryItemsResponse getLibraryItems(
            GetLibraryItemsRequest request) throws Exception;
    }


    public interface MethodCallGetRefreshLibraryMetadata {
        GetRefreshLibraryMetadataResponse getRefreshLibraryMetadata(
            int sectionKey,
            Optional<? extends Force> force) throws Exception;
    }


    public interface MethodCallGetSearchLibrary {
        GetSearchLibraryResponse getSearchLibrary(
            int sectionKey,
            QueryParamType type) throws Exception;
    }


    public interface MethodCallGetMetaDataByRatingKey {
        GetMetaDataByRatingKeyResponse getMetaDataByRatingKey(
            long ratingKey) throws Exception;
    }


    public interface MethodCallGetMetadataChildren {
        GetMetadataChildrenResponse getMetadataChildren(
            double ratingKey,
            Optional<String> includeElements) throws Exception;
    }


    public interface MethodCallGetTopWatchedContent {
        GetTopWatchedContentResponse getTopWatchedContent(
            GetTopWatchedContentQueryParamType type,
            Optional<Long> includeGuids) throws Exception;
    }


    public interface MethodCallGetOnDeck {
        GetOnDeckResponse getOnDeckDirect() throws Exception;
    }


    public interface MethodCallGetWatchList {
        GetWatchListResponse getWatchList(
            GetWatchListRequest request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallLogLine {
        LogLineResponse logLine(
            Level level,
            String message,
            String source) throws Exception;
    }


    public interface MethodCallLogMultiLine {
        LogMultiLineResponse logMultiLine(
            String request) throws Exception;
    }


    public interface MethodCallEnablePaperTrail {
        EnablePaperTrailResponse enablePaperTrailDirect() throws Exception;
    }


    public interface MethodCallCreatePlaylist {
        CreatePlaylistResponse createPlaylist(
            CreatePlaylistRequest request) throws Exception;
    }


    public interface MethodCallGetPlaylists {
        GetPlaylistsResponse getPlaylists(
            Optional<? extends PlaylistType> playlistType,
            Optional<? extends QueryParamSmart> smart) throws Exception;
    }


    public interface MethodCallGetPlaylist {
        GetPlaylistResponse getPlaylist(
            double playlistID) throws Exception;
    }


    public interface MethodCallDeletePlaylist {
        DeletePlaylistResponse deletePlaylist(
            double playlistID) throws Exception;
    }


    public interface MethodCallUpdatePlaylist {
        UpdatePlaylistResponse updatePlaylist(
            double playlistID,
            Optional<String> title,
            Optional<String> summary) throws Exception;
    }


    public interface MethodCallGetPlaylistContents {
        GetPlaylistContentsResponse getPlaylistContents(
            double playlistID,
            GetPlaylistContentsQueryParamType type) throws Exception;
    }


    public interface MethodCallClearPlaylistContents {
        ClearPlaylistContentsResponse clearPlaylistContents(
            double playlistID) throws Exception;
    }


    public interface MethodCallAddPlaylistContents {
        AddPlaylistContentsResponse addPlaylistContents(
            double playlistID,
            String uri,
            Optional<Double> playQueueID) throws Exception;
    }


    public interface MethodCallUploadPlaylist {
        UploadPlaylistResponse uploadPlaylist(
            String path,
            QueryParamForce force,
            long sectionID) throws Exception;
    }


    public interface MethodCallGetTransientToken {
        GetTransientTokenResponse getTransientToken(
            GetTransientTokenQueryParamType type,
            Scope scope) throws Exception;
    }


    public interface MethodCallGetSourceConnectionInformation {
        GetSourceConnectionInformationResponse getSourceConnectionInformation(
            String source) throws Exception;
    }


    public interface MethodCallGetTokenDetails {
        GetTokenDetailsResponse getTokenDetails(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallPostUsersSignInData {
        PostUsersSignInDataResponse postUsersSignInData(
            Optional<? extends PostUsersSignInDataRequestBody> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallGetStatistics {
        GetStatisticsResponse getStatistics(
            Optional<Long> timespan) throws Exception;
    }


    public interface MethodCallGetResourcesStatistics {
        GetResourcesStatisticsResponse getResourcesStatistics(
            Optional<Long> timespan) throws Exception;
    }


    public interface MethodCallGetBandwidthStatistics {
        GetBandwidthStatisticsResponse getBandwidthStatistics(
            Optional<Long> timespan) throws Exception;
    }


    public interface MethodCallGetSessions {
        GetSessionsResponse getSessionsDirect() throws Exception;
    }


    public interface MethodCallGetSessionHistory {
        GetSessionHistoryResponse getSessionHistory(
            Optional<String> sort,
            Optional<Long> accountId,
            Optional<? extends QueryParamFilter> filter,
            Optional<Long> librarySectionID) throws Exception;
    }


    public interface MethodCallGetTranscodeSessions {
        GetTranscodeSessionsResponse getTranscodeSessionsDirect() throws Exception;
    }


    public interface MethodCallStopTranscodeSession {
        StopTranscodeSessionResponse stopTranscodeSession(
            String sessionKey) throws Exception;
    }


    public interface MethodCallGetUpdateStatus {
        GetUpdateStatusResponse getUpdateStatusDirect() throws Exception;
    }


    public interface MethodCallCheckForUpdates {
        CheckForUpdatesResponse checkForUpdates(
            Optional<? extends Download> download) throws Exception;
    }


    public interface MethodCallApplyUpdates {
        ApplyUpdatesResponse applyUpdates(
            Optional<? extends Tonight> tonight,
            Optional<? extends Skip> skip) throws Exception;
    }


}
