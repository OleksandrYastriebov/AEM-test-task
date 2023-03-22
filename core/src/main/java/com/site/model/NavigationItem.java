package com.site.model;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

@Model(adaptables = Resource.class)
public class NavigationItem {

    private static final String NAV_TITLE_PREFIX = "TEST_";

    @Inject
    private String navigationTitle;

    @Inject
    private String pagePath;

    @PostConstruct
    protected void init() {
        if (StringUtils.isNotEmpty(navigationTitle)) {
            navigationTitle = NAV_TITLE_PREFIX + navigationTitle;
        }
    }

    public String getNavigationTitle() {
        return navigationTitle;
    }

    public String getPagePath() {
        return pagePath;
    }

}
