/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;

/**
 * GetPinResponseBody - The Pin
 */

public class GetPinResponseBody {

    /**
     * PinID for use with authentication
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    private Optional<? extends Double> id;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("product")
    private Optional<? extends String> product;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trusted")
    private Optional<? extends Boolean> trusted;

    /**
     * a link to a QR code hosted on plex.tv 
     * The QR code redirects to the relevant `plex.tv/link` authentication page
     * Which then prompts the user for the 4 Digit Link Pin
     * 
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("qr")
    private Optional<? extends String> qr;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("clientIdentifier")
    private Optional<? extends String> clientIdentifier;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("location")
    private Optional<? extends Location> location;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiresIn")
    private Optional<? extends Double> expiresIn;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("createdAt")
    private Optional<? extends OffsetDateTime> createdAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("expiresAt")
    private Optional<? extends OffsetDateTime> expiresAt;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("authToken")
    private Optional<? extends String> authToken;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("newRegistration")
    private Optional<? extends String> newRegistration;

    public GetPinResponseBody(
            @JsonProperty("id") Optional<? extends Double> id,
            @JsonProperty("code") Optional<? extends String> code,
            @JsonProperty("product") Optional<? extends String> product,
            @JsonProperty("trusted") Optional<? extends Boolean> trusted,
            @JsonProperty("qr") Optional<? extends String> qr,
            @JsonProperty("clientIdentifier") Optional<? extends String> clientIdentifier,
            @JsonProperty("location") Optional<? extends Location> location,
            @JsonProperty("expiresIn") Optional<? extends Double> expiresIn,
            @JsonProperty("createdAt") Optional<? extends OffsetDateTime> createdAt,
            @JsonProperty("expiresAt") Optional<? extends OffsetDateTime> expiresAt,
            @JsonProperty("authToken") Optional<? extends String> authToken,
            @JsonProperty("newRegistration") Optional<? extends String> newRegistration) {
        Utils.checkNotNull(id, "id");
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(product, "product");
        Utils.checkNotNull(trusted, "trusted");
        Utils.checkNotNull(qr, "qr");
        Utils.checkNotNull(clientIdentifier, "clientIdentifier");
        Utils.checkNotNull(location, "location");
        Utils.checkNotNull(expiresIn, "expiresIn");
        Utils.checkNotNull(createdAt, "createdAt");
        Utils.checkNotNull(expiresAt, "expiresAt");
        Utils.checkNotNull(authToken, "authToken");
        Utils.checkNotNull(newRegistration, "newRegistration");
        this.id = id;
        this.code = code;
        this.product = product;
        this.trusted = trusted;
        this.qr = qr;
        this.clientIdentifier = clientIdentifier;
        this.location = location;
        this.expiresIn = expiresIn;
        this.createdAt = createdAt;
        this.expiresAt = expiresAt;
        this.authToken = authToken;
        this.newRegistration = newRegistration;
    }

    /**
     * PinID for use with authentication
     */
    public Optional<? extends Double> id() {
        return id;
    }

    public Optional<? extends String> code() {
        return code;
    }

    public Optional<? extends String> product() {
        return product;
    }

    public Optional<? extends Boolean> trusted() {
        return trusted;
    }

    /**
     * a link to a QR code hosted on plex.tv 
     * The QR code redirects to the relevant `plex.tv/link` authentication page
     * Which then prompts the user for the 4 Digit Link Pin
     * 
     */
    public Optional<? extends String> qr() {
        return qr;
    }

    public Optional<? extends String> clientIdentifier() {
        return clientIdentifier;
    }

    public Optional<? extends Location> location() {
        return location;
    }

    public Optional<? extends Double> expiresIn() {
        return expiresIn;
    }

    public Optional<? extends OffsetDateTime> createdAt() {
        return createdAt;
    }

    public Optional<? extends OffsetDateTime> expiresAt() {
        return expiresAt;
    }

    public Optional<? extends String> authToken() {
        return authToken;
    }

