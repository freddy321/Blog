package com.cos.util;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class Script {
	public static void moving(HttpServletResponse response, String msg) {
		try {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('"+msg+"')"); //문제가 생겼을 때 얘를 호출
			script.println("history.back()");
			script.println("</script>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void moving(HttpServletResponse response, String msg,String url) {
		try {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('"+msg+"')");     //성공했을떄
			script.println("location.href='"+url+"'");
			script.println("</script>");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}