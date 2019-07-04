package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAge extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String name = request.getParameter("name");
		PrintWriter pw=response.getWriter();		
		
		if(name != null && name.equals("yaohongzhi")) {
			pw.write("姚鸿志小年轻");
		}else if(name != null && name.equals("gaozhao")){
			pw.write("高照永远18岁");
		}else{
			pw.write("输入参数有误");
		}
		
		pw.flush();
		pw.close();
	}
}
