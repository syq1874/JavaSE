package d0910;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add("add");
		System.out.println(list);
		
		//在下标为3的位置添加4
		list.add(3,4);
		System.out.println(list);
		
		//将下标为3的元素更改为5
		list.set(3, 5);
		System.out.println(list);
		
		//删除下标为2的元素
		list.remove(2);
		System.out.println(list);
		
		//删除add
		list.remove("add");
		System.out.println(list);
		
		
		//输出下标为0的元素
		Object o =list.get(0);
		System.out.println(o);
		
		//遍历集合   普通for循环
		System.out.println("================遍历集合普通for循环================");
		for(int i = 0 ;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		//遍历集合   增强for循环
		System.out.println("==================遍历集合增强for循环==============");
		for(Object obj:list) {
			System.out.println(obj);
		}
		
		System.out.println("==================遍历集合迭代器==============");
		Iterator it=list.iterator();
		while (it.hasNext()/* 存在下一个元素就将他输出出来 */) {
			System.out.println(it.next());
		}
		
	}

}
