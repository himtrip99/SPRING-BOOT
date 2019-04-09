package com.business.assetservice.rest;

import com.business.assetservice.AssetServiceApplication;
import static org.junit.Assert.assertNotNull;
import static org.hamcrest.Matchers.equalTo;
import com.jayway.restassured.RestAssured;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = AssetServiceApplication.class, webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AssetControllerIT {

    public static final Logger logger = LoggerFactory.getLogger(AssetController.class);

    @Autowired
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    public void fetch_UserAssetDetails_SuccessFully_with_Correct_Data(){
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/asset/getUserAssetDetails/1",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());
        Assert.assertEquals(HttpStatus.OK,response.getStatusCode());
        Assert.assertEquals(1,response.getBody());
        Assert.assertEquals(HttpStatus.OK,response.getStatusCode());
        Assert.assertEquals(HttpStatus.OK,response.getStatusCode());
    }


    @Test
    public void fetch_AssetDetails_Verify_Rest_Assured() {
        RestAssured.given().when().get(getRootUrl() + "/asset/getUserAssetDetails/1").
                then().statusCode(200)
        .body("assetId", equalTo(1))
        .body("assetName", equalTo("Box1"))
        .body("assetOwner", equalTo("Himanshu Tripathi"));
    }

}
