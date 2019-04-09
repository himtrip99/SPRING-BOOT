package com.business.assetservice.rest;

import com.business.assetservice.domain.Asset;
import com.business.assetservice.service.AssetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asset")
public class AssetController {

    public static final Logger logger = LoggerFactory.getLogger(AssetController.class);

    @Autowired
    private AssetService assetService;

    @GetMapping(path = "/getUserAssetDetails/{assetId}" , produces= MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Asset> getUserAssetDetails(@PathVariable int assetId) {
        logger.debug("Request getting processed");
        Asset asset = assetService.getAssetDetails(assetId);
        return new ResponseEntity<Asset>(asset, HttpStatus.OK);
    }
}
