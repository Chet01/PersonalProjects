package base;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import specs.RequestSpecBuilderUtil;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.requestSpecification = RequestSpecBuilderUtil.getRequestSpec();
    }
}
