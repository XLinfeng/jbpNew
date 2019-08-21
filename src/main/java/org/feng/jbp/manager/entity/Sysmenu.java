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
public class Sysmenu implements Serializable {

private static final long serialVersionUID = 1L;

/**
* 上级菜单ID
*/
@TableField("parentId")
private Long parentId;

/**
* 菜单名称
*/
@TableField("menuName")
private String menuName;

/**
* URL
*/
@TableField("menuUrl")
private String menuUrl;

/**
* 说明
*/
@TableField("explainStr")
private String explainStr;

@TableField("addTime")
private LocalDateTime addTime;

@TableField("updateTime")
private LocalDateTime updateTime;


}