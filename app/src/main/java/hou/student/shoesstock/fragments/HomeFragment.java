package hou.student.shoesstock.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import hou.student.shoesstock.Addtocard;
import hou.student.shoesstock.R;
import hou.student.shoesstock.adapters.GoiYAdapter;
import hou.student.shoesstock.adapters.ProductAdapter;
import hou.student.shoesstock.ketquasearch;
import hou.student.shoesstock.model.SuggestProducts;
import hou.student.shoesstock.model.Product;
import hou.student.shoesstock.spkhuyenmai;
import hou.student.shoesstock.spmoi;
import hou.student.shoesstock.spphobien;
import hou.student.shoesstock.utils.MockupDatabase;

public class HomeFragment extends Fragment {
    RecyclerView rcvLatestProduct, rcvSaleProduct, rcvPopularProduct, rcvSpecificType, rcvViewGoiY;
    ProductAdapter productAdapter;
    ScrollView wrapIntroProduct;
    GoiYAdapter goiYAdapter;
    
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_home, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rcvLatestProduct = view.findViewById(R.id.RecyclerViewHotProducts);
        rcvSaleProduct = view.findViewById(R.id.RecyclerViewSaleProducts);
        rcvPopularProduct = view.findViewById(R.id.RecyclerViewPopularProduct);
        rcvSpecificType = view.findViewById(R.id.RecyclerViewSpecificType);
        rcvViewGoiY = view.findViewById(R.id.RecyclerViewGoiY);
        wrapIntroProduct = view.findViewById(R.id.wrap_intro_product);

        setEventListener(view);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);
        productAdapter = new ProductAdapter(view.getContext(), MockupDatabase.getAllProducts());
        rcvLatestProduct.setLayoutManager(linearLayoutManager);
        rcvLatestProduct.setAdapter(productAdapter);
        rcvSaleProduct.setLayoutManager(linearLayoutManager2);
        rcvSaleProduct.setAdapter(productAdapter);
        rcvPopularProduct.setLayoutManager(linearLayoutManager3);
        rcvPopularProduct.setAdapter(productAdapter);
    }

    private void setEventListener(View view) {

        view.findViewById(R.id.btnNike).setOnClickListener(v -> {
            hiddenList();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2);
            rcvSpecificType.setLayoutManager(gridLayoutManager);
            rcvSpecificType.setVisibility(View.VISIBLE);
            ProductAdapter productAdapter = new ProductAdapter(
                    view.getContext(),
                    MockupDatabase.getAllProducts().stream()
                            .filter(p -> p.getTrademark().equals("Nike")).collect(Collectors.toList()));
            rcvSpecificType.setAdapter(productAdapter);
        });

        view.findViewById(R.id.btnAdidas).setOnClickListener(v -> {
            hiddenList();
            rcvSpecificType.setVisibility(View.VISIBLE);
            ProductAdapter productAdapter = new ProductAdapter(
                    view.getContext(),
                    MockupDatabase.getAllProducts().stream()
                            .filter(p -> p.getTrademark().equals("Adidas")).collect(Collectors.toList()));
            rcvSpecificType.setAdapter(productAdapter);
        });

        view.findViewById(R.id.btnPuma).setOnClickListener(v -> {
            hiddenList();
            rcvSpecificType.setVisibility(View.VISIBLE);
            ProductAdapter productAdapter = new ProductAdapter(
                    view.getContext(),
                    MockupDatabase.getAllProducts().stream()
                            .filter(p -> p.getTrademark().equals("Puma")).collect(Collectors.toList()));
            rcvSpecificType.setAdapter(productAdapter);
        });

        view.findViewById(R.id.btnGoiy).setOnClickListener(v -> {
            hiddenList();
            rcvViewGoiY.setVisibility(View.VISIBLE);
            goiYAdapter = new GoiYAdapter(view.getContext(), MockupDatabase.getAllSuggestProducts());
            GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2);
            rcvViewGoiY.setLayoutManager(gridLayoutManager);
            rcvViewGoiY.setAdapter(goiYAdapter);
        });

        view.findViewById(R.id.btnGiohang).setOnClickListener(v -> {
            Intent giohang = new Intent(getContext(), Addtocard.class);
            startActivity(giohang);
        });

        view.findViewById(R.id.btnBoloc).setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), hou.student.shoesstock.boloc.class);
            startActivity(intent);
        });

        view.findViewById(R.id.linearLayoutSale).setOnClickListener(v -> startActivity(new Intent(view.getContext(), spkhuyenmai.class)));
        view.findViewById(R.id.txtXemKM).setOnClickListener(v -> startActivity(new Intent(view.getContext(), spkhuyenmai.class)));
        view.findViewById(R.id.txtXemNew).setOnClickListener(v -> startActivity(new Intent(view.getContext(), spmoi.class)));
        view.findViewById(R.id.txtXemPB).setOnClickListener(v -> startActivity(new Intent(view.getContext(), spphobien.class)));

        EditText textSearch = view.findViewById(R.id.textSearch);
        textSearch.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                System.out.println(i);
                if (i == EditorInfo.IME_ACTION_SEARCH) {
                    startActivity(new Intent(view.getContext(), ketquasearch.class));
                    return true;
                }
                return false;
            }
        });
    }


    private void hiddenList() {
        wrapIntroProduct.setVisibility(View.GONE);
        rcvViewGoiY.setVisibility(View.GONE);
        rcvSpecificType.setVisibility(View.GONE);
    }


        private void setUpView(View view) {




//        ImageButton btnBoloc = view.findViewById(R.id.btnBoloc);
//        ImageButton btnGiohang = view.findViewById(R.id.btnGiohang);
//        Button btnGoiy = view.findViewById(R.id.btnGoiy);
//        Button btnNike = view.findViewById(R.id.btnNike);
////        View chitiet_sp = view.findViewById(R.id.chitiet_sp);
//        View txtXemNew = view.findViewById(R.id.txtXemNew);
//
//
//        //Bộ lọc
//        btnBoloc.setOnClickListener(v -> {
//            Intent boloc = new Intent(getContext(), hou.student.shoesstock.boloc.class);
//            startActivity(boloc);
//        });
//
//        //Giỏ hàng
//        btnGiohang.setOnClickListener(v -> {
//            Intent giohang = new Intent(getContext(), Addtocard.class);
//            startActivity(giohang);
//        });
//
//        //Các loại giày
//        btnGoiy.setOnClickListener(v -> {
//            Intent goiy = new Intent(getContext(), tips.class);
//            startActivity(goiy);
//        });
//        btnNike.setOnClickListener(v -> {
//            Intent nike = new Intent(getContext(), hou.student.shoesstock.nike.class);
//            startActivity(nike); //
//        });
//
////        //chi tiết sản phẩm
////        chitiet_sp.setOnClickListener(v -> {
////            Intent chitiet = new Intent(getContext(), Chitietsanpham.class);
////            startActivity(chitiet);
////        });
//
//        //Xem thêm
//        txtXemNew.setOnClickListener(v -> {
//            Intent spmoi = new Intent(getContext(), hou.student.shoesstock.spmoi.class);
//            startActivity(spmoi);
//        });
//
    }
}
