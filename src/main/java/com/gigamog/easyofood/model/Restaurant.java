package com.gigamog.easyofood.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gigamog.easyofood.model.json.Menu;
import com.gigamog.easyofood.util.GzipUtil;
import lombok.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

@Getter
@Setter
@DynamoDBTable(tableName="Restaurant")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @DynamoDBHashKey
    private String restaurantId;
    private String restaurantName;
    private String restaurantPhoneNumber;
    private String restaurantAddress;
    private String restaurantEmail;
    private byte[] restaurantMenu;

    public void setRestaurantMenuArray(List<Menu> menus){
        try {
            this.restaurantMenu = GzipUtil.compress(objectMapper.writeValueAsString(menus));
        } catch (IOException e) {
        }
    }

    public List<Menu> getRestaurantMenuArray(){
        try {
            return objectMapper.readValue(GzipUtil.decompress(restaurantMenu), new TypeReference<List<Menu>>() {});
        } catch (IOException e) {
            return Collections.EMPTY_LIST;
        }
    }
}
