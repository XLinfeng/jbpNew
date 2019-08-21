package org.feng.jbp.manager.entity;

import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;

import java.io.Serializable;
import java.util.Collection;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * <p>
 *
 * </p>
 *
 * @author feng
 * @since 2019-08-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Sysuser implements Serializable, UserDetails {

    private static final long serialVersionUID = 1L;

    /**
     * 登录账号
     */
    @TableField("loginName")
    private String loginName;

    /**
     * 登录密码
     */
    @TableField("loginPwd")
    private String loginPwd;

    /**
     * 用户全称
     */
    @TableField("fullName")
    private String fullName;

    @TableField("addTime")
    private LocalDateTime addTime;

    @TableField("updateTime")
    private LocalDateTime updateTime;

    @TableField("isenable")
    private Integer isenable;

    @TableField("locked")
    private Integer locked;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return isenable;
    }
}