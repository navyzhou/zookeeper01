package com.yc.zookeeper.api;

import org.I0Itec.zkclient.ZkClient;
import org.I0Itec.zkclient.serialize.SerializableSerializer;
import org.apache.zookeeper.data.Stat;

import com.yc.zookeeper.bean.UserInfo;

public class ZkClientGetNodeData {
	// 会话超时时间，设置为与系统默认时间一致
	private static final int SESSION_TIMEOUT = 30 * 1000;
	
	// 连接超时时间
	private static final int CONNECTION_TIMEOUT = 30 * 1000;
	
	public static void main(String[] args) {
		// ZkClient client = new ZkClient("192.168.30.130:2181",SESSION_TIMEOUT, CONNECTION_TIMEOUT);
		
		// 如果需要传入java对象，那么最好给定一个序列化器，这样我们就可以直接存对象了
		ZkClient zc = new ZkClient("192.168.30.130:2181",SESSION_TIMEOUT, CONNECTION_TIMEOUT, new SerializableSerializer());
		System.out.println("连接成功...");
		
		// 创建数据节点 节点路径， 节点数据， 节点类型（临时还是永久）
		UserInfo uf =  zc.readData("/yc");
		System.out.println(uf);
		
		// 获取节点的状态信息
		Stat stat = new Stat();
		zc.readData("/yc", stat);
		System.out.println(stat);
	}
}
