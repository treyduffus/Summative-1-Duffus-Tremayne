package com.company.Summative1WIP.controller;

import com.company.Summative1WIP.models.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuoteController {
    private List<Quote> quoteList;

    private static int idCounter = 1;



    public QuoteController() {
        //sample data for route


        quoteList = new ArrayList<>();
        quoteList.add(new Quote("Jordan Peterson", "Assume that the person you are listening to knows something you don't.", idCounter++));
        quoteList.add(new Quote("Sun Tzu", "The enemy of my enemy is my friend.", idCounter++));
        quoteList.add(new Quote("Walt Disney", "The way to get started is to quit talking and begin doing.", idCounter++));
        quoteList.add(new Quote("John Lennon", "Life is what happens when you're busy making other plans.", idCounter++));
        quoteList.add(new Quote("Dr. Seuss", "Today you are you. That is truer than true. There is no one alive, who is you-er than you!", idCounter++));
        quoteList.add(new Quote("Eleanor Roosevelt", "The future belongs to those who believe the beauty of their dreams.", idCounter++));
        quoteList.add(new Quote("Anne Frank", "Whoever is happy will make others happy too.", idCounter++));
        quoteList.add(new Quote("Aristotle", "It is during our darkest moments that we must focus to see the light.", idCounter++));
        quoteList.add(new Quote("Jesus Christ", "Therefore, do not worry about tomorrow, for tommorrow will worry about itself. Each day has enough trouble of its own.", idCounter++));
        quoteList.add(new Quote("Ralph Waldo Emerson", "Do not go where the path may lead, go instead where there is no path and leave a trail.", idCounter++));
    }

    //returns random quote to user
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuote() {
        int rand = (int) (Math.random() * 10);
        return quoteList.get(rand);
    }

}
