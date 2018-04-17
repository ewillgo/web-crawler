package org.trianglex.webcrawler.common.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.trianglex.webcrawler.common.domain.TaskType;

import java.util.List;
import java.util.Map;

@Mapper
public interface TaskTypeDAO {

    List<TaskType> getTaskTypes();

    int addTaskType(@Param("taskType") TaskType taskType);

    int updateTaskTypeById(@Param("id") Integer id, @Param("data") Map<String, Object> data);
}
