/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;

/**
 * Tag - A key representing a specific tag within the section.
 */
public enum Tag {
    ALL("all"),
    UNWATCHED("unwatched"),
    NEWEST("newest"),
    RECENTLY_ADDED("recentlyAdded"),
    RECENTLY_VIEWED("recentlyViewed"),
    ON_DECK("onDeck"),
    COLLECTION("collection"),
    EDITION("edition"),
    GENRE("genre"),
    YEAR("year"),
    DECADE("decade"),
    DIRECTOR("director"),
    ACTOR("actor"),
    COUNTRY("country"),
    CONTENT_RATING("contentRating"),
    RATING("rating"),
    RESOLUTION("resolution"),
    FIRST_CHARACTER("firstCharacter"),
    FOLDER("folder");

    @JsonValue
    private final String value;

    private Tag(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
}