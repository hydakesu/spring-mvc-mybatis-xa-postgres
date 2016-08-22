#spring-mvc-mybatis-atomikos-postgres

工作中主要是使用postgres比较多，参照网上的代码，自己做了个postgres数据库应用的列子。

纯学习。

注意：代码可以直接使用，但是数据库端必须要修改配置才能实现多数据源增删改查的transaction控制。

以postgres9.3版本为例：
/var/lib/pgsql/9.3/data/postgresql.conf必须要修改max_prepared_transactions配置
一般不设置的话默认为0.