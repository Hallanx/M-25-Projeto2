package projeto.services;

import projeto.dao.IProdutoDAO;
import projeto.domain.Produto;
import projeto.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
