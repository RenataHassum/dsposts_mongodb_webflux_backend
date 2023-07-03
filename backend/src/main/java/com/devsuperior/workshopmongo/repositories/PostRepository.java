package com.devsuperior.workshopmongo.repositories;

import com.devsuperior.workshopmongo.models.entities.Post;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.time.Instant;

@Repository
public interface PostRepository extends ReactiveMongoRepository<Post, String> {
    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    Flux<Post> searchTitle(String text);

    Flux<Post> findByTitleContainingIgnoreCase(String text);

    @Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }")
    Flux<Post> fullSearch(String text, Instant minDate, Instant maxDate);

    @Query("{ 'user' : ?0 }")
    Flux<Post> findByUser(ObjectId id);
}
