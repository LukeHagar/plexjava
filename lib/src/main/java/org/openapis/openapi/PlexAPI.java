/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.annotation.JsonValue;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.SpeakeasyHTTPClient;

/**
 * Plex-API: A Plex Media Server API Map
 * An Open API Spec for interacting with Plex.tv and Plex Servers
 */
public class PlexAPI {
	/**
	 * SERVERS contains the list of server urls available to the SDK.
	 */
	public static final String[] SERVERS = {
        /**
         * The full address of your Plex Server
         */
        "http://10.10.10.47:32400",
        /**
         * The full address of your Plex Server
         */
        "{protocol}://{ip}:{port}",
	};
  	
    /**
     * Operations against the Plex Media Server System.
     * 
     */
    public Server server;
    /**
     * API Calls interacting with Plex Media Server Media
     * 
     */
    public Media media;
    /**
     * Activities are awesome. They provide a way to monitor and control asynchronous operations on the server. In order to receive real-time updates for activities, a client would normally subscribe via either EventSource or Websocket endpoints.
     * Activities are associated with HTTP replies via a special `X-Plex-Activity` header which contains the UUID of the activity.
     * Activities are optional cancellable. If cancellable, they may be cancelled via the `DELETE` endpoint. Other details:
     * - They can contain a `progress` (from 0 to 100) marking the percent completion of the activity.
     * - They must contain an `type` which is used by clients to distinguish the specific activity.
     * - They may contain a `Context` object with attributes which associate the activity with various specific entities (items, libraries, etc.)
     * - The may contain a `Response` object which attributes which represent the result of the asynchronous operation.
     * 
     */
    public Activities activities;
    /**
     * Butler is the task manager of the Plex Media Server Ecosystem.
     * 
     */
    public Butler butler;
    /**
     * Hubs are a structured two-dimensional container for media, generally represented by multiple horizontal rows.
     * 
     */
    public Hubs hubs;
    /**
     * API Calls that perform search operations with Plex Media Server
     * 
     */
    public Search search;
    /**
     * API Calls interacting with Plex Media Server Libraries
     * 
     */
    public Library library;
    /**
     * Submit logs to the Log Handler for Plex Media Server
     * 
     */
    public Log log;
    /**
     * Playlists are ordered collections of media. They can be dumb (just a list of media) or smart (based on a media query, such as "all albums from 2017"). 
     * They can be organized in (optionally nesting) folders.
     * Retrieving a playlist, or its items, will trigger a refresh of its metadata. 
     * This may cause the duration and number of items to change.
     * 
     */
    public Playlists playlists;
    /**
     * API Calls against Security for Plex Media Server
     * 
     */
    public Security security;
    /**
     * API Calls that perform search operations with Plex Media Server Sessions
     * 
     */
    public Sessions sessions;
    /**
     * This describes the API for searching and applying updates to the Plex Media Server.
     * Updates to the status can be observed via the Event API.
     * 
     */
    public Updater updater;
    /**
     * API Calls that perform operations with Plex Media Server Videos
     * 
     */
    public Video video;	

	private SDKConfiguration sdkConfiguration;

	/**
	 * The Builder class allows the configuration of a new instance of the SDK.
	 */
	public static class Builder {
		private SDKConfiguration sdkConfiguration = new SDKConfiguration();

		private Builder() {
		}

		/**
		 * Allows the default HTTP client to be overridden with a custom implementation.
		 * @param client The HTTP client to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setClient(HTTPClient client) {
			this.sdkConfiguration.defaultClient = client;
			return this;
		}
		
		/**
		 * Configures the SDK to use the provided security details.
		 * @param security The security details to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setSecurity(org.openapis.openapi.models.shared.Security security) {
			this.sdkConfiguration.security = security;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL.
		 * @param serverUrl The server URL to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl) {
			this.sdkConfiguration.serverUrl = serverUrl;
			return this;
		}
		
		/**
		 * Allows the overriding of the default server URL  with a templated URL populated with the provided parameters.
		 * @param serverUrl The server URL to use for all requests.
		 * @param params The parameters to use when templating the URL.
		 * @return The builder instance.
		 */
		public Builder setServerURL(String serverUrl, java.util.Map<String, String> params) {
			this.sdkConfiguration.serverUrl = org.openapis.openapi.utils.Utils.templateUrl(serverUrl, params);
			return this;
		}
		
