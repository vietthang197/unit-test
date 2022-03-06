package vn.neo.controller;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import vn.neo.dao.impl.UserInfoDAOImpl;
import vn.neo.dto.UserInfoDto;
import vn.neo.services.impl.UserServiceImpl;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTest {
    private Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private UserInfoDAOImpl userInfoDAO;

    @InjectMocks
    private UserServiceImpl userService;

    @Test
    public void doHelloWorld_Success() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.request(
                HttpMethod.GET,
                "/hello-world"
        ).accept("application/json");
        ResultActions resultActions = mockMvc.perform(request);
        MvcResult mvcResult = resultActions
                .andExpect(MockMvcResultMatchers.status().is2xxSuccessful())
                .andReturn();
        Assert.assertEquals(mvcResult.getResponse().getContentAsString(), "HelloWorld");
    }

    @Test
    public void testFindUser() {
        Mockito.when(userInfoDAO.findOneUserInfo()).thenReturn(new UserInfoDto("ahihi", "bi fake roi"));
        System.out.println(userInfoDAO);
        logger.info("{}", userService.findOneUserInfo());
    }

    @Test
    public void testFindUser2() {
        Mockito.when(userInfoDAO.findOneUserInfo()).thenReturn(new UserInfoDto("ahihi2", "bi fake roi2"));
        System.out.println(userInfoDAO);
        logger.info("{}", userService.findOneUserInfo());
    }
}
