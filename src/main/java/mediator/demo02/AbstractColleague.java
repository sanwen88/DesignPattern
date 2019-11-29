package mediator.demo02;

/**@author sanwen88  
 * @date 2019年10月14日 上午11:30:38 
 *
 * @Description: 作用？
 *
 * @version V1.0   
 */
public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague(AbstractMediator mediator) {
		this.mediator = mediator;
	}
}
