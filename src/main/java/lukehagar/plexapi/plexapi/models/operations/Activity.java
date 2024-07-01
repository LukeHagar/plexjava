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

public class Activity {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("uuid")
    private Optional<? extends String> uuid;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<? extends String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("cancellable")
    private Optional<? extends Boolean> cancellable;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("userID")
    private Optional<? extends Double> userID;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<? extends String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subtitle")
    private Optional<? extends String> subtitle;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("progress")
    private Optional<? extends Double> progress;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("Context")
    private Optional<? extends Context> context;

    @JsonCreator
    public Activity(
            @JsonProperty("uuid") Optional<? extends String> uuid,
            @JsonProperty("type") Optional<? extends String> type,
            @JsonProperty("cancellable") Optional<? extends Boolean> cancellable,
            @JsonProperty("userID") Optional<? extends Double> userID,
            @JsonProperty("title") Optional<? extends String> title,
            @JsonProperty("subtitle") Optional<? extends String> subtitle,
            @JsonProperty("progress") Optional<? extends Double> progress,
            @JsonProperty("Context") Optional<? extends Context> context) {
        Utils.checkNotNull(uuid, "uuid");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(cancellable, "cancellable");
        Utils.checkNotNull(userID, "userID");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(subtitle, "subtitle");
        Utils.checkNotNull(progress, "progress");
        Utils.checkNotNull(context, "context");
        this.uuid = uuid;
        this.type = type;
        this.cancellable = cancellable;
        this.userID = userID;
        this.title = title;
        this.subtitle = subtitle;
        this.progress = progress;
        this.context = context;
    }
    
    public Activity() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> uuid() {
        return (Optional<String>) uuid;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> type() {
        return (Optional<String>) type;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> cancellable() {
        return (Optional<Boolean>) cancellable;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> userID() {
        return (Optional<Double>) userID;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> title() {
        return (Optional<String>) title;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> subtitle() {
        return (Optional<String>) subtitle;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Double> progress() {
        return (Optional<Double>) progress;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Context> context() {
        return (Optional<Context>) context;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Activity withUuid(String uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = Optional.ofNullable(uuid);
        return this;
    }

    public Activity withUuid(Optional<? extends String> uuid) {
        Utils.checkNotNull(uuid, "uuid");
        this.uuid = uuid;
        return this;
    }

    public Activity withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Activity withType(Optional<? extends String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Activity withCancellable(boolean cancellable) {
        Utils.checkNotNull(cancellable, "cancellable");
        this.cancellable = Optional.ofNullable(cancellable);
        return this;
    }

    public Activity withCancellable(Optional<? extends Boolean> cancellable) {
        Utils.checkNotNull(cancellable, "cancellable");
        this.cancellable = cancellable;
        return this;
    }

    public Activity withUserID(double userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = Optional.ofNullable(userID);
        return this;
    }

    public Activity withUserID(Optional<? extends Double> userID) {
        Utils.checkNotNull(userID, "userID");
        this.userID = userID;
        return this;
    }

    public Activity withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public Activity withTitle(Optional<? extends String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public Activity withSubtitle(String subtitle) {
        Utils.checkNotNull(subtitle, "subtitle");
        this.subtitle = Optional.ofNullable(subtitle);
        return this;
    }

    public Activity withSubtitle(Optional<? extends String> subtitle) {
        Utils.checkNotNull(subtitle, "subtitle");
        this.subtitle = subtitle;
        return this;
    }

    public Activity withProgress(double progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = Optional.ofNullable(progress);
        return this;
    }

    public Activity withProgress(Optional<? extends Double> progress) {
        Utils.checkNotNull(progress, "progress");
        this.progress = progress;
        return this;
    }

    public Activity withContext(Context context) {
        Utils.checkNotNull(context, "context");
        this.context = Optional.ofNullable(context);
        return this;
    }

    public Activity withContext(Optional<? extends Context> context) {
        Utils.checkNotNull(context, "context");
        this.context = context;
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
        Activity other = (Activity) o;
        return 
            java.util.Objects.deepEquals(this.uuid, other.uuid) &&
            java.util.Objects.deepEquals(this.type, other.type) &&
            java.util.Objects.deepEquals(this.cancellable, other.cancellable) &&
            java.util.Objects.deepEquals(this.userID, other.userID) &&
            java.util.Objects.deepEquals(this.title, other.title) &&
            java.util.Objects.deepEquals(this.subtitle, other.subtitle) &&
            java.util.Objects.deepEquals(this.progress, other.progress) &&
            java.util.Objects.deepEquals(this.context, other.context);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            uuid,
            type,
            cancellable,
            userID,
            title,
            subtitle,
            progress,
            context);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Activity.class,
                "uuid", uuid,
                "type", type,
                "cancellable", cancellable,
                "userID", userID,
                "title", title,
                "subtitle", subtitle,
                "progress", progress,
                "context", context);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> uuid = Optional.empty();
 
        private Optional<? extends String> type = Optional.empty();
 
        private Optional<? extends Boolean> cancellable = Optional.empty();
 
        private Optional<? extends Double> userID = Optional.empty();
 
        private Optional<? extends String> title = Optional.empty();
 
        private Optional<? extends String> subtitle = Optional.empty();
 
        private Optional<? extends Double> progress = Optional.empty();
 
        private Optional<? extends Context> context = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder uuid(String uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = Optional.ofNullable(uuid);
            return this;
        }

        public Builder uuid(Optional<? extends String> uuid) {
            Utils.checkNotNull(uuid, "uuid");
            this.uuid = uuid;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<? extends String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder cancellable(boolean cancellable) {
            Utils.checkNotNull(cancellable, "cancellable");
            this.cancellable = Optional.ofNullable(cancellable);
            return this;
        }

        public Builder cancellable(Optional<? extends Boolean> cancellable) {
            Utils.checkNotNull(cancellable, "cancellable");
            this.cancellable = cancellable;
            return this;
        }

        public Builder userID(double userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = Optional.ofNullable(userID);
            return this;
        }

        public Builder userID(Optional<? extends Double> userID) {
            Utils.checkNotNull(userID, "userID");
            this.userID = userID;
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

        public Builder subtitle(String subtitle) {
            Utils.checkNotNull(subtitle, "subtitle");
            this.subtitle = Optional.ofNullable(subtitle);
            return this;
        }

        public Builder subtitle(Optional<? extends String> subtitle) {
            Utils.checkNotNull(subtitle, "subtitle");
            this.subtitle = subtitle;
            return this;
        }

        public Builder progress(double progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = Optional.ofNullable(progress);
            return this;
        }

        public Builder progress(Optional<? extends Double> progress) {
            Utils.checkNotNull(progress, "progress");
            this.progress = progress;
            return this;
        }

        public Builder context(Context context) {
            Utils.checkNotNull(context, "context");
            this.context = Optional.ofNullable(context);
            return this;
        }

        public Builder context(Optional<? extends Context> context) {
            Utils.checkNotNull(context, "context");
            this.context = context;
            return this;
        }
        
        public Activity build() {
            return new Activity(
                uuid,
                type,
                cancellable,
                userID,
                title,
                subtitle,
                progress,
                context);
        }
    }
}

