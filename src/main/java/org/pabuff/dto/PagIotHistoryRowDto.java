package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter@Setter
@Builder
@AllArgsConstructor
public class PagIotHistoryRowDto {
    /* sample:
    {
        "fieldKey1":
        {
            "reading_total": 123.45,
            "reading_total_is_est": false,
            "reading_diff": 0.0,
        },
        "fieldKey2":
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

    //data saver with short names
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dt")
    LocalDateTime dt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dt_repeat")
    Integer dtRepeat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("dt_missing")
    Integer dtMissing;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rt")
    Double rt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rd")
    Double rd;
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @JsonProperty("ri_m")
//    double riM;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ri_s")
    Double riS;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_est")
//    Boolean isEst;
    Integer isEst; //0: false, 1: true, 2: null

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_ot")
    Integer isOt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("is_empty")
    Integer isEmpty;

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

    public void setReadingPart(String fieldPartKey, String readingKey, Double value){
        if(readings==null){
            return;
        }
        Map<String, Object> reading = readings.get(fieldPartKey);
        if(reading==null){
            return;
        }
        reading.put(readingKey, value);
    }
}
