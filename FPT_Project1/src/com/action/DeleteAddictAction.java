package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.bo.AddictBO;

public class DeleteAddictAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("xoaaaaaaaaaaaaaaaaaaaaaaaaaaa"+ request.getParameter("addictsid"));
		AddictBO addBO = new AddictBO();
		addBO.deleteAddict(request.getParameter("addictsid"));
		return mapping.findForward("xoaxong");
	}
	

}
