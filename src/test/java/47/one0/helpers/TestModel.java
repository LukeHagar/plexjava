package 47.one0.helpers;

import com.fasterxml.jackson.annotation.JsonProperty;
import 47.one0.models.BaseModel;

public class TestModel extends BaseModel {
    public String testString;
    public int testInt;
    public boolean testBoolean;
    
    public TestModel(@JsonProperty("testString") String testString, @JsonProperty("testInt") int testInt, @JsonProperty("testBoolean") boolean testBoolean) {
        this.testString = testString;
        this.testInt = testInt;
        this.testBoolean = testBoolean;
    }
}
