package com.vince.vchat12.data.entity;

import java.util.ArrayList;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 *
 * Created by new on 2015/9/10.
 */
public class CircleWeb extends BmobObject {
    private UserWeb ownerPointer;
    private String  content;
    private BmobRelation subscriberPointer;
    private  ArrayList<String> attachmentLinks;

}
