<!-- Start SDK Example Usage [usage] -->
```java
package hello.world;

import org.openapis.openapi.SDK;
import org.openapis.openapi.models.operations.GetServerCapabilitiesResponse;
import org.openapis.openapi.models.shared.Security;

public class Application {
    public static void main(String[] args) {
        try {
            SDK sdk = SDK.builder()
                .setSecurity(new Security(
                "string"){{
                    accessToken = "<YOUR_API_KEY_HERE>";
                }})
                .build();

            org.openapis.openapi.models.operations.GetServerCapabilitiesResponse res = sdk.server.getServerCapabilities();

            if (res.twoHundredApplicationJsonObject != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage [usage] -->