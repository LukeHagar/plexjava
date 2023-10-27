package 47.one0.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SecurityType {
    DELEGATION("delegation");

  public final String label;
}
