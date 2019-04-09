package com.business.assetservice.dao;

import com.business.assetservice.domain.Asset;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AssetDao {

    private final SqlSession sqlSession;

    public AssetDao(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    public Asset selectAssetById(long id) {
        return this.sqlSession.selectOne("selectAssetById", id);
    }


    public List<Asset> getAllAssetDetails(){
        return null;
    }

}
