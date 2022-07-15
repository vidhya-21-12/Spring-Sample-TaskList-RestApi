package com.example.SpringTask.Controller;

import com.example.SpringTask.Dto.TaskListDto;
import com.example.SpringTask.Service.TaskListService;
import com.example.SpringTask.constants.NamespaceConstants;
import com.example.SpringTask.io.BaseResponse;
import com.example.SpringTask.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j

public class TaskListController {

    @Autowired
    TaskListService taskListService;


    @PostMapping(value = NamespaceConstants.Add)
    public ResponseEntity<BaseResponse> processAdd(@RequestBody TaskListDto req) throws Exception {
        log.info("TaskListController :: processAdd() :: Init ");
        BaseResponse response = taskListService.Add(req);
        log.info("TaskListController :: processAdd() :: Response :: " + CommonUtils.toJson(response));
        return ResponseEntity.ok(response);
    }

    @GetMapping(value = NamespaceConstants.Fetch)
    public ResponseEntity<BaseResponse> findAll() throws Exception {
        log.info("TaskListController :: processFindAll() :: Init ");
        BaseResponse response = taskListService.FetchAll();
        log.info("TaskListController :: processFindAll() :: Response :: " + CommonUtils.toJson(response));
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = NamespaceConstants.Update)
    public ResponseEntity<BaseResponse> processUpdate(@RequestBody TaskListDto req, @PathVariable Long id) throws Exception {
        log.info("TaskListController :: processUpdate() :: Init ");
        BaseResponse response = taskListService.UpdateTask(req,id);
        log.info("TaskListController :: processUpdate() :: Response :: " + CommonUtils.toJson(response));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(value = NamespaceConstants.Delete)
    public ResponseEntity<BaseResponse> processDelete(@PathVariable Long id) throws Exception {
        log.info("TaskListController :: processDelete() :: Init ");
        BaseResponse response = taskListService.Delete(id);
        log.info("TaskListController :: processDelete() :: Response :: " + CommonUtils.toJson(response));
        return ResponseEntity.ok(response);
    }

}
