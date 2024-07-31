package lk.ijse.gdse.springintro.springintrose10.controller;

import lk.ijse.gdse.springintro.springintrose10.entity.Blog;
import lk.ijse.gdse.springintro.springintrose10.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/blog")

public class BlogController {

    @Autowired
    private BlogRepository blogRepository;


    @GetMapping("/hello")
    public String hello(){
    return "Hello World!";
    }

    @PostMapping("/number")
    public int getNumber(){
        return 10;
    }


    @PostMapping("/getnumber/{id}")
    public int getnumber(@PathVariable int id){
        return id;
    }

    @GetMapping("/object")
    public Object getObject() {
        Blog blog = new Blog();

        return blog;
    }

    @PostMapping("/savePost")
    public String savePost(@RequestBody Blog blog){
      blogRepository.save(blog);

        return "Post saved";

    }

    @GetMapping("/getAllPosts")
    public Iterable<Blog> getAllPosts(){
        return blogRepository.findAll();
    }
}
