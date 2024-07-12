package com.generation.hooda.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidarPreco implements ConstraintValidator<ValidaPreco, Double> {

    @Override
    public boolean isValid(Double preco, ConstraintValidatorContext context) {
        return preco != null && preco > 0;
    }
}
