# GetSessionsPart


## Fields

| Field                                                                                                                                                                                                                                                                                                                                                                                                  | Type                                                                                                                                                                                                                                                                                                                                                                                                   | Required                                                                                                                                                                                                                                                                                                                                                                                               | Description                                                                                                                                                                                                                                                                                                                                                                                            | Example                                                                                                                                                                                                                                                                                                                                                                                                |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `container`                                                                                                                                                                                                                                                                                                                                                                                            | *String*                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | flac                                                                                                                                                                                                                                                                                                                                                                                                   |
| `duration`                                                                                                                                                                                                                                                                                                                                                                                             | *Integer*                                                                                                                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | 186240                                                                                                                                                                                                                                                                                                                                                                                                 |
| `file`                                                                                                                                                                                                                                                                                                                                                                                                 | *String*                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | /music/Green Day/Saviors (2024)/Green Day - Saviors - 01 - The American Dream Is Killing Me.flac                                                                                                                                                                                                                                                                                                       |
| `hasThumbnail`                                                                                                                                                                                                                                                                                                                                                                                         | *String*                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | 1                                                                                                                                                                                                                                                                                                                                                                                                      |
| `id`                                                                                                                                                                                                                                                                                                                                                                                                   | *String*                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | 130625                                                                                                                                                                                                                                                                                                                                                                                                 |
| `key`                                                                                                                                                                                                                                                                                                                                                                                                  | *String*                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | /library/parts/130625/1705543268/file.flac                                                                                                                                                                                                                                                                                                                                                             |
| `size`                                                                                                                                                                                                                                                                                                                                                                                                 | *Integer*                                                                                                                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | 23644000                                                                                                                                                                                                                                                                                                                                                                                               |
| `decision`                                                                                                                                                                                                                                                                                                                                                                                             | *String*                                                                                                                                                                                                                                                                                                                                                                                               | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | directplay                                                                                                                                                                                                                                                                                                                                                                                             |
| `selected`                                                                                                                                                                                                                                                                                                                                                                                             | *Boolean*                                                                                                                                                                                                                                                                                                                                                                                              | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | true                                                                                                                                                                                                                                                                                                                                                                                                   |
| `stream`                                                                                                                                                                                                                                                                                                                                                                                               | List<[org.openapis.openapi.models.operations.GetSessionsStream](../../models/operations/GetSessionsStream.md)>                                                                                                                                                                                                                                                                                         | :heavy_minus_sign:                                                                                                                                                                                                                                                                                                                                                                                     | N/A                                                                                                                                                                                                                                                                                                                                                                                                    | [{"albumGain":"-12.94","albumPeak":"1.000000","albumRange":"4.751014","audioChannelLayout":"stereo","bitDepth":16,"bitrate":1014,"channels":2,"codec":"flac","displayTitle":"FLAC (Stereo)","extendedDisplayTitle":"FLAC (Stereo)","gain":"-12.94","id":"352487","index":0,"location":"direct","loudness":"-5.94","lra":"1.74","peak":"1.000000","samplingRate":44100,"selected":true,"streamType":2}] |