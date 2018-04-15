package org.trianglex.webcrawler.common.config;

import org.springframework.context.annotation.Import;
import org.trianglex.common.config.WebConfig;
import org.trianglex.common.security.WebSecurityConfig;

@Import({WebConfig.class, WebSecurityConfig.class})
public class CommonConfig {
}
