package tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.InteracoesWeb;
import pages.CreateAccountPage;
import pages.LoginPage;
import pages.Search;
import utils.Constants;
import utils.DriverContext;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAutomationPractice {
	static WebDriver driver;
	InteracoesWeb i = new InteracoesWeb();
	
	@BeforeClass
	public static void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		DriverContext.setDriver(driver);
	}

	@Before
	public  void setUp() {
		DriverContext.getDriver().get("http://automationpractice.com/");
	}
	
	/*
	@Test
	public void testCriarContaUsuario()  {
		i.clicar(CreateAccountPage.linkSignIn);
		i.escrever(CreateAccountPage.txtEmail, "teste@teste.jh");
		i.clicar(CreateAccountPage.btnCreateAccount);
		i.clicar(CreateAccountPage.rdbSexoFeminino);
		i.escrever(CreateAccountPage.txtFirstName, "ka");
		i.escrever(CreateAccountPage.txtLastName, "omr");
		i.escrever(CreateAccountPage.txtPassword, "12345");
		i.selecionar(CreateAccountPage.cbDays, "5");
		i.selecionar(CreateAccountPage.cbMonths, "12");
		i.selecionar(CreateAccountPage.cbYears, "1992");
		i.clicar(CreateAccountPage.ckNewsletter);		
		i.clicar(CreateAccountPage.ckPartners);
		i.escrever(CreateAccountPage.txtCompany, "None");
		i.escrever(CreateAccountPage.txtAddress, "None");
		i.escrever(CreateAccountPage.txtAddress2, "None");
		i.escrever(CreateAccountPage.txtCity, "None");
		i.selecionar(CreateAccountPage.cbState, "2");
		i.escrever(CreateAccountPage.txtZipCode, "00000");
		i.selecionar(CreateAccountPage.cbCountry, "21");
		i.escrever(CreateAccountPage.txtAddinfo, "others");
		i.escrever(CreateAccountPage.txtPhone, "87123456789");
		i.escrever(CreateAccountPage.txtMobile, "87123456789");
		i.escrever(CreateAccountPage.txtAlias, "123456789");
		i.clicar(CreateAccountPage.btnSubmit);
		i.validar(CreateAccountPage.validacao, "ka omr");
		i.clicar(CreateAccountPage.linkSignout);
		
		
		
	}*/
	
	@Test 
	public void testRealizarCompra() {
		i.clicar(LoginPage.btnSignIn);
        i.escrever(LoginPage.txtEmail, "teste@teste.ph");
        i.escrever(LoginPage.txtPassword, "12345");
        i.clicar(LoginPage.btnSubmit);
        i.clicar(Search.linkTshirts);
        i.clicar(Search.item);
        i.selecionar(Search.chSize, "2");
        i.clicar(Search.chColor);
        i.clicar(Search.btnSubmit);
        i.clicar(Search.btnCheckOut);
        i.clicar(Search.btnProceed);
        i.clicar(Search.btnProceedAdress);
        i.clicar(Search.chTerms);
        i.clicar(Search.btnShipping);
        i.clicar(Search.linkPayBank);
        i.clicar(Search.btnOrder);
        i.clicar(Search.linkBackOrders);
        
        
    }
		
	}



