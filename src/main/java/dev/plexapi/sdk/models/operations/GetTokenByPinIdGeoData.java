/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */


package dev.plexapi.sdk.models.operations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.type.TypeReference;
import dev.plexapi.sdk.utils.LazySingletonValue;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
/**
 * GetTokenByPinIdGeoData - Geo location data
 */

public class GetTokenByPinIdGeoData {

    /**
     * The ISO 3166-1 alpha-2 code of the country.
     */
    @JsonProperty("code")
    private String code;

    /**
     * The continent code where the country is located.
     */
    @JsonProperty("continent_code")
    private String continentCode;

    /**
     * The official name of the country.
     */
    @JsonProperty("country")
    private String country;

    /**
     * The name of the city.
     */
    @JsonProperty("city")
    private String city;

    /**
     * Indicates if the country is a member of the European Union.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("european_union_member")
    private Optional<Boolean> europeanUnionMember;

    /**
     * The time zone of the country.
     */
    @JsonProperty("time_zone")
    private String timeZone;

    /**
     * The postal code of the location.
     */
    @JsonProperty("postal_code")
    private String postalCode;

    /**
     * Indicates if the country has privacy restrictions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("in_privacy_restricted_country")
    private Optional<Boolean> inPrivacyRestrictedCountry;

    /**
     * Indicates if the region has privacy restrictions.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("in_privacy_restricted_region")
    private Optional<Boolean> inPrivacyRestrictedRegion;

    /**
     * The name of the primary administrative subdivision.
     */
    @JsonProperty("subdivisions")
    private String subdivisions;

    /**
     * The geographical coordinates (latitude, longitude) of the location.
     */
    @JsonProperty("coordinates")
    private String coordinates;

    @JsonCreator
    public GetTokenByPinIdGeoData(
            @JsonProperty("code") String code,
            @JsonProperty("continent_code") String continentCode,
            @JsonProperty("country") String country,
            @JsonProperty("city") String city,
            @JsonProperty("european_union_member") Optional<Boolean> europeanUnionMember,
            @JsonProperty("time_zone") String timeZone,
            @JsonProperty("postal_code") String postalCode,
            @JsonProperty("in_privacy_restricted_country") Optional<Boolean> inPrivacyRestrictedCountry,
            @JsonProperty("in_privacy_restricted_region") Optional<Boolean> inPrivacyRestrictedRegion,
            @JsonProperty("subdivisions") String subdivisions,
            @JsonProperty("coordinates") String coordinates) {
        Utils.checkNotNull(code, "code");
        Utils.checkNotNull(continentCode, "continentCode");
        Utils.checkNotNull(country, "country");
        Utils.checkNotNull(city, "city");
        Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
        Utils.checkNotNull(timeZone, "timeZone");
        Utils.checkNotNull(postalCode, "postalCode");
        Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
        Utils.checkNotNull(inPrivacyRestrictedRegion, "inPrivacyRestrictedRegion");
        Utils.checkNotNull(subdivisions, "subdivisions");
        Utils.checkNotNull(coordinates, "coordinates");
        this.code = code;
        this.continentCode = continentCode;
        this.country = country;
        this.city = city;
        this.europeanUnionMember = europeanUnionMember;
        this.timeZone = timeZone;
        this.postalCode = postalCode;
        this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
        this.inPrivacyRestrictedRegion = inPrivacyRestrictedRegion;
        this.subdivisions = subdivisions;
        this.coordinates = coordinates;
    }
    
    public GetTokenByPinIdGeoData(
            String code,
            String continentCode,
            String country,
            String city,
            String timeZone,
            String postalCode,
            String subdivisions,
            String coordinates) {
        this(code, continentCode, country, city, Optional.empty(), timeZone, postalCode, Optional.empty(), Optional.empty(), subdivisions, coordinates);
    }

    /**
     * The ISO 3166-1 alpha-2 code of the country.
     */
    @JsonIgnore
    public String code() {
        return code;
    }

    /**
     * The continent code where the country is located.
     */
    @JsonIgnore
    public String continentCode() {
        return continentCode;
    }

