package com.company.Summative1WIP.controller;

import com.company.Summative1WIP.models.Answer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallController.class)

public class Magic8BallControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();


    @Test
    public void ShouldReturnAnAnswer() throws Exception{

        //Acts as the request body
        Answer question = new Answer();
        question.setQuestion("test");

        //converts Java to Json
        String inputJson = mapper.writeValueAsString(question);

        mockMvc.perform(post("/magic").content(inputJson).contentType(MediaType.APPLICATION_JSON) )
                .andDo(print())
                .andExpect(status().isCreated());

    }



}
