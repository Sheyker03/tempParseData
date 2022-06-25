import Driver.timeout
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.WebElement

object DataBitrix {


    val driver = Driver.getDriver()


    fun bitrixSteps(){
        authToBitrix()
    }

    fun authToBitrix(){
        var el : WebElement
        driver.get("https://www.bitrix24.net/oauth/authorize/")
        timeout()
        el = driver.findElement(ByXPath("//input[@id='login']"))
        el.sendKeys(AuthData.authBitrix.get("login"))
        timeout()
        el = driver.findElement(ByXPath("//button[@class='ui-btn ui-btn-md ui-btn-success ui-btn-round b24-network-auth-form-btn']"))
        el.click()
        timeout()
        el = driver.findElement(ByXPath("//input[@id='password']"))
        el.sendKeys(AuthData.authBitrix.get("password"))
        timeout()
        el = driver.findElement(ByXPath("//button[@class='ui-btn ui-btn-md ui-btn-success ui-btn-round b24-network-auth-form-btn']"))
        el.click()
        timeout()
        driver.get("https://b24-oeeila.bitrix24.ru/company/personal/user/15/tasks/projects/")
        timeout()
    }

    fun getDataFromBitrix(){

    }

    fun getAllTask(){

    }
}