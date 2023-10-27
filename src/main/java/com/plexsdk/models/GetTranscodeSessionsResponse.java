package com.plexsdk.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(
  com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
  builder = GetTranscodeSessionsResponse.Builder.class
)
public class GetTranscodeSessionsResponse extends com.plexsdk.models.BaseModel {

  @lombok.Getter
  @lombok.EqualsAndHashCode(callSuper = false)
  @lombok.ToString
  @com.fasterxml.jackson.annotation.JsonInclude(
    com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
  )
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GetTranscodeSessionsResponse.MediaContainer.Builder.class
  )
  public static class MediaContainer extends com.plexsdk.models.BaseModel {

    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(
      com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
    )
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(
      builder = GetTranscodeSessionsResponse.MediaContainer.TranscodeSession.Builder.class
    )
    public static class TranscodeSession extends com.plexsdk.models.BaseModel {

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

        @com.fasterxml.jackson.annotation.JsonProperty("audioChannels")
        private java.lang.Double audioChannels;

        @com.fasterxml.jackson.annotation.JsonProperty("audioCodec")
        private java.lang.String audioCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("audioDecision")
        private java.lang.String audioDecision;

        @com.fasterxml.jackson.annotation.JsonProperty("complete")
        private java.lang.Boolean complete;

        @com.fasterxml.jackson.annotation.JsonProperty("container")
        private java.lang.String container;

        @com.fasterxml.jackson.annotation.JsonProperty("context")
        private java.lang.String context;

        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private java.lang.Double duration;

        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private java.lang.Boolean error;

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private java.lang.String key;

        @com.fasterxml.jackson.annotation.JsonProperty("maxOffsetAvailable")
        private java.lang.Double maxOffsetAvailable;

        @com.fasterxml.jackson.annotation.JsonProperty("minOffsetAvailable")
        private java.lang.Double minOffsetAvailable;

        @com.fasterxml.jackson.annotation.JsonProperty("progress")
        private java.lang.Double progress;

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private java.lang.String protocol;

        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private java.lang.Double size;

        @com.fasterxml.jackson.annotation.JsonProperty("sourceAudioCodec")
        private java.lang.String sourceAudioCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("sourceVideoCodec")
        private java.lang.String sourceVideoCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("speed")
        private java.lang.Double speed;

        @com.fasterxml.jackson.annotation.JsonProperty("throttled")
        private java.lang.Boolean throttled;

        @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
        private java.lang.Double timeStamp;

        @com.fasterxml.jackson.annotation.JsonProperty("transcodeHwRequested")
        private java.lang.Boolean transcodeHwRequested;

        @com.fasterxml.jackson.annotation.JsonProperty("videoCodec")
        private java.lang.String videoCodec;

        @com.fasterxml.jackson.annotation.JsonProperty("videoDecision")
        private java.lang.String videoDecision;

        public Builder() {
          super(ValidationType.ALL_OF);
        }

        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }

        public GetTranscodeSessionsResponse.MediaContainer.TranscodeSession build() {
          String validateMsg = validate();

          if (validateMsg != null) {
            throw new com.plexsdk.exceptions.ApiException(validateMsg);
          }

          return buildWithoutValidation();
        }

        public GetTranscodeSessionsResponse.MediaContainer.TranscodeSession buildWithoutValidation() {
          return new GetTranscodeSessionsResponse.MediaContainer.TranscodeSession(this);
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

      @com.fasterxml.jackson.annotation.JsonProperty("audioChannels")
      private final java.lang.Double audioChannels;

      @com.fasterxml.jackson.annotation.JsonProperty("audioCodec")
      private final java.lang.String audioCodec;

      @com.fasterxml.jackson.annotation.JsonProperty("audioDecision")
      private final java.lang.String audioDecision;

      @com.fasterxml.jackson.annotation.JsonProperty("complete")
      private final java.lang.Boolean complete;

      @com.fasterxml.jackson.annotation.JsonProperty("container")
      private final java.lang.String container;

      @com.fasterxml.jackson.annotation.JsonProperty("context")
      private final java.lang.String context;

      @com.fasterxml.jackson.annotation.JsonProperty("duration")
      private final java.lang.Double duration;

      @com.fasterxml.jackson.annotation.JsonProperty("error")
      private final java.lang.Boolean error;

      @com.fasterxml.jackson.annotation.JsonProperty("key")
      private final java.lang.String key;

      @com.fasterxml.jackson.annotation.JsonProperty("maxOffsetAvailable")
      private final java.lang.Double maxOffsetAvailable;

      @com.fasterxml.jackson.annotation.JsonProperty("minOffsetAvailable")
      private final java.lang.Double minOffsetAvailable;

      @com.fasterxml.jackson.annotation.JsonProperty("progress")
      private final java.lang.Double progress;

      @com.fasterxml.jackson.annotation.JsonProperty("protocol")
      private final java.lang.String protocol;

      @com.fasterxml.jackson.annotation.JsonProperty("size")
      private final java.lang.Double size;

      @com.fasterxml.jackson.annotation.JsonProperty("sourceAudioCodec")
      private final java.lang.String sourceAudioCodec;

      @com.fasterxml.jackson.annotation.JsonProperty("sourceVideoCodec")
      private final java.lang.String sourceVideoCodec;

      @com.fasterxml.jackson.annotation.JsonProperty("speed")
      private final java.lang.Double speed;

      @com.fasterxml.jackson.annotation.JsonProperty("throttled")
      private final java.lang.Boolean throttled;

      @com.fasterxml.jackson.annotation.JsonProperty("timeStamp")
      private final java.lang.Double timeStamp;

      @com.fasterxml.jackson.annotation.JsonProperty("transcodeHwRequested")
      private final java.lang.Boolean transcodeHwRequested;

      @com.fasterxml.jackson.annotation.JsonProperty("videoCodec")
      private final java.lang.String videoCodec;

      @com.fasterxml.jackson.annotation.JsonProperty("videoDecision")
      private final java.lang.String videoDecision;

      TranscodeSession(Builder builder) {
        super(builder);
        this.audioChannels = builder.getAudioChannels();
        this.audioCodec = builder.getAudioCodec();
        this.audioDecision = builder.getAudioDecision();
        this.complete = builder.getComplete();
        this.container = builder.getContainer();
        this.context = builder.getContext();
        this.duration = builder.getDuration();
        this.error = builder.getError();
        this.key = builder.getKey();
        this.maxOffsetAvailable = builder.getMaxOffsetAvailable();
        this.minOffsetAvailable = builder.getMinOffsetAvailable();
        this.progress = builder.getProgress();
        this.protocol = builder.getProtocol();
        this.size = builder.getSize();
        this.sourceAudioCodec = builder.getSourceAudioCodec();
        this.sourceVideoCodec = builder.getSourceVideoCodec();
        this.speed = builder.getSpeed();
        this.throttled = builder.getThrottled();
        this.timeStamp = builder.getTimeStamp();
        this.transcodeHwRequested = builder.getTranscodeHwRequested();
        this.videoCodec = builder.getVideoCodec();
        this.videoDecision = builder.getVideoDecision();
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

      @com.fasterxml.jackson.annotation.JsonProperty("size")
      private java.lang.Double size;

      @com.fasterxml.jackson.annotation.JsonProperty("TranscodeSession")
      private java.util.List<
        GetTranscodeSessionsResponse.MediaContainer.TranscodeSession
      > transcodeSession;

      public Builder() {
        super(ValidationType.ALL_OF);
      }

      protected Builder(BaseModel.Builder.ValidationType validationType) {
        super(validationType);
      }

      public GetTranscodeSessionsResponse.MediaContainer build() {
        String validateMsg = validate();

        if (validateMsg != null) {
          throw new com.plexsdk.exceptions.ApiException(validateMsg);
        }

        return buildWithoutValidation();
      }

      public GetTranscodeSessionsResponse.MediaContainer buildWithoutValidation() {
        return new GetTranscodeSessionsResponse.MediaContainer(this);
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

    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.lang.Double size;

    @com.fasterxml.jackson.annotation.JsonProperty("TranscodeSession")
    private final java.util.List<
      GetTranscodeSessionsResponse.MediaContainer.TranscodeSession
    > transcodeSession;

    MediaContainer(Builder builder) {
      super(builder);
      this.size = builder.getSize();
      this.transcodeSession = builder.getTranscodeSession();
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
    private GetTranscodeSessionsResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetTranscodeSessionsResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new com.plexsdk.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetTranscodeSessionsResponse buildWithoutValidation() {
      return new GetTranscodeSessionsResponse(this);
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
  private final GetTranscodeSessionsResponse.MediaContainer mediaContainer;

  GetTranscodeSessionsResponse(Builder builder) {
    super(builder);
    this.mediaContainer = builder.getMediaContainer();
  }
}
