package com.anshuman.axonframework.command.api.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.AggregateIdentifier;

import java.math.BigDecimal;

@Data
@Builder
public class CreateProductCommand {
    @AggregateIdentifier
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
