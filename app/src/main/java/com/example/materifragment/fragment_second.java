package com.example.materifragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

public class fragment_second extends Fragment {
    private PageViewModel pageViewModel;
    private TextView txtName;
    private TextView txtKelas;
    private TextView txtJurusan;
    private TextView txtAngkatan;
    public fragment_second () {

    }

    public static fragment_second newInstance() {
        return new fragment_second();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        pageViewModel = ViewModelProviders.of(requireActivity()).get(PageViewModel.class);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtName = view.findViewById(R.id.textViewName);
        txtKelas = view.findViewById(R.id.textViewKelas);
        txtJurusan = view.findViewById(R.id.textViewJurusan);
        txtAngkatan = view.findViewById(R.id.textViewAngkatan);

        pageViewModel.getName().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                txtName.setText(s);
            }
        });
        pageViewModel.getKelas().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String t) {
                txtKelas.setText(t);
            }
        });
        pageViewModel.getJurusan().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String u) {
                txtJurusan.setText(u);
            }
        });
        pageViewModel.getAngkatan().observe(requireActivity(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String v) {
                txtAngkatan.setText(v);
            }
        });
    }
}