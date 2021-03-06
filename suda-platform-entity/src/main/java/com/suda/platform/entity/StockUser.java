package com.suda.platform.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 手机用户表
 * </p>
 *
 * @author kongling
 * @since 2019-05-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="StockUser对象", description="手机用户表")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StockUser extends Model<StockUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户昵称")
    @TableField("nickname")
    private String nickname;

    @ApiModelProperty(value = "真实姓名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "登录帐号")
    @TableField("user_uid")
    private String userUid;

    @ApiModelProperty(value = "手机号")
    @TableField("tel")
    private String tel;

    @ApiModelProperty(value = "邮箱|帐号")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "密码，使用md5加密")
    @TableField("pswd")
    private String pswd;

    @ApiModelProperty(value = "交易密码")
    @TableField("trade_pwd")
    private String tradePwd;

    @ApiModelProperty(value = "设备号")
    @TableField("device_no")
    private String deviceNo;

    @ApiModelProperty(value = "创建时间")
    @TableField("create_time")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "最后登录时间")
    @TableField("last_login_time")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date lastLoginTime;

    @ApiModelProperty(value = "0:未禁用 1：禁用")
    @TableField("is_disable")
    private Boolean isDisable;

    @ApiModelProperty(value = "0:未删除 1:删除")
    @TableField("is_deleted")
    private Boolean isDeleted;

    @TableField("timestamp")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date timestamp;

    @ApiModelProperty(value = "头像")
    @TableField("head_url")
    private String headUrl;

    @ApiModelProperty(value = "微信唯一id")
    @TableField("open_id")
    private String openId;

    @ApiModelProperty(value = "添加代理商id")
    @TableField("agent_user_id")
    private Long agentUserId;

    @ApiModelProperty(value = "用户类型 1：小程序用户  2：ic卡用户")
    @TableField("user_type")
    private Integer userType;

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
