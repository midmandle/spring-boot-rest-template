import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;

public class GreetingShould {
    @Test
    void return_200_OK() {
        get("/greeting").then().assertThat().statusCode(200);
    }
}
