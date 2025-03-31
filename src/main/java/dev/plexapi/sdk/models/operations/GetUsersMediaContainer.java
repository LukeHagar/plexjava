/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * GetUsersMediaContainer
 * 
 * <p>Container holding user and server details.
 */
public class GetUsersMediaContainer {

    /**
     * The friendly name of the Plex instance.
     */
    private String friendlyName;

    private String identifier;

    /**
     * Unique Machine identifier of the Plex server.
     */
    private String machineIdentifier;

    /**
     * Total number of users.
     */
    private long totalSize;

    /**
     * Number of users in the current response.
     */
    private long size;

    /**
     * List of users with access to the Plex server.
     */
    private List<User> user;

    @JsonCreator
    public GetUsersMediaContainer(
            String friendlyName,
            String identifier,
            String machineIdentifier,
            long totalSize,
            long size,
            List<User> user) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        Utils.checkNotNull(identifier, "identifier");
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        Utils.checkNotNull(totalSize, "totalSize");
        Utils.checkNotNull(size, "size");
        Utils.checkNotNull(user, "user");
        this.friendlyName = friendlyName;
        this.identifier = identifier;
        this.machineIdentifier = machineIdentifier;
        this.totalSize = totalSize;
        this.size = size;
        this.user = user;
    }

    /**
     * The friendly name of the Plex instance.
     */
    @JsonIgnore
    public String friendlyName() {
        return friendlyName;
    }

    @JsonIgnore
    public String identifier() {
        return identifier;
    }

    /**
     * Unique Machine identifier of the Plex server.
     */
    @JsonIgnore
    public String machineIdentifier() {
        return machineIdentifier;
    }

    /**
     * Total number of users.
     */
    @JsonIgnore
    public long totalSize() {
        return totalSize;
    }

    /**
     * Number of users in the current response.
     */
    @JsonIgnore
    public long size() {
        return size;
    }

    /**
     * List of users with access to the Plex server.
     */
    @JsonIgnore
    public List<User> user() {
        return user;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * The friendly name of the Plex instance.
     */
    public GetUsersMediaContainer withFriendlyName(String friendlyName) {
        Utils.checkNotNull(friendlyName, "friendlyName");
        this.friendlyName = friendlyName;
        return this;
    }

    public GetUsersMediaContainer withIdentifier(String identifier) {
        Utils.checkNotNull(identifier, "identifier");
        this.identifier = identifier;
        return this;
    }

    /**
     * Unique Machine identifier of the Plex server.
     */
    public GetUsersMediaContainer withMachineIdentifier(String machineIdentifier) {
        Utils.checkNotNull(machineIdentifier, "machineIdentifier");
        this.machineIdentifier = machineIdentifier;
        return this;
    }

    /**
     * Total number of users.
     */
    public GetUsersMediaContainer withTotalSize(long totalSize) {
        Utils.checkNotNull(totalSize, "totalSize");
        this.totalSize = totalSize;
        return this;
    }

    /**
     * Number of users in the current response.
     */
    public GetUsersMediaContainer withSize(long size) {
        Utils.checkNotNull(size, "size");
        this.size = size;
        return this;
    }

    /**
     * List of users with access to the Plex server.
     */
    public GetUsersMediaContainer withUser(List<User> user) {
        Utils.checkNotNull(user, "user");
        this.user = user;
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
        GetUsersMediaContainer other = (GetUsersMediaContainer) o;
        return 
            Objects.deepEquals(this.friendlyName, other.friendlyName) &&
            Objects.deepEquals(this.identifier, other.identifier) &&
            Objects.deepEquals(this.machineIdentifier, other.machineIdentifier) &&
            Objects.deepEquals(this.totalSize, other.totalSize) &&
            Objects.deepEquals(this.size, other.size) &&
            Objects.deepEquals(this.user, other.user);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            friendlyName,
            identifier,
            machineIdentifier,
            totalSize,
            size,
            user);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetUsersMediaContainer.class,
                "friendlyName", friendlyName,
                "identifier", identifier,
                "machineIdentifier", machineIdentifier,
                "totalSize", totalSize,
                "size", size,
                "user", user);
    }
    
    public final static class Builder {
 
        private String friendlyName;
 
        private String identifier;
 
        private String machineIdentifier;
 
        private Long totalSize;
 
        private Long size;
 
        private List<User> user;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The friendly name of the Plex instance.
         */
        public Builder friendlyName(String friendlyName) {
            Utils.checkNotNull(friendlyName, "friendlyName");
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder identifier(String identifier) {
            Utils.checkNotNull(identifier, "identifier");
            this.identifier = identifier;
            return this;
        }

        /**
         * Unique Machine identifier of the Plex server.
         */
        public Builder machineIdentifier(String machineIdentifier) {
            Utils.checkNotNull(machineIdentifier, "machineIdentifier");
            this.machineIdentifier = machineIdentifier;
            return this;
        }

        /**
         * Total number of users.
         */
        public Builder totalSize(long totalSize) {
            Utils.checkNotNull(totalSize, "totalSize");
            this.totalSize = totalSize;
            return this;
        }

        /**
         * Number of users in the current response.
         */
        public Builder size(long size) {
            Utils.checkNotNull(size, "size");
            this.size = size;
            return this;
        }

        /**
         * List of users with access to the Plex server.
         */
        public Builder user(List<User> user) {
            Utils.checkNotNull(user, "user");
            this.user = user;
            return this;
        }
        
        public GetUsersMediaContainer build() {
            return new GetUsersMediaContainer(
                friendlyName,
                identifier,
                machineIdentifier,
                totalSize,
                size,
                user);
        }
    }
}
