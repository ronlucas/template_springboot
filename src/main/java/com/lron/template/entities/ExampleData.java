package com.lron.template.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExampleData extends EntityWIthUUID{
    private String name;
    private String description;
}
