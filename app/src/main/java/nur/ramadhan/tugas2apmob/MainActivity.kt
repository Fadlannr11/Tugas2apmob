package nur.ramadhan.tugas2apmob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: adapterClass
    private var DataMahasiswa = mutableListOf<mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView =findViewById(R.id.recyclerview)
        adapter = adapterClass(DataMahasiswa)
        recyclerView.adapter = adapter
        recyclerView.layoutManager= LinearLayoutManager(this)

addData()
    }
    private fun addData(){
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113564, "Aqmal Syarif Fadilah", "12250113564",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113820, "Fadlan Nur Ramadhan", "12250113820",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113451, "Rifki Faiz Azzurananda", "12250113451",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113761, "Ready Malik Putra", "12250113761",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113387, "M. Ilham Akbar", "12250113387",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113444, "Farhan Fadhila", "12250113444",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113521, "M. Farhan Aulia Pratama", "12250113521",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250113812, "M. Raja Fahrezy", "12250113812",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250123081, "Tasya Dwi Yanti", "12250123081",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250123497, "Yuliana Mislianingsih", "12250123497",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250123957, "Nur Delifah", "12250123957",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250124591, "Restu Kharrisa Andini", "12250124591",))
    DataMahasiswa.add(mahasiswa(R.drawable.p12250121918, "Salsabila Aurelia Rickardo", "12250121918",))


    }
}