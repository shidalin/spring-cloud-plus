
-- 操作日志表
CREATE TABLE IF NOT EXISTS `sys_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `tenant_id` bigint(20) DEFAULT NULL COMMENT '承租人id',
  `module_name` varchar(100) DEFAULT NULL COMMENT '模块名',
  `business_name` varchar(100) DEFAULT NULL COMMENT '业务名',
  `description` varchar(255) DEFAULT NULL COMMENT '描述',
  `method_name` varchar(100) DEFAULT NULL COMMENT '方法名',
  `method_type` varchar(10) DEFAULT NULL COMMENT '方法类型',
  `request_url` varchar(255) DEFAULT NULL COMMENT '请求路径',
  `request_param` text DEFAULT NULL COMMENT'请求参数',
  `request_ip` varchar(255) DEFAULT NULL COMMENT '请求ip',
  `request_time` bigint(20) DEFAULT NULL COMMENT '请求耗时',
  `response_detail` text DEFAULT NULL COMMENT '返回结果',
  `exception_detail` text DEFAULT NULL COMMENT '异常详细',
  `expire_time` datetime DEFAULT NULL COMMENT '过期删除时间',
  `is_deleted` tinyint(1) DEFAULT '0' COMMENT '是否已删除',
  `attribute` varchar(500)  default null COMMENT '冗余属性',
  `version` bigint(20) DEFAULT '1' COMMENT '版本号',
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  `created_by` bigint(20) DEFAULT NULL COMMENT '创建人',
  `updated_time` datetime DEFAULT NULL COMMENT '更新时间',
  `updated_by` bigint(20) DEFAULT NULL COMMENT '更新人',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4954 DEFAULT CHARSET=utf8 COMMENT='操作日志记录表';