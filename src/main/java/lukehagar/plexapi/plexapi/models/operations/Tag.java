/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import lukehagar.plexapi.plexapi.utils.Utils;

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
