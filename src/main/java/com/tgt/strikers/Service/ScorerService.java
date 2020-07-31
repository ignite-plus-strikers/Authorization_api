package com.tgt.strikers.Service;

import com.tgt.strikers.Exception.ScorerNotFoundException;
import com.tgt.strikers.Repository.ScorerRepository;
import com.tgt.strikers.model.Scorer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ScorerService {

    @Autowired
    private ScorerRepository scorerRepository;


    public Scorer createScorer(Scorer scorer){
        return scorerRepository.save(scorer);
    }


    public String validateLogin(Scorer login) {

        Optional<Scorer> optionalScorer = scorerRepository.findById(login.getScorer_email());
        if(!optionalScorer.isPresent())
            throw new ScorerNotFoundException("Scorer Not Found");
        Scorer temp = optionalScorer.get();
        if(login.getScorer_password().equals(temp.getScorer_password()))
            return "Welcome Scorer "+temp.getScorer_firstname()+" !";
        else
            throw new ScorerNotFoundException("Invalid Password");
    }

}
