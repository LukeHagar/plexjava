/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * QueryParamType - `delegation` - This is the only supported `type` parameter.
 */
public enum QueryParamType {
    DELEGATION("delegation");

    @JsonValue
    public final String value;

    private QueryParamType(String value) {
        this.value = value;
    }
}
