/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.Utils;

public class Location {

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    private Optional<? extends String> code;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("european_union_member")
    private Optional<? extends Boolean> europeanUnionMember;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("continent_code")
    private Optional<? extends String> continentCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    private Optional<? extends String> country;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    private Optional<? extends String> city;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_zone")
    private Optional<? extends String> timeZone;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    private Optional<? extends String> postalCode;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("in_privacy_restricted_country")
    private Optional<? extends Boolean> inPrivacyRestrictedCountry;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdivisions")
    private Optional<? extends String> subdivisions;

    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("coordinates")
    private Optional<? extends String> coordinates;

    @JsonCreator
    public Location(
            @JsonProperty("code") Optional<? extends String> code,
            @JsonProperty("european_union_member") Optional<? extends Boolean> europeanUnionMember,
            @JsonProperty("continent_code") Optional<? extends String> continentCode,
            @JsonProperty("country") Optional<? extends String> country,
            @JsonProperty("city") Optional<? extends String> city,
            @JsonProperty("time_zone") Optional<? extends String> timeZone,
            @JsonProperty("postal_code") Optional<? extends String> postalCode,
            @JsonProperty("in_privacy_restricted_country") Optional<? extends Boolean> inPrivacyRestrictedCountry,
            @JsonProperty("subdivisions") Optional<? extends String> subdivisions,
            @JsonProperty("coordinates") Optional<? extends String> coordinates) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
        Utils.checkNotNull(continentCode, "continentCode");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(timeZone, "timeZone");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
        Utils.checkNotNull(subdivisions, "subdivisions");
        Utils.checkNotNull(coordinates, "coordinates");
        this.code = code;
        this.europeanUnionMember = europeanUnionMember;
        this.continentCode = continentCode;
        this.country = country;
        this.city = city;
        this.timeZone = timeZone;
        this.postalCode = postalCode;
        this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
        this.subdivisions = subdivisions;
        this.coordinates = coordinates;
    }
    
    public Location() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> code() {
        return (Optional<String>) code;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> europeanUnionMember() {
        return (Optional<Boolean>) europeanUnionMember;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> continentCode() {
        return (Optional<String>) continentCode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> country() {
        return (Optional<String>) country;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> city() {
        return (Optional<String>) city;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> timeZone() {
        return (Optional<String>) timeZone;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> postalCode() {
        return (Optional<String>) postalCode;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Boolean> inPrivacyRestrictedCountry() {
        return (Optional<Boolean>) inPrivacyRestrictedCountry;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> subdivisions() {
        return (Optional<String>) subdivisions;
    }

    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> coordinates() {
        return (Optional<String>) coordinates;
    }

    public final static Builder builder() {
        return new Builder();
    }

    public Location withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = Optional.ofNullable(code);
        return this;
    }

    public Location withCode(Optional<? extends String> code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    public Location withEuropeanUnionMember(boolean europeanUnionMember) {
        Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
        this.europeanUnionMember = Optional.ofNullable(europeanUnionMember);
        return this;
    }

    public Location withEuropeanUnionMember(Optional<? extends Boolean> europeanUnionMember) {
        Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
        this.europeanUnionMember = europeanUnionMember;
        return this;
    }

    public Location withContinentCode(String continentCode) {
        Utils.checkNotNull(continentCode, "continentCode");
        this.continentCode = Optional.ofNullable(continentCode);
        return this;
    }

    public Location withContinentCode(Optional<? extends String> continentCode) {
        Utils.checkNotNull(continentCode, "continentCode");
        this.continentCode = continentCode;
        return this;
    }

    public Location withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = Optional.ofNullable(country);
        return this;
    }

    public Location withCountry(Optional<? extends String> country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    public Location withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = Optional.ofNullable(city);
        return this;
    }

    public Location withCity(Optional<? extends String> city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    public Location withTimeZone(String timeZone) {
        Utils.checkNotNull(timeZone, "timeZone");
        this.timeZone = Optional.ofNullable(timeZone);
        return this;
    }

    public Location withTimeZone(Optional<? extends String> timeZone) {
        Utils.checkNotNull(timeZone, "timeZone");
        this.timeZone = timeZone;
        return this;
    }

    public Location withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = Optional.ofNullable(postalCode);
        return this;
    }

    public Location withPostalCode(Optional<? extends String> postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    public Location withInPrivacyRestrictedCountry(boolean inPrivacyRestrictedCountry) {
        Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
        this.inPrivacyRestrictedCountry = Optional.ofNullable(inPrivacyRestrictedCountry);
        return this;
    }

    public Location withInPrivacyRestrictedCountry(Optional<? extends Boolean> inPrivacyRestrictedCountry) {
        Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
        this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
        return this;
    }

    public Location withSubdivisions(String subdivisions) {
        Utils.checkNotNull(subdivisions, "subdivisions");
        this.subdivisions = Optional.ofNullable(subdivisions);
        return this;
    }

    public Location withSubdivisions(Optional<? extends String> subdivisions) {
        Utils.checkNotNull(subdivisions, "subdivisions");
        this.subdivisions = subdivisions;
        return this;
    }

    public Location withCoordinates(String coordinates) {
        Utils.checkNotNull(coordinates, "coordinates");
        this.coordinates = Optional.ofNullable(coordinates);
        return this;
    }

    public Location withCoordinates(Optional<? extends String> coordinates) {
        Utils.checkNotNull(coordinates, "coordinates");
        this.coordinates = coordinates;
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
        Location other = (Location) o;
        return 
            java.util.Objects.deepEquals(this.code, other.code) &&
            java.util.Objects.deepEquals(this.europeanUnionMember, other.europeanUnionMember) &&
            java.util.Objects.deepEquals(this.continentCode, other.continentCode) &&
            java.util.Objects.deepEquals(this.country, other.country) &&
            java.util.Objects.deepEquals(this.city, other.city) &&
            java.util.Objects.deepEquals(this.timeZone, other.timeZone) &&
            java.util.Objects.deepEquals(this.postalCode, other.postalCode) &&
            java.util.Objects.deepEquals(this.inPrivacyRestrictedCountry, other.inPrivacyRestrictedCountry) &&
            java.util.Objects.deepEquals(this.subdivisions, other.subdivisions) &&
            java.util.Objects.deepEquals(this.coordinates, other.coordinates);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            code,
            europeanUnionMember,
            continentCode,
            country,
            city,
            timeZone,
            postalCode,
            inPrivacyRestrictedCountry,
            subdivisions,
            coordinates);
    }
    
    @Override
    public String toString() {
        return Utils.toString(Location.class,
                "code", code,
                "europeanUnionMember", europeanUnionMember,
                "continentCode", continentCode,
                "country", country,
                "city", city,
                "timeZone", timeZone,
                "postalCode", postalCode,
                "inPrivacyRestrictedCountry", inPrivacyRestrictedCountry,
                "subdivisions", subdivisions,
                "coordinates", coordinates);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> code = Optional.empty();
 
        private Optional<? extends Boolean> europeanUnionMember = Optional.empty();
 
        private Optional<? extends String> continentCode = Optional.empty();
 
        private Optional<? extends String> country = Optional.empty();
 
        private Optional<? extends String> city = Optional.empty();
 
        private Optional<? extends String> timeZone = Optional.empty();
 
        private Optional<? extends String> postalCode = Optional.empty();
 
        private Optional<? extends Boolean> inPrivacyRestrictedCountry = Optional.empty();
 
        private Optional<? extends String> subdivisions = Optional.empty();
 
        private Optional<? extends String> coordinates = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
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

        public Builder europeanUnionMember(boolean europeanUnionMember) {
            Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
            this.europeanUnionMember = Optional.ofNullable(europeanUnionMember);
            return this;
        }

        public Builder europeanUnionMember(Optional<? extends Boolean> europeanUnionMember) {
            Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
            this.europeanUnionMember = europeanUnionMember;
            return this;
        }

        public Builder continentCode(String continentCode) {
            Utils.checkNotNull(continentCode, "continentCode");
            this.continentCode = Optional.ofNullable(continentCode);
            return this;
        }

        public Builder continentCode(Optional<? extends String> continentCode) {
            Utils.checkNotNull(continentCode, "continentCode");
            this.continentCode = continentCode;
            return this;
        }

        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = Optional.ofNullable(country);
            return this;
        }

        public Builder country(Optional<? extends String> country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = Optional.ofNullable(city);
            return this;
        }

        public Builder city(Optional<? extends String> city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        public Builder timeZone(String timeZone) {
            Utils.checkNotNull(timeZone, "timeZone");
            this.timeZone = Optional.ofNullable(timeZone);
            return this;
        }

        public Builder timeZone(Optional<? extends String> timeZone) {
            Utils.checkNotNull(timeZone, "timeZone");
            this.timeZone = timeZone;
            return this;
        }

        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = Optional.ofNullable(postalCode);
            return this;
        }

        public Builder postalCode(Optional<? extends String> postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        public Builder inPrivacyRestrictedCountry(boolean inPrivacyRestrictedCountry) {
            Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
            this.inPrivacyRestrictedCountry = Optional.ofNullable(inPrivacyRestrictedCountry);
            return this;
        }

        public Builder inPrivacyRestrictedCountry(Optional<? extends Boolean> inPrivacyRestrictedCountry) {
            Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
            this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
            return this;
        }

        public Builder subdivisions(String subdivisions) {
            Utils.checkNotNull(subdivisions, "subdivisions");
            this.subdivisions = Optional.ofNullable(subdivisions);
            return this;
        }

        public Builder subdivisions(Optional<? extends String> subdivisions) {
            Utils.checkNotNull(subdivisions, "subdivisions");
            this.subdivisions = subdivisions;
            return this;
        }

        public Builder coordinates(String coordinates) {
            Utils.checkNotNull(coordinates, "coordinates");
            this.coordinates = Optional.ofNullable(coordinates);
            return this;
        }

        public Builder coordinates(Optional<? extends String> coordinates) {
            Utils.checkNotNull(coordinates, "coordinates");
            this.coordinates = coordinates;
            return this;
        }
        
        public Location build() {
            return new Location(
                code,
                europeanUnionMember,
                continentCode,
                country,
                city,
                timeZone,
                postalCode,
                inPrivacyRestrictedCountry,
                subdivisions,
                coordinates);
        }
    }
}

