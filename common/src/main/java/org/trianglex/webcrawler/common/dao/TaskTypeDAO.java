package org.trianglex.webcrawler.common.dao;

import org.apache.ibatis.annotations.Mapper;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.domain.TaskType;

import java.util.List;

@Mapper
public interface TaskTypeDAO {

    List<TaskType> getTaskTypes();

    int addTaskType(TaskType taskType);

    int updateTaskTypeById(TaskType taskType);

    List<TaskType> getTaskTypeByPaginate(Page<TaskType> page);
}