    /**
     * The official name of the country.
     */
    @JsonIgnore
    public String country() {
        return country;
    }

    /**
     * The name of the city.
     */
    @JsonIgnore
    public String city() {
        return city;
    }

    /**
     * Indicates if the country is a member of the European Union.
     */
    @JsonIgnore
    public Optional<Boolean> europeanUnionMember() {
        return europeanUnionMember;
    }

    /**
     * The time zone of the country.
     */
    @JsonIgnore
    public String timeZone() {
        return timeZone;
    }

    /**
     * The postal code of the location.
     */
    @JsonIgnore
    public String postalCode() {
        return postalCode;
    }

    /**
     * Indicates if the country has privacy restrictions.
     */
    @JsonIgnore
    public Optional<Boolean> inPrivacyRestrictedCountry() {
        return inPrivacyRestrictedCountry;
    }

    /**
     * Indicates if the region has privacy restrictions.
     */
    @JsonIgnore
    public Optional<Boolean> inPrivacyRestrictedRegion() {
        return inPrivacyRestrictedRegion;
    }

    /**
     * The name of the primary administrative subdivision.
     */
    @JsonIgnore
    public String subdivisions() {
        return subdivisions;
    }

    /**
     * The geographical coordinates (latitude, longitude) of the location.
     */
    @JsonIgnore
    public String coordinates() {
        return coordinates;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * The ISO 3166-1 alpha-2 code of the country.
     */
    public GetTokenByPinIdGeoData withCode(String code) {
        Utils.checkNotNull(code, "code");
        this.code = code;
        return this;
    }

    /**
     * The continent code where the country is located.
     */
    public GetTokenByPinIdGeoData withContinentCode(String continentCode) {
        Utils.checkNotNull(continentCode, "continentCode");
        this.continentCode = continentCode;
        return this;
    }

    /**
     * The official name of the country.
     */
    public GetTokenByPinIdGeoData withCountry(String country) {
        Utils.checkNotNull(country, "country");
        this.country = country;
        return this;
    }

    /**
     * The name of the city.
     */
    public GetTokenByPinIdGeoData withCity(String city) {
        Utils.checkNotNull(city, "city");
        this.city = city;
        return this;
    }

    /**
     * Indicates if the country is a member of the European Union.
     */
    public GetTokenByPinIdGeoData withEuropeanUnionMember(boolean europeanUnionMember) {
        Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
        this.europeanUnionMember = Optional.ofNullable(europeanUnionMember);
        return this;
    }

    /**
     * Indicates if the country is a member of the European Union.
     */
    public GetTokenByPinIdGeoData withEuropeanUnionMember(Optional<Boolean> europeanUnionMember) {
        Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
        this.europeanUnionMember = europeanUnionMember;
        return this;
    }

    /**
     * The time zone of the country.
     */
    public GetTokenByPinIdGeoData withTimeZone(String timeZone) {
        Utils.checkNotNull(timeZone, "timeZone");
        this.timeZone = timeZone;
        return this;
    }

    /**
     * The postal code of the location.
     */
    public GetTokenByPinIdGeoData withPostalCode(String postalCode) {
        Utils.checkNotNull(postalCode, "postalCode");
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Indicates if the country has privacy restrictions.
     */
    public GetTokenByPinIdGeoData withInPrivacyRestrictedCountry(boolean inPrivacyRestrictedCountry) {
        Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
        this.inPrivacyRestrictedCountry = Optional.ofNullable(inPrivacyRestrictedCountry);
        return this;
    }

    /**
     * Indicates if the country has privacy restrictions.
     */
    public GetTokenByPinIdGeoData withInPrivacyRestrictedCountry(Optional<Boolean> inPrivacyRestrictedCountry) {
        Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
        this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
        return this;
    }

    /**
     * Indicates if the region has privacy restrictions.
     */
    public GetTokenByPinIdGeoData withInPrivacyRestrictedRegion(boolean inPrivacyRestrictedRegion) {
        Utils.checkNotNull(inPrivacyRestrictedRegion, "inPrivacyRestrictedRegion");
        this.inPrivacyRestrictedRegion = Optional.ofNullable(inPrivacyRestrictedRegion);
        return this;
    }

    /**
     * Indicates if the region has privacy restrictions.
     */
    public GetTokenByPinIdGeoData withInPrivacyRestrictedRegion(Optional<Boolean> inPrivacyRestrictedRegion) {
        Utils.checkNotNull(inPrivacyRestrictedRegion, "inPrivacyRestrictedRegion");
        this.inPrivacyRestrictedRegion = inPrivacyRestrictedRegion;
        return this;
    }

    /**
     * The name of the primary administrative subdivision.
     */
    public GetTokenByPinIdGeoData withSubdivisions(String subdivisions) {
        Utils.checkNotNull(subdivisions, "subdivisions");
        this.subdivisions = subdivisions;
        return this;
    }

    /**
     * The geographical coordinates (latitude, longitude) of the location.
     */
    public GetTokenByPinIdGeoData withCoordinates(String coordinates) {
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
        GetTokenByPinIdGeoData other = (GetTokenByPinIdGeoData) o;
        return 
            Objects.deepEquals(this.code, other.code) &&
            Objects.deepEquals(this.continentCode, other.continentCode) &&
            Objects.deepEquals(this.country, other.country) &&
            Objects.deepEquals(this.city, other.city) &&
            Objects.deepEquals(this.europeanUnionMember, other.europeanUnionMember) &&
            Objects.deepEquals(this.timeZone, other.timeZone) &&
            Objects.deepEquals(this.postalCode, other.postalCode) &&
            Objects.deepEquals(this.inPrivacyRestrictedCountry, other.inPrivacyRestrictedCountry) &&
            Objects.deepEquals(this.inPrivacyRestrictedRegion, other.inPrivacyRestrictedRegion) &&
            Objects.deepEquals(this.subdivisions, other.subdivisions) &&
            Objects.deepEquals(this.coordinates, other.coordinates);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            code,
            continentCode,
            country,
            city,
            europeanUnionMember,
            timeZone,
            postalCode,
            inPrivacyRestrictedCountry,
            inPrivacyRestrictedRegion,
            subdivisions,
            coordinates);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetTokenByPinIdGeoData.class,
                "code", code,
                "continentCode", continentCode,
                "country", country,
                "city", city,
                "europeanUnionMember", europeanUnionMember,
                "timeZone", timeZone,
                "postalCode", postalCode,
                "inPrivacyRestrictedCountry", inPrivacyRestrictedCountry,
                "inPrivacyRestrictedRegion", inPrivacyRestrictedRegion,
                "subdivisions", subdivisions,
                "coordinates", coordinates);
    }
    
