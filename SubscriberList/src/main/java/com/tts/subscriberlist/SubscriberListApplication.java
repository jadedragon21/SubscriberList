package com.tts.subscriberlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.tts.subscriberlist.subscriber.Subscriber;
import com.tts.subscriberlist.subscriber.SubscriberRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SubscriberListApplication {
	private static final Logger log = LoggerFactory.getLogger(SubscriberListApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SubscriberListApplication.class, args);
	}

	//	@Bean
//	public CommandLineRunner demo(SubscriberRepository repository) {
//		return (args) -> {
	// save a couple of customers
//			repository.save(new Subscriber("Michael", "Smith"));
//			repository.save(new Subscriber("Aaron", "Moon"));
//			repository.save(new Subscriber("Kim", "Lassiter"));
//			repository.save(new Subscriber("Joan", "Daniels"));
//			repository.save(new Subscriber("Eric", "Patterson"));


	// read all customers
//			log.info("Customers found with findAll():");
//			log.info("-------------------------------");
//			for (Subscriber subscriber : repository.findByFirstName(subscriber.getFirstName())) {
//				log.info(subscriber.toString());
//			}
//			log.info("");
//
//			// read an individual customer by ID
//			repository.findById(1L)
//					.ifPresent(customer -> {
//						log.info("Customer found with findById(1L):");
//						log.info("--------------------------------");
//						log.info(customer.toString());
//						log.info("");
//					});

	// read customers by first name
//			log.info("Subscriber found with findByFirstName('Patterson'):");
//			log.info("--------------------------------------------");
//			String firstName = null;
//			repository.findByFirstName(firstName).forEach(bauer -> {
//				log.info(bauer.toString());
//
//			});
//
//			log.info("");
//		};
	//}
}
