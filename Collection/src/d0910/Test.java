package d0910;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		//接口不能创建对象利用实现类创建对象
		Collection col = new ArrayList();
		col.add(18);
		col.add(12);
		col.add(9);
		System.out.println(col);
		System.out.println("集合中元素个数为："+col.size());
		
		List list=Arrays.asList(new Integer[] {11,2,523,342});
		col.addAll(list);
		System.out.println("集合中元素个数为："+col.size());
		System.out.println(col);
		
		//清空集合
		//col.clear();
		System.out.println("集合中元素个数为："+col.size());
		System.out.println("集合是否为空："+col.isEmpty());
		
		//删除集合中某个元素
		boolean isremove= col.remove(523);
		System.out.println(col);
		System.out.println("元素是否被删除："+isremove);
		
		Collection col2 = new ArrayList();
		col2.add(18);
		col2.add(12);
		col2.add(9);
		
		Collection col3 = new ArrayList();
		col3.add(18);
		col3.add(12);
		col3.add(9);
		
		System.out.println(col2.equals(col3));
		System.out.println(col2.equals(col));
		System.out.println(col2==col3);
		
		System.out.println("是否包含元素:"+col.contains(9));
		
		
		
	}

}
