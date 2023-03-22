package com.site.model;

import com.site.services.RunModeService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Optional;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;

import javax.inject.Inject;
import java.util.List;

@Model(adaptables = Resource.class)
public class AemPracticeModel {

    @OSGiService
    private RunModeService runModeService;

    @ChildResource
    @Optional
    private List<NavigationItem> navigationItems;

    @Inject
    @Optional
    private String imagePath;

    @Inject
    @Optional
    private boolean isBackgroundImage;

    @Inject
    @Optional
    private String title;

    public List<NavigationItem> getNavigationItems() {
        return navigationItems;
    }

    public String getImagePath() {
        return imagePath;
    }

    public boolean isBackgroundImage() {
        return isBackgroundImage;
    }

    public String getTitle() {
        return title;
    }

    public RunModeService getRunModeService() {
        return runModeService;
    }

}
