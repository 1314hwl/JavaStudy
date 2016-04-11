package sz.com.cn.collection.iterator;

public class MyItrator {
	String[] data = { "a", "b", "c", "d" };

	private int size = data.length;

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
		System.arraycopy(data, cursor + 1, data, cursor, this.size - (cursor + 1));
		this.size--;
		this.cursor--;
	}

	public int getSize() {
		return this.size;
	}

}
