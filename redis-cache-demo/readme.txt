cache-demo:
封装了redis的三个常用工具类
JedisUtils-原生redis工具类，使用jedis实现
RedisUtil-Spring封装的redis工具类，使用spring-data-redis-1.7.1.RELEASE.jar实现，底层也是jedis
SerializerUtils-redis序列化工具

核心配置文件：applicationContext.xml