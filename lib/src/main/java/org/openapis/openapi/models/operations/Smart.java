/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Smart - whether the playlist is smart or not
 */
public enum Smart {
    ZERO(0L),
    ONE(1L);

    @JsonValue
    public final Long value;

    private Smart(Long value) {
        this.value = value;
    }
}
