package collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import static java.util.Collections.*;

public class Ex11_19 {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		System.out.println(list);
		
		addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		rotate(list, 2);	// 오른쪽으로 두칸씩 이동
		System.out.println(list);
		
		swap(list, 0, 2); // 첫번째와 세번째를 교환
		System.out.println(list);
		
		shuffle(list); // 무작위로ㅓ 변경
		System.out.println(list);
		
		sort(list); // 정렬
		System.out.println(list);
		
		int idx = binarySearch(list, 3); // 3이 저장된 위치를 인덱스로 봔환
		System.out.println("index of 3 = " + idx);
		
		System.out.println("max = " + max(list));
		System.out.println("min = " + min(list));
		System.out.println("min = " + max(list, reverseOrder()));
		
		fill(list, 9); // 모든 값을 9로 바꿈
		System.out.println("list = " + list);
		
		List newList = nCopies(list.size(), 2); // 리스트와 같은 크기의 새로운 리스트를 생성하고 2로 채운다 결과를 변경할 수 없다
		System.out.println("newList = " + newList);
		
		System.out.println(disjoint(list, newList)); // 공통요소가 없으면 true를 반환한다
		
		copy(list, newList);
		System.out.println("newList = " + newList);
		System.out.println("list = " + list);
		
		replaceAll(list, 2, 1);
		System.out.println("list = " + list);
		
		Enumeration e = enumeration(list);
		ArrayList list2 = list(e);
		
		System.out.println("list2 = " + list2);
	}
}
