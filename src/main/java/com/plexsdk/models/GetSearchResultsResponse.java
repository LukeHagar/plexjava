package com.plexsdk.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
  builder = GetSearchResultsResponse.Builder.class
)
public class GetSearchResultsResponse extends com.plexsdk.models.BaseModel {

  @lombok.Getter
  @lombok.EqualsAndHashCode(callSuper = false)
  @lombok.ToString
  @com.fasterxml.jackson.annotation.JsonInclude(
    com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
  )
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GetSearchResultsResponse.MediaContainer.Builder.class
  )
  public static class MediaContainer extends com.plexsdk.models.BaseModel {

    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(
      com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
    )
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
      builder = GetSearchResultsResponse.MediaContainer.Metadata.Builder.class
    )
    public static class Metadata extends com.plexsdk.models.BaseModel {

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetSearchResultsResponse.MediaContainer.Metadata.Media.Builder.class
      )
      public static class Media extends com.plexsdk.models.BaseModel {

        @lombok.Getter
        @lombok.EqualsAndHashCode(callSuper = false)
        @lombok.ToString
        @com.fasterxml.jackson.annotation.JsonInclude(
          com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
        )
        @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
          builder = GetSearchResultsResponse.MediaContainer.Metadata.Media.Part.Builder.class
        )
        public static class Part extends com.plexsdk.models.BaseModel {

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

            @com.fasterxml.jackson.annotation.JsonProperty("audioProfile")
            private java.lang.String audioProfile;

            @com.fasterxml.jackson.annotation.JsonProperty("container")
            private java.lang.String container;

            @com.fasterxml.jackson.annotation.JsonProperty("duration")
            private java.lang.Double duration;

            @com.fasterxml.jackson.annotation.JsonProperty("file")
            private java.lang.String file;

            @com.fasterxml.jackson.annotation.JsonProperty("id")
            private java.lang.Double id;

            @com.fasterxml.jackson.annotation.JsonProperty("key")
            private java.lang.String key;

            @com.fasterxml.jackson.annotation.JsonProperty("size")
            private java.lang.Double size;

            @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
            private java.lang.String videoProfile;

            public Builder() {
              super(ValidationType.ALL_OF);
            }

            protected Builder(BaseModel.Builder.ValidationType validationType) {
              super(validationType);
            }

            public GetSearchResultsResponse.MediaContainer.Metadata.Media.Part build() {
              String validateMsg = validate();

              if (validateMsg != null) {
                throw new com.plexsdk.exceptions.ApiException(validateMsg);
              }

              return buildWithoutValidation();
            }

            public GetSearchResultsResponse.MediaContainer.Metadata.Media.Part buildWithoutValidation() {
              return new GetSearchResultsResponse.MediaContainer.Metadata.Media.Part(this);
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

          @com.fasterxml.jackson.annotation.JsonProperty("audioProfile")
          private final java.lang.String audioProfile;

          @com.fasterxml.jackson.annotation.JsonProperty("container")
          private final java.lang.String container;

          @com.fasterxml.jackson.annotation.JsonProperty("duration")
          private final java.lang.Double duration;

          @com.fasterxml.jackson.annotation.JsonProperty("file")
          private final java.lang.String file;

          @com.fasterxml.jackson.annotation.JsonProperty("id")
          private final java.lang.Double id;

          @com.fasterxml.jackson.annotation.JsonProperty("key")
          private final java.lang.String key;

          @com.fasterxml.jackson.annotation.JsonProperty("size")
          private final java.lang.Double size;

          @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
          private final java.lang.String videoProfile;

          Part(Builder builder) {
            super(builder);
            this.audioProfile = builder.getAudioProfile();
            this.container = builder.getContainer();
            this.duration = builder.getDuration();
            this.file = builder.getFile();
            this.id = builder.getId();
            this.key = builder.getKey();
            this.size = builder.getSize();
            this.videoProfile = builder.getVideoProfile();
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

          @com.fasterxml.jackson.annotation.JsonProperty("aspectRatio")
          private java.lang.Double aspectRatio;

          @com.fasterxml.jackson.annotation.JsonProperty("audioChannels")
          private java.lang.Double audioChannels;

          @com.fasterxml.jackson.annotation.JsonProperty("audioCodec")
          private java.lang.String audioCodec;

          @com.fasterxml.jackson.annotation.JsonProperty("audioProfile")
          private java.lang.String audioProfile;

          @com.fasterxml.jackson.annotation.JsonProperty("bitrate")
          private java.lang.Double bitrate;

          @com.fasterxml.jackson.annotation.JsonProperty("container")
          private java.lang.String container;

          @com.fasterxml.jackson.annotation.JsonProperty("duration")
          private java.lang.Double duration;

          @com.fasterxml.jackson.annotation.JsonProperty("height")
          private java.lang.Double height;

          @com.fasterxml.jackson.annotation.JsonProperty("id")
          private java.lang.Double id;

          @com.fasterxml.jackson.annotation.JsonProperty("Part")
          private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Media.Part> part;

          @com.fasterxml.jackson.annotation.JsonProperty("videoCodec")
          private java.lang.String videoCodec;

          @com.fasterxml.jackson.annotation.JsonProperty("videoFrameRate")
          private java.lang.String videoFrameRate;

          @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
          private java.lang.String videoProfile;

          @com.fasterxml.jackson.annotation.JsonProperty("videoResolution")
          private java.lang.Double videoResolution;

          @com.fasterxml.jackson.annotation.JsonProperty("width")
          private java.lang.Double width;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Media build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Media buildWithoutValidation() {
            return new GetSearchResultsResponse.MediaContainer.Metadata.Media(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("aspectRatio")
        private final java.lang.Double aspectRatio;

        @com.fasterxml.jackson.annotation.JsonProperty("audioChannels")
        private final java.lang.Double audioChannels;

        @com.fasterxml.jackson.annotation.JsonProperty("audioCodec")
        private final java.lang.String audioCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("audioProfile")
        private final java.lang.String audioProfile;

        @com.fasterxml.jackson.annotation.JsonProperty("bitrate")
        private final java.lang.Double bitrate;

        @com.fasterxml.jackson.annotation.JsonProperty("container")
        private final java.lang.String container;

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private final java.lang.Double duration;

        @com.fasterxml.jackson.annotation.JsonProperty("height")
        private final java.lang.Double height;

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private final java.lang.Double id;

        @com.fasterxml.jackson.annotation.JsonProperty("Part")
        private final java.util.List<
          GetSearchResultsResponse.MediaContainer.Metadata.Media.Part
        > part;

        @com.fasterxml.jackson.annotation.JsonProperty("videoCodec")
        private final java.lang.String videoCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("videoFrameRate")
        private final java.lang.String videoFrameRate;

        @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
        private final java.lang.String videoProfile;

        @com.fasterxml.jackson.annotation.JsonProperty("videoResolution")
        private final java.lang.Double videoResolution;

        @com.fasterxml.jackson.annotation.JsonProperty("width")
        private final java.lang.Double width;

        Media(Builder builder) {
          super(builder);
          this.aspectRatio = builder.getAspectRatio();
          this.audioChannels = builder.getAudioChannels();
          this.audioCodec = builder.getAudioCodec();
          this.audioProfile = builder.getAudioProfile();
          this.bitrate = builder.getBitrate();
          this.container = builder.getContainer();
          this.duration = builder.getDuration();
          this.height = builder.getHeight();
          this.id = builder.getId();
          this.part = builder.getPart();
          this.videoCodec = builder.getVideoCodec();
          this.videoFrameRate = builder.getVideoFrameRate();
          this.videoProfile = builder.getVideoProfile();
          this.videoResolution = builder.getVideoResolution();
          this.width = builder.getWidth();
        }
      }

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetSearchResultsResponse.MediaContainer.Metadata.Genre.Builder.class
      )
      public static class Genre extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("tag")
          private java.lang.String tag;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Genre build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Genre buildWithoutValidation() {
            return new GetSearchResultsResponse.MediaContainer.Metadata.Genre(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private final java.lang.String tag;

        Genre(Builder builder) {
          super(builder);
          this.tag = builder.getTag();
        }
      }

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetSearchResultsResponse.MediaContainer.Metadata.Director.Builder.class
      )
      public static class Director extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("tag")
          private java.lang.String tag;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Director build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Director buildWithoutValidation() {
            return new GetSearchResultsResponse.MediaContainer.Metadata.Director(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private final java.lang.String tag;

        Director(Builder builder) {
          super(builder);
          this.tag = builder.getTag();
        }
      }

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetSearchResultsResponse.MediaContainer.Metadata.Writer.Builder.class
      )
      public static class Writer extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("tag")
          private java.lang.String tag;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Writer build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Writer buildWithoutValidation() {
            return new GetSearchResultsResponse.MediaContainer.Metadata.Writer(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private final java.lang.String tag;

        Writer(Builder builder) {
          super(builder);
          this.tag = builder.getTag();
        }
      }

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetSearchResultsResponse.MediaContainer.Metadata.Country.Builder.class
      )
      public static class Country extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("tag")
          private java.lang.String tag;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Country build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Country buildWithoutValidation() {
            return new GetSearchResultsResponse.MediaContainer.Metadata.Country(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private final java.lang.String tag;

        Country(Builder builder) {
          super(builder);
          this.tag = builder.getTag();
        }
      }

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetSearchResultsResponse.MediaContainer.Metadata.Role.Builder.class
      )
      public static class Role extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("tag")
          private java.lang.String tag;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Role build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetSearchResultsResponse.MediaContainer.Metadata.Role buildWithoutValidation() {
            return new GetSearchResultsResponse.MediaContainer.Metadata.Role(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private final java.lang.String tag;

        Role(Builder builder) {
          super(builder);
          this.tag = builder.getTag();
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

        @com.fasterxml.jackson.annotation.JsonProperty("addedAt")
        private java.lang.Double addedAt;

        @com.fasterxml.jackson.annotation.JsonProperty("allowSync")
        private java.lang.Boolean allowSync;

        @com.fasterxml.jackson.annotation.JsonProperty("art")
        private java.lang.String art;

        @com.fasterxml.jackson.annotation.JsonProperty("audienceRating")
        private java.lang.Double audienceRating;

        @com.fasterxml.jackson.annotation.JsonProperty("audienceRatingImage")
        private java.lang.String audienceRatingImage;

        @com.fasterxml.jackson.annotation.JsonProperty("chapterSource")
        private java.lang.String chapterSource;

        @com.fasterxml.jackson.annotation.JsonProperty("contentRating")
        private java.lang.String contentRating;

        @com.fasterxml.jackson.annotation.JsonProperty("Country")
        private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Country> country;

        @com.fasterxml.jackson.annotation.JsonProperty("Director")
        private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Director> director;

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private java.lang.Double duration;

        @com.fasterxml.jackson.annotation.JsonProperty("Genre")
        private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Genre> genre;

        @com.fasterxml.jackson.annotation.JsonProperty("guid")
        private java.lang.String guid;

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private java.lang.String key;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionID")
        private java.lang.Double librarySectionId;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionTitle")
        private java.lang.String librarySectionTitle;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionUUID")
        private java.lang.String librarySectionUuid;

        @com.fasterxml.jackson.annotation.JsonProperty("Media")
        private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Media> media;

        @com.fasterxml.jackson.annotation.JsonProperty("originallyAvailableAt")
        private java.lang.String originallyAvailableAt;

        @com.fasterxml.jackson.annotation.JsonProperty("personal")
        private java.lang.Boolean personal;

        @com.fasterxml.jackson.annotation.JsonProperty("primaryExtraKey")
        private java.lang.String primaryExtraKey;

        @com.fasterxml.jackson.annotation.JsonProperty("rating")
        private java.lang.Double rating;

        @com.fasterxml.jackson.annotation.JsonProperty("ratingImage")
        private java.lang.String ratingImage;

        @com.fasterxml.jackson.annotation.JsonProperty("ratingKey")
        private java.lang.Double ratingKey;

        @com.fasterxml.jackson.annotation.JsonProperty("Role")
        private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Role> role;

        @com.fasterxml.jackson.annotation.JsonProperty("sourceTitle")
        private java.lang.String sourceTitle;

        @com.fasterxml.jackson.annotation.JsonProperty("studio")
        private java.lang.String studio;

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private java.lang.String summary;

        @com.fasterxml.jackson.annotation.JsonProperty("tagline")
        private java.lang.String tagline;

        @com.fasterxml.jackson.annotation.JsonProperty("thumb")
        private java.lang.String thumb;

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private java.lang.String title;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private java.lang.String type;

        @com.fasterxml.jackson.annotation.JsonProperty("updatedAt")
        private java.lang.Double updatedAt;

        @com.fasterxml.jackson.annotation.JsonProperty("Writer")
        private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Writer> writer;

        @com.fasterxml.jackson.annotation.JsonProperty("year")
        private java.lang.Double year;

        public Builder() {
          super(ValidationType.ALL_OF);
        }

        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }

        public GetSearchResultsResponse.MediaContainer.Metadata build() {
          String validateMsg = validate();

          if (validateMsg != null) {
            throw new com.plexsdk.exceptions.ApiException(validateMsg);
          }

          return buildWithoutValidation();
        }

        public GetSearchResultsResponse.MediaContainer.Metadata buildWithoutValidation() {
          return new GetSearchResultsResponse.MediaContainer.Metadata(this);
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

      @com.fasterxml.jackson.annotation.JsonProperty("addedAt")
      private final java.lang.Double addedAt;

      @com.fasterxml.jackson.annotation.JsonProperty("allowSync")
      private final java.lang.Boolean allowSync;

      @com.fasterxml.jackson.annotation.JsonProperty("art")
      private final java.lang.String art;

      @com.fasterxml.jackson.annotation.JsonProperty("audienceRating")
      private final java.lang.Double audienceRating;

      @com.fasterxml.jackson.annotation.JsonProperty("audienceRatingImage")
      private final java.lang.String audienceRatingImage;

      @com.fasterxml.jackson.annotation.JsonProperty("chapterSource")
      private final java.lang.String chapterSource;

      @com.fasterxml.jackson.annotation.JsonProperty("contentRating")
      private final java.lang.String contentRating;

      @com.fasterxml.jackson.annotation.JsonProperty("Country")
      private final java.util.List<
        GetSearchResultsResponse.MediaContainer.Metadata.Country
      > country;

      @com.fasterxml.jackson.annotation.JsonProperty("Director")
      private final java.util.List<
        GetSearchResultsResponse.MediaContainer.Metadata.Director
      > director;

      @com.fasterxml.jackson.annotation.JsonProperty("duration")
      private final java.lang.Double duration;

      @com.fasterxml.jackson.annotation.JsonProperty("Genre")
      private final java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Genre> genre;

      @com.fasterxml.jackson.annotation.JsonProperty("guid")
      private final java.lang.String guid;

      @com.fasterxml.jackson.annotation.JsonProperty("key")
      private final java.lang.String key;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionID")
      private final java.lang.Double librarySectionId;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionTitle")
      private final java.lang.String librarySectionTitle;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionUUID")
      private final java.lang.String librarySectionUuid;

      @com.fasterxml.jackson.annotation.JsonProperty("Media")
      private final java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Media> media;

      @com.fasterxml.jackson.annotation.JsonProperty("originallyAvailableAt")
      private final java.lang.String originallyAvailableAt;

      @com.fasterxml.jackson.annotation.JsonProperty("personal")
      private final java.lang.Boolean personal;

      @com.fasterxml.jackson.annotation.JsonProperty("primaryExtraKey")
      private final java.lang.String primaryExtraKey;

      @com.fasterxml.jackson.annotation.JsonProperty("rating")
      private final java.lang.Double rating;

      @com.fasterxml.jackson.annotation.JsonProperty("ratingImage")
      private final java.lang.String ratingImage;

      @com.fasterxml.jackson.annotation.JsonProperty("ratingKey")
      private final java.lang.Double ratingKey;

      @com.fasterxml.jackson.annotation.JsonProperty("Role")
      private final java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Role> role;

      @com.fasterxml.jackson.annotation.JsonProperty("sourceTitle")
      private final java.lang.String sourceTitle;

      @com.fasterxml.jackson.annotation.JsonProperty("studio")
      private final java.lang.String studio;

      @com.fasterxml.jackson.annotation.JsonProperty("summary")
      private final java.lang.String summary;

      @com.fasterxml.jackson.annotation.JsonProperty("tagline")
      private final java.lang.String tagline;

      @com.fasterxml.jackson.annotation.JsonProperty("thumb")
      private final java.lang.String thumb;

      @com.fasterxml.jackson.annotation.JsonProperty("title")
      private final java.lang.String title;

      @com.fasterxml.jackson.annotation.JsonProperty("type")
      private final java.lang.String type;

      @com.fasterxml.jackson.annotation.JsonProperty("updatedAt")
      private final java.lang.Double updatedAt;

      @com.fasterxml.jackson.annotation.JsonProperty("Writer")
      private final java.util.List<GetSearchResultsResponse.MediaContainer.Metadata.Writer> writer;

      @com.fasterxml.jackson.annotation.JsonProperty("year")
      private final java.lang.Double year;

      Metadata(Builder builder) {
        super(builder);
        this.addedAt = builder.getAddedAt();
        this.allowSync = builder.getAllowSync();
        this.art = builder.getArt();
        this.audienceRating = builder.getAudienceRating();
        this.audienceRatingImage = builder.getAudienceRatingImage();
        this.chapterSource = builder.getChapterSource();
        this.contentRating = builder.getContentRating();
        this.country = builder.getCountry();
        this.director = builder.getDirector();
        this.duration = builder.getDuration();
        this.genre = builder.getGenre();
        this.guid = builder.getGuid();
        this.key = builder.getKey();
        this.librarySectionId = builder.getLibrarySectionId();
        this.librarySectionTitle = builder.getLibrarySectionTitle();
        this.librarySectionUuid = builder.getLibrarySectionUuid();
        this.media = builder.getMedia();
        this.originallyAvailableAt = builder.getOriginallyAvailableAt();
        this.personal = builder.getPersonal();
        this.primaryExtraKey = builder.getPrimaryExtraKey();
        this.rating = builder.getRating();
        this.ratingImage = builder.getRatingImage();
        this.ratingKey = builder.getRatingKey();
        this.role = builder.getRole();
        this.sourceTitle = builder.getSourceTitle();
        this.studio = builder.getStudio();
        this.summary = builder.getSummary();
        this.tagline = builder.getTagline();
        this.thumb = builder.getThumb();
        this.title = builder.getTitle();
        this.type = builder.getType();
        this.updatedAt = builder.getUpdatedAt();
        this.writer = builder.getWriter();
        this.year = builder.getYear();
      }
    }

    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(
      com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
    )
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
      builder = GetSearchResultsResponse.MediaContainer.Provider.Builder.class
    )
    public static class Provider extends com.plexsdk.models.BaseModel {

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

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private java.lang.String key;

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private java.lang.String title;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private java.lang.String type;

        public Builder() {
          super(ValidationType.ALL_OF);
        }

        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }

        public GetSearchResultsResponse.MediaContainer.Provider build() {
          String validateMsg = validate();

          if (validateMsg != null) {
            throw new com.plexsdk.exceptions.ApiException(validateMsg);
          }

          return buildWithoutValidation();
        }

        public GetSearchResultsResponse.MediaContainer.Provider buildWithoutValidation() {
          return new GetSearchResultsResponse.MediaContainer.Provider(this);
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

      @com.fasterxml.jackson.annotation.JsonProperty("key")
      private final java.lang.String key;

      @com.fasterxml.jackson.annotation.JsonProperty("title")
      private final java.lang.String title;

      @com.fasterxml.jackson.annotation.JsonProperty("type")
      private final java.lang.String type;

      Provider(Builder builder) {
        super(builder);
        this.key = builder.getKey();
        this.title = builder.getTitle();
        this.type = builder.getType();
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

      @com.fasterxml.jackson.annotation.JsonProperty("identifier")
      private java.lang.String identifier;

      @com.fasterxml.jackson.annotation.JsonProperty("mediaTagPrefix")
      private java.lang.String mediaTagPrefix;

      @com.fasterxml.jackson.annotation.JsonProperty("mediaTagVersion")
      private java.lang.Double mediaTagVersion;

      @com.fasterxml.jackson.annotation.JsonProperty("Metadata")
      private java.util.List<GetSearchResultsResponse.MediaContainer.Metadata> metadata;

      @com.fasterxml.jackson.annotation.JsonProperty("Provider")
      private java.util.List<GetSearchResultsResponse.MediaContainer.Provider> provider;

      @com.fasterxml.jackson.annotation.JsonProperty("size")
      private java.lang.Double size;

      public Builder() {
        super(ValidationType.ALL_OF);
      }

      protected Builder(BaseModel.Builder.ValidationType validationType) {
        super(validationType);
      }

      public GetSearchResultsResponse.MediaContainer build() {
        String validateMsg = validate();

        if (validateMsg != null) {
          throw new com.plexsdk.exceptions.ApiException(validateMsg);
        }

        return buildWithoutValidation();
      }

      public GetSearchResultsResponse.MediaContainer buildWithoutValidation() {
        return new GetSearchResultsResponse.MediaContainer(this);
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

    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final java.lang.String identifier;

    @com.fasterxml.jackson.annotation.JsonProperty("mediaTagPrefix")
    private final java.lang.String mediaTagPrefix;

    @com.fasterxml.jackson.annotation.JsonProperty("mediaTagVersion")
    private final java.lang.Double mediaTagVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("Metadata")
    private final java.util.List<GetSearchResultsResponse.MediaContainer.Metadata> metadata;

    @com.fasterxml.jackson.annotation.JsonProperty("Provider")
    private final java.util.List<GetSearchResultsResponse.MediaContainer.Provider> provider;

    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.lang.Double size;

    MediaContainer(Builder builder) {
      super(builder);
      this.identifier = builder.getIdentifier();
      this.mediaTagPrefix = builder.getMediaTagPrefix();
      this.mediaTagVersion = builder.getMediaTagVersion();
      this.metadata = builder.getMetadata();
      this.provider = builder.getProvider();
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
    private GetSearchResultsResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetSearchResultsResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.plexsdk.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetSearchResultsResponse buildWithoutValidation() {
      return new GetSearchResultsResponse(this);
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
  private final GetSearchResultsResponse.MediaContainer mediaContainer;

  GetSearchResultsResponse(Builder builder) {
    super(builder);
    this.mediaContainer = builder.getMediaContainer();
  }
}
