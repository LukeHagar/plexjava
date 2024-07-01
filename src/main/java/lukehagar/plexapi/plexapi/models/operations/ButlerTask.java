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

public class ButlerTask {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("name")
    private Optional<? extends String> name;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("interval")
    private Optional<? extends Double> interval;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleRandomized")
    private Optional<? extends Boolean> scheduleRandomized;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("enabled")
    private Optional<? extends Boolean> enabled;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    private Optional<? extends String> description;

    @JsonCreator
    public ButlerTask(
            @JsonProperty("name") Optional<? extends String> name,
            @JsonProperty("interval") Optional<? extends Double> interval,
            @JsonProperty("scheduleRandomized") Optional<? extends Boolean> scheduleRandomized,
            @JsonProperty("enabled") Optional<? extends Boolean> enabled,
            @JsonProperty("title") Optional<? extends String> title,
            @JsonProperty("description") Optional<? extends String> description) {
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(interval, "interval");
        Utils.checkNotNull(scheduleRandomized, "scheduleRandomized");
        Utils.checkNotNull(enabled, "enabled");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(description, "description");
        this.name = name;
        this.interval = interval;
        this.scheduleRandomized = scheduleRandomized;
        this.enabled = enabled;
        this.title = title;
        this.description = description;
    }
    
    public ButlerTask() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> name() {
        return (Optional<String>) name;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> interval() {
        return (Optional<Double>) interval;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> scheduleRandomized() {
        return (Optional<Boolean>) scheduleRandomized;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> enabled() {
        return (Optional<Boolean>) enabled;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> title() {
        return (Optional<String>) title;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> description() {
        return (Optional<String>) description;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public ButlerTask withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = Optional.ofNullable(name);
        return this;
    }

    public ButlerTask withName(Optional<? extends String> name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public ButlerTask withInterval(double interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = Optional.ofNullable(interval);
        return this;
    }

    public ButlerTask withInterval(Optional<? extends Double> interval) {
        Utils.checkNotNull(interval, "interval");
        this.interval = interval;
        return this;
    }

    public ButlerTask withScheduleRandomized(boolean scheduleRandomized) {
        Utils.checkNotNull(scheduleRandomized, "scheduleRandomized");
        this.scheduleRandomized = Optional.ofNullable(scheduleRandomized);
        return this;
    }

    public ButlerTask withScheduleRandomized(Optional<? extends Boolean> scheduleRandomized) {
        Utils.checkNotNull(scheduleRandomized, "scheduleRandomized");
        this.scheduleRandomized = scheduleRandomized;
        return this;
    }

    public ButlerTask withEnabled(boolean enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = Optional.ofNullable(enabled);
        return this;
    }

    public ButlerTask withEnabled(Optional<? extends Boolean> enabled) {
        Utils.checkNotNull(enabled, "enabled");
        this.enabled = enabled;
        return this;
    }

    public ButlerTask withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public ButlerTask withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public ButlerTask withDescription(String description) {
        Utils.checkNotNull(description, "description");
        this.description = Optional.ofNullable(description);
        return this;
    }

    public ButlerTask withDescription(Optional<? extends String> description) {
        Utils.checkNotNull(description, "description");
        this.description = description;
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
        ButlerTask other = (ButlerTask) o;
        return 
            java.util.Objects.deepEquals(this.name, other.name) &&
            java.util.Objects.deepEquals(this.interval, other.interval) &&
            java.util.Objects.deepEquals(this.scheduleRandomized, other.scheduleRandomized) &&
            java.util.Objects.deepEquals(this.enabled, other.enabled) &&
            java.util.Objects.deepEquals(this.title, other.title) &&
            java.util.Objects.deepEquals(this.description, other.description);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            name,
            interval,
            scheduleRandomized,
            enabled,
            title,
            description);
    }
    
    @Override
    public String toString() {
        return Utils.toString(ButlerTask.class,
                "name", name,
                "interval", interval,
                "scheduleRandomized", scheduleRandomized,
                "enabled", enabled,
                "title", title,
                "description", description);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> name = Optional.empty();
 
        private Optional<? extends Double> interval = Optional.empty();
 
        private Optional<? extends Boolean> scheduleRandomized = Optional.empty();
 
        private Optional<? extends Boolean> enabled = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();
 
        private Optional<? extends String> description = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = Optional.ofNullable(name);
            return this;
        }

        public Builder name(Optional<? extends String> name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder interval(double interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = Optional.ofNullable(interval);
            return this;
        }

        public Builder interval(Optional<? extends Double> interval) {
            Utils.checkNotNull(interval, "interval");
            this.interval = interval;
            return this;
        }

        public Builder scheduleRandomized(boolean scheduleRandomized) {
            Utils.checkNotNull(scheduleRandomized, "scheduleRandomized");
            this.scheduleRandomized = Optional.ofNullable(scheduleRandomized);
            return this;
        }

        public Builder scheduleRandomized(Optional<? extends Boolean> scheduleRandomized) {
            Utils.checkNotNull(scheduleRandomized, "scheduleRandomized");
            this.scheduleRandomized = scheduleRandomized;
            return this;
        }

        public Builder enabled(boolean enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = Optional.ofNullable(enabled);
            return this;
        }

        public Builder enabled(Optional<? extends Boolean> enabled) {
            Utils.checkNotNull(enabled, "enabled");
            this.enabled = enabled;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<? extends String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            Utils.checkNotNull(description, "description");
            this.description = Optional.ofNullable(description);
            return this;
        }

        public Builder description(Optional<? extends String> description) {
            Utils.checkNotNull(description, "description");
            this.description = description;
            return this;
        }
        
        public ButlerTask build() {
            return new ButlerTask(
                name,
                interval,
                scheduleRandomized,
                enabled,
                title,
                description);
        }
    }
}

