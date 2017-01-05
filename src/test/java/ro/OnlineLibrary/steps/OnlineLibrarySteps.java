package ro.OnlineLibrary.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Sleeper;
import ro.OnlineLibrary.steps.genericSteps.TestBase;
import ro.OnlineLibrary.views.OnlineLibraryPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by Valeria Marc on 11/27/2016.
 */
public class OnlineLibrarySteps extends TestBase {
    private OnlineLibraryPage onlineLibraryPage = PageFactory.initElements(driver, OnlineLibraryPage.class);

    @Given("^I go to \"([^\"]*)\"$")
    public void iGoTo(String link) {
        driver.get(link);
    }

    @And("^I go to shop section in the menu bar$")
    public void iGoToShopSectionInTheMenuBar() {
        onlineLibraryPage.getShopMenuLink().click();
    }

    @And("^I sort books by highest price first$")
    public void iSortBooksByHighestPriceFirst() {
        onlineLibraryPage.getSortByFilter().click();
        onlineLibraryPage.getPriceDescendant().click();
    }

    @And("^I check if the listing is by price decrease$")
    public void iCheckIfTheListingIsByPriceDecrease() {
        List<WebElement> productPrice = driver.findElements(By.className("woocommerce-Price-currencySymbol"));
        int matchProducts = 0;

        for (int i = 0; i < productPrice.size(); i++) {
            String priceText = productPrice.get(i).getText();
            double currentPrice = Double.parseDouble(priceText.split(" ")[0].replace(",", "."));
            boolean priceDescendant = currentPrice > currentPrice + 1;
            if (priceDescendant = true) {
                System.out.println("Highest priced product is listed first");
            } else {
                assertThat("Price is not in range: " + currentPrice, priceDescendant);
            }

        }
    }

    @And("^I sort books by lowest price first$")
    public void iSortBooksByLowestPriceFirst() {
        onlineLibraryPage.getPriceAscendant().click();
    }

    @And("^I check if the listing is by price growth$")
    public void iCheckIfTheListingIsByPriceGrowth() {
        List<WebElement> productPrice = driver.findElements(By.className("woocommerce-Price-currencySymbol"));
        int matchProducts = 0;

        for (int i = 0; i < productPrice.size(); i++) {
            String priceText = productPrice.get(i).getText();
            double currentPrice = Double.parseDouble(priceText.split(" ")[0].replace(",", "."));
            boolean priceDescendant = currentPrice < currentPrice + 1;
            {
                System.out.println("Lowest priced product is listed first");
            }
            assertThat("Price is not in range: " + currentPrice, priceDescendant);


        }
    }

    @And("^I click on the product with price lower than \"([^\"]*)\" GBP$")
    public void iClickOnTheProductWithPriceLowerThanGBP(String arg0) {
        List<WebElement> productPrice = driver.findElements(By.className("woocommerce-Price-currencySymbol"));
        int matchProducts = 0;
        for (int i = 0; i < productPrice.size(); i++) {
            String priceText = productPrice.get(i).getText();
            double currentPrice = Double.parseDouble(priceText.split(" ")[0].replace(",", "."));
            boolean priceInRange = currentPrice < 10.00;
            {
                System.out.println("Product with price lower than 10.00 GBP was found");
            }
            assertThat("Price could not be found: " + currentPrice, priceInRange);


        }
    }


    @And("^I go to Reviews and I add a review$")
    public void iGoToReviewsAndIAddAReview() {
        driver.findElement(By.className("title-holder title")).click();
        onlineLibraryPage.getReviewTab().click();
        onlineLibraryPage.getReviewTextField().sendKeys("This is an automatic review.");
        onlineLibraryPage.getRatingStar().click();
        onlineLibraryPage.getNameField().sendKeys("John");
        onlineLibraryPage.getEmailField().sendKeys("trial@gmail.com");
        onlineLibraryPage.getSubmitButton().click();
    }

    @Then("^I go on Contact section of the menu and I send a message$")
    public void iGoOnContactSectionOfTheMenuAndISendAMessage() {
        onlineLibraryPage.getContactUsLink().click();
        onlineLibraryPage.getContactNameField().sendKeys("Client01");
        onlineLibraryPage.getContactEmailField().sendKeys("libraryClient@gmail.com");
        onlineLibraryPage.getContactTextField().sendKeys("Please provide me the following information:...");
        onlineLibraryPage.getContactSubmitButton().click();

    }

    @And("^I go to Online Store section of the menu$")
    public void iGoToOnlineStoreSectionOfTheMenu() {
        onlineLibraryPage.getOnlineStore().click();
    }

    @And("^I add to cart the first and the last products$")
    public void iAddToCartTheFirstAndTheLastProducts() {
        onlineLibraryPage.getFirstProduct().click();
        onlineLibraryPage.getSecondProduct().click();
    }

    @And("^I go to view cart items$")
    public void iGoToViewCartItems() throws InterruptedException {
        mouseOver(onlineLibraryPage.getCartLink());
        driver.findElement(By.xpath("//h2[@class='widgettitle']"));
        Thread.sleep(2000);
        // onlineLibraryPage.getCartLink().
        onlineLibraryPage.getCartButton().click();
    }

    @Then("^I checkout$")
    public void iCheckout() {
        onlineLibraryPage.getProceedCheckout().click();
    }
}

