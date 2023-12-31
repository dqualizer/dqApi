package dqualizer.research.dqapi.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.github.dqualizer.dqlang.types.rqa.definition.enums.LoadProfile;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.ResponseTime;
import io.github.dqualizer.dqlang.types.rqa.definition.enums.ResultMetrics;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Data
public class CreateLoadtestDto {

    @NotBlank
    private String name;
    @NotBlank
    private String system;
    @NotBlank
    private String activity;
    @NotBlank
    @JsonProperty("load_profile")
    private LoadProfile loadProfile;
    @NotBlank
    private int accuracy;
    private Map<String, String> designParameters = new HashMap<>();
    @NotBlank
    @JsonProperty("response_time")
    private ResponseTime responseTime;
    @NotBlank
    @JsonProperty("result_metrics")
    private Set<ResultMetrics> resultMetrics;

}
