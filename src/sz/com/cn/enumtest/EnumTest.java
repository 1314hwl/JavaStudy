package sz.com.cn.enumtest;

public class EnumTest {

	private enum ColorEnum {
		red, yellow, bule, orange
	}

	public enum OrderState {
		/** 已取消 */
		CANCEL {
			public String getName() {
				return "已取消";
			}
		},
		/** 待审核 */
		WAITCONFIRM {
			public String getName() {
				return "待审核";
			}
		},
		/** 等待付款 */
		WAITPAYMENT {
			public String getName() {
				return "等待付款";
			}
		},
		/** 正在配货 */
		ADMEASUREPRODUCT {
			public String getName() {
				return "正在配货";
			}
		},
		/** 等待发货 */
		WAITDELIVER {
			public String getName() {
				return "等待发货";
			}
		},
		/** 已发货 */
		DELIVERED {
			public String getName() {
				return "已发货";
			}
		},
		/** 已收货 */
		RECEIVED {
			public String getName() {
				return "已收货";
			}
		};

		public abstract String getName();// 可实现抽象的方法,枚举类更像是一个抽象的类,每一个元素都是一个枚举对象
	}

	public enum Gender {
		// 枚举对象更像是一个抽象的类,因为
		MAN("man"), WOMAN("woman");
		private final String sex;

		Gender(String sex) {
			this.sex = sex;
		}

		String getSex() {
			return sex;
		}
	}

	public static void main(String[] args) {
		for (OrderState mOrderState : OrderState.values()) {
			System.out.println(mOrderState + "====>" + mOrderState.getName());
		}
	}
}
