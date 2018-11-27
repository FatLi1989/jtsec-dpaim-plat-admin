package domain;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDubboConfiguration
@EnableTransactionManagement
@ComponentScan (basePackages = {"com.jtsec.manager", "com.jtsec.common"})
@MapperScan ("com.jtsec.manager.mapper")
public class ManagerWebApplication {

	public static void main (String[] args) {
		SpringApplication.run (ManagerWebApplication.class, args);
	}
}
