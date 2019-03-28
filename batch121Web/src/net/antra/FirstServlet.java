package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class FirstServlet extends HttpServlet{
	
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		
		out.print("in first servlet");
	}

}
