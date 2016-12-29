package test.com.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.test.service.IPerformanceService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/resource/aop_aspect.xml"})
public class TestSpringBean_Aspect {

	@Autowired
	private IPerformanceService performanceService;
	
	@Test
	public void test() {
		System.out.println(performanceService.testPerformence()+"~~~");
	}

}
