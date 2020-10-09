package pages;

import org.openqa.selenium.By;

public class Search {

	public static By linkTshirts       = By.xpath("//*[@id='block_top_menu']/ul/li[3]/a");
	public static By item		 	 = By.xpath("//*[@id='center_column']/ul/li/div/div[2]/h5/a");
	public static By chSize			 = By .id("group_1");
	public static By chColor		 = By .id("color_14");
	public static By btnSubmit		 = By .xpath("//*[@id='add_to_cart']/button");
	public static By btnCheckOut     = By .linkText("Proceed to checkout");
	public static By btnProceed 	 = By .xpath("//*[@id='center_column']/p[2]/a[1]");
	public static By btnProceedAdress = By .xpath("//*[@id='center_column']/form/p/button");
	public static By chTerms          = By .xpath("//*[@id='cgv']");
	public static By btnShipping     = By.xpath("//*[@id='form']/p/button");
	public static By linkPayBank     = By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a");
	public static By btnOrder 		= By .xpath("//*[@id='cart_navigation']/button");
	public static By linkBackOrders = By.xpath("//*[@id='center_column']/p/a");
	
			
}
