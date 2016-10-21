package net.coderdaily.bean.content;

import javax.persistence.*;
import java.util.Date;

/**
 * Author: sunyukun.china@gmail.com
 * Time: 2016/9/21 22:34
 * Blog: coderdaily.net
 */

@Entity
@Table(name = "bp_content")
public class ContentEntity {
    @Id
    @Column(name = "sid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sid;
    private String title;
    private String content;
    private Long userSid;
    private Integer status;
    private Integer voteUp;
    private Integer voteDown;
    private Integer commentStatus;
    private Integer commentCount;
    private Integer viewCount;
    private Date createdTime;
    private Date modifiedTime;
    private Integer flag;

    public ContentEntity() {
    }

    public ContentEntity(String title, String content, Long userSid) {
        this.title = title;
        this.content = content;
        this.userSid = userSid;
        this.createdTime = new Date();
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserSid() {
        return userSid;
    }

    public void setUserSid(Long userSid) {
        this.userSid = userSid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVoteUp() {
        return voteUp;
    }

    public void setVoteUp(Integer voteUp) {
        this.voteUp = voteUp;
    }

    public Integer getVoteDown() {
        return voteDown;
    }

    public void setVoteDown(Integer voteDown) {
        this.voteDown = voteDown;
    }

    public Integer getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(Integer commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}
