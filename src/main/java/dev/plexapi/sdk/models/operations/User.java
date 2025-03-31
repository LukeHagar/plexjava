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
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

public class User {

    /**
     * User's unique ID.
     */
    private long id;

    /**
     * User's display name.
     */
    private String title;

    /**
     * User's username.
     */
    private String username;

    /**
     * User's email address.
     */
    private String email;

    /**
     * ID of the user's recommendation playlist.
     */
    private JsonNullable<String> recommendationsPlaylistId;

    /**
     * URL to the user's avatar image.
     */
    private String thumb;

    private Optional<? extends Protected> protected_;

    private Optional<? extends Home> home;

    private Optional<? extends AllowTuners> allowTuners;

    private Optional<? extends AllowSync> allowSync;

    private Optional<? extends AllowCameraUpload> allowCameraUpload;

    private Optional<? extends AllowChannels> allowChannels;

    private Optional<? extends AllowSubtitleAdmin> allowSubtitleAdmin;

    /**
     * Filters applied for all content.
     */
    private JsonNullable<String> filterAll;

    /**
     * Filters applied for movies.
     */
    private JsonNullable<String> filterMovies;

    /**
     * Filters applied for music.
     */
    private JsonNullable<String> filterMusic;

    /**
     * Filters applied for photos.
     */
    private JsonNullable<String> filterPhotos;

    /**
     * Filters applied for television.
     */
    private Optional<String> filterTelevision;

    private Optional<? extends Restricted> restricted;

    /**
     * List of servers owned by the user.
     */
    private List<GetUsersServer> server;

