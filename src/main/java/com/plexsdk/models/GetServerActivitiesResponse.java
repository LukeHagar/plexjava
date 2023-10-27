package com.plexsdk.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
  builder = GetServerActivitiesResponse.Builder.class
)
public class GetServerActivitiesResponse extends com.plexsdk.models.BaseModel {

  @lombok.Getter
  @lombok.EqualsAndHashCode(callSuper = false)
  @lombok.ToString
  @com.fasterxml.jackson.annotation.JsonInclude(
    com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
  )
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GetServerActivitiesResponse.MediaContainer.Builder.class
  )
  public static class MediaContainer extends com.plexsdk.models.BaseModel {

    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(
      com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
    )
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
      builder = GetServerActivitiesResponse.MediaContainer.Activity.Builder.class
    )
    public static class Activity extends com.plexsdk.models.BaseModel {

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetServerActivitiesResponse.MediaContainer.Activity.Context.Builder.class
      )
      public static class Context extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("librarySectionID")
          private java.lang.String librarySectionId;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetServerActivitiesResponse.MediaContainer.Activity.Context build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetServerActivitiesResponse.MediaContainer.Activity.Context buildWithoutValidation() {
            return new GetServerActivitiesResponse.MediaContainer.Activity.Context(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionID")
        private final java.lang.String librarySectionId;

        Context(Builder builder) {
          super(builder);
          this.librarySectionId = builder.getLibrarySectionId();
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

        @com.fasterxml.jackson.annotation.JsonProperty("cancellable")
        private java.lang.Boolean cancellable;

        @com.fasterxml.jackson.annotation.JsonProperty("Context")
        private GetServerActivitiesResponse.MediaContainer.Activity.Context context;

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private java.lang.Double progress;

        @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
        private java.lang.String subtitle;

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private java.lang.String title;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private java.lang.String type;

        @com.fasterxml.jackson.annotation.JsonProperty("userID")
        private java.lang.Double userId;

        @com.fasterxml.jackson.annotation.JsonProperty("uuid")
        private java.lang.String uuid;

        public Builder() {
          super(ValidationType.ALL_OF);
        }

        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }

        public GetServerActivitiesResponse.MediaContainer.Activity build() {
          String validateMsg = validate();

          if (validateMsg != null) {
            throw new com.plexsdk.exceptions.ApiException(validateMsg);
          }

          return buildWithoutValidation();
        }

        public GetServerActivitiesResponse.MediaContainer.Activity buildWithoutValidation() {
          return new GetServerActivitiesResponse.MediaContainer.Activity(this);
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

      @com.fasterxml.jackson.annotation.JsonProperty("cancellable")
      private final java.lang.Boolean cancellable;

      @com.fasterxml.jackson.annotation.JsonProperty("Context")
      private final GetServerActivitiesResponse.MediaContainer.Activity.Context context;

      @com.fasterxml.jackson.annotation.JsonProperty("progress")
      private final java.lang.Double progress;

      @com.fasterxml.jackson.annotation.JsonProperty("subtitle")
      private final java.lang.String subtitle;

      @com.fasterxml.jackson.annotation.JsonProperty("title")
      private final java.lang.String title;

      @com.fasterxml.jackson.annotation.JsonProperty("type")
      private final java.lang.String type;

      @com.fasterxml.jackson.annotation.JsonProperty("userID")
      private final java.lang.Double userId;

      @com.fasterxml.jackson.annotation.JsonProperty("uuid")
      private final java.lang.String uuid;

      Activity(Builder builder) {
        super(builder);
        this.cancellable = builder.getCancellable();
        this.context = builder.getContext();
        this.progress = builder.getProgress();
        this.subtitle = builder.getSubtitle();
        this.title = builder.getTitle();
        this.type = builder.getType();
        this.userId = builder.getUserId();
        this.uuid = builder.getUuid();
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

      @com.fasterxml.jackson.annotation.JsonProperty("Activity")
      private java.util.List<GetServerActivitiesResponse.MediaContainer.Activity> activity;

      @com.fasterxml.jackson.annotation.JsonProperty("size")
      private java.lang.Double size;

      public Builder() {
        super(ValidationType.ALL_OF);
      }

      protected Builder(BaseModel.Builder.ValidationType validationType) {
        super(validationType);
      }

      public GetServerActivitiesResponse.MediaContainer build() {
        String validateMsg = validate();

        if (validateMsg != null) {
          throw new com.plexsdk.exceptions.ApiException(validateMsg);
        }

        return buildWithoutValidation();
      }

      public GetServerActivitiesResponse.MediaContainer buildWithoutValidation() {
        return new GetServerActivitiesResponse.MediaContainer(this);
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

    @com.fasterxml.jackson.annotation.JsonProperty("Activity")
    private final java.util.List<GetServerActivitiesResponse.MediaContainer.Activity> activity;

    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.lang.Double size;

    MediaContainer(Builder builder) {
      super(builder);
      this.activity = builder.getActivity();
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
    private GetServerActivitiesResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetServerActivitiesResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.plexsdk.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetServerActivitiesResponse buildWithoutValidation() {
      return new GetServerActivitiesResponse(this);
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
  private final GetServerActivitiesResponse.MediaContainer mediaContainer;

  GetServerActivitiesResponse(Builder builder) {
    super(builder);
    this.mediaContainer = builder.getMediaContainer();
  }
}
