package vn.neo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import vn.neo.services.AccountService;

import java.util.List;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class App2Test {
    private Logger logger = LoggerFactory.getLogger(App2Test.class);

    @MockBean
    private AccountService accountService;

    private List<String> listDataMoc = Mockito.mock(List.class);

    @Test
    public void test1() {
        Mockito.when(accountService.test1(Mockito.anyInt())).thenReturn("OK");
        Mockito.when(accountService.test1(Mockito.anyInt())).thenReturn("OK");
        Assert.assertEquals(accountService.test1(2), "OK");
        Assert.assertEquals(accountService.test1(2), "OK");
        Assert.assertEquals(accountService.test1(2), "OK");
    }

    @Test
    public void argumentCapturing() {
        listDataMoc.add("abc");
        listDataMoc.add("ffffffffff");
        // argument captor
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        Mockito.verify(listDataMoc, Mockito.atMost(10)).add(captor.capture());
       logger.info("Input capture : {}", captor.getValue());
    }
}
