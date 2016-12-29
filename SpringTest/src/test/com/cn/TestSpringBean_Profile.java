package test.com.cn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cn.test.other.SimpleMovieLister;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/resource/services_profile.xml"})
@ActiveProfiles("dev")
public class TestSpringBean_Profile {

	@Autowired
	private SimpleMovieLister simpleMovieLister;
	
	@Test
	public void test() {
		simpleMovieLister.testAutowired();
	}
}
