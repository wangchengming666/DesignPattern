package iteratorpattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteIterator implements Iterator {

	private List list = new ArrayList();

	// 当前游标
	public int cursor = 0;

	public ConcreteIterator(List list) {
		this.list = list;
	}

	@Override
	public Object next() {
		Object obj = null;
		if (this.hasNext()) {
			obj = this.list.get(cursor++);
		}
		return obj;
	}

	@Override
	public boolean hasNext() {
		if (cursor == list.size()) {
			return false;
		}
		return true;
	}

	@Override
	public boolean remove() {
		this.list.remove(this.cursor);
		return true;
	}
}
