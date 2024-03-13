/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi;

import lukehagar.plexapi.plexapi.utils.HTTPClient;
import lukehagar.plexapi.plexapi.models.shared.Security;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class SDKConfiguration {
	public HTTPClient defaultClient;
	public HTTPClient securityClient;
	public Security security;
	public String serverUrl;
	public int serverIdx = 0;
	List<Map<String, String>> serverDefaults = new ArrayList<Map<String, String>>(){{
		add(new HashMap<String, String>(){{
			put("protocol", "http");
			put("ip", "10.10.10.47");
			put("port", "32400");
		}});
	}};
	public String language = "java";
	public String openapiDocVersion = "0.0.3";
	public String sdkVersion = "0.0.1";
	public String genVersion = "2.280.6";
	public String userAgent = "speakeasy-sdk/java 0.0.1 2.280.6 0.0.3 lukehagar.plexapi.plexapi";
	
	
	public Map<String, String> getServerVariableDefaults() {
		return serverDefaults.get(this.serverIdx);
	}
}