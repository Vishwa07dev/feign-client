package com.vishwa.communication.services;

import com.vishwa.communication.clients.JSONPlaceHolderClient;
import com.vishwa.communication.models.Post;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class JSONPlaceHolderServiceImpl implements JSONPlaceHolderService{
  @Autowired
  private JSONPlaceHolderClient jsonPlaceHolderClient;

  @Override
  public List<Post> getPosts() {
    return jsonPlaceHolderClient.getPosts();
  }

  @Override
  public Post getPostById(Long id) {
    return jsonPlaceHolderClient.getPostById(id);
  }
}
