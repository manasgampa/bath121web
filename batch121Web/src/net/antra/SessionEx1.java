package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionEx1 extends HttpServlet {
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		HttpSession hsession=request.getSession(true);
		PrintWriter out=response.getWriter();
		out.println("Session:"+hsession);
		out.println("Session id:"+hsession.getId());
		out.println("isNew:"+hsession.isNew());
		
		hsession.setAttribute("uname", "kumar");
		//hsession.invalidate();
		
	}

}
