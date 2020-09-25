package com.amazonsns.dao;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

@JsonSerialize
@Data
public class TopicDAO {
    private String name;
}
