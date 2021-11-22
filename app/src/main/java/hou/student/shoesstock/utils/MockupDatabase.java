package hou.student.shoesstock.utils;

import java.util.ArrayList;
import java.util.List;

import hou.student.shoesstock.R;
import hou.student.shoesstock.model.Product;
import hou.student.shoesstock.model.SuggestProducts;

public class MockupDatabase {
    private static List<Product> products = new ArrayList<>();
    private static List<SuggestProducts> suggestProducts = new ArrayList<>();
    public static List<Product> getAllProducts() {
        products.add(new Product("Nai xu", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("San Adidas", "100000", R.drawable.anhshoescard3, "Adidas"));
        products.add(new Product("San pham", "100000", R.drawable.anhshoescard2, "Bata"));
        products.add(new Product("San  Puma pham", "100000", R.drawable.anhshoescard4, "Puma"));
        products.add(new Product("San nai", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("Nai xu", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("Adidas pham", "100000", R.drawable.anhshoescard3, "Adidas"));
        products.add(new Product("San pham", "100000", R.drawable.anhshoescard2, "Bata"));
        products.add(new Product("San nai 2", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("San nai 3", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("Nai xu", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("San Adidas pham", "100000", R.drawable.anhshoescard3, "Adidas"));
        products.add(new Product("San pham", "100000", R.drawable.anhshoescard2, "Nike"));
        products.add(new Product("San puma", "100000", R.drawable.anhshoescard4, "Puma"));
        products.add(new Product("San puma", "100000", R.drawable.anhshoescard4, "Puma"));
        products.add(new Product("San puma", "100000", R.drawable.anhshoescard4, "Puma"));
        products.add(new Product("San pham", "100000", R.drawable.anhshoescard2, "Nike"));
        return products;
    }

    public static List<SuggestProducts> getAllSuggestProducts() {
        List<SuggestProducts> suggestProducts = new ArrayList<>();
        suggestProducts.add(new SuggestProducts("Mẫu giày hot trend nhất 11/2021", R.drawable.img_20));
        suggestProducts.add(new SuggestProducts("Mẫu giày hot trend nhất 11/2021", R.drawable.img_20));
        suggestProducts.add(new SuggestProducts("Mẫu giày hot trend nhất 11/2021", R.drawable.img_20));
        suggestProducts.add(new SuggestProducts("Mẫu giày hot trend nhất 11/2021", R.drawable.img_20));
        suggestProducts.add(new SuggestProducts("Mẫu giày hot trend nhất 11/2021", R.drawable.img_20));
        suggestProducts.add(new SuggestProducts("Mẫu giày hot trend nhất 11/2021", R.drawable.img_20));
        return suggestProducts;
    }

}
