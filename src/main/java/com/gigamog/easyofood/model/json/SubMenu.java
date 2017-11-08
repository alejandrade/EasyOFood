package com.gigamog.easyofood.model.json;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@AllArgsConstructor
public class SubMenu {
    private ArrayList<Dish> dishes;
    private String menuName;
    private String servingStartTime;
    private String servingEndTime;
}
