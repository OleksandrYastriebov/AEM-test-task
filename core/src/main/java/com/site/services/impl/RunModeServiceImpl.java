package com.site.services.impl;

import com.site.services.RunModeService;
import org.apache.sling.settings.SlingSettingsService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(service = RunModeService.class)
public class RunModeServiceImpl implements RunModeService {

    private static final String PUBLISH = "publish";
    private static final String AUTHOR = "author";

    @Reference
    private SlingSettingsService slingSettingsService;

    @Override
    public boolean isPublish() {
        return slingSettingsService.getRunModes().contains(PUBLISH);
    }

    @Override
    public boolean isAuthor() {
        return slingSettingsService.getRunModes().contains(AUTHOR);
    }
}
