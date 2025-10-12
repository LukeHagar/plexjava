# Player

Information about the player being used for playback


## Fields

| Field                                                       | Type                                                        | Required                                                    | Description                                                 |
| ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- | ----------------------------------------------------------- |
| `title`                                                     | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The title of the client                                     |
| `address`                                                   | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The remote address                                          |
| `local`                                                     | *Optional\<Boolean>*                                        | :heavy_minus_sign:                                          | Indicating if the client is playing from the local LAN      |
| `machineIdentifier`                                         | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The identifier of the client                                |
| `model`                                                     | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The model of the client                                     |
| `platform`                                                  | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The platform of the client                                  |
| `platformVersion`                                           | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The platformVersion of the client                           |
| `product`                                                   | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The product name of the client                              |
| `relayed`                                                   | *Optional\<Boolean>*                                        | :heavy_minus_sign:                                          | Indicating if the client is playing over a relay connection |
| `remotePublicAddress`                                       | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The client's public address                                 |
| `secure`                                                    | *Optional\<Boolean>*                                        | :heavy_minus_sign:                                          | Indicating if the client is playing over HTTPS              |
| `state`                                                     | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The client's last reported state                            |
| `userID`                                                    | *Optional\<Long>*                                           | :heavy_minus_sign:                                          | The id of the user                                          |
| `vendor`                                                    | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The vendor of the client                                    |
| `version`                                                   | *Optional\<String>*                                         | :heavy_minus_sign:                                          | The version of the client                                   |