package com.cozy.QuizSystem.domain.model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Course {
    private Long id;
    private String title;
    private String description;
    private Long categoryId;
    private Long teacherId;
    private String level;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<Lesson> lessons;
}
