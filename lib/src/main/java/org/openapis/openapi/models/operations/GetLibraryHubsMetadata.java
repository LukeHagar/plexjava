/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;


public class GetLibraryHubsMetadata {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingKey")
    public String ratingKey;

    public GetLibraryHubsMetadata withRatingKey(String ratingKey) {
        this.ratingKey = ratingKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetLibraryHubsMetadata withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("guid")
    public String guid;

    public GetLibraryHubsMetadata withGuid(String guid) {
        this.guid = guid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("studio")
    public String studio;

    public GetLibraryHubsMetadata withStudio(String studio) {
        this.studio = studio;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetLibraryHubsMetadata withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public GetLibraryHubsMetadata withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionTitle")
    public String librarySectionTitle;

    public GetLibraryHubsMetadata withLibrarySectionTitle(String librarySectionTitle) {
        this.librarySectionTitle = librarySectionTitle;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionID")
    public Integer librarySectionID;

    public GetLibraryHubsMetadata withLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("librarySectionKey")
    public String librarySectionKey;

    public GetLibraryHubsMetadata withLibrarySectionKey(String librarySectionKey) {
        this.librarySectionKey = librarySectionKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contentRating")
    public String contentRating;

    public GetLibraryHubsMetadata withContentRating(String contentRating) {
        this.contentRating = contentRating;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("summary")
    public String summary;

    public GetLibraryHubsMetadata withSummary(String summary) {
        this.summary = summary;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("rating")
    public Double rating;

    public GetLibraryHubsMetadata withRating(Double rating) {
        this.rating = rating;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audienceRating")
    public Double audienceRating;

    public GetLibraryHubsMetadata withAudienceRating(Double audienceRating) {
        this.audienceRating = audienceRating;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewCount")
    public Integer viewCount;

    public GetLibraryHubsMetadata withViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("lastViewedAt")
    public Integer lastViewedAt;

    public GetLibraryHubsMetadata withLastViewedAt(Integer lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("year")
    public Integer year;

    public GetLibraryHubsMetadata withYear(Integer year) {
        this.year = year;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("tagline")
    public String tagline;

    public GetLibraryHubsMetadata withTagline(String tagline) {
        this.tagline = tagline;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public GetLibraryHubsMetadata withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    public String art;

    public GetLibraryHubsMetadata withArt(String art) {
        this.art = art;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("duration")
    public Integer duration;

    public GetLibraryHubsMetadata withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("originallyAvailableAt")
    public LocalDate originallyAvailableAt;

    public GetLibraryHubsMetadata withOriginallyAvailableAt(LocalDate originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("addedAt")
    public Integer addedAt;

    public GetLibraryHubsMetadata withAddedAt(Integer addedAt) {
        this.addedAt = addedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    public Integer updatedAt;

    public GetLibraryHubsMetadata withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("audienceRatingImage")
    public String audienceRatingImage;

    public GetLibraryHubsMetadata withAudienceRatingImage(String audienceRatingImage) {
        this.audienceRatingImage = audienceRatingImage;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("primaryExtraKey")
    public String primaryExtraKey;

    public GetLibraryHubsMetadata withPrimaryExtraKey(String primaryExtraKey) {
        this.primaryExtraKey = primaryExtraKey;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ratingImage")
    public String ratingImage;

    public GetLibraryHubsMetadata withRatingImage(String ratingImage) {
        this.ratingImage = ratingImage;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Media")
    public GetLibraryHubsMedia[] media;

    public GetLibraryHubsMetadata withMedia(GetLibraryHubsMedia[] media) {
        this.media = media;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Genre")
    public GetLibraryHubsGenre[] genre;

    public GetLibraryHubsMetadata withGenre(GetLibraryHubsGenre[] genre) {
        this.genre = genre;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Country")
    public GetLibraryHubsCountry[] country;

    public GetLibraryHubsMetadata withCountry(GetLibraryHubsCountry[] country) {
        this.country = country;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Director")
    public GetLibraryHubsDirector[] director;

    public GetLibraryHubsMetadata withDirector(GetLibraryHubsDirector[] director) {
        this.director = director;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Role")
    public GetLibraryHubsRole[] role;

    public GetLibraryHubsMetadata withRole(GetLibraryHubsRole[] role) {
        this.role = role;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Writer")
    public GetLibraryHubsWriter[] writer;

    public GetLibraryHubsMetadata withWriter(GetLibraryHubsWriter[] writer) {
        this.writer = writer;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("skipCount")
    public Integer skipCount;

    public GetLibraryHubsMetadata withSkipCount(Integer skipCount) {
        this.skipCount = skipCount;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("chapterSource")
    public String chapterSource;

    public GetLibraryHubsMetadata withChapterSource(String chapterSource) {
        this.chapterSource = chapterSource;
        return this;
    }
    
    public GetLibraryHubsMetadata(){}
}
