package com.app.ecom.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link com.app.ecom.model.OrderItem}
 */

@Getter
@Setter@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO  {
    private Long id;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal subTotal;
}