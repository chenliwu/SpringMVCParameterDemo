package com.chenlw.springmvc.demo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ParamsEntity {

    String param1;
    String param2;

}
