/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;

public class GetUpdateStatusMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<? extends Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("canInstall")
    private Optional<? extends Boolean> canInstall;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("checkedAt")
    private Optional<? extends Integer> checkedAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("downloadURL")
    private Optional<? extends String> downloadURL;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends Integer> status;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Release")
    private Optional<? extends java.util.List<Release>> release;

    @JsonCreator
    public GetUpdateStatusMediaContainer(
            @JsonProperty("size") Optional<? extends Integer> size,
            @JsonProperty("canInstall") Optional<? extends Boolean> canInstall,
            @JsonProperty("checkedAt") Optional<? extends Integer> checkedAt,
            @JsonProperty("downloadURL") Optional<? extends String> downloadURL,
            @JsonProperty("status") Optional<? extends Integer> status,
            @JsonProperty("Release") Optional<? extends java.util.List<Release>> release) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(canInstall, "canInstall");
        Utils.checkNotNull(checkedAt, "checkedAt");
        Utils.checkNotNull(downloadURL, "downloadURL");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(release, "release");
        this.size = size;
        this.canInstall = canInstall;
        this.checkedAt = checkedAt;
        this.downloadURL = downloadURL;
        this.status = status;
        this.release = release;
    }
    
    public GetUpdateStatusMediaContainer() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> size() {
        return (Optional<Integer>) size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> canInstall() {
        return (Optional<Boolean>) canInstall;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> checkedAt() {
        return (Optional<Integer>) checkedAt;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> downloadURL() {
        return (Optional<String>) downloadURL;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Integer> status() {
        return (Optional<Integer>) status;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<java.util.List<Release>> release() {
        return (Optional<java.util.List<Release>>) release;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetUpdateStatusMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetUpdateStatusMediaContainer withSize(Optional<? extends Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetUpdateStatusMediaContainer withCanInstall(boolean canInstall) {
        Utils.checkNotNull(canInstall, "canInstall");
        this.canInstall = Optional.ofNullable(canInstall);
        return this;
    }

    public GetUpdateStatusMediaContainer withCanInstall(Optional<? extends Boolean> canInstall) {
        Utils.checkNotNull(canInstall, "canInstall");
        this.canInstall = canInstall;
        return this;
    }

    public GetUpdateStatusMediaContainer withCheckedAt(int checkedAt) {
        Utils.checkNotNull(checkedAt, "checkedAt");
        this.checkedAt = Optional.ofNullable(checkedAt);
        return this;
    }

    public GetUpdateStatusMediaContainer withCheckedAt(Optional<? extends Integer> checkedAt) {
        Utils.checkNotNull(checkedAt, "checkedAt");
        this.checkedAt = checkedAt;
        return this;
    }

    public GetUpdateStatusMediaContainer withDownloadURL(String downloadURL) {
        Utils.checkNotNull(downloadURL, "downloadURL");
        this.downloadURL = Optional.ofNullable(downloadURL);
        return this;
    }

    public GetUpdateStatusMediaContainer withDownloadURL(Optional<? extends String> downloadURL) {
        Utils.checkNotNull(downloadURL, "downloadURL");
        this.downloadURL = downloadURL;
        return this;
    }

    public GetUpdateStatusMediaContainer withStatus(int status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    public GetUpdateStatusMediaContainer withStatus(Optional<? extends Integer> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    public GetUpdateStatusMediaContainer withRelease(java.util.List<Release> release) {
        Utils.checkNotNull(release, "release");
        this.release = Optional.ofNullable(release);
        return this;
    }

    public GetUpdateStatusMediaContainer withRelease(Optional<? extends java.util.List<Release>> release) {
        Utils.checkNotNull(release, "release");
        this.release = release;
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
        GetUpdateStatusMediaContainer other = (GetUpdateStatusMediaContainer) o;
        return 
            java.util.Objects.deepEquals(this.size, other.size) &&
            java.util.Objects.deepEquals(this.canInstall, other.canInstall) &&
            java.util.Objects.deepEquals(this.checkedAt, other.checkedAt) &&
            java.util.Objects.deepEquals(this.downloadURL, other.downloadURL) &&
            java.util.Objects.deepEquals(this.status, other.status) &&
            java.util.Objects.deepEquals(this.release, other.release);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            size,
            canInstall,
            checkedAt,
            downloadURL,
            status,
            release);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUpdateStatusMediaContainer.class,
                "size", size,
                "canInstall", canInstall,
                "checkedAt", checkedAt,
                "downloadURL", downloadURL,
                "status", status,
                "release", release);
    }
    
    public final static class Builder {
 
        private Optional<? extends Integer> size = Optional.empty();
 
        private Optional<? extends Boolean> canInstall = Optional.empty();
 
        private Optional<? extends Integer> checkedAt = Optional.empty();
 
        private Optional<? extends String> downloadURL = Optional.empty();
 
        private Optional<? extends Integer> status = Optional.empty();
 
        private Optional<? extends java.util.List<Release>> release = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<? extends Integer> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder canInstall(boolean canInstall) {
            Utils.checkNotNull(canInstall, "canInstall");
            this.canInstall = Optional.ofNullable(canInstall);
            return this;
        }

        public Builder canInstall(Optional<? extends Boolean> canInstall) {
            Utils.checkNotNull(canInstall, "canInstall");
            this.canInstall = canInstall;
            return this;
        }

        public Builder checkedAt(int checkedAt) {
            Utils.checkNotNull(checkedAt, "checkedAt");
            this.checkedAt = Optional.ofNullable(checkedAt);
            return this;
        }

        public Builder checkedAt(Optional<? extends Integer> checkedAt) {
            Utils.checkNotNull(checkedAt, "checkedAt");
            this.checkedAt = checkedAt;
            return this;
        }

        public Builder downloadURL(String downloadURL) {
            Utils.checkNotNull(downloadURL, "downloadURL");
            this.downloadURL = Optional.ofNullable(downloadURL);
            return this;
        }

        public Builder downloadURL(Optional<? extends String> downloadURL) {
            Utils.checkNotNull(downloadURL, "downloadURL");
            this.downloadURL = downloadURL;
            return this;
        }

        public Builder status(int status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        public Builder status(Optional<? extends Integer> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        public Builder release(java.util.List<Release> release) {
            Utils.checkNotNull(release, "release");
            this.release = Optional.ofNullable(release);
            return this;
        }

        public Builder release(Optional<? extends java.util.List<Release>> release) {
            Utils.checkNotNull(release, "release");
            this.release = release;
            return this;
        }
        
        public GetUpdateStatusMediaContainer build() {
            return new GetUpdateStatusMediaContainer(
                size,
                canInstall,
                checkedAt,
                downloadURL,
                status,
                release);
        }
    }
}
