package com.devsuperior.workshopmongo.services;

import com.devsuperior.workshopmongo.models.dto.PostDTO;
import com.devsuperior.workshopmongo.models.entities.Post;
import com.devsuperior.workshopmongo.repositories.PostRepository;
import com.devsuperior.workshopmongo.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

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

 	public Flux<PostDTO> fullSearch(String text, Instant minDate, Instant maxDate) {
		maxDate = maxDate.plusSeconds(86400);
		return repository.fullSearch(text, minDate, maxDate)
				.map(postFound -> new PostDTO(postFound));
	}

}
