package com.example.SpringTask.Service.Implementation;

import com.example.SpringTask.Dto.EmployeeDto;
import com.example.SpringTask.Dto.PersonalDto;
import com.example.SpringTask.Entity.Employee;
import com.example.SpringTask.Entity.PersonalDetails;
import com.example.SpringTask.Repository.EmployeeRepository;
import com.example.SpringTask.Repository.PersonalRepository;
import com.example.SpringTask.Repository.TaskListRepository;
import com.example.SpringTask.Service.EmployeeService;
import com.example.SpringTask.constants.MessageCodes;
import com.example.SpringTask.io.BaseResponse;
import com.example.SpringTask.io.StatusMessage;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeImplementation implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    PersonalRepository personalRepository;


    @Override
    public BaseResponse RetrieveEmployee(long id) throws Exception {
        Employee users=employeeRepository.getById(id);
        EmployeeDto employeeDto=new EmployeeDto();
        BeanUtils.copyProperties(users,employeeDto);
        PersonalDetails personalDetails=personalRepository.getById(users.getPatients().getPersonalId());
        PersonalDto personalDto = new PersonalDto();
        BeanUtils.copyProperties(personalDetails,personalDto);
        employeeDto.setPersonalDto(personalDto);

        return BaseResponse.builder()
                .status(MessageCodes.SUCCESS)
                .statusMessage(StatusMessage.builder()
                        .code(MessageCodes.SUCCESS)
                        .description(MessageCodes.Fetch)
                        .build())
                .data(employeeDto)
                .build();
    }



}
