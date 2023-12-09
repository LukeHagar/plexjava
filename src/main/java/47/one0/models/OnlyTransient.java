package 47.one0.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum OnlyTransient {
    V1(1);

  public final Integer label;
}
