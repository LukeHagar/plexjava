/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Float;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

public class SearchResult {

    @JsonProperty("score")
    private float score;

    @JsonProperty("Metadata")
    private GetSearchAllLibrariesMetadata metadata;

    @JsonCreator
    public SearchResult(
            @JsonProperty("score") float score,
            @JsonProperty("Metadata") GetSearchAllLibrariesMetadata metadata) {
        Utils.checkNotNull(score, "score");
        Utils.checkNotNull(metadata, "metadata");
        this.score = score;
        this.metadata = metadata;
    }

    @JsonIgnore
    public float score() {
        return score;
    }

    @JsonIgnore
    public GetSearchAllLibrariesMetadata metadata() {
        return metadata;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public SearchResult withScore(float score) {
        Utils.checkNotNull(score, "score");
        this.score = score;
        return this;
    }

    public SearchResult withMetadata(GetSearchAllLibrariesMetadata metadata) {
        Utils.checkNotNull(metadata, "metadata");
        this.metadata = metadata;
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
        SearchResult other = (SearchResult) o;
        return 
            Objects.deepEquals(this.score, other.score) &&
            Objects.deepEquals(this.metadata, other.metadata);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            score,
            metadata);
    }
    
    @Override
    public String toString() {
        return Utils.toString(SearchResult.class,
                "score", score,
                "metadata", metadata);
    }
    
    public final static class Builder {
 
        private Float score;
 
        private GetSearchAllLibrariesMetadata metadata;  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder score(float score) {
            Utils.checkNotNull(score, "score");
            this.score = score;
            return this;
        }

        public Builder metadata(GetSearchAllLibrariesMetadata metadata) {
            Utils.checkNotNull(metadata, "metadata");
            this.metadata = metadata;
            return this;
        }
        
        public SearchResult build() {
            return new SearchResult(
                score,
                metadata);
        }
    }
}

