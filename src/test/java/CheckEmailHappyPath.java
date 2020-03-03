import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CheckEmailHappyPath {
    @DataProvider(name = "emailsForHappyPath")
    public static Object[][] emails() {
        return new Object[][]{
                {"z3!@w3.el"}, {"rY54_lo7!p_ol53k8Md!@a8M0b.dopnr"},
                {"P!_9@a7H.api"}, {"i4L!l_6Tm9jG_hh1rol@R1gg.elao"},
                {"K8a_h!@o9A5.cso"}
        };
    }

    @Test(dataProvider = "emailsForHappyPath")
    public void testCheckEmailsHappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertTrue(actualResult, "Incorrect email, in the test should be checked valid emails");
    }
}
