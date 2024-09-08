# GetTimelineRequest


## Fields

| Field                                             | Type                                              | Required                                          | Description                                       | Example                                           |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------- |
| `ratingKey`                                       | *double*                                          | :heavy_check_mark:                                | The rating key of the media item                  | 23409                                             |
| `key`                                             | *String*                                          | :heavy_check_mark:                                | The key of the media item to get the timeline for | /library/metadata/23409                           |
| `state`                                           | [State](../../models/operations/State.md)         | :heavy_check_mark:                                | The state of the media item                       | playing                                           |
| `hasMDE`                                          | *double*                                          | :heavy_check_mark:                                | Whether the media item has MDE                    | 1                                                 |
| `time`                                            | *double*                                          | :heavy_check_mark:                                | The time of the media item                        | 2000                                              |
| `duration`                                        | *double*                                          | :heavy_check_mark:                                | The duration of the media item                    | 10000                                             |
| `context`                                         | *String*                                          | :heavy_check_mark:                                | The context of the media item                     | home:hub.continueWatching                         |
| `playQueueItemID`                                 | *double*                                          | :heavy_check_mark:                                | The play queue item ID of the media item          | 1                                                 |
| `playBackTime`                                    | *double*                                          | :heavy_check_mark:                                | The playback time of the media item               | 2000                                              |
| `row`                                             | *double*                                          | :heavy_check_mark:                                | The row of the media item                         | 1                                                 |