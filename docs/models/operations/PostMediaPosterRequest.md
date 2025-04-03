# PostMediaPosterRequest


## Fields

| Field                                                              | Type                                                               | Required                                                           | Description                                                        | Example                                                            |
| ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ | ------------------------------------------------------------------ |
| `ratingKey`                                                        | *long*                                                             | :heavy_check_mark:                                                 | the id of the library item to return the posters of.               | 2268                                                               |
| `url`                                                              | *Optional\<String>*                                                | :heavy_minus_sign:                                                 | The URL of the image, if uploading a remote image                  | https://api.mediux.pro/assets/fcfdc487-dd07-4993-a0c1-0a3015362e5b |
| `requestBody`                                                      | *Optional\<byte[]>*                                                | :heavy_minus_sign:                                                 | The contents of the image, if uploading a local file               |                                                                    |