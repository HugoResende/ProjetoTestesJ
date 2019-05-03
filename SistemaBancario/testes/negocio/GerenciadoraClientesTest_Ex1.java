package negocio;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {

		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
		Cliente cliente03 = new Cliente(3, "Hugo Resende", 21, "hugors2016@gmail.com", 3, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		clientesDoBanco.add(cliente03);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		assertThat(cliente.getId(), is(1));
		assertThat(cliente.getEmail(), is("gugafarias@gmail.com"));
		
		GerenciadoraClientes gerClientes2 = new GerenciadoraClientes(clientesDoBanco);
		Cliente cliente2 = gerClientes2.pesquisaCliente(2);
		assertThat(cliente2.getId(), is(2));
		assertThat(cliente2.getEmail(), is("felipeaugusto@gmail.com"));
		
		GerenciadoraClientes gerClientes3 = new GerenciadoraClientes(clientesDoBanco);
		Cliente cliente3 = gerClientes3.pesquisaCliente(3);
		assertThat(cliente3.getId(), is(3));
		assertThat(cliente3.getEmail(), is("hugors2016@gmail.com"));
		
		
	}

}
