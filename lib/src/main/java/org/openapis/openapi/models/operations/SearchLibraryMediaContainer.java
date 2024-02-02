/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SearchLibraryMediaContainer {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    public Integer size;

    public SearchLibraryMediaContainer withSize(Integer size) {
        this.size = size;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("allowSync")
    public Boolean allowSync;

    public SearchLibraryMediaContainer withAllowSync(Boolean allowSync) {
        this.allowSync = allowSync;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("art")
    public String art;

    public SearchLibraryMediaContainer withArt(String art) {
        this.art = art;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("identifier")
    public String identifier;

    public SearchLibraryMediaContainer withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagPrefix")
    public String mediaTagPrefix;

    public SearchLibraryMediaContainer withMediaTagPrefix(String mediaTagPrefix) {
        this.mediaTagPrefix = mediaTagPrefix;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("mediaTagVersion")
    public Integer mediaTagVersion;

    public SearchLibraryMediaContainer withMediaTagVersion(Integer mediaTagVersion) {
        this.mediaTagVersion = mediaTagVersion;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nocache")
    public Boolean nocache;

    public SearchLibraryMediaContainer withNocache(Boolean nocache) {
        this.nocache = nocache;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("thumb")
    public String thumb;

    public SearchLibraryMediaContainer withThumb(String thumb) {
        this.thumb = thumb;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title1")
    public String title1;

    public SearchLibraryMediaContainer withTitle1(String title1) {
        this.title1 = title1;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title2")
    public String title2;

    public SearchLibraryMediaContainer withTitle2(String title2) {
        this.title2 = title2;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewGroup")
    public String viewGroup;

    public SearchLibraryMediaContainer withViewGroup(String viewGroup) {
        this.viewGroup = viewGroup;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("viewMode")
    public Integer viewMode;

    public SearchLibraryMediaContainer withViewMode(Integer viewMode) {
        this.viewMode = viewMode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Metadata")
    public SearchLibraryMetadata[] metadata;

    public SearchLibraryMediaContainer withMetadata(SearchLibraryMetadata[] metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public SearchLibraryMediaContainer(){}
}
