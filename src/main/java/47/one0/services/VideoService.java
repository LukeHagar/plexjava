package 47.one0.services;

import java.util.Map;
import java.io.IOException;
import 47.one0.exceptions.ApiException;
import 47.one0.models.BaseModel;
import java.util.List;
import java.util.Objects;
import 47.one0.http.*;
import okhttp3.Headers;
import 47.one0.http.util.HttpUrl;
import 47.one0.http.util.HttpHeaders;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
public class VideoService extends BaseService implements VideoClient {
public VideoService(OkHttpClient httpClient, String serverUrl)  { super(httpClient, serverUrl); }
  /**
   * @summary Start Universal Transcode 
   * @param {Number} hasMDE - Whether the media item has MDE
   * @param {String} path - The path to the media item to transcode
   * @param {Number} mediaIndex - The index of the media item to transcode
   * @param {Number} partIndex - The index of the part to transcode
   * @param {String} protocol - The protocol to use for the transcode session
   * @param {Number} [fastSeek] - Whether to use fast seek or not
   * @param {Number} [directPlay] - Whether to use direct play or not
   * @param {Number} [directStream] - Whether to use direct stream or not
   * @param {Number} [subtitleSize] - The size of the subtitles
   * @param {String} [subtites] - The subtitles
   * @param {Number} [audioBoost] - The audio boost
   * @param {String} [location] - The location of the transcode session
   * @param {Number} [mediaBufferSize] - The size of the media buffer
   * @param {String} [session] - The session ID
   * @param {Number} [addDebugOverlay] - Whether to add a debug overlay or not
   * @param {Number} [autoAdjustQuality] - Whether to auto adjust quality or not
   */
  public ResponseWithHeaders<String> startUniversalTranscode(Float hasMDE, String path, Float mediaIndex, Float partIndex, String protocol, Float fastSeek, Float directPlay, Float directStream, Float subtitleSize, String subtites, Float audioBoost, String location, Float mediaBufferSize, String session, Float addDebugOverlay, Float autoAdjustQuality) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter("video")
.addPathParameter(":")
.addPathParameter("transcode")
.addPathParameter("universal")
.addPathParameter("start.mpd")
.addRequiredQueryParameter("hasMDE", hasMDE)
.addRequiredQueryParameter("path", path)
.addRequiredQueryParameter("mediaIndex", mediaIndex)
.addRequiredQueryParameter("partIndex", partIndex)
.addRequiredQueryParameter("protocol", protocol)
.addOptionalQueryParameter("fastSeek", fastSeek)
.addOptionalQueryParameter("directPlay", directPlay)
.addOptionalQueryParameter("directStream", directStream)
.addOptionalQueryParameter("subtitleSize", subtitleSize)
.addOptionalQueryParameter("subtites", subtites)
.addOptionalQueryParameter("audioBoost", audioBoost)
.addOptionalQueryParameter("location", location)
.addOptionalQueryParameter("mediaBufferSize", mediaBufferSize)
.addOptionalQueryParameter("session", session)
.addOptionalQueryParameter("addDebugOverlay", addDebugOverlay)
.addOptionalQueryParameter("autoAdjustQuality", autoAdjustQuality)
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(response.body().string(), response.headers());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
  /**
   * @summary Get the timeline for a media item 
   * @param {Number} ratingKey - The rating key of the media item
   * @param {String} key - The key of the media item to get the timeline for
   * @param {String} state - The state of the media item
   * @param {Number} hasMDE - Whether the media item has MDE
   * @param {Number} time - The time of the media item
   * @param {Number} duration - The duration of the media item
   * @param {String} context - The context of the media item
   * @param {Number} playQueueItemID - The play queue item ID of the media item
   * @param {Number} playBackTime - The playback time of the media item
   * @param {Number} row - The row of the media item
   */
  public ResponseWithHeaders<String> getTimeline(Float ratingKey, String key, String state, Float hasMDE, Float time, Float duration, String context, Float playQueueItemID, Float playBackTime, Float row) throws ApiException
{
String url = HttpUrl.builder(this.serverUrl)
.addPathParameter(":")
.addPathParameter("timeline")
.addRequiredQueryParameter("ratingKey", ratingKey)
.addRequiredQueryParameter("key", key)
.addRequiredQueryParameter("state", state)
.addRequiredQueryParameter("hasMDE", hasMDE)
.addRequiredQueryParameter("time", time)
.addRequiredQueryParameter("duration", duration)
.addRequiredQueryParameter("context", context)
.addRequiredQueryParameter("playQueueItemID", playQueueItemID)
.addRequiredQueryParameter("playBackTime", playBackTime)
.addRequiredQueryParameter("row", row)
.build();
Request request = new Request.Builder().url(url)
.get()
.build();
Response response = this.execute(request);

    try {
      return new ResponseWithHeaders<java.lang.String>(response.body().string(), response.headers());
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
}
}