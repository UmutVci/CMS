package com.backend.Application.Services.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends DataObject {
    private String name;
    private int age;
}
