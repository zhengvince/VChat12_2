package com.vince.vchat12.data;

import java.util.List;
import com.vince.vchat12.data.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "DIALOGUE_DATA".
 */
public class DialogueData {

    private String objectId;
    private java.util.Date updateTime;
    private Boolean isGroupChat;
    private String lastMsgSegment;
    private String avatarLink;
    private String groupName;
    private String targetFriendPointer;
    private String receiverGroupRelation2;
    private String msgListRelation;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient DialogueDataDao myDao;

    private FriendData o2o_targetFriendPointer;
    private String o2o_targetFriendPointer__resolvedKey;

    private List<FriendData> o2m_receiverGroupRelation2;
    private List<MsgData> o2m_msgListRelation;

    public DialogueData() {
    }

    public DialogueData(String objectId) {
        this.objectId = objectId;
    }

    public DialogueData(String objectId, java.util.Date updateTime, Boolean isGroupChat, String lastMsgSegment, String avatarLink, String groupName, String targetFriendPointer, String receiverGroupRelation2, String msgListRelation) {
        this.objectId = objectId;
        this.updateTime = updateTime;
        this.isGroupChat = isGroupChat;
        this.lastMsgSegment = lastMsgSegment;
        this.avatarLink = avatarLink;
        this.groupName = groupName;
        this.targetFriendPointer = targetFriendPointer;
        this.receiverGroupRelation2 = receiverGroupRelation2;
        this.msgListRelation = msgListRelation;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getDialogueDataDao() : null;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getIsGroupChat() {
        return isGroupChat;
    }

    public void setIsGroupChat(Boolean isGroupChat) {
        this.isGroupChat = isGroupChat;
    }

    public String getLastMsgSegment() {
        return lastMsgSegment;
    }

    public void setLastMsgSegment(String lastMsgSegment) {
        this.lastMsgSegment = lastMsgSegment;
    }

    public String getAvatarLink() {
        return avatarLink;
    }

    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getTargetFriendPointer() {
        return targetFriendPointer;
    }

    public void setTargetFriendPointer(String targetFriendPointer) {
        this.targetFriendPointer = targetFriendPointer;
    }

    public String getReceiverGroupRelation2() {
        return receiverGroupRelation2;
    }

    public void setReceiverGroupRelation2(String receiverGroupRelation2) {
        this.receiverGroupRelation2 = receiverGroupRelation2;
    }

    public String getMsgListRelation() {
        return msgListRelation;
    }

    public void setMsgListRelation(String msgListRelation) {
        this.msgListRelation = msgListRelation;
    }

    /** To-one relationship, resolved on first access. */
    public FriendData getO2o_targetFriendPointer() {
        String __key = this.targetFriendPointer;
        if (o2o_targetFriendPointer__resolvedKey == null || o2o_targetFriendPointer__resolvedKey != __key) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendDataDao targetDao = daoSession.getFriendDataDao();
            FriendData o2o_targetFriendPointerNew = targetDao.load(__key);
            synchronized (this) {
                o2o_targetFriendPointer = o2o_targetFriendPointerNew;
            	o2o_targetFriendPointer__resolvedKey = __key;
            }
        }
        return o2o_targetFriendPointer;
    }

    public void setO2o_targetFriendPointer(FriendData o2o_targetFriendPointer) {
        synchronized (this) {
            this.o2o_targetFriendPointer = o2o_targetFriendPointer;
            targetFriendPointer = o2o_targetFriendPointer == null ? null : o2o_targetFriendPointer.getObjectId();
            o2o_targetFriendPointer__resolvedKey = targetFriendPointer;
        }
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<FriendData> getO2m_receiverGroupRelation2() {
        if (o2m_receiverGroupRelation2 == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            FriendDataDao targetDao = daoSession.getFriendDataDao();
            List<FriendData> o2m_receiverGroupRelation2New = targetDao._queryDialogueData_O2m_receiverGroupRelation2(objectId);
            synchronized (this) {
                if(o2m_receiverGroupRelation2 == null) {
                    o2m_receiverGroupRelation2 = o2m_receiverGroupRelation2New;
                }
            }
        }
        return o2m_receiverGroupRelation2;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetO2m_receiverGroupRelation2() {
        o2m_receiverGroupRelation2 = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<MsgData> getO2m_msgListRelation() {
        if (o2m_msgListRelation == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            MsgDataDao targetDao = daoSession.getMsgDataDao();
            List<MsgData> o2m_msgListRelationNew = targetDao._queryDialogueData_O2m_msgListRelation(objectId);
            synchronized (this) {
                if(o2m_msgListRelation == null) {
                    o2m_msgListRelation = o2m_msgListRelationNew;
                }
            }
        }
        return o2m_msgListRelation;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetO2m_msgListRelation() {
        o2m_msgListRelation = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

}
