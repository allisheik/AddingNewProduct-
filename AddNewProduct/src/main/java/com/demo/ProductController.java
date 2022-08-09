package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		RequestDispatcher rd1=request.getRequestDispatcher("index.html");
		PrintWriter out=response.getWriter();
		String Id=request.getParameter("pid");
		int  pid=  Integer.parseInt(Id);
		String pname=request.getParameter("pname");
		float price=Float.parseFloat(request.getParameter("price"));
		ProductDetails pd=new ProductDetails();
		pd.setPid(pid);
		pd.setPname(pname);
		pd.setPrice(price);
		Productservice ps=new Productservice();
		String result = ps.storeEmployee(pd);
	    out.println(result);
	    rd1.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}