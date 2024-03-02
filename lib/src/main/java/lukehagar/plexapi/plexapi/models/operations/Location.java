/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Location {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("code")
    public String code;

    public Location withCode(String code) {
        this.code = code;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("european_union_member")
    public Boolean europeanUnionMember;

    public Location withEuropeanUnionMember(Boolean europeanUnionMember) {
        this.europeanUnionMember = europeanUnionMember;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("continent_code")
    public String continentCode;

    public Location withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("country")
    public String country;

    public Location withCountry(String country) {
        this.country = country;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("city")
    public String city;

    public Location withCity(String city) {
        this.city = city;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("time_zone")
    public String timeZone;

    public Location withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postal_code")
    public Double postalCode;

    public Location withPostalCode(Double postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("in_privacy_restricted_country")
    public Boolean inPrivacyRestrictedCountry;

    public Location withInPrivacyRestrictedCountry(Boolean inPrivacyRestrictedCountry) {
        this.inPrivacyRestrictedCountry = inPrivacyRestrictedCountry;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subdivisions")
    public String subdivisions;

    public Location withSubdivisions(String subdivisions) {
        this.subdivisions = subdivisions;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("coordinates")
    public String coordinates;

    public Location withCoordinates(String coordinates) {
        this.coordinates = coordinates;
        return this;
    }
    
    public Location(){}
}