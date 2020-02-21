import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckEmailUnhappyPath {
    @Test (dataProvider = "unhappyPathData", dataProviderClass = Data.class)
    public void checkEmailVerificationUnhappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult);
    }
}
