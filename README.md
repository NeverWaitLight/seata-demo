版本选择
https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E

# nacos-server

作为配置中心和注册中心

```bash
docker pull nacos/nacos-server:v2.1.0
docker run --name nacos -e MODE=standalone -p 8848:8848 -p 9848:9848 -p 9849:9849 --network test -d nacos/nacos-server:v2.1.0
```

# seata-server

```bash
docker pull seataio/seata-server:1.5.1
docker run --name seata -p 8091:8091 -p 7091:7091 -e SEATA_IP=192.168.0.203 --network test -d seataio/seata-server:1.5.1 
```

seata-server 数据库脚本

https://github.com/seata/seata/blob/develop/script/server/db/mysql.sql