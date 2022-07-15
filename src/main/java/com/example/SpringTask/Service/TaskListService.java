package com.example.SpringTask.Service;

import com.example.SpringTask.Dto.TaskListDto;
import com.example.SpringTask.io.BaseResponse;
import org.springframework.stereotype.Service;


@Service
public interface TaskListService {

    public BaseResponse Add(TaskListDto request) throws Exception;

    public BaseResponse FetchAll() throws Exception;

    public BaseResponse UpdateTask(TaskListDto request, Long id) throws Exception;

    public BaseResponse Delete(Long id) throws Exception;
}
