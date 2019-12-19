package ch12;

class IndexOf {
	public static void main(String args[]) {
		// 			  0123456 78
		String str = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		int idx = 0;
		int count = 0;

		while (true) {
			idx = str.indexOf("Lorem Ipsum", idx + 1);
			if (idx == -1)
				break;
			count++;
			
			System.out.println(idx);

		}
		System.out.println(count);

	}
}