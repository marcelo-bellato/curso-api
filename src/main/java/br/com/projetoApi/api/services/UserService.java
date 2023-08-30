package br.com.projetoApi.api.services;

import br.com.projetoApi.api.domain.User;

import java.util.List;

public interface UserService {
    User findById(Integer id);
    List<User> findAll();
}
