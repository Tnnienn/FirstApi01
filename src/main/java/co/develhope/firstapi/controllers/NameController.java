package co.develhope.firstapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("name")
public class NameController {

    @GetMapping()
    public String getName() {
        return "Antonio";
    }

    @PostMapping()
    public String postName() {
        StringBuilder sb = new StringBuilder();
        sb.append("Antonio");
        return sb.reverse().toString();
    }

}
