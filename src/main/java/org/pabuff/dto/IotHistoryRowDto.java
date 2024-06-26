package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Getter@Setter
@Builder
@AllArgsConstructor
public class IotHistoryRowDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_timestamp")
    LocalDateTime readingTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_total")
    double readingTotal;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_diff")
    double readingDiff;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_interval")
    double readingInterval;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_estimated")
    boolean isEstimated;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonProperty("readings")
//    List<Map<String, Double>> readings;
//    @JsonProperty("reading_diff")
//    List<Map<String, Double>> readingDiffs;

    /* sample:
    {

        "fieldPartKey1": //example: "a_imp"
        {
            "reading_total": 123.45,
            "reading_total_is_est": false,
            "reading_diff": 0.0,
        },
        "fieldPartKey2":
        {
            "reading_total": 123.45,
            "reading_diff": 0.0,
            "reading_diff_is_est": true,
        }
    }
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("readings")
    Map<String, Map<String, Object>> readings;

    public Double getReadingPart(String fieldPartKey, String readingKey){
        if(readings==null){
            return null;
        }
        Map<String, Object> reading = readings.get(fieldPartKey);
        if(reading==null){
            return null;
        }
        return (Double) reading.get(readingKey);
    }
}
