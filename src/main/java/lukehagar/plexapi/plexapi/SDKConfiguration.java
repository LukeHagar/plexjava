/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi;

import lukehagar.plexapi.plexapi.utils.Hook.SdkInitData;
import lukehagar.plexapi.plexapi.utils.HTTPClient;
import lukehagar.plexapi.plexapi.utils.RetryConfig;
import lukehagar.plexapi.plexapi.models.shared.Security;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

class SDKConfiguration {
    public SecuritySource securitySource;
    
    public Optional<SecuritySource> securitySource() {
        return Optional.ofNullable(securitySource);
    }
    public HTTPClient defaultClient;
      public String serverUrl;
    public int serverIdx = 0;
    List<Map<String, String>> serverDefaults = new ArrayList<>(){{
        add(new HashMap<>(){{
            put("protocol", "http");
            put("ip", "10.10.10.47");
            put("port", "32400");
        }});
    }};
    public String language = "java";
    public String openapiDocVersion = "0.0.3";
    public String sdkVersion = "0.1.1";
    public String genVersion = "2.356.0";
    public String userAgent = "speakeasy-sdk/java 0.1.1 2.356.0 0.0.3 lukehagar.plexapi.plexapi";

    private lukehagar.plexapi.plexapi.utils.Hooks _hooks = createHooks();

    private static lukehagar.plexapi.plexapi.utils.Hooks createHooks() {
        lukehagar.plexapi.plexapi.utils.Hooks hooks = new lukehagar.plexapi.plexapi.utils.Hooks();
        return hooks;
    }
    
    public lukehagar.plexapi.plexapi.utils.Hooks hooks() {
        return _hooks;
    }

    public void setHooks(lukehagar.plexapi.plexapi.utils.Hooks hooks) {
        this._hooks = hooks;
    }

    /** 
     * Initializes state (for example hooks).
     **/
    public void initialize() {
        lukehagar.plexapi.plexapi.hooks.SDKHooks.initialize(_hooks);
        // apply the sdk init hook immediately
        SdkInitData data = _hooks.sdkInit(new SdkInitData(serverUrl, defaultClient));
        this.serverUrl = data.baseUrl();
        this.defaultClient = data.client();
    }

    public Map<String, Map<String, Map<String, java.lang.Object>>> globals = new HashMap<>(){{
        put("parameters", new HashMap<>());
    }};
    
    public Map<String, String> getServerVariableDefaults() {
        return serverDefaults.get(this.serverIdx);
    }
    public Optional<RetryConfig> retryConfig = Optional.empty();
}