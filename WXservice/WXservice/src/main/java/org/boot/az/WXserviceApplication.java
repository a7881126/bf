package org.boot.az;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
/**
* 全局配置 对mapper接口扫描
*/
@MapperScan("org.boot.az.mapper")
public class WXserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WXserviceApplication.class, args);
	}

}

