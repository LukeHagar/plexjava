/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import dev.plexapi.sdk.utils.Utils;
import java.lang.Exception;

public class StartTaskRequestBuilder {

    private TaskName taskName;
    private final SDKMethodInterfaces.MethodCallStartTask sdk;

    public StartTaskRequestBuilder(SDKMethodInterfaces.MethodCallStartTask sdk) {
        this.sdk = sdk;
    }

    public StartTaskRequestBuilder taskName(TaskName taskName) {
        Utils.checkNotNull(taskName, "taskName");
        this.taskName = taskName;
        return this;
    }

    public StartTaskResponse call() throws Exception {

        return sdk.startTask(
            taskName);
    }
}
