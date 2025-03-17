package SDETConcepts;

public interface SDETC_021_SampleInterface {
	
	// Constants (variables) in the WebDriver interface
    String VERSION = "1.0";  // The version of the WebDriver
    int TIMEOUT = 30;        // Default timeout for actions in seconds

	void get(String url);

	// Get the current page title
	String getTitle();

	// Get the current page URL
	String getCurrentUrl();

	// Find an element by its locator (e.g., ID, Name, XPath)
	// WebElement findElement(By by);

	// Close the current browser window
	void close();

	// Quit the driver and close all associated windows
	void quit();

	// Maximize the current browser window
	void manageWindow();

	// Switch to another frame or window
	void switchTo();

	// Take a screenshot (returns a File object)
	// File getScreenshotAs(OutputType<File> target);

}