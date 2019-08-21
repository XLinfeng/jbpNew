-- 系统用户表
CREATE TABLE sysuser(
id BIGINT NOT NULL auto_increment PRIMARY KEY,
loginName VARCHAR(20) NOT NULL COMMENT '登录账号',
loginPwd  VARCHAR(100) NOT NULL COMMENT '登录密码',
fullName VARCHAR(100) NOT NULL COMMENT '用户全称',
addTime TIMESTAMP NOT NULL ,
updateTime TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;
-- 系统角色表
CREATE TABLE sysrole(
id BIGINT NOT NULL auto_increment PRIMARY KEY,
roleCode VARCHAR(20) NOT NULL COMMENT '角色编码',
roleName VARCHAR(20) NOT NULL COMMENT '角色名称',
addTime TIMESTAMP NOT NULL,
updateTime TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- 角色用户映射表
CREATE TABLE sys_user_role(
id BIGINT NOT NULL auto_increment PRIMARY KEY,
uid BIGINT NOT NULL,
rid BIGINT NOT NULL,
FOREIGN KEY (uid) REFERENCES sysuser(id) on delete cascade,
FOREIGN KEY (rid) REFERENCES sysrole(id) on DELETE cascade
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- 系统菜单表
CREATE TABLE sysmenu(
id BIGINT NOT NULL auto_increment PRIMARY KEY,
parentId BIGINT NOT NULL COMMENT '上级菜单ID',
menuName VARCHAR(50) NOT NULL COMMENT '菜单名称',
menuUrl VARCHAR(200) NOT NULL COMMENT 'URL',
explainStr VARCHAR(200) COMMENT '说明',
addTime TIMESTAMP NOT NULL,
updateTime TIMESTAMP
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;

-- 角色权限表
CREATE TABLE syspermission(
id BIGINT NOT NULL auto_increment PRIMARY KEY,
rid BIGINT NOT NULL,
mid BIGINT NOT NULL,
rType int NOT NULL COMMENT '权限类型',
addTime TIMESTAMP NOT NULL,
updateTime TIMESTAMP,
FOREIGN KEY (rid) REFERENCES sysrole(id) on delete cascade,
FOREIGN KEY (mid) REFERENCES sysmenu(id) on delete cascade
)ENGINE=INNODB DEFAULT CHARSET=utf8mb4;