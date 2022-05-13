package com.prueba.comohogarh2.entity;

import com.prueba.comohogarh2.enums.TypeFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clients")
public class Client {

    @Id
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private TypeFormat group;

    @OneToOne()
    private Benefit benefit ;

}
