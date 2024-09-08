# PastSubscription


## Fields

| Field                                                                           | Type                                                                            | Required                                                                        | Description                                                                     | Example                                                                         |
| ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- | ------------------------------------------------------------------------------- |
| `id`                                                                            | *Optional<String>*                                                              | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |
| `mode`                                                                          | *Optional<String>*                                                              | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |
| `renewsAt`                                                                      | *Optional<Integer>*                                                             | :heavy_check_mark:                                                              | N/A                                                                             | 1556281940                                                                      |
| `endsAt`                                                                        | *Optional<Integer>*                                                             | :heavy_check_mark:                                                              | N/A                                                                             | 1556281940                                                                      |
| `canceled`                                                                      | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `gracePeriod`                                                                   | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `onHold`                                                                        | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `canReactivate`                                                                 | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `canUpgrade`                                                                    | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `canDowngrade`                                                                  | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `canConvert`                                                                    | *Optional<Boolean>*                                                             | :heavy_minus_sign:                                                              | N/A                                                                             | false                                                                           |
| `type`                                                                          | *String*                                                                        | :heavy_check_mark:                                                              | N/A                                                                             | plexpass                                                                        |
| `transfer`                                                                      | *Optional<String>*                                                              | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |
| `state`                                                                         | [PostUsersSignInDataState](../../models/operations/PostUsersSignInDataState.md) | :heavy_check_mark:                                                              | N/A                                                                             | ended                                                                           |
| `billing`                                                                       | [Billing](../../models/operations/Billing.md)                                   | :heavy_check_mark:                                                              | N/A                                                                             |                                                                                 |