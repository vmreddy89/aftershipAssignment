package com.shipment.tracking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.shipment.tracking"})
public class ShipmentTrackingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipmentTrackingApplication.class, args);
	}

}
