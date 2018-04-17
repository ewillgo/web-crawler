package org.trianglex.webcrawler.common.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.domain.Task;
import org.trianglex.webcrawler.core.CoreApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskServiceTest {

    @Autowired
    private TaskService taskService;

    @Test
    public void getTaskByPaginateTest() {
        Page<Task> page = new Page<>();
        taskService.getTaskByPaginate(page, null);
        System.out.println(page.getDataList());
    }
}
