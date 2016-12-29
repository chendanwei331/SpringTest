package test.com.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.test.other.BeanConfig;
import com.cn.test.other.ComplexObject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/resource/Collections_Util.xml"})
public class TestSpringBean_util {
	
	@Test
	public void test() {
		//第一种写法
		ApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"/resource/Collections_Util.xml"});
		ComplexObject c = context.getBean("complexObject", ComplexObject.class);
		System.out.println(c.getSomeList());
		
	}

}
