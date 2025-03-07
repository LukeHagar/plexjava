/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class GetServerPreferencesMediaContainer {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("size")
    private Optional<Integer> size;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Setting")
    private Optional<? extends List<Setting>> setting;

    @JsonCreator
    public GetServerPreferencesMediaContainer(
            @JsonProperty("size") Optional<Integer> size,
            @JsonProperty("Setting") Optional<? extends List<Setting>> setting) {
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(setting, "setting");
        this.size = size;
        this.setting = setting;
    }
    
    public GetServerPreferencesMediaContainer() {
        this(Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<Integer> size() {
        return size;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<Setting>> setting() {
        return (Optional<List<Setting>>) setting;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public GetServerPreferencesMediaContainer withSize(int size) {
        Utils.checkNotNull(size, "size");
        this.size = Optional.ofNullable(size);
        return this;
    }

    public GetServerPreferencesMediaContainer withSize(Optional<Integer> size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    public GetServerPreferencesMediaContainer withSetting(List<Setting> setting) {
        Utils.checkNotNull(setting, "setting");
        this.setting = Optional.ofNullable(setting);
        return this;
    }

    public GetServerPreferencesMediaContainer withSetting(Optional<? extends List<Setting>> setting) {
        Utils.checkNotNull(setting, "setting");
        this.setting = setting;
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
        GetServerPreferencesMediaContainer other = (GetServerPreferencesMediaContainer) o;
        return 
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.setting, other.setting);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            size,
            setting);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetServerPreferencesMediaContainer.class,
                "size", size,
                "setting", setting);
    }
    
    public final static class Builder {
 
        private Optional<Integer> size = Optional.empty();
 
        private Optional<? extends List<Setting>> setting = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder size(int size) {
            Utils.checkNotNull(size, "size");
            this.size = Optional.ofNullable(size);
            return this;
        }

        public Builder size(Optional<Integer> size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        public Builder setting(List<Setting> setting) {
            Utils.checkNotNull(setting, "setting");
            this.setting = Optional.ofNullable(setting);
            return this;
        }

        public Builder setting(Optional<? extends List<Setting>> setting) {
            Utils.checkNotNull(setting, "setting");
            this.setting = setting;
            return this;
        }
        
        public GetServerPreferencesMediaContainer build() {
            return new GetServerPreferencesMediaContainer(
                size,
                setting);
        }
    }
}

