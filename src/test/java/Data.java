import org.testng.annotations.DataProvider;

public class Data {
    @DataProvider (name = "happyPathData")
    public static Object[][] happyData() {

        return new Object[][]{{"q1w2e3r4t5_!_!Y6u7I8@fF6.com"},
                {"!_Q@fF6.com"},
                {"!_hjfhd474@747jh.net"},
                {"88888gppF@009.oiu"},
                {"12234kjs!nj_@jfss.fw"},
                {"____!!!!!!!@1111.hfff"},
                {"Q23eT87!!__@fghj.ifjk"},
                {"bfhhdf89!!_@fhjfj.fhdjj"},
                {"r_T@u5.ua"},
                {"sjfishfi98437488__!!@sfhj4.bhvjg"}
        };
    }

@DataProvider (name = "unhappyPathData")
    public static Object[][] unhappyData() {
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