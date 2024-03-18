# StartUniversalTranscodeRequest


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `hasMDE`                                      | *double*                                      | :heavy_check_mark:                            | Whether the media item has MDE                |
| `path`                                        | *String*                                      | :heavy_check_mark:                            | The path to the media item to transcode       |
| `mediaIndex`                                  | *double*                                      | :heavy_check_mark:                            | The index of the media item to transcode      |
| `partIndex`                                   | *double*                                      | :heavy_check_mark:                            | The index of the part to transcode            |
| `protocol`                                    | *String*                                      | :heavy_check_mark:                            | The protocol to use for the transcode session |
| `fastSeek`                                    | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | Whether to use fast seek or not               |
| `directPlay`                                  | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | Whether to use direct play or not             |
| `directStream`                                | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | Whether to use direct stream or not           |
| `subtitleSize`                                | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | The size of the subtitles                     |
| `subtites`                                    | *Optional<? extends String>*                  | :heavy_minus_sign:                            | The subtitles                                 |
| `audioBoost`                                  | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | The audio boost                               |
| `location`                                    | *Optional<? extends String>*                  | :heavy_minus_sign:                            | The location of the transcode session         |
| `mediaBufferSize`                             | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | The size of the media buffer                  |
| `session`                                     | *Optional<? extends String>*                  | :heavy_minus_sign:                            | The session ID                                |
| `addDebugOverlay`                             | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | Whether to add a debug overlay or not         |
| `autoAdjustQuality`                           | *Optional<? extends Double>*                  | :heavy_minus_sign:                            | Whether to auto adjust quality or not         |