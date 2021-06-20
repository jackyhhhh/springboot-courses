# springboot 中使用mybatis总步骤

 1. 在pom.xml中导入三个依赖
    - Mybatis与Spring Boot整合依赖;
    - Mysql驱动依赖;
    - Druid依赖;
    
 2. 将dao目录注册为资源目录
 3. 在Dao接口添加 @Mapper 注解
 4. 在主配置文件中注册三类信息: 映射文件, 实体类别名, 数据源