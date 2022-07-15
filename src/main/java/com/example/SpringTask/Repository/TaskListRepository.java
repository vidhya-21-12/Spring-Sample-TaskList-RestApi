package com.example.SpringTask.Repository;

import com.example.SpringTask.Entity.TaskList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskListRepository extends JpaRepository<TaskList,Long> {


}
