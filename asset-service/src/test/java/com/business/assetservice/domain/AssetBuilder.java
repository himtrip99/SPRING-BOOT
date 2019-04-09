package com.business.assetservice.domain;

public class AssetBuilder {

    private final Long assetId;
    private String assetName;
    private String assetOwner;

    public AssetBuilder(long assetId, String assetName, String assetOwner) {
        this.assetId = assetId;
        this.assetName = assetName;
        this.assetOwner = assetOwner;
    }

    public AssetBuilder(long assetId) {
        this.assetId = assetId;
    }

    public AssetBuilder setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    public AssetBuilder setassetOwner(String assetOwner) {
        this.assetOwner = assetOwner;
        return this;
    }

    public Asset build() {
        Asset asset = new Asset();
        asset.setAssetId(assetId);
        asset.setAssetName(assetName);
        asset.setAssetOwner(assetOwner);
        return asset;
    }
}
