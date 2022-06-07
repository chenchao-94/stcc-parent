# stcc-parent
## 1、项目描述
    从架构角度出发，整合相关业务，汇总自身知识体系
## 2、项目结构
~~~
com.stcc     
├── stcc-gateway         // 网关模块 [8080]
├── stcc-api             // 接口模块
├── stcc-common          // 通用模块
│       └── stcc-common-core                         // 核心模块
│       └── stcc-common-datascope                    // 权限范围
│       └── stcc-common-datasource                   // 多数据源
│       └── stcc-common-log                          // 日志记录
│       └── stcc-common-redis                        // 缓存服务
│       └── stcc-common-security                     // 安全模块
├── stcc-business         // 业务模块
├──pom.xml                // 公共依赖
~~~


