package com.prueba.comohogarh2.presenter;


import com.prueba.comohogarh2.entity.Benefit;
import com.prueba.comohogarh2.enums.TypeFormat;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientPresenter {

    private Integer clientId;


    private String name;
    private String email;
    private String phone;


    private TypeFormat groupId;


    private BenefitPresenter benefitPresent;
}