    public final static class Builder {
 
        private String code;
 
        private String continentCode;
 
        private String country;
 
        private String city;
 
        private Optional<Boolean> europeanUnionMember;
 
        private String timeZone;
 
        private String postalCode;
 
        private Optional<Boolean> inPrivacyRestrictedCountry;
 
        private Optional<Boolean> inPrivacyRestrictedRegion;
 
        private String subdivisions;
 
        private String coordinates;  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * The ISO 3166-1 alpha-2 code of the country.
         */
        public Builder code(String code) {
            Utils.checkNotNull(code, "code");
            this.code = code;
            return this;
        }

        /**
         * The continent code where the country is located.
         */
        public Builder continentCode(String continentCode) {
            Utils.checkNotNull(continentCode, "continentCode");
            this.continentCode = continentCode;
            return this;
        }

        /**
         * The official name of the country.
         */
        public Builder country(String country) {
            Utils.checkNotNull(country, "country");
            this.country = country;
            return this;
        }

        /**
         * The name of the city.
         */
        public Builder city(String city) {
            Utils.checkNotNull(city, "city");
            this.city = city;
            return this;
        }

        /**
         * Indicates if the country is a member of the European Union.
         */
        public Builder europeanUnionMember(boolean europeanUnionMember) {
            Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
            this.europeanUnionMember = Optional.ofNullable(europeanUnionMember);
            return this;
        }