		/**
		 * Allows the overriding of the default server by index
		 * @param serverIdx The server to use for all requests.
		 * @return The builder instance.
		 */
		public Builder setServerIndex(int serverIdx) {
			this.sdkConfiguration.serverIdx = serverIdx;
			this.sdkConfiguration.serverUrl = SERVERS[serverIdx];
			return this;
		}
		
        /**
         * ServerProtocol - The protocol to use when connecting to your plex server.
         */
        public enum ServerProtocol {
            HTTP("http"),
            HTTPS("https");

            @JsonValue
            public final String value;

            private ServerProtocol(String value) {
                this.value = value;
            }
        }

		/**
		 * Allows setting the $variable.Name variable for url substitution.
		 * @param protocol The value to set.
		 * @return The builder instance.
		 */
		public Builder setProtocol(ServerProtocol protocol) {
			for (java.util.Map<String, String> server : this.sdkConfiguration.serverDefaults) {
				if (!server.containsKey("protocol")) {
					continue;
				}
				server.put("protocol", protocol.toString());
			}

			return this;
		}
		
		/**
		 * Allows setting the $variable.Name variable for url substitution.
		 * @param ip The value to set.
		 * @return The builder instance.
		 */
		public Builder setIp(String ip) {
			for (java.util.Map<String, String> server : this.sdkConfiguration.serverDefaults) {
				if (!server.containsKey("ip")) {
					continue;
				}
				server.put("ip", ip.toString());
			}

			return this;
		}
		
		/**
		 * Allows setting the $variable.Name variable for url substitution.
		 * @param port The value to set.
		 * @return The builder instance.
		 */
		public Builder setPort(String port) {
			for (java.util.Map<String, String> server : this.sdkConfiguration.serverDefaults) {
				if (!server.containsKey("port")) {
					continue;
				}
				server.put("port", port.toString());
			}

			return this;
		}
		
		/**
		 * Builds a new instance of the SDK.
		 * @return The SDK instance.
		 * @throws Exception Thrown if the SDK could not be built.
		 */
		public PlexAPI build() throws Exception {
			if (this.sdkConfiguration.defaultClient == null) {
				this.sdkConfiguration.defaultClient = new SpeakeasyHTTPClient();
			}
			
			if (this.sdkConfiguration.security != null) {
				this.sdkConfiguration.securityClient = org.openapis.openapi.utils.Utils.configureSecurityClient(this.sdkConfiguration.defaultClient, this.sdkConfiguration.security);
			}
			
			if (this.sdkConfiguration.securityClient == null) {
				this.sdkConfiguration.securityClient = this.sdkConfiguration.defaultClient;
			}
			
			if (this.sdkConfiguration.serverUrl == null || this.sdkConfiguration.serverUrl.isBlank()) {
				this.sdkConfiguration.serverUrl = SERVERS[0];
				this.sdkConfiguration.serverIdx = 0;
			}

			if (this.sdkConfiguration.serverUrl.endsWith("/")) {
				this.sdkConfiguration.serverUrl = this.sdkConfiguration.serverUrl.substring(0, this.sdkConfiguration.serverUrl.length() - 1);
			}
			
			return new PlexAPI(this.sdkConfiguration);
		}
	}

	/**
	 * Get a new instance of the SDK builder to configure a new instance of the SDK.
	 * @return The SDK builder instance.
	 */
	public static Builder builder() {
		return new Builder();
	}

	private PlexAPI(SDKConfiguration sdkConfiguration) throws Exception {
		this.sdkConfiguration = sdkConfiguration;
		
		this.server = new Server(this.sdkConfiguration);
		
		this.media = new Media(this.sdkConfiguration);
		
		this.activities = new Activities(this.sdkConfiguration);
		
		this.butler = new Butler(this.sdkConfiguration);
		
		this.hubs = new Hubs(this.sdkConfiguration);
		
		this.search = new Search(this.sdkConfiguration);
		
		this.library = new Library(this.sdkConfiguration);
		
		this.log = new Log(this.sdkConfiguration);
		
		this.playlists = new Playlists(this.sdkConfiguration);
		
		this.security = new Security(this.sdkConfiguration);
		
		this.sessions = new Sessions(this.sdkConfiguration);
		
		this.updater = new Updater(this.sdkConfiguration);
		
		this.video = new Video(this.sdkConfiguration);
	}
}