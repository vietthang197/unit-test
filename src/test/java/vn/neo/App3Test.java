package vn.neo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * @author thanglv on 3/4/2022
 * @project unit-test
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class App3Test {
    private Logger logger = LoggerFactory.getLogger(App3Test.class);

    // đối với Mockito.spy thì ta có thể chỉnh sửa dữ liệu của data, khi add hay remove thì size và các phần tử sẽ thay đổi
    @Test
    public void testSpy() {
        ArrayList<String> arr = Mockito.spy(ArrayList.class);
        arr.add("ok");
        logger.info("Item 0 of arr: {}", arr.get(0));
        logger.info("Size of arr: {}", arr.size());
        arr.add("First");
        arr.add("Second");
        logger.info("Size of arr: {}", arr.size());
        Mockito.when(arr.size()).thenReturn(7);
        logger.info("Size of arr: {}", arr.size());
    }

    // Đối với Mockito.mock thì array được tạo ra sẽ không thay đổi được, khi thêm hoặc remove thì phần từ của nó mặc định là không đổi
    @Test
    public void testMock() {
        ArrayList<String> arr = Mockito.mock(ArrayList.class);
        arr.add("ok");
        logger.info("Item 0 of arr: {}", arr.get(0));
        logger.info("Size of arr: {}", arr.size());
        arr.add("First");
        arr.add("Second");
        logger.info("Size of arr: {}", arr.size());
        Mockito.when(arr.size()).thenReturn(7);
        logger.info("Size of arr: {}", arr.size());
    }
}
