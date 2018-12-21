package spitter.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 配置DispatcherServlet
 * @author XR
 *
 */
public class SpitterWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	//加载中间件和数据层组件JavaConfig类
	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO 自动生成的方法存根
		return new Class<?>[] {RootConfig.class};
	}
	//加载bean类和控制器视图解析器等JavaConfig类
	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO 自动生成的方法存根
		return new Class<?>[] {WebConfig.class};
	}
	//配置DispatcherServlet映射路径
	@Override
	protected String[] getServletMappings() {
		// TODO 自动生成的方法存根
		return new String[] {"/"};
	}

}
