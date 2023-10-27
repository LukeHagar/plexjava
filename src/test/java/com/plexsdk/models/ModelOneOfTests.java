package com.plexsdk.models;

import java.util.Set;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.ArrayUtils;

public class ModelOneOfTests {

  @Test
  void testWithEmptyObject() {
    BaseModel.Builder builder = new BaseModel.Builder(BaseModel.Builder.ValidationType.ONE_OF) {
      @Override
      protected Set<String> getNonNullInstanceFieldNames() {
        return ArrayUtils.arrayToSet(new java.lang.String[] {});
      }

      @Override
      protected Set<Set<String>> getRequiredFieldsGroups() {
        return ArrayUtils.arraysToSets(
          new java.lang.String[][] { new java.lang.String[] { "foo", "bar", "baz" } }
        );
      }
    };

    Assert.assertEquals("Object fails OneOf validation.", builder.validate());
  }

  @Test
  void testWithEmptyObjectWithNoRequiredFields() {
    BaseModel.Builder builder = new BaseModel.Builder(BaseModel.Builder.ValidationType.ONE_OF) {
      @Override
      protected Set<String> getNonNullInstanceFieldNames() {
        return ArrayUtils.arrayToSet(new java.lang.String[] {});
      }

      @Override
      protected Set<Set<String>> getRequiredFieldsGroups() {
        return ArrayUtils.arraysToSets(new java.lang.String[][] { new java.lang.String[] {} });
      }
    };

    Assert.assertNull(builder.validate());
  }

  @Test
  void testWithNoRequiredFields() {
    BaseModel.Builder builder = new BaseModel.Builder(BaseModel.Builder.ValidationType.ONE_OF) {
      @Override
      protected Set<String> getNonNullInstanceFieldNames() {
        return ArrayUtils.arrayToSet(new java.lang.String[] { "foo", "bar", "baz" });
      }

      @Override
      protected Set<Set<String>> getRequiredFieldsGroups() {
        return ArrayUtils.arraysToSets(new java.lang.String[][] {});
      }
    };

    Assert.assertNull(builder.validate());
  }

  @Test
  void testWithRequiredFieldsMatching() {
    BaseModel.Builder builder = new BaseModel.Builder(BaseModel.Builder.ValidationType.ONE_OF) {
      @Override
      protected Set<String> getNonNullInstanceFieldNames() {
        return ArrayUtils.arrayToSet(new java.lang.String[] { "foo", "bar", "baz" });
      }

      @Override
      protected Set<Set<String>> getRequiredFieldsGroups() {
        return ArrayUtils.arraysToSets(
          new java.lang.String[][] {
            new String[] { "fizz", "buzz" },
            new String[] { "foo", "bar", "baz" },
            new String[] { "fish" },
          }
        );
      }
    };

    Assert.assertNull(builder.validate());
  }

  @Test
  void testWithRequiredFieldsNotMatching() {
    BaseModel.Builder builder = new BaseModel.Builder(BaseModel.Builder.ValidationType.ONE_OF) {
      @Override
      protected Set<String> getNonNullInstanceFieldNames() {
        return ArrayUtils.arrayToSet(new java.lang.String[] { "alpha", "bravo", "charlie" });
      }

      @Override
      protected Set<Set<String>> getRequiredFieldsGroups() {
        return ArrayUtils.arraysToSets(
          new java.lang.String[][] {
            new String[] { "fizz", "buzz" },
            new String[] { "foo", "bar", "baz" },
            new String[] { "fish" },
          }
        );
      }
    };

    Assert.assertEquals("Object fails OneOf validation.", builder.validate());
  }

  @Test
  void testWithRequiredFieldsPartiallyMatching() {
    BaseModel.Builder builder = new BaseModel.Builder(BaseModel.Builder.ValidationType.ONE_OF) {
      @Override
      protected Set<String> getNonNullInstanceFieldNames() {
        return ArrayUtils.arrayToSet(new java.lang.String[] { "foo", "bar", "charlie" });
      }

      @Override
      protected Set<Set<String>> getRequiredFieldsGroups() {
        return ArrayUtils.arraysToSets(
          new java.lang.String[][] {
            new String[] { "fizz", "buzz" },
            new String[] { "foo", "bar", "baz" },
            new String[] { "fish" },
          }
        );
      }
    };

    Assert.assertEquals("Object fails OneOf validation.", builder.validate());
  }
}
