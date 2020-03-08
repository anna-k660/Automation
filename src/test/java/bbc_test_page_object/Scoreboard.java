package bbc_test_page_object;

import javafx.util.Pair;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class Scoreboard extends PageObject {
    public Scoreboard(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class='sp-c-fixture__team-name sp-c-fixture__team-name--home']//span/span")
    List<WebElement> firstTeamName;

    @FindBy(xpath = "//span[@class='sp-c-fixture__team sp-c-fixture__team--away']/span/span/span")
    List<WebElement> competitionTeam;

    @FindBy(xpath = "//span[@class='sp-c-fixture__number sp-c-fixture__number--home sp-c-fixture__number--ft']")
    List<WebElement> firstTeamScore;

    @FindBy(xpath = "//span[@class='sp-c-fixture__number sp-c-fixture__number--away sp-c-fixture__number--ft']")
    List<WebElement> competitionTeamScore;

    String firstTeamGoals;
    String secondTeamGoals;

    public String[] getScore(String firstTeam, String secondTeam) {

        for (int i = 0; i < firstTeamName.size(); i++) {
            if (firstTeamName.get(i).getText().equals(firstTeam) == true &
                    competitionTeam.get(i).getText().equals(secondTeam) == true) {

                firstTeamGoals = firstTeamScore.get(i).getText();
                secondTeamGoals = competitionTeamScore.get(i).getText();
            }
        }

        return new String[]{firstTeamGoals, secondTeamGoals};
    }
}
