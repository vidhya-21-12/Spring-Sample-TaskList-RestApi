package com.example.SpringTask.Service;

import com.example.SpringTask.Dto.EmployeeDto;
import com.example.SpringTask.io.BaseResponse;
import org.springframework.stereotype.Service;


@Service
public interface EmployeeService {

    public BaseResponse RetrieveEmployee(long id) throws Exception;
}
