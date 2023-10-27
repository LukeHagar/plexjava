package 47.one0.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetServerIdentityResponse.Builder.class)
public class GetServerIdentityResponse extends 47.one0.models.BaseModel {
    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetServerIdentityResponse.MediaContainer.Builder.class)
    public static class MediaContainer extends 47.one0.models.BaseModel {
    
    
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
    
        @com.fasterxml.jackson.annotation.JsonProperty("claimed") private java.lang.Boolean claimed;
        @com.fasterxml.jackson.annotation.JsonProperty("machineIdentifier") private java.lang.String machineIdentifier;
        @com.fasterxml.jackson.annotation.JsonProperty("size") private java.lang.Double size;
        @com.fasterxml.jackson.annotation.JsonProperty("version") private java.lang.String version;
    
        public Builder() {
          super(ValidationType.ALL_OF);
        }
    
        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }
    
        public GetServerIdentityResponse.MediaContainer build() {
          String validateMsg = validate();
    
          if (validateMsg != null) {
            throw new 47.one0.exceptions.ApiException(validateMsg);
          }
    
          return buildWithoutValidation();
        }
    
        public GetServerIdentityResponse.MediaContainer buildWithoutValidation() {
          return new GetServerIdentityResponse.MediaContainer(this);
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
    
      @com.fasterxml.jackson.annotation.JsonProperty("claimed") private final java.lang.Boolean claimed;
      @com.fasterxml.jackson.annotation.JsonProperty("machineIdentifier") private final java.lang.String machineIdentifier;
      @com.fasterxml.jackson.annotation.JsonProperty("size") private final java.lang.Double size;
      @com.fasterxml.jackson.annotation.JsonProperty("version") private final java.lang.String version;
    
      MediaContainer(Builder builder) {
        super(builder);
    
        this.claimed = builder.getClaimed();
        this.machineIdentifier = builder.getMachineIdentifier();
        this.size = builder.getSize();
        this.version = builder.getVersion();
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

    @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer") private GetServerIdentityResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetServerIdentityResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new 47.one0.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetServerIdentityResponse buildWithoutValidation() {
      return new GetServerIdentityResponse(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer") private final GetServerIdentityResponse.MediaContainer mediaContainer;

  GetServerIdentityResponse(Builder builder) {
    super(builder);

    this.mediaContainer = builder.getMediaContainer();
  }
}
