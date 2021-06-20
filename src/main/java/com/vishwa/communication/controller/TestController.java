package com.vishwa.communication.controller;

import com.vishwa.communication.models.Post;
import com.vishwa.communication.services.JSONPlaceHolderService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

   @Autowired
   private JSONPlaceHolderService jsonPlaceHolderService ;

   @GetMapping("/posts")
   public ResponseEntity getAllPosts(){
     List<Post> posts = jsonPlaceHolderService.getPosts();
     return new ResponseEntity(posts, HttpStatus.OK);
   }


}
