package com.test.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exchange {
    private Long id;
    private String name;
    private String county;
    private String website;
    private String description;
    private boolean isActive;
    private Long founded;
}
