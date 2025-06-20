/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.SpeakeasyMetadata;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

public class GetMediaMetaDataRequest {

    /**
     * The id(s) of the library item(s) to return metadata for. Can be a single ID or comma-separated list of IDs.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ratingKey")
    private String ratingKey;

    /**
     * Include concerts data if set to true.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeConcerts")
    private Optional<Boolean> includeConcerts;

    /**
     * Include extra content (e.g. bonus features).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeExtras")
    private Optional<Boolean> includeExtras;

    /**
     * Include on-deck items.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeOnDeck")
    private Optional<Boolean> includeOnDeck;

    /**
     * Include popular leaves (episodes/chapters).
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includePopularLeaves")
    private Optional<Boolean> includePopularLeaves;

    /**
     * Include preferences information.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includePreferences")
    private Optional<Boolean> includePreferences;

    /**
     * Include reviews for the content.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeReviews")
    private Optional<Boolean> includeReviews;

    /**
     * Include chapter details.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeChapters")
    private Optional<Boolean> includeChapters;

    /**
     * Include station data.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeStations")
    private Optional<Boolean> includeStations;

    /**
     * Include external media data.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=includeExternalMedia")
    private Optional<Boolean> includeExternalMedia;

    /**
     * Trigger asynchronous metadata augmentation.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=asyncAugmentMetadata")
    private Optional<Boolean> asyncAugmentMetadata;

    /**
     * Trigger asynchronous file checking.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=asyncCheckFiles")
    private Optional<Boolean> asyncCheckFiles;

    /**
     * Trigger asynchronous refresh of analysis.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=asyncRefreshAnalysis")
    private Optional<Boolean> asyncRefreshAnalysis;

    /**
     * Trigger asynchronous refresh of the local media agent.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=asyncRefreshLocalMediaAgent")
    private Optional<Boolean> asyncRefreshLocalMediaAgent;

    @JsonCreator
    public GetMediaMetaDataRequest(
            String ratingKey,
            Optional<Boolean> includeConcerts,
            Optional<Boolean> includeExtras,
            Optional<Boolean> includeOnDeck,
            Optional<Boolean> includePopularLeaves,
            Optional<Boolean> includePreferences,
            Optional<Boolean> includeReviews,
            Optional<Boolean> includeChapters,
            Optional<Boolean> includeStations,
            Optional<Boolean> includeExternalMedia,
            Optional<Boolean> asyncAugmentMetadata,
            Optional<Boolean> asyncCheckFiles,
            Optional<Boolean> asyncRefreshAnalysis,
            Optional<Boolean> asyncRefreshLocalMediaAgent) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        Utils.checkNotNull(includeConcerts, "includeConcerts");
        Utils.checkNotNull(includeExtras, "includeExtras");
        Utils.checkNotNull(includeOnDeck, "includeOnDeck");
        Utils.checkNotNull(includePopularLeaves, "includePopularLeaves");
        Utils.checkNotNull(includePreferences, "includePreferences");
        Utils.checkNotNull(includeReviews, "includeReviews");
        Utils.checkNotNull(includeChapters, "includeChapters");
        Utils.checkNotNull(includeStations, "includeStations");
        Utils.checkNotNull(includeExternalMedia, "includeExternalMedia");
        Utils.checkNotNull(asyncAugmentMetadata, "asyncAugmentMetadata");
        Utils.checkNotNull(asyncCheckFiles, "asyncCheckFiles");
        Utils.checkNotNull(asyncRefreshAnalysis, "asyncRefreshAnalysis");
        Utils.checkNotNull(asyncRefreshLocalMediaAgent, "asyncRefreshLocalMediaAgent");
        this.ratingKey = ratingKey;
        this.includeConcerts = includeConcerts;
        this.includeExtras = includeExtras;
        this.includeOnDeck = includeOnDeck;
        this.includePopularLeaves = includePopularLeaves;
        this.includePreferences = includePreferences;
        this.includeReviews = includeReviews;
        this.includeChapters = includeChapters;
        this.includeStations = includeStations;
        this.includeExternalMedia = includeExternalMedia;
        this.asyncAugmentMetadata = asyncAugmentMetadata;
        this.asyncCheckFiles = asyncCheckFiles;
        this.asyncRefreshAnalysis = asyncRefreshAnalysis;
        this.asyncRefreshLocalMediaAgent = asyncRefreshLocalMediaAgent;
    }
    
    public GetMediaMetaDataRequest(
            String ratingKey) {
        this(ratingKey, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * The id(s) of the library item(s) to return metadata for. Can be a single ID or comma-separated list of IDs.
     */
    @JsonIgnore
    public String ratingKey() {
        return ratingKey;
    }

