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
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;


public class Pivot {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<String> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("key")
    private Optional<String> key;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("type")
    private Optional<String> type;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("title")
    private Optional<String> title;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("context")
    private Optional<String> context;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("symbol")
    private Optional<String> symbol;

    @JsonCreator
    public Pivot(
            @JsonProperty("id") Optional<String> id,
            @JsonProperty("key") Optional<String> key,
            @JsonProperty("type") Optional<String> type,
            @JsonProperty("title") Optional<String> title,
            @JsonProperty("context") Optional<String> context,
            @JsonProperty("symbol") Optional<String> symbol) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(key, "key");
        Utils.checkNotNull(type, "type");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(context, "context");
        Utils.checkNotNull(symbol, "symbol");
        this.id = id;
        this.key = key;
        this.type = type;
        this.title = title;
        this.context = context;
        this.symbol = symbol;
    }
    
    public Pivot() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @JsonIgnore
    public Optional<String> id() {
        return id;
    }

    @JsonIgnore
    public Optional<String> key() {
        return key;
    }

    @JsonIgnore
    public Optional<String> type() {
        return type;
    }

    @JsonIgnore
    public Optional<String> title() {
        return title;
    }

    @JsonIgnore
    public Optional<String> context() {
        return context;
    }

    @JsonIgnore
    public Optional<String> symbol() {
        return symbol;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Pivot withId(String id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    public Pivot withId(Optional<String> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public Pivot withKey(String key) {
        Utils.checkNotNull(key, "key");
        this.key = Optional.ofNullable(key);
        return this;
    }

    public Pivot withKey(Optional<String> key) {
        Utils.checkNotNull(key, "key");
        this.key = key;
        return this;
    }

    public Pivot withType(String type) {
        Utils.checkNotNull(type, "type");
        this.type = Optional.ofNullable(type);
        return this;
    }

    public Pivot withType(Optional<String> type) {
        Utils.checkNotNull(type, "type");
        this.type = type;
        return this;
    }

    public Pivot withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = Optional.ofNullable(title);
        return this;
    }

    public Pivot withTitle(Optional<String> title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    public Pivot withContext(String context) {
        Utils.checkNotNull(context, "context");
        this.context = Optional.ofNullable(context);
        return this;
    }

    public Pivot withContext(Optional<String> context) {
        Utils.checkNotNull(context, "context");
        this.context = context;
        return this;
    }

    public Pivot withSymbol(String symbol) {
        Utils.checkNotNull(symbol, "symbol");
        this.symbol = Optional.ofNullable(symbol);
        return this;
    }

    public Pivot withSymbol(Optional<String> symbol) {
        Utils.checkNotNull(symbol, "symbol");
        this.symbol = symbol;
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
        Pivot other = (Pivot) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.key, other.key) &&
            Objects.deepEquals(this.type, other.type) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.context, other.context) &&
            Objects.deepEquals(this.symbol, other.symbol);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            key,
            type,
            title,
            context,
            symbol);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Pivot.class,
                "id", id,
                "key", key,
                "type", type,
                "title", title,
                "context", context,
                "symbol", symbol);
    }
    
    public final static class Builder {
 
        private Optional<String> id = Optional.empty();
 
        private Optional<String> key = Optional.empty();
 
        private Optional<String> type = Optional.empty();
 
        private Optional<String> title = Optional.empty();
 
        private Optional<String> context = Optional.empty();
 
        private Optional<String> symbol = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        public Builder id(String id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        public Builder id(Optional<String> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder key(String key) {
            Utils.checkNotNull(key, "key");
            this.key = Optional.ofNullable(key);
            return this;
        }

        public Builder key(Optional<String> key) {
            Utils.checkNotNull(key, "key");
            this.key = key;
            return this;
        }

        public Builder type(String type) {
            Utils.checkNotNull(type, "type");
            this.type = Optional.ofNullable(type);
            return this;
        }

        public Builder type(Optional<String> type) {
            Utils.checkNotNull(type, "type");
            this.type = type;
            return this;
        }

        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = Optional.ofNullable(title);
            return this;
        }

        public Builder title(Optional<String> title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        public Builder context(String context) {
            Utils.checkNotNull(context, "context");
            this.context = Optional.ofNullable(context);
            return this;
        }

        public Builder context(Optional<String> context) {
            Utils.checkNotNull(context, "context");
            this.context = context;
            return this;
        }

        public Builder symbol(String symbol) {
            Utils.checkNotNull(symbol, "symbol");
            this.symbol = Optional.ofNullable(symbol);
            return this;
        }

        public Builder symbol(Optional<String> symbol) {
            Utils.checkNotNull(symbol, "symbol");
            this.symbol = symbol;
            return this;
        }
        
        public Pivot build() {
            return new Pivot(
                id,
                key,
                type,
                title,
                context,
                symbol);
        }
    }
}

