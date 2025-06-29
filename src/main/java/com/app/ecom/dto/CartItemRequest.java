package com.app.ecom.dto;


import lombok.*;

@Getter@Setter@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CartItemRequest {

    private Long productId;
    private Integer quantity;

}
