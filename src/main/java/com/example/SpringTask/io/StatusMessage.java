package com.example.SpringTask.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusMessage {

    private String code; //200
    private String description; //sucess or failure or internal

}
