package entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="Tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name="title")
    private String title;

    @Column(name = "task_description")
    private String description;

    @CreationTimestamp
    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "task_status")
    @Builder.Default
    private String status = "In progress";

    @Column(name = "assignees")
    private List<String> assignee;


}
