package sz.com.cn.collection.iterator;

public class MyItrator {
	String[] data = { "a", "b", "c", "d" };

	private int size = data.length;

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
		System.arraycopy(data, cursor + 1, data, cursor, this.size - (cursor + 1));
		this.size--;
		this.cursor--;
	}

	public int getSize() {
		return this.size;
	}

}
