package com.plexsdk;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Environment {
  DEFAULT("{protocol}://{ip}:{port}");

  private final String url;

  public String getUrl() {
    return this.url;
  }
}
