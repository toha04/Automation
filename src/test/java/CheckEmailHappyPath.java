import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @Test (dataProvider = "happyPathData", dataProviderClass = Data.class)
    public  void checkEmailVerificationHappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult);
    }
}
