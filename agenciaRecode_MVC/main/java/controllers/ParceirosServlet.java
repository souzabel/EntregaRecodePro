package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ParceirosDAO;
import model.Parceiros;

@WebServlet(urlPatterns = {"/autores", "/create-parceiro", "/edit", "/update", "/delet"})
public class ParceirosServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	ParceirosDAO ParceirosDAO = new ParceirosDAO();
	Parceiros parceiro = new Parceiros();
      
    public ParceirosServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		switch (action) {
		case "/parceiros":
			read(request, response);
			break;
		case "/create-parceiro":
			create(request, response);
			break;
		case "/edit":
			edit(request, response);
			break;
		case "/update":
			update(request, response);
			break;
		case "/delet":
			delet(request, response);
			break;
			
		default:
			response.sendRedirect("index.html");
			break;
		}
	}
	// READ
	protected void read(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Parceiros> lista = parceirosDAO.getParceiros();
		
		request.setAttribute("parceiros", lista);
		
		RequestDispatcher rd = request.getRequestDispatcher("./views/parceiros/index.jsp");
		rd.forward(request, response);
	}
	// CREATE
	protected void create(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		parceiro.setNome(request.getParameter("nome"));
		parceirosDAO.save(parceiro);
		response.sendRedirect("parceiros");
	
	}
	// READ BY ID
	protected void edit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		int id = Integer.parseInt(request.getParameter("id"));
		
		parceiro = parceirosDAO.getParceiroById(id);
		
		request.setAttribute("id", parceiro.getId());
		request.setAttribute("nome", parceiro.getNome());
		
		RequestDispatcher rd = request.getRequestDispatcher("./views/parceiros/update.jsp");
		rd.forward(request, response);
		
	}
	// UPDATE
	protected void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		parceiro.setId(Integer.parseInt(request.getParameter("id")));
		parceiro.setNome(request.getParameter("nome"));
		
		parceirosDAO.update(parceiro);
		response.sendRedirect("parceiros");
	}
	// DELET
	protected void delet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		parceirosDAO.deleteById(id);
		response.sendRedirect("parceiros");
	}
}
