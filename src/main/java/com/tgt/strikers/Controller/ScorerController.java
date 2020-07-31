package com.tgt.strikers.Controller;

import com.tgt.strikers.Service.ScorerService;
import com.tgt.strikers.model.Scorer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScorerController {

    @Autowired
    private ScorerService scorerService;

    @PostMapping("/scorer")
    public Scorer createScorer(@RequestBody Scorer scorer){
        return scorerService.createScorer(scorer);
    }

    @PostMapping("/scorer/login")
    public String validateLogin(@RequestBody Scorer scorer){
        return scorerService.validateLogin(scorer);
    }

}