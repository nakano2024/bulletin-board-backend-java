package kotetsu.idp.adapter.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/testing")
    public ResponseEntity<?> getTest() {
        return ResponseEntity.ok("healthy");
    }    
}
