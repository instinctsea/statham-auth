hms-auth-api用来定义rpc服务，供外部调用
hms-auth-common用来定义常量，枚举，工具类，供模块内使用
hms-auth-dao持久化层，
hms-auth-domain领域模型，pojo
hms-auth-provider用来暴露rpc服务，提供rpc实现，restful服务，供外部调用
hms-auth-repository数据仓库，数据的存储和获取，数据库事务
hms-auth-rpc用来封装调用外部依赖rpc服务
hms-auth-service业务逻辑层