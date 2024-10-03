/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package dev.plexapi.sdk.models.operations;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.plexapi.sdk.utils.Utils;
import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;


public class PostUsersSignInDataAuthenticationSubscription {

    /**
     * List of features allowed on your Plex Pass subscription
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("features")
    private Optional<? extends List<String>> features;

    /**
     * If the account's Plex Pass subscription is active
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("active")
    private Optional<Boolean> active;

    /**
     * Date the account subscribed to Plex Pass
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("subscribedAt")
    private JsonNullable<String> subscribedAt;

    /**
     * String representation of subscriptionActive
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("status")
    private Optional<? extends PostUsersSignInDataAuthenticationResponseStatus> status;

    /**
     * Payment service used for your Plex Pass subscription
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("paymentService")
    private JsonNullable<String> paymentService;

    /**
     * Name of Plex Pass subscription plan
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("plan")
    private JsonNullable<String> plan;

    @JsonCreator
    public PostUsersSignInDataAuthenticationSubscription(
            @JsonProperty("features") Optional<? extends List<String>> features,
            @JsonProperty("active") Optional<Boolean> active,
            @JsonProperty("subscribedAt") JsonNullable<String> subscribedAt,
            @JsonProperty("status") Optional<? extends PostUsersSignInDataAuthenticationResponseStatus> status,
            @JsonProperty("paymentService") JsonNullable<String> paymentService,
            @JsonProperty("plan") JsonNullable<String> plan) {
        Utils.checkNotNull(features, "features");
        Utils.checkNotNull(active, "active");
        Utils.checkNotNull(subscribedAt, "subscribedAt");
        Utils.checkNotNull(status, "status");
        Utils.checkNotNull(paymentService, "paymentService");
        Utils.checkNotNull(plan, "plan");
        this.features = features;
        this.active = active;
        this.subscribedAt = subscribedAt;
        this.status = status;
        this.paymentService = paymentService;
        this.plan = plan;
    }
    
    public PostUsersSignInDataAuthenticationSubscription() {
        this(Optional.empty(), Optional.empty(), JsonNullable.undefined(), Optional.empty(), JsonNullable.undefined(), JsonNullable.undefined());
    }

    /**
     * List of features allowed on your Plex Pass subscription
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<List<String>> features() {
        return (Optional<List<String>>) features;
    }

    /**
     * If the account's Plex Pass subscription is active
     */
    @JsonIgnore
    public Optional<Boolean> active() {
        return active;
    }

    /**
     * Date the account subscribed to Plex Pass
     */
    @JsonIgnore
    public JsonNullable<String> subscribedAt() {
        return subscribedAt;
    }

    /**
     * String representation of subscriptionActive
     */
    @SuppressWarnings("unchecked")
    @JsonIgnore
    public Optional<PostUsersSignInDataAuthenticationResponseStatus> status() {
        return (Optional<PostUsersSignInDataAuthenticationResponseStatus>) status;
    }

    /**
     * Payment service used for your Plex Pass subscription
     */
    @JsonIgnore
    public JsonNullable<String> paymentService() {
        return paymentService;
    }

    /**
     * Name of Plex Pass subscription plan
     */
    @JsonIgnore
    public JsonNullable<String> plan() {
        return plan;
    }

    public final static Builder builder() {
        return new Builder();
    }

    /**
     * List of features allowed on your Plex Pass subscription
     */
    public PostUsersSignInDataAuthenticationSubscription withFeatures(List<String> features) {
        Utils.checkNotNull(features, "features");
        this.features = Optional.ofNullable(features);
        return this;
    }

    /**
     * List of features allowed on your Plex Pass subscription
     */
    public PostUsersSignInDataAuthenticationSubscription withFeatures(Optional<? extends List<String>> features) {
        Utils.checkNotNull(features, "features");
        this.features = features;
        return this;
    }

    /**
     * If the account's Plex Pass subscription is active
     */
    public PostUsersSignInDataAuthenticationSubscription withActive(boolean active) {
        Utils.checkNotNull(active, "active");
        this.active = Optional.ofNullable(active);
        return this;
    }

    /**
     * If the account's Plex Pass subscription is active
     */
    public PostUsersSignInDataAuthenticationSubscription withActive(Optional<Boolean> active) {
        Utils.checkNotNull(active, "active");
        this.active = active;
        return this;
    }

    /**
     * Date the account subscribed to Plex Pass
     */
    public PostUsersSignInDataAuthenticationSubscription withSubscribedAt(String subscribedAt) {
        Utils.checkNotNull(subscribedAt, "subscribedAt");
        this.subscribedAt = JsonNullable.of(subscribedAt);
        return this;
    }

    /**
     * Date the account subscribed to Plex Pass
     */
    public PostUsersSignInDataAuthenticationSubscription withSubscribedAt(JsonNullable<String> subscribedAt) {
        Utils.checkNotNull(subscribedAt, "subscribedAt");
        this.subscribedAt = subscribedAt;
        return this;
    }

    /**
     * String representation of subscriptionActive
     */
    public PostUsersSignInDataAuthenticationSubscription withStatus(PostUsersSignInDataAuthenticationResponseStatus status) {
        Utils.checkNotNull(status, "status");
        this.status = Optional.ofNullable(status);
        return this;
    }

    /**
     * String representation of subscriptionActive
     */
    public PostUsersSignInDataAuthenticationSubscription withStatus(Optional<? extends PostUsersSignInDataAuthenticationResponseStatus> status) {
        Utils.checkNotNull(status, "status");
        this.status = status;
        return this;
    }

