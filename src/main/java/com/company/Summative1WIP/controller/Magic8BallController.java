package com.company.Summative1WIP.controller;


import java.lang.Math;

import com.company.Summative1WIP.models.Answer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Magic8BallController {

    private List<Answer> answers = new ArrayList<Answer>();
    private static int idCounter = 1;

    public Magic8BallController(){
        //sample data for route
        answers.add(new Answer("It is certain",idCounter++));
        answers.add(new Answer("It is decidedly so",idCounter++));
        answers.add(new Answer("Without a doubt",idCounter++));
        answers.add(new Answer("Outlook not so good",idCounter++));
        answers.add(new Answer("Most likely",idCounter++));
        answers.add(new Answer("Cannot predict now",idCounter++));
        answers.add(new Answer("Ask again later",idCounter++));
        answers.add(new Answer("My reply is no",idCounter++));
        answers.add(new Answer("You may rely on it",idCounter++));
        answers.add(new Answer("Dalonte is not 6ft",idCounter++));

    }


    //gets a question from user and returns an answer
    @RequestMapping(value = "/magic",method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer returnAnswer(@RequestBody Answer question){
        int rand = (int) (Math.random() * 10);

        Answer temp = answers.get(rand);
        temp.setQuestion(question.getQuestion());

        return temp;

    }


}
