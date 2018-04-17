package org.trianglex.webcrawler.common.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.domain.TaskType;
import org.trianglex.webcrawler.core.CoreApplication;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TaskTypeServiceTest {

    @Autowired
    private TaskTypeService taskTypeService;

    @Test
    public void getTaskTypeByPaginateTest() {
        Page<TaskType> page = new Page<>();
        page.setPageNo(1);
        page.setPageSize(10);
        taskTypeService.getTaskTypeByPaginate(page);
        System.out.println(page.getDataList());
    }

    @Test
    public void getTackTypesTest() {
        List<TaskType> taskTypeList = taskTypeService.getTaskTypes();
        System.out.println(taskTypeList);
    }

    @Test
    public void addTaskTypeTest() {
        TaskType taskType = new TaskType();
        taskType.setName("website");
        taskType.setDescription("Catch website data");
        taskType.setPackageName("org.trianglex.webcrawler.common.service.TaskTypeServiceTest");
        taskType.setOperBy(1);
        boolean result = taskTypeService.addTaskType(taskType);
        System.out.println("result = " + result + ", task type id = " + taskType.getId());
    }

    @Test
    public void updateTaskTypeByIdTest() {
        TaskType taskType = new TaskType();
        taskType.setId(1);
        taskType.setName("setname");
        taskType.setDescription("setdesc");
        taskType.setPackageName("com.cc");
        taskType.setOperBy(1);
        taskType.setDeleted(1);
        taskType.setStatus(TaskType.Status.OFF.getStatus());
        System.out.println(taskTypeService.updateTaskTypeById(taskType));
    }
}
