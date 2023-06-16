import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonPageObjects {
    public CommonPageObjects(){
        PageFactory.initElements(new ChromeDriver(),this);
    }
    @FindBy(id="login-id")
    public WebElement loginId;
    @FindBy(xpath="//span[@class='flex-1']")
    public WebElement searchBox;


    @FindBy(linkText = "Alışveriş")
    public WebElement shoppingOption;
    @FindBy(xpath = "(//div[@class='sh-dgr__content']//h3[@class='tAxDx'])[1]")
    public WebElement firstShoppingOption;

    @FindBy(xpath = "(//div[@class='QS5gu sy4vM'])[2]")
    public WebElement popUpAccept;

      @FindBy(xpath="//input[@class='flex-1']")
    public WebElement dropdown;



}
