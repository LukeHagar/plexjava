/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.lang.Deprecated;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;
import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;
import lukehagar.plexapi.plexapi.utils.Utils;

public class GetSessionHistoryRequest {

    /**
     * Sorts the results by the specified field followed by the direction (asc, desc)
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=sort")
    private Optional<? extends String> sort;

    /**
     * Filter results by those that are related to a specific users id
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=accountId")
    private Optional<? extends Long> accountId;

    /**
     * Filters content by field and direction/equality
     * (Unknown if viewedAt is the only supported column)
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=filter")
    private Optional<? extends Filter> filter;

    /**
     * Filters the results based on the id of a valid library section
     * 
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=librarySectionID")
    private Optional<? extends Long> librarySectionID;

    @JsonCreator
    public GetSessionHistoryRequest(
            Optional<? extends String> sort,
            Optional<? extends Long> accountId,
            Optional<? extends Filter> filter,
            Optional<? extends Long> librarySectionID) {
        Utils.checkNotNull(sort, "sort");
        Utils.checkNotNull(accountId, "accountId");
        Utils.checkNotNull(filter, "filter");
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.sort = sort;
        this.accountId = accountId;
        this.filter = filter;
        this.librarySectionID = librarySectionID;
    }
    
    public GetSessionHistoryRequest() {
        this(Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    /**
     * Sorts the results by the specified field followed by the direction (asc, desc)
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<String> sort() {
        return (Optional<String>) sort;
    }

    /**
     * Filter results by those that are related to a specific users id
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> accountId() {
        return (Optional<Long>) accountId;
    }

    /**
     * Filters content by field and direction/equality
     * (Unknown if viewedAt is the only supported column)
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Filter> filter() {
        return (Optional<Filter>) filter;
    }

    /**
     * Filters the results based on the id of a valid library section
     * 
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<Long> librarySectionID() {
        return (Optional<Long>) librarySectionID;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * Sorts the results by the specified field followed by the direction (asc, desc)
     * 
     */
    public GetSessionHistoryRequest withSort(String sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = Optional.ofNullable(sort);
        return this;
    }

    /**
     * Sorts the results by the specified field followed by the direction (asc, desc)
     * 
     */
    public GetSessionHistoryRequest withSort(Optional<? extends String> sort) {
        Utils.checkNotNull(sort, "sort");
        this.sort = sort;
        return this;
    }

    /**
     * Filter results by those that are related to a specific users id
     * 
     */
    public GetSessionHistoryRequest withAccountId(long accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = Optional.ofNullable(accountId);
        return this;
    }

    /**
     * Filter results by those that are related to a specific users id
     * 
     */
    public GetSessionHistoryRequest withAccountId(Optional<? extends Long> accountId) {
        Utils.checkNotNull(accountId, "accountId");
        this.accountId = accountId;
        return this;
    }

    /**
     * Filters content by field and direction/equality
     * (Unknown if viewedAt is the only supported column)
     * 
     */
    public GetSessionHistoryRequest withFilter(Filter filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = Optional.ofNullable(filter);
        return this;
    }

    /**
     * Filters content by field and direction/equality
     * (Unknown if viewedAt is the only supported column)
     * 
     */
    public GetSessionHistoryRequest withFilter(Optional<? extends Filter> filter) {
        Utils.checkNotNull(filter, "filter");
        this.filter = filter;
        return this;
    }

    /**
     * Filters the results based on the id of a valid library section
     * 
     */
    public GetSessionHistoryRequest withLibrarySectionID(long librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = Optional.ofNullable(librarySectionID);
        return this;
    }

    /**
     * Filters the results based on the id of a valid library section
     * 
     */
    public GetSessionHistoryRequest withLibrarySectionID(Optional<? extends Long> librarySectionID) {
        Utils.checkNotNull(librarySectionID, "librarySectionID");
        this.librarySectionID = librarySectionID;
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
        GetSessionHistoryRequest other = (GetSessionHistoryRequest) o;
        return 
            java.util.Objects.deepEquals(this.sort, other.sort) &&
            java.util.Objects.deepEquals(this.accountId, other.accountId) &&
            java.util.Objects.deepEquals(this.filter, other.filter) &&
            java.util.Objects.deepEquals(this.librarySectionID, other.librarySectionID);
    }
    
    @Override
    public int hashCode() {
        return java.util.Objects.hash(
            sort,
            accountId,
            filter,
            librarySectionID);
    }
    
    @Override
    public String toString() {
        return Utils.toString(GetSessionHistoryRequest.class,
                "sort", sort,
                "accountId", accountId,
                "filter", filter,
                "librarySectionID", librarySectionID);
    }
    
    public final static class Builder {
 
        private Optional<? extends String> sort = Optional.empty();
 
        private Optional<? extends Long> accountId = Optional.empty();
 
        private Optional<? extends Filter> filter = Optional.empty();
 
        private Optional<? extends Long> librarySectionID = Optional.empty();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * Sorts the results by the specified field followed by the direction (asc, desc)
         * 
         */
        public Builder sort(String sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = Optional.ofNullable(sort);
            return this;
        }

        /**
         * Sorts the results by the specified field followed by the direction (asc, desc)
         * 
         */
        public Builder sort(Optional<? extends String> sort) {
            Utils.checkNotNull(sort, "sort");
            this.sort = sort;
            return this;
        }

        /**
         * Filter results by those that are related to a specific users id
         * 
         */
        public Builder accountId(long accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = Optional.ofNullable(accountId);
            return this;
        }

        /**
         * Filter results by those that are related to a specific users id
         * 
         */
        public Builder accountId(Optional<? extends Long> accountId) {
            Utils.checkNotNull(accountId, "accountId");
            this.accountId = accountId;
            return this;
        }

        /**
         * Filters content by field and direction/equality
         * (Unknown if viewedAt is the only supported column)
         * 
         */
        public Builder filter(Filter filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = Optional.ofNullable(filter);
            return this;
        }

        /**
         * Filters content by field and direction/equality
         * (Unknown if viewedAt is the only supported column)
         * 
         */
        public Builder filter(Optional<? extends Filter> filter) {
            Utils.checkNotNull(filter, "filter");
            this.filter = filter;
            return this;
        }

        /**
         * Filters the results based on the id of a valid library section
         * 
         */
        public Builder librarySectionID(long librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = Optional.ofNullable(librarySectionID);
            return this;
        }

        /**
         * Filters the results based on the id of a valid library section
         * 
         */
        public Builder librarySectionID(Optional<? extends Long> librarySectionID) {
            Utils.checkNotNull(librarySectionID, "librarySectionID");
            this.librarySectionID = librarySectionID;
            return this;
        }
        
        public GetSessionHistoryRequest build() {
            return new GetSessionHistoryRequest(
                sort,
                accountId,
                filter,
                librarySectionID);
        }
    }
}

