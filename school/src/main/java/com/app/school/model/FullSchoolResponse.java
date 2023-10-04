package com.app.school.model;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FullSchoolResponse {
    private String name;
    private String email;
    List<StudentResponse> students;
}
