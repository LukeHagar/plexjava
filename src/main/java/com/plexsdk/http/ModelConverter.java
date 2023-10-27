package com.plexsdk.http;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import okhttp3.Response;
import okhttp3.ResponseBody;

public final class ModelConverter {

  private static final ObjectMapper mapper = new ObjectMapper();

  static {
    mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    mapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
    mapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    mapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
  }

  private ModelConverter() {}

  public static <T> T convert(final Response response, final Class<T> clazz) {
    final ResponseBody body = response.body();
    try {
      return mapper.readValue(body.string(), clazz);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public static <T> T convert(final String response, final Class<T> clazz) {
    try {
      return mapper.readValue(response, clazz);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }

  public static <T> T convert(Response response, TypeReference<T> typeReference) {
    try {
      return convert(response.body().string(), typeReference);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public static <T> T convert(String response, TypeReference<T> typeReference) {
    try {
      return mapper.readValue(response, typeReference);
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }

  public static String modelToJson(final Object model) {
    try {
      return mapper.writeValueAsString(model);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
