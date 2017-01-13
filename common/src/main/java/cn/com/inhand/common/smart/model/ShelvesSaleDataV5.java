/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.com.inhand.common.smart.model;

import java.util.List;

/**
 *
 * @author liqiang
 */
public class ShelvesSaleDataV5 {
    
        private String locationId;  //货道ID
    
    private String goodsId;     //商品ID
    private String goodsName;     //商品名称
    private String price;          //价格
    private Integer valve;          //阈值
    private Integer capacity;   //货道容量
    private Integer stock;      //库存
    
    private Integer lastStock;   //上次库存
    
    private Integer replenCount=0; //应补货数量
    
    private Integer saleNum=0;    //货道销量累计数
    private Integer saleM=0;     //货道销量累计金额
    
    private Integer platSaleNum=0;  //平台累计销量
    private Integer platSaleM=0;   //平台累计金额
    
    private Integer lastSaleNum=0;   //上次货道累计数
    private Integer lastSaleM=0;    //上次货道累计金额
    
    private Integer platformSaleNum=0;  //平台本期累计销量
    private Integer platformSaleM=0;  //平台本期累计销售额
    private Integer tempPlatNum=0;
    private Integer tempPlatM=0;
    
    //0~15   现金、微信、支付宝、百付宝、声波、刷卡、pos机、一卡通、农行掌银、游戏、会员支付、翼支付、京东支付、微信反扫、支付宝反扫、其他
    private List<Integer> paySaleNum; //各种支付方式数量
    
    private List<Integer> paySaleM;  //各种支付方式金额
    
    private List<Integer> thisPayNum;
    private List<Integer> thisPatM;

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getValve() {
        return valve;
    }

    public void setValve(Integer valve) {
        this.valve = valve;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLastStock() {
        return lastStock;
    }

    public void setLastStock(Integer lastStock) {
        this.lastStock = lastStock;
    }

    public Integer getReplenCount() {
        return replenCount;
    }

    public void setReplenCount(Integer replenCount) {
        this.replenCount = replenCount;
    }

    public Integer getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    public Integer getSaleM() {
        return saleM;
    }

    public void setSaleM(Integer saleM) {
        this.saleM = saleM;
    }

    public Integer getPlatSaleNum() {
        return platSaleNum;
    }

    public void setPlatSaleNum(Integer platSaleNum) {
        this.platSaleNum = platSaleNum;
    }

    public Integer getPlatSaleM() {
        return platSaleM;
    }

    public void setPlatSaleM(Integer platSaleM) {
        this.platSaleM = platSaleM;
    }

    public Integer getLastSaleNum() {
        return lastSaleNum;
    }

    public void setLastSaleNum(Integer lastSaleNum) {
        this.lastSaleNum = lastSaleNum;
    }

    public Integer getLastSaleM() {
        return lastSaleM;
    }

    public void setLastSaleM(Integer lastSaleM) {
        this.lastSaleM = lastSaleM;
    }

    public Integer getPlatformSaleNum() {
        return platformSaleNum;
    }

    public void setPlatformSaleNum(Integer platformSaleNum) {
        this.platformSaleNum = platformSaleNum;
    }

    public Integer getPlatformSaleM() {
        return platformSaleM;
    }

    public void setPlatformSaleM(Integer platformSaleM) {
        this.platformSaleM = platformSaleM;
    }

    public Integer getTempPlatNum() {
        return tempPlatNum;
    }

    public void setTempPlatNum(Integer tempPlatNum) {
        this.tempPlatNum = tempPlatNum;
    }

    public Integer getTempPlatM() {
        return tempPlatM;
    }

    public void setTempPlatM(Integer tempPlatM) {
        this.tempPlatM = tempPlatM;
    }

    public List<Integer> getPaySaleNum() {
        return paySaleNum;
    }

    public void setPaySaleNum(List<Integer> paySaleNum) {
        this.paySaleNum = paySaleNum;
    }

    public List<Integer> getPaySaleM() {
        return paySaleM;
    }

    public void setPaySaleM(List<Integer> paySaleM) {
        this.paySaleM = paySaleM;
    }

    public List<Integer> getThisPayNum() {
        return thisPayNum;
    }

    public void setThisPayNum(List<Integer> thisPayNum) {
        this.thisPayNum = thisPayNum;
    }

    public List<Integer> getThisPatM() {
        return thisPatM;
    }

    public void setThisPatM(List<Integer> thisPatM) {
        this.thisPatM = thisPatM;
    }
    
    
    
}
