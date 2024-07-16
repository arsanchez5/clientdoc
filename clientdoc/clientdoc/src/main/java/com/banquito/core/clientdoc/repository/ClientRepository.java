package com.banquito.core.clientdoc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banquito.core.clientdoc.model.Client;

public interface ClientRepository  extends MongoRepository<Client, String> {

    Client findFirstByIdentificationTypeAndIdentification(String identificationType, String identification);

    Client findFirsByEmail(String email);

    List<Client> findByLastNameLikeOrderByLastName(String lastName);
}
