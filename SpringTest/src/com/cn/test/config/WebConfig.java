package com.cn.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@Configuration
@EnableWebMvc//启用Spring MVC
@ComponentScan(basePackages={"com.cn.test.web"}) //启用组件扫描
public class WebConfig extends WebMvcConfigurerAdapter{

	//配置视图解析器
//	@Bean
//	public ViewResolver viewResolver(){
//		InternalResourceViewResolver resolver = 
//				new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/views/");
//		resolver.setSuffix(".jsp");
//		resolver.setViewClass(org.springframework.web.servlet.view.JstlView.class);
//		resolver.setExposeContextBeansAsAttributes(true);
//		return resolver;
//	}
	
	//配置Thymeleaf视图解析器
	@Bean
	public ViewResolver viewResolver(SpringTemplateEngine springTemplateEngine){
		ThymeleafViewResolver thymeleafViewResolver
		 							= new ThymeleafViewResolver();
		thymeleafViewResolver.setTemplateEngine(springTemplateEngine);
		return thymeleafViewResolver;
	}
	
	
	@Bean
	public TemplateResolver templateResolver(){
		ServletContextTemplateResolver
		 			resolver = new ServletContextTemplateResolver();
		resolver.setPrefix("/WEB-INF/thymeleaf/");
		resolver.setSuffix(".html");
		resolver.setTemplateMode("HTML5");
		resolver.setCacheable(false);
		return resolver;
	}
	
	@Bean
	public SpringTemplateEngine springTemplateEngine(TemplateResolver templateResolver){
		SpringTemplateEngine engine = new SpringTemplateEngine();
		engine.setTemplateResolver(templateResolver);
		return engine;
	}
	
	@Bean
	public MultipartResolver multipartResolver(){
		return new StandardServletMultipartResolver();
	}
	
//	@Bean
//	public MultipartResolver multipartResolver() throws IOException{
//		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
//		resolver.setUploadTempDir(new FileSystemResource("临时文件路径"));//，非必须设置
//		resolver.setMaxInMemorySize(0);//最大内存大小
//		resolver.setMaxUploadSize(2097152);//上传文件大小限制
//		return resolver;
//	}
	
//	@Bean
//	public TilesConfigurer tilesConfigurer(){
//		TilesConfigurer tiles = new TilesConfigurer();
//		//指定Tile定义的位置
//		tiles.setDefinitions(new String[]{
//				"/WEB-INF/layout/tiles.xml",
//				"/WEB-INF/**/tiles.xml"
//		});
//		//启用刷新功能
//		tiles.setCheckRefresh(true);
//		return tiles;
//	}
//	
//	@Bean
//	public TilesViewResolver tilesViewResolver(){
//		return new TilesViewResolver();
//	}
	
	//配置静态资源的处理
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}
	
}
