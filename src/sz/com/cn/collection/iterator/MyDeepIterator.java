package sz.com.cn.collection.iterator;

import java.util.Iterator;

public class MyDeepIterator {
	String[] data = { "a", "b", "c", "d" };

	private int size = data.length;

	public Iterator Iterator() {
		class MyIter implements Iterator {
			private int cursor = -1;// 下标

			/**
			 * 是否有下一个
			 * 
			 * @return
			 */
			public boolean hasNext() {
				return cursor + 1 < size;
			}

			/**
			 * 下一个
			 * 
			 * @return
			 */
			public String next() {
				cursor++;
				return data[cursor];
			}

			/**
			 * 删除一个
			 */
			public void remove() {
				System.arraycopy(data, cursor + 1, data, cursor, size - (cursor + 1));
				size--;
				this.cursor--;
			}

			public int getSize() {
				return size;
			}
		}
		return new MyIter();
	}

	public static void main(String[] args) {
		MyDeepIterator mMyDeepIterator = new MyDeepIterator();
		Iterator it = mMyDeepIterator.Iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("================================");
		Iterator it2 = mMyDeepIterator.Iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
}
