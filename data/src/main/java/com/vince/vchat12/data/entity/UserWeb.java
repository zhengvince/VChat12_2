package com.vince.vchat12.data.entity;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobRelation;

/**
 * User的实体，获取网上数据
 */
public class UserWeb extends BmobUser{

    private  String nick;
    private  String barcode2D;
    private Boolean isMale;
    private String singnature;
    private String address;
    private String avatarLink;
    private BmobRelation contactsRelation;
    private BmobRelation circleListRelation;



}
