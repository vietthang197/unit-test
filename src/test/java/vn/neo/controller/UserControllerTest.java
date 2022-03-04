package vn.neo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpMethod;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void doHelloWorld_Success() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.request(
                HttpMethod.GET,
                "/hello-world"
        ).accept("application/json");
        ResultActions resultActions = mockMvc.perform(request);
        MvcResult mvcResult = resultActions
                .andExpect(MockMvcResultMatchers.status().is4xxClientError())
                .andReturn();
        Assert.assertEquals(mvcResult.getResponse().getContentAsString(), "HelloWorld");
    }
}
