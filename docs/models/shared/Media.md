# Media

`Media` represents an one or more media files (parts) and is a child of a metadata item. There aren't necessarily any guaranteed attributes on media elements since the attributes will vary based on the type. The possible attributes are not documented here, but they typically have self-evident names. High-level media information that can be used for badging and flagging, such as `videoResolution` and codecs, is included on the media element.



## Fields

| Field                                      | Type                                       | Required                                   | Description                                | Example                                    |
| ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ | ------------------------------------------ |
| `aspectRatio`                              | *Optional\<Float>*                         | :heavy_minus_sign:                         | N/A                                        | 2.35                                       |
| `audioChannels`                            | *Optional\<Integer>*                       | :heavy_minus_sign:                         | N/A                                        | 2                                          |
| `audioCodec`                               | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | aac                                        |
| `audioProfile`                             | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | lc                                         |
| `bitrate`                                  | *Optional\<Integer>*                       | :heavy_minus_sign:                         | N/A                                        | 5612                                       |
| `container`                                | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | mov                                        |
| `duration`                                 | *Optional\<Integer>*                       | :heavy_minus_sign:                         | N/A                                        | 150192                                     |
| `has64bitOffsets`                          | *Optional\<Boolean>*                       | :heavy_minus_sign:                         | N/A                                        | false                                      |
| `hasVoiceActivity`                         | *Optional\<Boolean>*                       | :heavy_minus_sign:                         | N/A                                        | true                                       |
| `height`                                   | *Optional\<Integer>*                       | :heavy_minus_sign:                         | N/A                                        | 544                                        |
| `id`                                       | *long*                                     | :heavy_check_mark:                         | N/A                                        | 1                                          |
| `optimizedForStreaming`                    | *Optional\<Boolean>*                       | :heavy_minus_sign:                         | N/A                                        | false                                      |
| `part`                                     | List\<[Part](../../models/shared/Part.md)> | :heavy_minus_sign:                         | N/A                                        |                                            |
| `videoCodec`                               | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | h264                                       |
| `videoFrameRate`                           | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | 24p                                        |
| `videoProfile`                             | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | main                                       |
| `videoResolution`                          | *Optional\<String>*                        | :heavy_minus_sign:                         | N/A                                        | 720                                        |
| `width`                                    | *Optional\<Integer>*                       | :heavy_minus_sign:                         | N/A                                        | 1280                                       |
| `additionalProperties`                     | Map\<String, *Object*>                     | :heavy_minus_sign:                         | N/A                                        |                                            |