    @JsonCreator
    public User(
            long id,
            String title,
            String username,
            String email,
            JsonNullable<String> recommendationsPlaylistId,
            String thumb,
            Optional<? extends Protected> protected_,
            Optional<? extends Home> home,
            Optional<? extends AllowTuners> allowTuners,
            Optional<? extends AllowSync> allowSync,
            Optional<? extends AllowCameraUpload> allowCameraUpload,
            Optional<? extends AllowChannels> allowChannels,
            Optional<? extends AllowSubtitleAdmin> allowSubtitleAdmin,
            JsonNullable<String> filterAll,
            JsonNullable<String> filterMovies,
            JsonNullable<String> filterMusic,
            JsonNullable<String> filterPhotos,
            Optional<String> filterTelevision,
            Optional<? extends Restricted> restricted,
            List<GetUsersServer> server) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(title, "title");
        Utils.checkNotNull(username, "username");
        Utils.checkNotNull(email, "email");
        Utils.checkNotNull(recommendationsPlaylistId, "recommendationsPlaylistId");
        Utils.checkNotNull(thumb, "thumb");
        Utils.checkNotNull(protected_, "protected_");
        Utils.checkNotNull(home, "home");
        Utils.checkNotNull(allowTuners, "allowTuners");
        Utils.checkNotNull(allowSync, "allowSync");
        Utils.checkNotNull(allowCameraUpload, "allowCameraUpload");
        Utils.checkNotNull(allowChannels, "allowChannels");
        Utils.checkNotNull(allowSubtitleAdmin, "allowSubtitleAdmin");
        Utils.checkNotNull(filterAll, "filterAll");
        Utils.checkNotNull(filterMovies, "filterMovies");
        Utils.checkNotNull(filterMusic, "filterMusic");
        Utils.checkNotNull(filterPhotos, "filterPhotos");
        Utils.checkNotNull(filterTelevision, "filterTelevision");
        Utils.checkNotNull(restricted, "restricted");
        Utils.checkNotNull(server, "server");
        this.id = id;
        this.title = title;
        this.username = username;
        this.email = email;
        this.recommendationsPlaylistId = recommendationsPlaylistId;
        this.thumb = thumb;
        this.protected_ = protected_;
        this.home = home;
        this.allowTuners = allowTuners;
        this.allowSync = allowSync;
        this.allowCameraUpload = allowCameraUpload;
        this.allowChannels = allowChannels;
        this.allowSubtitleAdmin = allowSubtitleAdmin;
        this.filterAll = filterAll;
        this.filterMovies = filterMovies;
        this.filterMusic = filterMusic;
        this.filterPhotos = filterPhotos;
        this.filterTelevision = filterTelevision;
        this.restricted = restricted;
        this.server = server;
    }
    
    public User(
            long id,
            String title,
            String username,
            String email,
            String thumb,
            List<GetUsersServer> server) {
        this(id, title, username, email, JsonNullable.undefined(), thumb, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), JsonNullable.undefined(), Optional.empty(), Optional.empty(), server);
    }

    /**
     * User's unique ID.
     */
    @JsonIgnore
    public long id() {
        return id;
    }

    /**
     * User's display name.
     */
    @JsonIgnore
    public String title() {
        return title;
    }

    /**
     * User's username.
     */
    @JsonIgnore
    public String username() {
        return username;
    }

    /**
     * User's email address.
     */
    @JsonIgnore
    public String email() {
        return email;
    }

    /**
     * ID of the user's recommendation playlist.
     */
    @JsonIgnore
    public JsonNullable<String> recommendationsPlaylistId() {
        return recommendationsPlaylistId;
    }

    /**
     * URL to the user's avatar image.
     */
    @JsonIgnore
    public String thumb() {
        return thumb;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Protected> protected_() {
        return (Optional<Protected>) protected_;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Home> home() {
        return (Optional<Home>) home;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllowTuners> allowTuners() {
        return (Optional<AllowTuners>) allowTuners;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllowSync> allowSync() {
        return (Optional<AllowSync>) allowSync;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllowCameraUpload> allowCameraUpload() {
        return (Optional<AllowCameraUpload>) allowCameraUpload;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllowChannels> allowChannels() {
        return (Optional<AllowChannels>) allowChannels;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<AllowSubtitleAdmin> allowSubtitleAdmin() {
        return (Optional<AllowSubtitleAdmin>) allowSubtitleAdmin;
    }

    /**
     * Filters applied for all content.
     */
    @JsonIgnore
    public JsonNullable<String> filterAll() {
        return filterAll;
    }

    /**
     * Filters applied for movies.
     */
    @JsonIgnore
    public JsonNullable<String> filterMovies() {
        return filterMovies;
    }

    /**
     * Filters applied for music.
     */
    @JsonIgnore
    public JsonNullable<String> filterMusic() {
        return filterMusic;
    }

    /**
     * Filters applied for photos.
     */
    @JsonIgnore
    public JsonNullable<String> filterPhotos() {
        return filterPhotos;
    }

    /**
     * Filters applied for television.
     */
    @JsonIgnore
    public Optional<String> filterTelevision() {
        return filterTelevision;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Restricted> restricted() {
        return (Optional<Restricted>) restricted;
    }

    /**
     * List of servers owned by the user.
     */
    @JsonIgnore
    public List<GetUsersServer> server() {
        return server;
    }

    public final static Builder builder() {
        return new Builder();
    }    

    /**
     * User's unique ID.
     */
    public User withId(long id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    /**
     * User's display name.
     */
    public User withTitle(String title) {
        Utils.checkNotNull(title, "title");
        this.title = title;
        return this;
    }

    /**
     * User's username.
     */
    public User withUsername(String username) {
        Utils.checkNotNull(username, "username");
        this.username = username;
        return this;
    }

    /**
     * User's email address.
     */
    public User withEmail(String email) {
        Utils.checkNotNull(email, "email");
        this.email = email;
        return this;
    }

    /**
     * ID of the user's recommendation playlist.
     */
    public User withRecommendationsPlaylistId(String recommendationsPlaylistId) {
        Utils.checkNotNull(recommendationsPlaylistId, "recommendationsPlaylistId");
        this.recommendationsPlaylistId = JsonNullable.of(recommendationsPlaylistId);
        return this;
    }

    /**
     * ID of the user's recommendation playlist.
     */
    public User withRecommendationsPlaylistId(JsonNullable<String> recommendationsPlaylistId) {
        Utils.checkNotNull(recommendationsPlaylistId, "recommendationsPlaylistId");
        this.recommendationsPlaylistId = recommendationsPlaylistId;
        return this;
    }

    /**
     * URL to the user's avatar image.
     */
    public User withThumb(String thumb) {
        Utils.checkNotNull(thumb, "thumb");
        this.thumb = thumb;
        return this;
    }

    public User withProtected(Protected protected_) {
        Utils.checkNotNull(protected_, "protected_");
        this.protected_ = Optional.ofNullable(protected_);
        return this;
    }

    public User withProtected(Optional<? extends Protected> protected_) {
        Utils.checkNotNull(protected_, "protected_");
        this.protected_ = protected_;
        return this;
    }

    public User withHome(Home home) {
        Utils.checkNotNull(home, "home");
        this.home = Optional.ofNullable(home);
        return this;
    }

    public User withHome(Optional<? extends Home> home) {
        Utils.checkNotNull(home, "home");
        this.home = home;
        return this;
    }

    public User withAllowTuners(AllowTuners allowTuners) {
        Utils.checkNotNull(allowTuners, "allowTuners");
        this.allowTuners = Optional.ofNullable(allowTuners);
        return this;
    }

    public User withAllowTuners(Optional<? extends AllowTuners> allowTuners) {
        Utils.checkNotNull(allowTuners, "allowTuners");
        this.allowTuners = allowTuners;
        return this;
    }

    public User withAllowSync(AllowSync allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = Optional.ofNullable(allowSync);
        return this;
    }

    public User withAllowSync(Optional<? extends AllowSync> allowSync) {
        Utils.checkNotNull(allowSync, "allowSync");
        this.allowSync = allowSync;
        return this;
    }

    public User withAllowCameraUpload(AllowCameraUpload allowCameraUpload) {
        Utils.checkNotNull(allowCameraUpload, "allowCameraUpload");
        this.allowCameraUpload = Optional.ofNullable(allowCameraUpload);
        return this;
    }

    public User withAllowCameraUpload(Optional<? extends AllowCameraUpload> allowCameraUpload) {
        Utils.checkNotNull(allowCameraUpload, "allowCameraUpload");
        this.allowCameraUpload = allowCameraUpload;
        return this;
    }

    public User withAllowChannels(AllowChannels allowChannels) {
        Utils.checkNotNull(allowChannels, "allowChannels");
        this.allowChannels = Optional.ofNullable(allowChannels);
        return this;
    }

    public User withAllowChannels(Optional<? extends AllowChannels> allowChannels) {
        Utils.checkNotNull(allowChannels, "allowChannels");
        this.allowChannels = allowChannels;
        return this;
    }

    public User withAllowSubtitleAdmin(AllowSubtitleAdmin allowSubtitleAdmin) {
        Utils.checkNotNull(allowSubtitleAdmin, "allowSubtitleAdmin");
        this.allowSubtitleAdmin = Optional.ofNullable(allowSubtitleAdmin);
        return this;
    }

    public User withAllowSubtitleAdmin(Optional<? extends AllowSubtitleAdmin> allowSubtitleAdmin) {
        Utils.checkNotNull(allowSubtitleAdmin, "allowSubtitleAdmin");
        this.allowSubtitleAdmin = allowSubtitleAdmin;
        return this;
    }

    /**
     * Filters applied for all content.
     */
    public User withFilterAll(String filterAll) {
        Utils.checkNotNull(filterAll, "filterAll");
        this.filterAll = JsonNullable.of(filterAll);
        return this;
    }

    /**
     * Filters applied for all content.
     */
    public User withFilterAll(JsonNullable<String> filterAll) {
        Utils.checkNotNull(filterAll, "filterAll");
        this.filterAll = filterAll;
        return this;
    }

    /**
     * Filters applied for movies.
     */
    public User withFilterMovies(String filterMovies) {
        Utils.checkNotNull(filterMovies, "filterMovies");
        this.filterMovies = JsonNullable.of(filterMovies);
        return this;
    }

    /**
     * Filters applied for movies.
     */
    public User withFilterMovies(JsonNullable<String> filterMovies) {
        Utils.checkNotNull(filterMovies, "filterMovies");
        this.filterMovies = filterMovies;
        return this;
    }

    /**
     * Filters applied for music.
     */
    public User withFilterMusic(String filterMusic) {
        Utils.checkNotNull(filterMusic, "filterMusic");
        this.filterMusic = JsonNullable.of(filterMusic);
        return this;
    }

    /**
     * Filters applied for music.
     */
    public User withFilterMusic(JsonNullable<String> filterMusic) {
        Utils.checkNotNull(filterMusic, "filterMusic");
        this.filterMusic = filterMusic;
        return this;
    }

    /**
     * Filters applied for photos.
     */
    public User withFilterPhotos(String filterPhotos) {
        Utils.checkNotNull(filterPhotos, "filterPhotos");
        this.filterPhotos = JsonNullable.of(filterPhotos);
        return this;
    }

    /**
     * Filters applied for photos.
     */
    public User withFilterPhotos(JsonNullable<String> filterPhotos) {
        Utils.checkNotNull(filterPhotos, "filterPhotos");
        this.filterPhotos = filterPhotos;
        return this;
    }

    /**
     * Filters applied for television.
     */
    public User withFilterTelevision(String filterTelevision) {
        Utils.checkNotNull(filterTelevision, "filterTelevision");
        this.filterTelevision = Optional.ofNullable(filterTelevision);
        return this;
    }

    /**
     * Filters applied for television.
     */
    public User withFilterTelevision(Optional<String> filterTelevision) {
        Utils.checkNotNull(filterTelevision, "filterTelevision");
        this.filterTelevision = filterTelevision;
        return this;
    }

    public User withRestricted(Restricted restricted) {
        Utils.checkNotNull(restricted, "restricted");
        this.restricted = Optional.ofNullable(restricted);
        return this;
    }

    public User withRestricted(Optional<? extends Restricted> restricted) {
        Utils.checkNotNull(restricted, "restricted");
        this.restricted = restricted;
        return this;
    }

    /**
     * List of servers owned by the user.
     */
    public User withServer(List<GetUsersServer> server) {
        Utils.checkNotNull(server, "server");
        this.server = server;
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
        User other = (User) o;
        return 
            Objects.deepEquals(this.id, other.id) &&
            Objects.deepEquals(this.title, other.title) &&
            Objects.deepEquals(this.username, other.username) &&
            Objects.deepEquals(this.email, other.email) &&
            Objects.deepEquals(this.recommendationsPlaylistId, other.recommendationsPlaylistId) &&
            Objects.deepEquals(this.thumb, other.thumb) &&
            Objects.deepEquals(this.protected_, other.protected_) &&
            Objects.deepEquals(this.home, other.home) &&
            Objects.deepEquals(this.allowTuners, other.allowTuners) &&
            Objects.deepEquals(this.allowSync, other.allowSync) &&
            Objects.deepEquals(this.allowCameraUpload, other.allowCameraUpload) &&
            Objects.deepEquals(this.allowChannels, other.allowChannels) &&
            Objects.deepEquals(this.allowSubtitleAdmin, other.allowSubtitleAdmin) &&
            Objects.deepEquals(this.filterAll, other.filterAll) &&
            Objects.deepEquals(this.filterMovies, other.filterMovies) &&
            Objects.deepEquals(this.filterMusic, other.filterMusic) &&
            Objects.deepEquals(this.filterPhotos, other.filterPhotos) &&
            Objects.deepEquals(this.filterTelevision, other.filterTelevision) &&
            Objects.deepEquals(this.restricted, other.restricted) &&
            Objects.deepEquals(this.server, other.server);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            title,
            username,
            email,
            recommendationsPlaylistId,
            thumb,
            protected_,
            home,
            allowTuners,
            allowSync,
            allowCameraUpload,
            allowChannels,
            allowSubtitleAdmin,
            filterAll,
            filterMovies,
            filterMusic,
            filterPhotos,
            filterTelevision,
            restricted,
            server);
    }
    
    @Override
    public String toString() {
        return Utils.toString(User.class,
                "id", id,
                "title", title,
                "username", username,
                "email", email,
                "recommendationsPlaylistId", recommendationsPlaylistId,
                "thumb", thumb,
                "protected_", protected_,
                "home", home,
                "allowTuners", allowTuners,
                "allowSync", allowSync,
                "allowCameraUpload", allowCameraUpload,
                "allowChannels", allowChannels,
                "allowSubtitleAdmin", allowSubtitleAdmin,
                "filterAll", filterAll,
                "filterMovies", filterMovies,
                "filterMusic", filterMusic,
                "filterPhotos", filterPhotos,
                "filterTelevision", filterTelevision,
                "restricted", restricted,
                "server", server);
    }
    
    public final static class Builder {
 
        private Long id;
 
        private String title;
 
        private String username;
 
        private String email;
 
        private JsonNullable<String> recommendationsPlaylistId = JsonNullable.undefined();
 
        private String thumb;
 
        private Optional<? extends Protected> protected_;
 
        private Optional<? extends Home> home;
 
        private Optional<? extends AllowTuners> allowTuners;
 
        private Optional<? extends AllowSync> allowSync;
 
        private Optional<? extends AllowCameraUpload> allowCameraUpload;
 
        private Optional<? extends AllowChannels> allowChannels;
 
        private Optional<? extends AllowSubtitleAdmin> allowSubtitleAdmin;
 
        private JsonNullable<String> filterAll = JsonNullable.undefined();
 
        private JsonNullable<String> filterMovies = JsonNullable.undefined();
 
        private JsonNullable<String> filterMusic = JsonNullable.undefined();
 
        private JsonNullable<String> filterPhotos = JsonNullable.undefined();
 
        private Optional<String> filterTelevision = Optional.empty();
 
        private Optional<? extends Restricted> restricted;
 
        private List<GetUsersServer> server;
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * User's unique ID.
         */
        public Builder id(long id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        /**
         * User's display name.
         */
        public Builder title(String title) {
            Utils.checkNotNull(title, "title");
            this.title = title;
            return this;
        }

        /**
         * User's username.
         */
        public Builder username(String username) {
            Utils.checkNotNull(username, "username");
            this.username = username;
            return this;
        }

        /**
         * User's email address.
         */
        public Builder email(String email) {
            Utils.checkNotNull(email, "email");
            this.email = email;
            return this;
        }

        /**
         * ID of the user's recommendation playlist.
         */
        public Builder recommendationsPlaylistId(String recommendationsPlaylistId) {
            Utils.checkNotNull(recommendationsPlaylistId, "recommendationsPlaylistId");
            this.recommendationsPlaylistId = JsonNullable.of(recommendationsPlaylistId);
            return this;
        }

        /**
         * ID of the user's recommendation playlist.
         */
        public Builder recommendationsPlaylistId(JsonNullable<String> recommendationsPlaylistId) {
            Utils.checkNotNull(recommendationsPlaylistId, "recommendationsPlaylistId");
            this.recommendationsPlaylistId = recommendationsPlaylistId;
            return this;
        }

        /**
         * URL to the user's avatar image.
         */
        public Builder thumb(String thumb) {
            Utils.checkNotNull(thumb, "thumb");
            this.thumb = thumb;
            return this;
        }

        public Builder protected_(Protected protected_) {
            Utils.checkNotNull(protected_, "protected_");
            this.protected_ = Optional.ofNullable(protected_);
            return this;
        }

        public Builder protected_(Optional<? extends Protected> protected_) {
            Utils.checkNotNull(protected_, "protected_");
            this.protected_ = protected_;
            return this;
        }

        public Builder home(Home home) {
            Utils.checkNotNull(home, "home");
            this.home = Optional.ofNullable(home);
            return this;
        }

        public Builder home(Optional<? extends Home> home) {
            Utils.checkNotNull(home, "home");
            this.home = home;
            return this;
        }

        public Builder allowTuners(AllowTuners allowTuners) {
            Utils.checkNotNull(allowTuners, "allowTuners");
            this.allowTuners = Optional.ofNullable(allowTuners);
            return this;
        }

        public Builder allowTuners(Optional<? extends AllowTuners> allowTuners) {
            Utils.checkNotNull(allowTuners, "allowTuners");
            this.allowTuners = allowTuners;
            return this;
        }

        public Builder allowSync(AllowSync allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = Optional.ofNullable(allowSync);
            return this;
        }

        public Builder allowSync(Optional<? extends AllowSync> allowSync) {
            Utils.checkNotNull(allowSync, "allowSync");
            this.allowSync = allowSync;
            return this;
        }

        public Builder allowCameraUpload(AllowCameraUpload allowCameraUpload) {
            Utils.checkNotNull(allowCameraUpload, "allowCameraUpload");
            this.allowCameraUpload = Optional.ofNullable(allowCameraUpload);
            return this;
        }

        public Builder allowCameraUpload(Optional<? extends AllowCameraUpload> allowCameraUpload) {
            Utils.checkNotNull(allowCameraUpload, "allowCameraUpload");
            this.allowCameraUpload = allowCameraUpload;
            return this;
        }

        public Builder allowChannels(AllowChannels allowChannels) {
            Utils.checkNotNull(allowChannels, "allowChannels");
            this.allowChannels = Optional.ofNullable(allowChannels);
            return this;
        }

        public Builder allowChannels(Optional<? extends AllowChannels> allowChannels) {
            Utils.checkNotNull(allowChannels, "allowChannels");
            this.allowChannels = allowChannels;
            return this;
        }

        public Builder allowSubtitleAdmin(AllowSubtitleAdmin allowSubtitleAdmin) {
            Utils.checkNotNull(allowSubtitleAdmin, "allowSubtitleAdmin");
            this.allowSubtitleAdmin = Optional.ofNullable(allowSubtitleAdmin);
            return this;
        }

        public Builder allowSubtitleAdmin(Optional<? extends AllowSubtitleAdmin> allowSubtitleAdmin) {
            Utils.checkNotNull(allowSubtitleAdmin, "allowSubtitleAdmin");
            this.allowSubtitleAdmin = allowSubtitleAdmin;
            return this;
        }

        /**
         * Filters applied for all content.
         */
        public Builder filterAll(String filterAll) {
            Utils.checkNotNull(filterAll, "filterAll");
            this.filterAll = JsonNullable.of(filterAll);
            return this;
        }

        /**
         * Filters applied for all content.
         */
        public Builder filterAll(JsonNullable<String> filterAll) {
            Utils.checkNotNull(filterAll, "filterAll");
            this.filterAll = filterAll;
            return this;
        }

        /**
         * Filters applied for movies.
         */
        public Builder filterMovies(String filterMovies) {
            Utils.checkNotNull(filterMovies, "filterMovies");
            this.filterMovies = JsonNullable.of(filterMovies);
            return this;
        }

        /**
         * Filters applied for movies.
         */
        public Builder filterMovies(JsonNullable<String> filterMovies) {
            Utils.checkNotNull(filterMovies, "filterMovies");
            this.filterMovies = filterMovies;
            return this;
        }

        /**
         * Filters applied for music.
         */
        public Builder filterMusic(String filterMusic) {
            Utils.checkNotNull(filterMusic, "filterMusic");
            this.filterMusic = JsonNullable.of(filterMusic);
            return this;
        }

        /**
         * Filters applied for music.
         */
        public Builder filterMusic(JsonNullable<String> filterMusic) {
            Utils.checkNotNull(filterMusic, "filterMusic");
            this.filterMusic = filterMusic;
            return this;
        }

        /**
         * Filters applied for photos.
         */
        public Builder filterPhotos(String filterPhotos) {
            Utils.checkNotNull(filterPhotos, "filterPhotos");
            this.filterPhotos = JsonNullable.of(filterPhotos);
            return this;
        }

        /**
         * Filters applied for photos.
         */
        public Builder filterPhotos(JsonNullable<String> filterPhotos) {
            Utils.checkNotNull(filterPhotos, "filterPhotos");
            this.filterPhotos = filterPhotos;
            return this;
        }

        /**
         * Filters applied for television.
         */
        public Builder filterTelevision(String filterTelevision) {
            Utils.checkNotNull(filterTelevision, "filterTelevision");
            this.filterTelevision = Optional.ofNullable(filterTelevision);
            return this;
        }

        /**
         * Filters applied for television.
         */
        public Builder filterTelevision(Optional<String> filterTelevision) {
            Utils.checkNotNull(filterTelevision, "filterTelevision");
            this.filterTelevision = filterTelevision;
            return this;
        }

        public Builder restricted(Restricted restricted) {
            Utils.checkNotNull(restricted, "restricted");
            this.restricted = Optional.ofNullable(restricted);
            return this;
        }

        public Builder restricted(Optional<? extends Restricted> restricted) {
            Utils.checkNotNull(restricted, "restricted");
            this.restricted = restricted;
            return this;
        }

        /**
         * List of servers owned by the user.
         */
        public Builder server(List<GetUsersServer> server) {
            Utils.checkNotNull(server, "server");
            this.server = server;
            return this;
        }
        
        public User build() {
            if (protected_ == null) {
                protected_ = _SINGLETON_VALUE_Protected.value();
            }
            if (home == null) {
                home = _SINGLETON_VALUE_Home.value();
            }
            if (allowTuners == null) {
                allowTuners = _SINGLETON_VALUE_AllowTuners.value();
            }
            if (allowSync == null) {
                allowSync = _SINGLETON_VALUE_AllowSync.value();
            }
            if (allowCameraUpload == null) {
                allowCameraUpload = _SINGLETON_VALUE_AllowCameraUpload.value();
            }
            if (allowChannels == null) {
                allowChannels = _SINGLETON_VALUE_AllowChannels.value();
            }
            if (allowSubtitleAdmin == null) {
                allowSubtitleAdmin = _SINGLETON_VALUE_AllowSubtitleAdmin.value();
            }
            if (restricted == null) {
                restricted = _SINGLETON_VALUE_Restricted.value();
            }
            return new User(
                id,
                title,
                username,
                email,
                recommendationsPlaylistId,
                thumb,
                protected_,
                home,
                allowTuners,
                allowSync,
                allowCameraUpload,
                allowChannels,
                allowSubtitleAdmin,
                filterAll,
                filterMovies,
                filterMusic,
                filterPhotos,
                filterTelevision,
                restricted,
                server);
        }

        private static final LazySingletonValue<Optional<? extends Protected>> _SINGLETON_VALUE_Protected =
                new LazySingletonValue<>(
                        "protected",
                        "0",
                        new TypeReference<Optional<? extends Protected>>() {});

        private static final LazySingletonValue<Optional<? extends Home>> _SINGLETON_VALUE_Home =
                new LazySingletonValue<>(
                        "home",
                        "0",
                        new TypeReference<Optional<? extends Home>>() {});

        private static final LazySingletonValue<Optional<? extends AllowTuners>> _SINGLETON_VALUE_AllowTuners =
                new LazySingletonValue<>(
                        "allowTuners",
                        "0",
                        new TypeReference<Optional<? extends AllowTuners>>() {});

        private static final LazySingletonValue<Optional<? extends AllowSync>> _SINGLETON_VALUE_AllowSync =
                new LazySingletonValue<>(
                        "allowSync",
                        "0",
                        new TypeReference<Optional<? extends AllowSync>>() {});

        private static final LazySingletonValue<Optional<? extends AllowCameraUpload>> _SINGLETON_VALUE_AllowCameraUpload =
                new LazySingletonValue<>(
                        "allowCameraUpload",
                        "0",
                        new TypeReference<Optional<? extends AllowCameraUpload>>() {});

        private static final LazySingletonValue<Optional<? extends AllowChannels>> _SINGLETON_VALUE_AllowChannels =
                new LazySingletonValue<>(
                        "allowChannels",
                        "0",
                        new TypeReference<Optional<? extends AllowChannels>>() {});

        private static final LazySingletonValue<Optional<? extends AllowSubtitleAdmin>> _SINGLETON_VALUE_AllowSubtitleAdmin =
                new LazySingletonValue<>(
                        "allowSubtitleAdmin",
                        "0",
                        new TypeReference<Optional<? extends AllowSubtitleAdmin>>() {});

        private static final LazySingletonValue<Optional<? extends Restricted>> _SINGLETON_VALUE_Restricted =
                new LazySingletonValue<>(
                        "restricted",
                        "0",
                        new TypeReference<Optional<? extends Restricted>>() {});
    }
}
