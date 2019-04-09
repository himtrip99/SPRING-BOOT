package com.business.assetservice.service;

import com.business.assetservice.dao.AssetDao;
import com.business.assetservice.domain.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetServiceImpl implements AssetService {

    @Autowired
    private AssetDao assetDao;

    @Override
    public Asset getAssetDetails(long id) {
        return assetDao.selectAssetById(id);
    }

    @Override
    public List<Asset> getAllAssetDetails() {
        return assetDao.getAllAssetDetails();
    }
}
