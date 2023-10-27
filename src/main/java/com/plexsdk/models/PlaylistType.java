package com.plexsdk.models;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum PlaylistType {
  AUDIO("audio"),
  VIDEO("video"),
  PHOTO("photo");

  public final String label;
}
