# TranscodeSession


## Fields

| Field                         | Type                          | Required                      | Description                   | Example                       |
| ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- | ----------------------------- |
| `key`                         | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | vv3i2q2lax92qlzul1hbd4bx      |
| `throttled`                   | *Optional<? extends Boolean>* | :heavy_minus_sign:            | N/A                           | false                         |
| `complete`                    | *Optional<? extends Boolean>* | :heavy_minus_sign:            | N/A                           | false                         |
| `progress`                    | *Optional<? extends Double>*  | :heavy_minus_sign:            | N/A                           | 1.7999999523162842            |
| `size`                        | *Optional<? extends Integer>* | :heavy_minus_sign:            | N/A                           | -22                           |
| `speed`                       | *Optional<? extends Double>*  | :heavy_minus_sign:            | N/A                           | 25.100000381469727            |
| `error`                       | *Optional<? extends Boolean>* | :heavy_minus_sign:            | N/A                           | false                         |
| `duration`                    | *Optional<? extends Integer>* | :heavy_minus_sign:            | N/A                           | 1445695                       |
| `remaining`                   | *Optional<? extends Integer>* | :heavy_minus_sign:            | N/A                           | 53                            |
| `context`                     | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | streaming                     |
| `sourceVideoCodec`            | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | h264                          |
| `sourceAudioCodec`            | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | aac                           |
| `videoDecision`               | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | transcode                     |
| `audioDecision`               | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | transcode                     |
| `subtitleDecision`            | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | burn                          |
| `protocol`                    | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | http                          |
| `container`                   | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | mkv                           |
| `videoCodec`                  | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | h264                          |
| `audioCodec`                  | *Optional<? extends String>*  | :heavy_minus_sign:            | N/A                           | opus                          |
| `audioChannels`               | *Optional<? extends Integer>* | :heavy_minus_sign:            | N/A                           | 1                             |
| `transcodeHwRequested`        | *Optional<? extends Boolean>* | :heavy_minus_sign:            | N/A                           | true                          |
| `timeStamp`                   | *Optional<? extends Double>*  | :heavy_minus_sign:            | N/A                           | 1.7058958054919229e+09        |
| `maxOffsetAvailable`          | *Optional<? extends Double>*  | :heavy_minus_sign:            | N/A                           | 29.53                         |
| `minOffsetAvailable`          | *Optional<? extends Double>*  | :heavy_minus_sign:            | N/A                           | 3.003000020980835             |