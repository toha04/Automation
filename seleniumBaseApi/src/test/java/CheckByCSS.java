import org.testng.annotations.DataProvider;


public class CheckByCSS {
    @DataProvider
    public static Object[][] getCSS_Selector() {
        return new Object[][]{
                {"input[id=\"checkbox-1\"]"},
                {"input[id=\"checkbox-2\"]"},
                {"input[id=\"checkbox-3\"]"}
        };
    }
}
