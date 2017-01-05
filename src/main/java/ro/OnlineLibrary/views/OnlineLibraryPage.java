package ro.OnlineLibrary.views;

import org.apache.xalan.transformer.XalanProperties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeria Marc on 11/27/2016.
 */
public class OnlineLibraryPage {

    @FindBy(xpath = "//*[@id=\"menu-item-3266\"]/a")
    private WebElement shopMenuLink;

    @FindBy(xpath = "//select[@class='orderby']")
    private WebElement sortByFilter;

    @FindBy(xpath = "//option[@value='price-desc']")
    private WebElement priceDescendant;

    @FindBy(xpath = "//option[contains(.,'Sort by price: low to high')]")
    private WebElement priceAscendant;

    @FindBy(xpath = "//span[@class='woocommerce-Price-currencySymbol']")
    private WebElement productPrice;

    public WebElement getProductPrice() {
        return productPrice;
    }

    @FindBy(xpath = "//a[contains(.,'Prostia și sec')]")
    private WebElement bookP85;

    @FindBy(xpath = "//div[@class='title-holder title']")
    private WebElement randomProduct;

    public WebElement getRandomProduct() {
        return randomProduct;
    }

    @FindBy(xpath = "//a[@href='#tab-reviews']")
    private WebElement reviewTab;

    @FindBy(xpath = "//a[@class='star-3']")
    private WebElement ratingStar;

    @FindBy(xpath = "//textarea[@aria-required='true']")
    private WebElement reviewTextField;

    @FindBy(xpath = "//input[@id='author']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[contains(.,'Contact Us')]")
    private WebElement contactUsLink;

    public WebElement getContactUsLink() {
        return contactUsLink;
    }

    @FindBy(xpath = "//input[@name='name']")
    private WebElement contactNameField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement contactEmailField;

    @FindBy(xpath = "//textarea[@name='message']")
    private WebElement contactTextField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement contactSubmitButton;

    public WebElement getContactNameField() {
        return contactNameField;
    }

    public WebElement getContactEmailField() {
        return contactEmailField;
    }

    public WebElement getContactTextField() {
        return contactTextField;
    }

    public WebElement getContactSubmitButton() {
        return contactSubmitButton;
    }

    @FindBy(xpath = "//a[contains(.,'Online Store')]")
    private WebElement onlineStore;

    @FindBy(xpath = "//a[@data-product_id='3730']")
    private WebElement firstProduct;

    @FindBy(xpath = "//a[@data-product_id='4054']")
    private WebElement secondProduct;

    @FindBy(xpath = "//a[@class='button']")
    private WebElement viewCartButton;

    @FindBy(xpath = "//h2[@class='widgettitle']")
    private WebElement cartLink;

    @FindBy (xpath = "//a[@class='button']")
    private WebElement cartButton;

    public WebElement getCartButton() {
        return cartButton;
    }

    @FindBy(xpath = "//a[@class='remove']")
    private WebElement deleteCartItem;

    @FindBy(xpath = "//a[contains(@class,'checkout_link')]")
    private WebElement proceedCheckout;

    public WebElement getShopMenuLink() {
        return shopMenuLink;
    }

    public WebElement getSortByFilter() {
        return sortByFilter;
    }

    public WebElement getPriceDescendant() {
        return priceDescendant;
    }

    public WebElement getPriceAscendant() {
        return priceAscendant;
    }

    public WebElement getBookP85() {
        return bookP85;
    }

    public WebElement getReviewTab() {
        return reviewTab;
    }

    public WebElement getRatingStar() {
        return ratingStar;
    }

    public WebElement getReviewTextField() {
        return reviewTextField;
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getSubmitButton() {
        return submitButton;
    }

    public WebElement getOnlineStore() {
        return onlineStore;
    }

    public WebElement getFirstProduct() {
        return firstProduct;
    }

    public WebElement getSecondProduct() {
        return secondProduct;
    }

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public WebElement getCartLink() {
        return cartLink;
    }

    public WebElement getDeleteCartItem() {
        return deleteCartItem;
    }

    public WebElement getProceedCheckout() {
        return proceedCheckout;
    }
}