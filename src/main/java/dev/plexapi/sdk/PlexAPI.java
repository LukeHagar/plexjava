/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk;

import com.fasterxml.jackson.annotation.JsonValue;
import dev.plexapi.sdk.utils.HTTPClient;
import dev.plexapi.sdk.utils.RetryConfig;
import dev.plexapi.sdk.utils.SpeakeasyHTTPClient;
import dev.plexapi.sdk.utils.Utils;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Plex-API: An Open API Spec for interacting with Plex.tv and Plex Media Server
 * 
 * <p># Plex Media Server OpenAPI Specification
 * 
 * <p>An Open Source OpenAPI Specification for Plex Media Server
 * 
 * <p>Automation and SDKs provided by [Speakeasy](https://speakeasyapi.dev/)
 * 
 * <p>## Documentation
 * 
 * <p>[API Documentation](https://plexapi.dev)
 * 
 * <p>## SDKs
 * 
 * <p>The following SDKs are generated from the OpenAPI Specification. They are automatically generated and may not be fully tested. If you find any issues, please open an issue on the [main specification Repository](https://github.com/LukeHagar/plex-api-spec).
 * 
 * <p>| Language              | Repository                                        | Releases                                                                                         | Other                                                   |
 * | --------------------- | ------------------------------------------------- | ------------------------------------------------------------------------------------------------ | ------------------------------------------------------- |
 * | Python                | [GitHub](https://github.com/LukeHagar/plexpy)     | [PyPI](https://pypi.org/project/plex-api-client/)                                                | -                                                       |
 * | JavaScript/TypeScript | [GitHub](https://github.com/LukeHagar/plexjs)     | [NPM](https://www.npmjs.com/package/@lukehagar/plexjs) \ [JSR](https://jsr.io/@lukehagar/plexjs) | -                                                       |
 * | Go                    | [GitHub](https://github.com/LukeHagar/plexgo)     | [Releases](https://github.com/LukeHagar/plexgo/releases)                                         | [GoDoc](https://pkg.go.dev/github.com/LukeHagar/plexgo) |
 * | Ruby                  | [GitHub](https://github.com/LukeHagar/plexruby)   | [Releases](https://github.com/LukeHagar/plexruby/releases)                                       | -                                                       |
 * | Swift                 | [GitHub](https://github.com/LukeHagar/plexswift)  | [Releases](https://github.com/LukeHagar/plexswift/releases)                                      | -                                                       |
 * | PHP                   | [GitHub](https://github.com/LukeHagar/plexphp)    | [Releases](https://github.com/LukeHagar/plexphp/releases)                                        | -                                                       |
 * | Java                  | [GitHub](https://github.com/LukeHagar/plexjava)   | [Releases](https://github.com/LukeHagar/plexjava/releases)                                       | -                                                       |
 * | C#                    | [GitHub](https://github.com/LukeHagar/plexcsharp) | [Releases](https://github.com/LukeHagar/plexcsharp/releases)                                     | -
 */
public class PlexAPI {


    /**
     * SERVERS contains the list of server urls available to the SDK.
     */
    public static final String[] SERVERS = {
        /**
         * The full address of your Plex Server
         */
        "{protocol}://{ip}:{port}",
    };

    /**
     * Operations against the Plex Media Server System.
     */
    private final Server server;

    /**
     * API Calls interacting with Plex Media Server Media
     */
    private final Media media;

    /**
     * API Calls that perform operations with Plex Media Server Videos
     */
    private final Video video;

    /**
     * Activities are awesome. They provide a way to monitor and control asynchronous operations on the server. In order to receive real-time updates for activities, a client would normally subscribe via either EventSource or Websocket endpoints.
     * Activities are associated with HTTP replies via a special `X-Plex-Activity` header which contains the UUID of the activity.
     * Activities are optional cancellable. If cancellable, they may be cancelled via the `DELETE` endpoint. Other details:
     * - They can contain a `progress` (from 0 to 100) marking the percent completion of the activity.
     * - They must contain an `type` which is used by clients to distinguish the specific activity.
     * - They may contain a `Context` object with attributes which associate the activity with various specific entities (items, libraries, etc.)
     * - The may contain a `Response` object which attributes which represent the result of the asynchronous operation.
     */
    private final Activities activities;

    /**
     * Butler is the task manager of the Plex Media Server Ecosystem.
     */
    private final Butler butler;

    /**
     * API Calls that perform operations directly against https://Plex.tv
     */
    private final Plex plex;

    /**
     * Hubs are a structured two-dimensional container for media, generally represented by multiple horizontal rows.
     */
    private final Hubs hubs;

    /**
     * API Calls that perform search operations with Plex Media Server
     */
    private final Search search;

    /**
     * API Calls interacting with Plex Media Server Libraries
     */
    private final Library library;

    /**
     * API Calls that perform operations with Plex Media Server Watchlists
     */
    private final Watchlist watchlist;

    /**
     * Submit logs to the Log Handler for Plex Media Server
     */
    private final Log log;

    /**
     * Playlists are ordered collections of media. They can be dumb (just a list of media) or smart (based on a media query, such as "all albums from 2017"). 
     * They can be organized in (optionally nesting) folders.
     * Retrieving a playlist, or its items, will trigger a refresh of its metadata. 
     * This may cause the duration and number of items to change.
     */
    private final Playlists playlists;

    /**
     * API Calls regarding authentication for Plex Media Server
     */
    private final Authentication authentication;

    /**
     * API Calls that perform operations with Plex Media Server Statistics
     */
    private final Statistics statistics;

    /**
     * API Calls that perform search operations with Plex Media Server Sessions
     */
    private final Sessions sessions;

    /**
     * This describes the API for searching and applying updates to the Plex Media Server.
     * Updates to the status can be observed via the Event API.
     */
    private final Updater updater;

    private final Users users;

    /**
     * Operations against the Plex Media Server System.
     */
    public Server server() {
        return server;
    }

    /**
     * API Calls interacting with Plex Media Server Media
     */
    public Media media() {
        return media;
    }

    /**
     * API Calls that perform operations with Plex Media Server Videos
     */
    public Video video() {
        return video;
    }

    /**
     * Activities are awesome. They provide a way to monitor and control asynchronous operations on the server. In order to receive real-time updates for activities, a client would normally subscribe via either EventSource or Websocket endpoints.
     * Activities are associated with HTTP replies via a special `X-Plex-Activity` header which contains the UUID of the activity.
     * Activities are optional cancellable. If cancellable, they may be cancelled via the `DELETE` endpoint. Other details:
     * - They can contain a `progress` (from 0 to 100) marking the percent completion of the activity.
     * - They must contain an `type` which is used by clients to distinguish the specific activity.
     * - They may contain a `Context` object with attributes which associate the activity with various specific entities (items, libraries, etc.)
     * - The may contain a `Response` object which attributes which represent the result of the asynchronous operation.
     */
    public Activities activities() {
        return activities;
    }

    /**
     * Butler is the task manager of the Plex Media Server Ecosystem.
     */
    public Butler butler() {
        return butler;
    }

    /**
     * API Calls that perform operations directly against https://Plex.tv
     */
    public Plex plex() {
        return plex;
    }

    /**
     * Hubs are a structured two-dimensional container for media, generally represented by multiple horizontal rows.
     */
    public Hubs hubs() {
        return hubs;
    }

    /**
     * API Calls that perform search operations with Plex Media Server
     */
    public Search search() {
        return search;
    }

    /**
     * API Calls interacting with Plex Media Server Libraries
     */
    public Library library() {
        return library;
    }

    /**
     * API Calls that perform operations with Plex Media Server Watchlists
     */
    public Watchlist watchlist() {
        return watchlist;
    }

    /**
     * Submit logs to the Log Handler for Plex Media Server
     */
    public Log log() {
        return log;
    }

    /**
     * Playlists are ordered collections of media. They can be dumb (just a list of media) or smart (based on a media query, such as "all albums from 2017"). 
     * They can be organized in (optionally nesting) folders.
     * Retrieving a playlist, or its items, will trigger a refresh of its metadata. 
     * This may cause the duration and number of items to change.
     */
    public Playlists playlists() {
        return playlists;
    }

    /**
     * API Calls regarding authentication for Plex Media Server
     */
    public Authentication authentication() {
        return authentication;
    }

    /**
     * API Calls that perform operations with Plex Media Server Statistics
     */
    public Statistics statistics() {
        return statistics;
    }

    /**
     * API Calls that perform search operations with Plex Media Server Sessions
     */
    public Sessions sessions() {
        return sessions;
    }

    /**
     * This describes the API for searching and applying updates to the Plex Media Server.
     * Updates to the status can be observed via the Event API.
     */
    public Updater updater() {
        return updater;
    }

    public Users users() {
        return users;
    }

    private final SDKConfiguration sdkConfiguration;

    /**
     * The Builder class allows the configuration of a new instance of the SDK.
     */
    public static class Builder {

        private final SDKConfiguration sdkConfiguration = new SDKConfiguration();

        private Builder() {
        }

        /**
         * Allows the default HTTP client to be overridden with a custom implementation.
         *
         * @param client The HTTP client to use for all requests.
         * @return The builder instance.
         */
        public Builder client(HTTPClient client) {
            this.sdkConfiguration.defaultClient = client;
            return this;
        }
        /**
         * Configures the SDK security to use the provided secret.
         *
         * @param accessToken The secret to use for all requests.
         * @return The builder instance.
         */
        public Builder accessToken(String accessToken) {
            this.sdkConfiguration.securitySource = SecuritySource.of(dev.plexapi.sdk.models.shared.Security.builder()
              .accessToken(accessToken)
              .build());
            return this;
        }

        /**
         * Configures the SDK to use a custom security source.
         *
         * @param securitySource The security source to use for all requests.
         * @return The builder instance.
         */
        public Builder securitySource(SecuritySource securitySource) {
            this.sdkConfiguration.securitySource = securitySource;
            return this;
        }
        
        /**
         * Overrides the default server URL.
         *
         * @param serverUrl The server URL to use for all requests.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl) {
            this.sdkConfiguration.serverUrl = serverUrl;
            return this;
        }

        /**
         * Overrides the default server URL  with a templated URL populated with the provided parameters.
         *
         * @param serverUrl The server URL to use for all requests.
         * @param params The parameters to use when templating the URL.
         * @return The builder instance.
         */
        public Builder serverURL(String serverUrl, Map<String, String> params) {
            this.sdkConfiguration.serverUrl = Utils.templateUrl(serverUrl, params);
            return this;
        }
        
        /**
         * Overrides the default server by index.
         *
         * @param serverIdx The server to use for all requests.
         * @return The builder instance.
         */
        public Builder serverIndex(int serverIdx) {
            this.sdkConfiguration.serverIdx = serverIdx;
            this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
            return this;
        }
        
        /**
         * Overrides the default configuration for retries
         *
         * @param retryConfig The retry configuration to use for all requests.
         * @return The builder instance.
         */
        public Builder retryConfig(RetryConfig retryConfig) {
            this.sdkConfiguration.retryConfig = Optional.of(retryConfig);
            return this;
        }
        /**
         * ServerProtocol
         * 
         * <p>The protocol to use for the server connection
         */
        public enum ServerProtocol {
            HTTP("http"),
            HTTPS("https");

            @JsonValue    
            private final String value;

            private ServerProtocol(String value) {
                this.value = value;
            }

            public String value() {
                return value;
            }

            public static Optional<ServerProtocol> fromValue(String value) {
                for (ServerProtocol o: ServerProtocol.values()) {
                    if (Objects.deepEquals(o.value, value)) {
                        return Optional.of(o);
                    }
                }
                return Optional.empty();
            }
        }
        /**
         * Sets the protocol variable for url substitution.
         *
         * @param protocol The value to set.
         * @return The builder instance.
         */
        public Builder protocol(ServerProtocol protocol) {
            for (Map<String, String> server : this.sdkConfiguration.serverDefaults) {
                if (!server.containsKey("protocol")) {
                    continue;
                }
                server.put("protocol", protocol.toString());
            }

            return this;
        }
        
        /**
         * Sets the ip variable for url substitution.
         *
         * @param ip The value to set.
         * @return The builder instance.
         */
        public Builder ip(String ip) {
            for (Map<String, String> server : this.sdkConfiguration.serverDefaults) {
                if (!server.containsKey("ip")) {
                    continue;
                }
                server.put("ip", ip.toString());
            }

            return this;
        }
        
        /**
         * Sets the port variable for url substitution.
         *
         * @param port The value to set.
         * @return The builder instance.
         */
        public Builder port(String port) {
            for (Map<String, String> server : this.sdkConfiguration.serverDefaults) {
                if (!server.containsKey("port")) {
                    continue;
                }
                server.put("port", port.toString());
            }

            return this;
        }
        
        // Visible for testing, may be accessed via reflection in tests
        Builder _hooks(dev.plexapi.sdk.utils.Hooks hooks) {
            sdkConfiguration.setHooks(hooks);  
            return this;  
        }
        
        // Visible for testing, may be accessed via reflection in tests
        Builder _hooks(Consumer<? super dev.plexapi.sdk.utils.Hooks> consumer) {
            consumer.accept(sdkConfiguration.hooks());
            return this;    
        }
        
        /**
         * Builds a new instance of the SDK.
         *
         * @return The SDK instance.
         */
        public PlexAPI build() {
            if (sdkConfiguration.defaultClient == null) {
                sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
            }
	        if (sdkConfiguration.securitySource == null) {
	    	    sdkConfiguration.securitySource = SecuritySource.of(null);
	        }
            if (sdkConfiguration.serverUrl == null || sdkConfiguration.serverUrl.isBlank()) {
                sdkConfiguration.serverUrl = SERVERS[0];
                sdkConfiguration.serverIdx = 0;
            }
            if (sdkConfiguration.serverUrl.endsWith("/")) {
                sdkConfiguration.serverUrl = sdkConfiguration.serverUrl.substring(0, sdkConfiguration.serverUrl.length() - 1);
            }
            return new PlexAPI(sdkConfiguration);
        }
    }
    
    /**
     * Get a new instance of the SDK builder to configure a new instance of the SDK.
     *
     * @return The SDK builder instance.
     */
    public static Builder builder() {
        return new Builder();
    }

    private PlexAPI(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
        this.server = new Server(sdkConfiguration);
        this.media = new Media(sdkConfiguration);
        this.video = new Video(sdkConfiguration);
        this.activities = new Activities(sdkConfiguration);
        this.butler = new Butler(sdkConfiguration);
        this.plex = new Plex(sdkConfiguration);
        this.hubs = new Hubs(sdkConfiguration);
        this.search = new Search(sdkConfiguration);
        this.library = new Library(sdkConfiguration);
        this.watchlist = new Watchlist(sdkConfiguration);
        this.log = new Log(sdkConfiguration);
        this.playlists = new Playlists(sdkConfiguration);
        this.authentication = new Authentication(sdkConfiguration);
        this.statistics = new Statistics(sdkConfiguration);
        this.sessions = new Sessions(sdkConfiguration);
        this.updater = new Updater(sdkConfiguration);
        this.users = new Users(sdkConfiguration);
        this.sdkConfiguration.initialize();
    }}
