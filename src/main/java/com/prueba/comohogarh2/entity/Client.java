package com.prueba.comohogarh2.entity;

import com.prueba.comohogarh2.enums.TypeFormat;
import com.sun.istack.NotNull;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer clientId;

    @Column(unique = true)
    private String name;
    private String email;
    private String phone;


    //@Enumerated(EnumType.STRING)
    private String groupId;

    @OneToOne(mappedBy = "client",
            fetch = FetchType.EAGER)
    private Benefit benefit;

}
