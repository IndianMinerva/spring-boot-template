package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static com.example.demo.util.ObjectMapperUtil.getMapper;
import static com.example.demo.util.ObjectMapperUtil.getTypeFactory;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = DemoApplication.class)
@AutoConfigureMockMvc
@EnableAutoConfiguration
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetAllUsers() throws Exception {
        String jsonString = this.mockMvc
                .perform(get("/users"))
                .andExpect(status().isOk())
                .andReturn().getResponse()
                .getContentAsString();

        List<User> users = getMapper().readValue(
                jsonString,
                getTypeFactory().constructCollectionType(List.class, User.class)
        );
        Assert.assertEquals(1, users.size());
    }
}
