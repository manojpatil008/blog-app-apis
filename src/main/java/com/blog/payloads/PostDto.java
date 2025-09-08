package com.blog.payloads;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.blog.entities.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {
	private Integer id;
	private String postTitle;
	private String postContent;
	private String postImage;
	private Date addedDate;
	private CategoryDto category;
	private UserDto user;
	private Set<CommentDto> postComments = new HashSet<>();
}
