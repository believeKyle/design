package 中介者模式;

public abstract class AbstractColleague {
	protected AbstractMediator mediator;
	public AbstractColleague(AbstractMediator _mediator) {
		this.mediator = _mediator;
	}
}
