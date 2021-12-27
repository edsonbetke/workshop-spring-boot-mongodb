package com.edsonb.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edsonb.workshopmongo.domain.Post;
import com.edsonb.workshopmongo.domain.User;
import com.edsonb.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService service;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = service.findById(id);

		return ResponseEntity.ok().body(obj);
	}

////	@PostMapping
//	@RequestMapping(method = RequestMethod.POST)
//	public ResponseEntity<Void> insert(@RequestBody UserDTO objDto) {
//		User obj = service.fromDTO(objDto);
//		obj = service.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
//	public ResponseEntity<Void> delete(@PathVariable String id) {
//		service.delete(id);
//
//		return ResponseEntity.noContent().build();
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
//	public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id) {
//		User obj = service.fromDTO(objDto);
//		obj.setId(id);
//		obj = service.update(obj);
//
//		return ResponseEntity.noContent().build();
//	}
//
//	@RequestMapping(value = "/{id}/posts", method = RequestMethod.GET)
//	public ResponseEntity<List<Post>> findPosts(@PathVariable String id) {
//		User obj = service.findById(id);
//
//		return ResponseEntity.ok().body(obj.getPosts());
//	}
}
