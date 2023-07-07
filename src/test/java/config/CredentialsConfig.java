package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:user.properties"
})
public interface CredentialsConfig extends Config {
    @Key("browserstackUser")
    @DefaultValue("bsuser_8WCPxf")
    String getBrowserstackUser();

    @Key("browserstackKey")
    @DefaultValue("ncFH2aucpXaChed2gsoW")
    String getBrowserstackKey();

    @Key("browserstackUrl")
    @DefaultValue("https://hub.browserstack.com/wd/hub")
    String getBrowserstackUrl();
}