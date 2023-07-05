package com.example.demo.behavioral.iterator;

class IterableObject implements Container {

	private String names[];

	private Iterator iterator = new IteratorImpl();

	public IterableObject(String[] names) {
		super();
		this.names = names;
	}

	@Override
	public Iterator getIterator() {
		return iterator;
	}

	class IteratorImpl implements Iterator {

		int i;

		@Override
		public boolean hasNext() {
			if (i < names.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[i++];
			} else {
				return null;
			}
		}
	}
}
