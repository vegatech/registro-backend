package com.prueba.comohogarh2.service;
import java.util.*;

import com.prueba.comohogarh2.entity.Client;
import com.prueba.comohogarh2.presenter.ClientPresenter;

public interface ClientService {

    Client save(Client client);
    List<ClientPresenter> getAllClient();
}

