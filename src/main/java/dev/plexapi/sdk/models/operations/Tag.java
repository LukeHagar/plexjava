/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */
package dev.plexapi.sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonValue;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;

/**
 * Tag
 * 
 * <p>A key representing a specific tag within the section.
 */
public enum Tag {
    UNWATCHED("unwatched"),
    NEWEST("newest"),
    RECENTLY_ADDED("recentlyAdded"),
    RECENTLY_VIEWED("recentlyViewed"),
    ON_DECK("onDeck"),
    COLLECTION("collection"),
    EDITION("edition"),
    YEAR("year"),
    DECADE("decade"),
    DIRECTOR("director"),
    CONTENT_RATING("contentRating"),
    RATING("rating"),
    RESOLUTION("resolution"),
    FIRST_CHARACTER("firstCharacter"),
    FOLDER("folder"),
    ALBUMS("albums");

    @JsonValue
    private final String value;

    private Tag(String value) {
        this.value = value;
    }
    
    public String value() {
        return value;
    }
    
    public static Optional<Tag> fromValue(String value) {
        for (Tag o: Tag.values()) {
            if (Objects.deepEquals(o.value, value)) {
                return Optional.of(o);
            }
        }
        return Optional.empty();
    }
}

