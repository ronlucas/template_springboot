package com.lron.template.entities;

import org.hibernate.annotations.Type;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public class EntityWIthUUID {
    @Id
    @Type(type = "pg-uuid")
    private UUID id;

    public EntityWIthUUID(){
        this.id = UUID.randomUUID();
    }
}
