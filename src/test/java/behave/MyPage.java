package behave;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;

@ScreenMap(name = "Tela Inicial", location = "http://exemplo-guddi.rhcloud.com/guddi/")
public class MyPage {

	@ElementMap(name = "Campo de Busca", locatorType = ElementLocatorType.Id, locator = "pesquisa_form:busca")
	private TextField searchField;

	@ElementMap(name = "PESQUISAR", locatorType = ElementLocatorType.Id, locator = "pesquisa_form:search_button")
	private Button buttonLuckSearch;

}
