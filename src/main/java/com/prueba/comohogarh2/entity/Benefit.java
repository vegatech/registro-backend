package com.prueba.comohogarh2.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name="benefits")
public class Benefit {

    @Id
    private Integer id;

    @Column(unique = true)
    private String beneficio;

    @OneToOne
    private Client client;

    @Builder.Default
    private Boolean status = true;


}
