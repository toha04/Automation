import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckEmailHappyPath {
    @Test (dataProvider = "happy_path_data", dataProviderClass = Data.class)
    public  void checkTrue(String email) {
        boolean happy = true;
        Assert.assertEquals(happy, Email.isEmailCorrect(email));
    }
}
