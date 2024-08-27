package estudo.rest_springboot_application.service;

import estudo.rest_springboot_application.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
