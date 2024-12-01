package com.example.profile;

import com.example.profile.Dto.AccountsContectInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {AccountsContectInfoDto.class})
public class ProfileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProfileApplication.class, args);
	}

}
