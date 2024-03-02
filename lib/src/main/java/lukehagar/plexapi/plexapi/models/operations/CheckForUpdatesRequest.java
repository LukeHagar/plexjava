/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package lukehagar.plexapi.plexapi.models.operations;

import lukehagar.plexapi.plexapi.utils.SpeakeasyMetadata;


public class CheckForUpdatesRequest {
    /**
     * Indicate that you want to start download any updates found.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=download")
    public Download download;

    public CheckForUpdatesRequest withDownload(Download download) {
        this.download = download;
        return this;
    }
    
    public CheckForUpdatesRequest(){}
}