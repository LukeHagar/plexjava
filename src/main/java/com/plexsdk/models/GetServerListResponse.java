package com.plexsdk.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
  builder = GetServerListResponse.Builder.class
)
public class GetServerListResponse extends com.plexsdk.models.BaseModel {

  @lombok.Getter
  @lombok.EqualsAndHashCode(callSuper = false)
  @lombok.ToString
  @com.fasterxml.jackson.annotation.JsonInclude(
    com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
  )
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GetServerListResponse.MediaContainer.Builder.class
  )
  public static class MediaContainer extends com.plexsdk.models.BaseModel {

    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(
      com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
    )
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
      builder = GetServerListResponse.MediaContainer.Server.Builder.class
    )
    public static class Server extends com.plexsdk.models.BaseModel {

      @lombok.Getter
      @lombok.Setter
      @lombok.experimental.Accessors(chain = true)
      @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(
        buildMethodName = "buildWithoutValidation",
        withPrefix = "set"
      )
      public static class Builder extends com.plexsdk.models.BaseModel.Builder {

        static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

        static {
          java.lang.String[][] requiredFieldsGroups = new java.lang.String[][] {};

          REQUIRED_FIELDS_GROUPS =
            java.util.Arrays
              .stream(requiredFieldsGroups)
              .map(group ->
                java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet())
              )
              .collect(java.util.stream.Collectors.toSet());
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private java.lang.String address;

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private java.lang.String host;

        @com.fasterxml.jackson.annotation.JsonProperty("machineIdentifier")
        private java.lang.String machineIdentifier;

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private java.lang.String name;

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private java.lang.Double port;

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private java.lang.String version;

        public Builder() {
          super(ValidationType.ALL_OF);
        }

        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }

        public GetServerListResponse.MediaContainer.Server build() {
          String validateMsg = validate();

          if (validateMsg != null) {
            throw new com.plexsdk.exceptions.ApiException(validateMsg);
          }

          return buildWithoutValidation();
        }

        public GetServerListResponse.MediaContainer.Server buildWithoutValidation() {
          return new GetServerListResponse.MediaContainer.Server(this);
        }

        @Override
        protected java.util.Set<String> getNonNullInstanceFieldNames() {
          // Introspect the class to get a list of all declared fields.
          return java.util.Arrays
            .asList(this.getClass().getDeclaredFields())
            .stream()
            .filter(field -> {
              try {
                // Filter fields that are non-static and have values that are not null.
                return (
                  !java.lang.reflect.Modifier.isStatic(field.getModifiers()) &&
                  field.get(this) != null
                );
              } catch (IllegalArgumentException | IllegalAccessException e) {
                // This should never happen...

                throw new com.plexsdk.exceptions.ApiException(
                  "Unexpected exception thrown while accessing instance fields.",
                  e
                );
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

      @com.fasterxml.jackson.annotation.JsonProperty("address")
      private final java.lang.String address;

      @com.fasterxml.jackson.annotation.JsonProperty("host")
      private final java.lang.String host;

      @com.fasterxml.jackson.annotation.JsonProperty("machineIdentifier")
      private final java.lang.String machineIdentifier;

      @com.fasterxml.jackson.annotation.JsonProperty("name")
      private final java.lang.String name;

      @com.fasterxml.jackson.annotation.JsonProperty("port")
      private final java.lang.Double port;

      @com.fasterxml.jackson.annotation.JsonProperty("version")
      private final java.lang.String version;

      Server(Builder builder) {
        super(builder);
        this.address = builder.getAddress();
        this.host = builder.getHost();
        this.machineIdentifier = builder.getMachineIdentifier();
        this.name = builder.getName();
        this.port = builder.getPort();
        this.version = builder.getVersion();
      }
    }

    @lombok.Getter
    @lombok.Setter
    @lombok.experimental.Accessors(chain = true)
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(
      buildMethodName = "buildWithoutValidation",
      withPrefix = "set"
    )
    public static class Builder extends com.plexsdk.models.BaseModel.Builder {

      static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

      static {
        java.lang.String[][] requiredFieldsGroups = new java.lang.String[][] {};

        REQUIRED_FIELDS_GROUPS =
          java.util.Arrays
            .stream(requiredFieldsGroups)
            .map(group ->
              java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet())
            )
            .collect(java.util.stream.Collectors.toSet());
      }

      @com.fasterxml.jackson.annotation.JsonProperty("Server")
      private java.util.List<GetServerListResponse.MediaContainer.Server> server;

      @com.fasterxml.jackson.annotation.JsonProperty("size")
      private java.lang.Double size;

      public Builder() {
        super(ValidationType.ALL_OF);
      }

      protected Builder(BaseModel.Builder.ValidationType validationType) {
        super(validationType);
      }

      public GetServerListResponse.MediaContainer build() {
        String validateMsg = validate();

        if (validateMsg != null) {
          throw new com.plexsdk.exceptions.ApiException(validateMsg);
        }

        return buildWithoutValidation();
      }

      public GetServerListResponse.MediaContainer buildWithoutValidation() {
        return new GetServerListResponse.MediaContainer(this);
      }

      @Override
      protected java.util.Set<String> getNonNullInstanceFieldNames() {
        // Introspect the class to get a list of all declared fields.
        return java.util.Arrays
          .asList(this.getClass().getDeclaredFields())
          .stream()
          .filter(field -> {
            try {
              // Filter fields that are non-static and have values that are not null.
              return (
                !java.lang.reflect.Modifier.isStatic(field.getModifiers()) &&
                field.get(this) != null
              );
            } catch (IllegalArgumentException | IllegalAccessException e) {
              // This should never happen...

              throw new com.plexsdk.exceptions.ApiException(
                "Unexpected exception thrown while accessing instance fields.",
                e
              );
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

    @com.fasterxml.jackson.annotation.JsonProperty("Server")
    private final java.util.List<GetServerListResponse.MediaContainer.Server> server;

    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.lang.Double size;

    MediaContainer(Builder builder) {
      super(builder);
      this.server = builder.getServer();
      this.size = builder.getSize();
    }
  }

  @lombok.Getter
  @lombok.Setter
  @lombok.experimental.Accessors(chain = true)
  @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(
    buildMethodName = "buildWithoutValidation",
    withPrefix = "set"
  )
  public static class Builder extends com.plexsdk.models.BaseModel.Builder {

    static final java.util.Set<java.util.Set<String>> REQUIRED_FIELDS_GROUPS;

    static {
      java.lang.String[][] requiredFieldsGroups = new java.lang.String[][] {};

      REQUIRED_FIELDS_GROUPS =
        java.util.Arrays
          .stream(requiredFieldsGroups)
          .map(group -> java.util.Arrays.stream(group).collect(java.util.stream.Collectors.toSet()))
          .collect(java.util.stream.Collectors.toSet());
    }

    @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer")
    private GetServerListResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetServerListResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.plexsdk.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetServerListResponse buildWithoutValidation() {
      return new GetServerListResponse(this);
    }

    @Override
    protected java.util.Set<String> getNonNullInstanceFieldNames() {
      // Introspect the class to get a list of all declared fields.
      return java.util.Arrays
        .stream(this.getClass().getDeclaredFields())
        .filter(field -> {
          try {
            // Filter fields that are non-static and have values that are not null.
            return (
              !java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.get(this) != null
            );
          } catch (IllegalArgumentException | IllegalAccessException e) {
            // This should never happen...

            throw new com.plexsdk.exceptions.ApiException(
              "Unexpected exception thrown while accessing instance fields.",
              e
            );
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

  @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer")
  private final GetServerListResponse.MediaContainer mediaContainer;

  GetServerListResponse(Builder builder) {
    super(builder);
    this.mediaContainer = builder.getMediaContainer();
  }
}
