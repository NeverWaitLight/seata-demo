# 组件版本清单

根据 [Spring-Cloud-Alibaba 官方wiki](https://github.com/alibaba/spring-cloud-alibaba/wiki/%E7%89%88%E6%9C%AC%E8%AF%B4%E6%98%8E)
推荐选择了 Spring-Cloud \ Spring-Boot \ Spring-Cloud-Alibaba 的版本

- Spring-Boot 2.3.12.RELEASE
- Spring-Cloud: Hoxton.SR12
- Spring-Cloud-Alibaba: 2.2.8.RELEASE
- Nacos-Server: v2.1.0
- Seata-Server: 1.5.1

# Docker network

方便组件之间相互访问

```bash
docker network create test
```