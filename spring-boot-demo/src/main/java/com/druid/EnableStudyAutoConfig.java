package com.druid;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(StudyAutoConfig.class)
public @interface EnableStudyAutoConfig {
}
