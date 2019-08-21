package org.feng.jbp.manager.entity;

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
public class SysUserRole implements Serializable {

private static final long serialVersionUID = 1L;

private Long uid;

private Long rid;


}