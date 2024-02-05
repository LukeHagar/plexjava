/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetLibrariesDirectory {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    public Boolean allowSync;

    public GetLibrariesDirectory withAllowSync(Boolean allowSync) {
        this.allowSync = allowSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    public String art;

    public GetLibrariesDirectory withArt(String art) {
        this.art = art;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("composite")
    public String composite;

    public GetLibrariesDirectory withComposite(String composite) {
        this.composite = composite;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("filters")
    public Boolean filters;

    public GetLibrariesDirectory withFilters(Boolean filters) {
        this.filters = filters;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("refreshing")
    public Boolean refreshing;

    public GetLibrariesDirectory withRefreshing(Boolean refreshing) {
        this.refreshing = refreshing;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public GetLibrariesDirectory withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    public String key;

    public GetLibrariesDirectory withKey(String key) {
        this.key = key;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    public String type;

    public GetLibrariesDirectory withType(String type) {
        this.type = type;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    public String title;

    public GetLibrariesDirectory withTitle(String title) {
        this.title = title;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("agent")
    public String agent;

    public GetLibrariesDirectory withAgent(String agent) {
        this.agent = agent;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scanner")
    public String scanner;

    public GetLibrariesDirectory withScanner(String scanner) {
        this.scanner = scanner;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("language")
    public String language;

    public GetLibrariesDirectory withLanguage(String language) {
        this.language = language;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    public String uuid;

    public GetLibrariesDirectory withUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("updatedAt")
    public Integer updatedAt;

    public GetLibrariesDirectory withUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    public Integer createdAt;

    public GetLibrariesDirectory withCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scannedAt")
    public Integer scannedAt;

    public GetLibrariesDirectory withScannedAt(Integer scannedAt) {
        this.scannedAt = scannedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("content")
    public Boolean content;

    public GetLibrariesDirectory withContent(Boolean content) {
        this.content = content;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("directory")
    public Boolean directory;

    public GetLibrariesDirectory withDirectory(Boolean directory) {
        this.directory = directory;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("contentChangedAt")
    public Integer contentChangedAt;

    public GetLibrariesDirectory withContentChangedAt(Integer contentChangedAt) {
        this.contentChangedAt = contentChangedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("hidden")
    public Integer hidden;

    public GetLibrariesDirectory withHidden(Integer hidden) {
        this.hidden = hidden;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Location")
    public GetLibrariesLocation[] location;

    public GetLibrariesDirectory withLocation(GetLibrariesLocation[] location) {
        this.location = location;
        return this;
    }
    
    public GetLibrariesDirectory(){}
}
