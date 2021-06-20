package com.vishwa.communication.services;

import com.vishwa.communication.models.Post;
import java.util.List;


public interface JSONPlaceHolderService {

  List<Post> getPosts();

  Post getPostById(Long id);
}
