package com.hcs.peach.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.hcs.peach.common.CorsConfig;
import com.hcs.peach.common.WebSecurityConfig;


@SpringBootApplication

@Import({WebSecurityConfig.class,CorsConfig.class,/*WxFilter.class,ApiFilter.class*/})
//@EnableConfigurationProperties({StorageProperties.class,GlobalProperties.class})
@EnableScheduling

@EntityScan({
	"com.hcs.peach.common",
	"com.hcs.peach.customer",
	"com.hcs.peach.integral",
	"com.hcs.peach.pay",
	"com.hcs.peach.shop",
	"com.hcs.peach.logistic"
})
@EnableJpaRepositories({
	"com.hcs.peach.common",
	"com.hcs.peach.customer",
	"com.hcs.peach.integral",
	"com.hcs.peach.pay",
	"com.hcs.peach.shop",
	"com.hcs.peach.logistic"
})
@ComponentScan({
	"com.hcs.peach.common",
	"com.hcs.peach.customer",
	"com.hcs.peach.integral",
	"com.hcs.peach.pay",
	"com.hcs.peach.shop",
	"com.hcs.peach.logistic"
})

public class PeachApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeachApplication.class, args);
	}
}
