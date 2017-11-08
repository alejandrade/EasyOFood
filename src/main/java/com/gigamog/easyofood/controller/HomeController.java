package com.gigamog.easyofood.controller;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.gigamog.easyofood.model.Restaurant;
import com.gigamog.easyofood.util.GzipUtil;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@RestController
public class HomeController {

    private final DynamoDBMapper dynamoDBMapper;

    @RequestMapping("/")
    public Object index() {
        return "";
    }
}
