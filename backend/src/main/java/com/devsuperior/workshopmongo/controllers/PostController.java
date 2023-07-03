package com.devsuperior.workshopmongo.controllers;

import com.devsuperior.workshopmongo.models.dto.PostDTO;
import com.devsuperior.workshopmongo.models.dto.UserDTO;
import com.devsuperior.workshopmongo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping(value = "/{id}")
    public Mono<ResponseEntity<PostDTO>> findById(@PathVariable String id) {
        return service.findById(id).map(postDTO -> ResponseEntity.ok(postDTO));
    }
}

//
//    @GetMapping(value = "/titlesearch")
//    public ResponseEntity<List<PostDTO>> findByTitle(@RequestParam(value = "text", defaultValue = "") String text) {
//        List<PostDTO> list = service.findByTitle(text);
//        return ResponseEntity.ok().body(list);
//    }
//
//    @GetMapping(value = "/fullsearch")
//    public ResponseEntity<List<PostDTO>> fullSearch(
//            @RequestParam(value = "text", defaultValue = "") String text,
//            @RequestParam(value = "start", defaultValue = "") String start,
//            @RequestParam(value = "end", defaultValue = "") String end) {
//        List<PostDTO> list = service.fullSearch(text, start, end);
//        return ResponseEntity.ok().body(list);
//    }
//}