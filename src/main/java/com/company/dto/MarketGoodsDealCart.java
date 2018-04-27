package com.company.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class MarketGoodsDealCart implements Serializable {
    /** 超市商品处理ID*/
    private Long marketGoodsCartId;

    /** 超市ID*/
    private Long marketId;

    /** 商品ID*/
    private Long goodsId;

    /** 商品处理类型*/
    private Byte goodsDealType;

    /** 商品处理子类型*/
    private Byte goodsDealSubType;

    /** 来源类型*/
    private Byte sourceType;

    /** 单品ID*/
    private Long itemId;

    /** 物料ID*/
    private Long materialId;

    /** 物料名称*/
    private String materialName;

    /** 商品描述*/
    private String goodsDesc;

    /** 商品名称*/
    private String goodsName;

    /** 数量*/
    private BigDecimal cnt;

    /** 单位*/
    private String unit;

    /** 供应商会员ID*/
    private Long supplierMemberId;

    /** 供应商名称*/
    private String supplierName;

    /** 创建时间*/
    private Date createTime;

    /** 操作人账户ID*/
    private Long operAcctId;

    private static final long serialVersionUID = 1L;

    public Long getMarketGoodsCartId() {
        return marketGoodsCartId;
    }

    public void setMarketGoodsCartId(Long marketGoodsCartId) {
        this.marketGoodsCartId = marketGoodsCartId;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Byte getGoodsDealType() {
        return goodsDealType;
    }

    public void setGoodsDealType(Byte goodsDealType) {
        this.goodsDealType = goodsDealType;
    }

    public Byte getGoodsDealSubType() {
        return goodsDealSubType;
    }

    public void setGoodsDealSubType(Byte goodsDealSubType) {
        this.goodsDealSubType = goodsDealSubType;
    }

    public Byte getSourceType() {
        return sourceType;
    }

    public void setSourceType(Byte sourceType) {
        this.sourceType = sourceType;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName == null ? null : materialName.trim();
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getCnt() {
        return cnt;
    }

    public void setCnt(BigDecimal cnt) {
        this.cnt = cnt;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Long getSupplierMemberId() {
        return supplierMemberId;
    }

    public void setSupplierMemberId(Long supplierMemberId) {
        this.supplierMemberId = supplierMemberId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getOperAcctId() {
        return operAcctId;
    }

    public void setOperAcctId(Long operAcctId) {
        this.operAcctId = operAcctId;
    }
}