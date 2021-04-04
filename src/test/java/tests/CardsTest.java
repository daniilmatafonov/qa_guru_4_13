package tests;

import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.CardsPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

@Tag("web")
@Tag("cards")
public class CardsTest extends BaseTest{

    private final CardsPage cardsPage = new CardsPage();

    @Tag("credit_cards")
    @AllureId("2144")
    @Test
    public void showCreditCards() {
        open("/");
        cardsPage.closeInvitationPopUp();
        cardsPage.openCardsSection();
        cardsPage.clickCheckBoxDebitCards();
    }
}
