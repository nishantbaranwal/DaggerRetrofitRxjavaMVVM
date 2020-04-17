package com.example.daggerretrofitrxjavamvvm

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.daggerretrofitrxjavamvvm.adapter.MovieAdapter
import com.example.daggerretrofitrxjavamvvm.model.Result
import com.example.daggerretrofitrxjavamvvm.viewmodel.MainActivityViewModel
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var factory: ViewModelProviderFactory
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        val viewModel = ViewModelProvider(this,factory).get(MainActivityViewModel::class.java)
        val page = 5

        val progressDialog = ProgressDialog(this)
        progressDialog.max = 100
        progressDialog.setMessage("Its loading....")
        progressDialog.setTitle("Downloading")
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)
        progressDialog.show()

        viewModel.getMovieResultList(page).observe(this, Observer {
            progressDialog.dismiss()
            Log.d("MainActivity",it.toString())
            movieRecView.layoutManager = LinearLayoutManager(this)
            movieRecView.setHasFixedSize(true)
            movieRecView.adapter = MovieAdapter(it as ArrayList<Result>,this)
        })
    }
}
