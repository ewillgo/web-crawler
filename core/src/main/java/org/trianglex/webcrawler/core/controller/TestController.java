package org.trianglex.webcrawler.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.domain.Task;
import org.trianglex.webcrawler.common.service.TaskService;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TaskService taskService;

    @GetMapping(value = "/test.json", produces = "application/json")
    public List<Task> getTasks() {
        Page<Task> page = new Page<>();
        page.setPageNo(1);
        page.setPageSize(10);
        return taskService.getTaskByPaginate(page, null);
    }

}
