package scienceParsers;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
@ToString (exclude = "workStart")
@AllArgsConstructor
public class Employee {

    private String name;
    private Integer salary;
    private Date workStart;



}

