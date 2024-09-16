# UpdatePlaylistUnauthorized

Unauthorized - Returned if the X-Plex-Token is missing from the header or query.


## Fields

| Field                                                                                                                         | Type                                                                                                                          | Required                                                                                                                      | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| `errors`                                                                                                                      | List<[UpdatePlaylistPlaylistsErrors](../../models/errors/UpdatePlaylistPlaylistsErrors.md)>                                   | :heavy_minus_sign:                                                                                                            | N/A                                                                                                                           |
| `rawResponse`                                                                                                                 | [HttpResponse<InputStream>](https://docs.oracle.com/en/java/javase/11/docs/api/java.net.http/java/net/http/HttpResponse.html) | :heavy_minus_sign:                                                                                                            | Raw HTTP response; suitable for custom response parsing                                                                       |