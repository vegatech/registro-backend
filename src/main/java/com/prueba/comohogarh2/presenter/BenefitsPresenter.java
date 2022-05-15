package com.prueba.comohogarh2.presenter;

import com.prueba.comohogarh2.entity.Benefit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BenefitsPresenter implements Serializable {
    private List<BenefitPresenter> beneficios;
}
