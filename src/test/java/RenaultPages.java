import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class RenaultPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    By findAuthButton= By.linkText("Yetkili satıcı bul");

    By authDealerPage=By.className("Component23v0__title");

    By location = By.id("textfield");

    By firstLocation=By.xpath("//div[@class='Button__content']");

    By filterButton=By.cssSelector("div#Page > div:nth-of-type(4) > div > div:nth-of-type(2) > div:nth-of-type(2) > div:nth-of-type(3) > button > div");

    By newCarButton=By.xpath("//*[@id=\"Page\"]/div[4]/div[1]/div[3]/div[2]/div[8]/div[1]/label[1]");

    By firstBranch= By.xpath("//*[@id=\"Page\"]/div[4]/div[1]/div[3]/div[3]/button[2]");

    By serviceAppointment=By.xpath("//*[@id=\"Page\"]/div[4]/div[1]/div[4]/div[3]");

    By appointmentPage=By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div[1]/div[1]/div[2]/h4[1]");


    public RenaultPages(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void homePage() {
        driver.get("https://www.renault.com.tr/");
    }

    public void findAuthorizedDealerButton() {
        elementHelper.click(findAuthButton);
    }

    public void authorizedDealerPage() {
        elementHelper.checkVisible(authDealerPage);
    }

    public void location() {
        elementHelper.sendKey(location,"İzmir");
    }

    public void firstLocation() {
        elementHelper.click(firstLocation);
    }

    public void filterButton() {
        elementHelper.click(filterButton);
    }

    public void newCar() {
        elementHelper.click(newCarButton);
    }

    public void firstBranch() {
        elementHelper.click(firstBranch);
    }

    public void serviceAppointment() {
        elementHelper.click(serviceAppointment);
    }

    public void accessAppointmentPage() {
        elementHelper.checkVisible(appointmentPage);
    }
}
