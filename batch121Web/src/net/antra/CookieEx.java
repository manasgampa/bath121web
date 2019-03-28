package net.antra;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieEx extends HttpServlet{
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		
		Cookie c1=new Cookie("uname","manas");
		response.addCookie(c1);
		
	}

}
