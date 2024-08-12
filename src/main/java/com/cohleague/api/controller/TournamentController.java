package com.cohleague.api.controller;

import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cohleague.api.dto.TournamentDTO;

@RestController
public class TournamentController {
    static Logger logger = Logger.getLogger("TournamentController");

    @PostMapping("/newTournament")
    public ResponseEntity<String> createNewTournament(@RequestBody TournamentDTO newTournament){
        try{
            return new ResponseEntity<>("Tournament created successfully", HttpStatus.OK);
        } catch (Exception e) {
            logger.info("Error saving new tournament:: " + e.toString());
            return new ResponseEntity<>("Error saving new tournament", HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    //update/edit/methods needed
    //delete?
}
