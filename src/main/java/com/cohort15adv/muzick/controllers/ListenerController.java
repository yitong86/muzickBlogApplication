package com.cohort15adv.muzick.controllers;


import com.cohort15adv.muzick.models.Listener;
import com.cohort15adv.muzick.repositories.ListenerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/listeners")
public class ListenerController {
    @Autowired
    private ListenerRepository listenerRepository;
    @GetMapping("/test")
    public ResponseEntity<?> testRoute() {
        return new ResponseEntity<String>("Hello World", HttpStatus.OK);
    }
    //create read update delete
    @PostMapping("/")
    public ResponseEntity<Listener> createListener(@RequestBody Listener newListener){
        Listener listener = listenerRepository.save(newListener);


        return new ResponseEntity<>(listener,HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Listener>> getAllListeners(){
      List<Listener> listener =  listenerRepository.findAll();
      return new ResponseEntity<>(listener,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Listener> getOneListener(@PathVariable Long id){
        //listenerRepository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
        Optional<Listener> maybeListener = listenerRepository.findById(id);
        if(maybeListener.isEmpty()){
            return new ResponseEntity<Listener>(HttpStatus.NOT_FOUND);

        }
        return new ResponseEntity<>(maybeListener.get(),HttpStatus.OK);
    }
    }

