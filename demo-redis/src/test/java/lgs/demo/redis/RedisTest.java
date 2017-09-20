package lgs.demo.redis;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import redis.clients.jedis.Jedis;

/**
 * Redis测试 直接连接redis的ip方式
 * @author lgs
 *
 */
public class RedisTest {
	private static final Log log = LogFactory.getLog(RedisTest.class);

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("192.168.152.130");
		
		String key = "lgs";
		String value = "";
		
		jedis.del(key); // 删数据
		
		jedis.set(key, "lgs"); // 存数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);
		
		jedis.set(key, "lgs2"); // 存数据
		value = jedis.get(key); // 取数据
		log.info(key + "=" + value);
		jedis.close();
		
	}
}
