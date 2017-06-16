package trng.imcs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"trng.imcs.bean","trng.imcs.operations"})
public class SpringConfig {

}
