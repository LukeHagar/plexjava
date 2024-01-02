# StartUniversalTranscodeRequest


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `hasMDE`                                      | *Double*                                      | :heavy_check_mark:                            | Whether the media item has MDE                |
| `path`                                        | *String*                                      | :heavy_check_mark:                            | The path to the media item to transcode       |
| `mediaIndex`                                  | *Double*                                      | :heavy_check_mark:                            | The index of the media item to transcode      |
| `partIndex`                                   | *Double*                                      | :heavy_check_mark:                            | The index of the part to transcode            |
| `protocol`                                    | *String*                                      | :heavy_check_mark:                            | The protocol to use for the transcode session |
| `fastSeek`                                    | *Double*                                      | :heavy_minus_sign:                            | Whether to use fast seek or not               |
| `directPlay`                                  | *Double*                                      | :heavy_minus_sign:                            | Whether to use direct play or not             |
| `directStream`                                | *Double*                                      | :heavy_minus_sign:                            | Whether to use direct stream or not           |
| `subtitleSize`                                | *Double*                                      | :heavy_minus_sign:                            | The size of the subtitles                     |
| `subtites`                                    | *String*                                      | :heavy_minus_sign:                            | The subtitles                                 |
| `audioBoost`                                  | *Double*                                      | :heavy_minus_sign:                            | The audio boost                               |
| `location`                                    | *String*                                      | :heavy_minus_sign:                            | The location of the transcode session         |
| `mediaBufferSize`                             | *Double*                                      | :heavy_minus_sign:                            | The size of the media buffer                  |
| `session`                                     | *String*                                      | :heavy_minus_sign:                            | The session ID                                |
| `addDebugOverlay`                             | *Double*                                      | :heavy_minus_sign:                            | Whether to add a debug overlay or not         |
| `autoAdjustQuality`                           | *Double*                                      | :heavy_minus_sign:                            | Whether to auto adjust quality or not         |