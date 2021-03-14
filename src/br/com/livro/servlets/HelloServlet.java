package br.com.livro.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public HelloServlet() {
		super();

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");

		System.out.println("O nome enviado por formul�rio � : " + nome);
		System.out.println("O sobrenome enviado atrav�s do formul�rio � : " + sobrenome);

		resp.getWriter().print("Ola mundo Servlets " + nome + " " + sobrenome);

	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nome = req.getParameter("nome");
		String sobrenome = req.getParameter("sobrenome");

		System.out.println("O nome enviado por formul�rio � : " + nome);
		System.out.println("O sobrenome enviado atrav�s do formul�rio � : " + sobrenome);

		resp.getWriter().print("Ola mundo Servlets!!!!!! " + nome + " " + sobrenome);

	}

	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().print("Ola m�todo PUT");

	}

	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.getWriter().print("Ola m�todo DELETE");

	}

}
