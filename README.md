# RedisExample
redis-cache-demo:
	封装了redis的三个常用工具类
	JedisUtils-原生redis工具类，使用jedis实现
	RedisUtil-Spring封装的redis工具类，使用spring-data-redis-1.7.1.RELEASE.jar实现，底层也是jedis
	SerializerUtils-redis序列化工具
	核心配置文件：applicationContext.xml

redis-queue：
redis队列：使用redis的列表实现，业务比较单一，没有ActiveMQ这些消息队列专业，如果业务比较复杂还是建议使用ActiveMQ
	
redis-publish-subscribe：
	redis发布订阅
	
redis哨兵配制/conf：
redis哨兵配制：
3个哨兵，一主两从
redis6379.conf -主
redis6380.conf -从
redis6381.conf -从
sentinel_26379.conf	-哨兵
sentinel_26380.conf	-哨兵	
sentinel_26381.conf	-哨兵

redis集群高可用：
1.先准备6个redis节点
redis6379.conf	
redis6380.conf	
redis6381.conf	
redis6389.conf	
redis6390.conf	
redis6391.conf
2.然后根据安装步骤进行安装