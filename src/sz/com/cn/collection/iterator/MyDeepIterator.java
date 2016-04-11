package sz.com.cn.collection.iterator;

import java.util.Iterator;

public class MyDeepIterator {
	String[] data = { "a", "b", "c", "d" };

	private int size = data.length;

	public Iterator Iterator() {
		class MyIter implements Iterator {
			private int cursor = -1;// �±�

			/**
			 * �Ƿ�����һ��
			 * 
			 * @return
			 */
			public boolean hasNext() {
				return cursor + 1 < size;
			}

			/**
			 * ��һ��
			 * 
			 * @return
			 */
			public String next() {
				cursor++;
				return data[cursor];
			}

			/**
			 * ɾ��һ��
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
