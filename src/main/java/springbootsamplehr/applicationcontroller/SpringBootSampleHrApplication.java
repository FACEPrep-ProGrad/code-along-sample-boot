package springbootsamplehr.applicationcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "springbootsamplehr.controller" })
@EntityScan("springbootsamplehr.model")
@EnableJpaRepositories("springbootsamplehr.dao")
public class SpringBootSampleHrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleHrApplication.class, args);
	}

}
