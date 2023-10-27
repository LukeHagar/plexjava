package com.plexsdk.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
  builder = GetOnDeckResponse.Builder.class
)
public class GetOnDeckResponse extends com.plexsdk.models.BaseModel {

  @lombok.Getter
  @lombok.EqualsAndHashCode(callSuper = false)
  @lombok.ToString
  @com.fasterxml.jackson.annotation.JsonInclude(
    com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
  )
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GetOnDeckResponse.MediaContainer.Builder.class
  )
  public static class MediaContainer extends com.plexsdk.models.BaseModel {

    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(
      com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
    )
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
      builder = GetOnDeckResponse.MediaContainer.Metadata.Builder.class
    )
    public static class Metadata extends com.plexsdk.models.BaseModel {

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetOnDeckResponse.MediaContainer.Metadata.Guid.Builder.class
      )
      public static class Guid extends com.plexsdk.models.BaseModel {

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

          @com.fasterxml.jackson.annotation.JsonProperty("id")
          private java.lang.String id;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetOnDeckResponse.MediaContainer.Metadata.Guid build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetOnDeckResponse.MediaContainer.Metadata.Guid buildWithoutValidation() {
            return new GetOnDeckResponse.MediaContainer.Metadata.Guid(this);
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private final java.lang.String id;

        Guid(Builder builder) {
          super(builder);
          this.id = builder.getId();
        }
      }

      @lombok.Getter
      @lombok.EqualsAndHashCode(callSuper = false)
      @lombok.ToString
      @com.fasterxml.jackson.annotation.JsonInclude(
        com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
      )
      @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetOnDeckResponse.MediaContainer.Metadata.Media.Builder.class
      )
      public static class Media extends com.plexsdk.models.BaseModel {

        @lombok.Getter
        @lombok.EqualsAndHashCode(callSuper = false)
        @lombok.ToString
        @com.fasterxml.jackson.annotation.JsonInclude(
          com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
        )
        @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
          builder = GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Builder.class
        )
        public static class Part extends com.plexsdk.models.BaseModel {

          @lombok.Getter
          @lombok.EqualsAndHashCode(callSuper = false)
          @lombok.ToString
          @com.fasterxml.jackson.annotation.JsonInclude(
            com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
          )
          @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
            builder = GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Stream.Builder.class
          )
          public static class Stream extends com.plexsdk.models.BaseModel {

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

              @com.fasterxml.jackson.annotation.JsonProperty("default_")
              private java.lang.Boolean _default;

              @com.fasterxml.jackson.annotation.JsonProperty("bitDepth")
              private java.lang.Double bitDepth;

              @com.fasterxml.jackson.annotation.JsonProperty("bitrate")
              private java.lang.Double bitrate;

              @com.fasterxml.jackson.annotation.JsonProperty("chromaLocation")
              private java.lang.String chromaLocation;

              @com.fasterxml.jackson.annotation.JsonProperty("chromaSubsampling")
              private java.lang.String chromaSubsampling;

              @com.fasterxml.jackson.annotation.JsonProperty("codec")
              private java.lang.String codec;

              @com.fasterxml.jackson.annotation.JsonProperty("codedHeight")
              private java.lang.Double codedHeight;

              @com.fasterxml.jackson.annotation.JsonProperty("codedWidth")
              private java.lang.Double codedWidth;

              @com.fasterxml.jackson.annotation.JsonProperty("colorRange")
              private java.lang.String colorRange;

              @com.fasterxml.jackson.annotation.JsonProperty("displayTitle")
              private java.lang.String displayTitle;

              @com.fasterxml.jackson.annotation.JsonProperty("extendedDisplayTitle")
              private java.lang.String extendedDisplayTitle;

              @com.fasterxml.jackson.annotation.JsonProperty("frameRate")
              private java.lang.Double frameRate;

              @com.fasterxml.jackson.annotation.JsonProperty("height")
              private java.lang.Double height;

              @com.fasterxml.jackson.annotation.JsonProperty("id")
              private java.lang.Double id;

              @com.fasterxml.jackson.annotation.JsonProperty("index")
              private java.lang.Double index;

              @com.fasterxml.jackson.annotation.JsonProperty("language")
              private java.lang.String language;

              @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
              private java.lang.String languageCode;

              @com.fasterxml.jackson.annotation.JsonProperty("languageTag")
              private java.lang.String languageTag;

              @com.fasterxml.jackson.annotation.JsonProperty("level")
              private java.lang.Double level;

              @com.fasterxml.jackson.annotation.JsonProperty("profile")
              private java.lang.String profile;

              @com.fasterxml.jackson.annotation.JsonProperty("refFrames")
              private java.lang.Double refFrames;

              @com.fasterxml.jackson.annotation.JsonProperty("streamType")
              private java.lang.Double streamType;

              @com.fasterxml.jackson.annotation.JsonProperty("width")
              private java.lang.Double width;

              public Builder() {
                super(ValidationType.ALL_OF);
              }

              protected Builder(BaseModel.Builder.ValidationType validationType) {
                super(validationType);
              }

              public GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Stream build() {
                String validateMsg = validate();

                if (validateMsg != null) {
                  throw new com.plexsdk.exceptions.ApiException(validateMsg);
                }

                return buildWithoutValidation();
              }

              public GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Stream buildWithoutValidation() {
                return new GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Stream(this);
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

            @com.fasterxml.jackson.annotation.JsonProperty("default_")
            private final java.lang.Boolean _default;

            @com.fasterxml.jackson.annotation.JsonProperty("bitDepth")
            private final java.lang.Double bitDepth;

            @com.fasterxml.jackson.annotation.JsonProperty("bitrate")
            private final java.lang.Double bitrate;

            @com.fasterxml.jackson.annotation.JsonProperty("chromaLocation")
            private final java.lang.String chromaLocation;

            @com.fasterxml.jackson.annotation.JsonProperty("chromaSubsampling")
            private final java.lang.String chromaSubsampling;

            @com.fasterxml.jackson.annotation.JsonProperty("codec")
            private final java.lang.String codec;

            @com.fasterxml.jackson.annotation.JsonProperty("codedHeight")
            private final java.lang.Double codedHeight;

            @com.fasterxml.jackson.annotation.JsonProperty("codedWidth")
            private final java.lang.Double codedWidth;

            @com.fasterxml.jackson.annotation.JsonProperty("colorRange")
            private final java.lang.String colorRange;

            @com.fasterxml.jackson.annotation.JsonProperty("displayTitle")
            private final java.lang.String displayTitle;

            @com.fasterxml.jackson.annotation.JsonProperty("extendedDisplayTitle")
            private final java.lang.String extendedDisplayTitle;

            @com.fasterxml.jackson.annotation.JsonProperty("frameRate")
            private final java.lang.Double frameRate;

            @com.fasterxml.jackson.annotation.JsonProperty("height")
            private final java.lang.Double height;

            @com.fasterxml.jackson.annotation.JsonProperty("id")
            private final java.lang.Double id;

            @com.fasterxml.jackson.annotation.JsonProperty("index")
            private final java.lang.Double index;

            @com.fasterxml.jackson.annotation.JsonProperty("language")
            private final java.lang.String language;

            @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
            private final java.lang.String languageCode;

            @com.fasterxml.jackson.annotation.JsonProperty("languageTag")
            private final java.lang.String languageTag;

            @com.fasterxml.jackson.annotation.JsonProperty("level")
            private final java.lang.Double level;

            @com.fasterxml.jackson.annotation.JsonProperty("profile")
            private final java.lang.String profile;

            @com.fasterxml.jackson.annotation.JsonProperty("refFrames")
            private final java.lang.Double refFrames;

            @com.fasterxml.jackson.annotation.JsonProperty("streamType")
            private final java.lang.Double streamType;

            @com.fasterxml.jackson.annotation.JsonProperty("width")
            private final java.lang.Double width;

            Stream(Builder builder) {
              super(builder);
              this._default = builder.get_default();
              this.bitDepth = builder.getBitDepth();
              this.bitrate = builder.getBitrate();
              this.chromaLocation = builder.getChromaLocation();
              this.chromaSubsampling = builder.getChromaSubsampling();
              this.codec = builder.getCodec();
              this.codedHeight = builder.getCodedHeight();
              this.codedWidth = builder.getCodedWidth();
              this.colorRange = builder.getColorRange();
              this.displayTitle = builder.getDisplayTitle();
              this.extendedDisplayTitle = builder.getExtendedDisplayTitle();
              this.frameRate = builder.getFrameRate();
              this.height = builder.getHeight();
              this.id = builder.getId();
              this.index = builder.getIndex();
              this.language = builder.getLanguage();
              this.languageCode = builder.getLanguageCode();
              this.languageTag = builder.getLanguageTag();
              this.level = builder.getLevel();
              this.profile = builder.getProfile();
              this.refFrames = builder.getRefFrames();
              this.streamType = builder.getStreamType();
              this.width = builder.getWidth();
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

            @com.fasterxml.jackson.annotation.JsonProperty("Stream")
            private java.util.List<
              GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Stream
            > stream;

            @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
            private java.lang.String videoProfile;

            public Builder() {
              super(ValidationType.ALL_OF);
            }

            protected Builder(BaseModel.Builder.ValidationType validationType) {
              super(validationType);
            }

            public GetOnDeckResponse.MediaContainer.Metadata.Media.Part build() {
              String validateMsg = validate();

              if (validateMsg != null) {
                throw new com.plexsdk.exceptions.ApiException(validateMsg);
              }

              return buildWithoutValidation();
            }

            public GetOnDeckResponse.MediaContainer.Metadata.Media.Part buildWithoutValidation() {
              return new GetOnDeckResponse.MediaContainer.Metadata.Media.Part(this);
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

          @com.fasterxml.jackson.annotation.JsonProperty("Stream")
          private final java.util.List<
            GetOnDeckResponse.MediaContainer.Metadata.Media.Part.Stream
          > stream;

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
            this.stream = builder.getStream();
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
          private java.util.List<GetOnDeckResponse.MediaContainer.Metadata.Media.Part> part;

          @com.fasterxml.jackson.annotation.JsonProperty("videoCodec")
          private java.lang.String videoCodec;

          @com.fasterxml.jackson.annotation.JsonProperty("videoFrameRate")
          private java.lang.String videoFrameRate;

          @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
          private java.lang.String videoProfile;

          @com.fasterxml.jackson.annotation.JsonProperty("videoResolution")
          private java.lang.String videoResolution;

          @com.fasterxml.jackson.annotation.JsonProperty("width")
          private java.lang.Double width;

          public Builder() {
            super(ValidationType.ALL_OF);
          }

          protected Builder(BaseModel.Builder.ValidationType validationType) {
            super(validationType);
          }

          public GetOnDeckResponse.MediaContainer.Metadata.Media build() {
            String validateMsg = validate();

            if (validateMsg != null) {
              throw new com.plexsdk.exceptions.ApiException(validateMsg);
            }

            return buildWithoutValidation();
          }

          public GetOnDeckResponse.MediaContainer.Metadata.Media buildWithoutValidation() {
            return new GetOnDeckResponse.MediaContainer.Metadata.Media(this);
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
        private final java.util.List<GetOnDeckResponse.MediaContainer.Metadata.Media.Part> part;

        @com.fasterxml.jackson.annotation.JsonProperty("videoCodec")
        private final java.lang.String videoCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("videoFrameRate")
        private final java.lang.String videoFrameRate;

        @com.fasterxml.jackson.annotation.JsonProperty("videoProfile")
        private final java.lang.String videoProfile;

        @com.fasterxml.jackson.annotation.JsonProperty("videoResolution")
        private final java.lang.String videoResolution;

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

        @com.fasterxml.jackson.annotation.JsonProperty("contentRating")
        private java.lang.String contentRating;

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private java.lang.Double duration;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentArt")
        private java.lang.String grandparentArt;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentGuid")
        private java.lang.String grandparentGuid;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentKey")
        private java.lang.String grandparentKey;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentRatingKey")
        private java.lang.Double grandparentRatingKey;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentTheme")
        private java.lang.String grandparentTheme;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentThumb")
        private java.lang.String grandparentThumb;

        @com.fasterxml.jackson.annotation.JsonProperty("grandparentTitle")
        private java.lang.String grandparentTitle;

        @com.fasterxml.jackson.annotation.JsonProperty("Guid")
        private java.util.List<GetOnDeckResponse.MediaContainer.Metadata.Guid> guid;

        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private java.lang.Double index;

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private java.lang.String key;

        @com.fasterxml.jackson.annotation.JsonProperty("lastViewedAt")
        private java.lang.Double lastViewedAt;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionID")
        private java.lang.Double librarySectionId;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionKey")
        private java.lang.String librarySectionKey;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionTitle")
        private java.lang.String librarySectionTitle;

        @com.fasterxml.jackson.annotation.JsonProperty("librarySectionUUID")
        private java.lang.String librarySectionUuid;

        @com.fasterxml.jackson.annotation.JsonProperty("Media")
        private java.util.List<GetOnDeckResponse.MediaContainer.Metadata.Media> media;

        @com.fasterxml.jackson.annotation.JsonProperty("originallyAvailableAt")
        private java.lang.String originallyAvailableAt;

        @com.fasterxml.jackson.annotation.JsonProperty("parentGuid")
        private java.lang.String parentGuid;

        @com.fasterxml.jackson.annotation.JsonProperty("parentIndex")
        private java.lang.Double parentIndex;

        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private java.lang.String parentKey;

        @com.fasterxml.jackson.annotation.JsonProperty("parentRatingKey")
        private java.lang.Double parentRatingKey;

        @com.fasterxml.jackson.annotation.JsonProperty("parentThumb")
        private java.lang.String parentThumb;

        @com.fasterxml.jackson.annotation.JsonProperty("parentTitle")
        private java.lang.String parentTitle;

        @com.fasterxml.jackson.annotation.JsonProperty("ratingKey")
        private java.lang.Double ratingKey;

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private java.lang.String summary;

        @com.fasterxml.jackson.annotation.JsonProperty("thumb")
        private java.lang.String thumb;

        @com.fasterxml.jackson.annotation.JsonProperty("title")
        private java.lang.String title;

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private java.lang.String type;

        @com.fasterxml.jackson.annotation.JsonProperty("updatedAt")
        private java.lang.Double updatedAt;

        @com.fasterxml.jackson.annotation.JsonProperty("year")
        private java.lang.Double year;

        public Builder() {
          super(ValidationType.ALL_OF);
        }

        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }

        public GetOnDeckResponse.MediaContainer.Metadata build() {
          String validateMsg = validate();

          if (validateMsg != null) {
            throw new com.plexsdk.exceptions.ApiException(validateMsg);
          }

          return buildWithoutValidation();
        }

        public GetOnDeckResponse.MediaContainer.Metadata buildWithoutValidation() {
          return new GetOnDeckResponse.MediaContainer.Metadata(this);
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

      @com.fasterxml.jackson.annotation.JsonProperty("contentRating")
      private final java.lang.String contentRating;

      @com.fasterxml.jackson.annotation.JsonProperty("duration")
      private final java.lang.Double duration;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentArt")
      private final java.lang.String grandparentArt;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentGuid")
      private final java.lang.String grandparentGuid;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentKey")
      private final java.lang.String grandparentKey;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentRatingKey")
      private final java.lang.Double grandparentRatingKey;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentTheme")
      private final java.lang.String grandparentTheme;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentThumb")
      private final java.lang.String grandparentThumb;

      @com.fasterxml.jackson.annotation.JsonProperty("grandparentTitle")
      private final java.lang.String grandparentTitle;

      @com.fasterxml.jackson.annotation.JsonProperty("Guid")
      private final java.util.List<GetOnDeckResponse.MediaContainer.Metadata.Guid> guid;

      @com.fasterxml.jackson.annotation.JsonProperty("index")
      private final java.lang.Double index;

      @com.fasterxml.jackson.annotation.JsonProperty("key")
      private final java.lang.String key;

      @com.fasterxml.jackson.annotation.JsonProperty("lastViewedAt")
      private final java.lang.Double lastViewedAt;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionID")
      private final java.lang.Double librarySectionId;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionKey")
      private final java.lang.String librarySectionKey;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionTitle")
      private final java.lang.String librarySectionTitle;

      @com.fasterxml.jackson.annotation.JsonProperty("librarySectionUUID")
      private final java.lang.String librarySectionUuid;

      @com.fasterxml.jackson.annotation.JsonProperty("Media")
      private final java.util.List<GetOnDeckResponse.MediaContainer.Metadata.Media> media;

      @com.fasterxml.jackson.annotation.JsonProperty("originallyAvailableAt")
      private final java.lang.String originallyAvailableAt;

      @com.fasterxml.jackson.annotation.JsonProperty("parentGuid")
      private final java.lang.String parentGuid;

      @com.fasterxml.jackson.annotation.JsonProperty("parentIndex")
      private final java.lang.Double parentIndex;

      @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
      private final java.lang.String parentKey;

      @com.fasterxml.jackson.annotation.JsonProperty("parentRatingKey")
      private final java.lang.Double parentRatingKey;

      @com.fasterxml.jackson.annotation.JsonProperty("parentThumb")
      private final java.lang.String parentThumb;

      @com.fasterxml.jackson.annotation.JsonProperty("parentTitle")
      private final java.lang.String parentTitle;

      @com.fasterxml.jackson.annotation.JsonProperty("ratingKey")
      private final java.lang.Double ratingKey;

      @com.fasterxml.jackson.annotation.JsonProperty("summary")
      private final java.lang.String summary;

      @com.fasterxml.jackson.annotation.JsonProperty("thumb")
      private final java.lang.String thumb;

      @com.fasterxml.jackson.annotation.JsonProperty("title")
      private final java.lang.String title;

      @com.fasterxml.jackson.annotation.JsonProperty("type")
      private final java.lang.String type;

      @com.fasterxml.jackson.annotation.JsonProperty("updatedAt")
      private final java.lang.Double updatedAt;

      @com.fasterxml.jackson.annotation.JsonProperty("year")
      private final java.lang.Double year;

      Metadata(Builder builder) {
        super(builder);
        this.addedAt = builder.getAddedAt();
        this.allowSync = builder.getAllowSync();
        this.art = builder.getArt();
        this.contentRating = builder.getContentRating();
        this.duration = builder.getDuration();
        this.grandparentArt = builder.getGrandparentArt();
        this.grandparentGuid = builder.getGrandparentGuid();
        this.grandparentKey = builder.getGrandparentKey();
        this.grandparentRatingKey = builder.getGrandparentRatingKey();
        this.grandparentTheme = builder.getGrandparentTheme();
        this.grandparentThumb = builder.getGrandparentThumb();
        this.grandparentTitle = builder.getGrandparentTitle();
        this.guid = builder.getGuid();
        this.index = builder.getIndex();
        this.key = builder.getKey();
        this.lastViewedAt = builder.getLastViewedAt();
        this.librarySectionId = builder.getLibrarySectionId();
        this.librarySectionKey = builder.getLibrarySectionKey();
        this.librarySectionTitle = builder.getLibrarySectionTitle();
        this.librarySectionUuid = builder.getLibrarySectionUuid();
        this.media = builder.getMedia();
        this.originallyAvailableAt = builder.getOriginallyAvailableAt();
        this.parentGuid = builder.getParentGuid();
        this.parentIndex = builder.getParentIndex();
        this.parentKey = builder.getParentKey();
        this.parentRatingKey = builder.getParentRatingKey();
        this.parentThumb = builder.getParentThumb();
        this.parentTitle = builder.getParentTitle();
        this.ratingKey = builder.getRatingKey();
        this.summary = builder.getSummary();
        this.thumb = builder.getThumb();
        this.title = builder.getTitle();
        this.type = builder.getType();
        this.updatedAt = builder.getUpdatedAt();
        this.year = builder.getYear();
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

      @com.fasterxml.jackson.annotation.JsonProperty("allowSync")
      private java.lang.Boolean allowSync;

      @com.fasterxml.jackson.annotation.JsonProperty("identifier")
      private java.lang.String identifier;

      @com.fasterxml.jackson.annotation.JsonProperty("mediaTagPrefix")
      private java.lang.String mediaTagPrefix;

      @com.fasterxml.jackson.annotation.JsonProperty("mediaTagVersion")
      private java.lang.Double mediaTagVersion;

      @com.fasterxml.jackson.annotation.JsonProperty("Metadata")
      private java.util.List<GetOnDeckResponse.MediaContainer.Metadata> metadata;

      @com.fasterxml.jackson.annotation.JsonProperty("mixedParents")
      private java.lang.Boolean mixedParents;

      @com.fasterxml.jackson.annotation.JsonProperty("size")
      private java.lang.Double size;

      public Builder() {
        super(ValidationType.ALL_OF);
      }

      protected Builder(BaseModel.Builder.ValidationType validationType) {
        super(validationType);
      }

      public GetOnDeckResponse.MediaContainer build() {
        String validateMsg = validate();

        if (validateMsg != null) {
          throw new com.plexsdk.exceptions.ApiException(validateMsg);
        }

        return buildWithoutValidation();
      }

      public GetOnDeckResponse.MediaContainer buildWithoutValidation() {
        return new GetOnDeckResponse.MediaContainer(this);
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

    @com.fasterxml.jackson.annotation.JsonProperty("allowSync")
    private final java.lang.Boolean allowSync;

    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final java.lang.String identifier;

    @com.fasterxml.jackson.annotation.JsonProperty("mediaTagPrefix")
    private final java.lang.String mediaTagPrefix;

    @com.fasterxml.jackson.annotation.JsonProperty("mediaTagVersion")
    private final java.lang.Double mediaTagVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("Metadata")
    private final java.util.List<GetOnDeckResponse.MediaContainer.Metadata> metadata;

    @com.fasterxml.jackson.annotation.JsonProperty("mixedParents")
    private final java.lang.Boolean mixedParents;

    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.lang.Double size;

    MediaContainer(Builder builder) {
      super(builder);
      this.allowSync = builder.getAllowSync();
      this.identifier = builder.getIdentifier();
      this.mediaTagPrefix = builder.getMediaTagPrefix();
      this.mediaTagVersion = builder.getMediaTagVersion();
      this.metadata = builder.getMetadata();
      this.mixedParents = builder.getMixedParents();
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
    private GetOnDeckResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetOnDeckResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.plexsdk.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetOnDeckResponse buildWithoutValidation() {
      return new GetOnDeckResponse(this);
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
  private final GetOnDeckResponse.MediaContainer mediaContainer;

  GetOnDeckResponse(Builder builder) {
    super(builder);
    this.mediaContainer = builder.getMediaContainer();
  }
}
