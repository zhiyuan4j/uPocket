package cn.teddywang.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.teddywang.entity.User;

/**
 * Servlet Filter implementation class LoginFilter
 */
public class LoginFilter implements Filter {
	
	private String config;
	
    /**
     * Default constructor. 
     */
    public LoginFilter() {
    	
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req= (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		//要放行的url字串
		String[] strArr = config.split(";");
		//放行不需要过滤的链接
		if(strArr != null) {
			for(int i=0; i<strArr.length; i++) {
				if(strArr[i] == null || "".equals(strArr[i]))
					continue;
				if(strArr[i] != null && req.getRequestURI().indexOf(strArr[i])!=-1) {
					chain.doFilter(request, response);
					return;
				}
			}
		}
		
		//判断是否登录
		User user = (User) req.getSession().getAttribute("loginUser");
		if(user == null) {
			//未登录，进行拦截
			resp.sendRedirect("/login.jsp");
		} else {
			//已登录，放行
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		config = fConfig.getFilterName();
	}

}
