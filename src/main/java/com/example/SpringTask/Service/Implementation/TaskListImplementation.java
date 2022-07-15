package com.example.SpringTask.Service.Implementation;

import com.example.SpringTask.Dto.TaskListDto;
import com.example.SpringTask.Entity.TaskList;
import com.example.SpringTask.Repository.TaskListRepository;
import com.example.SpringTask.Service.TaskListService;
import com.example.SpringTask.constants.MessageCodes;
import com.example.SpringTask.io.BaseResponse;
import com.example.SpringTask.io.StatusMessage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class TaskListImplementation implements TaskListService {

    @Autowired
    TaskListRepository taskListRepository;

    @Override
    public BaseResponse Add(TaskListDto request) throws Exception {
        TaskList taskList= new TaskList();
        BeanUtils.copyProperties(request, taskList);
        taskListRepository.save(taskList);
        return BaseResponse.builder()
                .status(MessageCodes.SUCCESS)
                .statusMessage(StatusMessage.builder()
                        .code(MessageCodes.SUCCESS)
                        .description(MessageCodes.add)
                        .build())
                .data(taskList)
                .build();

    }

    @Override
    public BaseResponse FetchAll() throws Exception {
        List<TaskList> taskLists=taskListRepository.findAll();
        return BaseResponse.builder()
                .status(MessageCodes.SUCCESS)
                .statusMessage(StatusMessage.builder()
                        .code(MessageCodes.SUCCESS)
                        .description(MessageCodes.add)
                        .build())
                .data(taskLists)
                .build();

    }

    @Override
    public BaseResponse UpdateTask(TaskListDto request, Long id) throws Exception {
        TaskList taskList = taskListRepository.getById(id);
        BeanUtils.copyProperties(request,taskList);
        taskList.setId(id);
        taskListRepository.save(taskList);
        return BaseResponse.builder()
                .status(MessageCodes.SUCCESS)
                .statusMessage(StatusMessage.builder()
                        .code(MessageCodes.SUCCESS)
                        .description(MessageCodes.update)
                        .build())
                .data(request)
                .build();
    }

    @Override
    public BaseResponse Delete(Long id) throws Exception {

        TaskList taskList=taskListRepository.getById(id);
        taskListRepository.delete(taskList);
        return BaseResponse.builder()
                .status(MessageCodes.SUCCESS)
                .statusMessage(StatusMessage.builder()
                        .code(MessageCodes.SUCCESS)
                        .description(MessageCodes.delete)
                        .build())
                .build();
    }
}
