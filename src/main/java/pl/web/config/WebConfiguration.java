package pl.web.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
@EntityScan("pl.engine.model")
@EnableJpaRepositories("pl.engine.repository")
@ComponentScan({"pl.engine.service", "pl.web.view.controller"})
public class WebConfiguration extends WebMvcConfigurerAdapter {
}
