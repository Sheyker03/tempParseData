
import org.openqa.selenium.*
import org.openqa.selenium.WebElement
import org.openqa.selenium.edge.EdgeDriver


object Driver {
    init {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Demonenok\\IdeaProjects\\SParseData\\src\\main\\webdriver\\msedgedriver.exe")
    }


    private val driver = EdgeDriver() as WebDriver

    fun getDriver(): WebDriver {
        return driver
    }

    fun final(){
        driver.quit()
    }

    fun timeout(time : Int = 3){
        Thread.sleep(1000 * time.toLong())
    }
}