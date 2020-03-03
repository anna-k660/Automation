import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckEmailUnhappyPath {
    @DataProvider(name = "emailsForUnhappyPath")
    public static Object[][] emails() {
        return new Object[][]{
                {""}, {" "}, {"j"}, {"&"}, {"a29kpeu0*h%"}, {"@kO9w.lys"},
                {"aO!_po3A5.aop"}, {"KlK97!_h@L7aucso"}, {"aL_!23@olO1p."},
                {"K1@6.a"}, {"J8i_!kaS8_mYqR6poU_p!@eQ3l9m.dopnrm"},
                {"a@6.n"}, {"o8!_Wa07M65_oa8r3!Ol33a_@K8udW18n.jdukmsaiky"},
                {"S41g_r!t%a@dr5L.dop"}, {"fr1_o!3H@J7#p.nfo"},
                {"sA_j!81k@T5os.5ot"}, {"Yu2_l!k@lU2a.os&k"},
                {"оЗ4! Mp_@L9o1.aul"}, {"g_R6!q7@z 0R.bap"},
                {"mT0_r!u!@W9Fn.a p"}, {"NULL"}
        };
    }

    @Test(dataProvider = "emailsForUnhappyPath")
    public void testCheckEmailsUnhappyPath(String email) {
        boolean actualResult = Email.isEmailCorrect(email);
        Assert.assertFalse(actualResult, "Correct email, in the test should be checked not valid emails");
    }
}
