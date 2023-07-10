package com.mysite.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyController
 */
//@WebServlet("/MyController")      <== 어노테이션으로 요청을 처리 ( spring ) 
	/*
	    Controller : Client 의 요청을 처리함. ( get, post )
	     		- doGet() {} : client 에서 보내는 get 요청을 처리하는 메소드 ,   <form method = "get" action= "a.jsp">, <a href = "b.jsp"> 
	     		- doPost() {} : client 에서 보내는 Post 요청을 처리하는 메소드 , <form method = "post" action="a.jsp"> 
	     		
	      controller 요청을 처리 하는 방법 : 
	      		web.xml : 클라이언트의 요청에 대한 controller를 지정함. 
	      		@WebServlet : 어노테이션을 사용해서 처리 
	      		
	      		
	      client 가 보내는 요청정보의 URI를 캐취해서 분기처리 
	 */

public class MyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at (MyController) : ").append(request.getContextPath());
		
		// client 에서 get 방식으로 넘어오는 요청 처리를 doPost에서 한꺼번에 처리하도록 던져줌 		
		doPost ( request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		//client 에서 Get / Post 모두를 한꺼번에 처리함. 
		
		// URL : http://localhost:8181/JSP_Study_MVC_M2/my.do
		// URI : /JSP_Study_MVC_M2/my.do
		
		//1. Client의 요청 정보를 path 변수에 등록 함. 
		String url = request.getRealPath(getServletInfo()); 
			//System.out.println("클라이언트가 보내는 전체 URL(실제 시스템의 물리적 경로)  : " + url );
		
		
		String uri = request.getRequestURI(); 
			//System.out.println("클라이언트가 보내는 요청 uri : " + uri);
		
		String path = uri.substring(uri.lastIndexOf("/")); 
			//System.out.println("파일 명을 읽어옴 : " + path );
			
		//2. 클라이언트의 요청 정보에 따라서 적절히 분기 처리 한다. 
		if ( path.equals("/login.do")) {       
			System.out.println("login.do 요청을 했습니다. ");
			// 로그인을 처리하는 코드 블락 
			
		} else if (path.equals("/logout.do")) {
			System.out.println("logout.do 요청을 했습니다. ");
			//로그아웃 요청을 처리하는 코드 블락 
			
		} else if (path.equals("/insert.do")) {
			System.out.println("insert.do 요청을 했습니다. ");
			// 게시판에서 값을 DB에 저장함. 
			
		} else if (path.equals("/getBoard.do")) {
			System.out.println("getBoard.do 를 요청 했습니다. ");
			// 게시판의 값을 읽어 올때 
			
		}
			
		
		
	}

}
