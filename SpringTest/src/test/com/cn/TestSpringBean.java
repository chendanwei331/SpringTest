package test.com.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.test.config.ExpressiveConfig;
import com.cn.test.other.ExampleBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ExpressiveConfig.class)
public class TestSpringBean {

	@Autowired
	private ExampleBean exampleBean;
	
	@Test
	public void test() {
		//第一种写法
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//			    new ClassPathXmlApplicationContext(new String[] {"/resource/services.xml"});
//		MovieFinder movieFinder = context.getBean(MovieFinder.class);
//		System.out.println(movieFinder.testAutowird());
		//第二种写法：
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(MyServiceImpl.class, Dependency1.class, Dependency2.class);
		//第三种写法：
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//	    ctx.register(AppConfig.class, OtherConfig.class);
//	    ctx.register(AdditionalConfig.class);
//	    ctx.refresh();
//	    MyService myService = ctx.getBean(MyService.class);
		
		//第四种写法
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//		ctx.scan("com.cn.test");
//		ctx.refresh();
//		MovieFinder movieFinder_ = ctx.getBean(MovieFinder.class);
//		System.out.println(movieFinder_.testAutowird());
		System.out.println("~~~");
		System.out.println(exampleBean.getUltimateAnswer()+"----"+exampleBean.getYears());
		System.out.println("~~~");
		
	}

}
