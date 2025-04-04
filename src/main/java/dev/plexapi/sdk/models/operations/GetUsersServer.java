/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Objects;
import java.util.Optional;

public class GetUsersServer {

    /**
     * Unique ID of the server of the connected user
     */
    private long id;

    /**
     * ID of the actual Plex server.
     */
    private long serverId;

    /**
     * Machine identifier of the Plex server.
     */
    private String machineIdentifier;

    /**
     * Name of the Plex server of the connected user.
     */
    private String name;

    private long lastSeenAt;

    /**
     * Number of libraries in the server this user has access to.
     */
    private long numLibraries;

    private Optional<? extends AllLibraries> allLibraries;

    private Optional<? extends Owned> owned;

    private Optional<? extends Pending> pending;

    @JsonCreator
    public GetUsersServer(
            long id,
            long serverId,
            String machineIdentifier,
            String name,
            long lastSeenAt,
            long numLibraries,
            Optional<? extends AllLibraries> allLibraries,
            Optional<? extends Owned> owned,
            Optional<? extends Pending> pending) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(serverId, "serverId");
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        Utils.checkNotNull(name, "name");
        Utils.checkNotNull(lastSeenAt, "lastSeenAt");
        Utils.checkNotNull(numLibraries, "numLibraries");
        Utils.checkNotNull(allLibraries, "allLibraries");
        Utils.checkNotNull(owned, "owned");
        Utils.checkNotNull(pending, "pending");
        this.id = id;
        this.serverId = serverId;
        this.machineIdentifier = machineIdentifier;
        this.name = name;
        this.lastSeenAt = lastSeenAt;
        this.numLibraries = numLibraries;
        this.allLibraries = allLibraries;
        this.owned = owned;
        this.pending = pending;
    }
    
    public GetUsersServer(
            long id,
            long serverId,
            String machineIdentifier,
            String name,
            long lastSeenAt,
            long numLibraries) {
        this(id, serverId, machineIdentifier, name, lastSeenAt, numLibraries, Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Unique ID of the server of the connected user
     */
    @JsonIgnore
    public long id() {
        return id;
    }

    /**
     * ID of the actual Plex server.
     */
    @JsonIgnore
    public long serverId() {
        return serverId;
    }

    /**
     * Machine identifier of the Plex server.
     */
    @JsonIgnore
    public String machineIdentifier() {
        return machineIdentifier;
    }

    /**
     * Name of the Plex server of the connected user.
     */
    @JsonIgnore
    public String name() {
        return name;
    }

    @JsonIgnore
    public long lastSeenAt() {
        return lastSeenAt;
    }

    /**
     * Number of libraries in the server this user has access to.
     */
    @JsonIgnore
    public long numLibraries() {
        return numLibraries;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllLibraries> allLibraries() {
        return (Optional<AllLibraries>) allLibraries;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Owned> owned() {
        return (Optional<Owned>) owned;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Pending> pending() {
        return (Optional<Pending>) pending;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * Unique ID of the server of the connected user
     */
    public GetUsersServer withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * ID of the actual Plex server.
     */
    public GetUsersServer withServerId(long serverId) {
        Utils.checkNotNull(serverId, "serverId");
        this.serverId = serverId;
        return this;
    }

    /**
     * Machine identifier of the Plex server.
     */
    public GetUsersServer withMachineIdentifier(String machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = machineIdentifier;
        return this;
    }

    /**
     * Name of the Plex server of the connected user.
     */
    public GetUsersServer withName(String name) {
        Utils.checkNotNull(name, "name");
        this.name = name;
        return this;
    }

    public GetUsersServer withLastSeenAt(long lastSeenAt) {
        Utils.checkNotNull(lastSeenAt, "lastSeenAt");
        this.lastSeenAt = lastSeenAt;
        return this;
    }

    /**
     * Number of libraries in the server this user has access to.
     */
    public GetUsersServer withNumLibraries(long numLibraries) {
        Utils.checkNotNull(numLibraries, "numLibraries");
        this.numLibraries = numLibraries;
        return this;
    }

    public GetUsersServer withAllLibraries(AllLibraries allLibraries) {
        Utils.checkNotNull(allLibraries, "allLibraries");
        this.allLibraries = Optional.ofNullable(allLibraries);
        return this;
    }

    public GetUsersServer withAllLibraries(Optional<? extends AllLibraries> allLibraries) {
        Utils.checkNotNull(allLibraries, "allLibraries");
        this.allLibraries = allLibraries;
        return this;
    }

    public GetUsersServer withOwned(Owned owned) {
        Utils.checkNotNull(owned, "owned");
        this.owned = Optional.ofNullable(owned);
        return this;
    }

    public GetUsersServer withOwned(Optional<? extends Owned> owned) {
        Utils.checkNotNull(owned, "owned");
        this.owned = owned;
        return this;
    }

    public GetUsersServer withPending(Pending pending) {
        Utils.checkNotNull(pending, "pending");
        this.pending = Optional.ofNullable(pending);
        return this;
    }

    public GetUsersServer withPending(Optional<? extends Pending> pending) {
        Utils.checkNotNull(pending, "pending");
        this.pending = pending;
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
        GetUsersServer other = (GetUsersServer) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.serverId, other.serverId) &&
            Objects.deepEquals(this.machineIdentifier, other.machineIdentifier) &&
            Objects.deepEquals(this.name, other.name) &&
            Objects.deepEquals(this.lastSeenAt, other.lastSeenAt) &&
            Objects.deepEquals(this.numLibraries, other.numLibraries) &&
            Objects.deepEquals(this.allLibraries, other.allLibraries) &&
            Objects.deepEquals(this.owned, other.owned) &&
            Objects.deepEquals(this.pending, other.pending);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            serverId,
            machineIdentifier,
            name,
            lastSeenAt,
            numLibraries,
            allLibraries,
            owned,
            pending);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUsersServer.class,
                "id", id,
                "serverId", serverId,
                "machineIdentifier", machineIdentifier,
                "name", name,
                "lastSeenAt", lastSeenAt,
                "numLibraries", numLibraries,
                "allLibraries", allLibraries,
                "owned", owned,
                "pending", pending);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private Long serverId;
 
        private String machineIdentifier;
 
        private String name;
 
        private Long lastSeenAt;
 
        private Long numLibraries;
 
        private Optional<? extends AllLibraries> allLibraries;
 
        private Optional<? extends Owned> owned;
 
        private Optional<? extends Pending> pending;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Unique ID of the server of the connected user
         */
        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * ID of the actual Plex server.
         */
        public Builder serverId(long serverId) {
            Utils.checkNotNull(serverId, "serverId");
            this.serverId = serverId;
            return this;
        }

        /**
         * Machine identifier of the Plex server.
         */
        public Builder machineIdentifier(String machineIdentifier) {
            Utils.checkNotNull(machineIdentifier, "machineIdentifier");
            this.machineIdentifier = machineIdentifier;
            return this;
        }

        /**
         * Name of the Plex server of the connected user.
         */
        public Builder name(String name) {
            Utils.checkNotNull(name, "name");
            this.name = name;
            return this;
        }

        public Builder lastSeenAt(long lastSeenAt) {
            Utils.checkNotNull(lastSeenAt, "lastSeenAt");
            this.lastSeenAt = lastSeenAt;
            return this;
        }

        /**
         * Number of libraries in the server this user has access to.
         */
        public Builder numLibraries(long numLibraries) {
            Utils.checkNotNull(numLibraries, "numLibraries");
            this.numLibraries = numLibraries;
            return this;
        }

        public Builder allLibraries(AllLibraries allLibraries) {
            Utils.checkNotNull(allLibraries, "allLibraries");
            this.allLibraries = Optional.ofNullable(allLibraries);
            return this;
        }

        public Builder allLibraries(Optional<? extends AllLibraries> allLibraries) {
            Utils.checkNotNull(allLibraries, "allLibraries");
            this.allLibraries = allLibraries;
            return this;
        }

        public Builder owned(Owned owned) {
            Utils.checkNotNull(owned, "owned");
            this.owned = Optional.ofNullable(owned);
            return this;
        }

        public Builder owned(Optional<? extends Owned> owned) {
            Utils.checkNotNull(owned, "owned");
            this.owned = owned;
            return this;
        }

        public Builder pending(Pending pending) {
            Utils.checkNotNull(pending, "pending");
            this.pending = Optional.ofNullable(pending);
            return this;
        }

        public Builder pending(Optional<? extends Pending> pending) {
            Utils.checkNotNull(pending, "pending");
            this.pending = pending;
            return this;
        }
        
        public GetUsersServer build() {
            if (allLibraries == null) {
                allLibraries = _SINGLETON_VALUE_AllLibraries.value();
            }
            if (owned == null) {
                owned = _SINGLETON_VALUE_Owned.value();
            }
            if (pending == null) {
                pending = _SINGLETON_VALUE_Pending.value();
            }
            return new GetUsersServer(
                id,
                serverId,
                machineIdentifier,
                name,
                lastSeenAt,
                numLibraries,
                allLibraries,
                owned,
                pending);
        }

        private static final LazySingletonValue<Optional<? extends AllLibraries>> _SINGLETON_VALUE_AllLibraries =
                new LazySingletonValue<>(
                        "allLibraries",
                        "0",
                        new TypeReference<Optional<? extends AllLibraries>>() {});

        private static final LazySingletonValue<Optional<? extends Owned>> _SINGLETON_VALUE_Owned =
                new LazySingletonValue<>(
                        "owned",
                        "0",
                        new TypeReference<Optional<? extends Owned>>() {});

        private static final LazySingletonValue<Optional<? extends Pending>> _SINGLETON_VALUE_Pending =
                new LazySingletonValue<>(
                        "pending",
                        "0",
                        new TypeReference<Optional<? extends Pending>>() {});
    }
}
