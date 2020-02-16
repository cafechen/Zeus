DROP DATABASE IF EXISTS zeus_basic;
CREATE DATABASE zeus_basic DEFAULT CHARSET utf8mb4;
USE zeus_basic;

DROP TABLE IF EXISTS product;

CREATE TABLE `product` (
   `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
   `name` varchar(200) NOT NULL COMMENT '产品名称',
   `description` varchar(500) DEFAULT NULL COMMENT '产品描述',
   `deleted` varchar(1) NOT NULL DEFAULT 'N' COMMENT '是否已删除Y：已删除，N：未删除',
   `created_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
   `updated_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
   `created_by` varchar(100) NOT NULL COMMENT '创建人',
   `updated_by` varchar(100) NOT NULL COMMENT '更新人',
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COMMENT='产品表';