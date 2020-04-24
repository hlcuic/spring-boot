package com.druid;

import com.model.PersonConfig;
import com.model.PersonModel;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(PersonConfig.class)
@ConditionalOnProperty(prefix = "study",name="enable",havingValue = "true")
public class StudyAutoConfig {


	@Bean
	public PersonModel personModel(){
		return new PersonModel();
	}

}
