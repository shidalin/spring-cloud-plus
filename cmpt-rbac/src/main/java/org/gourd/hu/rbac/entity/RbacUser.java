package org.gourd.hu.rbac.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import org.gourd.hu.base.common.entity.BaseEntity;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author gourd.hu
 * @since 2020-04-14
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("rbac_user")
@ApiModel(value = "RbacUser对象", description = "用户表")
public class RbacUser extends BaseEntity<RbacUser> {

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "拼音")
    private String pinYin;

    @ApiModelProperty(value = "性别（M-男，F-女，X-未知）")
    private String sex;

    @ApiModelProperty(value = "生日")
    private Date birth;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "昵称")
    private String nickName;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "手机")
    private String mobilePhone;

    @ApiModelProperty(value = "头像地址")
    private String photoUrl;

}
