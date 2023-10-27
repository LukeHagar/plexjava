package 47.one0.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum Level {
    V1(1),
    V2(2),
    V3(3),
    V4(4);

  public final Float label;
}
