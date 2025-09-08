package com.blog.services;

import java.util.List;

import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

public interface PostService {
	
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	PostDto updatePost(PostDto postDto, Integer postId);
	
	void deletePost(Integer postId);
	
	PostDto getByPostId(Integer postId);
	
	PostResponse getAllPosts(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//Get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId, Integer pageNumber, Integer pageSize);
	
	//Get all posts by user
	List<PostDto> getPostsByUser(Integer userId);
	
	//search posts by keyword
	List<PostDto> searchPosts(String keyword);
}
