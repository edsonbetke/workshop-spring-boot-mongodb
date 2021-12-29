package com.edsonb.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edsonb.workshopmongo.domain.Post;
import com.edsonb.workshopmongo.repository.PostRepository;
import com.edsonb.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato!"));
	}

	public List<Post> findByTitle(String text) {
		return repo.findByTitleContainingIgnoreCase(text);
	}

}
