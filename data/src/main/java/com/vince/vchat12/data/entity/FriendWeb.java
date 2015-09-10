package com.vince.vchat12.data.entity;

import java.util.ArrayList;

import cn.bmob.v3.BmobObject;

/**
 * User的实体，获取网上数据
 */
public class FriendWeb extends BmobObject{
    private String	remark;
    private String	description;
    private Boolean	isStar;
    private Boolean	isBlack;
    private  Boolean	isShieldMyCircle;
    private  Boolean	isBlockHisCircle;
    private  ArrayList<String> attachmentLinks;
    private GroupWeb	groupPointer;
    private UserWeb	targetUserPointer;








}
