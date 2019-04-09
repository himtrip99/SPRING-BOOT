package com.business.assetservice.mapper;

import com.business.assetservice.domain.Asset;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssetMapper {

    Asset getAssetDetails(long Id);
    List<Asset> getAllAssetDetails();
}
