package com.site.model;

import com.site.services.RunModeService;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class AemPracticeModel {

    @OSGiService
    private RunModeService runModeService;

    @ChildResource
    private List<NavigationItem> navigationItems;

    @ValueMapValue
    private String imagePath;

    @ValueMapValue
    @Default(booleanValues = {false})
    private boolean isBackgroundImage;

    @ValueMapValue
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
