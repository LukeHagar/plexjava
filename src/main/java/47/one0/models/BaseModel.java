package 47.one0.models;

import java.util.Collection;
import java.util.Set;
import java.util.stream.Collectors;
import 47.one0.http.ModelConverter;

public abstract class BaseModel {
  public abstract static class Builder {
    protected static enum ValidationType {
      ALL_OF,
      ANY_OF,
      ONE_OF,
      NONE
    };

    private final ValidationType _validationType;

    protected Builder(ValidationType validationType) {
      this._validationType = validationType;
    }

    protected abstract Set<String> getNonNullInstanceFieldNames();
    protected abstract Set<Set<String>> getRequiredFieldsGroups();

    protected boolean isValidAllOf() {
      // Check if all of the required field groups are a subset of the non-null, non-static fields.
      return getNonNullInstanceFieldNames().containsAll(
          getRequiredFieldsGroups().stream()
              .flatMap(Collection::stream)
              .collect(Collectors.toSet()));
    }

    protected boolean isValidAnyOf() {
      // Check if any of the required field groups are a subset of the non-null, non-static fields.
      return getRequiredFieldsGroups().stream().anyMatch(
          (group) -> getNonNullInstanceFieldNames().containsAll(group));
    }

    protected boolean isValidOneOf() {
      // Check if the set of non-null fields match one of the required field groups.
      return getRequiredFieldsGroups().contains(getNonNullInstanceFieldNames());
    }

    protected String validate() {
      if (getRequiredFieldsGroups().isEmpty()) {
        // Nothing to validate since there are no required fields groups.

        return null;
      }

      switch (this._validationType) {
        case ALL_OF:
          return !isValidAllOf() ? "Object fails AllOf validation." : null;
        case ANY_OF:
          return !isValidAnyOf() ? "Object fails AnyOf validation." : null;
        case ONE_OF:
          return !isValidOneOf() ? "Object fails OneOf validation." : null;
        case NONE:
        default:
          return !isValidOneOf() ? "Object fails required fields validation." : null;
      }
    }
  }

  public BaseModel() {
  }

  protected BaseModel(Builder builder) {
  }

  public String toJson() {
    return ModelConverter.modelToJson(this);
  }
}
