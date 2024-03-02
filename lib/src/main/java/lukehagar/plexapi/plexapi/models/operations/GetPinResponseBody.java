/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import lukehagar.plexapi.plexapi.utils.DateTimeDeserializer;
import lukehagar.plexapi.plexapi.utils.DateTimeSerializer;

/**
 * GetPinResponseBody - The Pin
 */

public class GetPinResponseBody {
    /**
     * PinID for use with authentication
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public Double id;

    public GetPinResponseBody withId(Double id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public GetPinResponseBody withCode(String code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    public String product;

    public GetPinResponseBody withProduct(String product) {
        this.product = product;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trusted")
    public Boolean trusted;

    public GetPinResponseBody withTrusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
    
    /**
     * a link to a QR code hosted on plex.tv 
     * The QR code redirects to the relevant `plex.tv/link` authentication page
     * Which then prompts the user for the 4 Digit Link Pin
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("qr")
    public String qr;

    public GetPinResponseBody withQr(String qr) {
        this.qr = qr;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientIdentifier")
    public String clientIdentifier;

    public GetPinResponseBody withClientIdentifier(String clientIdentifier) {
        this.clientIdentifier = clientIdentifier;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    public Location location;

    public GetPinResponseBody withLocation(Location location) {
        this.location = location;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiresIn")
    public Double expiresIn;

    public GetPinResponseBody withExpiresIn(Double expiresIn) {
        this.expiresIn = expiresIn;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("createdAt")
    public OffsetDateTime createdAt;

    public GetPinResponseBody withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("expiresAt")
    public OffsetDateTime expiresAt;

    public GetPinResponseBody withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authToken")
    public String authToken;

    public GetPinResponseBody withAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("newRegistration")
    public String newRegistration;

    public GetPinResponseBody withNewRegistration(String newRegistration) {
        this.newRegistration = newRegistration;
        return this;
    }
    
    public GetPinResponseBody(){}
}