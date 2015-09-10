package com.vince.vchat12.data.entity;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobRelation;

/**
 *
 * Created by new on 2015/9/10.
 */
public class MsgWeb extends BmobObject {
    private Integer	type;
    private Integer	status;
    private  FriendWeb	senderPointer;
    private  FriendWeb	receiverPointer;
    private  String	content;
    private  String	attachmentLink;
    private  Boolean	isGroupChat;
    private BmobRelation receiverGroupRelation;
    private  UserWeb ownerPointer;


}
