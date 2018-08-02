package com.yc.zookeeper.api;

import java.util.List;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;

public class ZkClientGetChildrenNodes {
	// 会话超时时间，设置为与系统默认时间一致
	private static final int SESSION_TIMEOUT = 30 * 1000;
	
	// 连接超时时间
	private static final int CONNECTION_TIMEOUT = 30 * 1000;
	
	public static void main(String[] args) {
		// ZkClient client = new ZkClient("192.168.30.130:2181",SESSION_TIMEOUT, CONNECTION_TIMEOUT);
		
		// 如果需要传入java对象，那么最好给定一个序列化器，这样我们就可以直接存对象了
		ZkClient zc = new ZkClient("192.168.30.130:2181",SESSION_TIMEOUT, CONNECTION_TIMEOUT, new SerializableSerializer());
		System.out.println("连接成功...");
		
		// 获取子节点信息
		List<String> list = zc.getChildren("/yc");
		System.out.println(list);
	}
}
