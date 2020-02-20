import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider (name = "happy_path_data")
    public static Object[][] Happydata() {

        return new Object[][]{{"!Aaazhfk657_@fF6.com"},
                {"!_hjfhd474@747jh.net"},
                {"88888gppF@009.oiu"},
                {"12234kjs!nj_@jfss.faw"},
                {"____!!!!!!!@11111.hgf"},
                {"Q23eT87!!__@fghj.ijk"}
        };
    }

@DataProvider (name = "Unhappy_path_data")
    public static Object[][] UnhappyData() {
        return new Object[][]{{"12@hbfs4.ukr"},
                {"sdhkshcksd47y84723__!!!@4j8.oks"},
                {"j5kl5k1###__!!@ksfd.kde"},
                {"1j3jdKKso1lj2@jfk344.com"},
                {"ijkoKK7y84@.uk"},
                {"!Q2w3E$R@@utgp13o.net"},
                {"09@ksj.pl"},
                {"hud4rf@&&34U.ru"},
                {"1Q2w3e4r@5r6t7.w"},
                {"1Q2w3e4r@5r6t7.awrfdf"},
                {"1Q2w3e4r@5r6t7.aw3"},
                {"!q2w_4eR&*^ u7u8i9)OЯЩЗ@2w$&*k.&1F"},
                {"$*@H%.!"}
        };
    }
}