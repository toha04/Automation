import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckEmailUnhappyPath {
    @Test (dataProvider = "Unhappy_path_data", dataProviderClass = Data.class)
    public void checkFalse(String email) {
        boolean unhappy = false;
        Assert.assertEquals(unhappy, Email.isEmailCorrect(email));
    }
}
