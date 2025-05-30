package com.picktory.domain.gift.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public abstract class AbstractGiftRequest implements GiftImageRequest {
    private Long id;

    @NotNull
    private String name;
    private String message;
    private String purchaseUrl;
    private List<String> imageUrls;
}
