package com.prueba.comohogarh2.presenter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JsonSkPresenter {

    private List<BenefitPresenter> sk_formato;
}
