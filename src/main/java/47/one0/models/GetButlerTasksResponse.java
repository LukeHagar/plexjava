package 47.one0.models;

@lombok.Getter
@lombok.EqualsAndHashCode(callSuper = false)
@lombok.ToString
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetButlerTasksResponse.Builder.class)
public class GetButlerTasksResponse extends 47.one0.models.BaseModel {
    @lombok.Getter
    @lombok.EqualsAndHashCode(callSuper = false)
    @lombok.ToString
    @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetButlerTasksResponse.ButlerTasks.Builder.class)
    public static class ButlerTasks extends 47.one0.models.BaseModel {
          @lombok.Getter
          @lombok.EqualsAndHashCode(callSuper = false)
          @lombok.ToString
          @com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
          @com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetButlerTasksResponse.ButlerTasks.ButlerTask.Builder.class)
          public static class ButlerTask extends 47.one0.models.BaseModel {
          
          
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
          
              @com.fasterxml.jackson.annotation.JsonProperty("description") private java.lang.String description;
              @com.fasterxml.jackson.annotation.JsonProperty("enabled") private java.lang.Boolean enabled;
              @com.fasterxml.jackson.annotation.JsonProperty("interval") private java.lang.Double interval;
              @com.fasterxml.jackson.annotation.JsonProperty("name") private java.lang.String name;
              @com.fasterxml.jackson.annotation.JsonProperty("scheduleRandomized") private java.lang.Boolean scheduleRandomized;
              @com.fasterxml.jackson.annotation.JsonProperty("title") private java.lang.String title;
          
              public Builder() {
                super(ValidationType.ALL_OF);
              }
          
              protected Builder(BaseModel.Builder.ValidationType validationType) {
                super(validationType);
              }
          
              public GetButlerTasksResponse.ButlerTasks.ButlerTask build() {
                String validateMsg = validate();
          
                if (validateMsg != null) {
                  throw new 47.one0.exceptions.ApiException(validateMsg);
                }
          
                return buildWithoutValidation();
              }
          
              public GetButlerTasksResponse.ButlerTasks.ButlerTask buildWithoutValidation() {
                return new GetButlerTasksResponse.ButlerTasks.ButlerTask(this);
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
          
            @com.fasterxml.jackson.annotation.JsonProperty("description") private final java.lang.String description;
            @com.fasterxml.jackson.annotation.JsonProperty("enabled") private final java.lang.Boolean enabled;
            @com.fasterxml.jackson.annotation.JsonProperty("interval") private final java.lang.Double interval;
            @com.fasterxml.jackson.annotation.JsonProperty("name") private final java.lang.String name;
            @com.fasterxml.jackson.annotation.JsonProperty("scheduleRandomized") private final java.lang.Boolean scheduleRandomized;
            @com.fasterxml.jackson.annotation.JsonProperty("title") private final java.lang.String title;
          
            ButlerTask(Builder builder) {
              super(builder);
          
              this.description = builder.getDescription();
              this.enabled = builder.getEnabled();
              this.interval = builder.getInterval();
              this.name = builder.getName();
              this.scheduleRandomized = builder.getScheduleRandomized();
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
    
        @com.fasterxml.jackson.annotation.JsonProperty("ButlerTask") private java.util.List<GetButlerTasksResponse.ButlerTasks.ButlerTask> butlerTask;
    
        public Builder() {
          super(ValidationType.ALL_OF);
        }
    
        protected Builder(BaseModel.Builder.ValidationType validationType) {
          super(validationType);
        }
    
        public GetButlerTasksResponse.ButlerTasks build() {
          String validateMsg = validate();
    
          if (validateMsg != null) {
            throw new 47.one0.exceptions.ApiException(validateMsg);
          }
    
          return buildWithoutValidation();
        }
    
        public GetButlerTasksResponse.ButlerTasks buildWithoutValidation() {
          return new GetButlerTasksResponse.ButlerTasks(this);
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
    
      @com.fasterxml.jackson.annotation.JsonProperty("ButlerTask") private final java.util.List<GetButlerTasksResponse.ButlerTasks.ButlerTask> butlerTask;
    
      ButlerTasks(Builder builder) {
        super(builder);
    
        this.butlerTask = builder.getButlerTask();
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

    @com.fasterxml.jackson.annotation.JsonProperty("ButlerTasks") private GetButlerTasksResponse.ButlerTasks butlerTasks;

    public Builder() {
      super(ValidationType.ALL_OF);
    }

    protected Builder(BaseModel.Builder.ValidationType validationType) {
      super(validationType);
    }

    public GetButlerTasksResponse build() {
      String validateMsg = validate();

      if (validateMsg != null) {
        throw new 47.one0.exceptions.ApiException(validateMsg);
      }

      return buildWithoutValidation();
    }

    public GetButlerTasksResponse buildWithoutValidation() {
      return new GetButlerTasksResponse(this);
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

  @com.fasterxml.jackson.annotation.JsonProperty("ButlerTasks") private final GetButlerTasksResponse.ButlerTasks butlerTasks;

  GetButlerTasksResponse(Builder builder) {
    super(builder);

    this.butlerTasks = builder.getButlerTasks();
  }
}
