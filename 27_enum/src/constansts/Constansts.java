package constansts;

public class Constansts {

	public static final int CATEGORY_SHOES = 1;
	public static final int CATEGORY_HATS = 2;
	public static final int CATEGORY_PANTS = 3;

	public static void main(String[] args) {
		// 1 -> schuhe
		// 2 -> huete
		// 3 -> hosen
		int cartegory = CATEGORY_SHOES;

		switch (cartegory) {
		case CATEGORY_SHOES:
			System.out.println("schuh");
			break;
		case CATEGORY_HATS:
			System.out.println("hut");
			break;
		case CATEGORY_PANTS:
			System.out.println("hose");
			break;

		default:
			System.out.println("nix");
			break;
		}

		Category cartegory_enum = Category.PANTS;

		switch (cartegory_enum) {
		case SHOES:
			System.out.println("schuh");
			break;
		case HATS:
			System.out.println("hut");
			break;
		case PANTS:
			System.out.println("hose");
			break;

		default:
			System.out.println("nix");
			break;
		}
		
		if(Category.PANTS.equals(cartegory_enum)) {
			System.out.println("hose");
		}
		
		System.out.println(cartegory_enum.ordinal());
		System.out.println(cartegory_enum.name());
		
		cartegory_enum.print();
		System.out.println(cartegory_enum.getVat());
		
		System.out.println(Category.HATS.getVat());
		System.out.println(Category.PANTS.getVat());
		System.out.println(Category.SHOES.getVat());
		
		for (Category cat : Category.values()) {
			System.out.println(cat);
			System.out.println(cat.getVat());
		}
	}

}
