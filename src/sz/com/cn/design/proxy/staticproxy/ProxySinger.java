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
		System.out.println("经纪人预约...");
	}

	@Override
	public void draftContract() {
		System.out.println("经纪人起草合同...");
	}

	@Override
	public void signContract() {
		System.out.println("经纪人签合同...");
	}

	@Override
	public void sing() {
		this.singer.sing();
	}

	@Override
	public void payMoney() {
		System.out.println("经纪人收款...");
	}

}
