package 47.one0.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetMyPlexAccountResponse.Builder.class)
public class GetMyPlexAccountResponse extends 47.one0.models.BaseModel {
    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetMyPlexAccountResponse.MyPlex.Builder.class)
    public static class MyPlex extends 47.one0.models.BaseModel {
    
    
      @lombok.Getter
      @lombok.Setter
      @lombok.experimental.Accessors(chain = true)
      @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(buildMethodName = "buildWithoutValidation", withPrefix = "set")
      public static class Builder extends 47.one0.models.BaseModel.Builder {
        static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;
    
        static {
          java.lang.String[][] requiredFieldsGroups =
              new java.lang.String[][] {
                
              };
    
          REQUIRED_FIELDS_GROUPS =
              java.util.Arrays.stream(requiredFieldsGroups)
                  .map((group) -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
                  .collect(java.util.stream.Collectors.toSet());
        }
    
        @com.fasterxml.jackson.annotation.JsonProperty("authToken") private java.lang.String authToken;
        @com.fasterxml.jackson.annotation.JsonProperty("mappingError") private java.lang.String mappingError;
        @com.fasterxml.jackson.annotation.JsonProperty("mappingState") private java.lang.String mappingState;
        @com.fasterxml.jackson.annotation.JsonProperty("privateAddress") private java.lang.String privateAddress;
        @com.fasterxml.jackson.annotation.JsonProperty("privatePort") private java.lang.Double privatePort;
        @com.fasterxml.jackson.annotation.JsonProperty("publicAddress") private java.lang.String publicAddress;
        @com.fasterxml.jackson.annotation.JsonProperty("publicPort") private java.lang.Double publicPort;
        @com.fasterxml.jackson.annotation.JsonProperty("signInState") private java.lang.String signInState;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionActive") private java.lang.Boolean subscriptionActive;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionFeatures") private java.lang.String subscriptionFeatures;
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionState") private java.lang.String subscriptionState;
        @com.fasterxml.jackson.annotation.JsonProperty("username") private java.lang.String username;
    
        public Builder() {
          super(ValidationType.ALL_OF);
        }
    
        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }
    
        public GetMyPlexAccountResponse.MyPlex build() {
          String validateMsg = validate();
    
          if (validateMsg != null) {
            throw new 47.one0.exceptions.ApiException(validateMsg);
          }
    
          return buildWithoutValidation();
        }
    
        public GetMyPlexAccountResponse.MyPlex buildWithoutValidation() {
          return new GetMyPlexAccountResponse.MyPlex(this);
        }
    
        @Override
        protected java.util.Set<String> getNonNullInstanceFieldNames() {
          // Introspect the class to get a list of all declared fields.
          return java.util.Arrays.asList(this.getClass().getDeclaredFields()).stream()
              .filter(
                  (field) -> {
                    try {
                      // Filter fields that are non-static and have values that are not null.
                      return !java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.get(this) != null;
                    } catch (IllegalArgumentException | IllegalAccessException e) {
                      // This should never happen...
    
                      throw new 47.one0.exceptions.ApiException(
                          "Unexpected exception thrown while accessing instance fields.", e);
                    }
                  })
              .map(java.lang.reflect.Field::getName)
              .collect(java.util.stream.Collectors.toSet());
        }
    
        @Override
        protected java.util.Set<java.util.Set<String>> getRequiredFieldsGroups() {
          return REQUIRED_FIELDS_GROUPS;
        }
      }
    
      @com.fasterxml.jackson.annotation.JsonProperty("authToken") private final java.lang.String authToken;
      @com.fasterxml.jackson.annotation.JsonProperty("mappingError") private final java.lang.String mappingError;
      @com.fasterxml.jackson.annotation.JsonProperty("mappingState") private final java.lang.String mappingState;
      @com.fasterxml.jackson.annotation.JsonProperty("privateAddress") private final java.lang.String privateAddress;
      @com.fasterxml.jackson.annotation.JsonProperty("privatePort") private final java.lang.Double privatePort;
      @com.fasterxml.jackson.annotation.JsonProperty("publicAddress") private final java.lang.String publicAddress;
      @com.fasterxml.jackson.annotation.JsonProperty("publicPort") private final java.lang.Double publicPort;
      @com.fasterxml.jackson.annotation.JsonProperty("signInState") private final java.lang.String signInState;
      @com.fasterxml.jackson.annotation.JsonProperty("subscriptionActive") private final java.lang.Boolean subscriptionActive;
      @com.fasterxml.jackson.annotation.JsonProperty("subscriptionFeatures") private final java.lang.String subscriptionFeatures;
      @com.fasterxml.jackson.annotation.JsonProperty("subscriptionState") private final java.lang.String subscriptionState;
      @com.fasterxml.jackson.annotation.JsonProperty("username") private final java.lang.String username;
    
      MyPlex(Builder builder) {
        super(builder);
    
        this.authToken = builder.getAuthToken();
        this.mappingError = builder.getMappingError();
        this.mappingState = builder.getMappingState();
        this.privateAddress = builder.getPrivateAddress();
        this.privatePort = builder.getPrivatePort();
        this.publicAddress = builder.getPublicAddress();
        this.publicPort = builder.getPublicPort();
        this.signInState = builder.getSignInState();
        this.subscriptionActive = builder.getSubscriptionActive();
        this.subscriptionFeatures = builder.getSubscriptionFeatures();
        this.subscriptionState = builder.getSubscriptionState();
        this.username = builder.getUsername();
      }
    }
    

  @lombok.Getter
  @lombok.Setter
  @lombok.experimental.Accessors(chain = true)
  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(buildMethodName = "buildWithoutValidation", withPrefix = "set")
  public static class Builder extends 47.one0.models.BaseModel.Builder {
    static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

    static {
      java.lang.String[][] requiredFieldsGroups =
          new java.lang.String[][] {
            
          };

      REQUIRED_FIELDS_GROUPS =
          java.util.Arrays.stream(requiredFieldsGroups)
              .map((group) -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
              .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("MyPlex") private GetMyPlexAccountResponse.MyPlex myPlex;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetMyPlexAccountResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new 47.one0.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetMyPlexAccountResponse buildWithoutValidation() {
      return new GetMyPlexAccountResponse(this);
    }

    @Override
    protected java.util.Set<String> getNonNullInstanceFieldNames() {
      // Introspect the class to get a list of all declared fields.
      return java.util.Arrays.stream(this.getClass().getDeclaredFields())
          .filter(
              (field) -> {
                try {
                  // Filter fields that are non-static and have values that are not null.
                  return !java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.get(this) != null;
                } catch (IllegalArgumentException | IllegalAccessException e) {
                  // This should never happen...

                  throw new 47.one0.exceptions.ApiException(
                      "Unexpected exception thrown while accessing instance fields.", e);
                }
              })
          .map(java.lang.reflect.Field::getName)
          .collect(java.util.stream.Collectors.toSet());
    }

    @Override
    protected java.util.Set<java.util.Set<String>> getRequiredFieldsGroups() {
      return REQUIRED_FIELDS_GROUPS;
    }
  }

  @com.fasterxml.jackson.annotation.JsonProperty("MyPlex") private final GetMyPlexAccountResponse.MyPlex myPlex;

  GetMyPlexAccountResponse(Builder builder) {
    super(builder);

    this.myPlex = builder.getMyPlex();
  }
}
