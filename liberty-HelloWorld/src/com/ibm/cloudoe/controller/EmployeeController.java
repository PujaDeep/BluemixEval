package com.ibm.cloudoe.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.cloudoe.samples.Search;

public class EmployeeController extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String empsearch="";
	String add="";
	String empId= ""; String empEmail=""; String emailid ="";String status="";String option="";
	boolean flag=false;
	Search search = new Search();
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		
		empsearch=req.getParameter("emp");
		add=req.getParameter("emp");
		
		
		System.out.println(empsearch);
		System.out.println("adding="+add);
		if(empsearch.equalsIgnoreCase("search"))
		{
			option=req.getParameter("Searchemp");
		 
		 
		if((option.equalsIgnoreCase("emp"))){
			empId=req.getParameter("employee");
			status= Search.searchByEmpID(empId);
			
		}else
		{
			System.out.println("searching by email");
			emailid=req.getParameter("emailId");
			System.out.println(emailid);
			status=Search.searchByEmailID(emailid);
			System.out.println(status);
		}
		 
		if((status!=(null))){
			
			String msg1="Email ID: "+status;
			
			res.sendRedirect("searchsucess.jsp?telStatus="+msg1);
			
		}
		else
		{
			res.sendRedirect("error.jsp");
		}
		
		}
		else 
		{
			
			System.out.println("adding block");
			empId=req.getParameter("employee");
			empEmail=req.getParameter("email");
			
			System.out.println(empId+empEmail);
			
			Search.addValue(empId,empEmail);
			res.sendRedirect("addSuccess.jsp");
		}
	}
	}