    public Optional<? extends String> newRegistration() {
        return newRegistration;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * PinID for use with authentication
     */
    public GetPinResponseBody withId(double id) {
        Utils.checkNotNull(id, "id");
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * PinID for use with authentication
     */
    public GetPinResponseBody withId(Optional<? extends Double> id) {
        Utils.checkNotNull(id, "id");
        this.id = id;
        return this;
    }

    public GetPinResponseBody withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public GetPinResponseBody withCode(Optional<? extends String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public GetPinResponseBody withProduct(String product) {
        Utils.checkNotNull(product, "product");
        this.product = Optional.ofNullable(product);
        return this;
    }

    public GetPinResponseBody withProduct(Optional<? extends String> product) {
        Utils.checkNotNull(product, "product");
        this.product = product;
        return this;
    }

    public GetPinResponseBody withTrusted(boolean trusted) {
        Utils.checkNotNull(trusted, "trusted");
        this.trusted = Optional.ofNullable(trusted);
        return this;
    }

    public GetPinResponseBody withTrusted(Optional<? extends Boolean> trusted) {
        Utils.checkNotNull(trusted, "trusted");
        this.trusted = trusted;
        return this;
    }

    /**
     * a link to a QR code hosted on plex.tv 
     * The QR code redirects to the relevant `plex.tv/link` authentication page
     * Which then prompts the user for the 4 Digit Link Pin
     * 
     */
    public GetPinResponseBody withQr(String qr) {
        Utils.checkNotNull(qr, "qr");
        this.qr = Optional.ofNullable(qr);
        return this;
    }

    /**
     * a link to a QR code hosted on plex.tv 
     * The QR code redirects to the relevant `plex.tv/link` authentication page
     * Which then prompts the user for the 4 Digit Link Pin
     * 
     */
    public GetPinResponseBody withQr(Optional<? extends String> qr) {
        Utils.checkNotNull(qr, "qr");
        this.qr = qr;
        return this;
    }

    public GetPinResponseBody withClientIdentifier(String clientIdentifier) {
        Utils.checkNotNull(clientIdentifier, "clientIdentifier");
        this.clientIdentifier = Optional.ofNullable(clientIdentifier);
        return this;
    }

    public GetPinResponseBody withClientIdentifier(Optional<? extends String> clientIdentifier) {
        Utils.checkNotNull(clientIdentifier, "clientIdentifier");
        this.clientIdentifier = clientIdentifier;
        return this;
    }

    public GetPinResponseBody withLocation(Location location) {
        Utils.checkNotNull(location, "location");
        this.location = Optional.ofNullable(location);
        return this;
    }

    public GetPinResponseBody withLocation(Optional<? extends Location> location) {
        Utils.checkNotNull(location, "location");
        this.location = location;
        return this;
    }

    public GetPinResponseBody withExpiresIn(double expiresIn) {
        Utils.checkNotNull(expiresIn, "expiresIn");
        this.expiresIn = Optional.ofNullable(expiresIn);
        return this;
    }

    public GetPinResponseBody withExpiresIn(Optional<? extends Double> expiresIn) {
        Utils.checkNotNull(expiresIn, "expiresIn");
        this.expiresIn = expiresIn;
        return this;
    }

    public GetPinResponseBody withCreatedAt(OffsetDateTime createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    public GetPinResponseBody withCreatedAt(Optional<? extends OffsetDateTime> createdAt) {
        Utils.checkNotNull(createdAt, "createdAt");
        this.createdAt = createdAt;
        return this;
    }

    public GetPinResponseBody withExpiresAt(OffsetDateTime expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = Optional.ofNullable(expiresAt);
        return this;
    }

    public GetPinResponseBody withExpiresAt(Optional<? extends OffsetDateTime> expiresAt) {
        Utils.checkNotNull(expiresAt, "expiresAt");
        this.expiresAt = expiresAt;
        return this;
    }

    public GetPinResponseBody withAuthToken(String authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = Optional.ofNullable(authToken);
        return this;
    }

    public GetPinResponseBody withAuthToken(Optional<? extends String> authToken) {
        Utils.checkNotNull(authToken, "authToken");
        this.authToken = authToken;
        return this;
    }

    public GetPinResponseBody withNewRegistration(String newRegistration) {
        Utils.checkNotNull(newRegistration, "newRegistration");
        this.newRegistration = Optional.ofNullable(newRegistration);
        return this;
    }

    public GetPinResponseBody withNewRegistration(Optional<? extends String> newRegistration) {
        Utils.checkNotNull(newRegistration, "newRegistration");
        this.newRegistration = newRegistration;
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
        GetPinResponseBody other = (GetPinResponseBody) o;
        return 
            java.util.Objects.deepEquals(this.id, other.id) &&
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.product, other.product) &&
            java.util.Objects.deepEquals(this.trusted, other.trusted) &&
            java.util.Objects.deepEquals(this.qr, other.qr) &&
            java.util.Objects.deepEquals(this.clientIdentifier, other.clientIdentifier) &&
            java.util.Objects.deepEquals(this.location, other.location) &&
            java.util.Objects.deepEquals(this.expiresIn, other.expiresIn) &&
            java.util.Objects.deepEquals(this.createdAt, other.createdAt) &&
            java.util.Objects.deepEquals(this.expiresAt, other.expiresAt) &&
            java.util.Objects.deepEquals(this.authToken, other.authToken) &&
            java.util.Objects.deepEquals(this.newRegistration, other.newRegistration);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            id,
            code,
            product,
            trusted,
            qr,
            clientIdentifier,
            location,
            expiresIn,
            createdAt,
            expiresAt,
            authToken,
            newRegistration);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetPinResponseBody.class,
                "id", id,
                "code", code,
                "product", product,
                "trusted", trusted,
                "qr", qr,
                "clientIdentifier", clientIdentifier,
                "location", location,
                "expiresIn", expiresIn,
                "createdAt", createdAt,
                "expiresAt", expiresAt,
                "authToken", authToken,
                "newRegistration", newRegistration);
    }
    
    public final static class Builder {
 
        private Optional<? extends Double> id = Optional.empty();
 
        private Optional<? extends String> code = Optional.empty();
 
        private Optional<? extends String> product = Optional.empty();
 
        private Optional<? extends Boolean> trusted = Optional.empty();
 
        private Optional<? extends String> qr = Optional.empty();
 
        private Optional<? extends String> clientIdentifier = Optional.empty();
 
        private Optional<? extends Location> location = Optional.empty();
 
        private Optional<? extends Double> expiresIn = Optional.empty();
 
        private Optional<? extends OffsetDateTime> createdAt = Optional.empty();
 
        private Optional<? extends OffsetDateTime> expiresAt = Optional.empty();
 
        private Optional<? extends String> authToken = Optional.empty();
 
        private Optional<? extends String> newRegistration = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * PinID for use with authentication
         */
        public Builder id(double id) {
            Utils.checkNotNull(id, "id");
            this.id = Optional.ofNullable(id);
            return this;
        }

        /**
         * PinID for use with authentication
         */
        public Builder id(Optional<? extends Double> id) {
            Utils.checkNotNull(id, "id");
            this.id = id;
            return this;
        }

        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = Optional.ofNullable(code);
            return this;
        }

        public Builder code(Optional<? extends String> code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        public Builder product(String product) {
            Utils.checkNotNull(product, "product");
            this.product = Optional.ofNullable(product);
            return this;
        }

        public Builder product(Optional<? extends String> product) {
            Utils.checkNotNull(product, "product");
            this.product = product;
            return this;
        }

        public Builder trusted(boolean trusted) {
            Utils.checkNotNull(trusted, "trusted");
            this.trusted = Optional.ofNullable(trusted);
            return this;
        }

        public Builder trusted(Optional<? extends Boolean> trusted) {
            Utils.checkNotNull(trusted, "trusted");
            this.trusted = trusted;
            return this;
        }

        /**
         * a link to a QR code hosted on plex.tv 
         * The QR code redirects to the relevant `plex.tv/link` authentication page
         * Which then prompts the user for the 4 Digit Link Pin
         * 
         */
        public Builder qr(String qr) {
            Utils.checkNotNull(qr, "qr");
            this.qr = Optional.ofNullable(qr);
            return this;
        }

        /**
         * a link to a QR code hosted on plex.tv 
         * The QR code redirects to the relevant `plex.tv/link` authentication page
         * Which then prompts the user for the 4 Digit Link Pin
         * 
         */
        public Builder qr(Optional<? extends String> qr) {
            Utils.checkNotNull(qr, "qr");
            this.qr = qr;
            return this;
        }

        public Builder clientIdentifier(String clientIdentifier) {
            Utils.checkNotNull(clientIdentifier, "clientIdentifier");
            this.clientIdentifier = Optional.ofNullable(clientIdentifier);
            return this;
        }

        public Builder clientIdentifier(Optional<? extends String> clientIdentifier) {
            Utils.checkNotNull(clientIdentifier, "clientIdentifier");
            this.clientIdentifier = clientIdentifier;
            return this;
        }

        public Builder location(Location location) {
            Utils.checkNotNull(location, "location");
            this.location = Optional.ofNullable(location);
            return this;
        }

        public Builder location(Optional<? extends Location> location) {
            Utils.checkNotNull(location, "location");
            this.location = location;
            return this;
        }

        public Builder expiresIn(double expiresIn) {
            Utils.checkNotNull(expiresIn, "expiresIn");
            this.expiresIn = Optional.ofNullable(expiresIn);
            return this;
        }

        public Builder expiresIn(Optional<? extends Double> expiresIn) {
            Utils.checkNotNull(expiresIn, "expiresIn");
            this.expiresIn = expiresIn;
            return this;
        }

        public Builder createdAt(OffsetDateTime createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = Optional.ofNullable(createdAt);
            return this;
        }

        public Builder createdAt(Optional<? extends OffsetDateTime> createdAt) {
            Utils.checkNotNull(createdAt, "createdAt");
            this.createdAt = createdAt;
            return this;
        }

        public Builder expiresAt(OffsetDateTime expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = Optional.ofNullable(expiresAt);
            return this;
        }

        public Builder expiresAt(Optional<? extends OffsetDateTime> expiresAt) {
            Utils.checkNotNull(expiresAt, "expiresAt");
            this.expiresAt = expiresAt;
            return this;
        }

        public Builder authToken(String authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = Optional.ofNullable(authToken);
            return this;
        }

        public Builder authToken(Optional<? extends String> authToken) {
            Utils.checkNotNull(authToken, "authToken");
            this.authToken = authToken;
            return this;
        }

        public Builder newRegistration(String newRegistration) {
            Utils.checkNotNull(newRegistration, "newRegistration");
            this.newRegistration = Optional.ofNullable(newRegistration);
            return this;
        }

        public Builder newRegistration(Optional<? extends String> newRegistration) {
            Utils.checkNotNull(newRegistration, "newRegistration");
            this.newRegistration = newRegistration;
            return this;
        }
        
        public GetPinResponseBody build() {
            return new GetPinResponseBody(
                id,
                code,
                product,
                trusted,
                qr,
                clientIdentifier,
                location,
                expiresIn,
                createdAt,
                expiresAt,
                authToken,
                newRegistration);
        }
    }
}

