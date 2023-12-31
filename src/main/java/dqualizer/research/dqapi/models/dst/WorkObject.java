package dqualizer.research.dqapi.models.dst;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class WorkObject {
    @Id
    private String id;
    private String name;

}
