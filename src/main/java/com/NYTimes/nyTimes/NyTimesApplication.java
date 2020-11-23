package com.NYTimes.nyTimes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class NyTimesApplication {
	private static final Logger log = LoggerFactory.getLogger(NyTimesApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NyTimesApplication.class, args);
	}


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			NyTimesTopStories quote = restTemplate.getForObject(
					"https://api.nytimes.com/svc/topstories/v2/home.json?api-key=", NyTimesTopStories.class);
			log.info(quote.toString());
		};
	}

}
