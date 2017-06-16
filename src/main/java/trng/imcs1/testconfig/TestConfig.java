package trng.imcs1.testconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import trng.imcs1.testBean.Department;

@Configuration
@Import({trng.imcs.config.SpringConfig.class})
@ComponentScan(basePackageClasses=Department.class)
public class TestConfig {

}
