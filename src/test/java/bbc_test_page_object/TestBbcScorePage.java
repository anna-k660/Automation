package bbc_test_page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class TestBbcScorePage {
    private static WebDriver driver = new ChromeDriver();

    @DataProvider(name = "teamNamesAndScores")
    public static Object[][] namesAndScores() {
        return new Object[][]{
                {"Aberdeen", "Hibernian", "3", "1"},
                {"Celtic", "St Mirren", "5", "0"},
                {"Hamilton Academical", "Kilmarnock", "1", "0"},
                {"Heart of Midlothian", "Motherwell", "1", "1"},
                {"St Johnstone", "Livingston", "1", "0"},
                {"Kilmarnock", "Aberdeen", "2", "2"},
                {"Livingston", "Celtic", "2", "2"},
                {"Motherwell", "Ross County", "4", "1"},
                {"Rangers", "Hamilton Academical", "0", "1"},
                {"St Mirren", "St Johnstone", "0", "0"},
                {"Hibernian", "Heart of Midlothian", "1", "3"},
        };
    }


    @BeforeTest
    public static void openScoreboardBbc() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bbc.com/sport/football/scottish-premiership/scores-fixtures/2020-03?filter=results");
    }

    @Test(dataProvider = "teamNamesAndScores")
    public void checkScoreboard
            (String firstTeam, String competitionTeam, String firstTeamGoals, String competitionTeamGoals) {

        Scoreboard scoreBoardPage = new Scoreboard(driver);

        Assert.assertTrue(Arrays.equals(new String[]{firstTeamGoals, competitionTeamGoals},
                scoreBoardPage.getScore(firstTeam, competitionTeam)));
    }
}
