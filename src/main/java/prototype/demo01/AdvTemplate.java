package prototype.demo01;

/**
 * @author sanwen88
 * @date 2019年9月3日 下午2:35:35
 *
 * @Description: 广告信模板，该对象是由数据库产生的
 *
 * @version V1.0
 */
public class AdvTemplate {
	// 广告信名称
	private String advSubject = "XX银行国庆信用卡抽奖活动";

	// 广告信内容
	private String advContext = "国庆抽奖活动通知：只要刷卡就送你1百万！....";

	// 取得广告信的名称
	public String getAdvSubject() {
		return this.advSubject;
	}

	// 取得广告信的内容
	public String getAdvContext() {
		return this.advContext;
	}
}
