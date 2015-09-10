package pl.surecase.eu;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Property;
import de.greenrobot.daogenerator.Schema;

/**
 * 用来为GreenDao框架生成Dao文件
 */
public class MyDaoGenerator {

    //辅助文件生成的相对路径
    public static final String DAO_PATH = "../data/src/main/java-gen";
    //辅助文件的包名
    public static final String PACKAGE_NAME = "com.vince.vchat12.data";
    //数据库的版本号
    public static final int DATA_VERSION_CODE = 3;


    public static void main(String[] args) throws Exception {

        Schema schema = new Schema(DATA_VERSION_CODE, PACKAGE_NAME);
        init(schema);
        new DaoGenerator().generateAll(schema, DAO_PATH);//生成Dao文件路径

    }


    /**
     * 实例化
     */
    private static void init(Schema schema) {

        Entity user = schema.addEntity("UserData");
        Entity friend = schema.addEntity("FriendData");
        Entity group = schema.addEntity("GroupData");
        Entity msg = schema.addEntity("MsgData");
        Entity dialogue = schema.addEntity("DialogueData");
        Entity circle = schema.addEntity("CircleWeb");


        user.addStringProperty("objectId").primaryKey();
        user.addStringProperty("username").notNull();
        user.addStringProperty("password");
        user.addStringProperty("nick");
        user.addStringProperty("barcode2D");
        user.addBooleanProperty("isMale");
        user.addStringProperty("signature");
        user.addStringProperty("address");
        user.addStringProperty("avatarLink");
        user.addDateProperty("createTime");
        user.addDateProperty("updateTime");
        Property contactsRelation = user.addStringProperty("contactsRelation").getProperty();
        user.addToMany(friend, contactsRelation, "o2m_contactsRelation");
        Property circleListRelation = user.addStringProperty("circleListRelation").getProperty();
        user.addToMany(circle, circleListRelation, "o2m_circleListRelation");


        friend.addStringProperty("objectId").primaryKey();
        friend.addStringProperty("remark");
        friend.addStringProperty("description");
        friend.addBooleanProperty("isStar");
        friend.addBooleanProperty("isBlack");
        friend.addBooleanProperty("isShieldMyCircle");
        friend.addBooleanProperty("isBlockHisCircle");
        friend.addStringProperty("attachmentLinksString");
        friend.addDateProperty("updateTime");
        friend.addStringProperty("firstLetter");
        Property groupPointer = friend.addStringProperty("groupPointer").getProperty();
        friend.addToOne(group, groupPointer, "o2o_groupPointer");
        Property targetUserPointer = friend.addStringProperty("targetUserPointer").getProperty();
        friend.addToOne(user, targetUserPointer, "o2o_targetUserPointer");


        group.addStringProperty("objectId").primaryKey();
        group.addDateProperty("updateTime");
        group.addStringProperty("groupName");


        msg.addStringProperty("objectId").primaryKey();
        msg.addIntProperty("type");
        msg.addIntProperty("status");
        msg.addStringProperty("content");
        msg.addStringProperty("attachmentLink");
        msg.addBooleanProperty("isGroupChat");
        msg.addDateProperty("updateTime");
        Property senderPointer = msg.addStringProperty("senderPointer").getProperty();
        msg.addToOne(friend, senderPointer, "o2o_senderPointer");
        Property receiverPointer = msg.addStringProperty("receiverPointer").getProperty();
        msg.addToOne(friend, receiverPointer, "o2o_receiverPointer");
        Property receiverGroupRelation = msg.addStringProperty("receiverGroupRelation").getProperty();
        msg.addToMany(friend, receiverGroupRelation, "o2m_receiverGroupRelation");


        dialogue.addStringProperty("objectId").primaryKey();
        dialogue.addDateProperty("updateTime");
        dialogue.addBooleanProperty("isGroupChat");
        dialogue.addStringProperty("lastMsgSegment");
        dialogue.addStringProperty("avatarLink");
        dialogue.addStringProperty("groupName");
        Property targetFriendPointer = dialogue.addStringProperty("targetFriendPointer").getProperty();
        dialogue.addToOne(friend, targetFriendPointer, "o2o_targetFriendPointer");
        Property receiverGroupRelation2 = dialogue.addStringProperty("receiverGroupRelation2").getProperty();
        dialogue.addToMany(friend, receiverGroupRelation2, "o2m_receiverGroupRelation2");
        Property msgListRelation = dialogue.addStringProperty("msgListRelation").getProperty();
        dialogue.addToMany(msg, msgListRelation, "o2m_msgListRelation");


        circle.addStringProperty("objectId").primaryKey();
        circle.addDateProperty("updateTime");
        circle.addStringProperty("attachmentLinks");
        circle.addStringProperty("content");
        Property ownerPointer = circle.addStringProperty("ownerPointer").getProperty();
        circle.addToOne(friend, ownerPointer, "o2m_ownerPointer");




    }



}