package com.yangqisi.util;

import java.util.ArrayList;
import java.util.List;

/**
 * tree的根节点
 * @addDate： 2017年9月24日
 * @autho： add by daihj
 * @version： 1.0
 */
public class AddTree {

	private List<EUITreeResult> result = new ArrayList<EUITreeResult> ();
	
//	//私有实例对象  volatile保证工作内容中的修改及时体现到共享内存  可见性
//	private static volatile AddTree instance = null;
//	//私有构造方法
//	private AddTree(){};
//	//双重锁单例模式
//	public static AddTree getInstance() {
//		if(instance == null) {
//			synchronized (AddTree.class) {
//				if(instance == null) {
//					instance = new AddTree();
//				}
//			}
//		}
//		return instance;
//	}
	

	public List<EUITreeResult> getResult() {
		return result;
	}

	public void setResult(List<EUITreeResult> result) {
		this.result = result;
	}
}
