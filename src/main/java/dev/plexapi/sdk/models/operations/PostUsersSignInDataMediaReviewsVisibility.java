/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * PostUsersSignInDataMediaReviewsVisibility - Whether or not the account has media reviews visibility enabled
 */
public enum PostUsersSignInDataMediaReviewsVisibility {
    Disable(0),
    Enable(1);

    @JsonValue
    private final int value;

    private PostUsersSignInDataMediaReviewsVisibility(int value) {
        this.value = value;
    }
    
    public int value() {
        return value;
    }
}
