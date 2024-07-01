# GetTopWatchedContentRequest


## Fields

| Field                                               | Type                                                | Required                                            | Description                                         | Example                                             |
| --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- | --------------------------------------------------- |
| `type`                                              | *long*                                              | :heavy_check_mark:                                  | the library type (1 - movies, 2 - shows, 3 - music) |                                                     |
| `includeGuids`                                      | *Optional<? extends Long>*                          | :heavy_minus_sign:                                  | Adds the Guids object to the response<br/>          | 1                                                   |