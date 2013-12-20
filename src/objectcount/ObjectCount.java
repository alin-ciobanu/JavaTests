package objectcount;

class ObjectCount {

	private static int instances;
	int[] array = new int[1000000];

	public ObjectCount () {
		System.out.println("Initializing object");
		instances++;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Trashing object");
		instances--;
		super.finalize();
	}

	public static int getNumberOfInstances() {
		return instances;
	}

	public static void main(String[] args) {

		ObjectCount o = new ObjectCount();
		int x = 500;
		while (x != 0) {
			ObjectCount w = new ObjectCount();
			x--;
			w = null;
		}
		ObjectCount oo = o;

		System.out.println(ObjectCount.getNumberOfInstances());

	}

}
