package com.company.mapper;

import com.company.dto.MarketGoodsDealCart;

public interface MarketGoodsDealCartMapper {
    int deleteByPrimaryKey(Long marketGoodsCartId);

    int insert(MarketGoodsDealCart record);

    int insertSelective(MarketGoodsDealCart record);

    MarketGoodsDealCart selectByPrimaryKey(Long marketGoodsCartId);

    int updateByPrimaryKeySelective(MarketGoodsDealCart record);

    int updateByPrimaryKey(MarketGoodsDealCart record);
}