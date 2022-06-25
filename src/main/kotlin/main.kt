import org.openqa.selenium.WebElement

fun timeout() = Driver.timeout()

fun main() {
    try {
        DataBitrix.bitrixSteps()
    } catch (ex : Exception) {
        println(ex)
    } finally {
        Driver.final()
    }
}