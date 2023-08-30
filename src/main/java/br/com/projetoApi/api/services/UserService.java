package br.com.projetoApi.api.services;

import br.com.projetoApi.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
