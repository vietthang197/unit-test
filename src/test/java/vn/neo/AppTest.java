package vn.neo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.neo.services.AccountService;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AppTest {
    private final Logger logger = LoggerFactory.getLogger(AppTest.class);
    private ObjectMapper mapper;

    public AppTest() {
    }

    @Mock
    private AccountService  acc;

    @Before
    public void setup1() {
        mapper = new ObjectMapper();
        logger.info("Before all test case");
    }

    @Test
    public void contextLoads() throws Exception {
        logger.info("mapper: {}", mapper);
        Mockito.when(acc.test1(2)).thenReturn("OK");

        List<String> str = Mockito.mock(List.class);
        Mockito.when(str.get(Mockito.anyInt())).thenReturn(String.valueOf(Math.random()));
        Mockito.when(str.size()).thenReturn(5);
        logger.info("Data size: {}", str.size());
        logger.info("Data item: {}", str.get(2));

        List<String> str2 = Mockito.mock(List.class);
        String a = str2.get(0);
        String b = str2.get(1);

        Mockito.verify(str2, Mockito.atMost(3));

        Assertions.assertEquals("OK", acc.test1(2));
    }

//    @Test
//    public void contextLoads2() throws Exception {
//        logger.info("mapper: {}", mapper);
//        Mockito.when(acc.test1(3)).thenReturn("NOK");
//        Assertions.assertEquals("NOK", acc.test1(3));
//    }
//
//    @Test
//    public void contextLoads3() throws Exception {
//        logger.info("mapper: {}", mapper);
//        Mockito.when(acc.test1(4)).thenReturn("NOK");
//        Assertions.assertEquals("OK", acc.test1(4));
//    }

}
