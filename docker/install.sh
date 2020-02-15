#!/usr/bin/env bash
echo '==================1.开发环境准备================================'
echo '1.1请确保安装并java8, git, maven并设置好环境变量'
echo '1.2请确保安装并docker,docker-compose并设置好环境变量'

echo '==================1.清理当前脚本启动的容器和产生的镜像=============='
#清理当前脚本启动的容器和产生的镜像(可选的)
docker stop zeus-redis zeus-rabbitmq zeus-mysql zeus-nacos
docker rm zeus-redis zeus-rabbitmq zeus-mysql zeus-nacos

echo '==================2.安装公共包到本地maven仓库====================='
#安装认证公共包到本地maven仓库
cd ../common && mvn install
echo '当前目录:' && pwd

#回到根目录
cd -

echo '==================3.docker-compose启动公共服务==================='
cat ./.env
echo ''

#按需要开启公共服务
echo '==================4.2启动 mysql or redis or rabbitmq ========'
docker-compose -f docker-compose.yml up -d zeus-redis
docker-compose -f docker-compose.yml up -d zeus-mysql
docker-compose -f docker-compose.yml up -d zeus-rabbitmq
docker-compose -f docker-compose.yml up -d zeus-nacos

echo '当前目录:' && pwd

#回到根目录
cd -



