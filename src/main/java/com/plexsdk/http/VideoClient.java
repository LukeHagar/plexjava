package com.plexsdk.http;

import com.plexsdk.exceptions.ApiException;
import java.util.List;

public interface VideoClient {
  ResponseWithHeaders<String> startUniversalTranscode(
    Float hasMDE,
    String path,
    Float mediaIndex,
    Float partIndex,
    String protocol,
    Float fastSeek,
    Float directPlay,
    Float directStream,
    Float subtitleSize,
    String subtites,
    Float audioBoost,
    String location,
    Float mediaBufferSize,
    String session,
    Float addDebugOverlay,
    Float autoAdjustQuality
  ) throws ApiException;
  ResponseWithHeaders<String> getTimeline(
    Float ratingKey,
    String key,
    String state,
    Float hasMDE,
    Float time,
    Float duration,
    String context,
    Float playQueueItemID,
    Float playBackTime,
    Float row
  ) throws ApiException;
}
