package helpers;

import config.CredentialsConfig;
import org.aeonbits.owner.ConfigFactory;

import static java.lang.String.format;
import static io.restassured.RestAssured.given;


public class Browserstack {
//     curl -u "qagurumobile_piB8or:dqCgQsyscHYt4iEy2vUi" -X
//     GET "https://api.browserstack.com/app-automate/sessions/c48a81741d51697643828028e94f3dab4e481b08.json"

    static CredentialsConfig credentialsConfig = ConfigFactory.create(CredentialsConfig.class, System.getProperties());

    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic(credentialsConfig.getBrowserstackUser(), credentialsConfig.getBrowserstackKey())
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}