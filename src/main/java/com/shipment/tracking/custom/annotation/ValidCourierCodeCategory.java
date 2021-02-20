package com.shipment.tracking.custom.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = {CourierCodeValidator.class})
public @interface ValidCourierCodeCategory {


    String message() default "Courier code must be in {FedEx , USPS, UPS}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
