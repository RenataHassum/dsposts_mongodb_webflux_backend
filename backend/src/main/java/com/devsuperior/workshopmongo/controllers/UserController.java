package com.devsuperior.workshopmongo.controllers;

import com.devsuperior.workshopmongo.models.dto.UserDTO;
import com.devsuperior.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public Flux<UserDTO> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Mono<ResponseEntity<UserDTO>> findById(@PathVariable String id) {
        return service.findById(id).map(userDTO -> ResponseEntity.ok(userDTO));
    }

    
//    @PostMapping
//    public ResponseEntity<UserDTO> insert(@RequestBody UserDTO obj) {
//        obj = service.insert(obj);
//        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//        return ResponseEntity.created(uri).body(obj);
//    }
//
//    @PutMapping(value="/{id}")
//    public ResponseEntity<UserDTO> update(@PathVariable String id, @RequestBody UserDTO obj) {
//        obj = service.update(id, obj);
//        return ResponseEntity.ok().body(obj);
//    }
//
//    @DeleteMapping(value="/{id}")
//    public ResponseEntity<Void> delete(@PathVariable String id) {
//        service.delete(id);
//        return ResponseEntity.noContent().build();
//    }
//
//    @GetMapping(value="/{id}/posts")
//    public ResponseEntity<List<PostDTO>> getUserPosts(@PathVariable String id) {
//        List<PostDTO> list = service.getUserPosts(id);
//        return ResponseEntity.ok().body(list);
//    }
}
