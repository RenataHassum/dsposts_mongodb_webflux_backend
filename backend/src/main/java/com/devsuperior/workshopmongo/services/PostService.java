package com.devsuperior.workshopmongo.services;

import com.devsuperior.workshopmongo.models.dto.PostDTO;
import com.devsuperior.workshopmongo.repositories.PostRepository;
import com.devsuperior.workshopmongo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public Mono<PostDTO> findById(String id) {
        return repository.findById(id)
                .map(existingPost -> new PostDTO(existingPost))
                .switchIfEmpty(Mono.error(new ResourceNotFoundException("Recurso não encontrado")));
    }

    public Flux<PostDTO> findByTitle(String text) {
        return repository.searchTitle(text).map(postFound -> new PostDTO(postFound));
    }

//    public List<PostDTO> fullSearch(String text, String start, String end) {
//        Instant startMoment = convertMoment(start, Instant.ofEpochMilli(0L));
//        Instant endMoment = convertMoment(end, Instant.now());
//        List<Post> list = repository.fullSearch(text, startMoment, endMoment);
//        return list.stream().map(PostDTO::new).collect(Collectors.toList());
//    }
//
//    private Instant convertMoment(String originalText, Instant alternative) {
//        try {
//            return Instant.parse(originalText);
//        }
//        catch (DateTimeParseException e) {
//            return alternative;
//        }
//    }
}
