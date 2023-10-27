package 47.one0.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetServerCapabilitiesResponse.Builder.class)
public class GetServerCapabilitiesResponse extends 47.one0.models.BaseModel {
    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetServerCapabilitiesResponse.MediaContainer.Builder.class)
    public static class MediaContainer extends 47.one0.models.BaseModel {
          @lombok.Getter
          @lombok.EqualsAndHashCode(callSuper = false)
          @lombok.ToString
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
          @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetServerCapabilitiesResponse.MediaContainer.Directory.Builder.class)
          public static class Directory extends 47.one0.models.BaseModel {
          
          
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
          
              @com.fasterxml.jackson.annotation.JsonProperty("count") private java.lang.Double count;
              @com.fasterxml.jackson.annotation.JsonProperty("key") private java.lang.String key;
              @com.fasterxml.jackson.annotation.JsonProperty("title") private java.lang.String title;
          
              public Builder() {
                super(ValidationType.ALL_OF);
              }
          
              protected Builder(BaseModel.Builder.ValidationType validationType) {
                super(validationType);
              }
          
              public GetServerCapabilitiesResponse.MediaContainer.Directory build() {
                String validateMsg = validate();
          
                if (validateMsg != null) {
                  throw new 47.one0.exceptions.ApiException(validateMsg);
                }
          
                return buildWithoutValidation();
              }
          
              public GetServerCapabilitiesResponse.MediaContainer.Directory buildWithoutValidation() {
                return new GetServerCapabilitiesResponse.MediaContainer.Directory(this);
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
          
            @com.fasterxml.jackson.annotation.JsonProperty("count") private final java.lang.Double count;
            @com.fasterxml.jackson.annotation.JsonProperty("key") private final java.lang.String key;
            @com.fasterxml.jackson.annotation.JsonProperty("title") private final java.lang.String title;
          
            Directory(Builder builder) {
              super(builder);
          
              this.count = builder.getCount();
              this.key = builder.getKey();
              this.title = builder.getTitle();
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
    
        @com.fasterxml.jackson.annotation.JsonProperty("allowCameraUpload") private java.lang.Boolean allowCameraUpload;
        @com.fasterxml.jackson.annotation.JsonProperty("allowChannelAccess") private java.lang.Boolean allowChannelAccess;
        @com.fasterxml.jackson.annotation.JsonProperty("allowMediaDeletion") private java.lang.Boolean allowMediaDeletion;
        @com.fasterxml.jackson.annotation.JsonProperty("allowSharing") private java.lang.Boolean allowSharing;
        @com.fasterxml.jackson.annotation.JsonProperty("allowSync") private java.lang.Boolean allowSync;
        @com.fasterxml.jackson.annotation.JsonProperty("allowTuners") private java.lang.Boolean allowTuners;
        @com.fasterxml.jackson.annotation.JsonProperty("backgroundProcessing") private java.lang.Boolean backgroundProcessing;
        @com.fasterxml.jackson.annotation.JsonProperty("certificate") private java.lang.Boolean certificate;
        @com.fasterxml.jackson.annotation.JsonProperty("companionProxy") private java.lang.Boolean companionProxy;
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode") private java.lang.String countryCode;
        @com.fasterxml.jackson.annotation.JsonProperty("diagnostics") private java.lang.String diagnostics;
        @com.fasterxml.jackson.annotation.JsonProperty("Directory") private java.util.List<GetServerCapabilitiesResponse.MediaContainer.Directory> directory;
        @com.fasterxml.jackson.annotation.JsonProperty("eventStream") private java.lang.Boolean eventStream;
        @com.fasterxml.jackson.annotation.JsonProperty("friendlyName") private java.lang.String friendlyName;
        @com.fasterxml.jackson.annotation.JsonProperty("hubSearch") private java.lang.Boolean hubSearch;
        @com.fasterxml.jackson.annotation.JsonProperty("itemClusters") private java.lang.Boolean itemClusters;
        @com.fasterxml.jackson.annotation.JsonProperty("livetv") private java.lang.Double livetv;
        @com.fasterxml.jackson.annotation.JsonProperty("machineIdentifier") private java.lang.String machineIdentifier;
        @com.fasterxml.jackson.annotation.JsonProperty("mediaProviders") private java.lang.Boolean mediaProviders;
        @com.fasterxml.jackson.annotation.JsonProperty("multiuser") private java.lang.Boolean multiuser;
        @com.fasterxml.jackson.annotation.JsonProperty("musicAnalysis") private java.lang.Double musicAnalysis;
        @com.fasterxml.jackson.annotation.JsonProperty("myPlex") private java.lang.Boolean myPlex;
        @com.fasterxml.jackson.annotation.JsonProperty("myPlexMappingState") private java.lang.String myPlexMappingState;
        @com.fasterxml.jackson.annotation.JsonProperty("myPlexSigninState") private java.lang.String myPlexSigninState;
        @com.fasterxml.jackson.annotation.JsonProperty("myPlexSubscription") private java.lang.Boolean myPlexSubscription;
        @com.fasterxml.jackson.annotation.JsonProperty("myPlexUsername") private java.lang.String myPlexUsername;
        @com.fasterxml.jackson.annotation.JsonProperty("offlineTranscode") private java.lang.Double offlineTranscode;
        @com.fasterxml.jackson.annotation.JsonProperty("ownerFeatures") private java.lang.String ownerFeatures;
        @com.fasterxml.jackson.annotation.JsonProperty("photoAutoTag") private java.lang.Boolean photoAutoTag;
        @com.fasterxml.jackson.annotation.JsonProperty("platform") private java.lang.String platform;
        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion") private java.lang.String platformVersion;
        @com.fasterxml.jackson.annotation.JsonProperty("pluginHost") private java.lang.Boolean pluginHost;
        @com.fasterxml.jackson.annotation.JsonProperty("pushNotifications") private java.lang.Boolean pushNotifications;
        @com.fasterxml.jackson.annotation.JsonProperty("readOnlyLibraries") private java.lang.Boolean readOnlyLibraries;
        @com.fasterxml.jackson.annotation.JsonProperty("size") private java.lang.Double size;
        @com.fasterxml.jackson.annotation.JsonProperty("streamingBrainABRVersion") private java.lang.Double streamingBrainAbrversion;
        @com.fasterxml.jackson.annotation.JsonProperty("streamingBrainVersion") private java.lang.Double streamingBrainVersion;
        @com.fasterxml.jackson.annotation.JsonProperty("sync") private java.lang.Boolean sync;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderActiveVideoSessions") private java.lang.Double transcoderActiveVideoSessions;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderAudio") private java.lang.Boolean transcoderAudio;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderLyrics") private java.lang.Boolean transcoderLyrics;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderPhoto") private java.lang.Boolean transcoderPhoto;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderSubtitles") private java.lang.Boolean transcoderSubtitles;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideo") private java.lang.Boolean transcoderVideo;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideoBitrates") private java.lang.String transcoderVideoBitrates;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideoQualities") private java.lang.String transcoderVideoQualities;
        @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideoResolutions") private java.lang.String transcoderVideoResolutions;
        @com.fasterxml.jackson.annotation.JsonProperty("updatedAt") private java.lang.Double updatedAt;
        @com.fasterxml.jackson.annotation.JsonProperty("updater") private java.lang.Boolean updater;
        @com.fasterxml.jackson.annotation.JsonProperty("version") private java.lang.String version;
        @com.fasterxml.jackson.annotation.JsonProperty("voiceSearch") private java.lang.Boolean voiceSearch;
    
        public Builder() {
          super(ValidationType.ALL_OF);
        }
    
        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }
    
        public GetServerCapabilitiesResponse.MediaContainer build() {
          String validateMsg = validate();
    
          if (validateMsg != null) {
            throw new 47.one0.exceptions.ApiException(validateMsg);
          }
    
          return buildWithoutValidation();
        }
    
        public GetServerCapabilitiesResponse.MediaContainer buildWithoutValidation() {
          return new GetServerCapabilitiesResponse.MediaContainer(this);
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
    
      @com.fasterxml.jackson.annotation.JsonProperty("allowCameraUpload") private final java.lang.Boolean allowCameraUpload;
      @com.fasterxml.jackson.annotation.JsonProperty("allowChannelAccess") private final java.lang.Boolean allowChannelAccess;
      @com.fasterxml.jackson.annotation.JsonProperty("allowMediaDeletion") private final java.lang.Boolean allowMediaDeletion;
      @com.fasterxml.jackson.annotation.JsonProperty("allowSharing") private final java.lang.Boolean allowSharing;
      @com.fasterxml.jackson.annotation.JsonProperty("allowSync") private final java.lang.Boolean allowSync;
      @com.fasterxml.jackson.annotation.JsonProperty("allowTuners") private final java.lang.Boolean allowTuners;
      @com.fasterxml.jackson.annotation.JsonProperty("backgroundProcessing") private final java.lang.Boolean backgroundProcessing;
      @com.fasterxml.jackson.annotation.JsonProperty("certificate") private final java.lang.Boolean certificate;
      @com.fasterxml.jackson.annotation.JsonProperty("companionProxy") private final java.lang.Boolean companionProxy;
      @com.fasterxml.jackson.annotation.JsonProperty("countryCode") private final java.lang.String countryCode;
      @com.fasterxml.jackson.annotation.JsonProperty("diagnostics") private final java.lang.String diagnostics;
      @com.fasterxml.jackson.annotation.JsonProperty("Directory") private final java.util.List<GetServerCapabilitiesResponse.MediaContainer.Directory> directory;
      @com.fasterxml.jackson.annotation.JsonProperty("eventStream") private final java.lang.Boolean eventStream;
      @com.fasterxml.jackson.annotation.JsonProperty("friendlyName") private final java.lang.String friendlyName;
      @com.fasterxml.jackson.annotation.JsonProperty("hubSearch") private final java.lang.Boolean hubSearch;
      @com.fasterxml.jackson.annotation.JsonProperty("itemClusters") private final java.lang.Boolean itemClusters;
      @com.fasterxml.jackson.annotation.JsonProperty("livetv") private final java.lang.Double livetv;
      @com.fasterxml.jackson.annotation.JsonProperty("machineIdentifier") private final java.lang.String machineIdentifier;
      @com.fasterxml.jackson.annotation.JsonProperty("mediaProviders") private final java.lang.Boolean mediaProviders;
      @com.fasterxml.jackson.annotation.JsonProperty("multiuser") private final java.lang.Boolean multiuser;
      @com.fasterxml.jackson.annotation.JsonProperty("musicAnalysis") private final java.lang.Double musicAnalysis;
      @com.fasterxml.jackson.annotation.JsonProperty("myPlex") private final java.lang.Boolean myPlex;
      @com.fasterxml.jackson.annotation.JsonProperty("myPlexMappingState") private final java.lang.String myPlexMappingState;
      @com.fasterxml.jackson.annotation.JsonProperty("myPlexSigninState") private final java.lang.String myPlexSigninState;
      @com.fasterxml.jackson.annotation.JsonProperty("myPlexSubscription") private final java.lang.Boolean myPlexSubscription;
      @com.fasterxml.jackson.annotation.JsonProperty("myPlexUsername") private final java.lang.String myPlexUsername;
      @com.fasterxml.jackson.annotation.JsonProperty("offlineTranscode") private final java.lang.Double offlineTranscode;
      @com.fasterxml.jackson.annotation.JsonProperty("ownerFeatures") private final java.lang.String ownerFeatures;
      @com.fasterxml.jackson.annotation.JsonProperty("photoAutoTag") private final java.lang.Boolean photoAutoTag;
      @com.fasterxml.jackson.annotation.JsonProperty("platform") private final java.lang.String platform;
      @com.fasterxml.jackson.annotation.JsonProperty("platformVersion") private final java.lang.String platformVersion;
      @com.fasterxml.jackson.annotation.JsonProperty("pluginHost") private final java.lang.Boolean pluginHost;
      @com.fasterxml.jackson.annotation.JsonProperty("pushNotifications") private final java.lang.Boolean pushNotifications;
      @com.fasterxml.jackson.annotation.JsonProperty("readOnlyLibraries") private final java.lang.Boolean readOnlyLibraries;
      @com.fasterxml.jackson.annotation.JsonProperty("size") private final java.lang.Double size;
      @com.fasterxml.jackson.annotation.JsonProperty("streamingBrainABRVersion") private final java.lang.Double streamingBrainAbrversion;
      @com.fasterxml.jackson.annotation.JsonProperty("streamingBrainVersion") private final java.lang.Double streamingBrainVersion;
      @com.fasterxml.jackson.annotation.JsonProperty("sync") private final java.lang.Boolean sync;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderActiveVideoSessions") private final java.lang.Double transcoderActiveVideoSessions;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderAudio") private final java.lang.Boolean transcoderAudio;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderLyrics") private final java.lang.Boolean transcoderLyrics;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderPhoto") private final java.lang.Boolean transcoderPhoto;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderSubtitles") private final java.lang.Boolean transcoderSubtitles;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideo") private final java.lang.Boolean transcoderVideo;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideoBitrates") private final java.lang.String transcoderVideoBitrates;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideoQualities") private final java.lang.String transcoderVideoQualities;
      @com.fasterxml.jackson.annotation.JsonProperty("transcoderVideoResolutions") private final java.lang.String transcoderVideoResolutions;
      @com.fasterxml.jackson.annotation.JsonProperty("updatedAt") private final java.lang.Double updatedAt;
      @com.fasterxml.jackson.annotation.JsonProperty("updater") private final java.lang.Boolean updater;
      @com.fasterxml.jackson.annotation.JsonProperty("version") private final java.lang.String version;
      @com.fasterxml.jackson.annotation.JsonProperty("voiceSearch") private final java.lang.Boolean voiceSearch;
    
      MediaContainer(Builder builder) {
        super(builder);
    
        this.allowCameraUpload = builder.getAllowCameraUpload();
        this.allowChannelAccess = builder.getAllowChannelAccess();
        this.allowMediaDeletion = builder.getAllowMediaDeletion();
        this.allowSharing = builder.getAllowSharing();
        this.allowSync = builder.getAllowSync();
        this.allowTuners = builder.getAllowTuners();
        this.backgroundProcessing = builder.getBackgroundProcessing();
        this.certificate = builder.getCertificate();
        this.companionProxy = builder.getCompanionProxy();
        this.countryCode = builder.getCountryCode();
        this.diagnostics = builder.getDiagnostics();
        this.directory = builder.getDirectory();
        this.eventStream = builder.getEventStream();
        this.friendlyName = builder.getFriendlyName();
        this.hubSearch = builder.getHubSearch();
        this.itemClusters = builder.getItemClusters();
        this.livetv = builder.getLivetv();
        this.machineIdentifier = builder.getMachineIdentifier();
        this.mediaProviders = builder.getMediaProviders();
        this.multiuser = builder.getMultiuser();
        this.musicAnalysis = builder.getMusicAnalysis();
        this.myPlex = builder.getMyPlex();
        this.myPlexMappingState = builder.getMyPlexMappingState();
        this.myPlexSigninState = builder.getMyPlexSigninState();
        this.myPlexSubscription = builder.getMyPlexSubscription();
        this.myPlexUsername = builder.getMyPlexUsername();
        this.offlineTranscode = builder.getOfflineTranscode();
        this.ownerFeatures = builder.getOwnerFeatures();
        this.photoAutoTag = builder.getPhotoAutoTag();
        this.platform = builder.getPlatform();
        this.platformVersion = builder.getPlatformVersion();
        this.pluginHost = builder.getPluginHost();
        this.pushNotifications = builder.getPushNotifications();
        this.readOnlyLibraries = builder.getReadOnlyLibraries();
        this.size = builder.getSize();
        this.streamingBrainAbrversion = builder.getStreamingBrainAbrversion();
        this.streamingBrainVersion = builder.getStreamingBrainVersion();
        this.sync = builder.getSync();
        this.transcoderActiveVideoSessions = builder.getTranscoderActiveVideoSessions();
        this.transcoderAudio = builder.getTranscoderAudio();
        this.transcoderLyrics = builder.getTranscoderLyrics();
        this.transcoderPhoto = builder.getTranscoderPhoto();
        this.transcoderSubtitles = builder.getTranscoderSubtitles();
        this.transcoderVideo = builder.getTranscoderVideo();
        this.transcoderVideoBitrates = builder.getTranscoderVideoBitrates();
        this.transcoderVideoQualities = builder.getTranscoderVideoQualities();
        this.transcoderVideoResolutions = builder.getTranscoderVideoResolutions();
        this.updatedAt = builder.getUpdatedAt();
        this.updater = builder.getUpdater();
        this.version = builder.getVersion();
        this.voiceSearch = builder.getVoiceSearch();
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

    @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer") private GetServerCapabilitiesResponse.MediaContainer mediaContainer;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetServerCapabilitiesResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new 47.one0.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetServerCapabilitiesResponse buildWithoutValidation() {
      return new GetServerCapabilitiesResponse(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("MediaContainer") private final GetServerCapabilitiesResponse.MediaContainer mediaContainer;

  GetServerCapabilitiesResponse(Builder builder) {
    super(builder);

    this.mediaContainer = builder.getMediaContainer();
  }
}
