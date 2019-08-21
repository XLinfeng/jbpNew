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
public class Syspermission implements Serializable {

private static final long serialVersionUID = 1L;

private Long rid;

private Long mid;

/**
* 权限类型
*/
@TableField("rType")
private Integer rType;

@TableField("addTime")
private LocalDateTime addTime;

@TableField("updateTime")
private LocalDateTime updateTime;


}