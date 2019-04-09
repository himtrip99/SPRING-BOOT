package com.business.assetservice.service;

import com.business.assetservice.dao.AssetDao;
import com.business.assetservice.domain.Asset;
import com.business.assetservice.domain.AssetBuilder;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class AssetServiceTest {

    @Mock
    private AssetDao assetDao;

    @InjectMocks
    private AssetService assetService = new AssetServiceImpl();

    @Mock
    private Asset asset;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGet() {
        asset = new AssetBuilder(2l).setAssetName("Box1").setassetOwner("Himanshu").build();
        Mockito.when(assetDao.selectAssetById(1)).thenReturn(asset);
        Assert.assertEquals("Box1", assetService.getAssetDetails(1).getAssetName());
        Assert.assertEquals(Long.valueOf("2"), assetService.getAssetDetails(1).getAssetId());
        Assert.assertEquals("Himanshu", assetService.getAssetDetails(1).getAssetOwner());
    }
}
