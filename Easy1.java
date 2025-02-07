public class Easy_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Helo world");
		if (args.length < 2) {
            System.out.println("Usage: java ParameterInput <name> <age>");
            return;
        }
		        String name = args[0];
		        int age = Integer.parseInt(args[1]);
		        System.out.println("Name: " + name + ", Age: " + age);
	}

}
