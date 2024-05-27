package projeto.dao;

import projeto.dao.generic.IGenericDAO;
import projeto.domain.Venda;
import projeto.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