    /**
     * Payment service used for your Plex Pass subscription
     */
    public PostUsersSignInDataAuthenticationSubscription withPaymentService(String paymentService) {
        Utils.checkNotNull(paymentService, "paymentService");
        this.paymentService = JsonNullable.of(paymentService);
        return this;
    }

    /**
     * Payment service used for your Plex Pass subscription
     */
    public PostUsersSignInDataAuthenticationSubscription withPaymentService(JsonNullable<String> paymentService) {
        Utils.checkNotNull(paymentService, "paymentService");
        this.paymentService = paymentService;
        return this;
    }

    /**
     * Name of Plex Pass subscription plan
     */
    public PostUsersSignInDataAuthenticationSubscription withPlan(String plan) {
        Utils.checkNotNull(plan, "plan");
        this.plan = JsonNullable.of(plan);
        return this;
    }

    /**
     * Name of Plex Pass subscription plan
     */
    public PostUsersSignInDataAuthenticationSubscription withPlan(JsonNullable<String> plan) {
        Utils.checkNotNull(plan, "plan");
        this.plan = plan;
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
        PostUsersSignInDataAuthenticationSubscription other = (PostUsersSignInDataAuthenticationSubscription) o;
        return 
            Objects.deepEquals(this.features, other.features) &&
            Objects.deepEquals(this.active, other.active) &&
            Objects.deepEquals(this.subscribedAt, other.subscribedAt) &&
            Objects.deepEquals(this.status, other.status) &&
            Objects.deepEquals(this.paymentService, other.paymentService) &&
            Objects.deepEquals(this.plan, other.plan);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
            features,
            active,
            subscribedAt,
            status,
            paymentService,
            plan);
    }
    
    @Override
    public String toString() {
        return Utils.toString(PostUsersSignInDataAuthenticationSubscription.class,
                "features", features,
                "active", active,
                "subscribedAt", subscribedAt,
                "status", status,
                "paymentService", paymentService,
                "plan", plan);
    }
    
    public final static class Builder {
 
        private Optional<? extends List<String>> features = Optional.empty();
 
        private Optional<Boolean> active = Optional.empty();
 
        private JsonNullable<String> subscribedAt = JsonNullable.undefined();
 
        private Optional<? extends PostUsersSignInDataAuthenticationResponseStatus> status = Optional.empty();
 
        private JsonNullable<String> paymentService = JsonNullable.undefined();
 
        private JsonNullable<String> plan = JsonNullable.undefined();  
        
        private Builder() {
          // force use of static builder() method
        }

        /**
         * List of features allowed on your Plex Pass subscription
         */
        public Builder features(List<String> features) {
            Utils.checkNotNull(features, "features");
            this.features = Optional.ofNullable(features);
            return this;
        }

        /**
         * List of features allowed on your Plex Pass subscription
         */
        public Builder features(Optional<? extends List<String>> features) {
            Utils.checkNotNull(features, "features");
            this.features = features;
            return this;
        }

        /**
         * If the account's Plex Pass subscription is active
         */
        public Builder active(boolean active) {
            Utils.checkNotNull(active, "active");
            this.active = Optional.ofNullable(active);
            return this;
        }

        /**
         * If the account's Plex Pass subscription is active
         */
        public Builder active(Optional<Boolean> active) {
            Utils.checkNotNull(active, "active");
            this.active = active;
            return this;
        }

        /**
         * Date the account subscribed to Plex Pass
         */
        public Builder subscribedAt(String subscribedAt) {
            Utils.checkNotNull(subscribedAt, "subscribedAt");
            this.subscribedAt = JsonNullable.of(subscribedAt);
            return this;
        }

        /**
         * Date the account subscribed to Plex Pass
         */
        public Builder subscribedAt(JsonNullable<String> subscribedAt) {
            Utils.checkNotNull(subscribedAt, "subscribedAt");
            this.subscribedAt = subscribedAt;
            return this;
        }

        /**
         * String representation of subscriptionActive
         */
        public Builder status(PostUsersSignInDataAuthenticationResponseStatus status) {
            Utils.checkNotNull(status, "status");
            this.status = Optional.ofNullable(status);
            return this;
        }

        /**
         * String representation of subscriptionActive
         */
        public Builder status(Optional<? extends PostUsersSignInDataAuthenticationResponseStatus> status) {
            Utils.checkNotNull(status, "status");
            this.status = status;
            return this;
        }

        /**
         * Payment service used for your Plex Pass subscription
         */
        public Builder paymentService(String paymentService) {
            Utils.checkNotNull(paymentService, "paymentService");
            this.paymentService = JsonNullable.of(paymentService);
            return this;
        }

        /**
         * Payment service used for your Plex Pass subscription
         */
        public Builder paymentService(JsonNullable<String> paymentService) {
            Utils.checkNotNull(paymentService, "paymentService");
            this.paymentService = paymentService;
            return this;
        }

        /**
         * Name of Plex Pass subscription plan
         */
        public Builder plan(String plan) {
            Utils.checkNotNull(plan, "plan");
            this.plan = JsonNullable.of(plan);
            return this;
        }

        /**
         * Name of Plex Pass subscription plan
         */
        public Builder plan(JsonNullable<String> plan) {
            Utils.checkNotNull(plan, "plan");
            this.plan = plan;
            return this;
        }
        
        public PostUsersSignInDataAuthenticationSubscription build() {
            return new PostUsersSignInDataAuthenticationSubscription(
                features,
                active,
                subscribedAt,
                status,
                paymentService,
                plan);
        }
    }
}

