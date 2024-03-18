/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;


public class StopTaskRequest {

    /**
     * The name of the task to be started.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taskName")
    private PathParamTaskName taskName;

    public StopTaskRequest(
            PathParamTaskName taskName) {
        Utils.checkNotNull(taskName, "taskName");
        this.taskName = taskName;
    }

    /**
     * The name of the task to be started.
     */
    public PathParamTaskName taskName() {
        return taskName;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The name of the task to be started.
     */
    public StopTaskRequest withTaskName(PathParamTaskName taskName) {
        Utils.checkNotNull(taskName, "taskName");
        this.taskName = taskName;
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
        StopTaskRequest other = (StopTaskRequest) o;
        return 
            java.util.Objects.deepEquals(this.taskName, other.taskName);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            taskName);
    }
    
    @Override
    public String toString() {
        return Utils.toString(StopTaskRequest.class,
                "taskName", taskName);
    }
    
    public final static class Builder {
 
        private PathParamTaskName taskName;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The name of the task to be started.
         */
        public Builder taskName(PathParamTaskName taskName) {
            Utils.checkNotNull(taskName, "taskName");
            this.taskName = taskName;
            return this;
        }
        
        public StopTaskRequest build() {
            return new StopTaskRequest(
                taskName);
        }
    }
}

