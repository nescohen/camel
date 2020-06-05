
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.google.api.services.drive.Drive$Children
 */
@UriParams
public final class DriveChildrenEndpointConfiguration extends GoogleDriveConfiguration {

    @UriParam
    private String childId;

    @UriParam
    private com.google.api.services.drive.model.ChildReference content;

    @UriParam
    private String folderId;

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public com.google.api.services.drive.model.ChildReference getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.ChildReference content) {
        this.content = content;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}
