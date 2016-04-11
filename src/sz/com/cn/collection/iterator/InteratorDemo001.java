package sz.com.cn.collection.iterator;

public class InteratorDemo001 {
	public static void main(String[] args) {
		MyItrator iter = new MyItrator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
			iter.remove();
		}
		System.out.println(iter.getSize());
	}

}
