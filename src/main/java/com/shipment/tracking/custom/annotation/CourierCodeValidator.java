package com.shipment.tracking.custom.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Arrays;
import java.util.List;

/**
 * Couried code validator
 *
 * @Author : Malli
 */

public class CourierCodeValidator implements ConstraintValidator<ValidCourierCodeCategory, String> {

    private static final List<String> availableCourierCodes = Arrays.asList("FedEx", "UPS", "USPS");

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

       return availableCourierCodes.contains(value);

    }

}