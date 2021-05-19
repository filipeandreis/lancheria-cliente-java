package Controllers;

import Models.AdditionalProduct;
import Views.ViewAdditional;

public class AdditionalController {
	public AdditionalProduct newAdditional() {
		
		new ViewAdditional();
		String additionalProduct = ViewAdditional.setDescription();
		
		AdditionalProduct adicionais1 = new AdditionalProduct(additionalProduct, 1);
		
		return adicionais1;
	}
}