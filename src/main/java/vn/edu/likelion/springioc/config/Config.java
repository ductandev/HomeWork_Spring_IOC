package vn.edu.likelion.springioc.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "vn.edu.likelion.springioc")
public class Config {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
