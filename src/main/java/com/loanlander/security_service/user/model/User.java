package com.loanlander.security_service.user.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@EqualsAndHashCode
public class User {
    @Id
    private String username ;
    private String password ;
}
