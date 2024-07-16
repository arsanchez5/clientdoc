package com.banquito.core.clientdoc.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Phone {

    private String type;
    private String number;
    private Boolean isDefault;
}