    /**
     * Include concerts data if set to true.
     */
    @JsonIgnore
    public Optional<Boolean> includeConcerts() {
        return includeConcerts;
    }

    /**
     * Include extra content (e.g. bonus features).
     */
    @JsonIgnore
    public Optional<Boolean> includeExtras() {
        return includeExtras;
    }

    /**
     * Include on-deck items.
     */
    @JsonIgnore
    public Optional<Boolean> includeOnDeck() {
        return includeOnDeck;
    }

    /**
     * Include popular leaves (episodes/chapters).
     */
    @JsonIgnore
    public Optional<Boolean> includePopularLeaves() {
        return includePopularLeaves;
    }

    /**
     * Include preferences information.
     */
    @JsonIgnore
    public Optional<Boolean> includePreferences() {
        return includePreferences;
    }

    /**
     * Include reviews for the content.
     */
    @JsonIgnore
    public Optional<Boolean> includeReviews() {
        return includeReviews;
    }

    /**
     * Include chapter details.
     */
    @JsonIgnore
    public Optional<Boolean> includeChapters() {
        return includeChapters;
    }

    /**
     * Include station data.
     */
    @JsonIgnore
    public Optional<Boolean> includeStations() {
        return includeStations;
    }

    /**
     * Include external media data.
     */
    @JsonIgnore
    public Optional<Boolean> includeExternalMedia() {
        return includeExternalMedia;
    }

    /**
     * Trigger asynchronous metadata augmentation.
     */
    @JsonIgnore
    public Optional<Boolean> asyncAugmentMetadata() {
        return asyncAugmentMetadata;
    }

    /**
     * Trigger asynchronous file checking.
     */
    @JsonIgnore
    public Optional<Boolean> asyncCheckFiles() {
        return asyncCheckFiles;
    }

    /**
     * Trigger asynchronous refresh of analysis.
     */
    @JsonIgnore
    public Optional<Boolean> asyncRefreshAnalysis() {
        return asyncRefreshAnalysis;
    }

