import org.testng.annotations.DataProvider;

public class CheckByXPath {
    @DataProvider
    public static Object[][] getXPath_Selector() {
        return new Object[][] {
                {"input[id=\"checkbox-1\"]"},
                {"input[id=\"checkbox-2\"]"},
                {"input[id=\"checkbox-3\"]"}
        };
    }
}
