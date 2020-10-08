package com.arthava.womensafety;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class CategoryFragment extends Fragment {


    public CategoryFragment() {
        // Required empty public constructor
    }
private List<CategoryModel> catList = new ArrayList<>();
private GridView catView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View  view = inflater.inflate(R.layout.fragment_category, container, false);
        catView = view.findViewById(R.id.cat_Grid);

        loadCategories();
        CategoryAdapter adapter = new CategoryAdapter(catList);
        catView.setAdapter(adapter);

        return  view;
    }

    private  void  loadCategories()
    {
        catList.clear();
        catList.add(new CategoryModel("1","CHILD ABUSE",5));
        catList.add(new CategoryModel("2","RAPE",2));
        catList.add(new CategoryModel("3","VIOLENCE",6));
        catList.add(new CategoryModel("4","HARRASEMENT",8));
        catList.add(new CategoryModel("4","ASSAULT",4));
        catList.add(new CategoryModel("4","ROBBERY",6));
    }
}
