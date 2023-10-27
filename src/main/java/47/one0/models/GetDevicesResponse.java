package 47.one0.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetDevicesResponse.Builder.class)
public class GetDevicesResponse extends 47.one0.models.BaseModel {
    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetDevicesResponse.MediaContainer.Builder.class)
    public static class MediaContainer extends 47.one0.models.BaseModel {
          @lombok.Getter
          @lombok.EqualsAndHashCode(callSuper = false)
          @lombok.ToString
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
          @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetDevicesResponse.MediaContainer.Device.Builder.class)
          public static class Device extends 47.one0.models.BaseModel {
          
          
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
          
              @com.fasterxml.jackson.annotation.JsonProperty("clientIdentifier") private java.lang.String clientIdentifier;
              @com.fasterxml.jackson.annotation.JsonProperty("createdAt") private java.lang.Double createdAt;
              @com.fasterxml.jackson.annotation.JsonProperty("id") private java.lang.Double id;
              @com.fasterxml.jackson.annotation.JsonProperty("name") private java.lang.String name;
              @com.fasterxml.jackson.annotation.JsonProperty("platform") private java.lang.String platform;
          
              public Builder() {
                super(ValidationType.ALL_OF);
              }
          
              protected Builder(BaseModel.Builder.ValidationType validationType) {
                super(validationType);
              }
          
              public GetDevicesResponse.MediaContainer.Device build() {
                String validateMsg = validate();
          
                if (validateMsg != null) {
                  throw new 47.one0.exceptions.ApiException(validateMsg);
                }
          
                return buildWithoutValidation();
              }
          
              public GetDevicesResponse.MediaContainer.Device buildWithoutValidation() {
                return new GetDevicesResponse.MediaContainer.Device(this);
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
          
            @com.fasterxml.jackson.annotation.JsonProperty("clientIdentifier") private final java.lang.String clientIdentifier;
            @com.fasterxml.jackson.annotation.JsonProperty("createdAt") private final java.lang.Double createdAt;
            @com.fasterxml.jackson.annotation.JsonProperty("id") private final java.lang.Double id;
            @com.fasterxml.jackson.annotation.JsonProperty("name") private final java.lang.String name;
            @com.fasterxml.jackson.annotation.JsonProperty("platform") private final java.lang.String platform;
          
            Device(Builder builder) {
              super(builder);
          
              this.clientIdentifier = builder.getClientIdentifier();
              this.createdAt = builder.getCreatedAt();
              this.id = builder.getId();
              this.name = builder.getName();
              this.platform = builder.getPlatform();
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
    
        @com.fasterxml.jackson.annotation.JsonProperty("Device") private java.util.List<GetDevicesResponse.MediaContainer.Device> device;
        @com.fasterxml.jackson.annotation.JsonProperty("identifier") private java.lang.String identifier;
        @com.fasterxml.jackson.annotation.JsonProperty("size") private java.lang.Double size;
    
        public Builder() {
          super(ValidationType.ALL_OF);
        }
    
        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }
    
        public GetDevicesResponse.MediaContainer build() {
          String validateMsg = validate();
    
          if (validateMsg != null) {
            throw new 47.one0.exceptions.ApiException(validateMsg);
          }
    
          return buildWithoutValidation();
        }
    
        public GetDevicesResponse.MediaContainer buildWithoutValidation() {
          return new GetDevicesResponse.MediaContainer(this);
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
    
      @com.fasterxml.jackson.annotation.JsonProperty("Device") private final java.util.List<GetDevicesResponse.MediaContainer.Device> device;
      @com.fasterxml.jackson.annotation.JsonProperty("identifier") private final java.lang.String identifier;
      @com.fasterxml.jackson.annotation.JsonProperty("size") private final java.lang.Double size;
    
      MediaContainer(Builder builder) {
        super(builder);
    
        this.device = builder.getDevice();
        this.identifier = builder.getIdentifier();
        this.size = builder.getSize();
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

    @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer") private GetDevicesResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetDevicesResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new 47.one0.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetDevicesResponse buildWithoutValidation() {
      return new GetDevicesResponse(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer") private final GetDevicesResponse.MediaContainer mediaContainer;

  GetDevicesResponse(Builder builder) {
    super(builder);

    this.mediaContainer = builder.getMediaContainer();
  }
}
