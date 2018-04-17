package org.trianglex.webcrawler.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trianglex.common.database.DataSource;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.dao.TaskTypeDAO;
import org.trianglex.webcrawler.common.domain.TaskType;

import java.util.List;

import static org.trianglex.webcrawler.common.config.DataSourceNames.WEBCRAWLER;

@Service
public class TaskTypeService {

    @Autowired
    private TaskTypeDAO taskTypeDAO;

    @DataSource(WEBCRAWLER)
    void getTaskTypeByPaginate(Page<TaskType> page) {
        taskTypeDAO.getTaskTypeByPaginate(page);
    }

    @DataSource(WEBCRAWLER)
    List<TaskType> getTaskTypes() {
        return taskTypeDAO.getTaskTypes();
    }

    @DataSource(WEBCRAWLER)
    public boolean addTaskType(TaskType taskType) {
        return taskTypeDAO.addTaskType(taskType) > 0;
    }

    @DataSource(WEBCRAWLER)
    public boolean updateTaskTypeById(TaskType taskType) {
        return taskTypeDAO.updateTaskTypeById(taskType) > 0;
    }

}
