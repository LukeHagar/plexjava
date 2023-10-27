package com.plexsdk.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum MinSize {
  V1(1);

  public final Float label;
}
