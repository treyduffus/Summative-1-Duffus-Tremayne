package com.company.Summative1WIP.controller;

import com.company.Summative1WIP.models.Definition;


import java.lang.Math;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WordController {


    private List<Definition> Words = new ArrayList<>();
    private static int idCounter = 1;


    public WordController(){
        //sample data for route

        Words.add(new Definition("Vamoose","to depart quickly",idCounter++));
        Words.add(new Definition("Numinous","having a mysterious, holy, or spiritual quality",idCounter++));
        Words.add(new Definition("Sagacious","of keen and farsighted penetration and judgment; discerning",idCounter++));
        Words.add(new Definition("Savant","a person with great skill or knowledge in a particular subject",idCounter++));
        Words.add(new Definition("Doctrinaire", "a person who is stubbornly devoted to a principle or belief",idCounter++));
        Words.add(new Definition("Wangle","manage to obtain (something) by persuading or cleverly manipulating someone",idCounter++));
        Words.add(new Definition("Knackered","tired or exhausted",idCounter++));
        Words.add(new Definition("Rapscallion","someone who causes trouble, often in a mischievous way",idCounter++));
        Words.add(new Definition("Serendipity", "the occurrence and development of events by chance in a happy or beneficial way.",idCounter++));
        Words.add( new Definition("Magnanimous","having or showing a generous and kind nature",idCounter++));

    }

    //returns random word to the user
    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getWordofday(){
        int rand = (int) (Math.random() * 10);

        return Words.get(rand);

    }
}
