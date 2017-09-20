package lgs.demo.redis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

/**
 * Redis测试 加载spring配置方式
 * @author lgs
 *
 */
public class RedisSpringTest {
	private static final Log log = LogFactory.getLog(RedisSpringTest.class);

	public static void main(String[] args) {
		try {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
			context.start();
			
			ShardedJedisPool pool = (ShardedJedisPool) context.getBean("shardedJedisPool");
			ShardedJedis jedis = pool.getResource();
			
			String key = "lgs";
			String value = "";
			
			jedis.del(key); // 删数据
			
			jedis.set(key, "lgs"); // 存数据
			value = jedis.get(key); // 取数据
			log.info(key + "=" + value);
			
			jedis.set(key, "lgs3"); // 存数据
			value = jedis.get(key); // 取数据
			log.info(key + "=" + value);
			
//			jedis.del(key); // 删数据
//			value = jedis.get(key); // 取数据
//			log.info(key + "=" + value);

			context.stop();
		} catch (Exception e) {
			log.error("==>RedisSpringTest context start error:", e);
			System.exit(0);
		} finally {
			log.info("===>System.exit");
			System.exit(0);
		}
	}
}