        /**
         * Indicates if the country is a member of the European Union.
         */
        public Builder europeanUnionMember(Optional<Boolean> europeanUnionMember) {
            Utils.checkNotNull(europeanUnionMember, "europeanUnionMember");
            this.europeanUnionMember = europeanUnionMember;
            return this;
        }

        /**
         * The time zone of the country.
         */
        public Builder timeZone(String timeZone) {
            Utils.checkNotNull(timeZone, "timeZone");
            this.timeZone = timeZone;
            return this;
        }

        /**
         * The postal code of the location.
         */
        public Builder postalCode(String postalCode) {
            Utils.checkNotNull(postalCode, "postalCode");
            this.postalCode = postalCode;
            return this;
        }

        /**
         * Indicates if the country has privacy restrictions.
         */
        public Builder inPrivacyRestrictedCountry(boolean inPrivacyRestrictedCountry) {
            Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
            this.inPrivacyRestrictedCountry = Optional.ofNullable(inPrivacyRestrictedCountry);
            return this;
        }

        /**
         * Indicates if the country has privacy restrictions.
         */
        public Builder inPrivacyRestrictedCountry(Optional<Boolean> inPrivacyRestrictedCountry) {
            Utils.checkNotNull(inPrivacyRestrictedCountry, "inPrivacyRestrictedCountry");
            this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
            return this;
        }

        /**
         * Indicates if the region has privacy restrictions.
         */
        public Builder inPrivacyRestrictedRegion(boolean inPrivacyRestrictedRegion) {
            Utils.checkNotNull(inPrivacyRestrictedRegion, "inPrivacyRestrictedRegion");
            this.inPrivacyRestrictedRegion = Optional.ofNullable(inPrivacyRestrictedRegion);
            return this;
        }

        /**
         * Indicates if the region has privacy restrictions.
         */
        public Builder inPrivacyRestrictedRegion(Optional<Boolean> inPrivacyRestrictedRegion) {
            Utils.checkNotNull(inPrivacyRestrictedRegion, "inPrivacyRestrictedRegion");
            this.inPrivacyRestrictedRegion = inPrivacyRestrictedRegion;
            return this;
        }

        /**
         * The name of the primary administrative subdivision.
         */
        public Builder subdivisions(String subdivisions) {
            Utils.checkNotNull(subdivisions, "subdivisions");
            this.subdivisions = subdivisions;
            return this;
        }

        /**
         * The geographical coordinates (latitude, longitude) of the location.
         */
        public Builder coordinates(String coordinates) {
            Utils.checkNotNull(coordinates, "coordinates");
            this.coordinates = coordinates;
            return this;
        }
        
        public GetTokenByPinIdGeoData build() {
            if (europeanUnionMember == null) {
                europeanUnionMember = _SINGLETON_VALUE_EuropeanUnionMember.value();
            }
            if (inPrivacyRestrictedCountry == null) {
                inPrivacyRestrictedCountry = _SINGLETON_VALUE_InPrivacyRestrictedCountry.value();
            }
            if (inPrivacyRestrictedRegion == null) {
                inPrivacyRestrictedRegion = _SINGLETON_VALUE_InPrivacyRestrictedRegion.value();
            }            return new GetTokenByPinIdGeoData(
                code,
                continentCode,
                country,
                city,
                europeanUnionMember,
                timeZone,
                postalCode,
                inPrivacyRestrictedCountry,
                inPrivacyRestrictedRegion,
                subdivisions,
                coordinates);
        }

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_EuropeanUnionMember =
                new LazySingletonValue<>(
                        "european_union_member",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_InPrivacyRestrictedCountry =
                new LazySingletonValue<>(
                        "in_privacy_restricted_country",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});

        private static final LazySingletonValue<Optional<Boolean>> _SINGLETON_VALUE_InPrivacyRestrictedRegion =
                new LazySingletonValue<>(
                        "in_privacy_restricted_region",
                        "false",
                        new TypeReference<Optional<Boolean>>() {});
    }
}

