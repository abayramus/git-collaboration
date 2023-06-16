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

}