    /**
     * Trigger asynchronous refresh of the local media agent.
     */
    @JsonIgnore
    public Optional<Boolean> asyncRefreshLocalMediaAgent() {
        return asyncRefreshLocalMediaAgent;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The id(s) of the library item(s) to return metadata for. Can be a single ID or comma-separated list of IDs.
     */
    public GetMediaMetaDataRequest withRatingKey(String ratingKey) {
        Utils.checkNotNull(ratingKey, "ratingKey");
        this.ratingKey = ratingKey;
        return this;
    }

    /**
     * Include concerts data if set to true.
     */
    public GetMediaMetaDataRequest withIncludeConcerts(boolean includeConcerts) {
        Utils.checkNotNull(includeConcerts, "includeConcerts");
        this.includeConcerts = Optional.ofNullable(includeConcerts);
        return this;
    }

    /**
     * Include concerts data if set to true.
     */
    public GetMediaMetaDataRequest withIncludeConcerts(Optional<Boolean> includeConcerts) {
        Utils.checkNotNull(includeConcerts, "includeConcerts");
        this.includeConcerts = includeConcerts;
        return this;
    }

    /**
     * Include extra content (e.g. bonus features).
     */
    public GetMediaMetaDataRequest withIncludeExtras(boolean includeExtras) {
        Utils.checkNotNull(includeExtras, "includeExtras");
        this.includeExtras = Optional.ofNullable(includeExtras);
        return this;
    }

    /**
     * Include extra content (e.g. bonus features).
     */
    public GetMediaMetaDataRequest withIncludeExtras(Optional<Boolean> includeExtras) {
        Utils.checkNotNull(includeExtras, "includeExtras");
        this.includeExtras = includeExtras;
        return this;
    }

    /**
     * Include on-deck items.
     */
    public GetMediaMetaDataRequest withIncludeOnDeck(boolean includeOnDeck) {
        Utils.checkNotNull(includeOnDeck, "includeOnDeck");
        this.includeOnDeck = Optional.ofNullable(includeOnDeck);
        return this;
    }

    /**
     * Include on-deck items.
     */
    public GetMediaMetaDataRequest withIncludeOnDeck(Optional<Boolean> includeOnDeck) {
        Utils.checkNotNull(includeOnDeck, "includeOnDeck");
        this.includeOnDeck = includeOnDeck;
        return this;
    }

    /**
     * Include popular leaves (episodes/chapters).
     */
    public GetMediaMetaDataRequest withIncludePopularLeaves(boolean includePopularLeaves) {
        Utils.checkNotNull(includePopularLeaves, "includePopularLeaves");
        this.includePopularLeaves = Optional.ofNullable(includePopularLeaves);
        return this;
    }

    /**
     * Include popular leaves (episodes/chapters).
     */
    public GetMediaMetaDataRequest withIncludePopularLeaves(Optional<Boolean> includePopularLeaves) {
        Utils.checkNotNull(includePopularLeaves, "includePopularLeaves");
        this.includePopularLeaves = includePopularLeaves;
        return this;
    }

    /**
     * Include preferences information.
     */
    public GetMediaMetaDataRequest withIncludePreferences(boolean includePreferences) {
        Utils.checkNotNull(includePreferences, "includePreferences");
        this.includePreferences = Optional.ofNullable(includePreferences);
        return this;
    }

    /**
     * Include preferences information.
     */
    public GetMediaMetaDataRequest withIncludePreferences(Optional<Boolean> includePreferences) {
        Utils.checkNotNull(includePreferences, "includePreferences");
        this.includePreferences = includePreferences;
        return this;
    }

    /**
     * Include reviews for the content.
     */
    public GetMediaMetaDataRequest withIncludeReviews(boolean includeReviews) {
        Utils.checkNotNull(includeReviews, "includeReviews");
        this.includeReviews = Optional.ofNullable(includeReviews);
        return this;
    }

    /**
     * Include reviews for the content.
     */
    public GetMediaMetaDataRequest withIncludeReviews(Optional<Boolean> includeReviews) {
        Utils.checkNotNull(includeReviews, "includeReviews");
        this.includeReviews = includeReviews;
        return this;
    }

    /**
     * Include chapter details.
     */
    public GetMediaMetaDataRequest withIncludeChapters(boolean includeChapters) {
        Utils.checkNotNull(includeChapters, "includeChapters");
        this.includeChapters = Optional.ofNullable(includeChapters);
        return this;
    }

    /**
     * Include chapter details.
     */
    public GetMediaMetaDataRequest withIncludeChapters(Optional<Boolean> includeChapters) {
        Utils.checkNotNull(includeChapters, "includeChapters");
        this.includeChapters = includeChapters;
        return this;
    }

    /**
     * Include station data.
     */
    public GetMediaMetaDataRequest withIncludeStations(boolean includeStations) {
        Utils.checkNotNull(includeStations, "includeStations");
        this.includeStations = Optional.ofNullable(includeStations);
        return this;
    }

    /**
     * Include station data.
     */
    public GetMediaMetaDataRequest withIncludeStations(Optional<Boolean> includeStations) {
        Utils.checkNotNull(includeStations, "includeStations");
        this.includeStations = includeStations;
        return this;
    }

    /**
     * Include external media data.
     */
    public GetMediaMetaDataRequest withIncludeExternalMedia(boolean includeExternalMedia) {
        Utils.checkNotNull(includeExternalMedia, "includeExternalMedia");
        this.includeExternalMedia = Optional.ofNullable(includeExternalMedia);
        return this;
    }

    /**
     * Include external media data.
     */
    public GetMediaMetaDataRequest withIncludeExternalMedia(Optional<Boolean> includeExternalMedia) {
        Utils.checkNotNull(includeExternalMedia, "includeExternalMedia");
        this.includeExternalMedia = includeExternalMedia;
        return this;
    }

    /**
     * Trigger asynchronous metadata augmentation.
     */
    public GetMediaMetaDataRequest withAsyncAugmentMetadata(boolean asyncAugmentMetadata) {
        Utils.checkNotNull(asyncAugmentMetadata, "asyncAugmentMetadata");
        this.asyncAugmentMetadata = Optional.ofNullable(asyncAugmentMetadata);
        return this;
    }

    /**
     * Trigger asynchronous metadata augmentation.
     */
    public GetMediaMetaDataRequest withAsyncAugmentMetadata(Optional<Boolean> asyncAugmentMetadata) {
        Utils.checkNotNull(asyncAugmentMetadata, "asyncAugmentMetadata");
        this.asyncAugmentMetadata = asyncAugmentMetadata;
        return this;
    }

    /**
     * Trigger asynchronous file checking.
     */
    public GetMediaMetaDataRequest withAsyncCheckFiles(boolean asyncCheckFiles) {
        Utils.checkNotNull(asyncCheckFiles, "asyncCheckFiles");
        this.asyncCheckFiles = Optional.ofNullable(asyncCheckFiles);
        return this;
    }

    /**
     * Trigger asynchronous file checking.
     */
    public GetMediaMetaDataRequest withAsyncCheckFiles(Optional<Boolean> asyncCheckFiles) {
        Utils.checkNotNull(asyncCheckFiles, "asyncCheckFiles");
        this.asyncCheckFiles = asyncCheckFiles;
        return this;
    }

    /**
     * Trigger asynchronous refresh of analysis.
     */
    public GetMediaMetaDataRequest withAsyncRefreshAnalysis(boolean asyncRefreshAnalysis) {
        Utils.checkNotNull(asyncRefreshAnalysis, "asyncRefreshAnalysis");
        this.asyncRefreshAnalysis = Optional.ofNullable(asyncRefreshAnalysis);
        return this;
    }

    /**
     * Trigger asynchronous refresh of analysis.
     */
    public GetMediaMetaDataRequest withAsyncRefreshAnalysis(Optional<Boolean> asyncRefreshAnalysis) {
        Utils.checkNotNull(asyncRefreshAnalysis, "asyncRefreshAnalysis");
        this.asyncRefreshAnalysis = asyncRefreshAnalysis;
        return this;
    }

    /**
     * Trigger asynchronous refresh of the local media agent.
     */
    public GetMediaMetaDataRequest withAsyncRefreshLocalMediaAgent(boolean asyncRefreshLocalMediaAgent) {
        Utils.checkNotNull(asyncRefreshLocalMediaAgent, "asyncRefreshLocalMediaAgent");
        this.asyncRefreshLocalMediaAgent = Optional.ofNullable(asyncRefreshLocalMediaAgent);
        return this;
    }

    /**
     * Trigger asynchronous refresh of the local media agent.
     */
    public GetMediaMetaDataRequest withAsyncRefreshLocalMediaAgent(Optional<Boolean> asyncRefreshLocalMediaAgent) {
        Utils.checkNotNull(asyncRefreshLocalMediaAgent, "asyncRefreshLocalMediaAgent");
        this.asyncRefreshLocalMediaAgent = asyncRefreshLocalMediaAgent;
        return this;
    }

    
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetMediaMetaDataRequest other = (GetMediaMetaDataRequest) o;
        return 
            Objects.deepEquals(this.ratingKey, other.ratingKey) &&
            Objects.deepEquals(this.includeConcerts, other.includeConcerts) &&
            Objects.deepEquals(this.includeExtras, other.includeExtras) &&
            Objects.deepEquals(this.includeOnDeck, other.includeOnDeck) &&
            Objects.deepEquals(this.includePopularLeaves, other.includePopularLeaves) &&
            Objects.deepEquals(this.includePreferences, other.includePreferences) &&
            Objects.deepEquals(this.includeReviews, other.includeReviews) &&
            Objects.deepEquals(this.includeChapters, other.includeChapters) &&
            Objects.deepEquals(this.includeStations, other.includeStations) &&
            Objects.deepEquals(this.includeExternalMedia, other.includeExternalMedia) &&
            Objects.deepEquals(this.asyncAugmentMetadata, other.asyncAugmentMetadata) &&
            Objects.deepEquals(this.asyncCheckFiles, other.asyncCheckFiles) &&
            Objects.deepEquals(this.asyncRefreshAnalysis, other.asyncRefreshAnalysis) &&
            Objects.deepEquals(this.asyncRefreshLocalMediaAgent, other.asyncRefreshLocalMediaAgent);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            ratingKey,
            includeConcerts,
            includeExtras,
            includeOnDeck,
            includePopularLeaves,
            includePreferences,
            includeReviews,
            includeChapters,
            includeStations,
            includeExternalMedia,
            asyncAugmentMetadata,
            asyncCheckFiles,
            asyncRefreshAnalysis,
            asyncRefreshLocalMediaAgent);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetMediaMetaDataRequest.class,
                "ratingKey", ratingKey,
                "includeConcerts", includeConcerts,
                "includeExtras", includeExtras,
                "includeOnDeck", includeOnDeck,
                "includePopularLeaves", includePopularLeaves,
                "includePreferences", includePreferences,
                "includeReviews", includeReviews,
                "includeChapters", includeChapters,
                "includeStations", includeStations,
                "includeExternalMedia", includeExternalMedia,
                "asyncAugmentMetadata", asyncAugmentMetadata,
                "asyncCheckFiles", asyncCheckFiles,
                "asyncRefreshAnalysis", asyncRefreshAnalysis,
                "asyncRefreshLocalMediaAgent", asyncRefreshLocalMediaAgent);
    }
    
    public final static class Builder {
 
        private String ratingKey;
 
        private Optional<Boolean> includeConcerts = Optional.empty();
 
        private Optional<Boolean> includeExtras = Optional.empty();
 
        private Optional<Boolean> includeOnDeck = Optional.empty();
 
        private Optional<Boolean> includePopularLeaves = Optional.empty();
 
        private Optional<Boolean> includePreferences = Optional.empty();
 
        private Optional<Boolean> includeReviews = Optional.empty();
 
        private Optional<Boolean> includeChapters = Optional.empty();
 
        private Optional<Boolean> includeStations = Optional.empty();
 
        private Optional<Boolean> includeExternalMedia = Optional.empty();
 
        private Optional<Boolean> asyncAugmentMetadata = Optional.empty();
 
        private Optional<Boolean> asyncCheckFiles = Optional.empty();
 
        private Optional<Boolean> asyncRefreshAnalysis = Optional.empty();
 
        private Optional<Boolean> asyncRefreshLocalMediaAgent = Optional.empty();
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The id(s) of the library item(s) to return metadata for. Can be a single ID or comma-separated list of IDs.
         */
        public Builder ratingKey(String ratingKey) {
            Utils.checkNotNull(ratingKey, "ratingKey");
            this.ratingKey = ratingKey;
            return this;
        }

        /**
         * Include concerts data if set to true.
         */
        public Builder includeConcerts(boolean includeConcerts) {
            Utils.checkNotNull(includeConcerts, "includeConcerts");
            this.includeConcerts = Optional.ofNullable(includeConcerts);
            return this;
        }

        /**
         * Include concerts data if set to true.
         */
        public Builder includeConcerts(Optional<Boolean> includeConcerts) {
            Utils.checkNotNull(includeConcerts, "includeConcerts");
            this.includeConcerts = includeConcerts;
            return this;
        }

        /**
         * Include extra content (e.g. bonus features).
         */
        public Builder includeExtras(boolean includeExtras) {
            Utils.checkNotNull(includeExtras, "includeExtras");
            this.includeExtras = Optional.ofNullable(includeExtras);
            return this;
        }

        /**
         * Include extra content (e.g. bonus features).
         */
        public Builder includeExtras(Optional<Boolean> includeExtras) {
            Utils.checkNotNull(includeExtras, "includeExtras");
            this.includeExtras = includeExtras;
            return this;
        }

        /**
         * Include on-deck items.
         */
        public Builder includeOnDeck(boolean includeOnDeck) {
            Utils.checkNotNull(includeOnDeck, "includeOnDeck");
            this.includeOnDeck = Optional.ofNullable(includeOnDeck);
            return this;
        }

        /**
         * Include on-deck items.
         */
        public Builder includeOnDeck(Optional<Boolean> includeOnDeck) {
            Utils.checkNotNull(includeOnDeck, "includeOnDeck");
            this.includeOnDeck = includeOnDeck;
            return this;
        }

        /**
         * Include popular leaves (episodes/chapters).
         */
        public Builder includePopularLeaves(boolean includePopularLeaves) {
            Utils.checkNotNull(includePopularLeaves, "includePopularLeaves");
            this.includePopularLeaves = Optional.ofNullable(includePopularLeaves);
            return this;
        }

        /**
         * Include popular leaves (episodes/chapters).
         */
        public Builder includePopularLeaves(Optional<Boolean> includePopularLeaves) {
            Utils.checkNotNull(includePopularLeaves, "includePopularLeaves");
            this.includePopularLeaves = includePopularLeaves;
            return this;
        }

        /**
         * Include preferences information.
         */
        public Builder includePreferences(boolean includePreferences) {
            Utils.checkNotNull(includePreferences, "includePreferences");
            this.includePreferences = Optional.ofNullable(includePreferences);
            return this;
        }

        /**
         * Include preferences information.
         */
        public Builder includePreferences(Optional<Boolean> includePreferences) {
            Utils.checkNotNull(includePreferences, "includePreferences");
            this.includePreferences = includePreferences;
            return this;
        }

        /**
         * Include reviews for the content.
         */
        public Builder includeReviews(boolean includeReviews) {
            Utils.checkNotNull(includeReviews, "includeReviews");
            this.includeReviews = Optional.ofNullable(includeReviews);
            return this;
        }

        /**
         * Include reviews for the content.
         */
        public Builder includeReviews(Optional<Boolean> includeReviews) {
            Utils.checkNotNull(includeReviews, "includeReviews");
            this.includeReviews = includeReviews;
            return this;
        }

        /**
         * Include chapter details.
         */
        public Builder includeChapters(boolean includeChapters) {
            Utils.checkNotNull(includeChapters, "includeChapters");
            this.includeChapters = Optional.ofNullable(includeChapters);
            return this;
        }

        /**
         * Include chapter details.
         */
        public Builder includeChapters(Optional<Boolean> includeChapters) {
            Utils.checkNotNull(includeChapters, "includeChapters");
            this.includeChapters = includeChapters;
            return this;
        }

        /**
         * Include station data.
         */
        public Builder includeStations(boolean includeStations) {
            Utils.checkNotNull(includeStations, "includeStations");
            this.includeStations = Optional.ofNullable(includeStations);
            return this;
        }

        /**
         * Include station data.
         */
        public Builder includeStations(Optional<Boolean> includeStations) {
            Utils.checkNotNull(includeStations, "includeStations");
            this.includeStations = includeStations;
            return this;
        }

        /**
         * Include external media data.
         */
        public Builder includeExternalMedia(boolean includeExternalMedia) {
            Utils.checkNotNull(includeExternalMedia, "includeExternalMedia");
            this.includeExternalMedia = Optional.ofNullable(includeExternalMedia);
            return this;
        }

        /**
         * Include external media data.
         */
        public Builder includeExternalMedia(Optional<Boolean> includeExternalMedia) {
            Utils.checkNotNull(includeExternalMedia, "includeExternalMedia");
            this.includeExternalMedia = includeExternalMedia;
            return this;
        }

        /**
         * Trigger asynchronous metadata augmentation.
         */
        public Builder asyncAugmentMetadata(boolean asyncAugmentMetadata) {
            Utils.checkNotNull(asyncAugmentMetadata, "asyncAugmentMetadata");
            this.asyncAugmentMetadata = Optional.ofNullable(asyncAugmentMetadata);
            return this;
        }

        /**
         * Trigger asynchronous metadata augmentation.
         */
        public Builder asyncAugmentMetadata(Optional<Boolean> asyncAugmentMetadata) {
            Utils.checkNotNull(asyncAugmentMetadata, "asyncAugmentMetadata");
            this.asyncAugmentMetadata = asyncAugmentMetadata;
            return this;
        }

        /**
         * Trigger asynchronous file checking.
         */
        public Builder asyncCheckFiles(boolean asyncCheckFiles) {
            Utils.checkNotNull(asyncCheckFiles, "asyncCheckFiles");
            this.asyncCheckFiles = Optional.ofNullable(asyncCheckFiles);
            return this;
        }

        /**
         * Trigger asynchronous file checking.
         */
        public Builder asyncCheckFiles(Optional<Boolean> asyncCheckFiles) {
            Utils.checkNotNull(asyncCheckFiles, "asyncCheckFiles");
            this.asyncCheckFiles = asyncCheckFiles;
            return this;
        }

        /**
         * Trigger asynchronous refresh of analysis.
         */
        public Builder asyncRefreshAnalysis(boolean asyncRefreshAnalysis) {
            Utils.checkNotNull(asyncRefreshAnalysis, "asyncRefreshAnalysis");
            this.asyncRefreshAnalysis = Optional.ofNullable(asyncRefreshAnalysis);
            return this;
        }

        /**
         * Trigger asynchronous refresh of analysis.
         */
        public Builder asyncRefreshAnalysis(Optional<Boolean> asyncRefreshAnalysis) {
            Utils.checkNotNull(asyncRefreshAnalysis, "asyncRefreshAnalysis");
            this.asyncRefreshAnalysis = asyncRefreshAnalysis;
            return this;
        }

        /**
         * Trigger asynchronous refresh of the local media agent.
         */
        public Builder asyncRefreshLocalMediaAgent(boolean asyncRefreshLocalMediaAgent) {
            Utils.checkNotNull(asyncRefreshLocalMediaAgent, "asyncRefreshLocalMediaAgent");
            this.asyncRefreshLocalMediaAgent = Optional.ofNullable(asyncRefreshLocalMediaAgent);
            return this;
        }

        /**
         * Trigger asynchronous refresh of the local media agent.
         */
        public Builder asyncRefreshLocalMediaAgent(Optional<Boolean> asyncRefreshLocalMediaAgent) {
            Utils.checkNotNull(asyncRefreshLocalMediaAgent, "asyncRefreshLocalMediaAgent");
            this.asyncRefreshLocalMediaAgent = asyncRefreshLocalMediaAgent;
            return this;
        }
        
        public GetMediaMetaDataRequest build() {
            return new GetMediaMetaDataRequest(
                ratingKey,
                includeConcerts,
                includeExtras,
                includeOnDeck,
                includePopularLeaves,
                includePreferences,
                includeReviews,
                includeChapters,
                includeStations,
                includeExternalMedia,
                asyncAugmentMetadata,
                asyncCheckFiles,
                asyncRefreshAnalysis,
                asyncRefreshLocalMediaAgent);
        }
    }
}
