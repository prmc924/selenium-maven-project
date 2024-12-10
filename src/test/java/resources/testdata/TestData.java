package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay Vaghani
 */
public class TestData {

    @DataProvider(name = "credentials")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"prime@gmail.com", "test123" },
                {"prime1@gmail.com", "test456"},
                {"prime3@gmail.com", "test456"}
        };
        return data;
    }

}
