package net.antra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieEx2 extends HttpServlet{
	
	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//this is my code
		PrintWriter out=response.getWriter();
		Cookie ck[]=request.getCookies();
		
		if(ck!=null) {
			for(int i=0;i<ck.length;i++) {
				
				out.println(ck[i].getName());
				out.println(ck[i].getValue());
				out.println(ck[i].getMaxAge());
			}
			
		}
		
	}

}
