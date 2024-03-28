package br.com.weblivraria.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.weblivraria.dao.DAOUsuario;
import br.com.weblivraria.dominio.Usuario;

public class TestDAOUsuario {
	
	//Vamos realizar os testes em todos os métodos que estão
	//classe DAOUsuario.
	
	//Vamos começar testando o cadastro os usuário
	@Test
	public void testCadastroUsuario() {
		//realizar a instância da classe Usuario e aplicar dados
		//ficticios para cadastrar. Esta técnica é chamada de dados
		//mockados
		Usuario us = new Usuario();
		us.setNomeusuario("Dazai");
		us.setSenha("123");
		us.setEmail("dazai@gmail.com");
		us.setTelefone("11-2354-6542");
		us.setNomecompleto("Dazai Osamu");
		us.setCpf("67241624");
		
		//instância da classe DAOUsuario
		DAOUsuario daous = new DAOUsuario();
		assertEquals("Cadastro realizado", daous.cadastrar(us));
	}

}
