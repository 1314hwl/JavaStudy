package sz.com.cn.design.proxy.staticproxy;

public class ProxySinger implements SignedSinger {

	private Singer singer;

	public ProxySinger(Singer singer) {
		super();
		this.singer = singer;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void order() {
		System.out.println("������ԤԼ...");
	}

	@Override
	public void draftContract() {
		System.out.println("��������ݺ�ͬ...");
	}

	@Override
	public void signContract() {
		System.out.println("������ǩ��ͬ...");
	}

	@Override
	public void sing() {
		this.singer.sing();
	}

	@Override
	public void payMoney() {
		System.out.println("�������տ�...");
	}

}
