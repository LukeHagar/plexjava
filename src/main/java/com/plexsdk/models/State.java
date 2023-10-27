package com.plexsdk.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum State {
  PLAYING("playing"),
  PAUSED("paused"),
  STOPPED("stopped");

  public final String label;
}
