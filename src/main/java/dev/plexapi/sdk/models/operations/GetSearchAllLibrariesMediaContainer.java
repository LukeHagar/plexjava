/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Double;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public class GetSearchAllLibrariesMediaContainer {

    @JsonProperty("size")
    private double size;

    @JsonProperty("SearchResult")
    private List<SearchResult> searchResult;

    @JsonCreator
    public GetSearchAllLibrariesMediaContainer(
            @JsonProperty("size") double size,
            @JsonProperty("SearchResult") List<SearchResult> searchResult) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(searchResult, "searchResult");
        this.size = size;
        this.searchResult = searchResult;
    }

    @JsonIgnore
    public double size() {
        return size;
    }

    @JsonIgnore
    public List<SearchResult> searchResult() {
        return searchResult;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetSearchAllLibrariesMediaContainer withSize(double size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetSearchAllLibrariesMediaContainer withSearchResult(List<SearchResult> searchResult) {
        Utils.checkNotNull(searchResult, "searchResult");
        this.searchResult = searchResult;
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
        GetSearchAllLibrariesMediaContainer other = (GetSearchAllLibrariesMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.searchResult, other.searchResult);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            searchResult);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSearchAllLibrariesMediaContainer.class,
                "size", size,
                "searchResult", searchResult);
    }
    
    public final static class Builder {
 
        private Double size;
 
        private List<SearchResult> searchResult;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(double size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder searchResult(List<SearchResult> searchResult) {
            Utils.checkNotNull(searchResult, "searchResult");
            this.searchResult = searchResult;
            return this;
        }
        
        public GetSearchAllLibrariesMediaContainer build() {
            return new GetSearchAllLibrariesMediaContainer(
                size,
                searchResult);
        }
    }
}

