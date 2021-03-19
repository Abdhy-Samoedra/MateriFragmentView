package com.example.materifragment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PageViewModel extends ViewModel {
    private MutableLiveData<String> mName = new MutableLiveData<>();
    public void setName(String name){
        mName.setValue(name);
    }
    public LiveData<String> getName(){
        return mName;
    }


    private MutableLiveData<String> mKelas = new MutableLiveData<>();
    public void setKelas(String kelas){
        mKelas.setValue(kelas);
    }
    public LiveData<String> getKelas(){
        return mKelas;
    }


    private MutableLiveData<String> mJurusan = new MutableLiveData<>();
    public void setJurusan(String jurusan){
        mJurusan.setValue(jurusan);
    }
    public LiveData<String> getJurusan(){
        return mJurusan;
    }


    private MutableLiveData<String> mAngkatan = new MutableLiveData<>();
    public void setAngkatan(String angkatan){
        mAngkatan.setValue(angkatan);
    }
    public LiveData<String> getAngkatan(){
        return mAngkatan;
    }


}
