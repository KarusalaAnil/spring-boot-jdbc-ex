package com.springbootjdbc.entity;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

    private int id;
    private String name;
    private String dept;
    private String email;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private Date doj;

}
