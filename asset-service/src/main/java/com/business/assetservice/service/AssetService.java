package com.business.assetservice.service;

import com.business.assetservice.domain.Asset;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AssetService {
    List<Asset> getAllAssetDetails();
    Asset getAssetDetails(long id);
}
