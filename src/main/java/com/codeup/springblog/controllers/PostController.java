package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    //    GET	/posts	posts index page
    @GetMapping("/posts")
    @ResponseBody
    public String postIndexPage(){
        return "This is my blog page!";
    }
    //    GET	/posts/{id}	view an individual post
    //will change to an object later probably
    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    @ResponseBody
    public String individualPost(@PathVariable String id) {

        return "This is the page for an individual post titled: " + id;
    }
    //    GET	/posts/create	view the form for creating a post
    @GetMapping("/posts/create")
    @ResponseBody
    public String createIndexPage(){
        return "Create a post here!";
    }
    //    POST	/posts/create	create a new post
    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPostForm() {
        return "This is the form for creating a page!";
    }
}
