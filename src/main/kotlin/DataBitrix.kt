import Driver.timeout
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.By.className
import org.openqa.selenium.WebElement
import java.io.File
import java.io.FileOutputStream



object DataBitrix {

    val pathToListTasks : String = "C:\\Users\\Demonenok\\IdeaProjects\\parseData\\Preparator.txt"

    val driver = Driver.getDriver()

    var tempTaskList = ArrayList<String>()


    fun bitrixSteps(){
        getDataForSteps()
        authToBitrix()
        getAllTask()
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

    fun getDataForSteps(){
        File(pathToListTasks).forEachLine {
            tempTaskList.add(it)
        }
        println(tempTaskList)
    }

    fun getAllTask(){
        var el : WebElement
        tempTaskList.forEach {
            try {
                timeout()
                driver.get(it)
                timeout()
                var taskName = driver.findElement(ByXPath("//span[@id='pagetitle']")).text
                println(taskName)
            } catch (ex : Exception) {
                println(ex)
            }

        }
    }
}