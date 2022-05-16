package com.prueba.comohogarh2.service.impl;

import com.prueba.comohogarh2.entity.Client;
import com.prueba.comohogarh2.presenter.BenefitPresenter;
import com.prueba.comohogarh2.presenter.ClientPresenter;
import com.prueba.comohogarh2.repository.ClientRepository;
import com.prueba.comohogarh2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    private ClientRepository clientRepository;


    @Override
    public List<ClientPresenter> getAllClient() {
        List<ClientPresenter> clients = new ArrayList<>();
        Iterable<Client> iterator = clientRepository.findAll();
        iterator.forEach(client -> clients.add(toPresenter(client)));
        return clients;

    }

    public ClientPresenter toPresenter(Client client) {

        BenefitPresenter benefitPresenter = BenefitPresenter.builder()
                .beneficio(client.getBenefit().getBeneficio())
                .build();
        return ClientPresenter.builder()
                .clientId(client.getClientId())
                .groupId(client.getGroupId())
                .name(client.getName())
                .phone(client.getPhone())
                .email(client.getEmail())
                .benefitPresent(benefitPresenter)
                .build();
    }
}
