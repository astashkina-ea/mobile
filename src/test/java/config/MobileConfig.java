package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${device}.properties"
})

public interface MobileConfig extends Config {
    @Key("appBs")
    @DefaultValue("bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c")
    String getAppBs();

    @Key("deviceName")
    @DefaultValue("Google Pixel 7 Pro")
    String getDeviceName();

    @Key("platformVersion")
    @DefaultValue("13.0")
    String getPlatformVersion();
}