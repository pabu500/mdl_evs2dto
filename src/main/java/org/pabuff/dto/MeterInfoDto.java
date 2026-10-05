package org.pabuff.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.pabuff.utils.LocalDateTimeMultiDeserializer;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Getter@Setter
//@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MeterInfoDto {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_sn")
    private String meterSn;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("meter_displayname")
    private String meterDisplayname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("concentrator_id")
    private String concentratorId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private PremiseDto premise;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("rls_status")
    private String rlsStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("kwh_timestamp")
    private LocalDateTime kwhTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("kwh_reading")
    private float kwhReading;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private float current;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private float voltage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("reading_interval")
    private long readingInterval;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_address")
    private String mmsAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_street")
    private String mmsStreet;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_building")
    private String mmsBuilding;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_block")
    private String mmsBlock;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_level")
    private String mmsLevel;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_unit")
    private String mmsUnit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_postal_code")
    private String mmsPostalCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("mms_online_timestamp")
    private LocalDateTime mmsOnlineTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("esim_id")
    private String esimId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("data_subscription_id")
    private String dataSubscriptionId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("scope_str")
    private String scopeStr;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("daily_usage_timestamp")
    private LocalDateTime dailyUsageTimestamp;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("tariff_price")
    private double tariffPrice;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("bypass_policy")
    private MeterBypassDto bypassPolicy;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("site_tag")
    private String siteTag;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("lc_status")
    private String lcStatus;

    public Map<String, Object> toFiledMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("meter_sn", meterSn);
        map.put("meter_displayname", meterDisplayname);
        map.put("concentrator_id", concentratorId);
        map.put("premise", premise);
        map.put("address", address);
        map.put("status", status);
        map.put("rls_status", rlsStatus);
        map.put("kwh_timestamp", kwhTimestamp);
        map.put("kwh_reading", kwhReading);
        map.put("current", current);
        map.put("voltage", voltage);
        map.put("reading_interval", readingInterval);
        map.put("mms_address", mmsAddress);
        map.put("mms_street", mmsStreet);
        map.put("mms_building", mmsBuilding);
        map.put("mms_block", mmsBlock);
        map.put("mms_level", mmsLevel);
        map.put("mms_unit", mmsUnit);
        map.put("mms_postal_code", mmsPostalCode);
        map.put("mms_online_timestamp", mmsOnlineTimestamp);
        map.put("esim_id", esimId);
        map.put("data_subscription_id", dataSubscriptionId);
        map.put("scope_str", scopeStr);
        map.put("daily_usage_timestamp", dailyUsageTimestamp);
        map.put("tariff_price", tariffPrice);
        map.put("bypass_policy", bypassPolicy);
        map.put("site_tag", siteTag);
        map.put("lc_status", lcStatus);

        return map;
    }
//    public MeterInfoDto fromFieldMap(Map<String, Object> fieldMap){
//        this.meterSn = fieldMap.get("meter_sn")!=null?
//            fieldMap.get("meter_sn").toString():null;
//        this.meterDisplayname = fieldMap.get("meter_displayname") != null?
//            fieldMap.get("meter_displayname").toString():null;
//
//        Map<String, Object> premiseMap = fieldMap.get("premise")!=null?
//            (Map<String, Object>) fieldMap.get("premise"):null;
//        PremiseDto premiseDto = PremiseDto.builder()
//                .unit(premiseMap.get("unit")!=null?
//                    premiseMap.get("unit").toString():null)
//                .level(premiseMap.get("level")!=null?
//                    premiseMap.get("level").toString():null)
//                .block(premiseMap.get("block")!=null? premiseMap.get("block").toString():null)
//                .building(premiseMap.get("building")!=null? premiseMap.get("building").toString():null)
//                .postalCode(premiseMap.get("postal_code")!=null? premiseMap.get("postal_code").toString():null)
//                .build();
//        this.premise = premiseMap != null? premiseDto:null;
//
//        this.address = (String) fieldMap.get("address") != null?
//            fieldMap.get("address").toString():null;
//        this.status = (String) fieldMap.get("status")!=null?
//            fieldMap.get("status").toString():null;
//        this.rlsStatus = (String) fieldMap.get("rls_status")!=null?
//            fieldMap.get("rls_status").toString():null;
//        this.kwhTimestamp = fieldMap.get("kwh_timestamp")!=null?
//            DateTimeUtil.getLocalDateTime(fieldMap.get("kwh_timestamp").toString()):null;
//        this.kwhReading = (float) fieldMap.get("kwh_reading");
//        this.current = (float) fieldMap.get("current");
//        this.voltage = (float) fieldMap.get("voltage");
//        this.readingInterval = (long) fieldMap.get("reading_interval");
//        return this;
//    }

    // Configure once before conversion; repeated module registration grows mapper state.
    private static final ObjectMapper mapper = createMapper();

    private static ObjectMapper createMapper() {
        SimpleModule module = new SimpleModule();
        module.addDeserializer(LocalDateTime.class, new LocalDateTimeMultiDeserializer());
        return new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .registerModule(module);
    }

    public static MeterInfoDto fromFieldMap(Map<String, Object> fieldMap) {
        try {
            MeterInfoDto meterInfoDto = mapper.convertValue(fieldMap, MeterInfoDto.class);
            PremiseDto premiseDto = PremiseDto.builder()
                    .building(meterInfoDto.getMmsBuilding())
                    .block(meterInfoDto.getMmsBlock())
                    .level(meterInfoDto.getMmsLevel())
                    .postalCode(meterInfoDto.getMmsPostalCode())
                    .street(meterInfoDto.getMmsStreet())
                    .unit(meterInfoDto.getMmsUnit())
                    .build();
            meterInfoDto.setPremise(premiseDto);
            meterInfoDto.setAddress(meterInfoDto.getMmsAddress());
            return meterInfoDto;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
