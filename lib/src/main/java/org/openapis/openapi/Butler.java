/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import org.openapis.openapi.utils.HTTPClient;
import org.openapis.openapi.utils.HTTPRequest;
import org.openapis.openapi.utils.JSON;

/**
 * Butler is the task manager of the Plex Media Server Ecosystem.
 * 
 */
public class Butler {
	
	private SDKConfiguration sdkConfiguration;

	public Butler(SDKConfiguration sdkConfiguration) {
		this.sdkConfiguration = sdkConfiguration;
	}

    /**
     * Get Butler tasks
     * Returns a list of butler tasks
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.GetButlerTasksResponse getButlerTasks() throws Exception {
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/butler");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.GetButlerTasksResponse res = new org.openapis.openapi.models.operations.GetButlerTasksResponse(contentType, httpRes.statusCode(), httpRes) {{
            twoHundredApplicationJsonObject = null;
            fourHundredAndOneApplicationJsonObject = null;
        }};
        
        if (httpRes.statusCode() == 200) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetButlerTasksResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetButlerTasksResponseBody.class);
                res.twoHundredApplicationJsonObject = out;
            }
        }
        else if (httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.GetButlerTasksButlerResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.GetButlerTasksButlerResponseBody.class);
                res.fourHundredAndOneApplicationJsonObject = out;
            }
        }

        return res;
    }

    /**
     * Start all Butler tasks
     * This endpoint will attempt to start all Butler tasks that are enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
     * 1. Any tasks not scheduled to run on the current day will be skipped.
     * 2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
     * 3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
     * 4. If we are outside the configured window, the task will start immediately.
     * 
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.StartAllTasksResponse startAllTasks() throws Exception {
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/butler");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.StartAllTasksResponse res = new org.openapis.openapi.models.operations.StartAllTasksResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.StartAllTasksResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.StartAllTasksResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Stop all Butler tasks
     * This endpoint will stop all currently running tasks and remove any scheduled tasks from the queue.
     * 
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.StopAllTasksResponse stopAllTasks() throws Exception {
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(baseUrl, "/butler");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.StopAllTasksResponse res = new org.openapis.openapi.models.operations.StopAllTasksResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.StopAllTasksResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.StopAllTasksResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Start a single Butler task
     * This endpoint will attempt to start a single Butler task that is enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
     * 1. Any tasks not scheduled to run on the current day will be skipped.
     * 2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
     * 3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
     * 4. If we are outside the configured window, the task will start immediately.
     * 
     * @param taskName the name of the task to be started.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.StartTaskResponse startTask(org.openapis.openapi.models.operations.TaskName taskName) throws Exception {
        org.openapis.openapi.models.operations.StartTaskRequest request = new org.openapis.openapi.models.operations.StartTaskRequest(taskName);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.StartTaskRequest.class, baseUrl, "/butler/{taskName}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.StartTaskResponse res = new org.openapis.openapi.models.operations.StartTaskResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 202 || httpRes.statusCode() == 400) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.StartTaskResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.StartTaskResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }

    /**
     * Stop a single Butler task
     * This endpoint will stop a currently running task by name, or remove it from the list of scheduled tasks if it exists. See the section above for a list of task names for this endpoint.
     * 
     * @param taskName The name of the task to be started.
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public org.openapis.openapi.models.operations.StopTaskResponse stopTask(org.openapis.openapi.models.operations.PathParamTaskName taskName) throws Exception {
        org.openapis.openapi.models.operations.StopTaskRequest request = new org.openapis.openapi.models.operations.StopTaskRequest(taskName);
        
        String baseUrl = org.openapis.openapi.utils.Utils.templateUrl(this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String url = org.openapis.openapi.utils.Utils.generateURL(org.openapis.openapi.models.operations.StopTaskRequest.class, baseUrl, "/butler/{taskName}", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("DELETE");
        req.setURL(url);

        req.addHeader("Accept", "application/json");
        req.addHeader("user-agent", this.sdkConfiguration.userAgent);
        
        HTTPClient client = this.sdkConfiguration.securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");
        
        org.openapis.openapi.models.operations.StopTaskResponse res = new org.openapis.openapi.models.operations.StopTaskResponse(contentType, httpRes.statusCode(), httpRes) {{
            object = null;
        }};
        
        if (httpRes.statusCode() == 200 || httpRes.statusCode() == 400 || httpRes.statusCode() == 404) {
        }
        else if (httpRes.statusCode() == 401) {
            if (org.openapis.openapi.utils.Utils.matchContentType(contentType, "application/json")) {
                ObjectMapper mapper = JSON.getMapper();
                org.openapis.openapi.models.operations.StopTaskResponseBody out = mapper.readValue(new String(httpRes.body(), StandardCharsets.UTF_8), org.openapis.openapi.models.operations.StopTaskResponseBody.class);
                res.object = out;
            }
        }

        return res;
    }
}