package dqualizer.research.dqapi.models.dam;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
@NoArgsConstructor
public class Actor{
    @Id
    private String id;
    private String actor_name;

}
