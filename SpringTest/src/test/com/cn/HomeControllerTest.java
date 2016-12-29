package test.com.cn;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import com.cn.test.web.HomeController;

public class HomeControllerTest {

	@Test
	public void testHome() throws Exception {
		HomeController homeController= new HomeController();
		MockMvc mockMvc = standaloneSetup(homeController).build();
		mockMvc.perform(get("/home/test")).andExpect(view().name("test"));
	}

}
