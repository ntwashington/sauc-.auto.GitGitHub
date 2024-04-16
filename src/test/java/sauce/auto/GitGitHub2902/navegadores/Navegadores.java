package sauce.auto.GitGitHub2902.navegadores;

import org.openqa.selenium.chrome.ChromeDriver;

import sauce.auto.GitGitHub2902.drivers.Drivers;

public class Navegadores extends Drivers{
	
	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
	}

}
