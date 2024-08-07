/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import lukehagar.plexapi.plexapi.models.errors.SDKError;
import lukehagar.plexapi.plexapi.models.operations.SDKMethodInterfaces.*;
import lukehagar.plexapi.plexapi.utils.HTTPClient;
import lukehagar.plexapi.plexapi.utils.HTTPRequest;
import lukehagar.plexapi.plexapi.utils.Hook.AfterErrorContextImpl;
import lukehagar.plexapi.plexapi.utils.Hook.AfterSuccessContextImpl;
import lukehagar.plexapi.plexapi.utils.Hook.BeforeRequestContextImpl;
import lukehagar.plexapi.plexapi.utils.JSON;
import lukehagar.plexapi.plexapi.utils.Retries.NonRetryableException;
import lukehagar.plexapi.plexapi.utils.Utils;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Butler is the task manager of the Plex Media Server Ecosystem.
 * 
 */
public class Butler implements
            MethodCallGetButlerTasks,
            MethodCallStartAllTasks,
            MethodCallStopAllTasks,
            MethodCallStartTask,
            MethodCallStopTask {

    private final SDKConfiguration sdkConfiguration;

    Butler(SDKConfiguration sdkConfiguration) {
        this.sdkConfiguration = sdkConfiguration;
    }


    /**
     * Get Butler tasks
     * Returns a list of butler tasks
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.GetButlerTasksRequestBuilder getButlerTasks() {
        return new lukehagar.plexapi.plexapi.models.operations.GetButlerTasksRequestBuilder(this);
    }

    /**
     * Get Butler tasks
     * Returns a list of butler tasks
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponse getButlerTasksDirect() throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/butler");
        
        HTTPRequest _req = new HTTPRequest(_url, "GET");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("getButlerTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("getButlerTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("getButlerTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("getButlerTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.operations.GetButlerTasksResponseBody>() {});
                _res.withObject(java.util.Optional.ofNullable(_out));
                return _res;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.GetButlerTasksResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.GetButlerTasksResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Start all Butler tasks
     * This endpoint will attempt to start all Butler tasks that are enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
     * 1. Any tasks not scheduled to run on the current day will be skipped.
     * 2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
     * 3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
     * 4. If we are outside the configured window, the task will start immediately.
     * 
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.StartAllTasksRequestBuilder startAllTasks() {
        return new lukehagar.plexapi.plexapi.models.operations.StartAllTasksRequestBuilder(this);
    }

    /**
     * Start all Butler tasks
     * This endpoint will attempt to start all Butler tasks that are enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
     * 1. Any tasks not scheduled to run on the current day will be skipped.
     * 2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
     * 3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
     * 4. If we are outside the configured window, the task will start immediately.
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.StartAllTasksResponse startAllTasksDirect() throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/butler");
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("startAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("startAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("startAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("startAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.StartAllTasksResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.StartAllTasksResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.StartAllTasksResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.StartAllTasksResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.StartAllTasksResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Stop all Butler tasks
     * This endpoint will stop all currently running tasks and remove any scheduled tasks from the queue.
     * 
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.StopAllTasksRequestBuilder stopAllTasks() {
        return new lukehagar.plexapi.plexapi.models.operations.StopAllTasksRequestBuilder(this);
    }

    /**
     * Stop all Butler tasks
     * This endpoint will stop all currently running tasks and remove any scheduled tasks from the queue.
     * 
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.StopAllTasksResponse stopAllTasksDirect() throws Exception {
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                _baseUrl,
                "/butler");
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("stopAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("stopAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("stopAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("stopAllTasks", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.StopAllTasksResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.StopAllTasksResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.StopAllTasksResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.StopAllTasksResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.StopAllTasksResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Start a single Butler task
     * This endpoint will attempt to start a single Butler task that is enabled in the settings. Butler tasks normally run automatically during a time window configured on the server's Settings page but can be manually started using this endpoint. Tasks will run with the following criteria:
     * 1. Any tasks not scheduled to run on the current day will be skipped.
     * 2. If a task is configured to run at a random time during the configured window and we are outside that window, the task will start immediately.
     * 3. If a task is configured to run at a random time during the configured window and we are within that window, the task will be scheduled at a random time within the window.
     * 4. If we are outside the configured window, the task will start immediately.
     * 
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.StartTaskRequestBuilder startTask() {
        return new lukehagar.plexapi.plexapi.models.operations.StartTaskRequestBuilder(this);
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
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.StartTaskResponse startTask(
            lukehagar.plexapi.plexapi.models.operations.TaskName taskName) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.StartTaskRequest request =
            lukehagar.plexapi.plexapi.models.operations.StartTaskRequest
                .builder()
                .taskName(taskName)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                lukehagar.plexapi.plexapi.models.operations.StartTaskRequest.class,
                _baseUrl,
                "/butler/{taskName}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "POST");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("startTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("startTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("startTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("startTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.StartTaskResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.StartTaskResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.StartTaskResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200", "202")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.StartTaskResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.StartTaskResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }



    /**
     * Stop a single Butler task
     * This endpoint will stop a currently running task by name, or remove it from the list of scheduled tasks if it exists. See the section above for a list of task names for this endpoint.
     * 
     * @return The call builder
     */
    public lukehagar.plexapi.plexapi.models.operations.StopTaskRequestBuilder stopTask() {
        return new lukehagar.plexapi.plexapi.models.operations.StopTaskRequestBuilder(this);
    }

    /**
     * Stop a single Butler task
     * This endpoint will stop a currently running task by name, or remove it from the list of scheduled tasks if it exists. See the section above for a list of task names for this endpoint.
     * 
     * @param taskName The name of the task to be started.
     * @return The response from the API call
     * @throws Exception if the API call fails
     */
    public lukehagar.plexapi.plexapi.models.operations.StopTaskResponse stopTask(
            lukehagar.plexapi.plexapi.models.operations.PathParamTaskName taskName) throws Exception {
        lukehagar.plexapi.plexapi.models.operations.StopTaskRequest request =
            lukehagar.plexapi.plexapi.models.operations.StopTaskRequest
                .builder()
                .taskName(taskName)
                .build();
        
        String _baseUrl = Utils.templateUrl(
                this.sdkConfiguration.serverUrl, this.sdkConfiguration.getServerVariableDefaults());
        String _url = Utils.generateURL(
                lukehagar.plexapi.plexapi.models.operations.StopTaskRequest.class,
                _baseUrl,
                "/butler/{taskName}",
                request, this.sdkConfiguration.globals);
        
        HTTPRequest _req = new HTTPRequest(_url, "DELETE");
        _req.addHeader("Accept", "application/json")
            .addHeader("user-agent", 
                this.sdkConfiguration.userAgent);

        Utils.configureSecurity(_req,  
                this.sdkConfiguration.securitySource.getSecurity());

        HTTPClient _client = this.sdkConfiguration.defaultClient;
        HttpRequest _r = 
            sdkConfiguration.hooks()
               .beforeRequest(
                  new BeforeRequestContextImpl("stopTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                  _req.build());
        HttpResponse<InputStream> _httpRes;
        try {
            _httpRes = _client.send(_r);
            if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "401", "404", "4XX", "5XX")) {
                _httpRes = sdkConfiguration.hooks()
                    .afterError(
                        new AfterErrorContextImpl("stopTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                        Optional.of(_httpRes),
                        Optional.empty());
            } else {
                _httpRes = sdkConfiguration.hooks()
                    .afterSuccess(
                        new AfterSuccessContextImpl("stopTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()),
                         _httpRes);
            }
        } catch (Exception _e) {
            _httpRes = sdkConfiguration.hooks()
                    .afterError(new AfterErrorContextImpl("stopTask", Optional.of(java.util.List.of()), sdkConfiguration.securitySource()), 
                        Optional.empty(),
                        Optional.of(_e));
        }
        String _contentType = _httpRes
            .headers()
            .firstValue("Content-Type")
            .orElse("application/octet-stream");
        lukehagar.plexapi.plexapi.models.operations.StopTaskResponse.Builder _resBuilder = 
            lukehagar.plexapi.plexapi.models.operations.StopTaskResponse
                .builder()
                .contentType(_contentType)
                .statusCode(_httpRes.statusCode())
                .rawResponse(_httpRes);

        lukehagar.plexapi.plexapi.models.operations.StopTaskResponse _res = _resBuilder.build();
        
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "200")) {
            // no content 
            return _res;
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "400", "404", "4XX", "5XX")) {
            // no content 
            throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "API error occurred", 
                    Utils.toByteArrayAndClose(_httpRes.body()));
        }
        if (Utils.statusCodeMatches(_httpRes.statusCode(), "401")) {
            if (Utils.contentTypeMatches(_contentType, "application/json")) {
                lukehagar.plexapi.plexapi.models.errors.StopTaskResponseBody _out = Utils.mapper().readValue(
                    Utils.toUtf8AndClose(_httpRes.body()),
                    new TypeReference<lukehagar.plexapi.plexapi.models.errors.StopTaskResponseBody>() {});
                    _out.withRawResponse(java.util.Optional.ofNullable(_httpRes));
                
                throw _out;
            } else {
                throw new SDKError(
                    _httpRes, 
                    _httpRes.statusCode(), 
                    "Unexpected content-type received: " + _contentType, 
                    Utils.toByteArrayAndClose(_httpRes.body()));
            }
        }
        throw new SDKError(
            _httpRes, 
            _httpRes.statusCode(), 
            "Unexpected status code received: " + _httpRes.statusCode(), 
            Utils.toByteArrayAndClose(_httpRes.body()));
    }

}
