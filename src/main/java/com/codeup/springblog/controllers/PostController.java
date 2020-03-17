package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class PostController {

    //Below are from the VIEWS exercise
    @GetMapping("/posts")
    public String getPosts(Model model){
        ArrayList<Post> postList = new ArrayList<>();
        postList.add(new Post(2, "Second Post", "This is the content of my second post"));
        postList.add(new Post(3, "Third Post", "This is the content of my third post"));
        model.addAttribute("posts", postList);
        return "posts/index";
    }


    @RequestMapping(path = "/posts/{id}")
    public String getPost(@PathVariable int id, Model model) {
        Post firstPost = new Post(1, "First Post", "Today was the first day of remote learning. Would not recommend.");
        model.addAttribute("title", firstPost.getTitle());
        model.addAttribute("body", firstPost.getBody());
        return "posts/show";
    }

    //same as previous exercise
    @GetMapping("/posts/create")
    @ResponseBody
    public String createPostForm(){
        return "This is the form for creating a page!";
    }


    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPost() {
        return "Create a post here!";
    }


    @RequestMapping(path="/posts", method=RequestMethod.DELETE)
    @ResponseBody
    public String delete(){
        return "DELETE!!";
    }





//    //Below are from controllers exercise
//    //    GET	/posts	posts index page
//    @GetMapping("/posts")
//    @ResponseBody
//    public String postIndexPage(){
//        return "This is my blog page!";
//    }
//
//
//    //    GET	/posts/{id}	view an individual post
//    //will change to an object later probably
//    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
//    @ResponseBody
//    public String individualPost(@PathVariable String id) {
//        return "This is the page for an individual post titled: " + id;
//    }
//
//
//    //    GET	/posts/create	view the form for creating a post
//    @GetMapping("/posts/create")
//    @ResponseBody
//    public String createIndexPage(){
//        return "Create a post here!";
//    }
//
//
//    //    POST	/posts/create	create a new post
//    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
//    public String createPostForm() {
//        return "This is the form for creating a page!";
//    }
}
