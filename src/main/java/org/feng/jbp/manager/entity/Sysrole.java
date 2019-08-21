package org.feng.jbp.manager.entity;

import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
* <p>
* 
* </p>
*
* @author jobob
* @since 2019-08-20
*/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Sysrole implements Serializable {

private static final long serialVersionUID = 1L;

/**
* 角色编码
*/
@TableField("roleCode")
private String roleCode;

/**
* 角色名称
*/
@TableField("roleName")
private String roleName;

@TableField("addTime")
private LocalDateTime addTime;

@TableField("updateTime")
private LocalDateTime updateTime;


}