package junit.business;

import junit.business.exception.DifferentCurrenciesException;
import junit.model.Amount;
import junit.model.Product;

import java.util.List;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}