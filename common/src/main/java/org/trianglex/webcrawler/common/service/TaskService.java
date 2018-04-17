package org.trianglex.webcrawler.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trianglex.webcrawler.common.dao.TaskDAO;

@Service
public class TaskService {

    @Autowired
    private TaskDAO taskDAO;


}
