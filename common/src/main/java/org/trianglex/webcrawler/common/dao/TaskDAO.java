package org.trianglex.webcrawler.common.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.trianglex.common.database.mybatis.Page;
import org.trianglex.webcrawler.common.domain.Task;

import java.util.List;

@Mapper
public interface TaskDAO {

    List<Task> getTaskByPaginate(Page<Task> page, @Param("userId") Integer userId);

    int getTaskById(@Param("id") Integer id, @Param("userId") Integer userId);

    int addTask(Task task);

    int updateTaskById(Task task);
}
