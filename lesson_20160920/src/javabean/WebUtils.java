package javabean;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.beanutils.BeanUtils;

public class WebUtils {
public static <T> T copyToBean(HttpServletRequest request,Class<T> clazz){

	try {
	T t = clazz.newInstance();
	Enumeration<String> enums = request.getParameterNames();
	while(enums.hasMoreElements()){
		String name = enums.nextElement();
		String value = request.getParameter(name);
		BeanUtils.copyProperty(t, name, value);
	} 
	return t;
	}catch (Exception e) {
		// TODO 自动生成的 catch 块
		throw new RuntimeException(e);
	} 
	
}

public static <T> T copyToBean2(HttpServletRequest request,Class<T> clazz){

	try {
	T t = clazz.newInstance();
	BeanUtils.populate(t, request.getParameterMap());
	return t;
	}catch (Exception e) {
		// TODO 自动生成的 catch 块
		throw new RuntimeException(e);
	} 
	
}
}