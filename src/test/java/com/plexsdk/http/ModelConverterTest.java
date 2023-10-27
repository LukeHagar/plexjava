package com.plexsdk.http;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.plexsdk.helpers.TestModel;
import org.junit.jupiter.api.*;

public class ModelConverterTest {

  @Test
  @DisplayName("Testing ModelConverter.modelToJson()")
  public void testModelToJson() {
    TestModel testModel = new TestModel("testString", 1, true);
    String json = ModelConverter.modelToJson(testModel);
    assertEquals(json, "{\"testString\":\"testString\",\"testInt\":1,\"testBoolean\":true}");
  }

  @Test
  @DisplayName("Testing ModelConverter.jsonToModel()")
  public void testJsonToModel() {
    String json = "{\"testString\":\"testString\",\"testInt\":1,\"testBoolean\":true}";
    TestModel testModel = ModelConverter.convert(json, TestModel.class);
    assertEquals(testModel.testString, "testString");
    assertEquals(testModel.testInt, 1);
    assertTrue(testModel.testBoolean);
  }

  @Test
  @DisplayName("Testing ModelConverter.convert() and ModelConverter.modelToJson() are congruent")
  public void congruency() {
    TestModel testModel = new TestModel("testString", 1, true);
    String json = ModelConverter.modelToJson(testModel);
    TestModel testModel2 = ModelConverter.convert(json, TestModel.class);
    assertEquals(testModel.testString, testModel2.testString);
    assertEquals(testModel.testInt, testModel2.testInt);
    assertTrue(testModel.testBoolean == testModel2.testBoolean);
  }
}
