package com.devsuperior.workshopmongo.services;

import com.devsuperior.workshopmongo.models.dto.PostDTO;
import com.devsuperior.workshopmongo.models.dto.UserDTO;
import com.devsuperior.workshopmongo.models.entities.User;
import com.devsuperior.workshopmongo.repositories.UserRepository;
import com.devsuperior.workshopmongo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public Flux<UserDTO> findAll() {
        return repository.findAll().map(user -> new UserDTO(user));
    }

    public Mono<UserDTO> findById(String id) {
        return repository.findById(id)
                .map(existingUser -> new UserDTO(existingUser))
                .switchIfEmpty(Mono.error(new ResourceNotFoundException("Recurso não encontrado")));
    }
//
//    public UserDTO insert(UserDTO dto) {
//        User entity = new User();
//        copyDtoToEntity(dto, entity);
//        entity = repository.insert(entity);
//        return new UserDTO(entity);
//    }
//
//    public UserDTO update(String id, UserDTO dto) {
//        User entity = getEntityById(id);
//        copyDtoToEntity(dto, entity);
//        entity = repository.save(entity);
//        return new UserDTO(entity);
//    }
//
//    public void delete(String id) {
//        getEntityById(id);
//        repository.deleteById(id);
//    }
//
//    public List<PostDTO> getUserPosts(String id) {
//        User user = getEntityById(id);
//        return user.getPosts().stream().map(PostDTO::new).collect(Collectors.toList());
//    }
//
//    private User getEntityById(String id) {
//        Optional<User> result = repository.findById(id);
//        return result.orElseThrow(() -> new ResourceNotFoundException("Objeto não encontrado"));
//    }
//
//    private void copyDtoToEntity(UserDTO dto, User entity) {
//        entity.setName(dto.getName());
//        entity.setEmail(dto.getEmail());
//    }

}
