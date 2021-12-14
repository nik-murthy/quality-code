package integration.com.example.demo;

import com.example.demo.DemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = {DemoApplication.class})
class DemoApplicationTests {

  @Test
  void contextLoads() {

  }

}
