## 启动基础服务

mysql、redis cluster、rabbitmq, nacos
 
`docker-compose up -d`

rabbitmq默认账号密码：guest/guest
mysql默认账号密码：root/root123
nacos默认账号密码：nacos/nacos

## 启动监控类服务，如springboot-admin、sentinel-dashboard

`docker-compose -f docker-compose.yml -f docker-compose.monitor.yml up`

默认账号密码：sentinel/sentinel

## 启动MOSS

`docker-compose -f docker-compose.yml -f docker-compose.moss.yml up moss`
