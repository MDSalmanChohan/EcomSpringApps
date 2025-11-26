package com.example.EcomSpringApps.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
