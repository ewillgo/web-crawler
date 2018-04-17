package org.trianglex.webcrawler.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trianglex.common.database.DataSource;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.dao.TaskDAO;
import org.trianglex.webcrawler.common.domain.Task;

import java.util.List;

import static org.trianglex.webcrawler.common.config.DataSourceNames.WEBCRAWLER;

@Service
public class TaskService {

    @Autowired
    private TaskDAO taskDAO;

    @DataSource(WEBCRAWLER)
    public List<Task> getTaskByPaginate(Page<Task> page, Integer userId) {
        return taskDAO.getTaskByPaginate(page, userId);
    }

}
