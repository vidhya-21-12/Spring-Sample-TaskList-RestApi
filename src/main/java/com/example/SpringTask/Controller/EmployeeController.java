package com.example.SpringTask.Controller;

import com.example.SpringTask.Service.EmployeeService;
import com.example.SpringTask.constants.NamespaceConstants;
import com.example.SpringTask.io.BaseResponse;
import com.example.SpringTask.utils.CommonUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = NamespaceConstants.Fetch_Employee)
    public ResponseEntity<BaseResponse> findAll(@PathVariable Long id) throws Exception {
        log.info("TaskListController :: processFindAll() :: Init ");
        BaseResponse response = employeeService.RetrieveEmployee(id);
        //log.info("TaskListController :: processFindAll() :: Response :: " + CommonUtils.toJson(response));
        return ResponseEntity.ok(response);
    }
}
