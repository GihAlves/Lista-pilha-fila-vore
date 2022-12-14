import java.util.Stack;

public class PilhaTeste {

	public static void main(String[] args) {

		Pilha pilha1 = new Pilha();

		pilha1.push("MC");
		System.out.println(pilha1);

		pilha1.push("RB");
		System.out.println(pilha1);

		String r1 = pilha1.pop();
		System.out.println(r1);

		String r2 = pilha1.pop();
		System.out.println(r2);

		System.out.println(pilha1.vazia());
		pilha1.push("Gisele");
		System.out.println(pilha1.vazia());

		System.out.println(pilha1);

		Stack<String> stack = new Stack<String>();
		stack.push("MC");
		stack.push("Gisele");

		System.out.println(pilha1);
		System.out.println(stack.pop());
		System.out.println(pilha1);

		String nome = stack.peek();
		System.out.println(nome);
		System.out.println(pilha1);
	}
}