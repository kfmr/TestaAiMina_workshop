package actions;

import org.junit.Assert;
import org.openqa.selenium.By;

import utils.DriverContext;

public interface Validacao {
	default void validar(By elemento, String texto) {
		Assert.assertTrue(DriverContext.getDriver().findElement(elemento).getText().equals(texto));
	}
}