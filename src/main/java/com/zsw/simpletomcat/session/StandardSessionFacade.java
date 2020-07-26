package com.zsw.simpletomcat.session;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import java.util.Enumeration;

/**
 * @author zsw
 * @date 2020/07/24 18:08
 */
public class StandardSessionFacade implements HttpSession {

	public StandardSessionFacade(StandardSession session) {
		super();
		this.session = (HttpSession) session;
	}


	public StandardSessionFacade(HttpSession session) {
		super();
		this.session = session;
	}

	private HttpSession session = null;




	@Override
	public long getCreationTime() {
		return session.getCreationTime();
	}


	@Override
	public String getId() {
		return session.getId();
	}


	@Override
	public long getLastAccessedTime() {
		return session.getLastAccessedTime();
	}


	@Override
	public ServletContext getServletContext() {
		return session.getServletContext();
	}


	@Override
	public void setMaxInactiveInterval(int interval) {
		session.setMaxInactiveInterval(interval);
	}


	@Override
	public int getMaxInactiveInterval() {
		return session.getMaxInactiveInterval();
	}


	@Override
	public HttpSessionContext getSessionContext() {
		return session.getSessionContext();
	}


	@Override
	public Object getAttribute(String name) {
		return session.getAttribute(name);
	}


	@Override
	public Object getValue(String name) {
		return session.getAttribute(name);
	}


	@Override
	public Enumeration getAttributeNames() {
		return session.getAttributeNames();
	}


	@Override
	public String[] getValueNames() {
		return session.getValueNames();
	}


	@Override
	public void setAttribute(String name, Object value) {
		session.setAttribute(name, value);
	}


	@Override
	public void putValue(String name, Object value) {
		session.setAttribute(name, value);
	}


	@Override
	public void removeAttribute(String name) {
		session.removeAttribute(name);
	}


	@Override
	public void removeValue(String name) {
		session.removeAttribute(name);
	}


	@Override
	public void invalidate() {
		session.invalidate();
	}


	@Override
	public boolean isNew() {
		return session.isNew();
	}


}
