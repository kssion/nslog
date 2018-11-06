package cc.app.nslog.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/simple")
public class SimpleController {

    @GetMapping("info")
    public String info() {
        return "hello world!";
    }

}
