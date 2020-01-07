package com.solt.demo.domain;

import javax.persistence.*;

@Entity
public class Emergency {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emergency_id;
    private String type;
    private String emergency_case;
    private String progress_so_far;
    public Emergency(){}

    public Emergency(String type,String emergency_case,String progress_so_far){
        this.type = type;
        this.emergency_case = emergency_case;
        this.progress_so_far = progress_so_far;
    }

    public Integer getEmergency_id() {
        return emergency_id;
    }

    public void setEmergency_id(Integer emergency_id) {
        this.emergency_id = emergency_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmergency_case() {
        return emergency_case;
    }

    public void setEmergency_case(String emergency_case) {
        this.emergency_case = emergency_case;
    }

    public String getProgress_so_far() {
        return progress_so_far;
    }

    public void setProgress_so_far(String progress_so_far) {
        this.progress_so_far = progress_so_far;
    }
}
